package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Npo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60564Npo extends F9E {
    public final C60574Npy LJLIL;
    public final C60574Npy LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final InterfaceC60583Nq7 LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), this.LJLJJLL};
    }

    public C60564Npo(C60574Npy keyboardOnStyle, C60574Npy keyboardOffStyle, int i, int i2, int i3, InterfaceC60583Nq7 interfaceC60583Nq7) {
        o.LJIIJ(keyboardOnStyle, "keyboardOnStyle");
        o.LJIIJ(keyboardOffStyle, "keyboardOffStyle");
        this.LJLIL = keyboardOnStyle;
        this.LJLILLLLZI = keyboardOffStyle;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
        this.LJLJJLL = interfaceC60583Nq7;
    }
}
