package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BUR {
    public static String LIZ(Context context, String str) {
        SharedPreferences LIZIZ;
        String string;
        if (context == null || (LIZIZ = F9J.LIZIZ(context, 0, "live_mode")) == null || (string = LIZIZ.getString(i0.LJFF(str, "live_start_live_mode"), LiveMode.VIDEO.name())) == null) {
            return "";
        }
        return string;
    }

    public static void LIZIZ(Context context, String mode, String uid, boolean z) {
        SharedPreferences LIZIZ;
        SharedPreferences.Editor edit;
        o.LJIIIZ(mode, "mode");
        o.LJIIIZ(uid, "uid");
        if (context != null && (LIZIZ = F9J.LIZIZ(context, 0, "Congrats")) != null && (edit = LIZIZ.edit()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(uid);
            LIZ.append(mode);
            LIZ.append("apply_status");
            edit.putBoolean(X1D.LIZIZ(LIZ), z);
            edit.apply();
        }
    }
}
