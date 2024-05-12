package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A9Y {
    public static WeakReference<Bundle> LIZ;

    public static Object LIZ(Context context, String str) {
        Bundle bundle;
        try {
            WeakReference<Bundle> weakReference = LIZ;
            if (weakReference != null) {
                bundle = weakReference.get();
            } else {
                bundle = null;
            }
            if (bundle == null) {
                ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128);
                o.LJIIIIZZ(LLLLLLLLL, "context.packageManager.g…ageManager.GET_META_DATA)");
                bundle = LLLLLLLLL.metaData;
                LIZ = new WeakReference<>(bundle);
            }
            o.LJI(bundle);
            return C16880lQ.LLJJIII(bundle, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
