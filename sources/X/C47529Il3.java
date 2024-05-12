package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: X.Il3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47529Il3 {
    public StrategyCenter LIZ;
    public InterfaceC47097Ie5 LIZIZ;
    public C47192Ifc LIZJ;
    public InterfaceC47096Ie4 LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public Context LJII;
    public int LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public C47532Il6 LJIIL;
    public WeakReference<InterfaceC47584Ilw> LJIILIIL;
    public int LJIIIIZZ = 5;
    public final ReentrantLock LJIILJJIL = new ReentrantLock();
    public C47521Ikv LJIILL = null;
    public final java.util.Map<Integer, Integer> LJIILLIIL = new ConcurrentHashMap(5);
    public final C47524Iky LJIIZILJ = new C47524Iky();
    public final java.util.Map<Integer, Integer> LJIJ = new ConcurrentHashMap();
    public final java.util.Map<Integer, String> LJIJI = new ConcurrentHashMap();
    public C47523Ikx LJIJJ = null;
    public int LJIJJLI = 0;
    public boolean LJIL = true;
    public float LJJ = -1.0f;
    public final ReentrantLock LJJI = new ReentrantLock();

    public final StrategyCenter LJ() {
        if (this.LIZ == null) {
            this.LJIILJJIL.lock();
            try {
                if (this.LIZ == null) {
                    this.LIZ = new StrategyCenter(new C47520Iku(this, this));
                }
            } finally {
                this.LJIILJJIL.unlock();
            }
        }
        return this.LIZ;
    }

    public final boolean LJIIIZ() {
        return !this.LJIIJ;
    }

    public final void LJI() {
        JSONObject LIZIZ;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("internalStart needLoadLibrary=");
        LIZ.append(true);
        C78253UnR.LJI("VCStrategy", X1D.LIZIZ(LIZ));
        LJ().create(this.LJII, true);
        if (!LJ().isLoadLibrarySucceed()) {
            C78253UnR.LJI("VCStrategy", "internalStart isLoadLibrarySucceed false");
            return;
        }
        this.LJIILL = new C47521Ikv(this, this.LJII, this);
        LJ().setIntValue(10000, this.LJIIIIZZ);
        LJ().setIntValue(801, C78598Ut0.LJLIL);
        LJ().setIntValue(802, C78598Ut0.LJLILLLLZI);
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJIJI).entrySet()) {
            LJ().setAlgorithmJson(((Integer) entry.getKey()).intValue(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : ((ConcurrentHashMap) this.LJIJ).entrySet()) {
            LJ().setIntValue(((Integer) entry2.getKey()).intValue(), ((Integer) entry2.getValue()).intValue());
        }
        if (this.LJIIL == null) {
            this.LJIIL = new C47532Il6(this);
            if (!C77117UOj.LJIJI(C47149Iev.LIZ.LJIIIZ, 16L)) {
                this.LJIILIIL = new WeakReference<>(this.LJIIL);
                C47906Ir8.LIZLLL().LJII(this.LJIILIIL);
            }
        }
        if (((ConcurrentHashMap) this.LJIJI).get(31001) == null) {
            if (this.LJIIIZ == 32) {
                str = "{\"strategy_center_v1\":{\"feed\":{\"preload_strategy\":{\"name\":\"adaptive\",\"low_buf\":5,\"high_buf\":20,\"tasks\":[{\"count\":5,\"size\":800,\"offset\":0}]}},\"fullscreen_immersive\":{\"preload_strategy\":{\"name\":\"adaptive\",\"low_buf\":5,\"high_buf\":20,\"tasks\":[{\"count\":5,\"size\":800,\"offset\":0}]}},\"story\":{\"preload_strategy\":{\"name\":\"adaptive\",\"low_buf\":5,\"high_buf\":20,\"tasks\":[{\"count\":5,\"size\":800,\"offset\":0}]}}}}";
            } else {
                str = "{\"strategy_center_v1\":{\"engine_default\":{\"preload_strategy\":{\"name\":\"default\",\"tasks\":[{\"download_progress\":100,\"count\":5,\"offset\":0,\"size\":800}]}},\"video_range_request\":{\"enable_concurrent_download\":0,\"allowed_segment_download\":0,\"fixed_size\":3000,\"fixed_duration\":10}}}";
            }
            LJIIL(31001, str);
        }
        LJ().setIOManager(this.LJFF, this.LJI);
        if (!LJ().isIOManagerVersionMatch()) {
            C78253UnR.LJI("VCStrategy", "io manager interface not match, start fail.");
            return;
        }
        LJ().setLogCallback(new C47531Il5());
        if (this.LIZJ != null) {
            LJ().setAppServer(new C47193Ifd(this));
        }
        C47735IoN c47735IoN = C47538IlC.LIZ;
        if (c47735IoN.LJFF != 0 && (LIZIZ = c47735IoN.LIZ.LJ.get("vod").LIZIZ()) != null) {
            LJ().setSettingsInfo("vod", LIZIZ.toString());
        }
        C47188IfY c47188IfY = new C47188IfY("engine_default");
        c47188IfY.LIZ = "engine_default";
        c47188IfY.LIZIZ = "engine_brief_default";
        c47188IfY.LIZJ = 1;
        c47188IfY.LIZLLL = 1;
        C47529Il3 c47529Il3 = C47147Iet.LIZ;
        c47529Il3.LJ().createScene(c47188IfY.LIZ());
        LJ().setStateSupplier(new C47525Ikz(this));
        LJ().start(this.LJII, true);
        c47529Il3.LJ().switchToScene("engine_default");
        C47534Il8 c47534Il8 = C47533Il7.LIZ;
        c47534Il8.getClass();
        try {
            LJ().businessEvent(31214, new JSONObject(new HashMap(c47534Il8.LIZ)).toString());
        } catch (Exception unused) {
        }
        C47533Il7.LIZ.LIZIZ.add(new C47530Il4(this));
    }

    public final boolean LJII() {
        return LJ().isRunning();
    }

    public static C47529Il3 LJFF() {
        return C47147Iet.LIZ;
    }

    public static String LIZ(java.util.Map map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    jSONObject.put(str, str2);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void LIZJ(int i) {
        if (i != -1 && LJ().isLoadLibrarySucceed()) {
            boolean z = true;
            this.LJIIJ = true;
            if (LJ().iPlayerVersion() != i) {
                z = false;
            }
            this.LJIIJJI = z;
        }
    }

    public final int LJIIIIZZ(int i) {
        if (!((ConcurrentHashMap) this.LJIILLIIL).containsKey(Integer.valueOf(i))) {
            if (!LJ().isRunning()) {
                return 0;
            }
            ((ConcurrentHashMap) this.LJIILLIIL).put(Integer.valueOf(i), Integer.valueOf(LJ().getIntValue(i, 0)));
        }
        Object obj = ((ConcurrentHashMap) this.LJIILLIIL).get(Integer.valueOf(i));
        if (obj == null) {
            obj = 0;
        }
        return ((Integer) obj).intValue();
    }

    public final void LJIIJ(String str) {
        C47524Iky c47524Iky = this.LJIIZILJ;
        c47524Iky.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((ConcurrentHashMap) c47524Iky.LIZ).remove(str);
    }

    public static void LIZIZ(String str, java.util.Map map) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = JSONObjectProtectorUtils.getString(jSONObject, next);
                    if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                        ((HashMap) map).put(next, string);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void LIZLLL(String str, java.util.Map map) {
        if (!this.LJ && LJ().isLoadLibrarySucceed()) {
            LJ().setAppInfo(str);
            this.LJ = true;
        }
        if (map != null) {
            HashMap hashMap = (HashMap) map;
            if (hashMap.containsKey("appid")) {
                this.LJIIIZ = C47756Ioi.LJIILL(hashMap.get("appid"));
            }
        }
    }

    public final void LJIIL(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[preload] Algorithm json ");
            LIZ.append(str);
            C78253UnR.LJI("VCStrategy", X1D.LIZIZ(LIZ));
            return;
        }
        if (LJ().isLoadLibrarySucceed()) {
            LJ().setAlgorithmJson(i, str);
            return;
        }
        ((ConcurrentHashMap) this.LJIJI).put(Integer.valueOf(i), str);
    }

    public final java.util.Map<String, Integer> LJIIJJI(InterfaceC47616ImS interfaceC47616ImS, int i, java.util.Map<String, String> map, C47526Il0 c47526Il0) {
        String selectBitrate = LJ().selectBitrate(interfaceC47616ImS.LJIIIIZZ(), i, LIZ(map), c47526Il0);
        HashMap hashMap = null;
        if (TextUtils.isEmpty(selectBitrate)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[GearStrategy]StrategyHelper.selectResolution result invalid retString=");
            LIZ.append(selectBitrate);
            TTVideoEngineLog.d("VCStrategy", X1D.LIZIZ(LIZ));
            return null;
        }
        if (selectBitrate != null && selectBitrate.length() >= 2) {
            hashMap = new HashMap();
            for (String str : selectBitrate.split(",")) {
                try {
                    try {
                        String[] split = str.split(":");
                        if (split.length == 2) {
                            hashMap.put(split[0], Integer.valueOf(Integer.parseInt(split[1])));
                        }
                    } catch (NumberFormatException e) {
                        TTVideoEngineLog.d(e);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return hashMap;
    }
}
