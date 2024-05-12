package X;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.4nz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120394nz {
    public static XI8 LIZ;

    public static XKW LIZ() {
        XI8 xi8 = LIZ;
        if (xi8 == null) {
            Executor LIZJ = C63346Ota.LIZJ();
            o.LJIIIIZZ(LIZJ, "getReceiveMsgExecutor()");
            xi8 = null;
            if (!(LIZJ instanceof ExecutorC120404o0) || LIZJ == null) {
                xi8 = new XI8(LIZJ);
            }
            LIZ = xi8;
        }
        return xi8;
    }
}
