package X;

import android.webkit.WebView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.NMt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59239NMt extends AbstractC65781Prl implements InterfaceC88474Ynu<WebView, String, java.util.Map<String, String>, InterfaceC88471Ynr<? super String, ? super java.util.Map<String, String>, ? extends C76800UCe>, C76800UCe> {
    public static final C59239NMt INSTANCE = new C59239NMt();

    public C59239NMt() {
        super(4);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WebView webView, String str, java.util.Map<String, String> map, InterfaceC88471Ynr<? super String, ? super java.util.Map<String, String>, C76800UCe> resolve) {
        o.LJIIIZ(webView, "$this$null");
        o.LJIIIZ(resolve, "resolve");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Boolean enableReferer = C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getEnableReferer();
            o.LJIIIIZZ(enableReferer, "get().adLandingPageConfig.enableReferer");
            if (enableReferer.booleanValue()) {
                linkedHashMap.put("referer", "https://www.tiktok.com");
                linkedHashMap.put("x-has-set-referer", "1");
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        resolve.invoke(str, linkedHashMap);
    }

    @Override // X.InterfaceC88474Ynu
    public /* bridge */ /* synthetic */ C76800UCe invoke(WebView webView, String str, java.util.Map<String, String> map, InterfaceC88471Ynr<? super String, ? super java.util.Map<String, String>, ? extends C76800UCe> interfaceC88471Ynr) {
        invoke2(webView, str, map, (InterfaceC88471Ynr<? super String, ? super java.util.Map<String, String>, C76800UCe>) interfaceC88471Ynr);
        return C76800UCe.LIZ;
    }
}
