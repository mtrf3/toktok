package Y;

import X.C63922P6w;
import X.C84134X0g;
import X.C87367YQp;
import X.EnumC84152X0y;
import X.X1D;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttvecamera.TECameraCapture;

/* loaded from: classes12.dex */
public class ARunnableS1S0400100_11 implements Runnable {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Push open task cost: ");
        LIZ.append(System.currentTimeMillis() - this.j4);
        C63922P6w.LIZ("TECameraServer", X1D.LIZIZ(LIZ));
        C87367YQp.LIZ("te_record_camera_push_open_task_time", System.currentTimeMillis() - this.j4);
        ((EnumC84152X0y) this.l3).open((TECameraCapture) this.l0, (C84134X0g) this.l1, (Cert) this.l2);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Camera open cost: ");
        LIZ2.append(System.currentTimeMillis() - this.j4);
        LIZ2.append("ms");
        C63922P6w.LIZLLL("TECameraServer", X1D.LIZIZ(LIZ2));
    }

    public static final void run$0(ARunnableS1S0400100_11 aRunnableS1S0400100_11) {
        boolean LIZ;
        try {
            aRunnableS1S0400100_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0123 A[Catch: JSONException -> 0x012d, TRY_LEAVE, TryCatch #1 {JSONException -> 0x012d, blocks: (B:3:0x0017, B:5:0x0027, B:7:0x0035, B:9:0x003c, B:10:0x0040, B:12:0x0046, B:15:0x004e, B:18:0x0057, B:21:0x0063, B:27:0x0065, B:29:0x007e, B:30:0x0084, B:39:0x00a5, B:41:0x00a9, B:42:0x00b0, B:44:0x00d0, B:45:0x00de, B:49:0x00fc, B:51:0x0123, B:56:0x00ee, B:58:0x00f6, B:60:0x002d), top: B:2:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$1(Y.ARunnableS1S0400100_11 r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S0400100_11.run$1(Y.ARunnableS1S0400100_11):void");
    }

    public ARunnableS1S0400100_11(Object obj, long j, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj;
        this.j4 = j;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj4;
    }
}
