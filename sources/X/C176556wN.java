package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6wN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176556wN extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C176556wN(int i, String aid, String str, long j) {
        o.LJIIIZ(aid, "aid");
        this.LJLIL = aid;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = str;
    }
}
