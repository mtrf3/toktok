package X;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.F5x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38417F5x implements F61 {
    public final String[] LIZ = {"https://www.tiktok.com/age-verification/", "market://details?id=com.zhiliaoapp.musically", "https://play.google.com/store/apps/details?id=com.zhiliaoapp.musically", "https://play.google.com/store/apps/details?id=com.ss.android.ugc.trill"};

    @Override // X.F61
    public final boolean LIZ(Intent intent) {
        o.LJIIIZ(intent, "intent");
        return true;
    }

    @Override // X.F61
    public final boolean LIZIZ(Intent intent) {
        android.net.Uri data;
        o.LJIIIZ(intent, "intent");
        if (!TextUtils.equals(intent.getAction(), "android.intent.action.VIEW") || (data = intent.getData()) == null) {
            return false;
        }
        String uri = data.toString();
        o.LJIIIIZZ(uri, "uri.toString()");
        String lowerCase = uri.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        for (String str : this.LIZ) {
            if (ujb.o.LJJJLIIL(lowerCase, str, false)) {
                return true;
            }
        }
        return false;
    }
}
