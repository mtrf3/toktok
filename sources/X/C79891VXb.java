package X;

import com.bytedance.gift.render.engine.alphaplayer.controller.LocalPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.VXb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79891VXb implements IMediaPlayer.OnFirstFrameListener<AbsPlayer<AbsPlayer>> {
    public final /* synthetic */ LocalPlayerController LIZ;

    public C79891VXb(LocalPlayerController localPlayerController) {
        this.LIZ = localPlayerController;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnFirstFrameListener
    public final void onFirstFrame(AbsPlayer<AbsPlayer> absPlayer) {
        InterfaceC79452VGe interfaceC79452VGe = this.LIZ.LJLLJ;
        if (interfaceC79452VGe != null) {
            interfaceC79452VGe.LJIIIZ();
        }
    }
}
