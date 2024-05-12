package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.PortalMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.CTn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31387CTn extends AbstractC31313CQr<PortalMessage> {
    public static final C31387CTn LIZJ = new C31387CTn();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        PortalMessage t = (PortalMessage) obj;
        o.LJIIIZ(t, "t");
        CU1 cu1 = t.payload;
        if (cu1 instanceof PortalMessage.PortalFinish) {
            o.LJII(cu1, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.PortalMessage.PortalFinish");
            return ((PortalMessage.PortalFinish) cu1).luckyPerson;
        }
        return null;
    }
}
