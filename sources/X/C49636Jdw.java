package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Jdw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49636Jdw implements Serializable {
    public final Long LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C49636Jdw() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C49636Jdw copy$default(C49636Jdw c49636Jdw, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = c49636Jdw.LJLIL;
        }
        return c49636Jdw.copy(l);
    }

    public final C49636Jdw copy(Long l) {
        return new C49636Jdw(l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C49636Jdw) && o.LJ(this.LJLIL, ((C49636Jdw) obj).LJLIL);
    }

    public int hashCode() {
        Long l = this.LJLIL;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchSessionModel(searchSessionId=");
        return JBR.LJ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final Long getSearchSessionId() {
        return this.LJLIL;
    }

    public C49636Jdw(Long l) {
        this.LJLIL = l;
    }

    public /* synthetic */ C49636Jdw(Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : l);
    }
}
