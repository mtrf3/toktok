package X;

import java.io.Serializable;

/* renamed from: X.UFe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76878UFe extends F9E implements Serializable {
    public static final C76877UFd Companion = new C76877UFd();
    public static final C76878UFe DEFAULT = new C76878UFe(4096, 4096, 4096, 4096, 20480000);
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    public static /* synthetic */ C76878UFe copy$default(C76878UFe c76878UFe, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = c76878UFe.LJLIL;
        }
        if ((i6 & 2) != 0) {
            i2 = c76878UFe.LJLILLLLZI;
        }
        if ((i6 & 4) != 0) {
            i3 = c76878UFe.LJLJI;
        }
        if ((i6 & 8) != 0) {
            i4 = c76878UFe.LJLJJI;
        }
        if ((i6 & 16) != 0) {
            i5 = c76878UFe.LJLJJL;
        }
        return c76878UFe.copy(i, i2, i3, i4, i5);
    }

    public final C76878UFe copy(int i, int i2, int i3, int i4, int i5) {
        return new C76878UFe(i, i2, i3, i4, i5);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL)};
    }

    public final int getMaxHeight() {
        return this.LJLJJI;
    }

    public final int getMaxSize() {
        return this.LJLJJL;
    }

    public final int getMaxWidth() {
        return this.LJLJI;
    }

    public final int getMinHeight() {
        return this.LJLILLLLZI;
    }

    public final int getMinWidth() {
        return this.LJLIL;
    }

    public C76878UFe(int i, int i2, int i3, int i4, int i5) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = i5;
    }
}
