package X;

import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* renamed from: X.VXa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79890VXa implements IMediaPlayer.OnPreparedListener<AbsPlayer<AbsPlayer>> {
    public final /* synthetic */ PlayerController LIZ;

    public C79890VXa(PlayerController playerController) {
        this.LIZ = playerController;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnPreparedListener
    public final void onPrepared(AbsPlayer<AbsPlayer> absPlayer) {
        this.LIZ.sendMessage(PlayerController.getMessage(2, null));
    }
}
