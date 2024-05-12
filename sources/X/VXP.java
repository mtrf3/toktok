package X;

import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes15.dex */
public final class VXP implements IMediaPlayer.OnCompletionListener<AbsPlayer<AbsPlayer>> {
    public final /* synthetic */ PlayerController LIZ;

    public VXP(PlayerController playerController) {
        this.LIZ = playerController;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnCompletionListener
    public final void onCompletion(AbsPlayer<AbsPlayer> absPlayer) {
        if (this.LIZ.isAttached && this.LIZ.isLooping) {
            return;
        }
        PlayerController playerController = this.LIZ;
        if (playerController.autoRelease) {
            playerController.alphaVideoView.onCompletion();
            this.LIZ.masks.clear();
        }
        PlayerController playerController2 = this.LIZ;
        playerController2.state = VXQ.PAUSED;
        playerController2.monitor(true, null);
        this.LIZ.emitEndSignal();
    }
}
