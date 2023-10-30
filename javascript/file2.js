function subarraySum(arr, targetSum) {
    let left = 0;
    let right = 0;
    let currentSum = arr[0];

    while (right < arr.length && left <= right) {
        if (currentSum === targetSum) {
            return arr.slice(left, right + 1);
        } else if (currentSum < targetSum) {
            right++;
            currentSum += arr[right];
        } else {
            currentSum -= arr[left];
            left++;
        }
    }

    return null;
}

// Example usage:

const arr = [1, 4, 20, 3, 10, 5];
const targetSum = 33;

const result = subarraySum(arr, targetSum);

if (result) {
    console.log(`Subarray with sum ${targetSum}: [${result.join(', ')}]`);
} else {
    console.log(`No subarray found with sum ${targetSum}`);
}
