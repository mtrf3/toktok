package com.bytedance.vmsdk.jsbridge.utils;

import X.C1HQ;
import X.InterfaceC37709Er3;
import java.util.HashMap;

/* loaded from: classes7.dex */
public interface ReadableMap {
    ReadableArray getArray(String str);

    ReadableArray getArray(String str, ReadableArray readableArray);

    boolean getBoolean(String str);

    boolean getBoolean(String str, boolean z);

    byte[] getByteArray(String str);

    byte[] getByteArray(String str, byte[] bArr);

    double getDouble(String str);

    double getDouble(String str, double d);

    InterfaceC37709Er3 getDynamic(String str);

    int getInt(String str);

    int getInt(String str, int i);

    long getLong(String str);

    long getLong(String str, long j);

    ReadableMap getMap(String str);

    ReadableMap getMap(String str, ReadableMap readableMap);

    NativeHostObject getNativeHostObject(String str);

    String getString(String str);

    String getString(String str, String str2);

    ReadableType getType(String str);

    boolean hasKey(String str);

    boolean isNull(String str);

    ReadableMapKeySetIterator keySetIterator();

    int size();

    C1HQ<String, Object> toArrayMap();

    HashMap<String, Object> toHashMap();
}
