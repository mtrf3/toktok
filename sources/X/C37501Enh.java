package X;

import Y.ARunnableS25S0200000_6;
import Y.ARunnableS9S0101000_5;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.pia.core.plugins.PiaPropsPlugin;
import com.google.gson.j;
import java.lang.ref.WeakReference;

/* renamed from: X.Enh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37501Enh implements InterfaceC37489EnV {
    public final BQ8 LIZ;
    public final WeakReference<WebView> LIZIZ;

    @JavascriptInterface
    public String getManifest() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Ljava/lang/String;", "3496185089549956993");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300001, "com/bytedance/pia/core/plugins/PiaPropsPlugin$JSInterface", "getManifest", this, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/pia/core/plugins/PiaPropsPlugin$JSInterface", "getManifest", null, objArr, this, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String LIZ = LIZ("getManifest");
        c03880Dg.LIZIZ(300001, "com/bytedance/pia/core/plugins/PiaPropsPlugin$JSInterface", "getManifest", LIZ, objArr, this, c65300Pk0, true);
        return LIZ;
    }

    @JavascriptInterface
    public String getPageConfig() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Ljava/lang/String;", "3496185089549956993");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300001, "com/bytedance/pia/core/plugins/PiaPropsPlugin$JSInterface", "getPageConfig", this, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/pia/core/plugins/PiaPropsPlugin$JSInterface", "getPageConfig", null, objArr, this, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        String LIZ = LIZ("getPageConfig");
        c03880Dg.LIZIZ(300001, "com/bytedance/pia/core/plugins/PiaPropsPlugin$JSInterface", "getPageConfig", LIZ, objArr, this, c65300Pk0, true);
        return LIZ;
    }

    @Override // X.InterfaceC37489EnV
    public final void release() {
        C37613EpV.LIZIZ(new ARunnableS9S0101000_5(3, this, 12));
    }

    public final String LIZ(String str) {
        C37499Enf c37499Enf;
        j LJJIJ;
        Object obj = this.LIZ.get("ctx-pia-runtime");
        if (!(obj instanceof C37499Enf) || (c37499Enf = (C37499Enf) obj) == null) {
            return null;
        }
        AbstractC37502Eni LJFF = c37499Enf.LJFF("pia_props");
        if (!(LJFF instanceof PiaPropsPlugin) || (LJJIJ = ((PiaPropsPlugin) LJFF).LIZIZ.LJJIJ(str)) == null) {
            return null;
        }
        return LJJIJ.LJJIFFI();
    }

    public C37501Enh(BQ8 bq8, WebView webView) {
        this.LIZ = bq8;
        this.LIZIZ = new WeakReference<>(webView);
        C37613EpV.LIZIZ(new ARunnableS25S0200000_6(webView, this, 1));
    }
}
