#include <iostream>
#include <string>
#include <bits/stdc++.h>

using namespace std; 

string rev(string str)
{
	int len = str.size();
    stack<char>s;
    for(int i=0; i<len; i++){
        s.push(str[i]);
    }
    int i=0; 
    while(!s.empty() && i <len){
        str[i++] = s.top();
        s.pop();
    }
    return str;
}


int main(void){
  string str = "Hello Words";
  
  str = rev(str);
  cout<<str<<"\n";
  return 0; 
}
