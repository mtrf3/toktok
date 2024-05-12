package X;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: X.QdP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67439QdP extends AbstractC67451Qdb {
    public C4G1<Executor> LJLIL = C67427QdD.LIZ(C67463Qdn.LIZ);
    public C67448QdY LJLILLLLZI;
    public C4G1 LJLJI;
    public C4G1<C67379QcR> LJLJJI;
    public C4G1<C67350Qby> LJLJJL;

    public C67439QdP(Context context) {
        if (context != null) {
            C67448QdY c67448QdY = new C67448QdY(context);
            this.LJLILLLLZI = c67448QdY;
            this.LJLJI = C67427QdD.LIZ(new C67446QdW(c67448QdY, new C67443QdT(c67448QdY)));
            C67448QdY c67448QdY2 = this.LJLILLLLZI;
            C4G1<C67379QcR> LIZ = C67427QdD.LIZ(new C67437QdN(new C67447QdX(c67448QdY2), new C67445QdV(c67448QdY2)));
            this.LJLJJI = LIZ;
            C67426QdC c67426QdC = new C67426QdC();
            C67448QdY c67448QdY3 = this.LJLILLLLZI;
            C67441QdR c67441QdR = new C67441QdR(c67448QdY3, LIZ, c67426QdC);
            C4G1<Executor> c4g1 = this.LJLIL;
            C4G1 c4g12 = this.LJLJI;
            this.LJLJJL = C67427QdD.LIZ(new C67438QdO(new C67442QdS(c4g1, c4g12, c67441QdR, LIZ, LIZ), new C67440QdQ(c67448QdY3, c4g12, LIZ, c67441QdR, c4g1, LIZ, LIZ), new C67444QdU(c4g1, LIZ, c67441QdR, LIZ)));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }
}
