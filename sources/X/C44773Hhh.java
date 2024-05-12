package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* renamed from: X.Hhh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44773Hhh {
    public static final String[] LIZ = {"576x1024", "720x1280", "720x1280", "720x1280", "1080x1920"};

    public static final List<String> LIZ() {
        try {
            String[] strArr = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("upload_video_size_category", String[].class, LIZ);
            if (strArr != null) {
                return ORY.LJJZZIII(strArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
