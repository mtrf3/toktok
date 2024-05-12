package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.1AE, reason: invalid class name */
/* loaded from: classes.dex */
public class C1AE extends C018205i {
    public ArrayList<C018205i> LIZ = new ArrayList<>();

    public void LIZLLL() {
        ArrayList<C018205i> arrayList = this.LIZ;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C018205i c018205i = (C018205i) ListProtector.get(this.LIZ, i);
            if (c018205i instanceof C1AE) {
                ((C1AE) c018205i).LIZLLL();
            }
        }
    }

    @Override // X.C018205i
    public void reset() {
        this.LIZ.clear();
        super.reset();
    }

    @Override // X.C018205i
    public final void resetSolverVariables(C14X c14x) {
        super.resetSolverVariables(c14x);
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            ((C018205i) ListProtector.get(this.LIZ, i)).resetSolverVariables(c14x);
        }
    }

    @Override // X.C018205i
    public final void setOffset(int i, int i2) {
        super.setOffset(i, i2);
        int size = this.LIZ.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C018205i) ListProtector.get(this.LIZ, i3)).setOffset(getRootX(), getRootY());
        }
    }
}
