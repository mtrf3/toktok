package X;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.o;

/* renamed from: X.Fd6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39392Fd6 {
    public static final /* synthetic */ int LIZ = 0;

    public static SharedPreferences LIZ(Context context) {
        o.LJIIIZ(context, "context");
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "key_language_sp_key");
        o.LJIIIIZZ(LIZIZ, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return LIZIZ;
    }

    public static final String LIZIZ(String str, String str2) {
        return LIZ(EF7.LIZIZ()).getString(str, str2);
    }

    public static final void LIZJ(String str, String str2) {
        LIZ(EF7.LIZIZ()).edit().putString(str, str2).apply();
    }
}
