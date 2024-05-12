package X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.appcompat.widget.z0;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OGC {
    public static boolean LIZ(Context context, InterfaceC27436Apk listener) {
        o.LJIIIZ(listener, "listener");
        boolean z = context instanceof z0;
        Object obj = context;
        if (z) {
            obj = ((ContextWrapper) context).getBaseContext();
        }
        if (obj instanceof OGB) {
            ((OGB) obj).setActivityResultListener(listener);
            return true;
        }
        if (obj instanceof InterfaceC32055Ci3) {
            ((InterfaceC32055Ci3) obj).ec(new OGD(listener));
            return true;
        }
        return false;
    }
}
