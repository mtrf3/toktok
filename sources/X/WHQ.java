package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.bytedance.android.livesdk.broadcast.interaction.widget.MockVideoControlWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorMockVideoSizeConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorVideoMockPath;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.core.engine.IShortVideoPushManager;
import com.ss.ttlivestreamer.core.engine.ShortVideoPushManager;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WHQ extends TextureViewSurfaceTextureListenerC79521VIv {
    public final /* synthetic */ MockVideoControlWidget LJLIL;

    public WHQ(MockVideoControlWidget mockVideoControlWidget) {
        this.LJLIL = mockVideoControlWidget;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i, int i2) {
        LiveCore liveCore;
        Surface surface2;
        o.LJIIIZ(surface, "surface");
        AnchorMockVideoSizeConfig anchorMockVideoSizeConfig = this.LJLIL.LJLJJL;
        surface.setDefaultBufferSize(anchorMockVideoSizeConfig.width, anchorMockVideoSizeConfig.height);
        this.LJLIL.LJLILLLLZI = new Surface(surface);
        MockVideoControlWidget mockVideoControlWidget = this.LJLIL;
        mockVideoControlWidget.getClass();
        InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) DataChannelGlobal.LJLJJI.mv0(C54992Dv.class);
        if (interfaceC21020s6 == null || (liveCore = interfaceC21020s6.getLiveCore()) == null) {
            return;
        }
        liveCore.switchVideoCapture(4);
        TTVideoEngine tTVideoEngine = new TTVideoEngine(mockVideoControlWidget.context, 0);
        tTVideoEngine.LJLJJLL(LiveAnchorVideoMockPath.INSTANCE.getValue());
        tTVideoEngine.LJLLLL(199, 1);
        tTVideoEngine.LJLLLL(7, 1);
        tTVideoEngine.LLFII(true);
        tTVideoEngine.LLILZIL(mockVideoControlWidget.LJLILLLLZI);
        tTVideoEngine.LJJLI();
        mockVideoControlWidget.LJLIL = tTVideoEngine;
        IShortVideoPushManager createShortVideoPushManager = ShortVideoPushManager.createShortVideoPushManager(liveCore.getBuilder().getContext(), liveCore.getBuilder().getVideoCaptureWidth(), liveCore.getBuilder().getVideoCaptureHeight(), liveCore.getBuilder().getVideoFps(), new P3D(liveCore));
        mockVideoControlWidget.LJLJJI = createShortVideoPushManager;
        if (createShortVideoPushManager != null) {
            surface2 = createShortVideoPushManager.getSurface();
        } else {
            surface2 = null;
        }
        mockVideoControlWidget.LJLJI = surface2;
        IShortVideoPushManager iShortVideoPushManager = mockVideoControlWidget.LJLJJI;
        if (iShortVideoPushManager != null) {
            AnchorMockVideoSizeConfig anchorMockVideoSizeConfig2 = mockVideoControlWidget.LJLJJL;
            iShortVideoPushManager.activeSurface(surface2, anchorMockVideoSizeConfig2.width, anchorMockVideoSizeConfig2.height);
        }
        TTVideoEngine tTVideoEngine2 = mockVideoControlWidget.LJLIL;
        if (tTVideoEngine2 == null) {
            return;
        }
        tTVideoEngine2.LJLLI(mockVideoControlWidget.LJLJI, 1);
    }
}
