package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.VMm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79616VMm {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, WebView webView, VMG nativeCommon) {
        String LJIIIIZZ;
        String LJIIIIZZ2;
        String LJIIIIZZ3;
        o.LJIIJ(nativeCommon, "nativeCommon");
        String str2 = nativeCommon.LJLIL;
        if ((str2 == null || str2.length() == 0) && (LJIIIIZZ = OFI.LJIIIIZZ(webView, str, "url")) != null) {
            nativeCommon.LJLIL = LJIIIIZZ;
        }
        String str3 = nativeCommon.LJLJJI;
        if ((str3 == null || str3.length() == 0) && (LJIIIIZZ2 = OFI.LJIIIIZZ(webView, str, "native_page")) != null) {
            nativeCommon.LJLJJI = LJIIIIZZ2;
        }
        String str4 = nativeCommon.LJLJI;
        if ((str4 == null || str4.length() == 0) && (LJIIIIZZ3 = OFI.LJIIIIZZ(webView, str, "container_type")) != null) {
            nativeCommon.LJLJI = LJIIIIZZ3;
        }
    }
}
