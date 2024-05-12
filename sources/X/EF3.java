package X;

import android.app.Application;
import android.util.SparseBooleanArray;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class EF3 {
    public final /* synthetic */ C68322mC<HashMap<String, Integer>> LIZ;
    public final /* synthetic */ Application LIZIZ;
    public final /* synthetic */ SparseBooleanArray LIZJ;

    public final int LIZ() {
        Integer num = this.LIZ.element.get(C36839Ed1.LIZ(this.LIZIZ));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final EFC LIZIZ() {
        if (LIZ() == 0) {
            return EFC.WILD;
        }
        if (this.LIZJ.get(LIZ())) {
            return EFC.PRISON;
        }
        return EFC.NORMAL;
    }

    public EF3(Application application, SparseBooleanArray sparseBooleanArray, C68322mC c68322mC) {
        this.LIZ = c68322mC;
        this.LIZIZ = application;
        this.LIZJ = sparseBooleanArray;
    }
}
