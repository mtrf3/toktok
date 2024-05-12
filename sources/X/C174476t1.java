package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6t1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174476t1 extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public C174476t1(String repliedCid, int i) {
        o.LJIIIZ(repliedCid, "repliedCid");
        this.LJLIL = repliedCid;
        this.LJLILLLLZI = i;
    }
}
