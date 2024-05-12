package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ml.process.bl.AfOPModel;
import java.util.List;

/* renamed from: X.J3n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48547J3n implements J3L {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.J3L
    public final void LIZ(C48545J3l c48545J3l) {
        float[] fArr = c48545J3l.LIZIZ;
        AfOPModel afOPModel = c48545J3l.LJ;
        List<String> list = c48545J3l.LIZJ;
        List<Float> oPTs = afOPModel.getOPTs();
        List<String> labels = afOPModel.getLabels();
        if (fArr[0] > ((Float) ListProtector.get(oPTs, 0)).floatValue()) {
            list.add(ListProtector.get(labels, 1));
        } else {
            list.add(ListProtector.get(labels, 0));
        }
    }
}
