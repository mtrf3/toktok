package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2l3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67612l3 {
    public static final Keva LIZ = Keva.getRepo("consent_event_tracking_repo");
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final XI8 LIZJ = new XI8(C16880lQ.LLLLZLLIL());

    public static void LIZ(boolean z) {
        AtomicBoolean atomicBoolean = LIZIZ;
        atomicBoolean.set(z);
        if (atomicBoolean.get()) {
            XKX.LIZLLL(C48841JEv.LIZ(LIZJ), null, null, new C67592l1(null), 3);
        }
    }
}
