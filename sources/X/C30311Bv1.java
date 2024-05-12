package X;

import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.LiveIllegalPresenter;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.Bv1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30311Bv1 extends AbstractC30130Bs6 {
    public final /* synthetic */ LiveBroadcastFragment LIZ;

    public C30311Bv1(LiveBroadcastFragment liveBroadcastFragment) {
        this.LIZ = liveBroadcastFragment;
    }

    @Override // X.AbstractC30130Bs6
    public final void LIZ(RemindMessage remindMessage) {
        o.LJIIIZ(remindMessage, "remindMessage");
        LiveIllegalPresenter liveIllegalPresenter = this.LIZ.LJLZ;
        if (liveIllegalPresenter != null) {
            liveIllegalPresenter.onMessage(remindMessage);
        } else {
            o.LJIJI("mLiveIllegalPresenter");
            throw null;
        }
    }
}
