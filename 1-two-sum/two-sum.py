class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        answer=[]
        for i in range(0, len(nums)):
            x = target-nums[i]
            if x in nums:
                j = nums.index(x)
                if (i != j):
                    answer.append(i)
                    answer.append(j)
                    return(answer)