package Y;

import X.C64351PNj;
import X.C64353PNl;
import X.HandlerThreadC36423ERf;
import X.Q3U;
import X.Q3W;
import X.Q3X;
import X.Q3Y;
import X.WM7;
import android.content.Intent;
import com.bytedance.common.wschannel.client.AbsWsClientService;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS7S0200100_11 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        try {
            int i = Q3X.LIZ[((Q3Y) this.l0).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            synchronized (Q3U.LJ) {
                            }
                        }
                    } else {
                        Q3U.LIZLLL.LLLLZ(this.j2);
                    }
                } else {
                    Q3U.LIZJ.LLLLZ(this.j2);
                }
            } else {
                Q3U.LIZIZ.LLLLZ(this.j2);
            }
            Q3W q3w = (Q3W) this.l1;
            if (q3w != null) {
                q3w.onSuccess();
            }
        } catch (Throwable unused) {
            Q3W q3w2 = (Q3W) this.l1;
            if (q3w2 != null) {
                q3w2.onError();
            }
        }
    }

    public final void LIZ$1() {
        Iterator it = ((LinkedList) this.l0).iterator();
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C64353PNl c64353PNl = (C64353PNl) it.next();
            j += c64353PNl.LIZJ - c64353PNl.LIZ;
            if (c64353PNl.LJFF) {
                i++;
            }
            if (c64353PNl.LJ) {
                i2++;
            }
            if (c64353PNl.LIZLLL) {
                i3++;
            }
        }
        JSONObject jSONObject = new JSONObject();
        C64351PNj c64351PNj = (C64351PNj) this.l1;
        long j2 = this.j2;
        LinkedList linkedList = (LinkedList) this.l0;
        jSONObject.put(WM7.SCENE_SERVICE, c64351PNj.LIZ);
        jSONObject.put("duration", j2);
        jSONObject.put("block_count", linkedList.size());
        jSONObject.put("block_duration", j);
        jSONObject.put("block_count_on_frame", i);
        jSONObject.put("delay_doFrame_count", i2);
        jSONObject.put("delay_input_count", i3);
        C64351PNj c64351PNj2 = (C64351PNj) this.l1;
        synchronized (c64351PNj2) {
            LagDataCallback lagDataCallback = c64351PNj2.LJIIIIZZ;
            if (lagDataCallback != null) {
                lagDataCallback.onDataAvailable(jSONObject);
            } else {
                HandlerThreadC36423ERf.LIZJ().LJ(new ARunnableS47S0100000_11(jSONObject, 164));
            }
        }
    }

    public static final void run$0(ARunnableS7S0200100_11 aRunnableS7S0200100_11) {
        boolean LIZ;
        try {
            ((AbsWsClientService) aRunnableS7S0200100_11.l1).handleIntent((Intent) aRunnableS7S0200100_11.l0, aRunnableS7S0200100_11.j2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS7S0200100_11 aRunnableS7S0200100_11) {
        boolean LIZ;
        try {
            ((AbsWsClientService) aRunnableS7S0200100_11.l1).handleIntent((Intent) aRunnableS7S0200100_11.l0, aRunnableS7S0200100_11.j2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS7S0200100_11 aRunnableS7S0200100_11) {
        boolean LIZ;
        try {
            aRunnableS7S0200100_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS7S0200100_11 aRunnableS7S0200100_11) {
        boolean LIZ;
        try {
            aRunnableS7S0200100_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS7S0200100_11(Object obj, Object obj2, long j, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
        this.j2 = j;
    }
}
