package X;

import com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelLimit;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uc5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77549Uc5 {
    public final List<Integer> LIZ = C47261Igj.LJJIJ(1);

    public static boolean LIZ(Boolean bool) {
        boolean z;
        Integer LIZJ = InterfaceC30442Bx8.LLLIIL.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GIFTS_EXCHANGE_CLICK_CANCEL_COUNT.value");
        if (LIZJ.intValue() >= LiveExchangeCancelLimit.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        Boolean notClickDontShowAgain = InterfaceC30442Bx8.LLLIILIL.LIZJ();
        if (bool == null || !o.LJ(bool, Boolean.TRUE) || !z) {
            return false;
        }
        o.LJIIIIZZ(notClickDontShowAgain, "notClickDontShowAgain");
        if (!notClickDontShowAgain.booleanValue()) {
            return false;
        }
        return true;
    }
}
