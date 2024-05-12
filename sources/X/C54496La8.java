package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS69S0400000_9;

/* renamed from: X.La8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54496La8 implements InterfaceC54498LaA {
    public static final C54496La8 LIZ = new C54496La8();
    public static final AtomicInteger LIZIZ = new AtomicInteger(0);
    public static final List<OSZ<Integer, InterfaceC65784Pro<C76800UCe>>> LIZJ = new ArrayList();
    public static final C64962gm LIZLLL = C48841JEv.LIZ(C78613UtF.LIZJ);
    public static final C0M6<String, Integer> LJ = new C0M6<>(999);

    @Override // X.InterfaceC54498LaA
    public final boolean LIZ(int i, boolean z, AqS69S0400000_9 aqS69S0400000_9) {
        int LJFF;
        if (z) {
            LJFF = LIZIZ.get();
        } else {
            LJFF = LJ.LJFF();
        }
        if (i < LJFF) {
            return false;
        }
        if (i == LJFF) {
            aqS69S0400000_9.invoke();
            return true;
        }
        ((ArrayList) LIZJ).add(new OSZ(Integer.valueOf(i), aqS69S0400000_9));
        return true;
    }
}
