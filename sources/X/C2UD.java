package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.2UD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2UD implements Serializable {
    public final String LJLIL;

    public static /* synthetic */ C2UD copy$default(C2UD c2ud, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2ud.LJLIL;
        }
        return c2ud.copy(str);
    }

    public final C2UD copy(String str) {
        return new C2UD(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2UD) && o.LJ(this.LJLIL, ((C2UD) obj).LJLIL);
    }

    public int hashCode() {
        String str = this.LJLIL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorEventType(eventType=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final String getEventType() {
        return this.LJLIL;
    }

    public C2UD(String str) {
        this.LJLIL = str;
    }
}
