package com.ss.android.ugc.aweme.draft.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DraftCherEffectParam {

    @InterfaceC65349Pkn("duration")
    public final double[] duration;

    @InterfaceC65349Pkn("matrix")
    public final String[] matrix;

    @InterfaceC65349Pkn("seg_user_cher")
    public final boolean[] segUseCher;

    /* JADX WARN: Multi-variable type inference failed */
    public DraftCherEffectParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DraftCherEffectParam(matrix=");
        LIZ.append(Arrays.toString(this.matrix));
        LIZ.append(", duration=");
        LIZ.append(Arrays.toString(this.duration));
        LIZ.append(", segUseCher=");
        LIZ.append(Arrays.toString(this.segUseCher));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.segUseCher) + ((Arrays.hashCode(this.duration) + (Arrays.hashCode(this.matrix) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(DraftCherEffectParam.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.draft.model.DraftCherEffectParam");
        DraftCherEffectParam draftCherEffectParam = (DraftCherEffectParam) obj;
        if (Arrays.equals(this.matrix, draftCherEffectParam.matrix) && Arrays.equals(this.duration, draftCherEffectParam.duration) && Arrays.equals(this.segUseCher, draftCherEffectParam.segUseCher)) {
            return true;
        }
        return false;
    }

    public DraftCherEffectParam(String[] matrix, double[] duration, boolean[] segUseCher) {
        o.LJIIIZ(matrix, "matrix");
        o.LJIIIZ(duration, "duration");
        o.LJIIIZ(segUseCher, "segUseCher");
        this.matrix = matrix;
        this.duration = duration;
        this.segUseCher = segUseCher;
    }

    public /* synthetic */ DraftCherEffectParam(String[] strArr, double[] dArr, boolean[] zArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String[0] : strArr, (i & 2) != 0 ? new double[0] : dArr, (i & 4) != 0 ? new boolean[0] : zArr);
    }
}
