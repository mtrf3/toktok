package com.ss.android.ugc.aweme.ui.activity;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C184077Kh;
import X.C1B3;
import X.C201027uk;
import X.C203077y3;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C26338AVi;
import X.C41180GEe;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65803Ps7;
import X.C76800UCe;
import X.C78926UyI;
import X.C84I;
import X.C8WN;
import X.EnumC201127uu;
import X.YUR;
import Y.AObserverS71S0100000_3;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PhotoModeIngressEtData;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PostModeDetailActivity extends YUR {
    public static final /* synthetic */ int LJLJLLL = 0;
    public PostModeDetailPageFragment LJLJI;
    public PostModeDetailParams LJLJJI;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1133));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1132));
    public final C214378bB LJLJL = new C214378bB(C65352Pkq.LIZ(PhotoSharedViewModel.class), new AqS153S0100000_3((ActivityC45651qj) this, 1672), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C201027uk.INSTANCE, C78926UyI.LJIIJJI(this), C78926UyI.LJIILL(this));

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final PostModeContainerViewModel LLFII() {
        return (PostModeContainerViewModel) this.LJLJJL.getValue();
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        PostModeDetailPageFragment postModeDetailPageFragment = this.LJLJI;
        if (postModeDetailPageFragment != null) {
            C84I c84i = postModeDetailPageFragment.LJLJL;
            if (c84i != null && c84i.getCurrentItem() == 1) {
                C84I c84i2 = postModeDetailPageFragment.LJLJL;
                if (c84i2 == null) {
                    return;
                }
                c84i2.setCurrentItem(0);
                return;
            }
            PostModeDetailParams postModeDetailParams = this.LJLJJI;
            if (postModeDetailParams != null) {
                if (postModeDetailParams.useFadeOutExitAnim) {
                    LLFII().gv0(EnumC201127uu.BACK_USE_FADE_OUT_ANIM);
                    return;
                } else if (postModeDetailParams.useSwipeEnterAnim) {
                    LLFII().gv0(EnumC201127uu.BACK_USE_SWIPE_ANIM);
                    return;
                }
            }
            LLFII().gv0(EnumC201127uu.BACK);
        }
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        C8WN.LIZIZ.LJII(this);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        boolean z;
        C65803Ps7.LIZJ(this);
        super.onPause();
        boolean z2 = false;
        if (LLFII().LJLILLLLZI.getValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModel = (PostModeTimeLoggerViewModel) this.LJLJJLL.getValue();
        Aweme aweme = ((PhotoSharedViewModel) this.LJLJL.getValue()).LJLILLLLZI;
        PostModeDetailParams postModeDetailParams = this.LJLJJI;
        if (postModeDetailParams != null && postModeDetailParams.needMobVideoPlay) {
            z2 = true;
        }
        postModeTimeLoggerViewModel.iv0(aweme, z, z2);
        LLFII().LJLLLLLL.setValue(C76800UCe.LIZ);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onResume", true);
        super.onResume();
        C203077y3 c203077y3 = ((PostModeTimeLoggerViewModel) this.LJLJJLL.getValue()).LJLIL;
        c203077y3.getClass();
        c203077y3.LIZ = Long.valueOf(System.currentTimeMillis());
        LLFII().LJLLLL.setValue(C76800UCe.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onResume", false);
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

    @Override // X.YUR, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        PostModeDetailPageFragment postModeDetailPageFragment;
        int i;
        int i2;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onCreate", true);
        PostModeDetailParams postModeDetailParams = (PostModeDetailParams) getIntent().getParcelableExtra("POST_DETAIL_PARAMS");
        this.LJLJJI = postModeDetailParams;
        if (postModeDetailParams != null && postModeDetailParams.useSwipeEnterAnim) {
            if (C26338AVi.LIZJ(this)) {
                i = R.anim.ft;
            } else {
                i = R.anim.fv;
            }
            if (C26338AVi.LIZJ(this)) {
                i2 = R.anim.g2;
            } else {
                i2 = R.anim.g0;
            }
            overridePendingTransition(i, i2);
        }
        activityConfiguration(C41180GEe.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.c1k);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
        Fragment LJJJIL = supportFragmentManager.LJJJIL("POST_MODE_DETAIL_PAGE_FRAGMENT");
        PhotoModeIngressEtData photoModeIngressEtData = null;
        if (!(LJJJIL instanceof PostModeDetailPageFragment) || (postModeDetailPageFragment = (PostModeDetailPageFragment) LJJJIL) == null) {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(getIntent());
            if (LLJJIJI == null) {
                LLJJIJI = new Bundle();
            }
            postModeDetailPageFragment = new PostModeDetailPageFragment();
            postModeDetailPageFragment.setArguments(LLJJIJI);
        }
        this.LJLJI = postModeDetailPageFragment;
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJ(postModeDetailPageFragment, "POST_MODE_DETAIL_PAGE_FRAGMENT", R.id.hzd);
        c1b3.LJI();
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModel = (PostModeTimeLoggerViewModel) this.LJLJJLL.getValue();
        PostModeDetailParams postModeDetailParams2 = (PostModeDetailParams) getIntent().getParcelableExtra("POST_DETAIL_PARAMS");
        if (postModeDetailParams2 != null) {
            photoModeIngressEtData = postModeDetailParams2.photoModeIngressEtData;
        }
        postModeTimeLoggerViewModel.LJLILLLLZI = photoModeIngressEtData;
        LLFII().LLF.observe(this, new AObserverS71S0100000_3(this, 68));
        LLFII().LLFFF.observe(this, new AObserverS71S0100000_3(this, 69));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity", "onCreate", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r4, "personal_homepage") != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFZ(com.ss.android.ugc.aweme.feed.model.Aweme r13, com.ss.android.ugc.aweme.model.PostModeDetailParams r14, java.lang.String r15) {
        /*
            r12 = this;
            r7 = r14
            if (r7 != 0) goto L4
            return
        L4:
            r6 = r13
            if (r6 != 0) goto L8
            return
        L8:
            java.lang.String r1 = r7.previousPage
            java.lang.String r5 = r7.tabName
            com.ss.android.ugc.aweme.profile.model.User r0 = r6.getAuthor()
            r4 = 0
            if (r0 == 0) goto L55
            java.lang.String r3 = r0.getUid()
        L17:
            java.lang.String r0 = "others_homepage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r2 = 1
            r1 = 0
            if (r0 != 0) goto L2f
            com.ss.android.ugc.aweme.model.PostModeDetailParams r0 = r12.LJLJJI
            if (r0 == 0) goto L27
            java.lang.String r4 = r0.previousPage
        L27:
            java.lang.String r0 = "personal_homepage"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 == 0) goto L57
        L2f:
            java.lang.String r0 = "repost_history"
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "like"
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r0)
            if (r0 != 0) goto L4e
        L3f:
            boolean r0 = r12.isDestroyed()
            if (r0 != 0) goto L4a
            r0 = 11010(0x2b02, float:1.5428E-41)
            r12.setResult(r0)
        L4a:
            r12.finish()
            return
        L4e:
            boolean r0 = X.C025908h.LJFF(r1, r3)
            if (r0 == 0) goto L57
            goto L3f
        L55:
            r3 = r4
            goto L17
        L57:
            r0 = 2131380670(0x7f0a49be, float:1.8381635E38)
            android.view.View r1 = r12._$_findCachedViewById(r0)
            X.Vmv r1 = (X.C80769Vmv) r1
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.ui.view.PostModeRtlViewPager"
            kotlin.jvm.internal.o.LJII(r1, r0)
            boolean r0 = r1.LLJJI
            if (r0 != 0) goto L6e
            r1.LLJJI = r2
            r1.LJJII()
        L6e:
            com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment r1 = r12.LJLJI
            if (r1 == 0) goto L8c
            X.84I r0 = r1.LJLJL
            if (r0 == 0) goto L8c
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            if (r0 == 0) goto L8c
            int r0 = r0.getCount()
            if (r0 <= r2) goto L8c
            X.84I r0 = r1.LJLJL
            if (r0 == 0) goto L8d
            int r0 = r0.getCurrentItem()
            if (r0 != r2) goto L8d
        L8c:
            return
        L8d:
            X.84I r0 = r1.LJLJL
            if (r0 != 0) goto L9c
        L91:
            java.lang.String r5 = "enter_personal_detail"
            r8 = 0
            r11 = 760(0x2f8, float:1.065E-42)
            r10 = r15
            r9 = r8
            X.C201467vS.LJIIIZ(r5, r6, r7, r8, r9, r10, r11)
            goto L8c
        L9c:
            r0.setCurrentItem(r2)
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity.LLFZ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.model.PostModeDetailParams, java.lang.String):void");
    }
}
