package com.ss.android.ugc.aweme.following.ui;

import X.A03;
import X.A04;
import X.A05;
import X.A06;
import X.AMD;
import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC86117Xqz;
import X.C157166Eu;
import X.C16880lQ;
import X.C1B3;
import X.C201037ul;
import X.C235239Lb;
import X.C25903AEp;
import X.C26335AVf;
import X.C45804HyK;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65803Ps7;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C78966Uyw;
import X.C86298Xtu;
import X.C9NP;
import X.HG3;
import X.InterfaceC151715xP;
import X.InterfaceC18010nF;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.OHQ;
import X.RBX;
import X.TBW;
import X.TMG;
import X.W1T;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FollowRelationTabActivity extends ActivityC86117Xqz implements InterfaceC151715xP, AMD<C25903AEp>, InterfaceC18010nF {
    public static final /* synthetic */ int LJLJJI = 0;
    public final lifecycleAwareLazy LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C25903AEp LJLIL = new C25903AEp();

    static {
        new A06();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return "b7200";
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public FollowRelationTabActivity() {
        C65776Prg LIZ = C65352Pkq.LIZ(FollowRelationTabViewModel.class);
        this.LJLILLLLZI = new lifecycleAwareLazy(this, new AqS64S0400000_4(this, LIZ, A05.INSTANCE, LIZ, 11));
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public final void finish() {
        super.finish();
        if (!o.LJ(((FollowRelationTabViewModel) this.LJLILLLLZI.getValue()).LJLJJLL, "push")) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(C45804HyK.LJIJJ(this), "//main");
        buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
        buildRoute.addFlags(67108864);
        buildRoute.open();
        C201037ul.LIZ(7, this, false);
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

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ C25903AEp getViewModelFactory() {
        return this.LJLIL;
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        User curUser;
        String LLJJIJIIJIL;
        boolean z;
        boolean isAccuratePrivateAccount;
        boolean LIZIZ;
        String str;
        boolean z2;
        C65803Ps7.LIZ(this, bundle);
        boolean z3 = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onCreate", true);
        activityConfiguration(A04.LJLIL);
        super.onCreate(bundle);
        setContentView(R.layout.c2r);
        if (o.LJ(C16880lQ.LLJJIJIIJIL(getIntent(), "route_host_path"), "profile/followerlist") && (curUser = ((RBX) HG3.LJIILL()).getCurUser()) != null) {
            C78966Uyw.LJLJJLL = curUser;
            Intent intent = getIntent();
            intent.putExtra("uid", curUser.getUid());
            intent.putExtra("sec_uid", curUser.getSecUid());
            intent.putExtra("follow_relation_type", "follower_relation");
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(getIntent(), "enter_from");
            if (!o.LJ(LLJJIJIIJIL2, "push")) {
                LLJJIJIIJIL = "click_follow_back_notice";
            } else {
                LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(getIntent(), "gd_label");
            }
            ((FollowRelationTabViewModel) this.LJLILLLLZI.getValue()).LJLJJLL = LLJJIJIIJIL2;
            String str2 = "";
            if (LLJJIJIIJIL2 == null) {
                LLJJIJIIJIL2 = "";
            }
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            String uid = curUser.getUid();
            if (uid != null) {
                str2 = uid;
            }
            if (C9NP.LIZIZ() || C9NP.LIZJ()) {
                if (curUser.getFollowerCount() < 1000) {
                    z = true;
                } else {
                    z = false;
                }
                isAccuratePrivateAccount = (true ^ curUser.isAccuratePrivateAccount()) & z;
                LIZIZ = C235239Lb.LIZ().LIZIZ();
            } else {
                if (curUser.getFollowerCount() < 1000) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z2 & (!curUser.isAccuratePrivateAccount());
                if (curUser.getFriendCount() > 60) {
                    z3 = false;
                }
                isAccuratePrivateAccount = z3 & z4;
                LIZIZ = C235239Lb.LIZ().LIZIZ();
            }
            if ((isAccuratePrivateAccount & LIZIZ) && curUser.getNewFollowerCount() > 0) {
                str = String.valueOf(curUser.getNewFollowerCount());
            } else {
                str = null;
            }
            C26335AVf.LJII(LLJJIJIIJIL2, LLJJIJIIJIL, str2, str);
        }
        Fragment LJJJIL = getSupportFragmentManager().LJJJIL("follow_relation_tab");
        if (LJJJIL == null) {
            LJJJIL = new FollowRelationTabFragment();
        }
        LJJJIL.setArguments(C16880lQ.LLJJIJI(getIntent()));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        c1b3.LJIIJ(LJJJIL, "follow_relation_tab", R.id.dm7);
        c1b3.LJI();
        getOnBackPressedDispatcher().LIZ(this, new A03(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.following.ui.FollowRelationTabActivity", "onCreate", false);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity, X.C06Q
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] grantResults) {
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        o.LJIIIZ(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, strArr, grantResults);
        if (i == 1) {
            C86298Xtu.LIZIZ(this, i, grantResults);
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
