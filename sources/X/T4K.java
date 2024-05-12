package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T4K implements F4V, InterfaceC63084OpM {
    public final CopyOnWriteArrayList<F4V> LJLIL = new CopyOnWriteArrayList<>();

    @Override // X.F4V
    public final int getPriority() {
        return T4M.LOOP_CHAIN_STICKER_PRIORITY.getPriority();
    }

    @Override // X.InterfaceC63084OpM
    public final F4V LLLIIII(InterfaceC88472Yns<? super F4V, Boolean> predicate) {
        F4V f4v;
        o.LJIIIZ(predicate, "predicate");
        Iterator<F4V> it = this.LJLIL.iterator();
        while (true) {
            if (it.hasNext()) {
                f4v = it.next();
                if (predicate.invoke(f4v).booleanValue()) {
                    break;
                }
            } else {
                f4v = null;
                break;
            }
        }
        return f4v;
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChainStickerHandler#onStickerChosen:session:");
        LIZ.append(session);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        ERS LIZ2 = ern.LIZ(session);
        Iterator<T> it = ORS.LJJLIIIJL(this.LJLIL).iterator();
        while (it.hasNext()) {
            F4V f4v = (F4V) it.next();
            C5NP LIZLLL2 = C82891Wg3.LIZLLL();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("ChainStickerHandler#onStickerChosen:handler:");
            LIZ3.append(f4v);
            LIZLLL2.i(X1D.LIZIZ(LIZ3));
            f4v.LIZLLL(ESO.LIZ, session);
        }
        return LIZ2;
    }
}
