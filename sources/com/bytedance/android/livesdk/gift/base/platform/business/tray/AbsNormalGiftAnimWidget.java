package com.bytedance.android.livesdk.gift.base.platform.business.tray;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.model.message.AssetMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LiveTrayMessage;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public abstract class AbsNormalGiftAnimWidget extends LiveRecyclableWidget {
    public boolean LJLIL;

    public abstract void LJLZ(GiftMessage giftMessage);

    public abstract void LJZ();

    public abstract void LJZI(AssetMessage assetMessage);

    public abstract void LJZL(GiftMessage giftMessage);

    public abstract void LL(LiveTrayMessage liveTrayMessage);

    public abstract void LLF(int i);

    public abstract void LLFF();

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }
}
