package com.bytedance.ies.bullet.kit.lynx.api;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public interface BulletReadableArray {
    BulletReadableArray getArray(int i);

    boolean getBoolean(int i);

    byte getByte(int i);

    char getChar(int i);

    double getDouble(int i);

    BulletDynamic getDynamic(int i);

    int getInt(int i);

    long getLong(int i);

    BulletReadableMap getMap(int i);

    short getShort(int i);

    String getString(int i);

    BulletReadableType getType(int i);

    boolean isNull(int i);

    int size();

    ArrayList<Object> toArrayList();
}
