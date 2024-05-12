package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;

/* renamed from: X.CSe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31352CSe implements IInterceptor {
    public long LIZ;

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof LikeMessage)) {
            return false;
        }
        LikeMessage likeMessage = (LikeMessage) iMessage;
        if (this.LIZ <= 0) {
            this.LIZ = C025908h.LIZ();
        }
        User user = likeMessage.user;
        if (user == null) {
            return true;
        }
        long j = this.LIZ;
        if (j <= 0 || j != user.getId() || likeMessage.isLocalInsertMsg) {
            return false;
        }
        return true;
    }
}
