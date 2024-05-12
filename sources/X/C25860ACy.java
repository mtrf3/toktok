package X;

import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.ACy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C25860ACy extends AG6<C25859ACx> implements InterfaceC25852ACq {
    public final C25859ACx LJLJJI;

    public C25860ACy() {
        this(null);
    }

    @Override // X.AG6
    /* renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public C25859ACx LJIIIIZZ() {
        C25859ACx c25859ACx = this.LJLJJI;
        if (c25859ACx != null) {
            return c25859ACx;
        }
        throw new RuntimeException("pls pass item or extends the DisclosureUnit");
    }

    public C25860ACy(C25859ACx c25859ACx) {
        this.LJLJJI = c25859ACx;
    }

    @Override // X.AG6
    public final void LJIIIZ(boolean z) {
        LJIIJ(new AqS47S0110000_4(this, z, 9));
    }

    public final void LJIIL(boolean z) {
        LJIIJ(new AqS47S0110000_4(this, z, 8));
    }

    public final void LJIILIIL(String label) {
        o.LJIIIZ(label, "label");
        LJIIJ(new AqS58S1100000_4(this, label, 24));
    }

    @Override // X.InterfaceC25852ACq
    public final void LIZJ(Boolean bool, Boolean bool2) {
        LJIIJ(new AqS135S0200000_4(bool, bool2, 158));
    }
}
