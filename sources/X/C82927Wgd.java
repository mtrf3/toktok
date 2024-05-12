package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Wgd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82927Wgd extends AbstractC82929Wgf {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C82927Wgd) && o.LJ(this.LIZ, ((C82927Wgd) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OpenInExternalBrowser(link=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C82927Wgd(String link) {
        o.LJIIIZ(link, "link");
        this.LIZ = link;
    }
}
