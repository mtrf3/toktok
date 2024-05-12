package X;

import android.graphics.Color;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.6mB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170236mB {
    public static final int LIZ = KL2.LJIIJJI(C60903NvH.LJ) - (((int) KL2.LIZJ(C60903NvH.LJ, 24.0f)) * 2);
    public static int[] LIZIZ;

    public static int[] LIZ() {
        int i;
        List<String> LIZJ = C60903NvH.LJIIJJI().LJIJI().LIZJ();
        if (LIZJ == null || LIZJ.isEmpty()) {
            int[] iArr = LIZIZ;
            if (iArr != null) {
                return iArr;
            }
            int[] intArray = C60903NvH.LJ.getResources().getIntArray(R.array.u);
            LIZIZ = intArray;
            return intArray;
        }
        int[] iArr2 = new int[LIZJ.size()];
        for (int i2 = 0; i2 < LIZJ.size(); i2++) {
            try {
                i = Color.parseColor((String) ListProtector.get(LIZJ, i2));
            } catch (Exception unused) {
                i = -1;
            }
            iArr2[i2] = i;
        }
        return iArr2;
    }
}
