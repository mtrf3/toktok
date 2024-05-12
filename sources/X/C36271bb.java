package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36271bb extends F9E {
    public long LJLIL;
    public String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C36271bb(long j, String gameId) {
        o.LJIIIZ(gameId, "gameId");
        this.LJLIL = j;
        this.LJLILLLLZI = gameId;
    }
}
