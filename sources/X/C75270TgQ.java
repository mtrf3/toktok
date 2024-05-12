package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TgQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75270TgQ extends F9E {
    public final long LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C75270TgQ(int i, long j, long j2, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = i;
        this.LJLJJI = linkMicId;
    }
}
