package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.C30922CBq;
import X.C54992Dv;
import X.InterfaceC21020s6;
import X.WHQ;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorMockVideoSizeConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorMockVideoSize;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.ttlivestreamer.core.engine.IShortVideoPushManager;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;

/* loaded from: classes15.dex */
public final class MockVideoControlWidget extends LiveWidget {
    public TTVideoEngine LJLIL;
    public Surface LJLILLLLZI;
    public Surface LJLJI;
    public IShortVideoPushManager LJLJJI;
    public final AnchorMockVideoSizeConfig LJLJJL = LiveAnchorMockVideoSize.INSTANCE.getValue();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.ded;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        LiveCore liveCore;
        if (C30922CBq.LIZIZ) {
            TTVideoEngine tTVideoEngine = this.LJLIL;
            if (tTVideoEngine != null) {
                tTVideoEngine.LLJJJJJIL();
            }
            TTVideoEngine tTVideoEngine2 = this.LJLIL;
            if (tTVideoEngine2 != null) {
                tTVideoEngine2.LJJLIIIJILLIZJL();
            }
            IShortVideoPushManager iShortVideoPushManager = this.LJLJJI;
            if (iShortVideoPushManager != null) {
                iShortVideoPushManager.release();
            }
            this.LJLIL = null;
            this.LJLJJI = null;
            InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class);
            if (interfaceC21020s6 != null && (liveCore = interfaceC21020s6.getLiveCore()) != null) {
                liveCore.switchVideoCapture(1);
            }
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        ViewGroup viewGroup;
        TextureView textureView;
        super.onCreate();
        if (C30922CBq.LIZIZ && (viewGroup = this.containerView) != null && (textureView = (TextureView) viewGroup.findViewById(R.id.l5z)) != null) {
            textureView.setVisibility(0);
            textureView.setSurfaceTextureListener(new WHQ(this));
        }
    }
}
