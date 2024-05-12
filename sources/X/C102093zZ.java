package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3zZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102093zZ {
    public C109544Rq LIZ;
    public int LIZIZ;
    public final C62822Ol8 LIZJ;

    public final boolean LIZ() {
        int i = this.LIZIZ;
        if (i != 2 && i != 3 && !C93793mB.LIZLLL(this.LIZ)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SpotReadState:{");
        LIZ.append(this.LIZ.getMsgId());
        LIZ.append(", ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", [");
        LIZ.append(this.LIZJ.getValue());
        LIZ.append("]}");
        return X1D.LIZIZ(LIZ);
    }

    public C102093zZ(C109544Rq message, C99033ud c99033ud) {
        o.LJIIIZ(message, "message");
        this.LIZ = message;
        this.LIZIZ = -1;
        this.LIZJ = C221108m2.LIZIZ(C102113zb.LJLIL);
    }
}
