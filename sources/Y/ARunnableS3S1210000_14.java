package Y;

import X.C79355VCl;
import X.EnumC84152X0y;
import X.ORZ;
import X.VIW;
import com.ss.android.ttvecamera.TECameraCapture;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class ARunnableS3S1210000_14 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final void run$0(ARunnableS3S1210000_14 aRunnableS3S1210000_14) {
        boolean LIZ;
        try {
            ((EnumC84152X0y) aRunnableS3S1210000_14.l2).setWhileBalance((TECameraCapture) aRunnableS3S1210000_14.l1, aRunnableS3S1210000_14.z3, aRunnableS3S1210000_14.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S1210000_14 aRunnableS3S1210000_14) {
        boolean LIZ;
        try {
            C79355VCl c79355VCl = (C79355VCl) aRunnableS3S1210000_14.l2;
            c79355VCl.LJIIIZ = false;
            c79355VCl.LIZ((boolean[]) aRunnableS3S1210000_14.l1, aRunnableS3S1210000_14.s0, aRunnableS3S1210000_14.z3);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS3S1210000_14 aRunnableS3S1210000_14) {
        boolean LIZ;
        try {
            if (aRunnableS3S1210000_14.z3) {
                ((VIW) aRunnableS3S1210000_14.l1).LJII = ORZ.LLJILJILJ((List) aRunnableS3S1210000_14.l2);
            } else {
                ((ArrayList) ((VIW) aRunnableS3S1210000_14.l1).LJII).addAll((List) aRunnableS3S1210000_14.l2);
            }
            VIW viw = (VIW) aRunnableS3S1210000_14.l1;
            String str = aRunnableS3S1210000_14.s0;
            if (str == null) {
                str = "";
            }
            viw.LJFF = str;
            VIW.LJIIJ(viw);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S1210000_14(Object obj, Object obj2, boolean z, String str, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l1 = obj2;
        this.z3 = z;
        this.s0 = str;
    }
}
