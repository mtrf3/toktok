package com.benchmark.strategy.nativePort;

import X.C05100Hy;
import X.C09200Xs;
import X.C09590Zf;
import X.C10930bp;
import X.C32771Qj;
import X.C47261Igj;
import X.InterfaceC09210Xt;
import com.benchmark.ByteBenchBundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ByteBenchStrategyPort {
    public int mOriginId;
    public C10930bp mSettings;
    public InterfaceC09210Xt mStrategyInfoCallback;
    public ConcurrentHashMap<String, C05100Hy> mStrategyRegisterMap = new ConcurrentHashMap<>();

    private native void native_clearStrategyCache(int i, String str);

    private native boolean native_contains(int i, String str);

    private native String native_getAllChildrenSpaceID(int i);

    private native String native_getDeviceAllFeatureForServer(int i);

    private native String native_getOneSpaceKeyList(int i, String str);

    private native String native_getOneSpaceStrategyList(int i, String str, String str2);

    private native void native_init(long j);

    private native boolean native_obtainBoolStrategy(int i, String str, boolean z, String str2, String str3, boolean z2);

    private native float native_obtainFloatStrategy(int i, String str, float f, String str2, String str3, boolean z);

    private native int native_obtainIntStrategy(int i, String str, int i2, String str2, String str3, boolean z);

    private native long native_obtainLongStrategy(int i, String str, long j, String str2, String str3, boolean z);

    private native boolean native_obtainStaticBoolStrategy(int i, String str, boolean z);

    private native float native_obtainStaticFloatStrategy(int i, String str, float f);

    private native int native_obtainStaticIntStrategy(int i, String str, int i2);

    private native long native_obtainStaticLongStrategy(int i, String str, long j);

    private native String native_obtainStaticStrStrategy(int i, String str, String str2);

    private native String native_obtainStrStrategy(int i, String str, String str2, String str3, String str4, boolean z);

    private native void native_openRepo(int i);

    private native void native_registerBXStrategyInfoCallback(int i);

    private native void native_registerBoolStrategy(int i, String str, boolean z, long j);

    private native void native_registerFloatStrategy(int i, String str, float f, long j);

    private native void native_registerIntStrategy(int i, String str, int i2, long j);

    private native void native_registerLongStrategy(int i, String str, long j, long j2);

    private native void native_registerStrStrategy(int i, String str, String str2, long j);

    private native void native_release(int i);

    private native void native_unregisterStrategy(int i, String str);

    public void strategyInfoCallback(int i, int i2, String str) {
    }

    public String[] getAllChildrenSpaceID() {
        if (C32771Qj.LIZIZ) {
            return native_getAllChildrenSpaceID(getRepoName()).split(",");
        }
        return null;
    }

    public int getRepoName() {
        int i = this.mOriginId;
        if (i > 0) {
            return i;
        }
        C09590Zf c09590Zf = C09590Zf.LJIILLIIL;
        if (c09590Zf != null) {
            return c09590Zf.LIZJ;
        }
        return 0;
    }

    public void openRepo() {
        if (C32771Qj.LIZIZ) {
            native_openRepo(getRepoName());
        }
    }

    public ByteBenchStrategyPort(int i) {
        this.mOriginId = i;
    }

    public void clearStrategyCache(String str) {
        if (C32771Qj.LIZIZ) {
            native_clearStrategyCache(getRepoName(), str);
        }
    }

    public boolean contains(String str) {
        if (C32771Qj.LIZIZ) {
            return native_contains(getRepoName(), str);
        }
        return false;
    }

    public void getDeviceFeatureForServer(HashMap<String, String> hashMap) {
        if (C32771Qj.LIZIZ) {
            try {
                JSONObject jSONObject = new JSONObject(native_getDeviceAllFeatureForServer(getRepoName()));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, String.valueOf((float) jSONObject.optDouble(next)));
                }
            } catch (Exception unused) {
            }
        }
    }

    public List<C09200Xs> getOneSpaceKeyList(String str) {
        if (!C32771Qj.LIZIZ) {
            return null;
        }
        String native_getOneSpaceKeyList = native_getOneSpaceKeyList(getRepoName(), str);
        if (native_getOneSpaceKeyList.isEmpty()) {
            return null;
        }
        String[] split = native_getOneSpaceKeyList.split(",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            C09200Xs c09200Xs = new C09200Xs();
            String[] split2 = str2.split("-");
            if (split2.length >= 3) {
                c09200Xs.LIZ = split2[0];
                c09200Xs.LIZIZ = CastIntegerProtector.parseInt(split2[1]);
                c09200Xs.LIZJ = CastIntegerProtector.parseInt(split2[2]);
                arrayList.add(c09200Xs);
            }
        }
        return arrayList;
    }

    public int init(C10930bp c10930bp) {
        this.mSettings = c10930bp;
        if (!C32771Qj.LIZIZ) {
            return -3;
        }
        ByteBenchBundle obtain = ByteBenchBundle.obtain();
        C47261Igj.LJIILJJIL("ByteBenchStrategyPort");
        c10930bp.getClass();
        obtain.setLong("update_interval_time", 0L);
        obtain.setBool("open_real_time_decision", true);
        obtain.setInt("second_app_id", 0);
        obtain.setString("access_key", c10930bp.LIZIZ);
        obtain.setString("secret_key", c10930bp.LIZJ);
        obtain.setInt("try_count", c10930bp.LIZ);
        obtain.setInt("origin_id", this.mOriginId);
        obtain.setInt("bytebench_app_id", this.mSettings.LIZLLL);
        native_init(obtain.getHandle());
        obtain.recycle();
        return 0;
    }

    public void registerBXStrategyInfoCallback(InterfaceC09210Xt interfaceC09210Xt) {
        if (C32771Qj.LIZIZ) {
            native_registerBXStrategyInfoCallback(getRepoName());
        }
    }

    public boolean registerBoolStrategy(C05100Hy<Boolean> c05100Hy) {
        if (!C32771Qj.LIZIZ) {
            return false;
        }
        ConcurrentHashMap<String, C05100Hy> concurrentHashMap = this.mStrategyRegisterMap;
        c05100Hy.getClass();
        concurrentHashMap.put(null, c05100Hy);
        getRepoName();
        throw null;
    }

    public boolean registerFloatStrategy(C05100Hy<Float> c05100Hy) {
        if (!C32771Qj.LIZIZ) {
            return false;
        }
        ConcurrentHashMap<String, C05100Hy> concurrentHashMap = this.mStrategyRegisterMap;
        c05100Hy.getClass();
        concurrentHashMap.put(null, c05100Hy);
        getRepoName();
        throw null;
    }

    public boolean registerIntStrategy(C05100Hy<Integer> c05100Hy) {
        if (!C32771Qj.LIZIZ) {
            return false;
        }
        ConcurrentHashMap<String, C05100Hy> concurrentHashMap = this.mStrategyRegisterMap;
        c05100Hy.getClass();
        concurrentHashMap.put(null, c05100Hy);
        getRepoName();
        throw null;
    }

    public boolean registerLongStrategy(C05100Hy<Long> c05100Hy) {
        if (!C32771Qj.LIZIZ) {
            return false;
        }
        ConcurrentHashMap<String, C05100Hy> concurrentHashMap = this.mStrategyRegisterMap;
        c05100Hy.getClass();
        concurrentHashMap.put(null, c05100Hy);
        getRepoName();
        throw null;
    }

    public boolean registerStrStrategy(C05100Hy<String> c05100Hy) {
        if (C32771Qj.LIZIZ) {
            ConcurrentHashMap<String, C05100Hy> concurrentHashMap = this.mStrategyRegisterMap;
            c05100Hy.getClass();
            concurrentHashMap.put(null, c05100Hy);
            native_registerStrStrategy(getRepoName(), null, null, 0L);
            return false;
        }
        return false;
    }

    public void release(int i) {
        if (C32771Qj.LIZIZ) {
            native_release(i);
        }
    }

    public void unregisterStrategy(String str) {
        if (C32771Qj.LIZIZ) {
            native_unregisterStrategy(getRepoName(), str);
        }
        this.mStrategyRegisterMap.remove(str);
    }

    private void update(String str, Object obj) {
        this.mStrategyRegisterMap.get(str);
    }

    public JSONObject getOneSpaceStrategyList(String str, String str2) {
        String native_getOneSpaceStrategyList;
        if (C32771Qj.LIZIZ && (native_getOneSpaceStrategyList = native_getOneSpaceStrategyList(getRepoName(), str, str2)) != null && !native_getOneSpaceStrategyList.isEmpty()) {
            try {
                return new JSONObject(native_getOneSpaceStrategyList);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean obtainStaticBoolStrategy(String str, boolean z) {
        if (C32771Qj.LIZIZ) {
            return native_obtainStaticBoolStrategy(getRepoName(), str, z);
        }
        return z;
    }

    public float obtainStaticFloatStrategy(String str, float f) {
        if (C32771Qj.LIZIZ) {
            return native_obtainStaticFloatStrategy(getRepoName(), str, f);
        }
        return f;
    }

    public int obtainStaticIntStrategy(String str, int i) {
        if (C32771Qj.LIZIZ) {
            return native_obtainStaticIntStrategy(getRepoName(), str, i);
        }
        return i;
    }

    public long obtainStaticLongStrategy(String str, long j) {
        if (C32771Qj.LIZIZ) {
            return native_obtainStaticLongStrategy(getRepoName(), str, j);
        }
        return j;
    }

    public String obtainStaticStrStrategy(String str, String str2) {
        if (C32771Qj.LIZIZ) {
            return native_obtainStaticStrStrategy(getRepoName(), str, str2);
        }
        return str2;
    }

    public void strategyNativeCallback(String str, float f) {
        update(str, Float.valueOf(f));
    }

    public void strategyNativeCallback(String str, int i) {
        update(str, Integer.valueOf(i));
    }

    public void strategyNativeCallback(String str, long j) {
        update(str, Long.valueOf(j));
    }

    public void strategyNativeCallback(String str, boolean z) {
        update(str, Boolean.valueOf(z));
    }

    public void strategyNativeCallback(String str, String str2) {
        update(str, str2);
    }

    public boolean obtainBoolStrategy(String str, boolean z, String str2, String str3, boolean z2) {
        if (!C32771Qj.LIZIZ) {
            return z;
        }
        return native_obtainBoolStrategy(getRepoName(), str, z, str2, str3, z2);
    }

    public float obtainFloatStrategy(String str, float f, String str2, String str3, boolean z) {
        if (!C32771Qj.LIZIZ) {
            return f;
        }
        return native_obtainFloatStrategy(getRepoName(), str, f, str2, str3, z);
    }

    public int obtainIntStrategy(String str, int i, String str2, String str3, boolean z) {
        if (!C32771Qj.LIZIZ) {
            return i;
        }
        return native_obtainIntStrategy(getRepoName(), str, i, str2, str3, z);
    }

    public long obtainLongStrategy(String str, long j, String str2, String str3, boolean z) {
        if (!C32771Qj.LIZIZ) {
            return j;
        }
        return native_obtainLongStrategy(getRepoName(), str, j, str2, str3, z);
    }

    public String obtainStrStrategy(String str, String str2, String str3, String str4, boolean z) {
        if (!C32771Qj.LIZIZ) {
            return str2;
        }
        return native_obtainStrStrategy(getRepoName(), str, str2, str3, str4, z);
    }
}
