package Y;

import X.C2NU;
import X.C31012CFc;
import X.C38995FSd;
import X.C76762UAs;
import X.C78443UqV;
import X.CN1;
import X.U66;
import X.UC0;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS2S1200100_13 implements Runnable {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean z;
        JSONObject LJIJI = UC0.LJIJI((U66) this.l1);
        long LIZIZ = C31012CFc.LIZIZ();
        long currentTimeMillis = System.currentTimeMillis();
        ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        C76762UAs c76762UAs = (C76762UAs) this.l2;
        c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S1310300_13(c76762UAs, (U66) this.l1, LIZIZ, currentTimeMillis, LJIJI, this.s0, z, this.j3, 1));
    }

    public static final void run$0(ARunnableS2S1200100_13 aRunnableS2S1200100_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS2S1200100_13.l1;
        long j = aRunnableS2S1200100_13.j3;
        JSONObject jSONObject = (JSONObject) aRunnableS2S1200100_13.l2;
        String str = aRunnableS2S1200100_13.s0;
        c78443UqV.getClass();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("duration", j);
        } catch (JSONException unused) {
        }
        JSONObject LJIL = C78443UqV.LJIL(jSONObject);
        if (C78443UqV.LJJI() == null || LiveEnableSlardarSetting.INSTANCE.isDisable(str)) {
            return;
        }
        C38995FSd.LIZIZ().submit(new ARunnableS0S1301000_13(0, c78443UqV, str, jSONObject2, LJIL, 0));
    }

    public static final void run$1(ARunnableS2S1200100_13 aRunnableS2S1200100_13) {
        boolean LIZ;
        try {
            aRunnableS2S1200100_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S1200100_13(Object obj, Object obj2, String str, long j, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.j3 = j;
    }
}
