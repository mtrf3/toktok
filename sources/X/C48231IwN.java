package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IwN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48231IwN extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final long LJLJI;
    public final String LJLJJI;
    public String LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C48231IwN(int i, String gid, String eventType, long j) {
        o.LJIIIZ(gid, "gid");
        o.LJIIIZ(eventType, "eventType");
        this.LJLIL = gid;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = eventType;
        this.LJLJJL = "";
    }
}
