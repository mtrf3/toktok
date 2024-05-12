package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7PJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7PJ implements InterfaceC87283bg {
    public final String LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7PJ) && o.LJ(this.LJLIL, ((C7PJ) obj).LJLIL);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Entrance(entrance=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C7PJ(String str) {
        this.LJLIL = str;
    }
}
