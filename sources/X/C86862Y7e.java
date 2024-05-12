package X;

import Y.AfS67S0100000_15;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Y7e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86862Y7e extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C86861Y7d LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ C32265ClR LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86862Y7e(C86861Y7d c86861Y7d, long j, long j2, long j3, C32265ClR c32265ClR) {
        super(0);
        this.LJLIL = c86861Y7d;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
        this.LJLJJL = c32265ClR;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C86861Y7d c86861Y7d = this.LJLIL;
        if (c86861Y7d.LIZ == EnumC86865Y7h.IDLE) {
            long j = this.LJLILLLLZI;
            long j2 = this.LJLJI;
            long j3 = this.LJLJJI;
            C32265ClR c32265ClR = this.LJLJJL;
            long j4 = c32265ClR.LJLILLLLZI;
            int i = c32265ClR.LJLJI;
            long j5 = c32265ClR.LJLJJI;
            StringBuilder LIZJ = V10.LIZJ("doPlay roomId(", j, ") effectId(");
            C06510Nj.LIZIZ(LIZJ, j4, ") priceLevel(", i);
            LIZJ.append(')');
            C0NB.LIZIZ("GiftFeedEffectPlayViewManager", X1D.LIZIZ(LIZJ));
            if (c86861Y7d.LIZIZ != null) {
                C0NB.LJ("GiftFeedEffectPlayViewManager", "doPlay while there's existing");
                C86863Y7f c86863Y7f = c86861Y7d.LIZIZ;
                if (c86863Y7f != null) {
                    c86863Y7f.LIZ();
                }
            }
            c86861Y7d.LJFF.LIZLLL();
            c86861Y7d.LJFF.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(c86861Y7d.LJ, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS67S0100000_15(c86861Y7d, 79)));
            C86863Y7f c86863Y7f2 = new C86863Y7f(i, j, j2, j3, j4);
            c86861Y7d.LIZIZ = c86863Y7f2;
            c86863Y7f2.LJIILL = j5;
            c86863Y7f2.LJIILLIIL = C30725C4b.LIZ();
            C86863Y7f c86863Y7f3 = c86861Y7d.LIZIZ;
            if (c86863Y7f3 != null) {
                c86863Y7f3.LJIIZILJ = System.currentTimeMillis();
            }
            c86861Y7d.LIZ = EnumC86865Y7h.DOWNLOAD_MODEL;
            c86861Y7d.LJII();
        }
        return C76800UCe.LIZ;
    }
}
