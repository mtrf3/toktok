package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WUB implements InterfaceC142225i6 {
    public final /* synthetic */ WUA LIZ;

    @Override // X.InterfaceC142225i6
    public final void LIZIZ(FilterBean filterBean, float f) {
        o.LJIIIZ(filterBean, "filterBean");
    }

    @Override // X.InterfaceC142225i6
    public final float LIZLLL(FilterBean filterBean) {
        return 0.0f;
    }

    @Override // X.InterfaceC142225i6
    public final InterfaceC122704ri LIZJ() {
        return new WUC();
    }

    public WUB(WUA wua) {
        this.LIZ = wua;
    }

    @Override // X.InterfaceC142225i6
    public final float LIZ(FilterBean filterBean) {
        Float apply;
        o.LJIIIZ(filterBean, "filterBean");
        InterfaceC65644PpY<FilterBean, Float> interfaceC65644PpY = this.LIZ.LIZLLL;
        if (interfaceC65644PpY != null && (apply = interfaceC65644PpY.apply(filterBean)) != null) {
            return apply.floatValue();
        }
        return 0.0f;
    }
}
