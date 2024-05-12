package X;

import android.graphics.Matrix;
import kotlin.jvm.internal.o;

/* renamed from: X.aWN, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93779aWN {
    public final EnumC93777aWL LIZ;
    public final Matrix LIZIZ;

    public C93779aWN(C93782aWQ controlPointView, C94211adL c94211adL) {
        EnumC93777aWL enumC93777aWL;
        o.LJIIIZ(controlPointView, "controlPointView");
        Matrix matrix = new Matrix();
        matrix.setRotate(-c94211adL.LJLJJL);
        this.LIZIZ = matrix;
        Matrix matrix2 = new Matrix();
        matrix2.setRotate(-c94211adL.LJLJJL, c94211adL.LJLJI, c94211adL.LJLJJI);
        float[] fArr = {(controlPointView.getWidth() / 2) + controlPointView.getTranslationX(), (controlPointView.getHeight() / 2) + controlPointView.getTranslationY()};
        matrix2.mapPoints(fArr);
        if (Math.abs(fArr[0] - c94211adL.LJLJI) < Math.abs(fArr[1] - c94211adL.LJLJJI)) {
            if (fArr[1] < c94211adL.LJLJJI) {
                enumC93777aWL = EnumC93777aWL.TOP;
            } else {
                enumC93777aWL = EnumC93777aWL.BOTTOM;
            }
        } else if (fArr[0] < c94211adL.LJLJI) {
            enumC93777aWL = EnumC93777aWL.LEFT;
        } else {
            enumC93777aWL = EnumC93777aWL.RIGHT;
        }
        this.LIZ = enumC93777aWL;
    }
}
