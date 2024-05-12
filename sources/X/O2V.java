package X;

import Y.ACallableS37S1100000_10;
import Y.ACallableS87S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O2V implements O3K {
    public final /* synthetic */ O2Q LIZ;
    public final /* synthetic */ InterfaceC88472Yns LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ InterfaceC88472Yns LIZLLL;

    @Override // X.O3K
    public final void LIZ(O37 o37) {
        C10K.LIZIZ(new ACallableS87S0200000_10(o37, this, 14), C10K.LJIIIIZZ, null);
    }

    @Override // X.O3K
    public final void onFailed(String errorMessage) {
        o.LJIIJ(errorMessage, "errorMessage");
        C10K.LIZIZ(new ACallableS37S1100000_10(this, errorMessage, 8), C10K.LJIIIIZZ, null);
    }

    public O2V(O2Q o2q, InterfaceC88472Yns interfaceC88472Yns, String str, InterfaceC88472Yns interfaceC88472Yns2) {
        this.LIZ = o2q;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = str;
        this.LIZLLL = interfaceC88472Yns2;
    }
}
