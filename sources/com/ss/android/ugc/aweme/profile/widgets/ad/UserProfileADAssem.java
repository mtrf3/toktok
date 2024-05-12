package com.ss.android.ugc.aweme.profile.widgets.ad;

import X.C025908h;
import X.C237559Tz;
import X.C42625Go9;
import X.C58655N0h;
import X.C58704N2e;
import X.C59771Nd1;
import X.C59772Nd2;
import X.C59773Nd3;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C71062Ruk;
import X.C73340SqO;
import X.C7OY;
import X.C80648Vky;
import X.C8VC;
import X.C9PN;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.InterfaceC57511Mhf;
import X.NN1;
import X.NO5;
import X.NOE;
import X.NTP;
import X.OJY;
import X.QD3;
import X.TBT;
import X.V9W;
import X.YG3;
import X.YG5;
import X.YG7;
import X.YG9;
import X.YGA;
import X.YGD;
import X.YGF;
import X.YGH;
import X.YGI;
import X.YGJ;
import X.YGK;
import X.YGL;
import X.YGM;
import X.YGN;
import X.YGO;
import X.YGP;
import X.YGZ;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class UserProfileADAssem extends UIContentAssem implements InterfaceC57511Mhf {
    public static final YGZ LJLZ = new YGZ();
    public YGF LJLIL;
    public YGF LJLILLLLZI;
    public YGF LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public C80648Vky LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLL;
    public Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public String LJLLJ = "";
    public final YG3 LJLLLL = new YG3(this);

    public void _$_clearFindViewByIdCache() {
        this.LJLLLLLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLLLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC57511Mhf, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public final void M3() {
        String str;
        if (this.LJLLL && this.LJLL && !this.LJLLILLLL && (str = this.LJLLJ) != null) {
            new C237559Tz().LJIIJJI(str, getCurrentAweme(), getEventType());
            this.LJLLILLLL = true;
        }
    }

    public final Aweme getCurrentAweme() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LJI;
        }
        return null;
    }

    public final String getEventType() {
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn != null) {
            return c9pn.LIZLLL;
        }
        return null;
    }

    public final void C3() {
        Aweme currentAweme = getCurrentAweme();
        OJY LJIL = C73340SqO.LJIL();
        Context context = getContext();
        LJIL.getClass();
        NN1.LJJIL(context, currentAweme, "button");
        boolean z = false;
        if (currentAweme != null && C63081OpJ.LLIIIILZ(currentAweme)) {
            z = true;
        }
        if (z) {
            if (!YG5.LIZIZ.openTopViewLive(getContext(), currentAweme, 8, new YG7(this, currentAweme))) {
                V9W LJIJI = C73340SqO.LJIJI();
                Context context2 = getContext();
                YGH ygh = YGH.LIZ;
                LJIJI.getClass();
                NOE.LJJIIJ(context2, currentAweme, 8, ygh);
                F3(300);
                return;
            }
            return;
        }
        V9W LJIJI2 = C73340SqO.LJIJI();
        Context context3 = getContext();
        YGI ygi = YGI.LIZ;
        LJIJI2.getClass();
        NOE.LJJIIJ(context3, currentAweme, 8, ygi);
    }

    public final void N3() {
        AwemeRawAd awemeRawAd;
        Aweme currentAweme = getCurrentAweme();
        if (currentAweme == null || !currentAweme.isAd() || (awemeRawAd = currentAweme.getAwemeRawAd()) == null) {
            return;
        }
        String type = awemeRawAd.getType();
        if (TextUtils.isEmpty(type) || type == null) {
            return;
        }
        switch (type.hashCode()) {
            case 96801:
                if (!type.equals("app")) {
                    return;
                }
                Aweme currentAweme2 = getCurrentAweme();
                if (currentAweme2 != null && C63081OpJ.LJLILLLLZI(currentAweme2)) {
                    V9W LJIJI = C73340SqO.LJIJI();
                    Context context = getContext();
                    Aweme currentAweme3 = getCurrentAweme();
                    YGM ygm = YGM.LIZ;
                    LJIJI.getClass();
                    NOE.LJJIIJ(context, currentAweme3, 8, ygm);
                    return;
                }
                Aweme currentAweme4 = getCurrentAweme();
                if (currentAweme4 == null || !C63081OpJ.LJJL(currentAweme4)) {
                    return;
                }
                V9W LJIJI2 = C73340SqO.LJIJI();
                Context context2 = getContext();
                LJIJI2.getClass();
                NO5.LJIIIZ(context2, currentAweme);
                return;
            case 117588:
                if (!type.equals("web")) {
                    return;
                }
                Aweme currentAweme5 = getCurrentAweme();
                if (currentAweme5 == null || !C63081OpJ.LLJJIJIIJIL(currentAweme5)) {
                    OJY LJIL = C73340SqO.LJIL();
                    Context context3 = getContext();
                    LJIL.getClass();
                    NN1.LJJIJLIJ(context3, currentAweme);
                    C58704N2e.LIZLLL("homepage_ad", "click_button", awemeRawAd).LJII();
                    OJY LJIL2 = C73340SqO.LJIL();
                    Context context4 = getContext();
                    Aweme currentAweme6 = getCurrentAweme();
                    LJIL2.getClass();
                    NN1.LJJIL(context4, currentAweme6, "button");
                }
                V9W LJIJI3 = C73340SqO.LJIJI();
                Context context5 = getContext();
                YGL ygl = YGL.LIZ;
                LJIJI3.getClass();
                NOE.LJJIIJ(context5, currentAweme, 8, ygl);
                return;
            case 106642798:
                if (!type.equals("phone")) {
                    return;
                }
                OJY LJIL3 = C73340SqO.LJIL();
                Context context6 = getContext();
                LJIL3.getClass();
                NN1.LJJJJJ(context6, "click_call", currentAweme, NN1.LJIIIZ(context6, currentAweme));
                C58704N2e.LIZLLL("homepage_ad", "click_call", awemeRawAd).LJII();
                OJY LJIL4 = C73340SqO.LJIL();
                Context context7 = getContext();
                LJIL4.getClass();
                OJY.LJIIIIZZ(context7, currentAweme);
                V9W LJIJI4 = C73340SqO.LJIJI();
                Context context8 = getContext();
                Aweme currentAweme7 = getCurrentAweme();
                YGO ygo = YGO.LIZ;
                LJIJI4.getClass();
                NOE.LJJIIJ(context8, currentAweme7, 8, ygo);
                return;
            case 954925063:
                if (!type.equals("message")) {
                    return;
                }
                C58704N2e.LIZLLL("homepage_ad", "click_message", awemeRawAd).LJI();
                OJY LJIL5 = C73340SqO.LJIL();
                Context context9 = getContext();
                LJIL5.getClass();
                OJY.LJIIIIZZ(context9, currentAweme);
                V9W LJIJI5 = C73340SqO.LJIJI();
                Context context10 = getContext();
                Aweme currentAweme8 = getCurrentAweme();
                YGN ygn = YGN.LIZ;
                LJIJI5.getClass();
                NOE.LJJIIJ(context10, currentAweme8, 8, ygn);
                return;
            case 957829685:
                if (!type.equals("counsel")) {
                    return;
                }
                OJY LJIL6 = C73340SqO.LJIL();
                Context context11 = getContext();
                LJIL6.getClass();
                NN1.LJJIJLIJ(context11, currentAweme);
                C58704N2e.LIZLLL("homepage_ad", "click_button", awemeRawAd).LJII();
                OJY LJIL7 = C73340SqO.LJIL();
                Context context12 = getContext();
                LJIL7.getClass();
                OJY.LJIIIIZZ(context12, currentAweme);
                V9W LJIJI6 = C73340SqO.LJIJI();
                Context context13 = getContext();
                YGJ ygj = YGJ.LIZ;
                LJIJI6.getClass();
                NOE.LJJIIJ(context13, currentAweme, 8, ygj);
                OJY LJIL8 = C73340SqO.LJIL();
                Context context14 = getContext();
                LJIL8.getClass();
                NN1.LJJIJLIJ(context14, currentAweme);
                C58704N2e.LIZLLL("homepage_ad", "click_button", awemeRawAd).LJII();
                OJY LJIL9 = C73340SqO.LJIL();
                Context context15 = getContext();
                LJIL9.getClass();
                OJY.LJIIIIZZ(context15, currentAweme);
                V9W LJIJI7 = C73340SqO.LJIJI();
                Context context16 = getContext();
                YGK ygk = YGK.LIZ;
                LJIJI7.getClass();
                NOE.LJJIIJ(context16, currentAweme, 8, ygk);
                return;
            case 1893962841:
                if (!type.equals("redpacket")) {
                    return;
                }
                OJY LJIL10 = C73340SqO.LJIL();
                Context context17 = getContext();
                LJIL10.getClass();
                OJY.LJIIIIZZ(context17, currentAweme);
                OJY LJIL11 = C73340SqO.LJIL();
                Context context18 = getContext();
                LJIL11.getClass();
                NN1.LJJIJL(context18, currentAweme);
                C58704N2e.LIZLLL("homepage_ad", "click_redpacket", awemeRawAd).LJII();
                V9W LJIJI8 = C73340SqO.LJIJI();
                Context context19 = getContext();
                YGP ygp = YGP.LIZ;
                LJIJI8.getClass();
                NOE.LJJIIJ(context19, currentAweme, 8, ygp);
                return;
            default:
                return;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        YG3 yg3;
        super.onDestroy();
        C80648Vky c80648Vky = this.LJLJLJ;
        if (c80648Vky != null && (yg3 = this.LJLLLL) != null && ((ArrayList) c80648Vky.LLIIIJ).contains(yg3)) {
            ((ArrayList) c80648Vky.LLIIIJ).remove(yg3);
        }
        C42625Go9.LIZJ(this);
    }

    @Override // X.C8W0
    public void onPause() {
        super.onPause();
        C42625Go9.LIZJ(this);
        this.LJLLILLLL = false;
    }

    @Override // X.C8W0
    public void onResume() {
        super.onResume();
        if (!this.LJLL) {
            return;
        }
        C42625Go9.LIZIZ(this);
        M3();
    }

    @Override // X.InterfaceC57511Mhf
    public boolean LJZ() {
        return this.LJLJL;
    }

    private final void I3(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.qm);
        C59771Nd1 c59771Nd1 = new C59771Nd1();
        c59771Nd1.LIZLLL = viewStub;
        C7OY LIZJ = CommercializeAdServiceImpl.LJ().LIZJ(getContext(), c59771Nd1);
        if (LIZJ instanceof YGF) {
            YGF ygf = (YGF) LIZJ;
            this.LJLIL = ygf;
            if (ygf != null) {
                ygf.LJI();
            }
        }
    }

    private final void K3(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.gz6);
        C59772Nd2 c59772Nd2 = new C59772Nd2();
        c59772Nd2.LIZ = viewStub;
        C7OY LIZJ = CommercializeAdServiceImpl.LJ().LIZJ(getContext(), c59772Nd2);
        if (LIZJ instanceof YGF) {
            YGF ygf = (YGF) LIZJ;
            this.LJLILLLLZI = ygf;
            if (ygf != null) {
                ygf.LJI();
            }
        }
    }

    private final void L3(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.hx3);
        C59773Nd3 c59773Nd3 = new C59773Nd3();
        c59773Nd3.LIZ = viewStub;
        C7OY LIZJ = CommercializeAdServiceImpl.LJ().LIZJ(getContext(), c59773Nd3);
        if (LIZJ instanceof YGF) {
            YGF ygf = (YGF) LIZJ;
            this.LJLJI = ygf;
            o.LJI(ygf);
            ygf.LJI();
        }
    }

    public final void A3(Aweme aweme) {
        YGF ygf = this.LJLJI;
        if (ygf != null) {
            C59771Nd1 c59771Nd1 = new C59771Nd1();
            Context context = getContext();
            getEventType();
            c59771Nd1.LIZ(context, aweme, new YGD(this));
            ygf.LJII(c59771Nd1);
        }
    }

    public final void E3(int i) {
        YGF ygf;
        if (!this._isViewValid || (ygf = this.LJLIL) == null) {
            return;
        }
        ygf.LJFF(i);
    }

    public final void F3(int i) {
        YGF ygf;
        if (!this._isViewValid || (ygf = this.LJLILLLLZI) == null) {
            return;
        }
        ygf.LJFF(i);
    }

    public final void H3(int i) {
        YGF ygf;
        if (!this._isViewValid || (ygf = this.LJLJI) == null) {
            return;
        }
        o.LJI(ygf);
        ygf.LJFF(i);
        this.LJLJJLL = false;
    }

    public final void O3(boolean z) {
        Aweme currentAweme;
        YGF ygf;
        if (!this._isViewValid || this.LJLIL == null || this.LJLJJI || (currentAweme = getCurrentAweme()) == null || !C63081OpJ.LLJJIJIL(currentAweme) || (ygf = this.LJLIL) == null) {
            return;
        }
        ygf.LIZ(z);
    }

    public final void P3(boolean z) {
        if (!this._isViewValid || this.LJLILLLLZI == null || this.LJLJJI) {
            return;
        }
        Aweme currentAweme = getCurrentAweme();
        if ((currentAweme != null && C63081OpJ.LLJJIJIL(currentAweme)) || this.LJLJJL) {
            if (z) {
                this.LJLJJL = true;
            }
            YGF ygf = this.LJLILLLLZI;
            if (ygf == null) {
                return;
            }
            ygf.LIZ(z);
        }
    }

    public final void Q3(boolean z) {
        Aweme currentAweme;
        if (!this._isViewValid || this.LJLJI == null || (currentAweme = getCurrentAweme()) == null || !C63081OpJ.LLJL(currentAweme) || this.LJLJJLL) {
            return;
        }
        this.LJLJJLL = true;
        YGF ygf = this.LJLJI;
        o.LJI(ygf);
        ygf.LIZ(z);
    }

    @QD3
    public final void onEvent(C71062Ruk pdpActionEvent) {
        String str;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        o.LJIIIZ(pdpActionEvent, "pdpActionEvent");
        String str2 = pdpActionEvent.LJLJI;
        Aweme currentAweme = getCurrentAweme();
        AwemeRawAd awemeRawAd5 = null;
        if (currentAweme != null) {
            str = currentAweme.getAid();
        } else {
            str = null;
        }
        if (!TextUtils.equals(str2, str) || !TextUtils.equals(pdpActionEvent.LJLJJI, "profile_ad")) {
            return;
        }
        int i = pdpActionEvent.LJLIL;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                Integer num = pdpActionEvent.LJLILLLLZI;
                if (num != null && num.intValue() == 2) {
                    Aweme currentAweme2 = getCurrentAweme();
                    if (currentAweme2 != null) {
                        awemeRawAd4 = currentAweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd4 = null;
                    }
                    C58704N2e.LIZLLL("landing_ad", "close", awemeRawAd4).LJI();
                }
                Integer num2 = pdpActionEvent.LJLILLLLZI;
                if (num2 == null || num2.intValue() != 3) {
                    return;
                }
                Aweme currentAweme3 = getCurrentAweme();
                if (currentAweme3 != null) {
                    awemeRawAd5 = currentAweme3.getAwemeRawAd();
                }
                C025908h.LIZLLL("homepage_ad", "close", awemeRawAd5, "halfscreen_page", "refer");
                return;
            }
            Aweme currentAweme4 = getCurrentAweme();
            if (currentAweme4 != null) {
                awemeRawAd5 = currentAweme4.getAwemeRawAd();
            }
            C025908h.LIZLLL("homepage_ad", "otherclick", awemeRawAd5, "halfscreen_page", "refer");
            return;
        }
        Integer num3 = pdpActionEvent.LJLILLLLZI;
        if (num3 != null && num3.intValue() == 3) {
            Aweme currentAweme5 = getCurrentAweme();
            if (currentAweme5 != null) {
                awemeRawAd = currentAweme5.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("homepage_ad", "click", awemeRawAd);
            LIZLLL.LIZJ("halfscreen_page", "refer");
            LIZLLL.LJI();
            Aweme currentAweme6 = getCurrentAweme();
            if (currentAweme6 != null) {
                awemeRawAd2 = currentAweme6.getAwemeRawAd();
            } else {
                awemeRawAd2 = null;
            }
            C025908h.LIZLLL("homepage_ad", "othershow", awemeRawAd2, "halfscreen_page", "refer");
        }
        Integer num4 = pdpActionEvent.LJLILLLLZI;
        if (num4 == null || num4.intValue() != 2) {
            return;
        }
        Aweme currentAweme7 = getCurrentAweme();
        if (currentAweme7 != null) {
            awemeRawAd3 = currentAweme7.getAwemeRawAd();
        } else {
            awemeRawAd3 = null;
        }
        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("homepage_ad", "click", awemeRawAd3);
        LIZLLL2.LIZJ("button", "refer");
        LIZLLL2.LJI();
        Aweme currentAweme8 = getCurrentAweme();
        if (currentAweme8 != null) {
            awemeRawAd5 = currentAweme8.getAwemeRawAd();
        }
        C025908h.LIZLLL("homepage_ad", "othershow", awemeRawAd5, "button", "refer");
    }

    @QD3
    public final void onNativeGPViewHiddenEvent(NTP onAdNativeGpPopUpViewHiddenEvent) {
        o.LJIIIZ(onAdNativeGpPopUpViewHiddenEvent, "onAdNativeGpPopUpViewHiddenEvent");
        Q3(false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C80648Vky c80648Vky = (C80648Vky) view.findViewById(R.id.jcm);
        this.LJLJLJ = c80648Vky;
        if (c80648Vky != null) {
            c80648Vky.LIZIZ(this.LJLLLL);
        }
        I3(view);
        K3(view);
        L3(view);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.YFy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJI;
            }
        }, new AqS181S0100000_15(this, 119));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9PY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJ;
            }
        }, new AqS181S0100000_15(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9PX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIL;
            }
        }, new AqS181S0100000_15(this, 121));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Pc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PN) obj).LJIIIZ);
            }
        }, new AqS181S0100000_15(this, 122));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Pf
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS181S0100000_15(this, 118));
    }

    public final void v3(Aweme aweme) {
        YGF ygf = this.LJLIL;
        if (ygf != null) {
            C59771Nd1 c59771Nd1 = new C59771Nd1();
            Context context = getContext();
            getEventType();
            c59771Nd1.LIZ(context, aweme, new YG9(this));
            ygf.LJII(c59771Nd1);
        }
    }

    public final void x3(Aweme aweme) {
        YGF ygf = this.LJLILLLLZI;
        if (ygf != null) {
            C59771Nd1 c59771Nd1 = new C59771Nd1();
            Context context = getContext();
            getEventType();
            c59771Nd1.LIZ(context, aweme, new YGA(this));
            ygf.LJII(c59771Nd1);
        }
    }
}
