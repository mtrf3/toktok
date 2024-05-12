package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.FQr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38957FQr {
    public static volatile C38957FQr LIZ;

    public static final String LIZ(Context context, String str) {
        int intValue;
        o.LJIIIZ(context, "context");
        Integer num = C38958FQs.LIZIZ.get(str);
        if (num == null || (intValue = num.intValue()) == 0) {
            return "";
        }
        String string = context.getString(intValue);
        o.LJIIIIZZ(string, "context.getString(liveResource)");
        return string;
    }

    public final Boolean LIZIZ(Context context, String str) {
        Activity activity;
        boolean LIZ2;
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        if (str == null) {
            LIZ2 = true;
        } else {
            LIZ2 = C38959FQt.LIZ(UriProtector.parse(str), activity);
        }
        return Boolean.valueOf(LIZ2);
    }
}
