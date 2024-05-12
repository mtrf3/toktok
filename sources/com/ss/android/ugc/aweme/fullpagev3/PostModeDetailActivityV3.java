package com.ss.android.ugc.aweme.fullpagev3;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C174366sq;
import X.C184077Kh;
import X.C1B3;
import X.C201027uk;
import X.C203077y3;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C26338AVi;
import X.C41126GCc;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65803Ps7;
import X.C76800UCe;
import X.C78926UyI;
import X.C8WN;
import X.EnumC201127uu;
import X.YUK;
import Y.AObserverS69S0100000_1;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PhotoModeIngressEtData;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;

/* loaded from: classes4.dex */
public final class PostModeDetailActivityV3 extends YUK {
    public PostModeDetailParams LJLJI;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 407));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 406));
    public final C214378bB LJLJJLL = new C214378bB(C65352Pkq.LIZ(PhotoSharedViewModel.class), new AqS153S0100000_3((ActivityC45651qj) this, 1672), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C201027uk.INSTANCE, C78926UyI.LJIIJJI(this), C78926UyI.LJIILL(this));

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

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fullpagev3.PostModeDetailActivityV3", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final PostModeContainerViewModel LLFII() {
        return (PostModeContainerViewModel) this.LJLJJI.getValue();
    }

    @Override // X.KMV, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        PostModeDetailParams postModeDetailParams = this.LJLJI;
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
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModel = (PostModeTimeLoggerViewModel) this.LJLJJL.getValue();
        Aweme aweme = ((PhotoSharedViewModel) this.LJLJJLL.getValue()).LJLILLLLZI;
        PostModeDetailParams postModeDetailParams = this.LJLJI;
        if (postModeDetailParams != null && postModeDetailParams.needMobVideoPlay) {
            z2 = true;
        }
        postModeTimeLoggerViewModel.iv0(aweme, z, z2);
        LLFII().LJLLLLLL.setValue(C76800UCe.LIZ);
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fullpagev3.PostModeDetailActivityV3", "onResume", true);
        super.onResume();
        C203077y3 c203077y3 = ((PostModeTimeLoggerViewModel) this.LJLJJL.getValue()).LJLIL;
        c203077y3.getClass();
        c203077y3.LIZ = Long.valueOf(System.currentTimeMillis());
        LLFII().LJLLLL.setValue(C76800UCe.LIZ);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fullpagev3.PostModeDetailActivityV3", "onResume", false);
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

    @Override // X.YUK, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fullpagev3.PostModeDetailActivityV3", "onCreate", true);
        PostModeDetailParams postModeDetailParams = (PostModeDetailParams) getIntent().getParcelableExtra("POST_DETAIL_PARAMS");
        this.LJLJI = postModeDetailParams;
        if (postModeDetailParams != null && postModeDetailParams.useSwipeEnterAnim) {
            if (C26338AVi.LIZJ(this)) {
                i2 = R.anim.ft;
            } else {
                i2 = R.anim.fv;
            }
            if (C26338AVi.LIZJ(this)) {
                i3 = R.anim.g2;
            } else {
                i3 = R.anim.g0;
            }
            overridePendingTransition(i2, i3);
        } else {
            overridePendingTransition(0, 0);
        }
        activityConfiguration(C41126GCc.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.c1k);
        Aweme aweme = ((PhotoSharedViewModel) this.LJLJJLL.getValue()).LJLILLLLZI;
        PhotoModeIngressEtData photoModeIngressEtData = null;
        if (aweme != null) {
            C174366sq c174366sq = new C174366sq(aweme.getAid());
            PostModeDetailParams postModeDetailParams2 = this.LJLJI;
            if (postModeDetailParams2 != null) {
                str = postModeDetailParams2.eventType;
            } else {
                str = null;
            }
            c174366sq.setEventType(str);
            c174366sq.setEnableMinInnerCommentPanelHeight(true);
            c174366sq.setShowTitle(true);
            c174366sq.setForceHideKeyboard(true);
            User author = aweme.getAuthor();
            if (author == null || (str2 = author.getUid()) == null) {
                str2 = "";
            }
            c174366sq.setAuthorUid(str2);
            c174366sq.setForceHideReplyWithVideo(true);
            c174366sq.setShowTopToastAfterComment(false);
            c174366sq.setForceHideKeyboard(true);
            c174366sq.setForceHideBatchManagementView(true);
            c174366sq.setForceHideCommentDesc(true);
            c174366sq.setForceHideDonation(true);
            c174366sq.setForceHidePoi(true);
            c174366sq.setIsFromPostMode(true);
            CommentService.LIZ.getClass();
            c174366sq.setCommentClose(CommentServiceImpl.LJJL().LJIILLIIL(aweme));
            c174366sq.setEnableComment(!aweme.isCmtSwt());
            PostModeDetailParams postModeDetailParams3 = this.LJLJI;
            if (postModeDetailParams3 != null) {
                str3 = postModeDetailParams3.previousPage;
            } else {
                str3 = null;
            }
            c174366sq.setEnterFrom(str3);
            c174366sq.setEnterMethod("click_comment_icon");
            PostModeDetailParams postModeDetailParams4 = this.LJLJI;
            if (postModeDetailParams4 != null) {
                i = postModeDetailParams4.pageType;
            } else {
                i = 0;
            }
            c174366sq.setPageType(i);
            PostModeDetailParams postModeDetailParams5 = this.LJLJI;
            if (postModeDetailParams5 == null) {
                postModeDetailParams5 = new PostModeDetailParams(0);
            }
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "photo_shared_vm_unique_key");
            Bundle bundle2 = new Bundle();
            if (LLJJIJIIJIL != null) {
                bundle2.putString("photo_shared_vm_unique_key", LLJJIJIIJIL);
            }
            bundle2.putSerializable("id", c174366sq);
            bundle2.putParcelable("POST_DETAIL_PARAMS", postModeDetailParams5);
            PostModeDetailFragmentV3 postModeDetailFragmentV3 = new PostModeDetailFragmentV3();
            postModeDetailFragmentV3.setArguments(bundle2);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIJ(postModeDetailFragmentV3, "PostModeDetailFragment", R.id.hzd);
            c1b3.LJIILJJIL();
        }
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModel = (PostModeTimeLoggerViewModel) this.LJLJJL.getValue();
        PostModeDetailParams postModeDetailParams6 = this.LJLJI;
        if (postModeDetailParams6 != null) {
            photoModeIngressEtData = postModeDetailParams6.photoModeIngressEtData;
        }
        postModeTimeLoggerViewModel.LJLILLLLZI = photoModeIngressEtData;
        LLFII().LLF.observe(this, new AObserverS69S0100000_1(this, 111));
        LLFII().LLFFF.observe(this, new AObserverS69S0100000_1(this, 112));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.fullpagev3.PostModeDetailActivityV3", "onCreate", false);
    }
}
