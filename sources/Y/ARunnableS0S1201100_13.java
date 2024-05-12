package Y;

import X.C30757C5h;
import X.C38393F4z;
import X.C78443UqV;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S1201100_13 implements Runnable {
    public final int $t;
    public int i3;
    public long j4;
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
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS0S1201100_13 aRunnableS0S1201100_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS0S1201100_13.l1;
        long j = aRunnableS0S1201100_13.j4;
        Map map = (Map) aRunnableS0S1201100_13.l2;
        String str = aRunnableS0S1201100_13.s0;
        int i = aRunnableS0S1201100_13.i3;
        c78443UqV.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
        } catch (JSONException unused) {
        }
        c78443UqV.monitorStatusAndDuration(str, i, jSONObject, C38393F4z.LIZLLL(map));
    }

    public static final void run$1(ARunnableS0S1201100_13 aRunnableS0S1201100_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS0S1201100_13.l1;
        String str = aRunnableS0S1201100_13.s0;
        int i = aRunnableS0S1201100_13.i3;
        long j = aRunnableS0S1201100_13.j4;
        JSONObject jSONObject = (JSONObject) aRunnableS0S1201100_13.l2;
        c78443UqV.getClass();
        if (!C30757C5h.LIZIZ(i, str)) {
            c78443UqV.LJIIJ(str, j, jSONObject);
        }
    }

    public static final void run$2(ARunnableS0S1201100_13 aRunnableS0S1201100_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS0S1201100_13.l1;
        long j = aRunnableS0S1201100_13.j4;
        String str = aRunnableS0S1201100_13.s0;
        int i = aRunnableS0S1201100_13.i3;
        JSONObject jSONObject = (JSONObject) aRunnableS0S1201100_13.l2;
        c78443UqV.getClass();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("duration", j);
        } catch (JSONException unused) {
        }
        c78443UqV.monitorStatusAndDuration(str, i, jSONObject2, jSONObject);
    }

    public ARunnableS0S1201100_13(long j, C78443UqV c78443UqV, JSONObject jSONObject, int i) {
        this.$t = i;
        this.l1 = c78443UqV;
        this.s0 = "ttlive_webview_init_all";
        this.i3 = 0;
        this.j4 = j;
        this.l2 = jSONObject;
    }

    public ARunnableS0S1201100_13(int i, long j, Object obj, String str, Object obj2, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.j4 = j;
        this.s0 = str;
        this.i3 = i;
        this.l2 = obj2;
    }
}
