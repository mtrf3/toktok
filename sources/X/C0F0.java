package X;

import android.animation.ObjectAnimator;
import android.util.Property;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.0F0, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0F0 {
    public static C62046OWs LIZIZ() {
        return LiveOuterService.LJJJLL().LJJIZ().LJJJJIZL();
    }

    public static String LIZJ(String str, File file) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(file);
        return X1D.LIZIZ(LIZ);
    }

    public static String LIZLLL(String str, String str2, char c) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        LIZ.append(c);
        return X1D.LIZIZ(LIZ);
    }

    public static ObjectAnimator LIZ(C47121t6 c47121t6, Property property, float[] fArr, long j, String str) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) property, fArr).setDuration(j);
        o.LJIIIIZZ(duration, str);
        return duration;
    }
}
