package X;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Eyg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38182Eyg {
    public static final /* synthetic */ int LJIJ = 0;
    public WebViewClient LIZ;
    public WebChromeClient LIZIZ;
    public final List<String> LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;
    public boolean LJI;
    public String LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public InterfaceC38140Ey0 LJIIJ;
    public C38049EwX LJIIJJI;
    public C38118Exe LJIIL;
    public C38113ExZ LJIILIIL;
    public C38219EzH LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final java.util.Map<String, C38184Eyi> LJIILLIIL;
    public final WebView LJIIZILJ;

    public final void LIZ() {
        List<String> list;
        C38116Exc c38116Exc = new C38116Exc(this.LJIIZILJ);
        c38116Exc.LJIIIIZZ = true;
        c38116Exc.LIZLLL = this.LJII;
        c38116Exc.LJIILIIL.addAll(this.LJ);
        C38126Exm c38126Exm = new C38126Exm(new C38181Eyf(this));
        c38116Exc.LJ = c38126Exm;
        c38126Exm.LIZIZ = c38116Exc.LJIJ;
        c38116Exc.LJIIIZ.add(new C38183Eyh(this));
        List<String> list2 = this.LIZLLL;
        if (list2 == null || ((ArrayList) list2).isEmpty()) {
            list = this.LIZJ;
        } else {
            list = this.LIZLLL;
        }
        c38116Exc.LJIIL.addAll(list);
        c38116Exc.LJI = this.LJI;
        c38116Exc.LJII = true;
        c38116Exc.LJIIIZ.add(this.LJIIJ);
        if (this.LJIIIZ) {
            c38116Exc.LJIILL = true;
        }
        C38113ExZ LIZ = c38116Exc.LIZ();
        this.LJIILIIL = LIZ;
        C38118Exe c38118Exe = new C38118Exe(this.LJIIZILJ, LIZ);
        this.LJIIL = c38118Exe;
        this.LJIIJJI = c38118Exe.LIZIZ;
    }

    public C38182Eyg(C59614NaU webView) {
        o.LJIIJ(webView, "webView");
        this.LJIIZILJ = webView;
        this.LIZJ = new ArrayList();
        this.LIZLLL = new ArrayList();
        this.LJ = new ArrayList();
        this.LJFF = new ArrayList();
        this.LJII = "ToutiaoJSBridge";
        this.LJIIIIZZ = "bytedance";
        this.LJIILL = C221108m2.LIZIZ(C38187Eyl.LJLIL);
        this.LJIILLIIL = new LinkedHashMap();
    }

    public final boolean LIZIZ(String str) {
        C38049EwX c38049EwX = this.LJIIJJI;
        if (c38049EwX != null && c38049EwX.LIZJ(str)) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(String str, JSONObject jSONObject) {
        C38049EwX c38049EwX = this.LJIIJJI;
        if (c38049EwX != null) {
            c38049EwX.LJIIIIZZ(str, jSONObject);
        }
    }

    public final void LIZJ(InterfaceC38217EzF interfaceC38217EzF, String str, JSONObject jSONObject) {
        C38184Eyi c38184Eyi;
        if (str != null) {
            c38184Eyi = (C38184Eyi) ((LinkedHashMap) this.LJIILLIIL).get(str);
            if (c38184Eyi == null) {
                c38184Eyi = new C38184Eyi();
                this.LJIILLIIL.put(str, c38184Eyi);
            }
            C38184Eyi.LIZIZ(c38184Eyi);
        } else {
            c38184Eyi = null;
        }
        C38049EwX c38049EwX = this.LJIIJJI;
        if (c38049EwX != null) {
            c38049EwX.LIZLLL(str, jSONObject);
        }
        if (c38184Eyi != null) {
            C38184Eyi.LIZJ(c38184Eyi);
            c38184Eyi.LJI = System.currentTimeMillis();
            if (c38184Eyi.LIZ()) {
                if (str != null) {
                    this.LJIILLIIL.remove(str);
                }
                C38219EzH c38219EzH = this.LJIILJJIL;
                if (c38219EzH != null) {
                    c38219EzH.invoke(interfaceC38217EzF.getName(), c38184Eyi);
                }
            }
        }
    }
}
