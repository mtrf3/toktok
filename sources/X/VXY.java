package X;

import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes15.dex */
public final class VXY implements IMediaPlayer.OnFirstFrameListener<AbsPlayer<AbsPlayer>> {
    public final /* synthetic */ PlayerController LIZ;

    public VXY(PlayerController playerController) {
        this.LIZ = playerController;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnFirstFrameListener
    public final void onFirstFrame(AbsPlayer<AbsPlayer> absPlayer) {
        this.LIZ.alphaVideoView.LJIIIZ();
    }
}
