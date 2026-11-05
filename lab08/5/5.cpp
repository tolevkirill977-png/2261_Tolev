#include <iostream>
#include <vector>

int main() {
    int n;
    std::cin >> n;
    std::vector<int> v(n);
    for (int& x : v) {
        std::cin >> x;
    }
    int l = v.back();
    for (int& x : v) {
        x += l;
    } 
    int p = 0, m = 0;
    for (int x : v) {
        if (x > 0) p++;
        if (x < 0) m++;
    }
    std::cout << p << " " << m;
    return 0;
}
