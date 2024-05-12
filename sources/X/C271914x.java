package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.14x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C271914x {
    public final List<C263311p> LIZ;
    public PointF LIZIZ;
    public boolean LIZJ;

    public C271914x() {
        this.LIZ = new ArrayList();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShapeData{numCurves=");
        LIZ.append(((ArrayList) this.LIZ).size());
        LIZ.append("closed=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, '}', LIZ);
    }

    public C271914x(PointF pointF, boolean z, List<C263311p> list) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        this.LIZIZ = pointF;
        this.LIZJ = z;
        arrayList.addAll(list);
    }
}
