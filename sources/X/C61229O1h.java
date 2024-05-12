package X;

import Y.ACallableS37S1100000_10;
import Y.ACallableS87S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.O1h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61229O1h implements O3J {
    public final /* synthetic */ C61228O1g LIZ;
    public final /* synthetic */ InterfaceC88472Yns LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ O1L LIZLLL;
    public final /* synthetic */ InterfaceC88472Yns LJ;

    @Override // X.O3J
    public final void LIZ(O24 o24) {
        C10K.LIZIZ(new ACallableS87S0200000_10(o24, this, 4), C10K.LJIIIIZZ, null);
    }

    @Override // X.O3J
    public final void onFailed(String errorMessage) {
        o.LJIIJ(errorMessage, "errorMessage");
        C10K.LIZIZ(new ACallableS37S1100000_10(this, errorMessage, 4), C10K.LJIIIIZZ, null);
    }

    public C61229O1h(C61228O1g c61228O1g, InterfaceC88472Yns interfaceC88472Yns, String str, O1L o1l, InterfaceC88472Yns interfaceC88472Yns2) {
        this.LIZ = c61228O1g;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = str;
        this.LIZLLL = o1l;
        this.LJ = interfaceC88472Yns2;
    }
}
