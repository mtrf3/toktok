package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Jvv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50751Jvv extends F9E implements InterfaceC50315Jot {
    public final boolean LJLIL;
    public final long LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;
    public final String LJLJJL;

    public C50751Jvv() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI), this.LJLJJL};
    }

    public /* synthetic */ C50751Jvv(int i) {
        this(0L, 0L, "", false, 0L);
    }

    public C50751Jvv(long j, long j2, String enterMethod, boolean z, long j3) {
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = z;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
        this.LJLJJL = enterMethod;
    }

    public static C50751Jvv L(C50751Jvv c50751Jvv, boolean z, long j, long j2, long j3, String str, int i) {
        long j4 = j3;
        long j5 = j2;
        String enterMethod = str;
        boolean z2 = z;
        long j6 = j;
        if ((i & 1) != 0) {
            z2 = c50751Jvv.LJLIL;
        }
        if ((i & 2) != 0) {
            j6 = c50751Jvv.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            j5 = c50751Jvv.LJLJI;
        }
        if ((i & 8) != 0) {
            j4 = c50751Jvv.LJLJJI;
        }
        if ((i & 16) != 0) {
            enterMethod = c50751Jvv.LJLJJL;
        }
        c50751Jvv.getClass();
        o.LJIIIZ(enterMethod, "enterMethod");
        return new C50751Jvv(j6, j5, enterMethod, z2, j4);
    }
}
