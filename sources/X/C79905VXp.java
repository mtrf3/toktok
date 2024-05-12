package X;

import com.ss.android.ugc.aweme.comment.gift.ui.GiftAnimationFragment;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import kotlin.jvm.internal.o;

/* renamed from: X.VXp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79905VXp implements AlphaPlayerAction {
    public final /* synthetic */ GiftAnimationFragment LIZ;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
    public final void onVideoSizeChange(int i, int i2, DataSource.ScaleType scaleType) {
        o.LJIIIZ(scaleType, "scaleType");
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
    public final void startAction() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
    public final void endAction() {
        PlayerController playerController = this.LIZ.LJLIL;
        o.LJI(playerController);
        playerController.setVisibility(8);
        this.LIZ.vl();
    }

    public C79905VXp(GiftAnimationFragment giftAnimationFragment) {
        this.LIZ = giftAnimationFragment;
    }
}
