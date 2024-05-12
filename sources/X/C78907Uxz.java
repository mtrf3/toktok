package X;

import Y.ARunnableS19S0000000_13;
import android.app.Activity;
import com.bytedance.bpea.basics.Cert;

/* renamed from: X.Uxz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78907Uxz {
    public final Activity LIZ;
    public final Cert LIZIZ;
    public final String[] LIZJ;
    public String[] LIZLLL = new String[0];
    public final InterfaceC78910Uy2 LJ;
    public final InterfaceC77281UUr LJFF;
    public final Runnable LJI;
    public final Runnable LJII;

    public final void LIZ() {
        this.LJ.LIZIZ(this.LIZJ);
        C78900Uxs.LIZ.LIZLLL(this.LIZLLL);
    }

    public final void LIZIZ(boolean z) {
        this.LJ.LIZLLL(this.LIZJ);
        C78908Uy0 c78908Uy0 = C78900Uxs.LIZ;
        c78908Uy0.LJ(this.LIZJ);
        if (z) {
            this.LJII.run();
            c78908Uy0.LIZIZ(this.LIZLLL);
        }
    }

    public C78907Uxz(Activity activity, InterfaceC77281UUr interfaceC77281UUr, InterfaceC77281UUr interfaceC77281UUr2, InterfaceC78910Uy2 interfaceC78910Uy2, Cert cert, ARunnableS19S0000000_13 aRunnableS19S0000000_13, ARunnableS19S0000000_13 aRunnableS19S0000000_132, String[] strArr) {
        this.LIZ = activity;
        this.LIZIZ = cert;
        this.LIZJ = strArr;
        this.LJI = aRunnableS19S0000000_13;
        this.LJII = aRunnableS19S0000000_132;
        this.LJ = interfaceC78910Uy2;
        this.LJFF = interfaceC77281UUr2;
    }
}
