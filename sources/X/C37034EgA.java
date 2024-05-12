package X;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ExecutorService;
import ujb.o;

/* renamed from: X.EgA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37034EgA extends C39586FgE {
    public final ExecutorService LJLJLJ;

    @Override // X.C39586FgE
    public final void LIZLLL() {
        EnumC37040EgG enumC37040EgG;
        C37039EgF LJIIIIZZ;
        WebView webView = this.LJLJJI;
        if (webView != null && (LJIIIIZZ = C78540Us4.LJIIIIZZ(webView)) != null) {
            enumC37040EgG = LJIIIIZZ.LJLIL;
        } else {
            enumC37040EgG = null;
        }
        if (enumC37040EgG == EnumC37040EgG.THIRD) {
            C37166EiI.LIZ();
        }
        super.LIZLLL();
    }

    public C37034EgA(ExecutorService executorService) {
        super(3);
        this.LJLJLJ = executorService;
    }

    @Override // X.C39586FgE
    public final void LJIIJ(String str) {
        String str2;
        if (str != null && o.LJJJLIIL(str, "javascript:", false)) {
            WebView webView = this.LJLJJI;
            kotlin.jvm.internal.o.LJIIIIZZ(webView, "webView");
            OSZ LIZ = C25950AGk.LIZ(webView);
            if (((Boolean) LIZ.getFirst()).booleanValue()) {
                WebView webView2 = this.LJLJJI;
                kotlin.jvm.internal.o.LJIIIIZZ(webView2, "webView");
                LJIILJJIL("loadUrl", "", webView2, false, false, new C37033Eg9(), (String) LIZ.getSecond());
                super.LJIIJ(str);
                return;
            }
            if (LJIILIIL(this.LJLJJI, str, "loadUrl")) {
                C35996EAu LIZIZ = C35995EAt.LIZIZ(this.LJLJJI.getUrl());
                if (LIZIZ == null || (str2 = LIZIZ.LIZ()) == null) {
                    str2 = "";
                }
                C37023Efz.LIZ(new C37024Eg0(10008, str2, ""));
                return;
            }
        }
        super.LJIIJ(str);
    }

    @Override // X.C39586FgE
    public final void LJ(ValueCallback valueCallback, String str) {
        String str2;
        WebView webView = this.LJLJJI;
        kotlin.jvm.internal.o.LJIIIIZZ(webView, "webView");
        OSZ LIZ = C25950AGk.LIZ(webView);
        if (((Boolean) LIZ.getFirst()).booleanValue()) {
            WebView webView2 = this.LJLJJI;
            kotlin.jvm.internal.o.LJIIIIZZ(webView2, "webView");
            LJIILJJIL("evaluate", "", webView2, false, false, new C37033Eg9(), (String) LIZ.getSecond());
            super.LJ(valueCallback, str);
            return;
        }
        if (LJIILIIL(this.LJLJJI, str, "evaluate")) {
            C35996EAu LIZIZ = C35995EAt.LIZIZ(this.LJLJJI.getUrl());
            if (LIZIZ == null || (str2 = LIZIZ.LIZ()) == null) {
                str2 = "";
            }
            C37023Efz.LIZ(new C37024Eg0(10008, str2, ""));
            return;
        }
        super.LJ(valueCallback, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ce, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0102, code lost:
    
        if (X.FFL.LJ(31744, "string_gc_opt_settings", true, false) == false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(android.webkit.WebView r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37034EgA.LJIILIIL(android.webkit.WebView, java.lang.String, java.lang.String):boolean");
    }

    public final void LJIILJJIL(String str, String str2, WebView webView, boolean z, boolean z2, C37033Eg9 c37033Eg9, String str3) {
        Object LIZ;
        EnumC37038EgE enumC37038EgE;
        try {
            Object tag = webView.getTag(R.id.ni4);
            if (tag instanceof EnumC37038EgE) {
                enumC37038EgE = (EnumC37038EgE) tag;
            } else {
                enumC37038EgE = null;
            }
            this.LJLJLJ.execute(new RunnableC37032Eg8(str, str3, z, C35995EAt.LIZIZ(webView.getUrl()), str2, z2, webView, C38387F4t.LIZ(this.LJLJJI), enumC37038EgE, c37033Eg9));
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("reportInjectJs: ");
            LIZ2.append(C39016FSy.LIZ(30, m10exceptionOrNullimpl));
            X1D.LIZIZ(LIZ2);
        }
    }
}
