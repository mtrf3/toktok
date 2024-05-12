package X;

import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.VXc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79892VXc implements IMediaPlayer.OnFirstFrameListener<AbsPlayer<AbsPlayer>> {
    public final /* synthetic */ PlayerControllerNormal LIZ;

    public C79892VXc(PlayerControllerNormal playerControllerNormal) {
        this.LIZ = playerControllerNormal;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnFirstFrameListener
    public final void onFirstFrame(AbsPlayer<AbsPlayer> absPlayer) {
        this.LIZ.LJLJLJ.LJIIIZ();
    }
}
