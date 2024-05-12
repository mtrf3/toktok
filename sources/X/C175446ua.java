package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.6ua, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175446ua {
    public final EnumC177706yE LIZ;
    public final String LIZIZ;

    public C175446ua() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C175446ua)) {
            return false;
        }
        C175446ua c175446ua = (C175446ua) obj;
        return this.LIZ == c175446ua.LIZ && o.LJ(this.LIZIZ, c175446ua.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpvoteFooterInfo(status=");
        LIZ.append(this.LIZ);
        LIZ.append(", tip=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ C175446ua(int i) {
        this(EnumC177706yE.DEFAULT, "");
    }

    public C175446ua(EnumC177706yE status, String str) {
        o.LJIIIZ(status, "status");
        this.LIZ = status;
        this.LIZIZ = str;
    }
}
