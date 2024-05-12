package com.bytedance.android.livesdk.unityanimation.service;

import X.T3K;
import X.UOU;
import com.bytedance.android.live.unityanimation.service.IUnityAnimationService;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.unityanimation.event.UnityAnimationDataChannel;
import com.bytedance.android.livesdk.unityanimation.event.UnityAnimationDataDataChannel;
import com.bytedance.android.livesdk.unityanimation.widget.EventAreaUnityAnimationWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class UnityAnimationService implements IUnityAnimationService {
    @Override // com.bytedance.android.live.unityanimation.service.IUnityAnimationService
    public final Class<EventAreaUnityAnimationWidget> V80() {
        return EventAreaUnityAnimationWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.unityanimation.service.IUnityAnimationService
    public final void BQ(DataChannel dataChannel, String bid, UOU uou) {
        o.LJIIIZ(bid, "bid");
        if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
            if (dataChannel != null) {
                dataChannel.qv0(UnityAnimationDataChannel.class, new T3K(bid, uou));
                return;
            }
            return;
        }
        DataChannelGlobal.LJLJJI.sv0(UnityAnimationDataDataChannel.class, new T3K(bid, uou));
    }
}
