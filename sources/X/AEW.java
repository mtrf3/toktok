package X;

import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS9S0010000_4;

/* loaded from: classes5.dex */
public class AEW extends AG6<AEL> implements InterfaceC25852ACq {
    public final AEL LJLJJI;

    @Override // X.AG6
    /* renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public AEL LJIIIIZZ() {
        AEL ael = this.LJLJJI;
        if (ael != null) {
            return ael;
        }
        throw new RuntimeException("pls pass item or extends the LabelUnit");
    }

    public AEW(AEL ael) {
        this.LJLJJI = ael;
    }

    @Override // X.AG6
    public final void LJIIIZ(boolean z) {
        LJIIJ(new AqS9S0010000_4(z, 27));
    }

    @Override // X.InterfaceC25852ACq
    public final void LIZJ(Boolean bool, Boolean bool2) {
        LJIIJ(new AqS135S0200000_4(bool, bool2, 157));
    }
}
