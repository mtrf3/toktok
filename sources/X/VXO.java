package X;

import com.bytedance.gift.render.engine.alphaplayer.controller.LocalPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class VXO implements IMediaPlayer.OnCompletionListener<AbsPlayer<AbsPlayer>> {
    public final /* synthetic */ LocalPlayerController LIZ;

    public VXO(LocalPlayerController localPlayerController) {
        this.LIZ = localPlayerController;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer.OnCompletionListener
    public final void onCompletion(AbsPlayer<AbsPlayer> absPlayer) {
        if (this.LIZ.LJZ && this.LIZ.LLD) {
            return;
        }
        LocalPlayerController localPlayerController = this.LIZ;
        if (localPlayerController.LJZI) {
            InterfaceC79452VGe interfaceC79452VGe = localPlayerController.LJLLJ;
            if (interfaceC79452VGe != null) {
                interfaceC79452VGe.onCompletion();
            }
            ((ArrayList) this.LIZ.LJLJJI).clear();
        }
        LocalPlayerController localPlayerController2 = this.LIZ;
        localPlayerController2.LJLJJL = VXQ.PAUSED;
        localPlayerController2.LIZJ(true, 0, 0, null);
        this.LIZ.LIZ(null);
    }
}
