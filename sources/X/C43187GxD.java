package X;

import Y.IDComparatorS35S0000000_7;
import defpackage.q;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.GxD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43187GxD extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final String LIZJ() {
        return "recharge";
    }

    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    @Override // X.AbstractC43178Gx4
    public final String LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis() - LIZLLL();
        C43176Gx2.LIZ.getClass();
        List LJ = C43176Gx2.LJ(currentTimeMillis, "recharge_fail");
        List subList = ORZ.LLILII(new IDComparatorS35S0000000_7(20), ORZ.LLJILJILJ(LJ)).subList(0, Math.min(LJ.size(), 10));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recharge_fail_list: [");
        return q.LIZIZ(LIZ, ORZ.LLD(subList, null, null, null, C43188GxE.LJLIL, 31), ']', LIZ);
    }

    @Override // X.AbstractC43178Gx4
    public final boolean LIZ(String type) {
        o.LJIIIZ(type, "type");
        return o.LJ(type, "recharge_fail");
    }
}
