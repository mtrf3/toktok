package X;

import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveAudienceIntroSetting;
import com.bytedance.android.livesdk.model.message.LiveIntroMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CKG implements InterfaceC31330CRi<LiveIntroMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(LiveIntroMessage message, CQQ context) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (BroadcastLiveAudienceIntroSetting.INSTANCE.disable() && !C29306Beo.LJIIJ(context.LJIIIIZZ)) {
            return true;
        }
        return false;
    }
}
