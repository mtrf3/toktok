package X;

import android.graphics.Bitmap;
import com.bytedance.bpea.basics.Cert;

/* loaded from: classes6.dex */
public final class C3H implements C3I {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LIZIZ;
    public final /* synthetic */ C3G LIZJ;
    public final /* synthetic */ Cert LIZLLL;

    @Override // X.C3I
    public final void onFailed() {
        this.LIZJ.LIZJ(null, this.LIZLLL);
    }

    @Override // X.C3I
    public final void LIZ(Bitmap bitmap) {
        if (!this.LIZ) {
            InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LIZIZ;
            if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
                C3G c3g = this.LIZJ;
                c3g.getClass();
                c3g.LIZJ(C3G.LIZ(bitmap), this.LIZLLL);
                return;
            }
            return;
        }
        C3G c3g2 = this.LIZJ;
        c3g2.getClass();
        c3g2.LIZJ(C3G.LIZ(bitmap), this.LIZLLL);
    }

    public C3H(boolean z, InterfaceC65784Pro interfaceC65784Pro, C3G c3g, AbstractC39330Fc6 abstractC39330Fc6) {
        this.LIZ = z;
        this.LIZIZ = interfaceC65784Pro;
        this.LIZJ = c3g;
        this.LIZLLL = abstractC39330Fc6;
    }
}
