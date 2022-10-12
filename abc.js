let num=5;
let is=true;

for(i=2; i<num; i++) {
    if(num % i==0){
        console.log("not a prime");
        is=false;
        break;
    }
}

if (is==true) {
    console.log("is a prime");
}