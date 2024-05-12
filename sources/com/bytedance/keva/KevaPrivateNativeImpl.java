package com.bytedance.keva;

import X.AnonymousClass156;
import X.C22510uV;
import X.X1D;
import com.bytedance.keva.Keva;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes16.dex */
public class KevaPrivateNativeImpl extends KevaImpl implements AnonymousClass156 {
    public long handle;
    public ConcurrentHashMap<String, Object[]> keyValueMap;
    public boolean needRelease;

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void dump() {
    }

    public native long getRepoWithNative(String str, String str2, int i, boolean z);

    public native void nativeClearRepo(long j);

    public native boolean nativeContains(String str, long j);

    public native void nativeErase(String str, long j);

    public native void nativeGetAll(long j, HashMap<String, Object> hashMap);

    public native boolean nativeGetBoolean(String str, boolean z, long j);

    public native byte[] nativeGetBytes(String str, long j);

    public native int nativeGetCount(long j);

    public native double nativeGetDouble(String str, double d, long j);

    public native float nativeGetFloat(String str, float f, long j);

    public native int nativeGetInt(String str, int i, long j);

    public native long nativeGetLong(String str, long j, long j2);

    public native String nativeGetString(String str, long j);

    public native String[] nativeGetStringArray(String str, long j);

    public native void nativeReleaseRepo(long j);

    public native void nativeStoreBoolean(String str, boolean z, long j);

    public native void nativeStoreBytes(String str, byte[] bArr, long j);

    public native void nativeStoreDouble(String str, double d, long j);

    public native void nativeStoreFloat(String str, float f, long j);

    public native void nativeStoreInt(String str, int i, long j);

    public native void nativeStoreLong(String str, long j, long j2);

    public native void nativeStoreString(String str, String str2, long j);

    public native void nativeStoreStringArray(String str, String[] strArr, long j);

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void clear() {
        try {
            this.keyValueMap.clear();
            nativeClearRepo(this.handle);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(3, this.mName, "clear_function", null, th);
        }
    }

    @Override // com.bytedance.keva.Keva
    public int count() {
        return nativeGetCount(this.handle);
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, ?> getAll() {
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            nativeGetAll(this.handle, hashMap);
            return hashMap;
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(2, this.mName, "getAll_function", null, th);
            return hashMap;
        }
    }

