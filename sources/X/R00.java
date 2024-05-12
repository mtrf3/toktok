package X;

import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public final class R00 {
    public static Parcelable LIZ(Bundle bundle, String str) {
        ClassLoader classLoader = R00.class.getClassLoader();
        QH7.LJIIIIZZ(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void LIZIZ(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable LIZ = LIZ(bundle, "MapOptions");
        if (LIZ != null) {
            LIZJ(bundle2, "MapOptions", LIZ);
        }
        Parcelable LIZ2 = LIZ(bundle, "StreetViewPanoramaOptions");
        if (LIZ2 != null) {
            LIZJ(bundle2, "StreetViewPanoramaOptions", LIZ2);
        }
        Parcelable LIZ3 = LIZ(bundle, "camera");
        if (LIZ3 != null) {
            LIZJ(bundle2, "camera", LIZ3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (!bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            return;
        }
        bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
    }

    public static void LIZJ(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = R00.class.getClassLoader();
        QH7.LJIIIIZZ(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
