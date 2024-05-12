package com.ss.android.ugc.aweme.profile.aigc;

import X.APN;
import X.AbstractC73638SvC;
import X.ActivityC86117Xqz;
import X.C1B3;
import X.C221018lt;
import X.C221108m2;
import X.C223338pd;
import X.C244459ib;
import X.C246529lw;
import X.C246539lx;
import X.C246549ly;
import X.C246559lz;
import X.C26356AWa;
import X.C5H3;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C72121SSf;
import X.C73318Sq2;
import X.C73542Ste;
import X.C73969T1h;
import X.C78999UzT;
import X.EnumC244439iZ;
import X.ST9;
import X.STA;
import X.STO;
import X.T16;
import X.X1D;
import Y.IDhS97S0100000_4;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.aigc.IAIGCAvatarService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAigcMainActivity extends ActivityC86117Xqz {
    public Bundle LJLILLLLZI;
    public C223338pd LJLJI;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);
    public final C73318Sq2 LJLJJI = new C73318Sq2();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C246559lz.LJLIL);
    public final C246549ly LJLJJLL = new STO() { // from class: X.9ly
        @Override // X.STO
        public void onUpdate(ST8 callback) {
            o.LJIIIZ(callback, "callback");
        }
    };

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.aigc.ProfileAigcMainActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        this.LJLJJI.LIZLLL();
        ((IAIGCAvatarService) this.LJLJJL.getValue()).LIZLLL(EnumC244439iZ.SOCIAL, this.LJLJJLL);
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

    public final void LLFII(C244459ib c244459ib) {
        C223338pd c223338pd = this.LJLJI;
        if (c223338pd != null) {
            c223338pd.LIZJ();
        }
        C223338pd c223338pd2 = this.LJLJI;
        if (c223338pd2 != null) {
            c223338pd2.setVisibility(8);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current status: ");
        LIZ.append(c244459ib);
        LIZ.append(".status");
        C221018lt.LIZ("ProfileAigcMainActivity", X1D.LIZIZ(LIZ));
        switch (STA.LIZ[c244459ib.LIZ.ordinal()]) {
            case 1:
            case 2:
                getSupportFragmentManager().LJJLIIIJJI();
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV2 = new ProfileAigcIntroFragmentV2();
                profileAigcIntroFragmentV2.setArguments(this.LJLILLLLZI);
                c1b3.LJIIJ(profileAigcIntroFragmentV2, null, R.id.dm7);
                c1b3.LJIILJJIL();
                return;
            case 3:
                LLFZ("fail");
                return;
            case 4:
                LLFZ("creating");
                return;
            case 5:
                LLFZ("in_queue");
                return;
            case 6:
                Bundle bundle = this.LJLILLLLZI;
                if (bundle != null) {
                    bundle.putSerializable("avatar_result", c244459ib.LIZJ);
                }
                getSupportFragmentManager().LJJLIIIJJI();
                ProfileAigcChooseAvatarFragment profileAigcChooseAvatarFragment = new ProfileAigcChooseAvatarFragment();
                profileAigcChooseAvatarFragment.setArguments(this.LJLILLLLZI);
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                supportFragmentManager2.getClass();
                C1B3 c1b32 = new C1B3(supportFragmentManager2);
                c1b32.LJIIJ(profileAigcChooseAvatarFragment, null, R.id.dm7);
                c1b32.LJIILJJIL();
                return;
            default:
                return;
        }
    }

    public final void LLFZ(String str) {
        getSupportFragmentManager().LJJLIIIJJI();
        ProfileAigcProgressFragment profileAigcProgressFragment = new ProfileAigcProgressFragment();
        Bundle bundle = this.LJLILLLLZI;
        if (bundle != null) {
            bundle.putString("enter_status", str);
        } else {
            bundle = null;
        }
        profileAigcProgressFragment.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJ(profileAigcProgressFragment, null, R.id.dm7);
        c1b3.LJIILJJIL();
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String aigcStatus;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.aigc.ProfileAigcMainActivity", "onCreate", true);
        activityConfiguration(C246539lx.LJLIL);
        super.onCreate(bundle);
        if (!C26356AWa.LIZ()) {
            finish();
        }
        setContentView(R.layout.c3_);
        C223338pd c223338pd = (C223338pd) findViewById(R.id.chw);
        this.LJLJI = c223338pd;
        if (c223338pd != null) {
            c223338pd.setVisibility(0);
        }
        C223338pd c223338pd2 = this.LJLJI;
        if (c223338pd2 != null) {
            c223338pd2.LIZIZ();
        }
        ProfileAIGCMainArg profileAIGCMainArg = (ProfileAIGCMainArg) this.LJLIL.getValue();
        if (profileAIGCMainArg != null) {
            Bundle bundle2 = new Bundle();
            String aigcEntrance = profileAIGCMainArg.getAigcEntrance();
            if (aigcEntrance != null) {
                bundle2.putString("entrance", aigcEntrance);
            }
            Boolean introPageWithNavBar = profileAIGCMainArg.getIntroPageWithNavBar();
            if (introPageWithNavBar != null) {
                bundle2.putBoolean("intro_page_nav_bar", introPageWithNavBar.booleanValue());
            }
            String enterFrom = profileAIGCMainArg.getEnterFrom();
            if (enterFrom != null) {
                bundle2.putString("enter_from", enterFrom);
                String str = APN.PERSONAL_HOMEPAGE.toString();
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (o.LJ(enterFrom, lowerCase)) {
                    String lowerCase2 = APN.EDIT_PROFILE_PAGE.toString().toLowerCase(locale);
                    o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    bundle2.putString("enter_from_for_progress", lowerCase2);
                }
            }
            String enterMethod = profileAIGCMainArg.getEnterMethod();
            if (enterMethod != null) {
                bundle2.putString("enter_method", enterMethod);
            }
            C72121SSf avatarResult = profileAIGCMainArg.getAvatarResult();
            if (avatarResult != null) {
                bundle2.putSerializable("avatar_result", avatarResult);
            }
            this.LJLILLLLZI = bundle2;
        }
        ProfileAIGCMainArg profileAIGCMainArg2 = (ProfileAIGCMainArg) this.LJLIL.getValue();
        C72121SSf c72121SSf = null;
        if (profileAIGCMainArg2 != null && (aigcStatus = profileAIGCMainArg2.getAigcStatus()) != null) {
            ST9 valueOf = ST9.valueOf(aigcStatus);
            ProfileAIGCMainArg profileAIGCMainArg3 = (ProfileAIGCMainArg) this.LJLIL.getValue();
            if (profileAIGCMainArg3 != null) {
                c72121SSf = profileAIGCMainArg3.getAvatarResult();
            }
            LLFII(new C244459ib(valueOf, 0, c72121SSf, 0));
        } else {
            C78999UzT.LJFF(C73542Ste.LJII(AbstractC73638SvC.LJIILLIIL(new Callable() { // from class: X.9lv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ST8 LJFF = ((IAIGCAvatarService) ST7.LIZ.getValue()).LJFF(EnumC244439iZ.SOCIAL);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("current task status: ");
                    LIZ.append(LJFF);
                    C221018lt.LIZ("ProfileAigcStatusService", X1D.LIZIZ(LIZ));
                    return ST7.LIZ(LJFF);
                }
            }).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIJI(new IDhS97S0100000_4(this, 0)), C246529lw.LJLIL, null, 2), this.LJLJJI);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.aigc.ProfileAigcMainActivity", "onCreate", false);
    }
}
