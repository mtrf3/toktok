package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3i3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91233i3 extends AbstractC89473fD {
    public final int LIZ;
    public final C109544Rq LIZIZ;
    public final C63540Owi LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91233i3)) {
            return false;
        }
        C91233i3 c91233i3 = (C91233i3) obj;
        return this.LIZ == c91233i3.LIZ && o.LJ(this.LIZIZ, c91233i3.LIZIZ) && o.LJ(this.LIZJ, c91233i3.LIZJ);
    }

    public final int hashCode() {
        int hashCode = (this.LIZIZ.hashCode() + (this.LIZ * 31)) * 31;
        C63540Owi c63540Owi = this.LIZJ;
        return hashCode + (c63540Owi == null ? 0 : c63540Owi.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OnSendMessageEvent(statusCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", message=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", metrics=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C91233i3(int i, C109544Rq message, C63540Owi c63540Owi) {
        o.LJIIIZ(message, "message");
        this.LIZ = i;
        this.LIZIZ = message;
        this.LIZJ = c63540Owi;
    }
}
