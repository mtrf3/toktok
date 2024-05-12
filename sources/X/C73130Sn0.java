package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.Sn0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73130Sn0 extends AbstractC03120Ai {
    public final List<?> LIZ;
    public final List<?> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        List<?> list = this.LIZIZ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        List<?> list = this.LIZ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C73130Sn0(List<?> list, List<?> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        if ((ListProtector.get(this.LIZ, i) instanceof InterfaceC73131Sn1) && (ListProtector.get(this.LIZIZ, i2) instanceof InterfaceC73131Sn1)) {
            return ((InterfaceC73131Sn1) ListProtector.get(this.LIZ, i)).LLILLIZIL(ListProtector.get(this.LIZIZ, i2));
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        if ((ListProtector.get(this.LIZ, i) instanceof InterfaceC73131Sn1) && (ListProtector.get(this.LIZIZ, i2) instanceof InterfaceC73131Sn1)) {
            return ((InterfaceC73131Sn1) ListProtector.get(this.LIZ, i)).LLLLLLZ(ListProtector.get(this.LIZIZ, i2));
        }
        if (ListProtector.get(this.LIZ, i) == ListProtector.get(this.LIZIZ, i2)) {
            return true;
        }
        return false;
    }
}
