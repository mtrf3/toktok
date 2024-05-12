package Y;

import X.C31012CFc;
import X.C78443UqV;
import X.CN1;
import X.U66;
import X.UA9;
import X.UAZ;
import X.UC0;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.realx.base.NetworkTypeUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS2S1101100_13 implements Runnable {
    public final int $t;
    public int i2;
    public long j3;
    public Object l1;
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
        JSONObject LJIJI = UC0.LJIJI((U66) this.l1);
        UA9.LJFF().LIZIZ(new UAZ((U66) this.l1, this.s0, this.i2, C31012CFc.LIZIZ(), LJIJI, System.currentTimeMillis(), NetworkTypeUtils.isNetworkAvailable(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context()), this.j3));
    }

    public static final void run$0(ARunnableS2S1101100_13 aRunnableS2S1101100_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS2S1101100_13.l1;
        long j = aRunnableS2S1101100_13.j3;
        String str = aRunnableS2S1101100_13.s0;
        int i = aRunnableS2S1101100_13.i2;
        c78443UqV.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
        } catch (JSONException unused) {
        }
        c78443UqV.monitorStatusAndDuration(str, i, jSONObject, null);
    }

    public static final void run$1(ARunnableS2S1101100_13 aRunnableS2S1101100_13) {
        boolean LIZ;
        try {
            aRunnableS2S1101100_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S1101100_13(Object obj, String str, int i, long j, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i2 = i;
        this.j3 = j;
    }
}
