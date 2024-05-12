package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7UF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7UF extends F9E {
    public final boolean LJLIL;
    public final long LJLILLLLZI;
    public final String LJLJI;
    public final long LJLJJI;
    public final long LJLJJL;
    public final int LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), this.LJLJI, Long.valueOf(this.LJLJJI), Long.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL)};
    }

    public C7UF(long j, long j2, long j3, String secUserId, boolean z) {
        o.LJIIIZ(secUserId, "secUserId");
        this.LJLIL = z;
        this.LJLILLLLZI = j;
        this.LJLJI = secUserId;
        this.LJLJJI = j2;
        this.LJLJJL = j3;
        this.LJLJJLL = 20;
    }
}
