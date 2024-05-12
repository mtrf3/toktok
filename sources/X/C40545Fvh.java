package X;

import android.content.Context;
import java.util.Locale;

/* renamed from: X.Fvh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40545Fvh {
    public final Context LIZ;

    public C40545Fvh(Context context) {
        this.LIZ = context;
    }

    public static String LIZ(Locale locale) {
        String concat;
        String valueOf = String.valueOf(locale.getLanguage());
        if (locale.getCountry().isEmpty()) {
            concat = "";
        } else {
            String valueOf2 = String.valueOf(locale.getCountry());
            concat = valueOf2.length() != 0 ? "_".concat(valueOf2) : new String("_");
        }
        String valueOf3 = String.valueOf(concat);
        return valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf);
    }
}
