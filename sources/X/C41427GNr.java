package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GNr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41427GNr extends AbstractC03120Ai {
    public final List<C41426GNq> LIZ;
    public final List<C41426GNq> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final Object LIZJ(int i, int i2) {
        return null;
    }

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C41427GNr(List<C41426GNq> mOldList, List<C41426GNq> list) {
        o.LJIIIZ(mOldList, "mOldList");
        this.LIZ = mOldList;
        this.LIZIZ = list;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        C41426GNq c41426GNq = (C41426GNq) ListProtector.get(this.LIZ, i);
        C41426GNq c41426GNq2 = (C41426GNq) ListProtector.get(this.LIZIZ, i2);
        if ((c41426GNq instanceof C41425GNp) && (c41426GNq2 instanceof C41425GNp)) {
            C41425GNp c41425GNp = (C41425GNp) c41426GNq;
            C41425GNp c41425GNp2 = (C41425GNp) c41426GNq2;
            if (o.LJ(c41425GNp.LJFF, c41425GNp2.LJFF) && c41425GNp.LJI == c41425GNp2.LJI && o.LJ(c41425GNp.LJIIJ, c41425GNp2.LJIIJ) && o.LJ(c41425GNp.LJIIIIZZ, c41425GNp2.LJIIIIZZ)) {
                return true;
            }
            return false;
        }
        return o.LJ(c41426GNq, c41426GNq2);
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }
}
