package X;

import Y.ARunnableS19S0000000_13;
import android.app.Activity;
import com.bytedance.bpea.basics.Cert;

/* renamed from: X.UUm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C77276UUm {
    public final Activity LIZ;
    public final Cert LIZIZ;
    public InterfaceC77281UUr LIZJ = new UDN();
    public InterfaceC77281UUr LIZLLL = new C73118Smo();
    public final ARunnableS19S0000000_13 LJ = new ARunnableS19S0000000_13(1);
    public final ARunnableS19S0000000_13 LJFF = new ARunnableS19S0000000_13(1);

    public C77276UUm(Activity activity, AbstractC39330Fc6 abstractC39330Fc6) {
        this.LIZ = activity;
        this.LIZIZ = abstractC39330Fc6;
    }

    public final void LIZ(InterfaceC78910Uy2 interfaceC78910Uy2, String... strArr) {
        Activity activity = this.LIZ;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            new C78899Uxr(this.LIZ).LIZ(this.LIZ, this.LIZJ, this.LIZLLL, interfaceC78910Uy2, this.LIZIZ, this.LJ, this.LJFF, strArr);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
