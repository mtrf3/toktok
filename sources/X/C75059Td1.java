package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Td1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75059Td1 extends F9E {
    public final String LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C75059Td1(String interactId, boolean z) {
        o.LJIIIZ(interactId, "interactId");
        this.LJLIL = interactId;
        this.LJLILLLLZI = z;
    }
}
