package X;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ss.android.sdk.webview.BaseJsMessageHandler;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.EyA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38150EyA {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final WebView LIZ;
    public WebViewClient LIZIZ;
    public WebChromeClient LIZJ;
    public BaseJsMessageHandler LIZLLL;
    public C38049EwX LJ;
    public boolean LJFF;
    public C38118Exe LJI;
    public C38113ExZ LJII;
    public boolean LJIIIIZZ;
    public final C38113ExZ LJIIIZ;
    public F0E LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;

    public C38150EyA(WebView webView) {
        o.LJIIIZ(webView, "webView");
        this.LIZ = webView;
        this.LJFF = true;
        this.LJIIJJI = C221108m2.LIZIZ(C38153EyD.LJLIL);
        this.LJIIL = C221108m2.LIZIZ(C38013Evx.LJLIL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C38150EyA(X.C38113ExZ r2) {
        /*
            r1 = this;
            android.webkit.WebView r0 = r2.LIZIZ
            kotlin.jvm.internal.o.LJI(r0)
            r1.<init>(r0)
            r1.LJIIIZ = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38150EyA.<init>(X.ExZ):void");
    }

    public final void LIZ(String str, InterfaceC38012Evw interfaceC38012Evw) {
        C38118Exe c38118Exe = this.LJI;
        if (c38118Exe != null) {
            c38118Exe.LIZIZ(str, interfaceC38012Evw);
            return;
        }
        C38049EwX c38049EwX = this.LJ;
        if (c38049EwX == null) {
            return;
        }
        c38049EwX.LJI(str, interfaceC38012Evw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(C38150EyA c38150EyA, List namespaces, InterfaceC88471Ynr invokeHandler, InterfaceC88473Ynt rejectHandler, int i) {
        boolean z;
        C38049EwX c38049EwX;
        C38049EwX c38049EwX2;
        WebView webView;
        C38116Exc c38116Exc;
        if ((i & 1) != 0) {
            namespaces = C47261Igj.LJJIJ("host");
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            invokeHandler = C38154EyE.LJLIL;
        }
        if ((i & 8) != 0) {
            rejectHandler = C38152EyC.LJLIL;
        }
        o.LJIIIZ(namespaces, "namespaces");
        o.LJIIIZ(invokeHandler, "invokeHandler");
        o.LJIIIZ(rejectHandler, "rejectHandler");
        BaseJsMessageHandler baseJsMessageHandler = c38150EyA.LIZLLL;
        o.LJI(baseJsMessageHandler);
        List<String> addPublicFunc = baseJsMessageHandler.addPublicFunc();
        o.LJIIIIZZ(addPublicFunc, "jsMessageHandler!!.addPublicFunc()");
        if (c38150EyA.LJFF) {
            C38113ExZ c38113ExZ = c38150EyA.LJIIIZ;
            if (c38113ExZ == null) {
                c38116Exc = new C38116Exc(c38150EyA.LIZ);
            } else {
                c38116Exc = new C38116Exc(c38113ExZ.LIZJ);
                c38116Exc.LJIILJJIL = true;
                c38116Exc.LJIIIIZZ = false;
            }
            c38116Exc.LJIIIIZZ = true;
            c38116Exc.LIZLLL = "ToutiaoJSBridge";
            c38116Exc.LJIILIIL.addAll(addPublicFunc);
            C38126Exm c38126Exm = new C38126Exm(new C38151EyB(c38150EyA));
            c38116Exc.LJ = c38126Exm;
            c38126Exm.LIZIZ = c38116Exc.LJIJ;
            BaseJsMessageHandler baseJsMessageHandler2 = c38150EyA.LIZLLL;
            o.LJI(baseJsMessageHandler2);
            c38116Exc.LJIIL.addAll(baseJsMessageHandler2.getSafeHost(namespaces, z));
            c38116Exc.LJI = false;
            c38116Exc.LJII = true;
            c38116Exc.LJIIIZ.add(new C38165EyP(invokeHandler, addPublicFunc, c38150EyA, rejectHandler));
            c38116Exc.LJIIIZ.add(new C38229EzR(c38150EyA));
            c38116Exc.LJIIJ = new C38155EyF(c38150EyA);
            BaseJsMessageHandler baseJsMessageHandler3 = c38150EyA.LIZLLL;
            o.LJI(baseJsMessageHandler3);
            if (baseJsMessageHandler3.shouldDisablePermissionCheck()) {
                c38116Exc.LJIILL = true;
            }
            C38113ExZ LIZ = c38116Exc.LIZ();
            c38150EyA.LJII = LIZ;
            C38118Exe c38118Exe = new C38118Exe(c38150EyA.LIZ, LIZ);
            c38150EyA.LJI = c38118Exe;
            c38150EyA.LJ = c38118Exe.LIZIZ;
            InterfaceC38157EyH interfaceC38157EyH = C37905EuD.LJFF;
            if (interfaceC38157EyH != null) {
                interfaceC38157EyH.LJIILLIIL();
            }
            if (C37905EuD.LJI && !namespaces.contains("webcast")) {
                ((C37905EuD) c38150EyA.LJIIL.getValue()).LIZ(new C37892Eu0(c38116Exc));
                ((C37905EuD) c38150EyA.LJIIL.getValue()).LIZIZ(c38150EyA.LIZ, UUID.randomUUID().toString(), false);
                ((C37905EuD) c38150EyA.LJIIL.getValue()).LIZLLL("dmtJSB", new C38169EyT(c38150EyA));
            }
        } else {
            c38150EyA.LJ = new C38049EwX(c38150EyA.LIZ);
        }
        C38049EwX c38049EwX3 = c38150EyA.LJ;
        o.LJI(c38049EwX3);
        BaseJsMessageHandler baseJsMessageHandler4 = c38150EyA.LIZLLL;
        o.LJI(baseJsMessageHandler4);
        c38049EwX3.LIZIZ = baseJsMessageHandler4.getBridgeScheme();
        BaseJsMessageHandler baseJsMessageHandler5 = c38150EyA.LIZLLL;
        o.LJI(baseJsMessageHandler5);
        c38049EwX3.LJI = baseJsMessageHandler5;
        BaseJsMessageHandler baseJsMessageHandler6 = c38150EyA.LIZLLL;
        o.LJI(baseJsMessageHandler6);
        c38049EwX3.LIZJ = baseJsMessageHandler6.getSafeHost(namespaces, false);
        c38049EwX3.LIZLLL = addPublicFunc;
        WebChromeClient webChromeClient = c38150EyA.LIZJ;
        if (webChromeClient != null && (c38049EwX2 = c38150EyA.LJ) != null && (webView = c38049EwX2.LIZ) != null) {
            webView.setWebChromeClient(webChromeClient);
        }
        WebViewClient webViewClient = c38150EyA.LIZIZ;
        if (webViewClient != null && (c38049EwX = c38150EyA.LJ) != null) {
            c38049EwX.LJIIJ(webViewClient);
        }
    }
}
