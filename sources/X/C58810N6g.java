package X;

import Y.ARunnableS46S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.N6g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58810N6g extends N6Q<ViewGroup> {
    public ViewGroup LJLJJLL;
    public ViewGroup LJLJL;
    public final Integer LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public InterfaceC58799N5v LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;

    @Override // X.N6Q, X.JK9
    public final void onViewDetachedFromWindow() {
        LJI(false);
    }

    public final void LJ() {
        ISearchAdEventLogger iSearchAdEventLogger = this.LJLIL.LJ;
        C58777N4z.LIZ.getClass();
        iSearchAdEventLogger.LJIILIIL(C58777N4z.LJIJJLI);
        LJI(false);
    }

    public final void LJFF() {
        String str;
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd.getType();
        } else {
            str = null;
        }
        if (o.LJ(str, "web")) {
            if (O5Y.LJJJJI(this.LJLILLLLZI)) {
                ISearchAdEventLogger iSearchAdEventLogger = this.LJLIL.LJ;
                C58777N4z.LIZ.getClass();
                iSearchAdEventLogger.LJIILIIL(C58777N4z.LJII);
                return;
            } else {
                ISearchAdEventLogger iSearchAdEventLogger2 = this.LJLIL.LJ;
                C58777N4z.LIZ.getClass();
                iSearchAdEventLogger2.LJIILIIL(C58777N4z.LJFF);
                return;
            }
        }
        if (!o.LJ(str, "app")) {
            return;
        }
        ISearchAdEventLogger iSearchAdEventLogger3 = this.LJLIL.LJ;
        C58777N4z.LIZ.getClass();
        iSearchAdEventLogger3.LJIILIIL(C58777N4z.LJI);
    }

    @Override // X.N6Q, X.JK9
    public final void LLLLZI() {
        EnumC58812N6i enumC58812N6i;
        ViewGroup viewGroup;
        EnumC58812N6i enumC58812N6i2;
        if (O5Y.LJIILL(this.LJLILLLLZI)) {
            enumC58812N6i = EnumC58812N6i.FOLLOW;
        } else {
            enumC58812N6i = EnumC58812N6i.NORMAL;
        }
        int i = C58811N6h.LIZ[enumC58812N6i.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LJLLILLLL = R.layout.c2h;
                    this.LJLLJ = R.id.i0v;
                }
            } else {
                this.LJLLILLLL = R.layout.avo;
                this.LJLLJ = R.id.djq;
            }
        } else {
            this.LJLLILLLL = R.layout.ceq;
            this.LJLLJ = R.id.jdu;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJLJJI), this.LJLLILLLL, this.LJLIL.LIZIZ, true);
        ViewGroup viewGroup2 = null;
        if (LLLLIILL instanceof ViewGroup) {
            viewGroup = (ViewGroup) LLLLIILL;
        } else {
            viewGroup = null;
        }
        this.LJLJL = viewGroup;
        if (viewGroup != null) {
            viewGroup2 = (ViewGroup) viewGroup.findViewById(this.LJLLJ);
        }
        this.LJLJJLL = viewGroup2;
        ViewGroup viewGroup3 = this.LJLJL;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(8);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("maskType = ");
        if (O5Y.LJIILL(this.LJLILLLLZI)) {
            enumC58812N6i2 = EnumC58812N6i.FOLLOW;
        } else {
            enumC58812N6i2 = EnumC58812N6i.NORMAL;
        }
        LIZ.append(enumC58812N6i2);
        LIZ.append(" add mask componentView = ");
        LIZ.append(this.LJLJJLL);
        N8M.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.N6Q
    public final /* bridge */ /* synthetic */ ViewGroup LIZ() {
        return this.LJLJJLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58810N6g(C58809N6f param) {
        super(param);
        int showMaskTimes;
        o.LJIIIZ(param, "param");
        AwemeSearchAdModel awemeSearchAdModel = this.LJLJI;
        this.LJLJLJ = (awemeSearchAdModel == null || (showMaskTimes = awemeSearchAdModel.getShowMaskTimes()) == null) ? 2 : showMaskTimes;
    }

    @Override // X.N6Q
    public final void LIZIZ(C58798N5u c58798N5u) {
        this.LJLLI = c58798N5u;
        N6J.LIZIZ(c58798N5u, this.LJLJJL, C113554cx.LJJL(new OSZ(N65.LIZ, new AqS160S0100000_10(this, 626)), new OSZ(N64.LIZ, new AqS160S0100000_10(this, 627)), new OSZ(N63.LIZ, new AqS157S0200000_10(this, c58798N5u, 54))));
    }

    @Override // X.N6Q
    public final boolean LIZJ(C58809N6f param) {
        o.LJIIIZ(param, "param");
        Aweme aweme = param.LJI.getAweme();
        if (aweme == null) {
            return true;
        }
        if (aweme.isAd() && !O5Y.LJJIJLIJ(aweme) && (O5Y.LJJIJIIJI(aweme) || O5Y.LJIILL(aweme))) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.LJLJL;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            this.LJLL = true;
            this.LJLJLLL = true;
            N6K n6k = this.LJLIL.LIZLLL;
            if (n6k != null) {
                n6k.LIZJ(N6F.MASK_SHOW);
                n6k.LIZ(N6I.L((N6I) n6k.LIZIZ().getValue(), true, 0, false, 0, 126));
                return;
            }
            return;
        }
        N6K n6k2 = this.LJLIL.LIZLLL;
        if (n6k2 != null) {
            n6k2.LIZJ(N6F.MASK_HIDE);
            n6k2.LIZ(N6I.L((N6I) n6k2.LIZIZ().getValue(), false, 0, false, 0, 126));
        }
        this.LJLL = false;
    }

    public final void LJI(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hideMaskLayout isMaskShowing=");
        LIZ.append(this.LJLL);
        LIZ.append("  needDelay=");
        LIZ.append(z);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        if (!this.LJLL) {
            return;
        }
        if (z) {
            C58854N7y.LIZ.postDelayed(new ARunnableS46S0100000_10(this, 221), 500L);
        } else {
            ViewGroup viewGroup = this.LJLJL;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            LIZLLL(false);
        }
    }
}
