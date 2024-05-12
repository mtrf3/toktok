package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93053kz implements C33Q {
    public final C93063l0 LJLIL;

    public C93053kz() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C93053kz) && o.LJ(this.LJLIL, ((C93053kz) obj).LJLIL);
    }

    public final int hashCode() {
        C93063l0 c93063l0 = this.LJLIL;
        if (c93063l0 == null) {
            return 0;
        }
        return c93063l0.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageReplyState(replyData=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C93053kz(C93063l0 c93063l0) {
        this.LJLIL = c93063l0;
    }
}
