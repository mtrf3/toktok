package X;

import com.bytedance.gift.render.engine.alphaplayer.controller.LocalPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes15.dex */
public class VXZ implements IMediaPlayer.OnPreparedListener<AbsPlayer<AbsPlayer>> {
    public final /* synthetic */ LocalPlayerController LIZ;

    public VXZ(LocalPlayerController localPlayerController) {
        this.LIZ = localPlayerController;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnPreparedListener
    public final void onPrepared(AbsPlayer<AbsPlayer> absPlayer) {
        this.LIZ.LJFF(LocalPlayerController.LIZIZ(2, null));
    }
}
