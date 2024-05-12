package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198537qj implements InterfaceC87283bg {
    public final String LJLIL;

    public C198537qj() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C198537qj) && o.LJ(this.LJLIL, ((C198537qj) obj).LJLIL);
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
        LIZ.append("HighlightSelectListData(shootFrom=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C198537qj(String str) {
        this.LJLIL = str;
    }
}
