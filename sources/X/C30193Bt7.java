package X;

import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.LiveIllegalPresenter;
import com.bytedance.android.livesdk.broadcast.obs.ObsBroadcastFragment;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.Bt7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30193Bt7 extends AbstractC30130Bs6 {
    public final /* synthetic */ ObsBroadcastFragment LIZ;

    public C30193Bt7(ObsBroadcastFragment obsBroadcastFragment) {
        this.LIZ = obsBroadcastFragment;
    }

    @Override // X.AbstractC30130Bs6
    public final void LIZ(RemindMessage remindMessage) {
        LiveIllegalPresenter liveIllegalPresenter;
        o.LJIIIZ(remindMessage, "remindMessage");
        C30196BtA c30196BtA = this.LIZ.LJLJL;
        if (c30196BtA != null && (liveIllegalPresenter = c30196BtA.LJLJJL) != null) {
            liveIllegalPresenter.onMessage(remindMessage);
        }
    }
}
