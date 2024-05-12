package X;

import com.zhiliaoapp.musically.R;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.552, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass552 {
    public final boolean LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public AnonymousClass552() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass552)) {
            return false;
        }
        AnonymousClass552 anonymousClass552 = (AnonymousClass552) obj;
        return this.LIZ == anonymousClass552.LIZ && o.LJ(this.LIZIZ, anonymousClass552.LIZIZ) && this.LIZJ == anonymousClass552.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.LIZIZ;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DownloadingIconConfig(enableDownloadingIcon=");
        LIZ.append(this.LIZ);
        LIZ.append(", lottieFileName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", iconBackground=");
        return b0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public AnonymousClass552(int i) {
        this.LIZ = false;
        this.LIZIZ = null;
        this.LIZJ = R.color.yi;
    }
}
