package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.AfW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26802AfW {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26802AfW)) {
            return false;
        }
        C26802AfW c26802AfW = (C26802AfW) obj;
        return o.LJ(this.LIZ, c26802AfW.LIZ) && o.LJ(this.LIZIZ, c26802AfW.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopMessage(messageKey=");
        LIZ.append(this.LIZ);
        LIZ.append(", content=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C26802AfW(String messageKey, String str) {
        o.LJIIIZ(messageKey, "messageKey");
        this.LIZ = messageKey;
        this.LIZIZ = str;
    }
}
