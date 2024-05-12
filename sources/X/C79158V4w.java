package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.V4w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79158V4w {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79158V4w)) {
            return false;
        }
        C79158V4w c79158V4w = (C79158V4w) obj;
        return o.LJ(this.LIZ, c79158V4w.LIZ) && o.LJ(this.LIZIZ, c79158V4w.LIZIZ) && o.LJ(this.LIZJ, c79158V4w.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextParams(title=");
        LIZ.append(this.LIZ);
        LIZ.append(", subtitle=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", button=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C79158V4w(String str, String subtitle, String str2) {
        o.LJIIIZ(subtitle, "subtitle");
        this.LIZ = str;
        this.LIZIZ = subtitle;
        this.LIZJ = str2;
    }
}
