package com.bytedance.vmsdk.jsbridge.utils;

import X.C1HQ;
import X.C37703Eqx;
import X.C37705Eqz;
import X.C37707Er1;
import X.InterfaceC37709Er3;
import X.X1D;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class JavaOnlyMap extends HashMap<String, Object> implements ReadableMap, WritableMap {
    public static JavaOnlyMap create() {
        return new JavaOnlyMap();
    }

    public ArrayList<String> getKeys() {
        return new ArrayList<>(keySet());
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new C37705Eqz(this);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public C1HQ<String, Object> toArrayMap() {
        C1HQ<String, Object> c1hq = new C1HQ<>();
        c1hq.putAll(this);
        return c1hq;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public HashMap<String, Object> toHashMap() {
        return new HashMap<>(this);
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        if (size() == 0) {
            return jSONObject;
        }
        for (String str : keySet()) {
            Object obj = get(str);
            try {
                if (getType(str) == ReadableType.Map) {
                    jSONObject.putOpt(str, ((JavaOnlyMap) obj).toJSONObject());
                } else if (getType(str) == ReadableType.Array) {
                    jSONObject.putOpt(str, ((JavaOnlyArray) obj).toJSONArray());
                } else if (getType(str) == ReadableType.Null) {
                    jSONObject.putOpt(str, JSONObject.NULL);
                } else {
                    jSONObject.putOpt(str, obj);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map, com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public int size() {
        return super.size();
    }

    public JavaOnlyMap() {
    }

    public JavaOnlyMap(Map map) {
        super(map);
    }

    public static JavaOnlyMap deepClone(ReadableMap readableMap) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (C37703Eqx.LIZ[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(nextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    javaOnlyMap.putInt(nextKey, readableMap.getInt(nextKey));
                    break;
                case 4:
                    javaOnlyMap.putLong(nextKey, readableMap.getLong(nextKey));
                    break;
                case 5:
                    javaOnlyMap.putDouble(nextKey, readableMap.getDouble(nextKey));
                    break;
                case 6:
                    javaOnlyMap.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case 7:
                    javaOnlyMap.putMap(nextKey, deepClone(readableMap.getMap(nextKey)));
                    break;
                case 8:
                    javaOnlyMap.putArray(nextKey, JavaOnlyArray.deepClone(readableMap.getArray(nextKey)));
                    break;
                case 9:
                    javaOnlyMap.putByteArray(nextKey, (byte[]) readableMap.getByteArray(nextKey).clone());
                    break;
            }
        }
        return javaOnlyMap;
    }

    public static JavaOnlyMap from(Map map) {
        return new JavaOnlyMap(map);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public JavaOnlyArray getArray(String str) {
        Object obj = get(str);
        if (obj instanceof JavaOnlyArray) {
            return (JavaOnlyArray) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(obj.getClass().getName());
        LIZ.append(" cannot be cast to ");
        LIZ.append(JavaOnlyArray.class.getName());
        LIZ.append(", key: ");
        LIZ.append(str);
        throw new ClassCastException(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public boolean getBoolean(String str) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(obj.getClass().getName());
            LIZ.append(" cannot be cast to java.lang.Boolean, key: ");
            LIZ.append(str);
            throw new ClassCastException(X1D.LIZIZ(LIZ));
        }
        throw new NullPointerException(i0.LJFF("key: ", str));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public byte[] getByteArray(String str) {
        Object obj = get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(obj.getClass().getName());
        LIZ.append(" cannot be cast to ");
        LIZ.append(byte[].class.getName());
        LIZ.append(", key: ");
        LIZ.append(str);
        throw new ClassCastException(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public double getDouble(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(obj.getClass().getName());
            LIZ.append(" cannot be cast to java.lang.Number, key: ");
            LIZ.append(str);
            throw new ClassCastException(X1D.LIZIZ(LIZ));
        }
        throw new NullPointerException(i0.LJFF("key: ", str));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public InterfaceC37709Er3 getDynamic(String str) {
        C37707Er1 LIZIZ = C37707Er1.LIZJ.LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = new C37707Er1();
        }
        LIZIZ.LIZ = this;
        LIZIZ.LIZIZ = str;
        return LIZIZ;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public int getInt(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(obj.getClass().getName());
            LIZ.append(" cannot be cast to java.lang.Number, key: ");
            LIZ.append(str);
            throw new ClassCastException(X1D.LIZIZ(LIZ));
        }
        throw new NullPointerException(i0.LJFF("key: ", str));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public long getLong(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(obj.getClass().getName());
            LIZ.append(" cannot be cast to java.lang.Long, key: ");
            LIZ.append(str);
            throw new ClassCastException(X1D.LIZIZ(LIZ));
        }
        throw new NullPointerException(i0.LJFF("key: ", str));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public ReadableMap getMap(String str) {
        Object obj = get(str);
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(obj.getClass().getName());
        LIZ.append(" cannot be cast to ");
        LIZ.append(ReadableMap.class.getName());
        LIZ.append(", key: ");
        LIZ.append(str);
        throw new ClassCastException(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public NativeHostObject getNativeHostObject(String str) {
        Object obj = get(str);
        if (obj instanceof NativeHostObject) {
            return (NativeHostObject) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(obj.getClass().getName());
        LIZ.append(" cannot be cast to ");
        LIZ.append(JavaOnlyArray.class.getName());
        LIZ.append(", key: ");
        LIZ.append(str);
        throw new ClassCastException(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public String getString(String str) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(obj.getClass().getName());
        LIZ.append(" cannot be cast to java.lang.String, key: ");
        LIZ.append(str);
        throw new ClassCastException(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public ReadableType getType(String str) {
        Object obj = get(str);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Integer) {
            return ReadableType.Int;
        }
        if (obj instanceof Long) {
            return ReadableType.Long;
        }
        if ((obj instanceof Number) || (obj instanceof Character)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof byte[]) {
            return ReadableType.ByteArray;
        }
        if (obj instanceof InterfaceC37709Er3) {
            return ((InterfaceC37709Er3) obj).getType();
        }
        if (obj instanceof NativeHostObject) {
            return ReadableType.NativeHostObject;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Invalid value ");
        LIZ.append(obj.toString());
        LIZ.append(" for key ");
        LIZ.append(str);
        LIZ.append("contained in JavaOnlyMap");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public int getTypeIndex(String str) {
        return getType(str).ordinal();
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public boolean hasKey(String str) {
        return containsKey(str);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public boolean isNull(String str) {
        if (get(str) == null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void merge(ReadableMap readableMap) {
        putAll((JavaOnlyMap) readableMap);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putNull(String str) {
        put(str, null);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public ReadableArray getArray(String str, ReadableArray readableArray) {
        Object obj = get(str);
        if (obj instanceof ReadableArray) {
            return (ReadableArray) obj;
        }
        return readableArray;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public boolean getBoolean(String str, boolean z) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public byte[] getByteArray(String str, byte[] bArr) {
        Object obj = get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return bArr;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public double getDouble(String str, double d) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        return d;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public int getInt(String str, int i) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return i;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public long getLong(String str, long j) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return j;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public ReadableMap getMap(String str, ReadableMap readableMap) {
        Object obj = get(str);
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        return readableMap;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMap
    public String getString(String str, String str2) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return str2;
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putArray(String str, WritableArray writableArray) {
        put(str, writableArray);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putBoolean(String str, boolean z) {
        put(str, Boolean.valueOf(z));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putByteArray(String str, byte[] bArr) {
        put(str, bArr);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putByteArrayAsString(byte[] bArr, byte[] bArr2) {
        put(new String(bArr), new String(bArr2));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putDouble(String str, double d) {
        put(str, Double.valueOf(d));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putInt(String str, int i) {
        put(str, Integer.valueOf(i));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putLong(String str, long j) {
        put(str, Long.valueOf(j));
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putMap(String str, WritableMap writableMap) {
        put(str, writableMap);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putNativeHostObject(String str, NativeHostObject nativeHostObject) {
        put(str, nativeHostObject);
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.WritableMap
    public void putString(String str, String str2) {
        put(str, str2);
    }
}
