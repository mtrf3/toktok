package X;

import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AEG extends AG6<AEB> implements InterfaceC25852ACq {
    public final AEB LJLJJI;

    public AEG() {
        this(null);
    }

    @Override // X.AG6
    /* renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public AEB LJIIIIZZ() {
        AEB aeb = this.LJLJJI;
        if (aeb != null) {
            return aeb;
        }
        throw new RuntimeException("pls pass item or extends the DividerUnit");
    }

    public AEG(AEB aeb) {
        this.LJLJJI = aeb;
    }

    @Override // X.AG6
    public final void LJIIIZ(boolean z) {
        LJIIJ(new AqS47S0110000_4(this, z, 12));
    }

    public final void LJIIL(String str) {
        o.LJIIIZ(str, "str");
        LJIIJ(new AqS58S1100000_4(this, str, 25));
    }

    @Override // X.InterfaceC25852ACq
    public final void LIZJ(Boolean bool, Boolean bool2) {
        LJIIJ(new AqS135S0200000_4(bool, bool2, 159));
    }
}
