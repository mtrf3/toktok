package com.bytedance.tiktok.homepage.mainfragment.toolbar.search;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C2MZ;
import X.C57122Ma;
import X.C62822Ol8;
import X.C65352Pkq;
import X.InterfaceC74236TBo;
import X.LP6;
import X.LPA;
import X.LPD;
import X.TBV;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SearchIconTipsHelper implements GenericLifecycleObserver {
    public static final SearchIconTipsHelper LJLIL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLILLLLZI;
    public static final LPA LJLJI;
    public static ActivityC45651qj LJLJJI;
    public static TuxIconView LJLJJL;
    public static LP6 LJLJJLL;
    public static final C62822Ol8 LJLJL;

    static {
        TBV tbv = new TBV(SearchIconTipsHelper.class, "isMainPageVisible", "isMainPageVisible()Z", 0);
        C65352Pkq.LIZ.getClass();
        LJLILLLLZI = new InterfaceC74236TBo[]{tbv};
        LJLIL = new SearchIconTipsHelper();
        LJLJI = new LPA(Boolean.FALSE);
        LJLJL = C221108m2.LIZIZ(LPD.LJLIL);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            release();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void release() {
        LJLJJI = null;
        LJLJJL = null;
    }

    public static boolean LIZ() {
        ActivityC45651qj activityC45651qj = LJLJJI;
        if (activityC45651qj == null) {
            return false;
        }
        return o.LJ(((FeedPanelStateViewModel) ViewModelProviders.of(activityC45651qj).get(FeedPanelStateViewModel.class)).LJLLILLLL.getValue(), Boolean.TRUE);
    }

    public static boolean LIZIZ() {
        ActivityC45651qj activityC45651qj = LJLJJI;
        if (activityC45651qj == null) {
            return false;
        }
        FeedPanelStateViewModel feedPanelStateViewModel = (FeedPanelStateViewModel) ViewModelProviders.of(activityC45651qj).get(FeedPanelStateViewModel.class);
        boolean z = C57122Ma.LIZ;
        C2MZ.LIZ();
        boolean z2 = !z;
        if (!o.LJ(feedPanelStateViewModel.LJLILLLLZI.getValue(), Boolean.TRUE) && !z2) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL() {
        ActivityC45651qj activityC45651qj = LJLJJI;
        if (activityC45651qj == null) {
            return false;
        }
        return o.LJ(((FeedPanelStateViewModel) ViewModelProviders.of(activityC45651qj).get(FeedPanelStateViewModel.class)).LJLJL.getValue(), Boolean.TRUE);
    }

    public final boolean LIZJ() {
        return LJLJI.LIZ(this, LJLILLLLZI[0]).booleanValue();
    }
}
