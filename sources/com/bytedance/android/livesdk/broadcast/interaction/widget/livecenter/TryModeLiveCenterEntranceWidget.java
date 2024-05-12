package com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter;

import X.BZI;
import X.C28787BRn;
import X.C29306Beo;
import X.CCJ;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class TryModeLiveCenterEntranceWidget extends LiveWidget {
    public View LJLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.cv1;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        View view;
        super.onCreate();
        View view2 = getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.af5);
        } else {
            view = null;
        }
        this.LJLIL = view;
        BZI LIZ = C28787BRn.LIZ("livesdk_trymode_live_center_icon");
        LIZ.LJIIZILJ();
        LIZ.LIZJ("show");
        LIZ.LJIJJ(CardStruct.IStatusCode.DEFAULT, "is_violation");
        LIZ.LJJIIJZLJL();
        View view3 = getView();
        if (view3 != null) {
            C29306Beo.LJJJLL(view3, 500L, new AqS171S0100000_5(this, 148));
        }
        if (CCJ.LIZ(this.context)) {
            View view4 = this.LJLIL;
            if (view4 != null) {
                view4.setBackgroundResource(R.drawable.cwm);
                return;
            }
            return;
        }
        View view5 = this.LJLIL;
        if (view5 == null) {
            return;
        }
        view5.setBackgroundResource(R.drawable.cwk);
    }
}
