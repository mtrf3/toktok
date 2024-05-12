package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101603ym implements InterfaceC101733yz {
    @Override // X.InterfaceC101733yz
    public final void LIZLLL(EnumC101493yb privacy) {
        o.LJIIIZ(privacy, "privacy");
    }

    @Override // X.InterfaceC101733yz
    public final void LIZIZ(String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        C101573yj.LJIIJ(C101573yj.LIZ, 1, enterMethod, 4);
    }

    @Override // X.InterfaceC101733yz
    public final void LIZ(EnumC101633yp reason, String enterMethod) {
        o.LJIIIZ(reason, "reason");
        o.LJIIIZ(enterMethod, "enterMethod");
        C101573yj.LJFF(C101573yj.LIZ, 1, reason.getActionType(), enterMethod, 8);
    }

    @Override // X.InterfaceC101733yz
    public final void LIZJ(Context context, EnumC101493yb privacy) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(privacy, "privacy");
        C101543yg.LIZ.getClass();
        C101543yg.LIZIZ(context, R.string.eso, "chat", "dm_permission_popup_toast", "dm_permission_popup_toast", null);
        C101573yj.LIZ(C101573yj.LIZ, "send_message_with_no_one_permission", privacy.toEventTrackingPermission(), EnumC101583yk.SEND_MESSAGE_NO_ONE_PERMISSION, null, 24);
    }
}
