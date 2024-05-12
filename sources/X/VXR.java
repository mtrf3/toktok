package X;

import com.bytedance.gift.render.engine.alphaplayer.controller.LocalPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import defpackage.i0;

/* loaded from: classes15.dex */
public class VXR implements IMediaPlayer.OnErrorListener<AbsPlayer<AbsPlayer>> {
    public final /* synthetic */ LocalPlayerController LIZ;

    public VXR(LocalPlayerController localPlayerController) {
        this.LIZ = localPlayerController;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnErrorListener
    public final void onError(AbsPlayer<AbsPlayer> absPlayer, int i, int i2, String str) {
        this.LIZ.LIZJ(false, i, i2, i0.LJFF("mediaPlayer error, info:", str));
        this.LIZ.LIZ(new C78163Ulz(-23, i0.LJFF("mediaPlayer error, info:", str), (Throwable) null));
    }
}
