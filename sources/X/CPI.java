package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.UnauthorizedMemberMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CPI extends AbstractC31313CQr<UnauthorizedMemberMessage> {
    public static final CPI LIZJ = new CPI();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        UnauthorizedMemberMessage t = (UnauthorizedMemberMessage) obj;
        o.LJIIIZ(t, "t");
        return new CPH(t.nickName);
    }

    @Override // X.AbstractC31313CQr
    public final boolean LJII(CR6 cr6, boolean z) {
        UnauthorizedMemberMessage t = (UnauthorizedMemberMessage) cr6;
        o.LJIIIZ(t, "t");
        if (t.action == 1 && (z || t.baseMessage.foldType != 0)) {
            return true;
        }
        return false;
    }
}
