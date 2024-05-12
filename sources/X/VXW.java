package X;

import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import defpackage.i0;

/* loaded from: classes15.dex */
public class VXW implements IMediaPlayer.OnErrorListener<AbsPlayer<AbsPlayer>> {
    public final /* synthetic */ PlayerController LIZ;

    public VXW(PlayerController playerController) {
        this.LIZ = playerController;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnErrorListener
    public final void onError(AbsPlayer<AbsPlayer> absPlayer, int i, int i2, String str) {
        this.LIZ.monitor(false, i, i2, i0.LJFF("mediaPlayer error, info:", str));
        this.LIZ.emitEndSignal();
    }
}
