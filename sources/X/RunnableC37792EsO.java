package X;

import Y.ARunnableS17S0300000_6;
import android.util.Base64;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.TTHYBRIDXHR;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.EsO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37792EsO implements Runnable {
    public final /* synthetic */ java.util.Map<String, String> LJLIL;
    public final /* synthetic */ TTHYBRIDXHR LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ C68322mC<String> LJLJLLL;

    public RunnableC37792EsO(java.util.Map<String, String> map, TTHYBRIDXHR tthybridxhr, C68322mC<String> c68322mC, String str, String str2, boolean z, boolean z2, String str3, C68322mC<String> c68322mC2) {
        this.LJLIL = map;
        this.LJLILLLLZI = tthybridxhr;
        this.LJLJI = c68322mC;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = z;
        this.LJLJL = z2;
        this.LJLJLJ = str3;
        this.LJLJLLL = c68322mC2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        String resString;
        Object LIZ;
        String str = "";
        try {
            if (this.LJLIL.get("User-Agent") == null && this.LJLIL.get("user-agent") == null) {
                java.util.Map<String, String> map = this.LJLIL;
                String userAgent = this.LJLILLLLZI.LIZIZ;
                o.LJIIIIZZ(userAgent, "userAgent");
                map.put("User-Agent", userAgent);
            }
            String url = this.LJLJI.element;
            o.LJIIIIZZ(url, "url");
            if (C37794EsQ.LIZLLL(url)) {
                C68322mC c68322mC = new C68322mC();
                c68322mC.element = "";
                CountDownLatch countDownLatch = new CountDownLatch(1);
                TTHYBRIDXHR tthybridxhr = this.LJLILLLLZI;
                tthybridxhr.LIZ.post(new ARunnableS17S0300000_6(c68322mC, tthybridxhr, countDownLatch, 2));
                countDownLatch.await();
                C68322mC<String> c68322mC2 = this.LJLJI;
                try {
                    android.net.Uri parse = UriProtector.parse((String) c68322mC.element);
                    o.LJIIIIZZ(parse, "parse(currentUrl)");
                    LIZ = new java.net.URI(C37794EsQ.LIZIZ(parse)).resolve(c68322mC2.element).toString();
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                T t = str;
                if (!C3C5.m12isFailureimpl(LIZ)) {
                    t = LIZ;
                }
                c68322mC2.element = t;
            }
            WebView webView = this.LJLILLLLZI.LIZ;
            String method = this.LJLJJI;
            o.LJIIIIZZ(method, "method");
            String upperCase = method.toUpperCase();
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase()");
            android.net.Uri parse2 = UriProtector.parse(this.LJLJI.element);
            o.LJIIIIZZ(parse2, "parse(url)");
            C35661Dz7 LJ = C37794EsQ.LJ(webView, false, upperCase, parse2, this.LJLIL, this.LJLJJL, this.LJLJJLL, EnumC37177EiT.AJAX_HOOK);
            InputStream inputStream = LJ.LJFF;
            if (inputStream == null) {
                return;
            }
            if (this.LJLJL) {
                resString = Base64.encodeToString(C62848OlY.LJFF(inputStream), 0);
            } else {
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    Iterator it = C77321UWf.LJIIJJI(bufferedReader).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                    }
                    resString = sb.toString();
                    AnonymousClass636.LJFF(bufferedReader, null);
                } finally {
                }
            }
            inputStream.close();
            TTHYBRIDXHR tthybridxhr2 = this.LJLILLLLZI;
            String id = this.LJLJLJ;
            o.LJIIIIZZ(id, "id");
            String url2 = this.LJLJI.element;
            o.LJIIIIZZ(url2, "url");
            o.LJIIIIZZ(resString, "resString");
            tthybridxhr2.LIZ(id, url2, LJ, resString, this.LJLJL);
        } catch (Exception e) {
            TTHYBRIDXHR.LJFF.post(new ARunnableS17S0300000_6(this.LJLILLLLZI, this.LJLJLLL, e, 3));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
