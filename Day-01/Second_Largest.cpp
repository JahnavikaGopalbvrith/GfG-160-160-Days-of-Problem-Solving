C++
  class Solution {
  public:
    public:
    
    int getSecondLargest(vector<int> &arr) {
        int n = arr.size();
        if (n < 2) return -1;
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

       
        int secondLargest = -1; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != largest) {
                if (secondLargest == -1 || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
        }

        return secondLargest; 
    }

};
