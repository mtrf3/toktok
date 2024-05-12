package com.bytedance.android.livesdk.guide;

import X.C29306Beo;
import X.C29701Eo;
import X.C32652Crg;
import X.C73318Sq2;
import X.C73943T0h;
import X.C79004UzY;
import Y.AfS57S0100000_5;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class LiveBagGuideWidget extends LiveWidget {
    public C29701Eo LJLIL;
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dbm;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        this.LJLILLLLZI.LIZLLL();
        super.onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C29701Eo c29701Eo;
        super.onCreate();
        this.LJLIL = (C29701Eo) findViewById(R.id.ga0);
        if (C29306Beo.LJIIL(this.dataChannel) && (c29701Eo = this.LJLIL) != null) {
            c29701Eo.setVisibility(8);
        }
        this.LJLILLLLZI.LIZ(C79004UzY.LJJJJL(C73943T0h.LIZ().LJ(C32652Crg.class), new AfS57S0100000_5(this, 110)));
    }
}
