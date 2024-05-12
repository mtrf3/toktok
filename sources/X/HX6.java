package X;

import X.HXV;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HX6<T extends HXV> {
    public int LIZIZ;
    public final java.util.Map<Integer, C40871j1<Boolean>> LIZ = new HashMap();
    public long LIZJ = System.currentTimeMillis();

    public final void LIZ(HX5 state) {
        o.LJIIIZ(state, "state");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dispatchScreenState current State:");
        LIZ.append(this.LIZIZ);
        LIZ.append("  target State: ");
        LIZ.append(state);
        H78.LJI(X1D.LIZIZ(LIZ));
        if (this.LIZIZ >= state.getValue()) {
            return;
        }
        while (this.LIZIZ < state.getValue()) {
            LIZJ("dispatchScreenState before update");
            int i = this.LIZIZ + 1;
            this.LIZIZ = i;
            LIZIZ(i).LJI(Boolean.TRUE);
            LIZJ("dispatchScreenState after update");
        }
    }

    public final C40871j1<Boolean> LIZIZ(int i) {
        C40871j1<Boolean> c40871j1 = (C40871j1) ((HashMap) this.LIZ).get(Integer.valueOf(i));
        if (c40871j1 == null) {
            C40871j1<Boolean> c40871j12 = new C40871j1<>(Boolean.FALSE);
            ((HashMap) this.LIZ).put(Integer.valueOf(i), c40871j12);
            return c40871j12;
        }
        return c40871j1;
    }

    public final void LIZJ(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LJFF = C72972SkS.LJFF(str, ' ');
        LJFF.append(currentTimeMillis - this.LIZJ);
        H78.LJI(X1D.LIZIZ(LJFF));
        this.LIZJ = currentTimeMillis;
    }
}
