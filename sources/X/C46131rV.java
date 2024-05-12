package X;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: X.1rV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C46131rV extends C40591iZ {
    public static boolean LJLJLLL = true;
    public static boolean LJLL = true;

    public void LJJJLL(View view, Matrix matrix) {
        if (LJLJLLL) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                LJLJLLL = false;
            }
        }
    }

    public void LJJJLZIJ(View view, Matrix matrix) {
        if (LJLL) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                LJLL = false;
            }
        }
    }
}
