package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3Uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84893Uv {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C109544Rq c109544Rq) {
        int msgType = c109544Rq.getMsgType();
        if (msgType != 5) {
            if (msgType != 11 && msgType != 1809) {
                if (msgType != 7) {
                    if (msgType != 8) {
                        return "card";
                    }
                } else {
                    return "text";
                }
            }
            return "video";
        }
        return "GIF";
    }

    public static void LIZIZ(C109544Rq c109544Rq, boolean z, HashMap hashMap) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C84883Uu(c109544Rq, z, hashMap, onEventV3, null), 3);
    }
}
