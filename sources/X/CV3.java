package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CV3 extends AbstractC03120Ai {
    public final List<CVC> LIZ;
    public final List<CVC> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        return true;
    }

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public CV3(List<CVC> list, List<CVC> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(((CVC) ListProtector.get(this.LIZ, i)).LJLIL, ((CVC) ListProtector.get(this.LIZIZ, i2)).LJLIL);
    }

    @Override // X.AbstractC03120Ai
    public final Object LIZJ(int i, int i2) {
        return 0;
    }
}
