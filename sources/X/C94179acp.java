package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.acp, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94179acp extends AbstractC03120Ai {
    public final List<C94178aco> LIZ;
    public final List<C94178aco> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C94179acp(List<C94178aco> list, List<C94178aco> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        return o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(((C94178aco) ListProtector.get(this.LIZ, i)).LJLIL, ((C94178aco) ListProtector.get(this.LIZIZ, i2)).LJLIL);
    }

    @Override // X.AbstractC03120Ai
    public final Object LIZJ(int i, int i2) {
        C94178aco c94178aco = (C94178aco) ListProtector.get(this.LIZ, i);
        C94178aco c94178aco2 = (C94178aco) ListProtector.get(this.LIZIZ, i2);
        if ((c94178aco.LJLJJI != c94178aco2.LJLJJI || c94178aco.LJLJJLL != c94178aco2.LJLJJLL || c94178aco.LJLJJL != c94178aco2.LJLJJL || (!o.LJ(c94178aco.LJLJI, c94178aco2.LJLJI))) && o.LJ(c94178aco.LJLILLLLZI, c94178aco2.LJLILLLLZI)) {
            return C76800UCe.LIZ;
        }
        return null;
    }
}
