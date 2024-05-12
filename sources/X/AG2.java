package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AG2 extends AG6<AEP> implements InterfaceC25852ACq {
    public final AEP LJLJJI;

    @Override // X.AG6
    public final AEP LJIIIIZZ() {
        AEP aep = this.LJLJJI;
        if (aep != null) {
            return aep;
        }
        throw new RuntimeException("pls pass item or extends the EventUnit");
    }

    public AG2(AEP aep) {
        this.LJLJJI = aep;
    }

    @Override // X.AG6
    public final void LJIIIZ(boolean z) {
        LJIIJ(new AqS47S0110000_4(this, z, 14));
    }

    public final void LJIIJJI(Drawable drawable) {
        LJIIJ(new AqS135S0200000_4(this, drawable, 160));
    }

    public final void LJIIL(String str) {
        LJIIJ(new AqS58S1100000_4(this, str, 27));
    }

    public final void LJIILIIL(boolean z) {
        LJIIJ(new AqS47S0110000_4(this, z, 13));
    }

    public final void LJIILJJIL(String title) {
        o.LJIIIZ(title, "title");
        LJIIJ(new AqS58S1100000_4(this, title, 28));
    }

    @Override // X.InterfaceC25852ACq
    public final void LIZJ(Boolean bool, Boolean bool2) {
        LJIIJ(new AqS135S0200000_4(bool, bool2, 161));
    }
}
