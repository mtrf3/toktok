package X;

import android.os.SystemClock;
import com.bytedance.android.live.GuidanceVisibilityChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CQ9 implements InterfaceC31318CQw<SocialMessage> {
    public long LIZ;
    public int LIZIZ;

    @Override // X.InterfaceC31318CQw
    public final boolean LIZIZ(SocialMessage message) {
        o.LJIIIZ(message, "message");
        if (this.LIZ == message.getMessageId()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC31318CQw
    public final boolean LIZ(CQQ context, CR6 cr6) {
        C19690px c19690px;
        SocialMessage message = (SocialMessage) cr6;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (!context.LJFF) {
            return false;
        }
        User user = message.user;
        if ((user != null && context.LIZLLL() == user.getId()) || message.action != 1) {
            return false;
        }
        if (this.LIZIZ == 0) {
            this.LIZIZ = 1;
            DataChannel dataChannel = context.LJIIIIZZ;
            if (dataChannel == null || (c19690px = (C19690px) dataChannel.kv0(C54812Dd.class)) == null || !c19690px.LIZIZ || SystemClock.uptimeMillis() - context.LJIILL <= c19690px.LJI) {
                return false;
            }
            DataChannel dataChannel2 = context.LJIIIIZZ;
            if (dataChannel2 != null && o.LJ(dataChannel2.kv0(GuidanceVisibilityChannel.class), Boolean.TRUE)) {
                return false;
            }
            this.LIZ = message.getMessageId();
        } else if (this.LIZ != message.getMessageId()) {
            return false;
        }
        return true;
    }
}
