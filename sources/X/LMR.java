package X;

import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LMR implements InterfaceC87283bg {
    public final InterfaceC54156LNg LJLIL;
    public final ITabStrip LJLILLLLZI;

    public LMR() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LMR)) {
            return false;
        }
        LMR lmr = (LMR) obj;
        return o.LJ(this.LJLIL, lmr.LJLIL) && o.LJ(this.LJLILLLLZI, lmr.LJLILLLLZI);
    }

    public final int hashCode() {
        InterfaceC54156LNg interfaceC54156LNg = this.LJLIL;
        int hashCode = (interfaceC54156LNg == null ? 0 : interfaceC54156LNg.hashCode()) * 31;
        ITabStrip iTabStrip = this.LJLILLLLZI;
        return hashCode + (iTabStrip != null ? iTabStrip.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MFViewPagerHierachyData(pagerAdapter=");
        LIZ.append(this.LJLIL);
        LIZ.append(", pagerTabStrip=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public LMR(InterfaceC54156LNg interfaceC54156LNg, ITabStrip iTabStrip) {
        this.LJLIL = interfaceC54156LNg;
        this.LJLILLLLZI = iTabStrip;
    }
}
