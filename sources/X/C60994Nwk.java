package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* renamed from: X.Nwk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60994Nwk {
    public static Rect LIZ(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            o.LJII(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (Exception unused) {
            return C60993Nwj.LIZ(activity);
        }
    }
}
