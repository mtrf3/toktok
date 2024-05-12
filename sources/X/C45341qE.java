package X;

import android.graphics.Matrix;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.1qE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45341qE extends AbstractC65781Prl implements InterfaceC88471Ynr<View, Matrix, C76800UCe> {
    public static final C45341qE LJLIL = new C45341qE();

    public C45341qE() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(View view, Matrix matrix) {
        View view2 = view;
        Matrix matrix2 = matrix;
        o.LJIIIZ(view2, "view");
        o.LJIIIZ(matrix2, "matrix");
        matrix2.set(view2.getMatrix());
        return C76800UCe.LIZ;
    }
}
