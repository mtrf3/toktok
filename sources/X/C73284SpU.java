package X;

import java.io.Serializable;

/* renamed from: X.SpU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73284SpU extends F9E implements Serializable {
    public static final C73285SpV Companion = new C73285SpV();
    public final int LJLIL;

    public static /* synthetic */ C73284SpU copy$default(C73284SpU c73284SpU, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c73284SpU.LJLIL;
        }
        return c73284SpU.copy(i);
    }

    public final C73284SpU copy(int i) {
        return new C73284SpU(i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL)};
    }

    public final int getCursor() {
        return this.LJLIL;
    }

    public C73284SpU(int i) {
        this.LJLIL = i;
    }
}
