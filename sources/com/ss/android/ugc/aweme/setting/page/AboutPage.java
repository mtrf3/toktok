package com.ss.android.ugc.aweme.setting.page;

import X.AEP;
import X.AG2;
import X.AGJ;
import X.AbstractC234519Ih;
import X.C19N;
import X.C2068389v;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C251929ue;
import X.C252709vu;
import X.C25727A7v;
import X.C25785AAb;
import X.C25788AAe;
import X.C25851ACp;
import X.C62822Ol8;
import X.C9KF;
import X.EF7;
import X.InterfaceC61213O0r;
import X.O0X;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS25S1000000_3;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.setting.serverpush.model.JoinBetaEntrance;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import yq4.a;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class AboutPage extends BasePage {
    public static final /* synthetic */ int LJLLJ = 0;
    public AG2 LJLJJI;
    public AG2 LJLJJL;
    public AG2 LJLJJLL;
    public AG2 LJLJL;
    public AG2 LJLJLJ;
    public AG2 LJLJLLL;
    public AG2 LJLL;
    public AG2 LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 793));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    public final C25851ACp Al() {
        return (C25851ACp) this.LJLJI.getValue();
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
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        fragmentConfiguration(C25785AAb.LJLIL);
        ((C252709vu) _$_findCachedViewById(R.id.gwg)).LJIILJJIL(false);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        String string = getString(R.string.aub);
        o.LJIIIIZZ(string, "getString(R.string.acces…lityLabels_settings_back)");
        LIZJ.LJII = string;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 792));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string2 = getString(R.string.r20);
        o.LJIIIIZZ(string2, "getString(R.string.setti…_termsandpolicies_header)");
        LIZLLL.LIZJ = string2;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        String string3 = getString(R.string.drq);
        o.LJIIIIZZ(string3, "getString(R.string.community_guidelines)");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_double_circle_fill;
        this.LJLJJI = new AG2(new AEP(string3, c2068389v, new ACListenerS24S0100000_4(this, 168), "community_guidelines", false, 8388592));
        String string4 = getString(R.string.pi_);
        C2068389v LIZ = C251929ue.LIZ(string4, "getString(R.string.protocol)");
        LIZ.LIZ = R.raw.icon_book_fill;
        this.LJLJJL = new AG2(new AEP(string4, LIZ, new ACListenerS24S0100000_4(this, 169), "terms_of_use", false, 8388592));
        String string5 = getString(R.string.p9w);
        C2068389v LIZ2 = C251929ue.LIZ(string5, "getString(R.string.privacy_policy)");
        LIZ2.LIZ = R.raw.icon_document_fill;
        this.LJLJJLL = new AG2(new AEP(string5, LIZ2, new ACListenerS24S0100000_4(this, 170), "privacy_policy", false, 8388592));
        String LJJIII = a.LJFF().LJJIII();
        String string6 = getString(R.string.p9v);
        C2068389v LIZ3 = C251929ue.LIZ(string6, "getString(R.string.priva…ghlights_for_teens_title)");
        LIZ3.LIZ = R.raw.icon_document_umbrella_fill;
        ACListenerS25S1000000_3 aCListenerS25S1000000_3 = new ACListenerS25S1000000_3(LJJIII, 0);
        if (LJJIII.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJL = new AG2(new AEP(string6, LIZ3, aCListenerS25S1000000_3, "privacy_highlights_for_teens", z, 8388576));
        String string7 = getString(R.string.dwf);
        C2068389v LIZ4 = C251929ue.LIZ(string7, "getString(R.string.copyright_policy)");
        LIZ4.LIZ = R.raw.icon_copyright_fill;
        boolean z2 = false;
        this.LJLJLJ = new AG2(new AEP(string7, LIZ4, new ACListenerS24S0100000_4(this, 166), "copyright_policy", false, 8388592));
        String string8 = getString(R.string.hkt);
        C2068389v LIZ5 = C251929ue.LIZ(string8, "getString(R.string.join_testers)");
        LIZ5.LIZ = R.raw.icon_beaker_fill;
        ACListenerS24S0100000_4 aCListenerS24S0100000_4 = new ACListenerS24S0100000_4(this, 167);
        JoinBetaEntrance joinBetaEntrance = C25788AAe.LJLILLLLZI;
        if (joinBetaEntrance != null && ((joinBetaEntrance.show && !TextUtils.isEmpty(joinBetaEntrance.url)) || TextUtils.equals(EF7.LJIILIIL, "beta"))) {
            z2 = true;
        }
        this.LJLJLLL = new AG2(new AEP(string8, LIZ5, aCListenerS24S0100000_4, "join_testers", z2, 8388576));
        String string9 = getString(R.string.qtl);
        C2068389v LIZ6 = C251929ue.LIZ(string9, "getString(R.string.setting_about_impressum)");
        LIZ6.LIZ = R.raw.icon_info_circle_fill;
        this.LJLL = new AG2(new AEP(string9, LIZ6, new ACListenerS23S0100000_3(this, 146), null, a.LJIIZILJ().LJIJI(), 8388576));
        String string10 = getString(R.string.t5i);
        C2068389v LIZ7 = C251929ue.LIZ(string10, "getString(R.string.turki…sectionList_sectionLabel)");
        LIZ7.LIZ = R.raw.icon_info_circle_fill;
        this.LJLLI = new AG2(new AEP(string10, LIZ7, new ACListenerS23S0100000_3(this, 147), null, C19N.LJ("tr_social_media_law_entrance", false), 8388576));
        C25851ACp Al = Al();
        AG2 ag2 = this.LJLJJI;
        if (ag2 != null) {
            Al.LIZ(ag2);
            C25851ACp Al2 = Al();
            AG2 ag22 = this.LJLJJL;
            if (ag22 != null) {
                Al2.LIZ(ag22);
                C25851ACp Al3 = Al();
                AG2 ag23 = this.LJLJJLL;
                if (ag23 != null) {
                    Al3.LIZ(ag23);
                    C25851ACp Al4 = Al();
                    AG2 ag24 = this.LJLJL;
                    if (ag24 != null) {
                        Al4.LIZ(ag24);
                        C25851ACp Al5 = Al();
                        AG2 ag25 = this.LJLJLJ;
                        if (ag25 != null) {
                            Al5.LIZ(ag25);
                            C25851ACp Al6 = Al();
                            AG2 ag26 = this.LJLJLLL;
                            if (ag26 != null) {
                                Al6.LIZ(ag26);
                                C25851ACp Al7 = Al();
                                AG2 ag27 = this.LJLL;
                                if (ag27 != null) {
                                    Al7.LIZ(ag27);
                                    C25851ACp Al8 = Al();
                                    AG2 ag28 = this.LJLLI;
                                    if (ag28 != null) {
                                        Al8.LIZ(ag28);
                                        Al().LIZLLL();
                                        if (!C25727A7v.LIZ()) {
                                            return;
                                        }
                                        ICompliancePolicyService LJII = a.LJII();
                                        if (LJII != null) {
                                            LJII.LIZ(new O0X(AGJ.SETTINGS_PRIVACY_PAGE.getValue(), "terms-of-use", true, true, 4));
                                        }
                                        ICompliancePolicyService LJII2 = a.LJII();
                                        if (LJII2 != null) {
                                            LJII2.LIZ(new O0X(AGJ.SETTINGS_PRIVACY_PAGE.getValue(), "privacy-policy", true, true, 4));
                                        }
                                        ICompliancePolicyService LJII3 = a.LJII();
                                        if (LJII3 == null) {
                                            return;
                                        }
                                        LJII3.LIZ(new O0X(AGJ.SETTINGS_PRIVACY_PAGE.getValue(), "copyright-policy", true, true, 4));
                                        return;
                                    }
                                    o.LJIJI("trSoicalMediaLawUnit");
                                    throw null;
                                }
                                o.LJIJI("impressumUnit");
                                throw null;
                            }
                            o.LJIJI("joinTestersUnit");
                            throw null;
                        }
                        o.LJIJI("copyrightPolicyUnit");
                        throw null;
                    }
                    o.LJIJI("privacyHighlightsForTeensUnit");
                    throw null;
                }
                o.LJIJI("privacyPolicyUnit");
                throw null;
            }
            o.LJIJI("protocolUnit");
            throw null;
        }
        o.LJIJI("communityGuidelinesUnit");
        throw null;
    }
}
