package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.CommentsMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CPL extends AbstractC31313CQr<CommentsMessage> {
    public static final CPL LIZJ = new CPL();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        CommentsMessage t = (CommentsMessage) obj;
        o.LJIIIZ(t, "t");
        return t.user;
    }
}
