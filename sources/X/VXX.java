package X;

import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import defpackage.i0;

/* loaded from: classes15.dex */
public class VXX implements IMediaPlayer.OnErrorListener<AbsPlayer<AbsPlayer>> {
    public final /* synthetic */ PlayerControllerNormal LIZ;

    public VXX(PlayerControllerNormal playerControllerNormal) {
        this.LIZ = playerControllerNormal;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnErrorListener
    public final void onError(AbsPlayer<AbsPlayer> absPlayer, int i, int i2, String str) {
        this.LIZ.LIZIZ(false, i, i2, i0.LJFF("mediaPlayer error, info:", str));
        this.LIZ.LIZ();
    }
}
