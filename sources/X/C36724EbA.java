package X;

import android.app.Application;
import android.database.CursorWindow;
import java.lang.reflect.Field;

/* renamed from: X.EbA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36724EbA extends F8Y {
    public static int LIZ = -1;
    public static Field LIZIZ;

    @Override // X.F8Y
    public final String LIZIZ() {
        return "CursorWindowPlugin";
    }

    @Override // X.F8Y
    public final void LIZLLL() {
        Field LIZ2 = EWF.LIZ(CursorWindow.class, "sCursorWindowSize");
        LIZIZ = LIZ2;
        if (LIZ2 != null) {
            LIZ2.setAccessible(true);
            try {
                Field field = LIZIZ;
                C73340SqO.LJIIL(field, "The field must not be null");
                int intValue = ((Integer) EWF.LIZIZ(field, null)).intValue();
                LIZ = intValue;
                if (intValue != 1048576) {
                    Field field2 = LIZIZ;
                    C73340SqO.LJIIL(field2, "The field must not be null");
                    if (!field2.isAccessible()) {
                        field2.setAccessible(true);
                    }
                    field2.set(null, 1048576);
                }
                Field field3 = LIZIZ;
                C73340SqO.LJIIL(field3, "The field must not be null");
                int intValue2 = ((Integer) EWF.LIZIZ(field3, null)).intValue();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Resize cursor window size successful! Resize form :");
                LIZ3.append(LIZ);
                LIZ3.append("to ");
                LIZ3.append(intValue2);
                X1D.LIZIZ(LIZ3);
                F8X.LIZ();
            } catch (IllegalAccessException unused) {
            }
        }
    }

    @Override // X.F8Y
    public final void LIZJ(Application application) {
    }
}
