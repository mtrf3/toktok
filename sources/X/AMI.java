package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AMI {
    public static final Field LIZ;

    static {
        try {
            LIZ = View.class.getDeclaredField("mContext");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            LIZ = null;
        }
    }

    public static boolean LIZ(Context context) {
        o.LJIIJ(context, "context");
        if (context instanceof ActivityC45651qj) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void LIZIZ(Activity activity, View view) {
        int childCount;
        synchronized (view) {
            if (!(view.getContext() instanceof Activity) || (!o.LJ(view.getContext(), activity))) {
                o.LJIIJ(activity, "activity");
                int i = 0;
                try {
                    Field field = LIZ;
                    if (field != null) {
                        field.setAccessible(true);
                        field.set(view, activity);
                        field.setAccessible(false);
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount() - 1) >= 0) {
                    while (true) {
                        View childAt = ((ViewGroup) view).getChildAt(i);
                        o.LJFF(childAt, "view.getChildAt(i)");
                        LIZIZ(activity, childAt);
                        if (i == childCount) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
    }
}
