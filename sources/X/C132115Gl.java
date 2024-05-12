package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.5Gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132115Gl {
    public final String LIZ;
    public final String LIZIZ;

    public C132115Gl() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C132115Gl)) {
            return false;
        }
        C132115Gl c132115Gl = (C132115Gl) obj;
        return o.LJ(this.LIZ, c132115Gl.LIZ) && o.LJ(this.LIZIZ, c132115Gl.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditorProMusicMobBean(fromLocation=");
        LIZ.append(this.LIZ);
        LIZ.append(", type=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C132115Gl(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
