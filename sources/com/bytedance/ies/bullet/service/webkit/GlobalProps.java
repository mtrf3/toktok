package com.bytedance.ies.bullet.service.webkit;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import android.webkit.JavascriptInterface;

/* loaded from: classes11.dex */
public final class GlobalProps {
    public String LIZ;

    @JavascriptInterface
    public final String getGlobalProps() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Ljava/lang/String;", "-1711368900395039363");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300001, "com/bytedance/ies/bullet/service/webkit/GlobalProps", "getGlobalProps", this, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/ies/bullet/service/webkit/GlobalProps", "getGlobalProps", null, objArr, this, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String str = this.LIZ;
        if (str == null) {
            str = "";
        }
        c03880Dg.LIZIZ(300001, "com/bytedance/ies/bullet/service/webkit/GlobalProps", "getGlobalProps", str, objArr, this, c65300Pk0, true);
        return str;
    }
}
