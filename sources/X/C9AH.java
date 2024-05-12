package X;

import android.graphics.Rect;

/* renamed from: X.9AH, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9AH extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)};
    }

    public final boolean L(Rect rect) {
        if (this.LJLIL == rect.left && this.LJLILLLLZI == rect.top && this.LJLJI == rect.right && this.LJLJJI == rect.bottom) {
            return true;
        }
        return false;
    }

    public C9AH(int i, int i2, int i3, int i4) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
    }
}
