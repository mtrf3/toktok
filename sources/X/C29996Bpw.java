package X;

import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.Bpw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29996Bpw implements InterfaceC31330CRi<LikeMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(LikeMessage likeMessage, CQQ context) {
        LikeMessage message = likeMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (message.isLocalInsertMsg && LiveLikeDegradeSettings.INSTANCE.disableAvatarAnim(context.LJIIIIZZ)) {
            return true;
        }
        if (!message.isLocalInsertMsg && LiveLikeDegradeSettings.INSTANCE.disableOtherLike(context.LJIIIIZZ)) {
            return true;
        }
        return false;
    }
}
