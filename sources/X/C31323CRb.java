package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.CRb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31323CRb extends AbstractC03120Ai {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ List LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C31323CRb(List list, List list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        if (ListProtector.get(this.LIZ, i) == ListProtector.get(this.LIZIZ, i2)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        if (ListProtector.get(this.LIZ, i) == ListProtector.get(this.LIZIZ, i2)) {
            return true;
        }
        return false;
    }
}
