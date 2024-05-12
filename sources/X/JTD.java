package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JTD {
    public final byte[] LIZ;

    public JTD() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof JTD) && o.LJ(this.LIZ, ((JTD) obj).LIZ);
        }
        return true;
    }

    public final int hashCode() {
        byte[] bArr = this.LIZ;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxSSRConfig(lynxSSRTemplateData=");
        LIZ.append(Arrays.toString(this.LIZ));
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public JTD(byte[] bArr) {
        this.LIZ = bArr;
    }
}
