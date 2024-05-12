package com.bytedance.lynx.hybrid.webkit;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import android.webkit.JavascriptInterface;
import java.util.Map;

/* loaded from: classes11.dex */
public final class GlobalProps {
    public String LIZ;
    public Map<String, ? extends Object> LIZIZ;

    @JavascriptInterface
    public final String getGlobalProps() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Ljava/lang/String;", "-6211771406112300403");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300001, "com/bytedance/lynx/hybrid/webkit/GlobalProps", "getGlobalProps", this, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/lynx/hybrid/webkit/GlobalProps", "getGlobalProps", null, objArr, this, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String str = this.LIZ;
        if (str == null) {
            str = "";
        }
        c03880Dg.LIZIZ(300001, "com/bytedance/lynx/hybrid/webkit/GlobalProps", "getGlobalProps", str, objArr, this, c65300Pk0, true);
        return str;
    }
}
