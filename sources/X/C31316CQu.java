package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;

/* renamed from: X.CQu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31316CQu implements IInterceptor {
    public long LIZ;

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof EmoteChatMessage)) {
            return false;
        }
        EmoteChatMessage emoteChatMessage = (EmoteChatMessage) iMessage;
        if (this.LIZ <= 0) {
            this.LIZ = C025908h.LIZ();
        }
        User user = emoteChatMessage.user;
        if (user == null) {
            return true;
        }
        long j = this.LIZ;
        if (j <= 0 || j != user.getId()) {
            return false;
        }
        return true;
    }
}
