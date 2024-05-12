package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ml.process.bl.AfOPModel;
import java.util.List;

/* renamed from: X.J3o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48548J3o implements J3L {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.J3L
    public final void LIZ(C48545J3l c48545J3l) {
        float[] fArr = c48545J3l.LIZIZ;
        AfOPModel afOPModel = c48545J3l.LJ;
        List<String> list = c48545J3l.LIZJ;
        List<String> labels = afOPModel.getLabels();
        int i = -1;
        float f = 0.0f;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            float f2 = fArr[i2];
            if (f <= f2) {
                i = i2;
                f = f2;
            }
        }
        list.add(ListProtector.get(labels, i));
    }
}
