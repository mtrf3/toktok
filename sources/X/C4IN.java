package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4IN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4IN extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public C4IN(String label, int i) {
        o.LJIIIZ(label, "label");
        this.LJLIL = label;
        this.LJLILLLLZI = i;
    }
}
