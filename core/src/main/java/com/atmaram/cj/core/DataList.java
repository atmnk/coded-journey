package com.atmaram.cj.core;

public class DataList<T extends Data> extends Data implements List<T> {
    public java.util.List<T> data;
    public DataList(Context context, java.util.List<T> data) {
        this.context=context;
        this.data=data;
    }
    @Override
    public void forEach(Iteration<T> iteration) {
        for(var abstractData:data){
            iteration.doThis(abstractData);
        }
    }
}
