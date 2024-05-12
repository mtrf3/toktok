package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117914jz extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
    }

    public C117914jz(String filePath, int i, int i2) {
        o.LJIIIZ(filePath, "filePath");
        this.LJLIL = filePath;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
