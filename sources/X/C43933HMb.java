package X;

import kotlin.jvm.internal.o;

/* renamed from: X.HMb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43933HMb extends F9E {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;
    public final String LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, Long.valueOf(this.LJLJI), this.LJLJJI, Integer.valueOf(this.LJLJJL), this.LJLJJLL};
    }

    public C43933HMb(int i, String str, long j, String fileSuffix, String errorMsg, boolean z) {
        o.LJIIIZ(fileSuffix, "fileSuffix");
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = fileSuffix;
        this.LJLJJL = i;
        this.LJLJJLL = errorMsg;
    }
}
