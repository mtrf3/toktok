package X;

import com.bytedance.android.livesdkapi.host.IHostConfig;
import java.util.HashMap;

/* renamed from: X.Bbp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29121Bbp {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(B7W.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C29123Bbr.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C29122Bbq.LJLIL);
    public static int LIZLLL;

    public static HashMap LIZIZ() {
        return (HashMap) LIZ.getValue();
    }

    public static void LIZ() {
        LIZIZ().clear();
        ((IHostConfig) CN1.LIZ(IHostConfig.class)).TR("room_id", null);
    }

    public static void LIZJ(String str, String str2) {
        if (str2 != null) {
            LIZIZ().put(str, str2);
            ((IHostConfig) CN1.LIZ(IHostConfig.class)).TR(str, str2);
        }
    }
}
