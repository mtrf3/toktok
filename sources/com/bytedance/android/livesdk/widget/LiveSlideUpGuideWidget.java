package com.bytedance.android.livesdk.widget;

import X.B8U;
import X.C15540jG;
import X.C47061t0;
import X.C47121t6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class LiveSlideUpGuideWidget extends LiveRecyclableWidget {
    public C47061t0 LJLIL;
    public C47121t6 LJLILLLLZI;
    public C15540jG LJLJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dij;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        C15540jG c15540jG = this.LJLJI;
        if (c15540jG != null) {
            c15540jG.LIZ();
        }
        this.LJLJI = null;
        B8U.LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLIL = (C47061t0) findViewById(R.id.k4k);
        C47121t6 c47121t6 = (C47121t6) findViewById(R.id.kwu);
        this.LJLILLLLZI = c47121t6;
        if (c47121t6 != null) {
            c47121t6.setAlpha(0.0f);
        }
        C47061t0 c47061t0 = this.LJLIL;
        if (c47061t0 != null) {
            c47061t0.setAlpha(0.0f);
        }
        C15540jG c15540jG = new C15540jG();
        this.LJLJI = c15540jG;
        c15540jG.LIZIZ = "tiktok_live_watch_resource_normal_1";
        c15540jG.LIZJ = "ttlive_arrow_up.webp";
        C47061t0 c47061t02 = this.LJLIL;
        if (c47061t02 != null) {
            c15540jG.LIZ = c47061t02;
        }
        c15540jG.LJFF = true;
        c15540jG.LJI = Integer.MAX_VALUE;
        c15540jG.LJIIL = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C15540jG c15540jG = this.LJLJI;
        if (c15540jG != null) {
            c15540jG.LIZIZ();
        }
        C15540jG c15540jG2 = this.LJLJI;
        if (c15540jG2 != null) {
            c15540jG2.LJ();
        }
    }
}
