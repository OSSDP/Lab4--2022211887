package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest {


    @Test
    public void testNumIslands_EmptyGrid() {
        // 测试目的：验证空网格的岛屿数量为0。
        char[][] grid = {};
        App solution = new App();
        int result = solution.numIslands(grid);

        assertEquals(0, result);
    }

    @Test
    public void testNumIslands_SingleWaterGrid() {
        // 测试目的：验证全为水的网格（即没有岛屿）的岛屿数量为0。
        char[][] grid = {
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        App solution = new App();
        int result = solution.numIslands(grid);
        assertEquals(0, result);
    }



    @Test
    public void testNumIslands_GridWithSingleCell() {
        // 测试目的：验证只有一个单元格且为陆地的网格的岛屿数量为1。
        char[][] grid = {
                {'1'}
        };
        App solution = new App();
        int result = solution.numIslands(grid);
        assertEquals(1, result);
    }

    @Test
    public void testNumIslands_GridWithSingleCellWater() {
        // 测试目的：验证只有一个单元格且为水的网格的岛屿数量为0。
        char[][] grid = {
                {'0'}
        };
        App solution = new App();
        int result = solution.numIslands(grid);
        assertEquals(0, result);
    }

    // 可以根据需要添加更多测试用例，例如：
    // - 网格的行数或列数为0的情况（已在testNumIslands_EmptyGrid中隐式测试）
    // - 网格中包含不规则形状的岛屿
    // - 网格中包含非常大的岛屿或非常多的岛屿
}