package X;

import com.bytedance.android.livesdk.model.message.MemberMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.CPz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31295CPz implements InterfaceC31330CRi<MemberMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(MemberMessage memberMessage, CQQ context) {
        MemberMessage message = memberMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        if (message.action != 1) {
            CR3.LIZIZ(message, "MemberMessage discarded because it's not an enter message.");
            return true;
        }
        return false;
    }
}
