//3(120 + 4Y- 4X )= 15 + X - Y

def attendance(tprice:Int):Int={
    return (120+(15-tprice)/5*20);
}

def cost(tprice:Int):Int={
    return 500+attendance(tprice);
}

def profit(tprice:Int):Int={
    return attendance(tprice)*tprice - cost(tprice);
}

def main(args: Array[String])={
    println("total profit :"+profit(5));
}

