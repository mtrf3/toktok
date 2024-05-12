package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BSx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28823BSx {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C28825BSz.LJLIL);

    public static void LIZIZ(Room room, String str, String str2, BT1 requestPage, String str3) {
        o.LJIIIZ(requestPage, "requestPage");
        if (room == null) {
            return;
        }
        C73943T0h.LIZ().LIZIZ(new B4R(room.getId()));
        C28824BSy.LIZ(room, str, str2, requestPage, str3);
    }

    public static void LIZ(Room room, String str, String str2, BT1 requestPage, String str3, boolean z, int i, boolean z2) {
        o.LJIIIZ(requestPage, "requestPage");
        if (room == null) {
            return;
        }
        if (!z || i <= 1 || z2) {
            C73943T0h.LIZ().LIZIZ(new B4R(room.getId()));
            C30868C9o.LIZJ(R.string.mg9);
            if (z2) {
                return;
            }
        }
        C28824BSy.LIZ(room, str, str2, requestPage, str3);
    }
}
