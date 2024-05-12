package Y;

import X.C141335gf;
import X.C198517qh;
import X.C35995EAt;
import X.C35996EAu;
import X.C37034EgA;
import X.C37791EsN;
import X.C37804Esa;
import X.C38693FGn;
import X.C3C5;
import X.C76800UCe;
import X.C8HX;
import X.FYZ;
import X.JBR;
import X.VMI;
import X.WM7;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sliver.Sliver;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.TTHYBRIDXHR;
import com.ss.android.ugc.tiktok.security.jsguard.InjectJsGuardSettings;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS1S2100000_6 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("url", this.s0);
        c198517qh.LIZ.put("web_url", C37804Esa.LIZ((WebView) this.l2));
        c198517qh.LIZ.put("status", Integer.valueOf(C37804Esa.LJ((WebView) this.l2) ? 1 : 0));
        c198517qh.LIZ.put(WM7.SCENE_SERVICE, this.s1);
        c198517qh.LIZ.put("type", String.valueOf(C37804Esa.LIZIZ((WebView) this.l2)));
        C8HX.LIZIZ("webview_ttnet_intercept_status", "", c198517qh.LJ());
    }

    public final void LIZ$1() {
        WebView webView = ((TTHYBRIDXHR) this.l2).LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("!function(){window.imy_realxhr_callback(\"");
        LIZ.append(this.s0);
        LIZ.append("\", JSON.parse(decodeURIComponent(\"");
        webView.evaluateJavascript(JBR.LJFF(LIZ, this.s1, "\")))}()", LIZ), C37791EsN.LIZ);
    }

    public final void LIZ$2() {
        Object LIZ;
        C37034EgA c37034EgA = (C37034EgA) this.l2;
        String str = this.s0;
        String str2 = this.s1;
        try {
            JSONObject jSONObject = new JSONObject();
            C35996EAu LIZIZ = C35995EAt.LIZIZ(str);
            if (LIZIZ != null) {
                jSONObject.put("url", LIZIZ.LIZ);
                jSONObject.put("path", LIZIZ.LIZIZ);
                jSONObject.put("query", LIZIZ.LIZJ);
            }
            int i = InjectJsGuardSettings.LIZ().scriptClipLength;
            if (str2.length() > i) {
                str2 = str2.substring(0, i);
                o.LJIIIIZZ(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            jSONObject.put("script", str2);
            VMI.LJ.LJIILLIIL(c37034EgA.LJLJJI, str, "webview_js_block", jSONObject, null, null, null);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
    }

    public static final void run$0(ARunnableS1S2100000_6 aRunnableS1S2100000_6) {
        boolean LIZ;
        long j;
        Long l;
        try {
            if (!TextUtils.isEmpty(aRunnableS1S2100000_6.s0) && (l = Sliver.mark.get(aRunnableS1S2100000_6.s0)) != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            Sliver.nDump(((FYZ) aRunnableS1S2100000_6.l2).LIZ, aRunnableS1S2100000_6.s1, j);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S2100000_6 aRunnableS1S2100000_6) {
        boolean LIZ;
        try {
            aRunnableS1S2100000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS1S2100000_6 aRunnableS1S2100000_6) {
        boolean LIZ;
        try {
            aRunnableS1S2100000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS1S2100000_6 aRunnableS1S2100000_6) {
        boolean LIZ;
        try {
            aRunnableS1S2100000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS1S2100000_6 aRunnableS1S2100000_6) {
        boolean LIZ;
        try {
            C38693FGn.LIZJ((Context) aRunnableS1S2100000_6.l2, aRunnableS1S2100000_6.s0).edit().remove(aRunnableS1S2100000_6.s1).apply();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S2100000_6(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
