package X;

import java.io.File;

/* renamed from: X.OOo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61834OOo implements W6U {
    public final String LIZ;
    public final C79238V7y LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    @Override // X.W6U
    public final String toString() {
        return C16880lQ.LLLZI(null, "%s_%s_%s_%d", new Object[]{this.LIZ, this.LIZIZ, this.LIZJ, Integer.valueOf(this.LIZLLL)});
    }

    @Override // X.W6U
    public final String LIZ() {
        return toString();
    }

    @Override // X.W6U
    public final int hashCode() {
        return this.LIZLLL;
    }

    @Override // X.W6U
    public final boolean LIZIZ(android.net.Uri uri) {
        return this.LIZ.contains(uri.toString());
    }

    @Override // X.W6U
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C61834OOo)) {
            return false;
        }
        C61834OOo c61834OOo = (C61834OOo) obj;
        if (this.LIZLLL == c61834OOo.LIZLLL && this.LIZ.equals(c61834OOo.LIZ) && this.LIZIZ.equals(c61834OOo.LIZIZ) && this.LIZJ.equals(c61834OOo.LIZJ)) {
            return true;
        }
        return false;
    }

    public C61834OOo(String str, C79238V7y c79238V7y, File file) {
        str.getClass();
        this.LIZ = str;
        c79238V7y.getClass();
        this.LIZIZ = c79238V7y;
        StringBuilder LIZ = X1D.LIZ();
        file.getClass();
        LIZ.append(Long.toString(file.lastModified()));
        LIZ.append(Long.toString(file.length()));
        this.LIZJ = X1D.LIZIZ(LIZ);
        int hashCode = str.hashCode();
        this.LIZLLL = ((((hashCode + 31) * 31) + c79238V7y.hashCode()) * 31) + str.hashCode();
    }
}
