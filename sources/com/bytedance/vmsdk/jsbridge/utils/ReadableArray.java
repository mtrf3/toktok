package com.bytedance.vmsdk.jsbridge.utils;

import X.InterfaceC37709Er3;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public interface ReadableArray {
    ReadableArray getArray(int i);

    boolean getBoolean(int i);

    byte getByte(int i);

    byte[] getByteArray(int i);

    char getChar(int i);

    double getDouble(int i);

    InterfaceC37709Er3 getDynamic(int i);

    int getInt(int i);

    long getLong(int i);

    ReadableMap getMap(int i);

    NativeHostObject getNativeHostObject(int i);

    short getShort(int i);

    String getString(int i);

    ReadableType getType(int i);

    boolean isNull(int i);

    int size();

    ArrayList<Object> toArrayList();
}
