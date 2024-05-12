package X;

import com.bytedance.retrofit2.mime.TypedOutput;
import kotlin.jvm.internal.o;

/* renamed from: X.EjF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37225EjF {
    public final String LIZ;
    public String LIZIZ;
    public final TypedOutput LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37225EjF)) {
            return false;
        }
        C37225EjF c37225EjF = (C37225EjF) obj;
        return o.LJ(this.LIZ, c37225EjF.LIZ) && o.LJ(this.LIZIZ, c37225EjF.LIZIZ) && o.LJ(this.LIZJ, c37225EjF.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TypedOutput typedOutput = this.LIZJ;
        return hashCode2 + (typedOutput != null ? typedOutput.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreloadKey(url=");
        LIZ.append(this.LIZ);
        LIZ.append(", key=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", body=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C37225EjF(String str, TypedOutput typedOutput) {
        this.LIZ = str;
        this.LIZIZ = null;
        this.LIZJ = typedOutput;
        try {
            java.net.URI uri = new java.net.URI(str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(uri.getScheme());
            LIZ.append(uri.getPath());
            LIZ.append(uri.getQuery());
            TypedOutput typedOutput2 = this.LIZJ;
            LIZ.append(typedOutput2 != null ? typedOutput2.md5Stub() : null);
            this.LIZIZ = String.valueOf(X1D.LIZIZ(LIZ).hashCode());
        } catch (Exception unused) {
            this.LIZIZ = "error";
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = "error";
        }
    }
}
