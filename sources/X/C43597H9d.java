package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H9d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43597H9d extends F9E {
    public final long LJLIL;
    public final long LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C43597H9d(long j, long j2, String goNextReason) {
        o.LJIIIZ(goNextReason, "goNextReason");
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = goNextReason;
    }

    public static C43597H9d L(C43597H9d c43597H9d, long j, long j2, String str, int i) {
        String goNextReason = str;
        long j3 = j;
        long j4 = j2;
        if ((i & 1) != 0) {
            j3 = c43597H9d.LJLIL;
        }
        if ((i & 2) != 0) {
            j4 = c43597H9d.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            goNextReason = c43597H9d.LJLJI;
        }
        c43597H9d.getClass();
        o.LJIIIZ(goNextReason, "goNextReason");
        return new C43597H9d(j3, j4, goNextReason);
    }
}
