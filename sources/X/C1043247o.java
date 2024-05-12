package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.47o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1043247o {
    public static final C1043247o LIZ = new C1043247o();

    public static final boolean LIZ(Context context, String str) {
        o.LJIIIZ(context, "context");
        if (str == null || str.length() == 0) {
            C34B.LJI("SafeUrlOpenHelper", "openUrl url empty");
            return false;
        }
        try {
            InterfaceC83383Pa interfaceC83383Pa = C85773Yf.LJLJI;
            if (interfaceC83383Pa == null) {
                return true;
            }
            ((C77876UhM) interfaceC83383Pa).LJII(context, str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
