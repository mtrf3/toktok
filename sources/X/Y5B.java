package X;

import android.hardware.Camera;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.Collection;
import java.util.List;

/* loaded from: classes16.dex */
public final class Y5B {
    public static final /* synthetic */ int LIZ = 0;

    static {
        PatternProtector.compile(";");
    }

    public static String LIZ(Collection collection, String... strArr) {
        if (collection != null) {
            for (String str : strArr) {
                if (collection.contains(str)) {
                    return str;
                }
            }
            return null;
        }
        return null;
    }

    public static void LIZIZ(Camera.Parameters parameters, boolean z) {
        String LIZ2;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z) {
            LIZ2 = LIZ(supportedFlashModes, "torch", "on");
        } else {
            LIZ2 = LIZ(supportedFlashModes, "off");
        }
        if (LIZ2 == null || LIZ2.equals(parameters.getFlashMode())) {
            return;
        }
        parameters.setFlashMode(LIZ2);
    }
}
