package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SCf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71705SCf implements C33Q {
    public final List<InterfaceC57784Mm4> LJLIL;
    public final Object LJLILLLLZI;
    public final Object LJLJI;
    public final C27919AxX<String> LJLJJI;
    public final Object LJLJJL;

    public C71705SCf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71705SCf)) {
            return false;
        }
        C71705SCf c71705SCf = (C71705SCf) obj;
        return o.LJ(this.LJLIL, c71705SCf.LJLIL) && o.LJ(this.LJLILLLLZI, c71705SCf.LJLILLLLZI) && o.LJ(this.LJLJI, c71705SCf.LJLJI) && o.LJ(this.LJLJJI, c71705SCf.LJLJJI) && o.LJ(this.LJLJJL, c71705SCf.LJLJJL);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        Object obj = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.LJLJI;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        C27919AxX<String> c27919AxX = this.LJLJJI;
        return this.LJLJJL.hashCode() + ((hashCode3 + (c27919AxX != null ? c27919AxX.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ATMCardState(powerItems=");
        LIZ.append(this.LJLIL);
        LIZ.append(", dismiss=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", dismissAll=");
        LIZ.append(this.LJLJI);
        LIZ.append(", toast=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", force=");
        return U26.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public /* synthetic */ C71705SCf(int i) {
        this(new ArrayList(), null, null, null, new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C71705SCf(List<? extends InterfaceC57784Mm4> powerItems, Object obj, Object obj2, C27919AxX<String> c27919AxX, Object force) {
        o.LJIIIZ(powerItems, "powerItems");
        o.LJIIIZ(force, "force");
        this.LJLIL = powerItems;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = c27919AxX;
        this.LJLJJL = force;
    }

    public static C71705SCf LIZ(C71705SCf c71705SCf, List list, Object obj, C27919AxX c27919AxX, Object obj2, int i) {
        Object obj3;
        Object force = obj2;
        C27919AxX c27919AxX2 = c27919AxX;
        List powerItems = list;
        Object obj4 = obj;
        if ((i & 1) != 0) {
            powerItems = c71705SCf.LJLIL;
        }
        if ((i & 2) != 0) {
            obj3 = c71705SCf.LJLILLLLZI;
        } else {
            obj3 = null;
        }
        if ((i & 4) != 0) {
            obj4 = c71705SCf.LJLJI;
        }
        if ((i & 8) != 0) {
            c27919AxX2 = c71705SCf.LJLJJI;
        }
        if ((i & 16) != 0) {
            force = c71705SCf.LJLJJL;
        }
        c71705SCf.getClass();
        o.LJIIIZ(powerItems, "powerItems");
        o.LJIIIZ(force, "force");
        return new C71705SCf(powerItems, obj3, obj4, c27919AxX2, force);
    }
}
