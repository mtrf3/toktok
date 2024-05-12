package X;

import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X9E {
    public final ModelInfo LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public X9E(ModelInfo modelInfo) {
        o.LJIIJ(modelInfo, "modelInfo");
        this.LIZ = modelInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            return o.LJ(this.LIZ, ((X9E) obj).LIZ);
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.ss.ugc.effectplatform.model.LoadedModelList.ModelInfoState");
    }
}
