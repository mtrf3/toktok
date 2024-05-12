package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9pD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C248559pD {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C248559pD)) {
            return false;
        }
        C248559pD c248559pD = (C248559pD) obj;
        return o.LJ(this.LIZ, c248559pD.LIZ) && o.LJ(this.LIZIZ, c248559pD.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return this.LIZIZ.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadedSeriesCoverImage(uploadedUri=");
        LIZ.append(this.LIZ);
        LIZ.append(", localUri=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C248559pD(String str, String localUri) {
        o.LJIIIZ(localUri, "localUri");
        this.LIZ = str;
        this.LIZIZ = localUri;
    }
}
