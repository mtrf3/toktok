package X;

import kotlin.jvm.internal.o;

/* renamed from: X.adV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94221adV extends F9E {
    public final long LJLIL;
    public final EnumC93710aVG LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C94221adV(long j, EnumC93710aVG type) {
        o.LJIIIZ(type, "type");
        this.LJLIL = j;
        this.LJLILLLLZI = type;
    }
}
