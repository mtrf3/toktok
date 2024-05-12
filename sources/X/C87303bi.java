package X;

import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87303bi implements InterfaceC87283bg {
    public final List<String> LJLIL;
    public final int LJLILLLLZI;
    public final Integer LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87303bi)) {
            return false;
        }
        C87303bi c87303bi = (C87303bi) obj;
        return o.LJ(this.LJLIL, c87303bi.LJLIL) && this.LJLILLLLZI == c87303bi.LJLILLLLZI && o.LJ(this.LJLJI, c87303bi.LJLJI);
    }

    public final int hashCode() {
        int hashCode = ((this.LJLIL.hashCode() * 31) + this.LJLILLLLZI) * 31;
        Integer num = this.LJLJI;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public C87303bi() {
        this(C61878OQg.INSTANCE, 0, null);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendUserListConfig(uidList=");
        LIZ.append(this.LJLIL);
        LIZ.append(", entranceId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", group=");
        return s0.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C87303bi(List<String> uidList, int i, Integer num) {
        o.LJIIIZ(uidList, "uidList");
        this.LJLIL = uidList;
        this.LJLILLLLZI = i;
        this.LJLJI = num;
    }
}
