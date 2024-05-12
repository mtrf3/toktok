package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G4I extends G46 {
    public static float LIZLLL = -1.0f;
    public static int LJ = -1;
    public static int LJFF = -1;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 22));

    @Override // X.G48, X.InterfaceC86124Xr6
    public final void onActivityPreCreated(ActivityC86117Xqz activity, Bundle bundle) {
        int i;
        o.LJIIIZ(activity, "activity");
        float f = 1.0f;
        if (((Boolean) this.LIZJ.getValue()).booleanValue() && (i = G4K.LIZ) != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        f = 1.18f;
                    }
                } else {
                    f = 1.1f;
                }
            } else {
                f = 1.05f;
            }
        }
        if (LIZLLL < 0.0f) {
            Resources resources = activity.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            Configuration configuration = resources.getConfiguration();
            LIZLLL = displayMetrics.density;
            LJ = displayMetrics.densityDpi;
            LJFF = configuration.screenWidthDp;
            activity.getApplication().registerComponentCallbacks(new G4J(activity));
        }
        Resources resources2 = activity.getResources();
        Configuration configuration2 = resources2.getConfiguration();
        float f2 = LJFF;
        int i2 = (int) (f2 / f);
        float f3 = f2 / i2;
        float f4 = LIZLLL * f3;
        float f5 = configuration2.fontScale * f4;
        int i3 = (int) (LJ * f3);
        configuration2.screenWidthDp = i2;
        configuration2.screenHeightDp = (int) (configuration2.screenHeightDp / f3);
        configuration2.smallestScreenWidthDp = i2;
        configuration2.densityDpi = i3;
        for (DisplayMetrics displayMetrics2 : C47261Igj.LJJIJIIJI(activity.getApplication().getResources().getDisplayMetrics(), activity.getResources().getDisplayMetrics(), Resources.getSystem().getDisplayMetrics())) {
            displayMetrics2.density = f4;
            displayMetrics2.scaledDensity = f5;
            displayMetrics2.densityDpi = i3;
        }
        resources2.updateConfiguration(resources2.getConfiguration(), activity.getResources().getDisplayMetrics());
        C60540NpQ.LJIL = Float.valueOf(f4);
    }
}
