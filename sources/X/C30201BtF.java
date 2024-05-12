package X;

import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.LiveIllegalPresenter;
import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.BtF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30201BtF extends AbstractC30130Bs6 {
    public final /* synthetic */ GameBroadcastFragment LIZ;

    public C30201BtF(GameBroadcastFragment gameBroadcastFragment) {
        this.LIZ = gameBroadcastFragment;
    }

    @Override // X.AbstractC30130Bs6
    public final void LIZ(RemindMessage remindMessage) {
        LiveIllegalPresenter liveIllegalPresenter;
        o.LJIIIZ(remindMessage, "remindMessage");
        C10U c10u = this.LIZ.LJLLJ;
        if (c10u != null && (liveIllegalPresenter = ((C30196BtA) c10u).LJLJJL) != null) {
            liveIllegalPresenter.onMessage(remindMessage);
        }
    }
}
