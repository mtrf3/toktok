package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.DiggMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CPU extends AbstractC31313CQr<DiggMessage> {
    public static final CPU LIZJ = new CPU();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        DiggMessage t = (DiggMessage) obj;
        o.LJIIIZ(t, "t");
        return t.user;
    }

    @Override // X.AbstractC31313CQr
    public final boolean LJI(CR6 t, boolean z) {
        o.LJIIIZ(t, "t");
        return true;
    }
}
