package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import X.ActivityC45651qj;
import X.C61182ag;
import X.C76800UCe;
import X.C9XU;
import X.G27;
import X.HG3;
import X.IG6;
import X.InterfaceC54232LQe;
import X.InterfaceC65784Pro;
import X.LRQ;
import X.M8V;
import X.QD3;
import X.X1D;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class SafeInfoNoticePopupWindowHelp implements GenericLifecycleObserver, G27 {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public final InterfaceC54232LQe LJLILLLLZI;
    public final View LJLJI;
    public final AmeBaseFragment LJLJJI;
    public final TabChangeManager LJLJJL;
    public M8V LJLJJLL;
    public boolean LJLJL;

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LJLJL = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        TabChangeManager tabChangeManager;
        this.LJLJL = true;
        if (HG3.LJIILL().isLogin()) {
            Keva repo = Keva.getRepo("account_security_keva_name");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("prior_to_safe_info_");
            LIZ.append(HG3.LJIILL().getCurUserId());
            if (repo.getBoolean(X1D.LIZIZ(LIZ), false) || ((tabChangeManager = this.LJLJJL) != null && o.LJ("HOME", tabChangeManager.nv0()))) {
                LIZ();
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final void LIZ() {
        M8V m8v;
        M8V m8v2 = this.LJLJJLL;
        if (m8v2 != null) {
            o.LJI(m8v2);
            if (m8v2.isShowing() && (m8v = this.LJLJJLL) != null) {
                try {
                    m8v.dismiss();
                } catch (Exception unused) {
                }
            }
        }
        this.LJLIL.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.LJLJL
            if (r0 == 0) goto L2d
            java.lang.String r0 = "account_security_keva_name"
            com.bytedance.keva.Keva r3 = com.bytedance.keva.Keva.getRepo(r0)
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "prior_to_safe_info_"
            r2.append(r0)
            com.ss.android.ugc.aweme.IAccountUserService r1 = X.HG3.LJIILL()
            X.RBX r1 = (X.RBX) r1
            r0 = 0
            boolean r0 = X.C268713r.LIZIZ(r1, r2, r2, r3, r0)
            if (r0 != 0) goto L2a
            X.LQe r0 = r4.LJLILLLLZI
            if (r0 == 0) goto L2e
            int r0 = r0.getToastVisibility()
            if (r0 != 0) goto L2e
        L2a:
            r4.LIZ()
        L2d:
            return
        L2e:
            boolean r0 = X.LRU.LIZIZ()
            if (r0 != 0) goto L35
            goto L2d
        L35:
            X.M8V r0 = r4.LJLJJLL
            if (r0 == 0) goto L41
            if (r5 == 0) goto L5d
            r0.dismiss()     // Catch: java.lang.Exception -> L3e
        L3e:
            r0 = 0
            r4.LJLJJLL = r0
        L41:
            X.M8V r2 = new X.M8V
            com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment r0 = r4.LJLJJI
            android.content.Context r1 = r0.requireContext()
            java.lang.String r0 = "mFragment.requireContext()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.view.View r0 = r4.LJLJI
            r2.<init>(r1, r0)
            r4.LJLJJLL = r2
            r0 = 1
            r2.setTouchable(r0)
            X.M8V r1 = r4.LJLJJLL
            if (r1 != 0) goto L84
        L5d:
            com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment r0 = r4.LJLJJI
            X.1qj r0 = r0.mo49getActivity()
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment r0 = r4.LJLJJI
            X.1qj r0 = r0.mo49getActivity()
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L2d
            com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment r0 = r4.LJLJJI
            boolean r0 = r0.isViewValid()
            if (r0 == 0) goto L2d
            X.M8V r0 = r4.LJLJJLL
            if (r0 == 0) goto L2d
            r0.LIZIZ()
            goto L2d
        L84:
            r0 = 2130772121(0x7f010099, float:1.7147351E38)
            r1.setAnimationStyle(r0)
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainpagefragment.dialog.SafeInfoNoticePopupWindowHelp.LIZIZ(boolean):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onDiscoverSearchEvent(IG6 ig6) {
        if (ig6 != null) {
            if (ig6.LJLIL) {
                LIZ();
            } else {
                LIZIZ(false);
            }
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSafeInfoNoticeEvent(C61182ag c61182ag) {
        if (c61182ag != null) {
            if (c61182ag.LJLIL) {
                LIZ();
            } else {
                LIZIZ(false);
            }
        }
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        M8V m8v = this.LJLJJLL;
        if (m8v != null && m8v.isShowing()) {
            try {
                m8v.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public SafeInfoNoticePopupWindowHelp(AmeBaseFragment fragment, LRQ lrq, InterfaceC54232LQe interfaceC54232LQe, View view, TabChangeManager mTabChangeManager) {
        int i;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(mTabChangeManager, "mTabChangeManager");
        this.LJLIL = lrq;
        this.LJLILLLLZI = interfaceC54232LQe;
        this.LJLJI = view;
        this.LJLJJI = fragment;
        this.LJLJJL = mTabChangeManager;
        Lifecycle lifecycle = fragment.getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            i = mo49getActivity.hashCode();
        } else {
            i = 0;
        }
        C9XU.LIZ(i, this);
    }
}
