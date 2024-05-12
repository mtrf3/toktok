package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8HZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HZ<ITEM> implements C33Q {
    public final AbstractC72932td<C223208pQ> LJLIL;
    public final AbstractC72932td<C223208pQ> LJLILLLLZI;
    public final AbstractC72932td<C223208pQ> LJLJI;
    public final List<ITEM> LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C8HZ() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    public static C8HZ LIZ(AbstractC72932td refreshState, AbstractC72932td loadMoreState, AbstractC72932td loadLatestState, List list) {
        o.LJIIIZ(refreshState, "refreshState");
        o.LJIIIZ(loadMoreState, "loadMoreState");
        o.LJIIIZ(loadLatestState, "loadLatestState");
        return new C8HZ(refreshState, loadMoreState, loadLatestState, list);
    }

    public static /* synthetic */ C8HZ LIZIZ(C8HZ c8hz, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, AbstractC72932td abstractC72932td3, List list, int i) {
        if ((i & 1) != 0) {
            abstractC72932td = c8hz.LJLIL;
        }
        if ((i & 2) != 0) {
            abstractC72932td2 = c8hz.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            abstractC72932td3 = c8hz.LJLJI;
        }
        if ((i & 8) != 0) {
            list = c8hz.LJLJJI;
        }
        c8hz.getClass();
        return LIZ(abstractC72932td, abstractC72932td2, abstractC72932td3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8HZ)) {
            return false;
        }
        C8HZ c8hz = (C8HZ) obj;
        return o.LJ(this.LJLIL, c8hz.LJLIL) && o.LJ(this.LJLILLLLZI, c8hz.LJLILLLLZI) && o.LJ(this.LJLJI, c8hz.LJLJI) && o.LJ(this.LJLJJI, c8hz.LJLJJI);
    }

    public final int hashCode() {
        int hashCode;
        int LIZ = C03090Af.LIZ(this.LJLJI, C03090Af.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31);
        List<ITEM> list = this.LJLJJI;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AssemListState(refreshState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", loadMoreState=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", loadLatestState=");
        LIZ.append(this.LJLJI);
        LIZ.append(", listItemState=");
        return C1NE.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C8HZ(X.C72912tb r5, java.util.List r6, int r7) {
        /*
            r4 = this;
            r0 = r7 & 1
            if (r0 == 0) goto L6
            X.33X r5 = X.C33X.LIZ
        L6:
            r0 = r7 & 2
            r3 = 0
            if (r0 == 0) goto L1e
            X.33X r2 = X.C33X.LIZ
        Ld:
            r0 = r7 & 4
            if (r0 == 0) goto L1c
            X.33X r1 = X.C33X.LIZ
        L13:
            r0 = r7 & 8
            if (r0 == 0) goto L18
            r6 = r3
        L18:
            r4.<init>(r5, r2, r1, r6)
            return
        L1c:
            r1 = r3
            goto L13
        L1e:
            r2 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8HZ.<init>(X.2tb, java.util.List, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8HZ(AbstractC72932td<C223208pQ> refreshState, AbstractC72932td<C223208pQ> loadMoreState, AbstractC72932td<C223208pQ> loadLatestState, List<? extends ITEM> list) {
        o.LJIIIZ(refreshState, "refreshState");
        o.LJIIIZ(loadMoreState, "loadMoreState");
        o.LJIIIZ(loadLatestState, "loadLatestState");
        this.LJLIL = refreshState;
        this.LJLILLLLZI = loadMoreState;
        this.LJLJI = loadLatestState;
        this.LJLJJI = list;
    }
}
