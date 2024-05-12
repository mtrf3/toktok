package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C71471S3f;
import X.C86377XvB;
import X.InterfaceC86379XvD;
import X.InterfaceC86380XvE;
import X.LFH;
import Y.ACListenerS35S0100000_15;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ECommerceLiveServiceImpl;
import com.ss.android.ugc.aweme.feed.model.live.FypRecommendInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EcLiveFeedCardWidgetV1 extends BaseEcLiveFeedCardWidget {
    public final String LJLJJLL = "EcLiveFeedCardWidgetV1";

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final void LJZL() {
        InterfaceC86379XvD interfaceC86379XvD = this.LJLJI;
        if (interfaceC86379XvD != null && !interfaceC86379XvD.isDestroyed()) {
            return;
        }
        C71471S3f LIZJ = ECommerceLiveServiceImpl.LJFF().LIZJ();
        LIZJ.LIZJ = new ACListenerS35S0100000_15(this, 102);
        LIZJ.LIZIZ = new C86377XvB(this);
        LIZJ.LIZLLL = LL();
        LIZJ.LIZ = 1;
        this.LJLJI = LIZJ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final FrameLayout LJZI() {
        View findViewById = findViewById(R.id.fwg);
        InterfaceC86380XvE LJI = LFH.LIZIZ.LIZLLL().LJI();
        o.LJIIIIZZ(findViewById, "this");
        LJI.LIZJ(findViewById);
        o.LJIIIIZZ(findViewById, "findViewById<FrameLayout…ardLayout(this)\n        }");
        return (FrameLayout) findViewById;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final String LLFF() {
        return this.LJLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget
    public final boolean LJZ(FypRecommendInfo fypRecommendInfo) {
        if (fypRecommendInfo == null || fypRecommendInfo.getDisplayProductId() < 0 || 1 != fypRecommendInfo.getDisplayStyle()) {
            return false;
        }
        return true;
    }
}
