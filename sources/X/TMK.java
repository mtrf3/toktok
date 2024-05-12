package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TMK implements InterfaceC142225i6 {
    public final /* synthetic */ InterfaceC148845sm LIZ;
    public final /* synthetic */ InterfaceC122704ri LIZIZ;

    @Override // X.InterfaceC142225i6
    public final InterfaceC122704ri LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC142225i6
    public final float LIZ(FilterBean filterBean) {
        o.LJIIIZ(filterBean, "filterBean");
        return TML.LJFF(filterBean, this.LIZ.LIZ(filterBean, this.LIZIZ), this.LIZIZ);
    }

    @Override // X.InterfaceC142225i6
    public final float LIZLLL(FilterBean filterBean) {
        return TML.LIZIZ(filterBean, this.LIZIZ);
    }

    public TMK(InterfaceC148845sm interfaceC148845sm, InterfaceC122704ri interfaceC122704ri) {
        this.LIZ = interfaceC148845sm;
        this.LIZIZ = interfaceC122704ri;
    }

    @Override // X.InterfaceC142225i6
    public final void LIZIZ(FilterBean filterBean, float f) {
        o.LJIIIZ(filterBean, "filterBean");
        this.LIZ.LIZIZ(filterBean, TML.LIZLLL(filterBean, f, this.LIZIZ));
    }
}
