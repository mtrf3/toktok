package X;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* renamed from: X.7DG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7DG {
    public static final Field LIZ;

    static {
        Field field;
        try {
            field = RecyclerView.class.getDeclaredField("LLILLIZIL");
            field.setAccessible(true);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            field = null;
        }
        LIZ = field;
    }
}
