package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.1fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38851fl implements InterfaceC271214q {
    public final String LIZ;
    public final List<InterfaceC271214q> LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShapeGroup{name='");
        LIZ.append(this.LIZ);
        LIZ.append("' Shapes: ");
        LIZ.append(Arrays.toString(this.LIZIZ.toArray()));
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C38851fl(String str, List<InterfaceC271214q> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }

    @Override // X.InterfaceC271214q
    public final InterfaceC20640rU LIZ(C04740Go c04740Go, AbstractC45041pk abstractC45041pk) {
        return new C43611nR(c04740Go, abstractC45041pk, this);
    }
}
