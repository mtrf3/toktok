package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features;

import X.C0DC;
import X.C234999Kd;
import X.C237559Tz;
import X.C65352Pkq;
import X.C73318Sq2;
import X.C8VC;
import X.C9JT;
import X.C9KV;
import X.C9PL;
import X.C9PN;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.TBT;
import Y.ACListenerS39S0200000_4;
import android.view.View;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.LeadsGenModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureGetLeadsAssem extends ProfileSingleFeatureAssem {
    public final C73318Sq2 LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;

    public ProfileAdvancedFeatureGetLeadsAssem() {
        new LinkedHashMap();
        this.LJLJJLL = new C73318Sq2();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final Map<String, Boolean> F3() {
        String lowerCase = "HAS_GET_LEADS".toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C0DC.LIZIZ(lowerCase, Boolean.valueOf(this.LJLJJL));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final View I3() {
        return v3(R.string.eco, R.raw.icon_pen_on_paper, new View.OnClickListener() { // from class: X.9Jz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    public final Aweme getAweme() {
        Aweme aweme;
        C9PN c9pn = (C9PN) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235089Km.class));
        if (c9pn == null || (aweme = c9pn.LJI) == null) {
            C9PL c9pl = (C9PL) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(C9KV.class));
            if (c9pl != null) {
                return c9pl.LJII;
            }
            return null;
        }
        return aweme;
    }

    public final User getUser() {
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd != null) {
            return c234999Kd.LIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Jv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 641));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Jw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJJI;
            }
        }, new AqS170S0100000_4(this, 642));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9Jy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PL) obj).LJ);
            }
        }, new AqS170S0100000_4(this, 643));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Jx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C9PN) obj).LJIIIZ);
            }
        }, new AqS170S0100000_4(this, 644));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJJLL.dispose();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final C9JT x3() {
        return C9JT.GetLeads;
    }

    public final void N3(LeadsGenModel leadsGenModel) {
        BizAccountInfo bizAccountInfo;
        LeadsGenModel leadsGenModel2;
        if (leadsGenModel == null || !leadsGenModel.getHasLeadsGen()) {
            requestHide();
            return;
        }
        L3(new ACListenerS39S0200000_4(this, leadsGenModel, 27));
        String actionName = leadsGenModel.getActionName();
        if (actionName != null) {
            M3(actionName);
        }
        requestShow();
        User user = getUser();
        if (user == null || (bizAccountInfo = user.getBizAccountInfo()) == null || (leadsGenModel2 = bizAccountInfo.getLeadsGenModel()) == null || !leadsGenModel2.getHasLeadsGen() || !this.LJLJL || this.LJLJLJ) {
            return;
        }
        new C237559Tz().LJJIIJ(getUser(), getAweme(), 0);
        this.LJLJLJ = true;
    }
}
