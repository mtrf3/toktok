package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.CPi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31278CPi extends AbstractC31313CQr<MemberMessage> {
    public static final C31278CPi LIZJ = new C31278CPi();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        MemberMessage t = (MemberMessage) obj;
        o.LJIIIZ(t, "t");
        return t.user;
    }

    @Override // X.AbstractC31313CQr
    public final boolean LJII(CR6 cr6, boolean z) {
        MemberMessage t = (MemberMessage) cr6;
        o.LJIIIZ(t, "t");
        if (t.action != 1) {
            return false;
        }
        if (!z && t.baseMessage.foldType == 0) {
            return false;
        }
        if (t.displayStyle == 2 && z) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC31313CQr
    public final boolean LJIIIZ(CR6 t, boolean z) {
        o.LJIIIZ(t, "t");
        return false;
    }
}
