package X;

import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.LiveIllegalPresenter;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.Bv6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30316Bv6 extends AbstractC30130Bs6 {
    public final /* synthetic */ VoiceChatBroadcastFragment LIZ;

    public C30316Bv6(VoiceChatBroadcastFragment voiceChatBroadcastFragment) {
        this.LIZ = voiceChatBroadcastFragment;
    }

    @Override // X.AbstractC30130Bs6
    public final void LIZ(RemindMessage remindMessage) {
        LiveIllegalPresenter liveIllegalPresenter = this.LIZ.LJLLI;
        if (liveIllegalPresenter != null) {
            liveIllegalPresenter.onMessage(remindMessage);
        } else {
            o.LJIJI("liveIllegalPresenter");
            throw null;
        }
    }
}
