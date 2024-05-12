package Y;

import X.AbstractC41437GOb;
import X.C1E5;
import X.C41438GOc;
import X.C41442GOg;
import X.C81392Vwy;
import X.GUQ;
import X.GUS;
import X.LPJ;
import X.W5C;
import X.W5N;
import X.W5O;
import X.W8A;
import X.W8E;
import X.X1D;
import android.graphics.Bitmap;
import android.net.Uri;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS95S0101000_7;

/* loaded from: classes8.dex */
public class ARunnableS8S0301000_7 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public final void LIZ$0() {
        GUS gus = (GUS) this.l0;
        AbstractC41437GOb abstractC41437GOb = ((GUQ) this.l1).LJLJJL.LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("progress:");
        LIZ.append(this.i3);
        LIZ.append(" on no running");
        if (!gus.LIZ(abstractC41437GOb, X1D.LIZIZ(LIZ)) || (((GUQ) this.l1).LJLJJL.LIZLLL instanceof C41438GOc)) {
            return;
        }
        ((GUQ) this.l1).LJLJJL.LIZ(new C41442GOg(this.i3, this.l2));
        ((GUQ) this.l1).LIZLLL(new AqS95S0101000_7(this.i3, this.l2, 16));
    }

    public static final void run$0(ARunnableS8S0301000_7 aRunnableS8S0301000_7) {
        boolean LIZ;
        try {
            aRunnableS8S0301000_7.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$1(Y.ARunnableS8S0301000_7 r31) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS8S0301000_7.run$1(Y.ARunnableS8S0301000_7):void");
    }

    public static final void run$2(ARunnableS8S0301000_7 aRunnableS8S0301000_7) {
        switch (aRunnableS8S0301000_7.i3) {
            case 0:
                Object obj = aRunnableS8S0301000_7.l0;
                Uri uri = (Uri) aRunnableS8S0301000_7.l1;
                Bitmap bitmap = (Bitmap) aRunnableS8S0301000_7.l2;
                obj.getClass();
                W8E.LJII().LIZJ().LIZJ(W5N.LJI().LIZIZ(W5O.LIZ(uri), null), C81392Vwy.LJIIL(new W5C(bitmap, C1E5.LJFF(), W8A.LIZLLL, 0)));
                return;
            default:
                ((LPJ) aRunnableS8S0301000_7.l0).LIZJ((Aweme) aRunnableS8S0301000_7.l1, (String) aRunnableS8S0301000_7.l2);
                return;
        }
    }

    public ARunnableS8S0301000_7(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
