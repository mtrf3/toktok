package com.ss.android.ugc.aweme.setting.page;

import X.AEP;
import X.AG2;
import X.AbstractC234519Ih;
import X.C19N;
import X.C2068389v;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C251919ud;
import X.C251929ue;
import X.C252709vu;
import X.C25851ACp;
import X.C62822Ol8;
import X.C9KF;
import X.InterfaceC61213O0r;
import Y.ACListenerS24S0100000_4;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class SupportPage extends BasePage {
    public AG2 LJLJJI;
    public AG2 LJLJJL;
    public AG2 LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 797));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.cl8;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, X.JBS
    public final void onBeforeActivityCreated(Activity activity) {
        if (activity != null) {
            activity.setTheme(R.style.kp);
        }
        super.onBeforeActivityCreated(activity);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        fragmentConfiguration(C251919ud.LJLIL);
        ((C252709vu) _$_findCachedViewById(R.id.gwg)).LJIILJJIL(false);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        String string = getString(R.string.aub);
        o.LJIIIIZZ(string, "getString(R.string.acces…lityLabels_settings_back)");
        LIZJ.LJII = string;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 796));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string2 = getString(R.string.r2k);
        o.LJIIIIZZ(string2, "getString(R.string.settingsredesign_titletwelve)");
        LIZLLL.LIZJ = string2;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        String string3 = getString(R.string.geu);
        o.LJIIIIZZ(string3, "getString(R.string.feedback)");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_question_mark_circle_fill_ltr;
        this.LJLJJI = new AG2(new AEP(string3, c2068389v, new ACListenerS24S0100000_4(this, 174), "helper_center", false, 8388592));
        String string4 = getString(R.string.q7y);
        C2068389v LIZ = C251929ue.LIZ(string4, "getString(R.string.safety_center)");
        LIZ.LIZ = R.raw.icon_shield_plus_fill;
        this.LJLJJL = new AG2(new AEP(string4, LIZ, new ACListenerS24S0100000_4(this, 175), "safety_center", false, 8388592));
        String string5 = getString(R.string.p8j);
        C2068389v LIZ2 = C251929ue.LIZ(string5, "getString(R.string.priva…r_headerNav_logo_navLink)");
        LIZ2.LIZ = R.raw.icon_lock_large_fill;
        this.LJLJJLL = new AG2(new AEP(string5, LIZ2, new ACListenerS24S0100000_4(this, 176), "privacy_center", false, 8388592));
        C25851ACp c25851ACp = (C25851ACp) this.LJLJI.getValue();
        AG2 ag2 = this.LJLJJI;
        if (ag2 != null) {
            c25851ACp.LIZ(ag2);
            C25851ACp c25851ACp2 = (C25851ACp) this.LJLJI.getValue();
            AG2 ag22 = this.LJLJJL;
            if (ag22 != null) {
                c25851ACp2.LIZ(ag22);
                if (C19N.LJ("show_privacy_center_entrance", false)) {
                    C25851ACp c25851ACp3 = (C25851ACp) this.LJLJI.getValue();
                    AG2 ag23 = this.LJLJJLL;
                    if (ag23 != null) {
                        c25851ACp3.LIZ(ag23);
                    } else {
                        o.LJIJI("privacyCenterUnit");
                        throw null;
                    }
                }
                ((C25851ACp) this.LJLJI.getValue()).LIZLLL();
                return;
            }
            o.LJIJI("safetyCenterUnit");
            throw null;
        }
        o.LJIJI("helperCenterUnit");
        throw null;
    }
}
