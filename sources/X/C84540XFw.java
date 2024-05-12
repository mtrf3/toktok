package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.XFw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84540XFw {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i = this.LIZ * 31;
        boolean z = this.LIZIZ;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i + i3) * 31;
        if (!this.LIZJ) {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str = this.LIZLLL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i5 + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionData(subID=");
        LIZ.append(this.LIZ);
        LIZ.append(", translated=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", realtimeTranslation=");
        LIZ.append(this.LIZJ);
        LIZ.append(", realtimeFilePath=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84540XFw)) {
            return false;
        }
        C84540XFw c84540XFw = (C84540XFw) obj;
        if (this.LIZ == c84540XFw.LIZ && this.LIZIZ == c84540XFw.LIZIZ && this.LIZJ == c84540XFw.LIZJ && o.LJ(this.LIZLLL, c84540XFw.LIZLLL)) {
            return true;
        }
        return false;
    }

    public C84540XFw(int i, String str, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str;
    }
}
