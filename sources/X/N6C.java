package X;

import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;

/* loaded from: classes11.dex */
public final class N6C extends C58797N5t implements JPL {
    public final N6M LJLJL;
    public final String LJLJLJ;
    public final C58824N6u LJLJLLL;
    public N6B LJLL;
    public final SearchAdEventLogger LJLLI;
    public final C58809N6f LJLLILLLL;
    public N6R LJLLJ;
    public N6S LJLLL;
    public N6E LJLLLL;
    public InterfaceC55057LjB LJLLLLLL;

    @Override // X.JPL
    public final void GA() {
    }

    @Override // X.JK4
    public final void G5() {
        N6E n6e = this.LJLLLL;
        if (n6e != N6E.BOTTOM_CTA && n6e != N6E.MASK_CTA) {
            SearchAdEventLogger searchAdEventLogger = this.LJLLI;
            C58777N4z.LIZ.getClass();
            searchAdEventLogger.LJ(C58777N4z.LJ, new AqS176S0100000_10(this, 96));
            this.LJLLLL = N6E.VIDEO;
            this.LJLJJI.LJLJJL = false;
        }
    }

    @Override // X.C58797N5t, X.JGZ
    public final void LIZJ() {
        int i;
        Integer num;
        String str;
        super.LIZJ();
        N6E n6e = this.LJLLLL;
        if (n6e == null) {
            i = -1;
        } else {
            i = N6H.LIZ[n6e.ordinal()];
        }
        Integer num2 = null;
        if (i != 1) {
            if (i != 2) {
                num = null;
            } else {
                num = 54;
            }
        } else {
            num = 53;
        }
        this.LJLJJL = num;
        this.LJLLLL = null;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("beforeEnterDetailPage cardClickType = ");
        N6E n6e2 = this.LJLLLL;
        if (n6e2 != null) {
            str = n6e2.name();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" transformOpenClickType = ");
        LIZ.append(this.LJLJJL);
        LIZ.append("  adPlayTimes = ");
        InterfaceC58799N5v interfaceC58799N5v = this.LJLJJLL;
        if (interfaceC58799N5v != null) {
            num2 = Integer.valueOf(interfaceC58799N5v.d0());
        }
        LIZ.append(num2);
        N8M.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.C58797N5t, X.JK9
    public final void onViewAttachedToWindow() {
        EnumC58785N5h enumC58785N5h;
        C58786N5i LIZIZ;
        Aweme aweme;
        C58786N5i LIZIZ2;
        super.onViewAttachedToWindow();
        InterfaceC49504Jbo interfaceC49504Jbo = this.LJLILLLLZI;
        if (interfaceC49504Jbo != null && (LIZIZ2 = interfaceC49504Jbo.LIZIZ()) != null) {
            enumC58785N5h = LIZIZ2.LIZ(this.LJLJL.getAweme());
        } else {
            enumC58785N5h = null;
        }
        if (enumC58785N5h == EnumC58785N5h.NOT_TRACK || ((aweme = this.LJLJL.getAweme()) != null && O5Y.LJJJLZIJ(aweme))) {
            N6J.LJFF(this.LJLLI, this.LJLJL.getAweme(), this.LJLJL.getEnterFrom());
            InterfaceC49504Jbo interfaceC49504Jbo2 = this.LJLILLLLZI;
            if (interfaceC49504Jbo2 != null && (LIZIZ = interfaceC49504Jbo2.LIZIZ()) != null) {
                LIZIZ.LIZIZ(this.LJLJL.getAweme(), EnumC58785N5h.HAS_TRACKED_IN_RESULT_PAGE);
            }
        }
        if (!CommerceSearchAdConfigSetting.LIZ().disableFpsMonitorForSearchAd) {
            if (this.LJLLLLLL == null) {
                try {
                    this.LJLLLLLL = C40443Fu3.LIZ("search_precise_ad");
                } catch (Exception unused) {
                }
            }
            InterfaceC55057LjB interfaceC55057LjB = this.LJLLLLLL;
            if (interfaceC55057LjB != null) {
                interfaceC55057LjB.start();
            }
        }
    }

    @Override // X.C58797N5t, X.JK9
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        InterfaceC55057LjB interfaceC55057LjB = this.LJLLLLLL;
        if (interfaceC55057LjB != null) {
            interfaceC55057LjB.stop();
        }
        C58824N6u c58824N6u = this.LJLJLLL;
        if (c58824N6u != null) {
            N6J.LIZLLL(c58824N6u);
        }
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ InterfaceC58801N5x L9() {
        return this.LJLJL;
    }

    @Override // X.C58797N5t
    public final /* bridge */ /* synthetic */ InterfaceC58801N5x LJ() {
        return this.LJLJL;
    }

    @Override // X.C58797N5t
    public final N6K LJFF() {
        return this.LJLJLLL;
    }

    @Override // X.C58797N5t
    public final String LJI() {
        return this.LJLJLJ;
    }

    @Override // X.C58797N5t, X.JK9
    public final void LLLLZI() {
        super.LLLLZI();
    }

    public N6C(JPR jpr) {
        super(jpr);
        C58824N6u c58824N6u;
        this.LJLJL = jpr;
        this.LJLJLJ = " PreciseAdModule";
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(jpr.getContext());
        if (LJJIFFI != null) {
            c58824N6u = new C58824N6u(LJJIFFI);
        } else {
            c58824N6u = null;
        }
        this.LJLJLLL = c58824N6u;
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(new Object[]{jpr.getAweme()});
        this.LJLLI = searchAdEventLogger;
        this.LJLLILLLL = new C58809N6f(jpr.LJI(), null, N6V.PRECISE_AD, c58824N6u, searchAdEventLogger, this.LJLJJI, jpr);
    }

    @Override // X.C58797N5t, X.JGZ
    public final void LIZIZ(String str) {
        super.LIZIZ(str);
    }

    @Override // X.JK4
    public final void u50(JK1 jk1) {
        ViewGroup viewGroup;
        this.LJLL = jk1;
        C58809N6f c58809N6f = this.LJLLILLLL;
        N6B n6b = this.LJLL;
        ViewGroup viewGroup2 = null;
        if (n6b != null) {
            viewGroup = n6b.LJFF();
        } else {
            viewGroup = null;
        }
        this.LJLLJ = new N6R(C58809N6f.LIZ(c58809N6f, viewGroup));
        C58809N6f c58809N6f2 = this.LJLLILLLL;
        N6B n6b2 = this.LJLL;
        if (n6b2 != null) {
            viewGroup2 = n6b2.LIZLLL();
        }
        this.LJLLL = new N6S(C58809N6f.LIZ(c58809N6f2, viewGroup2));
        List<N6P> list = this.LJLJI;
        N6R n6r = this.LJLLJ;
        if (n6r != null) {
            ((ArrayList) list).add(n6r);
        }
        N6S n6s = this.LJLLL;
        if (n6s != null) {
            ((ArrayList) list).add(n6s);
        }
        C58824N6u c58824N6u = this.LJLJLLL;
        if (c58824N6u != null) {
            N6J.LIZJ(c58824N6u, jk1.LIZ.LJLL);
        }
        C58824N6u c58824N6u2 = this.LJLJLLL;
        if (c58824N6u2 != null) {
            c58824N6u2.LIZLLL(N6F.CTA_CLICK, new AqS160S0100000_10(this, 419));
        }
        C58824N6u c58824N6u3 = this.LJLJLLL;
        if (c58824N6u3 != null) {
            c58824N6u3.LIZLLL(N6F.MASK_CTA_CLICK, new AqS160S0100000_10(this, 420));
        }
        C58824N6u c58824N6u4 = this.LJLJLLL;
        if (c58824N6u4 != null) {
            c58824N6u4.LIZLLL(N6F.MASK_SHOW, new AqS160S0100000_10(this, 421));
        }
        C58824N6u c58824N6u5 = this.LJLJLLL;
        if (c58824N6u5 != null) {
            c58824N6u5.LIZLLL(N6F.MASK_HIDE, new AqS160S0100000_10(this, 422));
        }
    }
}
