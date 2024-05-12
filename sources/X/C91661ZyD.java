package X;

import android.content.Context;
import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.o;

/* renamed from: X.ZyD, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91661ZyD {
    public C91661ZyD(Context activity) {
        o.LJIIIZ(activity, "activity");
    }

    @JavascriptInterface
    public final boolean postMessage(String str, String str2) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, str2};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Ljava/lang/String;)Z", "-6186272636331136011");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/VendorSettingHandler$JsObject", "postMessage", this, objArr, "boolean", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/VendorSettingHandler$JsObject", "postMessage", null, objArr, this, c65300Pk0, false);
            return ((Boolean) LIZJ.LIZIZ).booleanValue();
        }
        c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/bnpl/hybrid/VendorSettingHandler$JsObject", "postMessage", Boolean.FALSE, objArr, this, c65300Pk0, true);
        return false;
    }
}
