package X;

import com.bytedance.android.livesdk.model.message.UnauthorizedMemberMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.CPn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31283CPn implements InterfaceC31330CRi<UnauthorizedMemberMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(UnauthorizedMemberMessage unauthorizedMemberMessage, CQQ context) {
        UnauthorizedMemberMessage message = unauthorizedMemberMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (message.action != 1) {
            CR3.LIZIZ(message, "UnAuthMemberMessageFilter discarded because it's not an enter message.");
            return true;
        }
        return false;
    }
}
