package com.ss.android.ugc.aweme.commercialize.widget;

import X.C207668Da;
import X.C59344NQu;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes11.dex */
public abstract class AbsAdFeedWidget extends Widget implements Observer {
    public Aweme LJLJLJ;
    public Fragment LJLJLLL;
    public String LJLL;

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void LJIILJJIL() {
        DataCenter dataCenter = this.LJLJJI;
        if (dataCenter != null) {
            dataCenter.iv0("ad_feed_video_params", this, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.LJLJJI;
        if (dataCenter != null) {
            dataCenter.kv0(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onPause() {
        super.onPause();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onResume() {
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIL(View view) {
        C59344NQu c59344NQu;
        DataCenter dataCenter = this.LJLJJI;
        if (dataCenter != null && (c59344NQu = (C59344NQu) dataCenter.get("ad_feed_video_params")) != null) {
            this.LJLJLJ = c59344NQu.LIZ;
            this.LJLJLLL = c59344NQu.LIZIZ;
            this.LJLL = c59344NQu.LIZJ;
        }
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: LJIILL, reason: merged with bridge method [inline-methods] */
    public void onChanged(C207668Da c207668Da) {
        String str;
        Object obj = null;
        if (c207668Da == null || (str = c207668Da.LIZ) == null || str.hashCode() != 1512987055 || !str.equals("ad_feed_video_params")) {
            return;
        }
        Object obj2 = c207668Da.LIZIZ;
        if (obj2 != null) {
            obj = obj2;
        }
        C59344NQu c59344NQu = (C59344NQu) obj;
        if (c59344NQu == null) {
            return;
        }
        this.LJLJLJ = c59344NQu.LIZ;
        this.LJLJLLL = c59344NQu.LIZIZ;
        this.LJLL = c59344NQu.LIZJ;
    }
}
