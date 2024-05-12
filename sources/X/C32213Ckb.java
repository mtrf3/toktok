package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ckb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32213Ckb extends F9E {
    public final boolean LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C32213Ckb(boolean z, String source) {
        o.LJIIIZ(source, "source");
        this.LJLIL = z;
        this.LJLILLLLZI = source;
    }
}
