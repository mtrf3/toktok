package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;

/* renamed from: X.1t7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C47131t7 extends C45051pl implements InterfaceC36821cU {
    public C55632Gh<C47131t7> LJLJJI;

    public float getBottomEndRadius() {
        return this.LJLJJI.LJLILLLLZI.LJZI;
    }

    public float getBottomStartRadius() {
        return this.LJLJJI.LJLILLLLZI.LJZ;
    }

    public int getGradientAlpha() {
        return this.LJLJJI.LLLZ();
    }

    @Override // X.InterfaceC24210xF
    public int[] getGradientColors() {
        return this.LJLJJI.getGradientColors();
    }

    public int getGradientLayerSize() {
        this.LJLJJI.LJLILLLLZI.getClass();
        return 0;
    }

    public int getGradientOrientation() {
        return this.LJLJJI.LJLILLLLZI.LLLLZIL().LJLJJI;
    }

    @Override // X.InterfaceC24210xF
    public float[] getGradientPositions() {
        return this.LJLJJI.getGradientPositions();
    }

    public float getRadius() {
        return this.LJLJJI.LJLILLLLZI.LJLLLL;
    }

    public ColorStateList getStrokeColor() {
        return this.LJLJJI.LJLILLLLZI.LJLLL;
    }

    public float getStrokeWidth() {
        return this.LJLJJI.LJLILLLLZI.LJLLILLLL;
    }

    public float getTopEndRadius() {
        return this.LJLJJI.LJLILLLLZI.LJLZ;
    }

    public float getTopStartRadius() {
        return this.LJLJJI.LJLILLLLZI.LJLLLLLL;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        C532327b c532327b = this.LJLJJI.LJLILLLLZI;
        if (c532327b.LJZL) {
            C0EL.LIZ(canvas, c532327b.LLD.width(), c532327b.LLD.height(), null);
        }
        super.draw(canvas);
        C532327b c532327b2 = this.LJLJJI.LJLILLLLZI;
        if (c532327b2.LJZL) {
            canvas.drawPath(c532327b2.LJLJL, c532327b2.LJLJLLL);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.LJLJJI.LJLILLLLZI.getClass();
        super.onDraw(canvas);
        this.LJLJJI.LJLILLLLZI.LLLLZLLIL(canvas);
    }

    public void setBottomEndCircular(boolean z) {
        this.LJLJJI.LLLZI(z);
    }

    public void setBottomEndRadius(float f) {
        this.LJLJJI.LLLZIL(f);
    }

    public void setBottomStartCircular(boolean z) {
        this.LJLJJI.LLLZL(z);
    }

    public void setBottomStartRadius(float f) {
        this.LJLJJI.LLLZLL(f);
    }

    public void setCircular(boolean z) {
        C532327b c532327b = this.LJLJJI.LJLILLLLZI;
        if (c532327b.LJLIL == z) {
            return;
        }
        c532327b.LJLIL = z;
        c532327b.LLLLZLLLI();
        c532327b.LL.invalidate();
    }

    public void setGradientAlpha(int i) {
        this.LJLJJI.LLLZLZ(i);
    }

    public void setGradientColors(int[] iArr) {
        this.LJLJJI.LJLILLLLZI.LLLLZIL().LJIJJLI(null, iArr);
    }

    public void setGradientOrientation(int i) {
        C35661ac LLLLZIL = this.LJLJJI.LJLILLLLZI.LLLLZIL();
        LLLLZIL.LJLJJI = i;
        LLLLZIL.LIZ();
        InterfaceC24200xE interfaceC24200xE = LLLLZIL.LJLJJLL;
        if (interfaceC24200xE != null) {
            interfaceC24200xE.invalidate();
        }
    }

    public void setRadius(float f) {
        this.LJLJJI.LLLZZIL(f);
    }

    public void setStrokeColor(int i) {
        this.LJLJJI.LLZIL(i);
    }

    public void setStrokeGradientColors(int[] iArr) {
        this.LJLJJI.LLZL(iArr);
    }

    public void setStrokeWidth(float f) {
        this.LJLJJI.LLZLI(f);
    }

    public void setTopEndCircular(boolean z) {
        this.LJLJJI.LLZLL(z);
    }

    public void setTopEndRadius(float f) {
        this.LJLJJI.LLZLLIL(f);
    }

    public void setTopStartCircular(boolean z) {
        this.LJLJJI.LLZLLLL(z);
    }

    public void setTopStartRadius(float f) {
        this.LJLJJI.LLZZ(f);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.LJLJJI.LLZILL(colorStateList);
    }

    public C47131t7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C55632Gh<C47131t7> c55632Gh = new C55632Gh<>(this);
        this.LJLJJI = c55632Gh;
        c55632Gh.LLLLZLLLI(attributeSet, 0, 0);
    }

    @Override // X.InterfaceC24210xF
    public final void LJIJJLI(float[] fArr, int[] iArr) {
        this.LJLJJI.LJIJJLI(fArr, iArr);
    }

    public C47131t7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C55632Gh<C47131t7> c55632Gh = new C55632Gh<>(this);
        this.LJLJJI = c55632Gh;
        c55632Gh.LLLLZLLLI(attributeSet, 0, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C532327b c532327b = this.LJLJJI.LJLILLLLZI;
        c532327b.LLD.set(0, 0, i, i2);
        c532327b.LLLLZLLLI();
        C35661ac c35661ac = c532327b.LLF;
        if (c35661ac != null) {
            Rect rect = c35661ac.LJLJJL;
            if (rect.left != 0 || rect.top != 0 || rect.right != i || rect.bottom != i2) {
                rect.set(0, 0, i, i2);
                c35661ac.LIZ();
                InterfaceC24200xE interfaceC24200xE = c35661ac.LJLJJLL;
                if (interfaceC24200xE != null) {
                    interfaceC24200xE.invalidate();
                }
            }
        }
        c532327b.LL.invalidate();
    }
}
