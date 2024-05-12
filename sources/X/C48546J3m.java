package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.J3m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48546J3m implements J3L {
    @Override // X.J3L
    public final void LIZ(C48545J3l c48545J3l) {
        float[] fArr = c48545J3l.LIZIZ;
        List<Float> oPTs = c48545J3l.LJ.getOPTs();
        if (oPTs != null && oPTs.size() >= 2) {
            float floatValue = ((Float) ListProtector.get(oPTs, 0)).floatValue();
            fArr[0] = (fArr[0] * floatValue) + ((Float) ListProtector.get(oPTs, 1)).floatValue();
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PredictRegressionOP evaluate invalid! opts:");
            LIZ.append(oPTs);
            X1D.LIZIZ(LIZ);
        }
    }
}
