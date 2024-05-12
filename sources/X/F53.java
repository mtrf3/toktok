package X;

import android.os.Bundle;
import com.bytedance.common.utility.reflect.Reflect;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class F53 {
    public static void LIZ(Bundle bundle) {
        String str;
        java.util.Set<String> keySet = bundle.keySet();
        o.LJIIIIZZ(keySet, "savedState.keySet()");
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            Object LLJJIII = C16880lQ.LLJJIII(bundle, it.next());
            String str2 = null;
            if (LLJJIII != null) {
                str = LLJJIII.getClass().getName();
            } else {
                str = null;
            }
            if (!o.LJ(str, "androidx.fragment.app.FragmentManagerState")) {
                if (LLJJIII != null) {
                    str2 = LLJJIII.getClass().getName();
                }
                if (o.LJ(str2, "android.app.FragmentManagerState")) {
                }
            }
            Object obj = Reflect.on(LLJJIII).field("mActive", new Class[0]).get();
            o.LJIIIIZZ(obj, "on(state).field(\"mActive\").get<Array<out Any>>()");
            for (Object obj2 : (Object[]) obj) {
                Bundle bundle2 = (Bundle) Reflect.on(obj2).field("mSavedFragmentState", new Class[0]).get();
                if (bundle2 != null) {
                    bundle2.remove("android:view_state");
                }
            }
        }
    }

    public static final boolean LIZJ(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        try {
            Reflect.on(activity.getSupportFragmentManager()).call("dispatchCreate");
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tryRedispatchActivityCreate failed, reason: ");
            LIZ.append(android.util.Log.getStackTraceString(e));
            H7B.LIZ(X1D.LIZIZ(LIZ));
            return false;
        }
    }

    public static final boolean LIZIZ(Bundle bundle, Exception exc) {
        String message;
        boolean z = false;
        if (bundle == null || !(exc instanceof RuntimeException) || (message = exc.getMessage()) == null || !s.LJJJLZIJ(message, "Unmarshalling unknown type code", false)) {
            return false;
        }
        try {
            LIZ(bundle);
            z = true;
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tryFixViewStateRestoreCrash failed, reason: ");
            LIZ.append(android.util.Log.getStackTraceString(e));
            H7B.LIZ(X1D.LIZIZ(LIZ));
            return z;
        }
    }
}
