package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ThO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75330ThO extends F9E {
    public final long LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI};
    }

    public C75330ThO(long j, String linkMicId, String str) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LJLIL = j;
        this.LJLILLLLZI = linkMicId;
        this.LJLJI = str;
    }
}
