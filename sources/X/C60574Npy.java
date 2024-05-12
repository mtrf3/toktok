package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Npy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60574Npy extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;

    public /* synthetic */ C60574Npy() {
        this("center", 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public C60574Npy(String mode, int i) {
        o.LJIIJ(mode, "mode");
        this.LJLIL = mode;
        this.LJLILLLLZI = i;
    }
}
