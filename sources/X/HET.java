package X;

import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HET {
    public final Integer LIZ;
    public final CompileConfigResolution LIZIZ;

    public HET() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HET)) {
            return false;
        }
        HET het = (HET) obj;
        return o.LJ(this.LIZ, het.LIZ) && o.LJ(this.LIZIZ, het.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        CompileConfigResolution compileConfigResolution = this.LIZIZ;
        return hashCode + (compileConfigResolution != null ? compileConfigResolution.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomCutCompileConfig(resizeMode=");
        LIZ.append(this.LIZ);
        LIZ.append(", resolution=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public HET(Integer num, CompileConfigResolution compileConfigResolution) {
        this.LIZ = num;
        this.LIZIZ = compileConfigResolution;
    }
}
