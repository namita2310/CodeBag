#include <bits/stdc++.h>
using namespace std;

void show( stack <int> s)
{
    while (!s.empty()){
    cout<<s.top();
    s.pop();
    }
}

int main()
{
    stack <int> s;
    s.push(0);
    s.push(5);
    s.push(2);
    s.push(1);
    show(s);
    return 0;
}