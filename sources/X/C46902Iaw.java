package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Iaw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46902Iaw extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final long LJLJI;
    public final AbstractC46912Ib6 LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C46902Iaw(String fileHash, int i, long j, AbstractC46912Ib6 abstractC46912Ib6) {
        o.LJIIIZ(fileHash, "fileHash");
        this.LJLIL = fileHash;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = abstractC46912Ib6;
    }
}
