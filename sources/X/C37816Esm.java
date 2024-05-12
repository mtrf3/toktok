package X;

import Y.ARunnableS25S0200000_6;
import android.webkit.WebView;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Esm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37816Esm extends FilterInputStream {
    public final /* synthetic */ C37821Esr LJLIL;
    public final /* synthetic */ InterfaceC37276Ek4<? extends Object> LJLILLLLZI;
    public final /* synthetic */ C64797Pbt<? extends Object> LJLJI;
    public final /* synthetic */ C37801EsX LJLJJI;
    public final /* synthetic */ WeakReference<WebView> LJLJJL;

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj;
        int i;
        Object LIZ;
        JSONObject jSONObject;
        C37821Esr c37821Esr = this.LJLIL;
        InterfaceC37276Ek4<? extends Object> interfaceC37276Ek4 = this.LJLILLLLZI;
        C64797Pbt<? extends Object> c64797Pbt = this.LJLJI;
        C37801EsX c37801EsX = this.LJLJJI;
        WeakReference<WebView> weakReference = this.LJLJJL;
        try {
            super.close();
            c37821Esr.LIZIZ.LJFF = System.currentTimeMillis();
            c37821Esr.LIZIZ.LIZIZ = System.currentTimeMillis();
            if (interfaceC37276Ek4 instanceof InterfaceC37818Eso) {
                ((InterfaceC37818Eso) interfaceC37276Ek4).doCollect();
            }
            C36910EeA c36910EeA = c64797Pbt.LIZ;
            C76800UCe c76800UCe = null;
            if (c36910EeA != null) {
                obj = c36910EeA.LJFF;
            } else {
                obj = null;
            }
            if (obj instanceof C64672PZs) {
                if (c37801EsX != null) {
                    String str = ((C64672PZs) obj).LJIL;
                    if (str != null) {
                        try {
                            LIZ = new JSONObject(str);
                            C3C5.m7constructorimpl(LIZ);
                        } catch (Throwable th) {
                            LIZ = C141335gf.LIZ(th);
                            C3C5.m7constructorimpl(LIZ);
                        }
                        if (C3C5.m12isFailureimpl(LIZ)) {
                            LIZ = null;
                        }
                        jSONObject = (JSONObject) LIZ;
                    } else {
                        jSONObject = null;
                    }
                    c37801EsX.LIZLLL = jSONObject;
                }
                String str2 = ((C64672PZs) obj).LJIL;
                if (str2 != null) {
                    C37817Esn c37817Esn = c37821Esr.LIZ;
                    c37817Esn.getClass();
                    c37817Esn.LJI = str2;
                }
                C37817Esn c37817Esn2 = c37821Esr.LIZ;
                c37817Esn2.LJII = ((C64672PZs) obj).LJJIJIIJIL;
                c37817Esn2.LJIIJ = ((C64672PZs) obj).LJIILJJIL;
            }
            List<EJ6> list = c64797Pbt.LIZ.LIZLLL;
            if (list != null) {
                for (EJ6 ej6 : list) {
                    String str3 = ej6.LIZ;
                    o.LJIIIIZZ(str3, "header.name");
                    Locale US = Locale.US;
                    o.LJIIIIZZ(US, "US");
                    String lowerCase = str3.toLowerCase(US);
                    o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (o.LJ(lowerCase, "content-type")) {
                        c37821Esr.LIZ.LJIIIIZZ = ej6.LIZIZ;
                    }
                    String str4 = ej6.LIZ;
                    o.LJIIIIZZ(str4, "header.name");
                    String lowerCase2 = str4.toLowerCase(US);
                    o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                    if (o.LJ(lowerCase2, "content-encoding")) {
                        c37821Esr.LIZ.LJIIIZ = ej6.LIZIZ;
                    }
                }
            }
            WebView webView = weakReference.get();
            if (webView != null) {
                webView.post(new ARunnableS25S0200000_6(webView, c37821Esr, 51));
            }
            if (!c64797Pbt.LIZIZ() && ((i = c64797Pbt.LIZ.LIZIZ) < 300 || i > 400)) {
                WebView webView2 = weakReference.get();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("request failed, http code: ");
                LIZ2.append(c64797Pbt.LIZ.LIZIZ);
                c37821Esr.LIZ(1, webView2, X1D.LIZIZ(LIZ2));
            }
            if (c37801EsX != null) {
                c37801EsX.LJI = true;
                WebView webView3 = weakReference.get();
                if (webView3 != null && c37801EsX.LJI && c37801EsX.LJII) {
                    webView3.post(new ARunnableS25S0200000_6(c37801EsX, webView3, 50));
                }
                c76800UCe = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37816Esm(C68322mC<InputStream> c68322mC, C37821Esr c37821Esr, InterfaceC37276Ek4<? extends Object> interfaceC37276Ek4, C64797Pbt<? extends Object> c64797Pbt, C37801EsX c37801EsX, WeakReference<WebView> weakReference) {
        super(c68322mC.element);
        this.LJLIL = c37821Esr;
        this.LJLILLLLZI = interfaceC37276Ek4;
        this.LJLJI = c64797Pbt;
        this.LJLJJI = c37801EsX;
        this.LJLJJL = weakReference;
    }
}
