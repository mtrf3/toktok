package com.bytedance.pitaya.feature;

import X.C47261Igj;
import X.C93276aOG;
import com.bytedance.pitaya.api.feature.IKVStore;
import com.bytedance.pitaya.log.PitayaLogger;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class PTYKVStore implements IKVStore {
    public static final C93276aOG Companion = new C93276aOG();
    public final String aid;
    public final String businessName;
    public final boolean inMemory;

    private final native boolean nativeAppend(String str, String str2, String str3, boolean z);

    private final native boolean nativeContain(String str, String str2, String str3, boolean z);

    private final native String nativeGetKVData(String str, String str2, boolean z);

    private final native String nativeGetValueForKeys(List<String> list, String str, String str2);

    private final native boolean nativeRemoveKeys(String str, String str2, List<String> list, boolean z);

    private final native boolean nativeSetKVData(String str, String str2, String str3, boolean z);

    private final native String nativeTryGetValuesForReqeust(String str, String str2, List<String> list);

    @Override // com.bytedance.pitaya.api.feature.IKVStore
    public JSONObject getKVData() {
        try {
            String nativeGetKVData$default = nativeGetKVData$default(this, null, null, false, 7, null);
            if (nativeGetKVData$default == null) {
                return null;
            }
            try {
                return new JSONObject(nativeGetKVData$default);
            } catch (Throwable th) {
                PitayaLogger.LJ(th, null, 6);
                return null;
            }
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return null;
        }
    }

    @Override // com.bytedance.pitaya.api.feature.IKVStore
    public String getAid() {
        return this.aid;
    }

    @Override // com.bytedance.pitaya.api.feature.IKVStore
    public String getBusinessName() {
        return this.businessName;
    }

    @Override // com.bytedance.pitaya.api.feature.IKVStore
    public boolean getInMemory() {
        return this.inMemory;
    }

    @Override // com.bytedance.pitaya.api.feature.IKVStore
    public boolean append(JSONObject data) {
        o.LJIIJ(data, "data");
        try {
            String jSONObject = data.toString();
            o.LJFF(jSONObject, "data.toString()");
            return nativeAppend$default(this, null, null, jSONObject, false, 11, null);
        } catch (Throwable th) {
            try {
                PitayaLogger.LJ(th, null, 6);
                return false;
            } catch (UnsatisfiedLinkError e) {
                PitayaLogger.LJ(e, null, 6);
                return false;
            }
        }
    }

    @Override // com.bytedance.pitaya.api.feature.IKVStore
    public boolean contain(String key) {
        o.LJIIJ(key, "key");
        try {
            return nativeContain$default(this, null, null, key, false, 11, null);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return false;
        }
    }

    @Override // com.bytedance.pitaya.api.feature.IKVStore
    public Object getValueForKey(String key) {
        o.LJIIJ(key, "key");
        JSONObject valueForKeys = getValueForKeys(C47261Igj.LJJIJ(key));
        if (valueForKeys != null) {
            return valueForKeys.opt(key);
        }
        return null;
    }

    @Override // com.bytedance.pitaya.api.feature.IKVStore
    public JSONObject getValueForKeys(List<String> keys) {
        o.LJIIJ(keys, "keys");
        if (getInMemory()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject kVData = getKVData();
            if (kVData != null) {
                try {
                    for (String str : keys) {
                        jSONObject.put(str, kVData.opt(str));
                    }
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        } else {
            try {
                String nativeGetValueForKeys$default = nativeGetValueForKeys$default(this, keys, null, null, 6, null);
                if (nativeGetValueForKeys$default == null) {
                    return null;
                }
                try {
                    return new JSONObject(nativeGetValueForKeys$default);
                } catch (Throwable unused2) {
                    return null;
                }
            } catch (UnsatisfiedLinkError e) {
                PitayaLogger.LJ(e, null, 6);
            }
        }
        return null;
    }

    @Override // com.bytedance.pitaya.api.feature.IKVStore
    public boolean removeKeys(List<String> keys) {
        o.LJIIJ(keys, "keys");
        try {
            return nativeRemoveKeys$default(this, null, null, keys, false, 11, null);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return false;
        }
    }

    @Override // com.bytedance.pitaya.api.feature.IKVStore
    public boolean setKVData(JSONObject data) {
        o.LJIIJ(data, "data");
        try {
            String jSONObject = data.toString();
            o.LJFF(jSONObject, "data.toString()");
            return nativeSetKVData$default(this, null, null, jSONObject, false, 11, null);
        } catch (Throwable th) {
            try {
                PitayaLogger.LJ(th, null, 6);
                return false;
            } catch (UnsatisfiedLinkError e) {
                PitayaLogger.LJ(e, null, 6);
                return false;
            }
        }
    }

    @Override // com.bytedance.pitaya.api.feature.IKVStore
    public String tryGetValuesForRequest(List<String> keys) {
        o.LJIIJ(keys, "keys");
        try {
            return nativeTryGetValuesForReqeust$default(this, null, null, keys, 3, null);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
            return "";
        }
    }

    @Override // com.bytedance.pitaya.api.feature.IKVStore
    public boolean setValueForKey(String key, Object value) {
        o.LJIIJ(key, "key");
        o.LJIIJ(value, "value");
        JSONObject put = new JSONObject().put(key, value);
        o.LJFF(put, "JSONObject().put(key, value)");
        return append(put);
    }

    public PTYKVStore(String str, String str2, boolean z) {
        this.aid = str;
        this.businessName = str2;
        this.inMemory = z;
    }

    public /* synthetic */ PTYKVStore(String str, String str2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z);
    }

    public static /* synthetic */ String nativeGetKVData$default(PTYKVStore pTYKVStore, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pTYKVStore.getBusinessName();
        }
        if ((i & 2) != 0) {
            str2 = pTYKVStore.getAid();
        }
        if ((i & 4) != 0) {
            z = pTYKVStore.getInMemory();
        }
        return pTYKVStore.nativeGetKVData(str, str2, z);
    }

    public static /* synthetic */ String nativeGetValueForKeys$default(PTYKVStore pTYKVStore, List list, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = pTYKVStore.getBusinessName();
        }
        if ((i & 4) != 0) {
            str2 = pTYKVStore.getAid();
        }
        return pTYKVStore.nativeGetValueForKeys(list, str, str2);
    }

    public static /* synthetic */ String nativeTryGetValuesForReqeust$default(PTYKVStore pTYKVStore, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pTYKVStore.getBusinessName();
        }
        if ((i & 2) != 0) {
            str2 = pTYKVStore.getAid();
        }
        return pTYKVStore.nativeTryGetValuesForReqeust(str, str2, list);
    }

    public static /* synthetic */ boolean nativeAppend$default(PTYKVStore pTYKVStore, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pTYKVStore.getBusinessName();
        }
        if ((i & 2) != 0) {
            str2 = pTYKVStore.getAid();
        }
        if ((i & 8) != 0) {
            z = pTYKVStore.getInMemory();
        }
        return pTYKVStore.nativeAppend(str, str2, str3, z);
    }

    public static /* synthetic */ boolean nativeContain$default(PTYKVStore pTYKVStore, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pTYKVStore.getBusinessName();
        }
        if ((i & 2) != 0) {
            str2 = pTYKVStore.getAid();
        }
        if ((i & 8) != 0) {
            z = pTYKVStore.getInMemory();
        }
        return pTYKVStore.nativeContain(str, str2, str3, z);
    }

    public static /* synthetic */ boolean nativeRemoveKeys$default(PTYKVStore pTYKVStore, String str, String str2, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pTYKVStore.getBusinessName();
        }
        if ((i & 2) != 0) {
            str2 = pTYKVStore.getAid();
        }
        if ((i & 8) != 0) {
            z = pTYKVStore.getInMemory();
        }
        return pTYKVStore.nativeRemoveKeys(str, str2, list, z);
    }

    public static /* synthetic */ boolean nativeSetKVData$default(PTYKVStore pTYKVStore, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pTYKVStore.getBusinessName();
        }
        if ((i & 2) != 0) {
            str2 = pTYKVStore.getAid();
        }
        if ((i & 8) != 0) {
            z = pTYKVStore.getInMemory();
        }
        return pTYKVStore.nativeSetKVData(str, str2, str3, z);
    }
}
