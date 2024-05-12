package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CQF extends AbstractC31313CQr<LikeMessage> {
    public static final CQF LIZJ = new CQF();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        LikeMessage t = (LikeMessage) obj;
        o.LJIIIZ(t, "t");
        return t.user;
    }

    @Override // X.AbstractC31313CQr
    public final boolean LJII(CR6 t, boolean z) {
        o.LJIIIZ(t, "t");
        return true;
    }
}
