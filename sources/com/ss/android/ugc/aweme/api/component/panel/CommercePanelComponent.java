package com.ss.android.ugc.aweme.api.component.panel;

import X.AbstractC55082Lja;
import X.C212428Vi;
import X.C221108m2;
import X.C242549fW;
import X.C2MA;
import X.C2MJ;
import X.C56509MFt;
import X.C58190Msc;
import X.C62822Ol8;
import X.X1D;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class CommercePanelComponent extends BasePanelUIComponent implements GenericLifecycleObserver, C2MJ {
    public int LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            destroy();
        }
    }

    public CommercePanelComponent() {
        new LinkedHashMap();
        this.LJLJJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 33));
        this.LJLJJLL = C221108m2.LIZIZ(C58190Msc.LJLIL);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        Lifecycle lifecycle;
        ((IFeedService) this.LJLJJLL.getValue()).LIZ(getContext(), C56509MFt.LIZLLL(getPanelContext()));
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (lifecycle = LIZLLL.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
    }

    public final void v3() {
        PagerAdapter pagerAdapter;
        PagerAdapter pagerAdapter2;
        IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LJLJJL.getValue();
        PagerAdapter pagerAdapter3 = null;
        if (iViewPagerAbility != null) {
            pagerAdapter = iViewPagerAbility.LJJLIIIJJIZ();
        } else {
            pagerAdapter = null;
        }
        if (pagerAdapter == null) {
            C242549fW.LIZ("adPreRenderCheck viewPagerAbility?.getAdapter() == null");
            return;
        }
        if (C212428Vi.LIZ(this) == null) {
            C242549fW.LIZ("adPreRenderCheck viewPagerAbility?.getAdapter() == null");
            return;
        }
        IViewPagerAbility iViewPagerAbility2 = (IViewPagerAbility) this.LJLJJL.getValue();
        if (iViewPagerAbility2 != null) {
            pagerAdapter2 = iViewPagerAbility2.LJJLIIIJJIZ();
        } else {
            pagerAdapter2 = null;
        }
        if (pagerAdapter2 instanceof AbstractC55082Lja) {
            IViewPagerAbility iViewPagerAbility3 = (IViewPagerAbility) this.LJLJJL.getValue();
            if (iViewPagerAbility3 != null) {
                pagerAdapter3 = iViewPagerAbility3.LJJLIIIJJIZ();
            }
            o.LJII(pagerAdapter3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.AbstractFeedAdapter");
            List<Aweme> Q8 = ((AbstractC55082Lja) pagerAdapter3).Q8();
            ((IFeedService) this.LJLJJLL.getValue()).LIZLLL(this.LJLJJI, getContext(), C56509MFt.LIZLLL(getPanelContext()), Q8);
            ((IFeedService) this.LJLJJLL.getValue()).LIZIZ(this.LJLJJI, C212428Vi.LIZ(this), C56509MFt.LIZLLL(getPanelContext()), Q8);
            return;
        }
        C242549fW.LIZ("ERROR!! viewPagerAbility?.getAdapter() is not AbstractFeedAdapter");
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            C242549fW.LIZ("adPreRenderCheck when onPageScrollStateChanged SCROLL_STATE_IDLE");
            v3();
        }
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPageSelected,position = ");
        LIZ.append(i);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        this.LJLJJI = i;
        if (i == 0) {
            C242549fW.LIZ("adPreRenderCheck when onPageSelected first in");
            v3();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Lifecycle lifecycle;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJLJJL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.De0(this);
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (lifecycle = LIZLLL.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }
}
