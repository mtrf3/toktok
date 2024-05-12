package com.bytedance.android.live.effect.livegoal;

import Y.IDRunnableS85S0100000;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.LiveGoalDialogShow;
import com.bytedance.android.live.effect.api.LiveGoalHighLightEvent;
import com.bytedance.android.live.effect.api.LiveGoalOverlayEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS416S0100000;

/* loaded from: classes.dex */
public final class LiveGoalEffectWidget extends LiveWidget {
    public View LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public boolean LJLJJLL = true;
    public boolean LJLJL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.de0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        View view2 = this.LJLJI;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        View view3 = this.LJLILLLLZI;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.LJLJI;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        this.LJLJL = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        View view;
        View view2;
        View view3;
        View view4;
        super.onCreate();
        View view5 = getView();
        View view6 = null;
        if (view5 != null) {
            view = view5.findViewById(R.id.drk);
        } else {
            view = null;
        }
        this.LJLIL = view;
        View view7 = getView();
        if (view7 != null) {
            view2 = view7.findViewById(R.id.lfr);
        } else {
            view2 = null;
        }
        this.LJLILLLLZI = view2;
        View view8 = getView();
        if (view8 != null) {
            view3 = view8.findViewById(R.id.aqs);
        } else {
            view3 = null;
        }
        this.LJLJI = view3;
        View view9 = this.LJLILLLLZI;
        if (view9 != null) {
            view9.setAlpha(0.0f);
        }
        View view10 = this.LJLJI;
        if (view10 != null) {
            view10.setAlpha(0.0f);
        }
        View view11 = getView();
        if (view11 != null) {
            view4 = view11.findViewById(R.id.lf4);
        } else {
            view4 = null;
        }
        this.LJLJJI = view4;
        View view12 = getView();
        if (view12 != null) {
            view6 = view12.findViewById(R.id.aq2);
        }
        this.LJLJJL = view6;
        View view13 = getView();
        if (view13 != null) {
            view13.post(new IDRunnableS85S0100000(this, 80));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, LiveGoalHighLightEvent.class, new IDqS416S0100000(this, 65));
            dataChannel.lv0(this, LiveGoalOverlayEvent.class, new IDqS416S0100000(this, 66));
            dataChannel.mv0(LiveGoalDialogShow.class, this, new IDqS416S0100000(this, 67));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        View view = getView();
        if (view != null) {
            view.post(new IDRunnableS85S0100000(this, 80));
        }
    }
}
