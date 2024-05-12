package X;

import Y.AgS123S0100000_6;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.ss.android.ugc.aweme.pitaya.IPitayaBundle;
import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.F6c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38422F6c implements IPitayaBundle {
    public static long LJ = 2000;
    public static final /* synthetic */ int LJFF = 0;
    public volatile IPitayaBundle LIZ;
    public C38421F6b LIZIZ;
    public final java.util.Map<Integer, String> LIZJ;
    public final AtomicInteger LIZLLL;

    public final synchronized void LIZ() {
        if (this.LIZ != null) {
            return;
        }
        try {
            try {
                try {
                    Object invoke = Class.forName("com.ss.android.ugc.aweme.pitaya.PitayaBundleImpl").getMethod("createImplInst", new Class[0]).invoke(null, new Object[0]);
                    o.LJII(invoke, "null cannot be cast to non-null type com.ss.android.ugc.aweme.pitaya.IPitayaBundle");
                    this.LIZ = (IPitayaBundle) invoke;
                } catch (InvocationTargetException e) {
                    C16880lQ.LLLLIIL(e);
                }
            } catch (IllegalAccessException e2) {
                C16880lQ.LLLLIIL(e2);
            } catch (NoSuchMethodException e3) {
                C16880lQ.LLLLIIL(e3);
            }
        } catch (Throwable unused) {
        }
    }

    public C38422F6c() {
        TreeMap treeMap = new TreeMap();
        this.LIZJ = treeMap;
        this.LIZLLL = new AtomicInteger(0);
        treeMap.put(0, "Success, no error");
        treeMap.put(1, "pitaya not enabled");
        treeMap.put(2, "pitaya not inited");
        treeMap.put(3, "pitaya bundle not installed");
    }

    public static boolean LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EF7.LJIIIZ);
        LIZ.append("");
        return PitayaCoreFactory.getCore(X1D.LIZIZ(LIZ)).isReady();
    }

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final boolean initPitaya(C38421F6b c38421F6b) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EF7.LJIIIZ);
        LIZ.append("");
        if (PitayaCoreFactory.getCore(X1D.LIZIZ(LIZ)).isReady()) {
            return true;
        }
        if (this.LIZLLL.addAndGet(1) > 8) {
            return false;
        }
        if (c38421F6b == null) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new C38421F6b();
            }
        } else {
            this.LIZIZ = c38421F6b;
        }
        C10K.LJII(LJ).LJ(new AgS123S0100000_6(this, 3), C10K.LJI, null);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final void initPitayaProxy(Context context) {
        if (context != null) {
            SettingsManager.LIZLLL().getClass();
            E3F.LIZ("PitayaProxyInitEnd", true, Integer.valueOf(SettingsManager.LJ("pitaya_proxy_init_delay", 0) * 1000), new AqS156S0100000_6(context, 65));
        }
    }

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final boolean releaseArtSoterByName(String str) {
        if (this.LIZ != null) {
            IPitayaBundle iPitayaBundle = this.LIZ;
            o.LJI(iPitayaBundle);
            return iPitayaBundle.releaseArtSoterByName(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final int setDebugWebSocketUrl(String str) {
        if (this.LIZ != null) {
            IPitayaBundle iPitayaBundle = this.LIZ;
            o.LJI(iPitayaBundle);
            return iPitayaBundle.setDebugWebSocketUrl(str);
        }
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final void onAppLogEvent(String str, String str2) {
        if (this.LIZ != null) {
            IPitayaBundle iPitayaBundle = this.LIZ;
            o.LJI(iPitayaBundle);
            iPitayaBundle.onAppLogEvent(str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final void onCustomAppLog(String str, JSONObject jSONObject) {
        if (this.LIZ != null) {
            IPitayaBundle iPitayaBundle = this.LIZ;
            o.LJI(iPitayaBundle);
            iPitayaBundle.onCustomAppLog(str, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.pitaya.IPitayaBundle
    public final boolean runArtSoterByName(String str, Bitmap bitmap, JSONObject jSONObject, PTYTaskResultCallback pTYTaskResultCallback) {
        if (this.LIZ != null) {
            IPitayaBundle iPitayaBundle = this.LIZ;
            o.LJI(iPitayaBundle);
            return iPitayaBundle.runArtSoterByName(str, bitmap, jSONObject, pTYTaskResultCallback);
        }
        return false;
    }
}
