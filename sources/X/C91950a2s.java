package X;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.o;

/* renamed from: X.a2s, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91950a2s {
    public static String LIZ(String scheme) {
        o.LJIIIZ(scheme, "scheme");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(scheme);
        LIZ.append("://pipopay");
        LIZ.append(EnumC91972a3E.CheckoutPayResult.getPath());
        return X1D.LIZIZ(LIZ);
    }

    public static String LIZIZ(String str, String title, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 4) != 0) {
            title = "";
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        if ((i & 64) != 0) {
            z4 = true;
        }
        if ((i & 128) != 0) {
            z5 = false;
        }
        o.LJIIIZ(title, "title");
        String encode = URLEncoder.encode(str, StandardCharsets.UTF_8.name());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("webview");
        LIZ.append("/?url=");
        LIZ.append((Object) encode);
        LIZ.append("&title=");
        LIZ.append(title);
        LIZ.append("&quitWithPop=");
        LIZ.append(z);
        LIZ.append("&disableBackground=");
        LIZ.append(z2);
        LIZ.append("&displayBackButton=");
        LIZ.append(z3);
        LIZ.append("&displayCloseButton=");
        LIZ.append(z4);
        LIZ.append("&hideLoading=");
        LIZ.append(z5);
        return X1D.LIZIZ(LIZ);
    }
}
