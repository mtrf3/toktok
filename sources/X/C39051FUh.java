package X;

import android.content.Context;
import com.bytedance.librarian.Librarian;
import java.lang.reflect.Method;

/* renamed from: X.FUh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39051FUh {
    public static final void LIZ(String str) {
        if (C39052FUi.LIZIZ == null) {
            try {
                Class cls = Boolean.TYPE;
                Method declaredMethod = Librarian.class.getDeclaredMethod("LJI", String.class, cls, cls, Context.class);
                C39052FUi.LIZIZ = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        try {
            Method method = C39052FUi.LIZIZ;
            Boolean bool = Boolean.FALSE;
            method.invoke(null, str, bool, bool, null);
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
