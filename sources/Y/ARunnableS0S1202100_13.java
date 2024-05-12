package Y;

import X.C30757C5h;
import X.C78443UqV;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S1202100_13 implements Runnable {
    public final int $t;
    public int i3;
    public int i4;
    public long j5;
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

    public static final void run$0(ARunnableS0S1202100_13 aRunnableS0S1202100_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS0S1202100_13.l1;
        String str = aRunnableS0S1202100_13.s0;
        int i = aRunnableS0S1202100_13.i3;
        int i2 = aRunnableS0S1202100_13.i4;
        long j = aRunnableS0S1202100_13.j5;
        JSONObject jSONObject = (JSONObject) aRunnableS0S1202100_13.l2;
        c78443UqV.getClass();
        if (!C30757C5h.LIZIZ(i, str)) {
            c78443UqV.LJIILIIL(i2, j, str, jSONObject);
        }
    }

    public static final void run$1(ARunnableS0S1202100_13 aRunnableS0S1202100_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS0S1202100_13.l1;
        String str = aRunnableS0S1202100_13.s0;
        int i = aRunnableS0S1202100_13.i3;
        int i2 = aRunnableS0S1202100_13.i4;
        long j = aRunnableS0S1202100_13.j5;
        Map map = (Map) aRunnableS0S1202100_13.l2;
        c78443UqV.getClass();
        if (!C30757C5h.LIZIZ(i, str)) {
            c78443UqV.LJIJJLI(j, i2, str, map);
        }
    }

    public ARunnableS0S1202100_13(C78443UqV c78443UqV, String str, int i, long j, Map map, int i2) {
        this.$t = i2;
        this.l1 = c78443UqV;
        this.s0 = str;
        this.i3 = 0;
        this.i4 = i;
        this.j5 = j;
        this.l2 = map;
    }

    public ARunnableS0S1202100_13(C78443UqV c78443UqV, String str, int i, int i2, long j, JSONObject jSONObject, int i3) {
        this.$t = i3;
        this.l1 = c78443UqV;
        this.s0 = str;
        this.i3 = i;
        this.i4 = i2;
        this.j5 = j;
        this.l2 = jSONObject;
    }
}
