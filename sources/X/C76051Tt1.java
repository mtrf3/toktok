package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tt1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76051Tt1 extends F9E {
    public final EnumC76039Tsp LJLIL;
    public EnumC76041Tsr LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C76051Tt1(EnumC76039Tsp listType, EnumC76041Tsr expandState) {
        o.LJIIIZ(listType, "listType");
        o.LJIIIZ(expandState, "expandState");
        this.LJLIL = listType;
        this.LJLILLLLZI = expandState;
    }
}
