package X;

import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mly, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57778Mly {
    public static final /* synthetic */ int LJI = 0;
    public final AbstractC72932td<C223208pQ> LIZ;
    public final AbstractC72932td<C223208pQ> LIZIZ;
    public final AbstractC72932td<List<InterfaceC57784Mm4>> LIZJ;
    public final int LIZLLL;
    public final C5H3 LJ;
    public final C5H3 LJFF;

    public C57778Mly() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57778Mly)) {
            return false;
        }
        C57778Mly c57778Mly = (C57778Mly) obj;
        return o.LJ(this.LIZ, c57778Mly.LIZ) && o.LJ(this.LIZIZ, c57778Mly.LIZIZ) && o.LJ(this.LIZJ, c57778Mly.LIZJ);
    }

    public final int LIZ() {
        return ((Number) this.LJ.getValue()).intValue();
    }

    public final boolean LIZIZ() {
        List<InterfaceC57784Mm4> LIZ;
        if (!(this.LIZ instanceof C72912tb)) {
            return true;
        }
        AbstractC72932td<List<InterfaceC57784Mm4>> abstractC72932td = this.LIZJ;
        if ((abstractC72932td instanceof C33X) || (LIZ = abstractC72932td.LIZ()) == null) {
            return true;
        }
        return LIZ.isEmpty();
    }

    public final boolean LIZLLL() {
        return !(this.LIZJ instanceof C33X);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + C03090Af.LIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    public final boolean LIZJ() {
        if (LIZ() == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserCardState(refreshState=");
        LIZ.append(LJ(this.LIZ));
        LIZ.append(", loadMoreState=");
        LIZ.append(LJ(this.LIZIZ));
        LIZ.append(", data=");
        AbstractC72932td<List<InterfaceC57784Mm4>> abstractC72932td = this.LIZJ;
        if (abstractC72932td instanceof C72912tb) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Success(size:");
            LIZ2.append(((List) ((C72912tb) abstractC72932td).LIZ).size());
            LIZ2.append(')');
            str = X1D.LIZIZ(LIZ2);
        } else if (abstractC72932td instanceof C3C1) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Fail(");
            LIZ3.append(((C3C1) abstractC72932td).LIZ.getMessage());
            LIZ3.append(')');
            str = X1D.LIZIZ(LIZ3);
        } else if (abstractC72932td instanceof C72922tc) {
            str = "Loading";
        } else if (o.LJ(abstractC72932td, C33X.LIZ)) {
            str = "Uninitialized";
        } else {
            throw new C162476Zf();
        }
        return q.LIZIZ(LIZ, str, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C57778Mly(int r2) {
        /*
            r1 = this;
            X.33X r0 = X.C33X.LIZ
            r1.<init>(r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57778Mly.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String LJ(AbstractC72932td abstractC72932td) {
        if (abstractC72932td instanceof C72912tb) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Success(next:");
            return C48339Iy7.LIZJ(LIZ, ((C223208pQ) ((C72912tb) abstractC72932td).LIZ).LJLILLLLZI, ')', LIZ);
        }
        if (abstractC72932td instanceof C3C1) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Fail(");
            LIZ2.append(((C3C1) abstractC72932td).LIZ.getMessage());
            LIZ2.append(')');
            return X1D.LIZIZ(LIZ2);
        }
        if (abstractC72932td instanceof C72922tc) {
            return "Loading";
        }
        if (o.LJ(abstractC72932td, C33X.LIZ)) {
            return "Uninitialized";
        }
        throw new C162476Zf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C57778Mly(AbstractC72932td<C223208pQ> refreshState, AbstractC72932td<C223208pQ> loadMoreState, AbstractC72932td<? extends List<? extends InterfaceC57784Mm4>> itemState) {
        int i;
        o.LJIIIZ(refreshState, "refreshState");
        o.LJIIIZ(loadMoreState, "loadMoreState");
        o.LJIIIZ(itemState, "itemState");
        this.LIZ = refreshState;
        this.LIZIZ = loadMoreState;
        this.LIZJ = itemState;
        List list = (List) itemState.LIZ();
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        this.LIZLLL = i;
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJ = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(this, 858));
        this.LJFF = C221108m2.LIZ(enumC221088m0, new AqS159S0100000_9(this, 859));
    }
}
