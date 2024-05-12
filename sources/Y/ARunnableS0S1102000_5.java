package Y;

import X.C0YJ;
import X.C7N;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public class ARunnableS0S1102000_5 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
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
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            r8 = this;
            int r1 = r8.i2
            r0 = 35
            if (r1 != r0) goto L40
            int r1 = r8.i3
            r0 = 1
            if (r1 != r0) goto L40
            r4 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = r8.s0     // Catch: java.lang.Exception -> L2b
            r1.<init>(r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "cost_time"
            double r6 = r1.optDouble(r0, r4)     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "bright_before"
            double r2 = r1.optDouble(r0, r4)     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = "bright_after"
            double r4 = r1.optDouble(r0, r4)     // Catch: java.lang.Exception -> L31
            goto L35
        L27:
            r0 = move-exception
            r2 = 0
            goto L32
        L2b:
            r0 = move-exception
            r6 = 0
            r2 = 0
            goto L32
        L31:
            r0 = move-exception
        L32:
            X.C0NB.LJII(r0)
        L35:
            java.lang.Object r0 = r8.l1
            X.CKO r0 = (X.CKO) r0
            X.0s7 r1 = r0.LJII
            if (r1 == 0) goto L40
            r1.Wg(r2, r4, r6)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S1102000_5.LIZ$0():void");
    }

    public static final void run$0(ARunnableS0S1102000_5 aRunnableS0S1102000_5) {
        boolean LIZ;
        try {
            aRunnableS0S1102000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1102000_5 aRunnableS0S1102000_5) {
        boolean LIZ;
        try {
            C7N.LJII().showEffectTextInputDialog(((TryModeBroadcastFragment) aRunnableS0S1102000_5.l1).LJIIL(), new C0YJ(aRunnableS0S1102000_5.i2, aRunnableS0S1102000_5.i3, aRunnableS0S1102000_5.s0), new AqS171S0100000_5((TryModeBroadcastFragment) aRunnableS0S1102000_5.l1, 247));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S1102000_5 aRunnableS0S1102000_5) {
        boolean LIZ;
        try {
            C7N.LJII().showEffectTextInputDialog(((LiveBroadcastFragment) aRunnableS0S1102000_5.l1).LJIIL(), new C0YJ(aRunnableS0S1102000_5.i2, aRunnableS0S1102000_5.i3, aRunnableS0S1102000_5.s0), new AqS171S0100000_5((LiveBroadcastFragment) aRunnableS0S1102000_5.l1, LiveCoverMinSizeSetting.DEFAULT));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1102000_5(int i, int i2, String str, Object obj, int i3) {
        this.$t = i3;
        this.i2 = i;
        this.i3 = i2;
        this.s0 = str;
        this.l1 = obj;
    }
}
