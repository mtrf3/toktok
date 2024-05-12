package com.bytedance.android.livesdk.broadcast.preview.widget.livegoal;

import X.C15380j0;
import Y.ARunnableS41S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.effect.api.LiveGoalHighLightEvent;
import com.bytedance.android.live.effect.api.LiveGoalOverlayEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class PreviewLiveGoalEffectWidget extends PreviewWidget {
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public boolean LJLJLJ = true;
    public boolean LJLJLLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.de0;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LL() {
        View view = this.LJLJJI;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        View view2 = this.LJLJJL;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        View view3 = this.LJLJJI;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.LJLJJL;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        this.LJLJLLL = true;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        View view;
        View view2;
        View view3;
        View view4;
        int i;
        View view5;
        super.LJZ();
        View view6 = getView();
        View view7 = null;
        if (view6 != null) {
            view = view6.findViewById(R.id.drk);
        } else {
            view = null;
        }
        this.LJLJI = view;
        View view8 = getView();
        if (view8 != null) {
            view2 = view8.findViewById(R.id.lfr);
        } else {
            view2 = null;
        }
        this.LJLJJI = view2;
        View view9 = getView();
        if (view9 != null) {
            view3 = view9.findViewById(R.id.aqs);
        } else {
            view3 = null;
        }
        this.LJLJJL = view3;
        View view10 = this.LJLJJI;
        if (view10 != null) {
            view10.setAlpha(0.0f);
        }
        View view11 = this.LJLJJL;
        if (view11 != null) {
            view11.setAlpha(0.0f);
        }
        View view12 = getView();
        if (view12 != null) {
            view4 = view12.findViewById(R.id.lf4);
        } else {
            view4 = null;
        }
        this.LJLJJLL = view4;
        View view13 = getView();
        if (view13 != null) {
            view7 = view13.findViewById(R.id.aq2);
        }
        this.LJLJL = view7;
        View view14 = this.LJLJJI;
        if (view14 != null) {
            i = view14.getHeight();
        } else {
            i = 0;
        }
        if (i <= C15380j0.LIZ(130.0f) && (view5 = getView()) != null) {
            view5.post(new ARunnableS41S0100000_5(this, 66));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        DataChannel dataChannel = this.dataChannel;
        dataChannel.lv0(this, LiveGoalHighLightEvent.class, new AqS171S0100000_5(this, 203));
        dataChannel.lv0(this, LiveGoalOverlayEvent.class, new AqS171S0100000_5(this, 204));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        View view = getView();
        if (view != null) {
            view.post(new ARunnableS41S0100000_5(this, 67));
        }
    }
}
