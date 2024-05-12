package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.ScreenMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CPX extends AbstractC31313CQr<ScreenMessage> {
    public static final CPX LIZJ = new CPX();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        ScreenMessage t = (ScreenMessage) obj;
        o.LJIIIZ(t, "t");
        return t.userInfo;
    }
}
