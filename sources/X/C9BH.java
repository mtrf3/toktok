package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9BH, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9BH extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C9BH(int i, int i2, String captionText) {
        o.LJIIIZ(captionText, "captionText");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = captionText;
    }
}
