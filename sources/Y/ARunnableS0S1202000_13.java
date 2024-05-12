package Y;

import X.C30757C5h;
import X.C78443UqV;
import X.U7U;
import X.U9F;
import android.view.SurfaceView;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S1202000_13 implements Runnable {
    public final int $t;
    public int i3;
    public int i4;
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
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS0S1202000_13 aRunnableS0S1202000_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS0S1202000_13.l1;
        String str = aRunnableS0S1202000_13.s0;
        int i = aRunnableS0S1202000_13.i3;
        int i2 = aRunnableS0S1202000_13.i4;
        JSONObject jSONObject = (JSONObject) aRunnableS0S1202000_13.l2;
        c78443UqV.getClass();
        if (!C30757C5h.LIZIZ(i, str)) {
            c78443UqV.LIZLLL(i2, str, jSONObject);
        }
    }

    public static final void run$1(ARunnableS0S1202000_13 aRunnableS0S1202000_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS0S1202000_13.l1;
        String str = aRunnableS0S1202000_13.s0;
        int i = aRunnableS0S1202000_13.i3;
        int i2 = aRunnableS0S1202000_13.i4;
        JSONObject jSONObject = (JSONObject) aRunnableS0S1202000_13.l2;
        c78443UqV.getClass();
        if (!C30757C5h.LIZIZ(i, str)) {
            c78443UqV.monitorStatus(str, i2, jSONObject);
        }
    }

    public static final void run$2(ARunnableS0S1202000_13 aRunnableS0S1202000_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS0S1202000_13.l1;
        String str = aRunnableS0S1202000_13.s0;
        int i = aRunnableS0S1202000_13.i3;
        int i2 = aRunnableS0S1202000_13.i4;
        Map map = (Map) aRunnableS0S1202000_13.l2;
        c78443UqV.getClass();
        if (!C30757C5h.LIZIZ(i, str)) {
            c78443UqV.LJIJJ(i2, str, map);
        }
    }

    public static final void run$3(ARunnableS0S1202000_13 aRunnableS0S1202000_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS0S1202000_13.l1;
        String str = aRunnableS0S1202000_13.s0;
        int i = aRunnableS0S1202000_13.i3;
        int i2 = aRunnableS0S1202000_13.i4;
        JSONObject jSONObject = (JSONObject) aRunnableS0S1202000_13.l2;
        c78443UqV.getClass();
        if (!C30757C5h.LIZIZ(i, str)) {
            c78443UqV.monitorStatusRate(str, i2, jSONObject);
        }
    }

    public static final void run$4(ARunnableS0S1202000_13 aRunnableS0S1202000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS0S1202000_13.l1).LJFF;
            if (u9f != null) {
                u9f.LJJIJIL(aRunnableS0S1202000_13.s0, (SurfaceView) aRunnableS0S1202000_13.l2, aRunnableS0S1202000_13.i3, aRunnableS0S1202000_13.i4);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1202000_13(C78443UqV c78443UqV, int i, JSONObject jSONObject, int i2) {
        this.$t = i2;
        this.l1 = c78443UqV;
        this.s0 = "hotsoon_image_load_error_rate";
        this.i3 = 0;
        this.i4 = i;
        this.l2 = jSONObject;
    }

    public ARunnableS0S1202000_13(C78443UqV c78443UqV, String str, int i, JSONObject jSONObject, int i2) {
        this.$t = i2;
        this.l1 = c78443UqV;
        this.s0 = str;
        this.i3 = 1;
        this.i4 = i;
        this.l2 = jSONObject;
    }

    public ARunnableS0S1202000_13(Object obj, String str, int i, int i2, Object obj2, int i3) {
        this.$t = i3;
        this.l1 = obj;
        this.s0 = str;
        this.i3 = i;
        this.i4 = i2;
        this.l2 = obj2;
    }
}
