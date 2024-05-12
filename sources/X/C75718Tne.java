package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tne, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75718Tne extends F9E {
    public final long LJLIL;
    public final long LJLILLLLZI;
    public final EnumC75915Tqp LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C75718Tne(long j, long j2, EnumC75915Tqp source) {
        o.LJIIIZ(source, "source");
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = source;
    }
}
