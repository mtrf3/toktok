package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.8YS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8YS extends SZD {
    public final AssemViewModel<?> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8YS) && o.LJ(this.LIZJ, ((C8YS) obj).LIZJ);
    }

    public final int hashCode() {
        AssemViewModel<?> assemViewModel = this.LIZJ;
        if (assemViewModel == null) {
            return 0;
        }
        return assemViewModel.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ViewModelSubscribePerformanceParams(vm=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C8YS(AssemViewModel<?> assemViewModel) {
        this.LIZJ = assemViewModel;
    }
}
