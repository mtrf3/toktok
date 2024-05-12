package com.ss.android.ugc.aweme.creatortools.videogift;

import X.AGJ;
import X.AbstractC36908Ee8;
import X.AbstractC73672Svk;
import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C25726A7u;
import X.C25727A7v;
import X.C25728A7w;
import X.C25848ACm;
import X.C25849ACn;
import X.C25851ACp;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C73318Sq2;
import X.C73536StY;
import X.C73969T1h;
import X.C78840Uwu;
import X.EFJ;
import X.FMX;
import X.O0X;
import X.T16;
import Y.AfS24S0110000_4;
import Y.AfS56S0100000_4;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.AqS9S0010000_4;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public final class VideoGiftSettingActivity extends ActivityC86117Xqz {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJJI;
    public User LJLJJLL;
    public C25849ACn LJLJL;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final C73318Sq2 LJLJI = new C73318Sq2();
    public String LJLJJL = "";
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 103));

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        this.LJLJI.dispose();
        super.onDestroy();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    public final void LLFII(int i) {
        C188727au c188727au = new C188727au();
        String str = "gift_setting";
        c188727au.LJIIIZ("enter_from", "gift_setting");
        c188727au.LIZLLL(i, "is_success");
        if (this.LJLJJI) {
            str = "notification";
        }
        c188727au.LJIIIZ("previous_page", str);
        FMX.LJIIL("disable_video_gifting", c188727au.LIZ);
    }

    public final void LLFZ(int i) {
        String str;
        String str2 = "gift_setting";
        if (!this.LJLIL || this.LJLILLLLZI) {
            str = "gift_setting";
        } else {
            this.LJLILLLLZI = true;
            str = "video_gift_opt_in";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LIZLLL(i, "is_success");
        if (this.LJLJJI) {
            str2 = "notification";
        }
        c188727au.LJIIIZ("previous_page", str2);
        FMX.LJIIL("enable_video_gifting", c188727au.LIZ);
    }

    public final void LLII(boolean z) {
        AbstractC73672Svk<VideoGiftSettingResponse> abstractC73672Svk;
        this.LJLJI.LIZLLL();
        C25849ACn c25849ACn = this.LJLJL;
        if (c25849ACn != null) {
            c25849ACn.LJIIJ(new AqS9S0010000_4(z, 2));
            int i = !z ? 1 : 0;
            try {
                if (VideoGiftApi.LIZ == null) {
                    IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
                    String API_URL_PREFIX_SI = EFJ.LIZJ;
                    o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
                    VideoGiftApi.LIZ = (VideoGiftApi.SetGiftSettingsApi) LIZLLL.create(API_URL_PREFIX_SI).create(VideoGiftApi.SetGiftSettingsApi.class);
                }
                VideoGiftApi.SetGiftSettingsApi setGiftSettingsApi = VideoGiftApi.LIZ;
                o.LJI(setGiftSettingsApi);
                abstractC73672Svk = setGiftSettingsApi.setGiftSettings(i);
            } catch (ExecutionException e) {
                AbstractC36908Ee8.getCompatibleException(e);
                abstractC73672Svk = C73536StY.LJLIL;
                o.LJIIIIZZ(abstractC73672Svk, "empty()");
            }
            this.LJLJI.LIZ(abstractC73672Svk.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 9), new AfS24S0110000_4(this, z, 0)));
            return;
        }
        o.LJIJI("giftSettingUnit");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        boolean z2;
        ICompliancePolicyService LJII;
        String str2;
        C65803Ps7.LIZ(this, bundle);
        boolean z3 = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onCreate", true);
        activityConfiguration(C25726A7u.LJLIL);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.ck6);
        Intent intent = getIntent();
        boolean z4 = false;
        if (intent != null) {
            z = intent.getBooleanExtra("bundle_enter_from_gift_eligibility", false);
        } else {
            z = false;
        }
        this.LJLIL = z;
        Intent intent2 = getIntent();
        if (intent2 == null || (str = C16880lQ.LLJJIJIIJIL(intent2, "bundle_video_gift_previous_page")) == null) {
            str = "";
        }
        this.LJLJJL = str;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            z2 = intent3.getBooleanExtra("bundle_video_gift_enter_from_notification", false);
        } else {
            z2 = false;
        }
        this.LJLJJI = z2;
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.tq_);
        o.LJIIIIZZ(string, "getString(R.string.videogifts_settings_page)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS154S0100000_4(this, 1235));
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_question_mark_circle_ltr;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 1236));
        c235119Kp.LIZIZ(LIZJ);
        c252709vu.setNavActions(c235119Kp);
        C25851ACp c25851ACp = (C25851ACp) this.LJLJLJ.getValue();
        String string2 = getString(R.string.tqa);
        String string3 = getString(R.string.tq9);
        o.LJIIIIZZ(string2, "getString(R.string.videogifts_settings_title)");
        C25849ACn c25849ACn = new C25849ACn(new C25848ACm(false, string2, null, false, null, null, null, string3, false, false, false, null, 64508));
        this.LJLJL = c25849ACn;
        c25851ACp.LIZ(c25849ACn);
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(C25728A7w.LIZIZ("vgc_visiting_first_time"), false);
        if (C25727A7v.LIZ() && (LJII = a.LJII()) != null) {
            z4 = false;
            LJII.LIZ(new O0X(AGJ.SETTINGS_VIDEO_GIFT_PAGE.getValue(), "virtual-items", false, false, 28));
        }
        User curUser = AccountService.LJIJ().LJFF().getCurUser();
        this.LJLJJLL = curUser;
        if (curUser.getVideoGiftStatus() != 2) {
            z3 = false;
        }
        C25849ACn c25849ACn2 = this.LJLJL;
        if (c25849ACn2 != null) {
            c25849ACn2.LJIIJ(new AqS47S0110000_4(this, z3, 23));
            if (this.LJLIL) {
                LLII(z4);
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "gift_setting");
            if (this.LJLJJI) {
                str2 = "notification";
            } else {
                str2 = this.LJLJJL;
            }
            c188727au.LJIIIZ("previous_page", str2);
            FMX.LJIIL("enter_gift_setting_page", c188727au.LIZ);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftSettingActivity", "onCreate", z4);
            return;
        }
        o.LJIJI("giftSettingUnit");
        throw null;
    }
}
