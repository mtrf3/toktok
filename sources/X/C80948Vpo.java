package X;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: X.Vpo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80948Vpo extends C80949Vpp {
    public static boolean LJLJLLL = true;
    public static boolean LJLL = true;

    public void LJIIJ(View view, Matrix matrix) {
        if (LJLJLLL) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                LJLJLLL = false;
            }
        }
    }

    public void LJIIJJI(View view, Matrix matrix) {
        if (LJLL) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                LJLL = false;
            }
        }
    }
}
