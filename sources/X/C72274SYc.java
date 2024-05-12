package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.SYc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72274SYc implements InterfaceC222798ol {
    public final C0CM LIZ;
    public final SYM LIZIZ;

    @Override // X.InterfaceC222788ok
    public final C72808Sho<InterfaceC57784Mm4> getState() {
        C72808Sho<InterfaceC57784Mm4> LJZ = this.LIZIZ.LJZ();
        if (LJZ != null) {
            return LJZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC222798ol
    public final void LIZ(InterfaceC55235Lm3 vScope) {
        o.LJIIIZ(vScope, "vScope");
        View childAt = this.LIZ.getChildAt(0);
        o.LJII(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        C30591Hz.LJJIII((RecyclerView) childAt, vScope);
    }

    @Override // X.InterfaceC222788ok
    public final void LIZIZ(C220188kY configBuilder) {
        o.LJIIIZ(configBuilder, "configBuilder");
        this.LIZIZ.LL(C72275SYd.LIZ(configBuilder), SYU.Direct);
        int i = configBuilder.LIZ;
        if (i > 0) {
            this.LIZ.setOffscreenPageLimit(i);
        }
    }

    @Override // X.InterfaceC222788ok
    public final void LIZJ(KEG keg) {
        this.LIZIZ.registerAdapterDataObserver(keg);
    }

    @Override // X.InterfaceC222788ok
    public final void LIZLLL(C222888ou c222888ou) {
        C72808Sho<InterfaceC57784Mm4> LJZ = this.LIZIZ.LJZ();
        if (LJZ != null) {
            this.LIZIZ.LJZI(new C72277SYf(C72275SYd.LIZ(c222888ou.LIZ), c222888ou), null, LJZ);
        }
        int i = c222888ou.LIZ.LIZ;
        if (i > 0) {
            this.LIZ.setOffscreenPageLimit(i);
        }
    }

    @Override // X.InterfaceC222798ol
    public final void LJFF(Class<? extends PowerCell<?>>... clsArr) {
        this.LIZIZ.LJZL((Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    public C72274SYc(C0CM viewPager2, SYM viewAdapter) {
        o.LJIIIZ(viewPager2, "viewPager2");
        o.LJIIIZ(viewAdapter, "viewAdapter");
        this.LIZ = viewPager2;
        this.LIZIZ = viewAdapter;
    }
}
