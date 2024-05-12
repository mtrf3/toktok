package X;

import X.InterfaceC36821cU;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;

/* renamed from: X.2Gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55632Gh<T extends View & InterfaceC36821cU> extends AbstractC534928b<T> implements InterfaceC36821cU, InterfaceC36811cT {
    public final C532327b LJLILLLLZI;

    @Override // X.InterfaceC24200xE
    public final boolean LJJIJLIJ() {
        if (C16310kV.LIZLLL(this.LJLIL) == 1) {
            return true;
        }
        return false;
    }

    @Override // X.QXX
    public final int[] LLLLLLL() {
        return this.LJLILLLLZI.LLLLLLL();
    }

    public final int LLLZ() {
        C35661ac c35661ac = this.LJLILLLLZI.LLF;
        if (c35661ac == null) {
            return 0;
        }
        return c35661ac.LJLJL;
    }

    @Override // X.InterfaceC24210xF
    public final int[] getGradientColors() {
        return this.LJLILLLLZI.getGradientColors();
    }

    @Override // X.InterfaceC24210xF
    public final float[] getGradientPositions() {
        return this.LJLILLLLZI.getGradientPositions();
    }

    @Override // X.InterfaceC36811cT
    public final int[] getState() {
        return this.LJLIL.getDrawableState();
    }

    @Override // X.InterfaceC24200xE
    public final void invalidate() {
        this.LJLIL.invalidate();
    }

    public C55632Gh(T t) {
        super(t);
        this.LJLILLLLZI = new C532327b(this);
        t.setWillNotDraw(false);
    }

    @Override // X.AbstractC534928b
    public final void LLLLZIL(TypedArray typedArray) {
        this.LJLILLLLZI.LLLLZ(this.LJLIL.getContext(), typedArray);
    }

    public final void LLLZI(boolean z) {
        C532327b c532327b = this.LJLILLLLZI;
        if (c532327b.LJLJJL == z) {
            return;
        }
        c532327b.LJLJJL = z;
        c532327b.LLLLZLLLI();
        c532327b.LL.invalidate();
    }

    public final void LLLZIL(float f) {
        C532327b c532327b = this.LJLILLLLZI;
        if (c532327b.LJZI == f) {
            return;
        }
        c532327b.LJZI = f;
        c532327b.LLLLZLLLI();
        c532327b.LL.invalidate();
    }

    public final void LLLZL(boolean z) {
        C532327b c532327b = this.LJLILLLLZI;
        if (c532327b.LJLJJI == z) {
            return;
        }
        c532327b.LJLJJI = z;
        c532327b.LLLLZLLLI();
        c532327b.LL.invalidate();
    }

    public final void LLLZLL(float f) {
        C532327b c532327b = this.LJLILLLLZI;
        if (c532327b.LJZ == f) {
            return;
        }
        c532327b.LJZ = f;
        c532327b.LLLLZLLLI();
        c532327b.LL.invalidate();
    }

    public final void LLLZLZ(int i) {
        C35661ac LLLLZIL = this.LJLILLLLZI.LLLLZIL();
        int LJJIIZ = C78609UtB.LJJIIZ(i, 0, 255);
        if (LLLLZIL.LJLJL == LJJIIZ) {
            return;
        }
        LLLLZIL.LJLJL = LJJIIZ;
        LLLLZIL.LJLJI.setAlpha(LJJIIZ);
        InterfaceC24200xE interfaceC24200xE = LLLLZIL.LJLJJLL;
        if (interfaceC24200xE == null) {
            return;
        }
        interfaceC24200xE.invalidate();
    }

    public final void LLLZZIL(float f) {
        C532327b c532327b = this.LJLILLLLZI;
        if (c532327b.LJLLLL == f) {
            return;
        }
        c532327b.LJLLLL = f;
        c532327b.LLLLZLLLI();
        c532327b.LL.invalidate();
    }

    public final void LLZIL(int i) {
        C532327b c532327b = this.LJLILLLLZI;
        c532327b.getClass();
        c532327b.LJLLL = ColorStateList.valueOf(i);
        c532327b.LJLLJ = null;
        c532327b.LL.invalidate();
    }

    public final void LLZILL(ColorStateList colorStateList) {
        C532327b c532327b = this.LJLILLLLZI;
        if (c532327b.LJLLL == colorStateList) {
            return;
        }
        c532327b.LJLLL = colorStateList;
        c532327b.LJLLJ = null;
        c532327b.LL.invalidate();
    }

    public final void LLZL(int[] iArr) {
        C532327b c532327b = this.LJLILLLLZI;
        if (iArr == null) {
            c532327b.LJLLJ = null;
        } else {
            if (c532327b.LJLLJ == null) {
                C260010i c260010i = new C260010i();
                c532327b.LJLLJ = c260010i;
                c260010i.LIZ = iArr;
            }
            c532327b.LJLLL = null;
        }
        c532327b.LLLLZLLLI();
        c532327b.LL.invalidate();
    }

    public final void LLZLI(float f) {
        C532327b c532327b = this.LJLILLLLZI;
        if (c532327b.LJLLILLLL == f) {
            return;
        }
        c532327b.LJLLILLLL = f;
        c532327b.LL.invalidate();
    }

    public final void LLZLL(boolean z) {
        C532327b c532327b = this.LJLILLLLZI;
        if (c532327b.LJLJI == z) {
            return;
        }
        c532327b.LJLJI = z;
        c532327b.LLLLZLLLI();
        c532327b.LL.invalidate();
    }

    public final void LLZLLIL(float f) {
        C532327b c532327b = this.LJLILLLLZI;
        if (c532327b.LJLZ == f) {
            return;
        }
        c532327b.LJLZ = f;
        c532327b.LLLLZLLLI();
        c532327b.LL.invalidate();
    }

    public final void LLZLLLL(boolean z) {
        C532327b c532327b = this.LJLILLLLZI;
        if (c532327b.LJLILLLLZI == z) {
            return;
        }
        c532327b.LJLILLLLZI = z;
        c532327b.LLLLZLLLI();
        c532327b.LL.invalidate();
    }

    public final void LLZZ(float f) {
        C532327b c532327b = this.LJLILLLLZI;
        if (c532327b.LJLLLLLL == f) {
            return;
        }
        c532327b.LJLLLLLL = f;
        c532327b.LLLLZLLLI();
        c532327b.LL.invalidate();
    }

    @Override // X.InterfaceC24210xF
    public final void LJIJJLI(float[] fArr, int[] iArr) {
        this.LJLILLLLZI.LJIJJLI(fArr, iArr);
    }

    public final void LLLZZ(Resources resources, int i, int i2) {
        int[] iArr;
        C35661ac LLLLZIL = this.LJLILLLLZI.LLLLZIL();
        LLLLZIL.getClass();
        float[] fArr = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            int length = obtainTypedArray.length();
            iArr = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = obtainTypedArray.getColor(i3, -16777216);
            }
            obtainTypedArray.recycle();
        } else {
            iArr = null;
        }
        if (i2 != 0) {
            TypedArray obtainTypedArray2 = resources.obtainTypedArray(i2);
            int length2 = obtainTypedArray2.length();
            fArr = new float[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                fArr[i4] = obtainTypedArray2.getFloat(i4, 0.0f);
            }
            obtainTypedArray2.recycle();
        }
        LLLLZIL.LJIJJLI(fArr, iArr);
    }
}
