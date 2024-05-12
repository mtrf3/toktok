package X;

import android.content.res.Configuration;

/* loaded from: classes6.dex */
public final class CNQ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Configuration configuration) {
        if (configuration == null || (configuration.uiMode & 48) != 32) {
            return "light";
        }
        return "dark";
    }
}
