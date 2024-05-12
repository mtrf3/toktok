package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ID5 implements ERN {
    public int LIZ;
    public final List<F4V> LIZIZ;
    public final int LIZJ;
    public final C5NP LIZLLL;

    @Override // X.ERN
    public final ERS LIZ(T4S session) {
        C5NP c5np;
        o.LJIIIZ(session, "session");
        boolean z = false;
        if (this.LIZJ < this.LIZIZ.size()) {
            int i = this.LIZ + 1;
            this.LIZ = i;
            if (i <= 1) {
                z = true;
            }
            if (z) {
                ID5 id5 = new ID5(this.LIZIZ, this.LIZJ + 1, this.LIZLLL);
                F4V f4v = (F4V) ListProtector.get(this.LIZIZ, this.LIZJ);
                C5NP LIZLLL = C82891Wg3.LIZLLL();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DefaultStickerHandlerChain#useSticker:handler:");
                LIZ.append(f4v);
                LIZLLL.i(X1D.LIZIZ(LIZ));
                ERS LIZLLL2 = f4v.LIZLLL(id5, session);
                if (this.LIZJ + 1 < this.LIZIZ.size() && id5.LIZ < 1 && (c5np = this.LIZLLL) != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("handler:");
                    LIZ2.append(f4v);
                    LIZ2.append(" must call proceed() at least once");
                    c5np.w(X1D.LIZIZ(LIZ2));
                }
                return LIZLLL2;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("handler:");
            LIZ3.append(ListProtector.get(this.LIZIZ, this.LIZJ - 1));
            LIZ3.append(" must called useSticker() exactly once");
            String LIZIZ = X1D.LIZIZ(LIZ3);
            LIZIZ.toString();
            throw new IllegalStateException(LIZIZ);
        }
        "chain response beyond handlers size".toString();
        throw new IllegalStateException("chain response beyond handlers size");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ID5(List<? extends F4V> handlerList, int i, C5NP c5np) {
        o.LJIIIZ(handlerList, "handlerList");
        this.LIZIZ = handlerList;
        this.LIZJ = i;
        this.LIZLLL = c5np;
    }
}
