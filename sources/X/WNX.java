package X;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes15.dex */
public final class WNX extends WNY {
    public Matrix LJLJJI;
    public Matrix LJLJJL;
    public WNZ LJLJJLL;

    @Override // X.WNY
    public final void LIZIZ(boolean z) {
        C78890Uxi.LIZ(this.LJLJI, null);
        WNZ wnz = this.LJLJJLL;
        View view = this.LJLJI;
        float f = wnz.LIZ;
        float f2 = wnz.LIZIZ;
        float f3 = wnz.LIZJ;
        float f4 = wnz.LIZLLL;
        float f5 = wnz.LJ;
        float f6 = wnz.LJFF;
        float f7 = wnz.LJI;
        float f8 = wnz.LJII;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        C16360ka.LJIL(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    @Override // X.WNY
    public final WNT LIZJ(boolean z) {
        return new C82180WNc(new C82181WNd(this.LJLJI, new C82179WNb(Matrix.class), new C78877UxV(), this.LJLJJI, this.LJLJJL));
    }

    @Override // X.WNY
    public final void LIZ(View view, View view2, View view3) {
        super.LIZ(view, view2, view3);
        this.LJLJJLL = new WNZ(view3);
        view.getTranslationX();
        view2.getTranslationX();
        view.getTranslationY();
        view2.getTranslationY();
        view.getTranslationZ();
        view2.getTranslationZ();
        view.getAlpha();
        view2.getAlpha();
        if (view == view3) {
            View view4 = (View) this.LJLIL.getParent();
            View view5 = (View) this.LJLILLLLZI.getParent();
            Matrix matrix = new Matrix();
            C78890Uxi.LIZJ(view4, matrix);
            Matrix matrix2 = new Matrix();
            C78890Uxi.LIZJ(view5, matrix2);
            Matrix matrix3 = new Matrix(this.LJLIL.getMatrix());
            Matrix matrix4 = new Matrix(this.LJLILLLLZI.getMatrix());
            Matrix matrix5 = new Matrix();
            matrix.invert(matrix5);
            matrix4.postTranslate(view2.getLeft(), view2.getTop());
            matrix4.postConcat(matrix2);
            matrix4.postConcat(matrix5);
            matrix4.postTranslate(-view.getLeft(), -view.getTop());
            this.LJLJJI = matrix3;
            this.LJLJJL = matrix4;
            View view6 = this.LJLJI;
            view6.setTranslationX(0.0f);
            view6.setTranslationY(0.0f);
            C16360ka.LJIL(view6, 0.0f);
            view6.setScaleX(1.0f);
            view6.setScaleY(1.0f);
            view6.setRotationX(0.0f);
            view6.setRotationY(0.0f);
            view6.setRotation(0.0f);
        } else {
            View view7 = (View) this.LJLIL.getParent();
            View view8 = (View) this.LJLILLLLZI.getParent();
            Matrix matrix6 = new Matrix();
            C78890Uxi.LIZJ(view7, matrix6);
            Matrix matrix7 = new Matrix();
            C78890Uxi.LIZJ(view8, matrix7);
            Matrix matrix8 = new Matrix(this.LJLIL.getMatrix());
            Matrix matrix9 = new Matrix(this.LJLILLLLZI.getMatrix());
            Matrix matrix10 = new Matrix();
            matrix7.invert(matrix10);
            matrix8.postTranslate(view.getLeft(), view.getTop());
            matrix8.postConcat(matrix6);
            matrix8.postConcat(matrix10);
            matrix8.postTranslate(-view2.getLeft(), -view2.getTop());
            this.LJLJJI = matrix8;
            this.LJLJJL = matrix9;
            View view9 = this.LJLJI;
            view9.setTranslationX(0.0f);
            view9.setTranslationY(0.0f);
            C16360ka.LJIL(view9, 0.0f);
            view9.setScaleX(1.0f);
            view9.setScaleY(1.0f);
            view9.setRotationX(0.0f);
            view9.setRotationY(0.0f);
            view9.setRotation(0.0f);
        }
        C78890Uxi.LIZ(this.LJLJI, this.LJLJJI);
        view.getRotationX();
        view2.getRotationX();
        view.getRotationY();
        view2.getRotationY();
        view2.getRotation();
    }
}
