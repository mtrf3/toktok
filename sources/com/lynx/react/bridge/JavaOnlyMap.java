package com.lynx.react.bridge;

import X.C16880lQ;
import X.C38011Evv;
import X.F4W;
import X.F4Z;
import X.F5B;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class JavaOnlyMap extends HashMap<String, Object> implements ReadableMap, WritableMap {
    @Override // com.lynx.react.bridge.ReadableMap
    public HashMap<String, Object> asHashMap() {
        return this;
    }

    public static JavaOnlyMap create() {
        return new JavaOnlyMap();
    }

    public ArrayList<String> getKeys() {
        return new ArrayList<>(keySet());
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new C38011Evv(this);
    }

    @Override // com.lynx.react.bridge.ReadableMap
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

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map, com.lynx.react.bridge.ReadableMap
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
            switch (F4W.LIZ[readableMap.getType(nextKey).ordinal()]) {
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

    @Override // com.lynx.react.bridge.ReadableMap
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
        LIZ.append(", value: ");
        LIZ.append(obj);
        throw new ClassCastException(X1D.LIZIZ(LIZ));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean getBoolean(String str) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.equalsIgnoreCase("true") && !str2.equalsIgnoreCase("yes")) {
                return false;
            }
            return true;
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() == 0) {
                return false;
            }
            return true;
        }
        if (obj == null) {
            throw new NullPointerException(i0.LJFF("key: ", str));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(obj.getClass().getName());
        LIZ.append(" cannot be cast to java.lang.Boolean, key: ");
        LIZ.append(str);
        LIZ.append(", value: ");
        LIZ.append(obj);
        throw new ClassCastException(X1D.LIZIZ(LIZ));
    }

    @Override // com.lynx.react.bridge.ReadableMap
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
        LIZ.append(", value: ");
        LIZ.append(obj);
        throw new ClassCastException(X1D.LIZIZ(LIZ));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public double getDouble(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1.0d;
            }
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        if (obj instanceof String) {
            try {
                return CastDoubleProtector.parseDouble((String) obj);
            } catch (NumberFormatException unused) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("String cannot be cast to double, key: ");
                LIZ.append(str);
                LIZ.append(", value: ");
                LIZ.append(obj);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        if (obj == null) {
            throw new NullPointerException(i0.LJFF("key: ", str));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(obj.getClass().getName());
        LIZ2.append(" cannot be cast to java.lang.Number, key: ");
        LIZ2.append(str);
        LIZ2.append(", value: ");
        LIZ2.append(obj);
        throw new ClassCastException(X1D.LIZIZ(LIZ2));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public F5B getDynamic(String str) {
        return new F4Z(this, str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public int getInt(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1 : 0;
        }
        if (obj instanceof String) {
            try {
                return CastIntegerProtector.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("String cannot be cast to int, key: ");
                LIZ.append(str);
                LIZ.append(", value: ");
                LIZ.append(obj);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        if (obj == null) {
            throw new NullPointerException(i0.LJFF("key: ", str));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(obj.getClass().getName());
        LIZ2.append(" cannot be cast to java.lang.Number, key: ");
        LIZ2.append(str);
        LIZ2.append(", value: ");
        LIZ2.append(obj);
        throw new ClassCastException(X1D.LIZIZ(LIZ2));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public long getLong(String str) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1L;
            }
            return 0L;
        }
        if (obj instanceof String) {
            try {
                return CastLongProtector.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("String cannot be cast to long int, key: ");
                LIZ.append(str);
                LIZ.append(", value: ");
                LIZ.append(obj);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        if (obj == null) {
            throw new NullPointerException(i0.LJFF("key: ", str));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(obj.getClass().getName());
        LIZ2.append(" cannot be cast to java.lang.Long, key: ");
        LIZ2.append(str);
        LIZ2.append(", value: ");
        LIZ2.append(obj);
        throw new ClassCastException(X1D.LIZIZ(LIZ2));
    }

    @Override // com.lynx.react.bridge.ReadableMap
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
        LIZ.append(", value: ");
        LIZ.append(obj);
        throw new ClassCastException(X1D.LIZIZ(LIZ));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public PiperData getPiperData(String str) {
        Object obj = get(str);
        if (obj instanceof PiperData) {
            return (PiperData) obj;
        }
        if (obj == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(obj.getClass().getName());
        LIZ.append(" cannot be cast to ");
        LIZ.append(PiperData.class.getName());
        LIZ.append(", key: ");
        LIZ.append(str);
        throw new ClassCastException(X1D.LIZIZ(LIZ));
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public String getString(String str) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return "true";
            }
            return "false";
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(obj.getClass().getName());
        LIZ.append(" cannot be cast to java.lang.String, key: ");
        LIZ.append(str);
        LIZ.append(", value: ");
        LIZ.append(obj);
        throw new ClassCastException(X1D.LIZIZ(LIZ));
    }

    @Override // com.lynx.react.bridge.ReadableMap
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
        if (obj instanceof PiperData) {
            return ReadableType.PiperData;
        }
        if (obj instanceof F5B) {
            return ((F5B) obj).getType();
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

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean hasKey(String str) {
        return containsKey(str);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean isNull(String str) {
        if (get(str) == null) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void merge(ReadableMap readableMap) {
        putAll((JavaOnlyMap) readableMap);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putNull(String str) {
        put(str, null);
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableArray getArray(String str, ReadableArray readableArray) {
        Object obj = get(str);
        if (obj instanceof ReadableArray) {
            return (ReadableArray) obj;
        }
        return readableArray;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public boolean getBoolean(String str, boolean z) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() != 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.equalsIgnoreCase("true") || str2.equalsIgnoreCase("yes")) {
                return true;
            }
            if (str2.equalsIgnoreCase("false") || str2.equalsIgnoreCase("no")) {
                return false;
            }
        }
        return z;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public byte[] getByteArray(String str, byte[] bArr) {
        Object obj = get(str);
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return bArr;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public double getDouble(String str, double d) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1.0d;
            }
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        if (obj instanceof String) {
            try {
                return CastDoubleProtector.parseDouble((String) obj);
            } catch (NumberFormatException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return d;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public int getInt(String str, int i) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1 : 0;
        }
        if (obj instanceof String) {
            try {
                return CastIntegerProtector.parseInt((String) obj);
            } catch (NumberFormatException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return i;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public long getLong(String str, long j) {
        Object obj = get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1L;
            }
            return 0L;
        }
        if (obj instanceof String) {
            try {
                return CastLongProtector.parseLong((String) obj);
            } catch (NumberFormatException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return j;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public ReadableMap getMap(String str, ReadableMap readableMap) {
        Object obj = get(str);
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        return readableMap;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public PiperData getPiperData(String str, PiperData piperData) {
        Object obj = get(str);
        if (obj instanceof PiperData) {
            return (PiperData) obj;
        }
        return piperData;
    }

    @Override // com.lynx.react.bridge.ReadableMap
    public String getString(String str, String str2) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return "true";
            }
            return "false";
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        return str2;
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putArray(String str, WritableArray writableArray) {
        put(str, writableArray);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putBoolean(String str, boolean z) {
        put(str, Boolean.valueOf(z));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putByteArray(String str, byte[] bArr) {
        put(str, bArr);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putByteArrayAsString(byte[] bArr, byte[] bArr2) {
        put(new String(bArr), new String(bArr2));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putDouble(String str, double d) {
        put(str, Double.valueOf(d));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putInt(String str, int i) {
        put(str, Integer.valueOf(i));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putLong(String str, long j) {
        put(str, Long.valueOf(j));
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putMap(String str, WritableMap writableMap) {
        put(str, writableMap);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putPiperData(String str, PiperData piperData) {
        put(str, piperData);
    }

    @Override // com.lynx.react.bridge.WritableMap
    public void putString(String str, String str2) {
        put(str, str2);
    }
}
