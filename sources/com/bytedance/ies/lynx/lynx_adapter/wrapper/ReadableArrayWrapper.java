package com.bytedance.ies.lynx.lynx_adapter.wrapper;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public interface ReadableArrayWrapper {
    ReadableArrayWrapper getArray(int i);

    boolean getBoolean(int i);

    byte getByte(int i);

    byte[] getByteArray(int i);

    char getChar(int i);

    double getDouble(int i);

    DynamicWrapper getDynamic(int i);

    int getInt(int i);

    long getLong(int i);

    ReadableMapWrapper getMap(int i);

    short getShort(int i);

    String getString(int i);

    ReadableTypeWrapper getType(int i);

    boolean isNull(int i);

    int size();

    ArrayList<Object> toArrayList();
}
