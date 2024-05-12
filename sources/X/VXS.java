package X;

import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes15.dex */
public final class VXS implements IMediaPlayer.OnCompletionListener<AbsPlayer<AbsPlayer>> {
    public final /* synthetic */ PlayerControllerNormal LIZ;

    public VXS(PlayerControllerNormal playerControllerNormal) {
        this.LIZ = playerControllerNormal;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnCompletionListener
    public final void onCompletion(AbsPlayer<AbsPlayer> absPlayer) {
        this.LIZ.LJLJLJ.onCompletion();
        PlayerControllerNormal playerControllerNormal = this.LIZ;
        playerControllerNormal.LJLJI = VXQ.PAUSED;
        playerControllerNormal.LIZIZ(true, 0, 0, null);
        this.LIZ.LIZ();
    }
}
