package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3J9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3J9 implements InterfaceC82043Jw {
    public static final /* synthetic */ int LJ = 0;
    public final List<C3L4> LIZ;
    public final List<C3L4> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C3J9() {
        this(0);
    }

    public final java.util.Map<C3JB, List<C3L4>> LIZLLL() {
        return C113554cx.LJJL(new OSZ(C3JB.SESSION_LIST, ORZ.LLJI(this.LIZ)), new OSZ(C3JB.MESSAGE_REQUEST_CELL, ORZ.LLJI(this.LIZIZ)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        boolean z = this.LIZJ;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (LIZIZ + i2) * 31;
        if (!this.LIZLLL) {
            i = 0;
        }
        return i3 + i;
    }

    @Override // X.InterfaceC82043Jw
    public final List<C3L4> LIZ() {
        Iterator<List<C3L4>> it = LIZLLL().values().iterator();
        if (it.hasNext()) {
            List<C3L4> next = it.next();
            while (it.hasNext()) {
                next = ORZ.LLIIIZ(it.next(), next);
            }
            return next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sessionListSize:");
        DIL.LIZIZ(this.LIZ, LIZ, ", messageRequestCellList:");
        DIL.LIZIZ(this.LIZIZ, LIZ, ", hasMore:");
        LIZ.append(this.LIZJ);
        LIZ.append(", sessionListInit:");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC82043Jw
    public final List<C3L4> LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC82043Jw
    public final boolean V() {
        return this.LIZJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3J9(int r3) {
        /*
            r2 = this;
            X.OQg r1 = X.C61878OQg.INSTANCE
            r0 = 0
            r2.<init>(r1, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3J9.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3J9)) {
            return false;
        }
        C3J9 c3j9 = (C3J9) obj;
        if (o.LJ(this.LIZ, c3j9.LIZ) && o.LJ(this.LIZIZ, c3j9.LIZIZ) && this.LIZJ == c3j9.LIZJ && this.LIZLLL == c3j9.LIZLLL) {
            return true;
        }
        return false;
    }

    public C3J9(List sessionList, boolean z, List messageRequestCell, boolean z2) {
        o.LJIIIZ(sessionList, "sessionList");
        o.LJIIIZ(messageRequestCell, "messageRequestCell");
        this.LIZ = sessionList;
        this.LIZIZ = messageRequestCell;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }

    public static C3J9 LIZJ(C3J9 c3j9, List sessionList, List messageRequestCell, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            sessionList = c3j9.LIZ;
        }
        if ((i & 2) != 0) {
            messageRequestCell = c3j9.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c3j9.LIZJ;
        }
        if ((i & 8) != 0) {
            z2 = c3j9.LIZLLL;
        }
        c3j9.getClass();
        o.LJIIIZ(sessionList, "sessionList");
        o.LJIIIZ(messageRequestCell, "messageRequestCell");
        return new C3J9(sessionList, z, messageRequestCell, z2);
    }
}
