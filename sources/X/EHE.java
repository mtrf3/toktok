package X;

import java.util.ArrayList;
import kotlin.jvm.internal.AqS162S0100000_12;

/* loaded from: classes7.dex */
public final class EHE<T> {
    public static final /* synthetic */ int LJ = 0;
    public final InterfaceC65784Pro<? extends T> LIZ;
    public volatile XKQ LIZIZ;
    public volatile T LIZJ;
    public final ArrayList<InterfaceC88472Yns<T, C76800UCe>> LIZLLL = new ArrayList<>();

    public EHE(AqS162S0100000_12 aqS162S0100000_12) {
        this.LIZ = aqS162S0100000_12;
    }

    public static Object LIZ(EHE ehe) {
        T invoke;
        if (ehe.LIZJ != null) {
            return ehe.LIZJ;
        }
        synchronized (ehe) {
            XKQ xkq = ehe.LIZIZ;
            if (xkq == null) {
                return ehe.LIZ.invoke();
            }
            if (xkq.isCompleted()) {
                invoke = ehe.LIZJ;
            } else if (!xkq.isActive()) {
                invoke = ehe.LIZ.invoke();
            } else {
                invoke = null;
            }
            return invoke;
        }
    }
}
