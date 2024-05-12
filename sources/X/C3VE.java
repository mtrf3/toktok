package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3VE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VE {
    public final List<UrlModel> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3VE)) {
            return false;
        }
        C3VE c3ve = (C3VE) obj;
        return o.LJ(this.LIZ, c3ve.LIZ) && this.LIZIZ == c3ve.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaInfo(urls=");
        LIZ.append(this.LIZ);
        LIZ.append(", isAnimated=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3VE(List<? extends UrlModel> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
