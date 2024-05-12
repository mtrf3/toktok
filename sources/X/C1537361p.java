package X;

import android.view.View;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.61p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1537361p {
    public static final Field LIZ;
    public static List<C1536261e> LIZIZ;

    static {
        Field field;
        try {
            field = View.class.getDeclaredField("mContext");
        } catch (Exception e) {
            H7B.LIZJ(e.getLocalizedMessage());
            field = null;
        }
        LIZ = field;
        LIZIZ = new ArrayList();
    }
}
