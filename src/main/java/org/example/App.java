package org.example;

class App {
    void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        // 检查边界条件和是否访问过（或是否为水）
        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '1'; // 标记为已访问
        dfs(grid, r - 1, c); // 上
        dfs(grid, r + 1, c); // 下
        dfs(grid, r, c - 1); // 左
        dfs(grid, r, c + 1); // 右
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int numIslands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) { // 这里修正了循环条件
                if (grid[r][c] == '1') {
                    ++numIslands;
                    dfs(grid, r, c);
                }
            }
        }



        return numIslands;
    }
}