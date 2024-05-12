package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import X.ActivityC45651qj;
import X.C34710Djm;
import X.C54254LRa;
import X.C54255LRb;
import X.C56722Km;
import X.C88099Yhr;
import X.C9XU;
import X.G27;
import X.InterfaceC54132LMi;
import X.InterfaceC65784Pro;
import X.InterfaceC82683Wch;
import X.LRR;
import X.LV0;
import X.QD3;
import X.Z8A;
import Y.ARunnableS45S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public final class FissionPopupWindowHelp implements GenericLifecycleObserver, G27 {
    public UgAwemeActivitySetting LJLIL;
    public C54254LRa LJLILLLLZI;
    public final Fragment LJLJI;
    public final ScrollSwitchStateManager LJLJJI;
    public final View LJLJJL;
    public View LJLJJLL;
    public ViewStub LJLJL;
    public FeedPanelStateViewModel LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI = true;
    public boolean LJLLILLLL;
    public final InterfaceC65784Pro<Boolean> LJLLJ;
    public boolean LJLLL;

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LJLLILLLL = false;
        LIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        View view;
        IHomePageService iHomePageService;
        InterfaceC54132LMi homeTabViewModel;
        this.LJLLILLLL = true;
        if (this.LJLLI && ((Boolean) C88099Yhr.LJI.getValue()).booleanValue()) {
            this.LJLLI = false;
            return;
        }
        if (this.LJLLI && ((Boolean) C34710Djm.LJJIIJZLJL.getValue()).booleanValue()) {
            this.LJLLI = false;
            return;
        }
        ActivityC45651qj mo49getActivity = this.LJLJI.mo49getActivity();
        if (mo49getActivity != null && (iHomePageService = (IHomePageService) ServiceManager.get().getService(IHomePageService.class)) != null && (homeTabViewModel = iHomePageService.getHomeTabViewModel(mo49getActivity)) != null) {
            view = homeTabViewModel.Vd();
        } else {
            view = null;
        }
        this.LJLJJLL = view;
        this.LJLJL = (ViewStub) this.LJLJJL.findViewById(R.id.bx2);
        if (this.LJLJLJ == null) {
            this.LJLJLJ = (FeedPanelStateViewModel) ViewModelProviders.of(this.LJLJI.requireActivity()).get(FeedPanelStateViewModel.class);
        }
        if (LV0.LJI) {
            UgAwemeActivitySetting ugAwemeActivitySetting = LV0.LJII.LIZ;
            this.LJLIL = ugAwemeActivitySetting;
            if (ugAwemeActivitySetting == null) {
                return;
            }
            LIZIZ();
            return;
        }
        if (this.LJLJLLL) {
            return;
        }
        this.LJLJLLL = true;
        LV0 lv0 = LV0.LJII;
        C54255LRb c54255LRb = new C54255LRb(this);
        lv0.getClass();
        ((ArrayList) lv0.LIZIZ).add(new WeakReference(c54255LRb));
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
        InterfaceC82683Wch interfaceC82683Wch;
        C54254LRa c54254LRa = this.LJLILLLLZI;
        if (c54254LRa != null) {
            o.LJI(c54254LRa);
            Context context = c54254LRa.LIZ;
            if (context != null && (context instanceof Activity) && !((Activity) context).isFinishing() && (interfaceC82683Wch = c54254LRa.LIZJ) != null) {
                interfaceC82683Wch.dismiss();
            }
        }
    }

    public final void LIZIZ() {
        long j;
        ARunnableS45S0100000_9 aRunnableS45S0100000_9 = new ARunnableS45S0100000_9(this, 17);
        View view = this.LJLJJLL;
        long j2 = 0;
        if (view != null) {
            if (C54254LRa.LIZLLL) {
                j = 0;
            } else {
                j = 4000;
            }
            view.postDelayed(aRunnableS45S0100000_9, j);
        }
        View view2 = this.LJLJJLL;
        if (view2 != null) {
            ARunnableS45S0100000_9 aRunnableS45S0100000_92 = new ARunnableS45S0100000_9(this, 16);
            if (Z8A.LIZIZ.showBubbleInCouponKeva()) {
                j2 = 4000;
            }
            view2.postDelayed(aRunnableS45S0100000_92, j2);
        }
    }

    @QD3
    public final void onScrolledToProfileTab(C56722Km c56722Km) {
        LIZ();
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        LIZ();
    }

    public FissionPopupWindowHelp(LRR lrr, Fragment fragment, View view, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.LJLJI = fragment;
        this.LJLJJI = scrollSwitchStateManager;
        this.LJLJJL = view;
        this.LJLLJ = lrr;
        Lifecycle lifecycle = fragment.getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        }
        EventBus.LIZJ().LJIILJJIL(this);
        ActivityC45651qj requireActivity = fragment.requireActivity();
        o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
        C9XU.LIZIZ(requireActivity, this);
    }
}
