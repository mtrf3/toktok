package com.bytedance.android.livesdk.chatroom.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableCacheLastSelectDefinitionSetting;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class SwitchDefinitionTipsWidgetLandV2 extends SwitchDefinitionTipsWidgetV2 {
    @Override // com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidgetV2, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidgetV2, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (EnableCacheLastSelectDefinitionSetting.INSTANCE.isEnableAutoTips()) {
            return R.layout.dqp;
        }
        return R.layout.dqq;
    }

    public SwitchDefinitionTipsWidgetLandV2(boolean z) {
        super(z);
    }
}