    @Override // X.AnonymousClass156
    public String getRepoName() {
        if (this.mSpecifiedPath == null) {
            return this.mName;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.mSpecifiedPath);
        LIZ.append("/");
        LIZ.append(this.mName);
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void dumpNative() {
        super.dumpNative();
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String name() {
        return this.mName;
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public Map<String, Object> buildNewMap(Map<String, Object> map) {
        return getAll();
    }

    @Override // com.bytedance.keva.Keva
    public boolean contains(String str) {
        if ("".equals(str)) {
            str = null;
        }
        return nativeContains(str, this.handle);
    }

    @Override // com.bytedance.keva.KevaImpl
    public void doLoadRepo(boolean z) {
        try {
            this.handle = getRepoWithNative(this.mName, this.mSpecifiedPath, this.mMode, z);
            if (!z) {
                KevaImpl.sMonitor.onLoadRepo(this.mName, this.mMode);
            }
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(1, this.mName, null, null, th);
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void erase(String str) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        try {
            this.keyValueMap.remove(str2);
            nativeErase(str2, this.handle);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, null, th);
        }
    }

    @Override // com.bytedance.keva.KevaImpl
    public void init(boolean z) {
        if (this.handle != 0) {
            return;
        }
        doLoadRepo(z);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        super.registerChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        super.unRegisterChangeListener(onChangeListener);
    }

    private void saveValueAccessInformation(String str, Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        Object[] objArr = this.keyValueMap.get(str);
        if (objArr == null) {
            this.keyValueMap.put(str, new Object[]{obj, Long.valueOf(currentTimeMillis)});
        } else {
            objArr[0] = obj;
            objArr[1] = Long.valueOf(currentTimeMillis);
        }
    }

    @Override // X.AnonymousClass156
    public long clearCache(int i, boolean z) {
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        int i3 = 0;
        try {
            i2 = 0;
            for (Map.Entry<String, Object[]> entry : this.keyValueMap.entrySet()) {
                try {
                    Object[] value = entry.getValue();
                    i2 = C22510uV.LIZ(entry.getKey().length(), 2, 40, i2);
                    if (currentTimeMillis - ((Long) value[1]).longValue() > i) {
                        this.keyValueMap.remove(entry.getKey());
                        Object obj = value[0];
                        if (obj != null) {
                            if (!(obj instanceof Boolean)) {
                                if (obj instanceof String) {
                                    i2 = C22510uV.LIZ(((String) obj).length(), 2, 40, i2);
                                } else {
                                    if (!(obj instanceof Double) && !(obj instanceof Long)) {
                                        if (!(obj instanceof Integer) && !(obj instanceof Float)) {
                                            if (obj instanceof String[]) {
                                                for (String str : (String[]) obj) {
                                                    i2 = C22510uV.LIZ(str.length(), 2, 40, i2);
                                                }
                                            } else if (obj instanceof byte[]) {
                                                i2 += ((byte[]) obj).length;
                                            }
                                        }
                                    }
                                    i2 += 24;
                                }
                                i2 += 16;
                            }
                            i2 += 16;
                            i2 += 16;
                        }
                    }
                    this.needRelease = true;
                } catch (Exception e) {
                    e = e;
                    i3 = i2;
                    e.printStackTrace();
                    i2 = i3;
                    return i2;
                }
            }
            if (z && this.keyValueMap.size() == 0 && this.needRelease) {
                nativeReleaseRepo(this.handle);
                this.needRelease = false;
            }
        } catch (Exception e2) {
            e = e2;
        }
        return i2;
    }

    @Override // com.bytedance.keva.KevaImpl
    public boolean fetchBoolean(String str, boolean z) {
        if ("".equals(str)) {
            str = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Object[] objArr = this.keyValueMap.get(str);
        if (objArr != null) {
            objArr[1] = Long.valueOf(currentTimeMillis);
            return ((Boolean) objArr[0]).booleanValue();
        }
        boolean nativeGetBoolean = nativeGetBoolean(str, z, this.handle);
        this.keyValueMap.put(str, new Object[]{Boolean.valueOf(nativeGetBoolean), Long.valueOf(currentTimeMillis)});
        return nativeGetBoolean;
    }

    @Override // com.bytedance.keva.KevaImpl
    public double fetchDouble(String str, double d) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Object[] objArr = this.keyValueMap.get(str2);
        if (objArr != null) {
            objArr[1] = Long.valueOf(currentTimeMillis);
            return ((Double) objArr[0]).doubleValue();
        }
        double nativeGetDouble = nativeGetDouble(str2, d, this.handle);
        this.keyValueMap.put(str2, new Object[]{Double.valueOf(nativeGetDouble), Long.valueOf(currentTimeMillis)});
        return nativeGetDouble;
    }

    @Override // com.bytedance.keva.KevaImpl
    public float fetchFloat(String str, float f) {
        if ("".equals(str)) {
            str = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Object[] objArr = this.keyValueMap.get(str);
        if (objArr != null) {
            objArr[1] = Long.valueOf(currentTimeMillis);
            return ((Float) objArr[0]).floatValue();
        }
        float nativeGetFloat = nativeGetFloat(str, f, this.handle);
        this.keyValueMap.put(str, new Object[]{Float.valueOf(nativeGetFloat), Long.valueOf(currentTimeMillis)});
        return nativeGetFloat;
    }

    @Override // com.bytedance.keva.KevaImpl
    public int fetchInt(String str, int i) {
        if ("".equals(str)) {
            str = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Object[] objArr = this.keyValueMap.get(str);
        if (objArr != null) {
            objArr[1] = Long.valueOf(currentTimeMillis);
            return ((Integer) objArr[0]).intValue();
        }
        int nativeGetInt = nativeGetInt(str, i, this.handle);
        this.keyValueMap.put(str, new Object[]{Integer.valueOf(nativeGetInt), Long.valueOf(currentTimeMillis)});
        return nativeGetInt;
    }

    @Override // com.bytedance.keva.KevaImpl
    public long fetchLong(String str, long j) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Object[] objArr = this.keyValueMap.get(str2);
        if (objArr != null) {
            objArr[1] = Long.valueOf(currentTimeMillis);
            return ((Long) objArr[0]).longValue();
        }
        long nativeGetLong = nativeGetLong(str2, j, this.handle);
        this.keyValueMap.put(str2, new Object[]{Long.valueOf(nativeGetLong), Long.valueOf(currentTimeMillis)});
        return nativeGetLong;
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        try {
            return fetchBoolean(str, z);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Boolean.valueOf(z), th);
            return z;
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        return getBytes(str, bArr, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        return getBytes(str, bArr, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public double getDouble(String str, double d) {
        try {
            return fetchDouble(str, d);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Double.valueOf(d), th);
            return d;
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public float getFloat(String str, float f) {
        try {
            return fetchFloat(str, f);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Float.valueOf(f), th);
            return f;
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public int getInt(String str, int i) {
        try {
            return fetchInt(str, i);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Integer.valueOf(i), th);
            return i;
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public long getLong(String str, long j) {
        try {
            return fetchLong(str, j);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Long.valueOf(j), th);
            return j;
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        return getString(str, str2, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        return getStringArray(str, strArr, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        return getStringArray(str, strArr, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        return getString(str, str2, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        return getStringSet(str, set, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        return getStringSet(str, set, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        try {
            saveValueAccessInformation(str2, Boolean.valueOf(z));
            nativeStoreBoolean(str2, z, this.handle);
            super.notifyChangeListeners(this, str2);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Boolean.valueOf(z), th);
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        storeBytes(str, bArr, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        storeBytes(str, bArr, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeDouble(String str, double d) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        try {
            saveValueAccessInformation(str2, Double.valueOf(d));
            nativeStoreDouble(str2, d, this.handle);
            super.notifyChangeListeners(this, str2);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Double.valueOf(d), th);
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeFloat(String str, float f) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        try {
            saveValueAccessInformation(str2, Float.valueOf(f));
            nativeStoreFloat(str2, f, this.handle);
            super.notifyChangeListeners(this, str2);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Float.valueOf(f), th);
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeInt(String str, int i) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        try {
            saveValueAccessInformation(str2, Integer.valueOf(i));
            nativeStoreInt(str2, i, this.handle);
            super.notifyChangeListeners(this, str2);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Integer.valueOf(i), th);
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeLong(String str, long j) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        try {
            saveValueAccessInformation(str2, Long.valueOf(j));
            nativeStoreLong(str2, j, this.handle);
            super.notifyChangeListeners(this, str2);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Long.valueOf(j), th);
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        storeString(str, str2, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        storeStringArray(str, strArr, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        storeStringArray(str, strArr, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        storeString(str, str2, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        storeStringSet(str, set, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        storeStringSet(str, set, true);
    }

    public KevaPrivateNativeImpl(String str, String str2, int i) {
        super(str, str2, i);
        this.needRelease = true;
        if (KevaImpl.sIsEnableLoadFromNative == 1) {
            this.keyValueMap = new ConcurrentHashMap<>(5);
            KevaCacheManager.registerClearListener(this);
        }
    }

    private byte[] getBytes(String str, byte[] bArr, boolean z) {
        try {
            return fetchBytes(str, bArr, -1, z);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, bArr, th);
            return bArr;
        }
    }

    private String getString(String str, String str2, boolean z) {
        try {
            return fetchString(str, str2, z);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, str2, th);
            return str2;
        }
    }

    private String[] getStringArray(String str, String[] strArr, boolean z) {
        try {
            String[] fetchStringArray = fetchStringArray(str, null, z);
            if (fetchStringArray == null) {
                return strArr;
            }
            return fetchStringArray;
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, strArr, th);
            return strArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0022: INVOKE 
      (r0v1 ?? I:com.bytedance.keva.KevaMonitor)
      (r1v0 ?? I:int)
      (r2v0 ?? I:java.lang.String)
      (r3 I:java.lang.String)
      (r4 I:java.lang.Object)
      (r5 I:java.lang.Throwable)
     VIRTUAL call: com.bytedance.keva.KevaMonitor.reportThrowable(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Throwable):void A[MD:(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Throwable):void (m)] (LINE:50331682), block:B:13:0x001d */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0022: INVOKE 
      (r0v1 ?? I:com.bytedance.keva.KevaMonitor)
      (r1v0 ?? I:int)
      (r2v0 ?? I:java.lang.String)
      (r3v0 ?? I:java.lang.String)
      (r4 I:java.lang.Object)
      (r5 I:java.lang.Throwable)
     VIRTUAL call: com.bytedance.keva.KevaMonitor.reportThrowable(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Throwable):void A[MD:(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Throwable):void (m)] (LINE:50331682), block:B:13:0x001d */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Set<java.lang.String>] */
    private Set<String> getStringSet(String str, Set<String> set, boolean z) {
        String reportThrowable;
        ?? reportThrowable2;
        try {
            String[] fetchStringArray = fetchStringArray(str, null, z);
            if (fetchStringArray == null) {
                if (set == null) {
                    return set;
                }
                return new HashSet(set);
            }
            return new HashSet(Arrays.asList(fetchStringArray));
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(2, this.mName, reportThrowable, reportThrowable2, th);
            return reportThrowable2;
        }
    }

    private void storeBytes(String str, byte[] bArr, boolean z) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        if (!z) {
            try {
                saveValueAccessInformation(str2, bArr);
            } catch (Throwable th) {
                KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, bArr, th);
                return;
            }
        }
        nativeStoreBytes(str2, bArr, this.handle);
        super.notifyChangeListeners(this, str2);
    }

    private void storeString(String str, String str2, boolean z) {
        String str3 = str;
        if ("".equals(str3)) {
            str3 = null;
        }
        if (!z) {
            try {
                saveValueAccessInformation(str3, str2);
            } catch (Throwable th) {
                KevaImpl.sMonitor.reportThrowable(3, this.mName, str3, str2, th);
                return;
            }
        }
        nativeStoreString(str3, str2, this.handle);
        super.notifyChangeListeners(this, str3);
    }

    private void storeStringArray(String str, String[] strArr, boolean z) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        if (!z) {
            try {
                saveValueAccessInformation(str2, strArr);
            } catch (Throwable th) {
                KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, strArr, th);
                return;
            }
        }
        nativeStoreStringArray(str2, strArr, this.handle);
        super.notifyChangeListeners(this, str2);
    }

    private void storeStringSet(String str, Set<String> set, boolean z) {
        String str2 = str;
        try {
            String[] strArr = null;
            if ("".equals(str2)) {
                str2 = null;
            }
            if (set != null) {
                strArr = new String[set.size()];
                set.toArray(strArr);
                if (!z) {
                    saveValueAccessInformation(str2, strArr);
                }
            }
            nativeStoreStringArray(str2, strArr, this.handle);
            super.notifyChangeListeners(this, str2);
        } catch (Throwable th) {
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, set, th);
        }
    }

    public void addBooleanValue(String str, boolean z, HashMap<String, Object> hashMap) {
        hashMap.put(str, Boolean.valueOf(z));
    }

    public void addDoubleValue(String str, double d, HashMap<String, Object> hashMap) {
        hashMap.put(str, Double.valueOf(d));
    }

    public void addFloatValue(String str, float f, HashMap<String, Object> hashMap) {
        hashMap.put(str, Float.valueOf(f));
    }

    public void addIntValue(String str, int i, HashMap<String, Object> hashMap) {
        hashMap.put(str, Integer.valueOf(i));
    }

    public void addLongValue(String str, long j, HashMap<String, Object> hashMap) {
        hashMap.put(str, Long.valueOf(j));
    }

    public void addObjectValue(String str, Object obj, HashMap<String, Object> hashMap) {
        hashMap.put(str, obj);
    }

    @Override // com.bytedance.keva.KevaImpl
    public String fetchString(String str, String str2, boolean z) {
        String nativeGetString;
        if ("".equals(str)) {
            str = null;
        }
        if (!z) {
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr = this.keyValueMap.get(str);
            if (objArr != null) {
                objArr[1] = Long.valueOf(currentTimeMillis);
                nativeGetString = (String) objArr[0];
            } else {
                nativeGetString = nativeGetString(str, this.handle);
                this.keyValueMap.put(str, new Object[]{nativeGetString, Long.valueOf(currentTimeMillis)});
            }
        } else {
            nativeGetString = nativeGetString(str, this.handle);
        }
        if (nativeGetString == null) {
            return str2;
        }
        return nativeGetString;
    }

    @Override // com.bytedance.keva.KevaImpl
    public String[] fetchStringArray(String str, String[] strArr, boolean z) {
        if ("".equals(str)) {
            str = null;
        }
        if (!z) {
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr = this.keyValueMap.get(str);
            if (objArr != null) {
                objArr[1] = Long.valueOf(currentTimeMillis);
                return (String[]) objArr[0];
            }
            String[] nativeGetStringArray = nativeGetStringArray(str, this.handle);
            this.keyValueMap.put(str, new Object[]{nativeGetStringArray, Long.valueOf(currentTimeMillis)});
            return nativeGetStringArray;
        }
        return nativeGetStringArray(str, this.handle);
    }

    @Override // com.bytedance.keva.KevaImpl
    public byte[] fetchBytes(String str, byte[] bArr, int i, boolean z) {
        byte[] nativeGetBytes;
        if ("".equals(str)) {
            str = null;
        }
        if (!z) {
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr = this.keyValueMap.get(str);
            if (objArr != null) {
                objArr[1] = Long.valueOf(currentTimeMillis);
                nativeGetBytes = (byte[]) objArr[0];
            } else {
                nativeGetBytes = nativeGetBytes(str, this.handle);
                this.keyValueMap.put(str, new Object[]{nativeGetBytes, Long.valueOf(currentTimeMillis)});
            }
        } else {
            nativeGetBytes = nativeGetBytes(str, this.handle);
        }
        if (nativeGetBytes == null) {
            return bArr;
        }
        return nativeGetBytes;
    }
}
