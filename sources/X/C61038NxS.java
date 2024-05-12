package X;

import Y.ARunnableS46S0100000_10;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.NxS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61038NxS implements ValueCallback<String> {
    public static long LJIILIIL;
    public static final /* synthetic */ int LJIILJJIL = 0;
    public boolean LIZ;
    public final WeakReference<WebView> LIZJ;
    public final WebView LIZLLL;
    public final List<String> LJ;
    public final InterfaceC58236MtM LJFF;
    public final boolean LJI;
    public final String LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public String LJIIJJI;
    public final ARunnableS46S0100000_10 LJIIL;
    public final C61042NxW LIZIZ = new C61042NxW();
    public final Handler LJIIJ = new Handler();

    public final void LIZ() {
        C61042NxW c61042NxW = this.LIZIZ;
        if (c61042NxW.LJIJI == 0) {
            return;
        }
        if (TextUtils.equals(c61042NxW.LJIL, c61042NxW.LJI)) {
            this.LIZIZ.LJIIL = true;
            LIZIZ(true, false);
        } else {
            this.LIZIZ.LJIILLIIL++;
        }
    }

    public final boolean LIZLLL(C61042NxW c61042NxW) {
        if (this.LJ != null && !TextUtils.isEmpty(c61042NxW.LJFF)) {
            for (String str : this.LJ) {
                String str2 = c61042NxW.LJFF;
                if (str2 != null && s.LJJJLZIJ(str2, str, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(String str) {
        String value = str;
        o.LJIIIZ(value, "value");
        if (TextUtils.isEmpty(value) || TextUtils.equals("null", value) || TextUtils.equals("{}", value)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (jSONObject.has("detailGetWebViewData")) {
                this.LJIIJJI = JSONObjectProtectorUtils.getString(jSONObject, "detailGetWebViewData");
                SystemClock.uptimeMillis();
            }
            jSONObject.has("detailClearWebViewData");
            jSONObject.has("detailEnableDomData");
        } catch (Exception unused) {
        }
    }

    public final void LIZIZ(boolean z, boolean z2) {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        C61042NxW c61042NxW = this.LIZIZ;
        if (c61042NxW.LJIIL) {
            return;
        }
        if (!z && z2) {
            return;
        }
        c61042NxW.LJIILIIL = true;
    }

    public final void LIZJ(C61038NxS c61038NxS, String str) {
        WebView webView = this.LIZLLL;
        if (webView != null && this.LJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ttwebview:/*");
            LIZ.append(str);
            LIZ.append("*/;");
            webView.evaluateJavascript(X1D.LIZIZ(LIZ), c61038NxS);
        }
    }

    public C61038NxS(WebView webView, List<String> list, InterfaceC58236MtM interfaceC58236MtM, InterfaceC60603NqR interfaceC60603NqR) {
        boolean z;
        String LIZJ;
        this.LIZJ = new WeakReference<>(webView);
        this.LIZLLL = webView;
        this.LJ = list;
        this.LJFF = interfaceC58236MtM;
        if (interfaceC60603NqR != null && interfaceC60603NqR.LJI()) {
            z = true;
        } else {
            z = false;
        }
        this.LJI = z;
        this.LJII = (interfaceC60603NqR == null || (LIZJ = interfaceC60603NqR.LIZJ()) == null) ? "" : LIZJ;
        this.LJIIL = new ARunnableS46S0100000_10(this, 91);
    }
}
