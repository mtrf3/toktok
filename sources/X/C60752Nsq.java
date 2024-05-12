package X;

import Y.ARunnableS46S0100000_10;
import kotlin.jvm.internal.AqS114S0300000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nsq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60752Nsq extends AbstractC65781Prl implements InterfaceC88472Yns<C61295O3v, C76800UCe> {
    public final /* synthetic */ C60737Nsb LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60752Nsq(C60737Nsb c60737Nsb, boolean z, AqS114S0300000_10 aqS114S0300000_10) {
        super(1);
        this.LJLIL = c60737Nsb;
        this.LJLILLLLZI = z;
        this.LJLJI = aqS114S0300000_10;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C61295O3v c61295O3v) {
        C61295O3v it = c61295O3v;
        o.LJIIJ(it, "it");
        C60756Nsu LIZJ = C60757Nsv.LIZJ(this.LJLIL, null);
        if (LIZJ != null) {
            LIZJ.LIZIZ(it);
        }
        if (this.LJLILLLLZI) {
            C61325O4z.LJFF(new ARunnableS46S0100000_10(this, 168));
        } else {
            C61325O4z.LIZLLL(new ARunnableS46S0100000_10(this, 169));
        }
        return C76800UCe.LIZ;
    }
}
