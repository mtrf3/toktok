package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Zo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86123Zo extends F9E {
    public static final /* synthetic */ int LJLJJI = 0;
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final long LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI)};
    }

    public C86123Zo(String secUid, int i, long j) {
        o.LJIIIZ(secUid, "secUid");
        this.LJLIL = secUid;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
    }
}
