package X;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.FdX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39419FdX {
    public static Locale LIZ() {
        if (Build.VERSION.SDK_INT >= 24) {
            return EF7.LIZIZ().getResources().getConfiguration().getLocales().get(0);
        }
        return EF7.LIZIZ().getResources().getConfiguration().locale;
    }

    public static boolean LIZIZ() {
        if (TextUtils.equals(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage()) || TextUtils.equals(Locale.getDefault().getLanguage(), Locale.ENGLISH.getLanguage())) {
            return true;
        }
        return false;
    }
}
