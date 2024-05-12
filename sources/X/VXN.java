package X;

import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes15.dex */
public class VXN implements IMediaPlayer.OnPreparedListener<AbsPlayer<AbsPlayer>> {
    public final /* synthetic */ PlayerControllerNormal LIZ;

    public VXN(PlayerControllerNormal playerControllerNormal) {
        this.LIZ = playerControllerNormal;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnPreparedListener
    public final void onPrepared(AbsPlayer<AbsPlayer> absPlayer) {
        try {
            this.LIZ.LIZJ();
            PlayerControllerNormal playerControllerNormal = this.LIZ;
            playerControllerNormal.LJLJI = VXQ.PREPARED;
            playerControllerNormal.startPlay();
        } catch (Exception e) {
            this.LIZ.LIZ();
            PlayerControllerNormal playerControllerNormal2 = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("start video failure:");
            LIZ.append(android.util.Log.getStackTraceString(e));
            playerControllerNormal2.LIZIZ(false, 0, 0, X1D.LIZIZ(LIZ));
        }
    }
}
