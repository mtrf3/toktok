package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TlY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75588TlY extends F9E {
    public final long LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    public C75588TlY(long j, String linkMicId, boolean z) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.LJLIL = j;
        this.LJLILLLLZI = linkMicId;
        this.LJLJI = z;
    }
}
