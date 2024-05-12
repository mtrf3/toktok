package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.SubNotifyMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CPK extends AbstractC31313CQr<SubNotifyMessage> {
    public static final CPK LIZJ = new CPK();

    @Override // X.AbstractC31313CQr
    public final boolean LJIIIIZZ(SubNotifyMessage subNotifyMessage) {
        SubNotifyMessage t = subNotifyMessage;
        o.LJIIIZ(t, "t");
        if (t.exhibitionType == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        SubNotifyMessage t = (SubNotifyMessage) obj;
        o.LJIIIZ(t, "t");
        return t.user;
    }

    @Override // X.AbstractC31313CQr
    public final boolean LJII(CR6 cr6, boolean z) {
        SubNotifyMessage t = (SubNotifyMessage) cr6;
        o.LJIIIZ(t, "t");
        if (t.exhibitionType < 2) {
            return true;
        }
        return false;
    }
}
