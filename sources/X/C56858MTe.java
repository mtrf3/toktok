package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MTe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56858MTe extends AbstractC03120Ai {
    public final List<C56859MTf> LIZ;
    public final List<C56859MTf> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C56858MTe(List<C56859MTf> oldList, List<C56859MTf> newList) {
        o.LJIIIZ(oldList, "oldList");
        o.LJIIIZ(newList, "newList");
        this.LIZ = oldList;
        this.LIZIZ = newList;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        return o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        if (((C56859MTf) ListProtector.get(this.LIZ, i)).LIZ == ((C56859MTf) ListProtector.get(this.LIZIZ, i2)).LIZ && o.LJ(((C56859MTf) ListProtector.get(this.LIZ, i)).LIZIZ, ((C56859MTf) ListProtector.get(this.LIZIZ, i2)).LIZIZ) && o.LJ(((C56859MTf) ListProtector.get(this.LIZ, i)).LIZJ, ((C56859MTf) ListProtector.get(this.LIZIZ, i2)).LIZJ) && o.LJ(((C56859MTf) ListProtector.get(this.LIZ, i)).LIZLLL, ((C56859MTf) ListProtector.get(this.LIZIZ, i2)).LIZLLL)) {
            return true;
        }
        return false;
    }
}
