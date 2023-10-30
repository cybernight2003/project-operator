function solveNQueens(n) {
    const board = Array.from({ length: n }, () => Array(n).fill('.'));
    const result = [];

    function isValidMove(row, col) {
        for (let i = 0; i < row; i++) {
            if (board[i][col] === 'Q') return false;
            if (board[i][col - (row - i)] === 'Q' || board[i][col + (row - i)] === 'Q') return false;
        }
        return true;
    }

    function backtrack(row) {
        if (row === n) {
            result.push(board.map(row => row.join('')));
            return;
        }

        for (let col = 0; col < n; col++) {
            if (isValidMove(row, col)) {
                board[row][col] = 'Q';
                backtrack(row + 1);
                board[row][col] = '.';
            }
        }
    }

    backtrack(0);
    return result;
}

// Example usage:

const n = 4;
const solutions = solveNQueens(n);

if (solutions.length > 0) {
    console.log(`Solutions for ${n}-Queens problem:`);
    for (let i = 0; i < solutions.length; i++) {
        console.log(`Solution ${i + 1}:`);
        console.log(solutions[i].join('\n'));
        console.log('\n');
    }
} else {
    console.log(`No solutions found for ${n}-Queens problem.`);
}
