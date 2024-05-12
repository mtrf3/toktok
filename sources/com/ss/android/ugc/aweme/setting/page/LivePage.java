package com.ss.android.ugc.aweme.setting.page;

import X.AD7;
import X.AEB;
import X.AEG;
import X.AEP;
import X.AG0;
import X.AG1;
import X.AG2;
import X.AG3;
import X.AbstractC234519Ih;
import X.C188727au;
import X.C2068389v;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C251929ue;
import X.C252709vu;
import X.C25851ACp;
import X.C62822Ol8;
import X.C65429Pm5;
import X.C76L;
import X.C9KF;
import X.ExecutorC142245i8;
import X.FMX;
import X.HG3;
import X.InterfaceC61213O0r;
import X.RBX;
import X.RunnableC65751PrH;
import X.Z8A;
import Y.ACListenerS24S0100000_4;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.setting.api.LiveReplayApi;
import com.ss.android.ugc.aweme.setting.model.LiveReplayEntranceResponse;
import com.zhiliaoapp.musically.R;
import defpackage.m0;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class LivePage extends BasePage {
    public AG2 LJLJJI;
    public AG2 LJLJJL;
    public AG2 LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 795));

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

    public final C25851ACp Al() {
        return (C25851ACp) this.LJLJI.getValue();
    }

    public static void Dl(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "creator_account");
        c188727au.LJIIIZ("event_page", "setting");
        c188727au.LJIIIZ("action_type", str);
        FMX.LJIIL("livesdk_live_center_replay", c188727au.LIZ);
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
        fragmentConfiguration(AG1.LJLIL);
        ((C252709vu) _$_findCachedViewById(R.id.gwg)).LJIILJJIL(false);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        String string = getString(R.string.aub);
        o.LJIIIIZZ(string, "getString(R.string.acces…lityLabels_settings_back)");
        LIZJ.LJII = string;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 794));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string2 = getString(R.string.htc);
        o.LJIIIIZZ(string2, "getString(R.string.live)");
        LIZLLL.LIZJ = string2;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        String string3 = getString(R.string.pds);
        o.LJIIIIZZ(string3, "getString(R.string.profile_entrance_events)");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_calendar_star_fill;
        this.LJLJJI = new AG2(new AEP(string3, c2068389v, new ACListenerS24S0100000_4(this, 171), "live_events", false, 8388576));
        String string4 = getString(R.string.oe9);
        C2068389v LIZ = C251929ue.LIZ(string4, "getString(R.string.pm_sub_user_setting_entrance)");
        LIZ.LIZ = R.raw.icon_star_ring_fill;
        this.LJLJJL = new AG2(new AEP(string4, LIZ, new ACListenerS24S0100000_4(this, 172), "live_subscription", false, 8388592));
        String string5 = getString(R.string.n6d);
        C2068389v LIZ2 = C251929ue.LIZ(string5, "getString(R.string.pm_mt_livereplay)");
        LIZ2.LIZ = R.raw.icon_replay_fill;
        this.LJLJJLL = new AG2(new AEP(string5, LIZ2, new ACListenerS24S0100000_4(this, 173), "notification_manager", false, 8388576));
        Al().LIZ(new AEG(new AEB("", false, false, false, true, null, null, null, null, null, null, 16350)));
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
                    Al().LIZ(new AEG(new AEB("", false, false, true, false, null, null, null, null, null, null, 16366)));
                    if (((RBX) HG3.LJIILL()).isLogin() && Z8A.LIZIZ.canShowProfileFixedEntrance()) {
                        AG2 ag24 = this.LJLJJI;
                        if (ag24 != null) {
                            ag24.LJIIIZ(true);
                            AG2 ag25 = this.LJLJJI;
                            if (ag25 != null) {
                                ag25.LJIIJ(new AqS58S1100000_4(ag25, "click_live_event_icon", 30));
                                AG2 ag26 = this.LJLJJI;
                                if (ag26 != null) {
                                    ag26.LJIIJ(new AqS58S1100000_4(ag26, 29));
                                    AG2 ag27 = this.LJLJJI;
                                    if (ag27 != null) {
                                        ag27.LJIIJ(new AqS58S1100000_4(ag27, 26));
                                        Keva repo = Keva.getRepo("SettingsLiveEvents");
                                        String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
                                        boolean LIZLLL2 = m0.LIZLLL(curSecUserId, "_has_see_live_events", repo, false);
                                        if (!m0.LIZLLL(curSecUserId, "_has_highlight_live_events", repo, false) && !LIZLLL2) {
                                            C65429Pm5.LJ(((RBX) HG3.LJIILL()).getCurSecUserId(), "_has_see_live_events", Keva.getRepo("SettingsLiveEvents"), true);
                                            AG2 ag28 = this.LJLJJI;
                                            if (ag28 != null) {
                                                ag28.LJIILIIL(true);
                                            } else {
                                                o.LJIJI("liveEventUnit");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        o.LJIJI("liveEventUnit");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("liveEventUnit");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("liveEventUnit");
                                throw null;
                            }
                        } else {
                            o.LJIJI("liveEventUnit");
                            throw null;
                        }
                    }
                    if (AD7.LJIIL()) {
                        AG2 ag29 = this.LJLJJL;
                        if (ag29 != null) {
                            ag29.LJIIIZ(true);
                            AG2 ag210 = this.LJLJJL;
                            if (ag210 != null) {
                                ag210.LJIILIIL(AD7.LJ());
                            } else {
                                o.LJIJI("liveSubscriptionUnit");
                                throw null;
                            }
                        } else {
                            o.LJIJI("liveSubscriptionUnit");
                            throw null;
                        }
                    } else {
                        AG2 ag211 = this.LJLJJL;
                        if (ag211 != null) {
                            ag211.LJIIIZ(false);
                        } else {
                            o.LJIJI("liveSubscriptionUnit");
                            throw null;
                        }
                    }
                    LiveReplayApi.LIZ.getClass();
                    C76L<LiveReplayEntranceResponse> liveReplayEntrance = AG0.LIZ().getLiveReplayEntrance();
                    liveReplayEntrance.LJFF(new RunnableC65751PrH(liveReplayEntrance, new AG3(this)), ExecutorC142245i8.LJLILLLLZI);
                    return;
                }
                o.LJIJI("liveReplayUnit");
                throw null;
            }
            o.LJIJI("liveSubscriptionUnit");
            throw null;
        }
        o.LJIJI("liveEventUnit");
        throw null;
    }
}
