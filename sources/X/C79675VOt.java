package X;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.lynx.tasm.behavior.ui.LynxUI;

/* renamed from: X.VOt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79675VOt extends Animation implements VOS {
    public final LynxUI LJLIL;
    public final View LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;
    public final Rect LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public float LJZ;
    public float LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public int LLF;

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.LJLIL.updateLayout(Math.round((this.LJZ * f) + this.LJLLLLLL), Math.round((this.LJZI * f) + this.LJLZ), Math.round((this.LLD * f) + this.LJZL), Math.round((this.LLF * f) + this.LL), this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, this.LJLLLL);
    }

    @Override // X.VOS
    public final void LIZ(int i, int i2, int i3, int i4) {
        LIZIZ(i, i2, i3, i4);
    }

    public final void LIZIZ(int i, int i2, int i3, int i4) {
        this.LJLLLLLL = this.LJLIL.getOriginLeft() - this.LJLIL.getTranslationX();
        this.LJLZ = this.LJLIL.getOriginTop() - this.LJLIL.getTranslationY();
        this.LJZL = this.LJLIL.getWidth();
        int height = this.LJLIL.getHeight();
        this.LL = height;
        this.LJZ = i - this.LJLLLLLL;
        this.LJZI = i2 - this.LJLZ;
        this.LLD = i3 - this.LJZL;
        this.LLF = i4 - height;
    }

    public C79675VOt(LynxUI lynxUI, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.LJLIL = lynxUI;
        this.LJLILLLLZI = lynxUI.mView;
        this.LJLJI = i5;
        this.LJLJJI = i6;
        this.LJLJJL = i7;
        this.LJLJJLL = i8;
        this.LJLJL = i9;
        this.LJLJLJ = i10;
        this.LJLJLLL = i11;
        this.LJLL = i12;
        this.LJLLI = i13;
        this.LJLLILLLL = i14;
        this.LJLLJ = i15;
        this.LJLLL = i16;
        this.LJLLLL = rect;
        LIZIZ(i, i2, i3, i4);
    }
}
