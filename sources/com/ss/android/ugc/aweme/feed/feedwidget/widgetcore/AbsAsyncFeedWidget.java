package com.ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import X.AnonymousClass924;
import X.C207668Da;
import X.C2300291a;
import X.C37179EiV;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.GenericWidget;

/* loaded from: classes5.dex */
public abstract class AbsAsyncFeedWidget extends GenericWidget {
    public abstract AnonymousClass924 LJIILL();

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStart() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStop() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIL(View view) {
        synchronized (C2300291a.LIZ) {
            if (!C2300291a.LIZJ) {
                C2300291a.LIZJ = true;
                C2300291a.LIZIZ = C37179EiV.LJFF;
            }
        }
        LJIILL();
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget
    /* renamed from: LJIILJJIL */
    public final void onChanged(C207668Da c207668Da) {
        if (c207668Da != null) {
            String str = c207668Da.LIZ;
            str.getClass();
            if (str.equals("video_params") && c207668Da.LIZIZ == null) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C207668Da c207668Da) {
        onChanged(c207668Da);
    }
}
