package X;

import Y.ARunnableS15S0101000_11;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Exc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38116Exc {
    public final WebView LIZ;
    public final AbstractC38143Ey3 LIZIZ;
    public AbstractC38114Exa LIZJ;
    public String LIZLLL;
    public C38126Exm LJ;
    public Context LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final java.util.Set<InterfaceC38140Ey0> LJIIIZ;
    public InterfaceC38147Ey7 LJIIJ;
    public String LJIIJJI;
    public final java.util.Set<String> LJIIL;
    public final java.util.Set<String> LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public final List<TimeLineEvent> LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;

    public final C38113ExZ LIZ() {
        if ((this.LIZ != null || this.LJIILJJIL || this.LIZJ != null) && ((!TextUtils.isEmpty(this.LIZLLL) || this.LIZ == null) && this.LJ != null)) {
            boolean z = this.LJI;
            boolean z2 = this.LJIIZILJ;
            WebView webView = this.LIZ;
            if (z && z2 && webView != null && !(webView instanceof InterfaceC38148Ey8)) {
                webView.post(new ARunnableS15S0101000_11(4, webView, 9));
            }
            C38185Eyj c38185Eyj = new C38185Eyj();
            c38185Eyj.LIZJ(this.LIZLLL, "jsObjectName");
            c38185Eyj.LIZJ(Boolean.valueOf(this.LJI), "debug");
            c38185Eyj.LIZJ(Boolean.valueOf(this.LJII), "shouldFlattenData");
            c38185Eyj.LIZJ(Boolean.valueOf(this.LJIIIIZZ), "enablePermissionCheck");
            c38185Eyj.LIZJ(this.LJIIJJI, "namespace");
            c38185Eyj.LIZJ(this.LJIIL, "safeHostSet");
            c38185Eyj.LIZJ(this.LJIILIIL, "publicMethodSet");
            c38185Eyj.LIZJ(Boolean.valueOf(this.LJIILJJIL), "dummy");
            c38185Eyj.LIZJ(false, "jsbPermissionValidator");
            c38185Eyj.LIZJ(Boolean.valueOf(this.LJIILL), "disableAllPermissionCheck");
            c38185Eyj.LIZJ(Boolean.valueOf(this.LJIIZILJ), "isShowDebugToast");
            WebView webView2 = this.LIZ;
            if (webView2 != null) {
                c38185Eyj.LIZJ(C16880lQ.LJLLJ(webView2.getClass()), "webView");
            }
            c38185Eyj.LIZ("label_create_jsb_environment", this.LJIILLIIL);
            return new C38113ExZ(this);
        }
        throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
    }

    public C38116Exc(C38116Exc c38116Exc) {
        this.LIZLLL = "IESJSBridge";
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LJIIIZ = linkedHashSet;
        this.LJIIJJI = "host";
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        this.LJIIL = linkedHashSet2;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        this.LJIILIIL = linkedHashSet3;
        this.LJIILLIIL = new CopyOnWriteArrayList();
        this.LJIIZILJ = true;
        this.LIZ = c38116Exc.LIZ;
        this.LIZIZ = c38116Exc.LIZIZ;
        this.LIZLLL = c38116Exc.LIZLLL;
        this.LJ = c38116Exc.LJ;
        this.LJFF = c38116Exc.LJFF;
        this.LJI = c38116Exc.LJI;
        this.LJII = c38116Exc.LJII;
        this.LJIIIIZZ = c38116Exc.LJIIIIZZ;
        linkedHashSet.addAll(c38116Exc.LJIIIZ);
        this.LJIIJJI = c38116Exc.LJIIJJI;
        linkedHashSet2.addAll(c38116Exc.LJIIL);
        linkedHashSet3.addAll(c38116Exc.LJIILIIL);
        this.LJIILJJIL = c38116Exc.LJIILJJIL;
        this.LIZJ = c38116Exc.LIZJ;
        this.LJIIJ = c38116Exc.LJIIJ;
        this.LJIILL = c38116Exc.LJIILL;
        this.LJIIZILJ = c38116Exc.LJIIZILJ;
        this.LJIJ = c38116Exc.LJIJ;
    }

    public C38116Exc(WebView webView) {
        this.LIZLLL = "IESJSBridge";
        this.LJIIIZ = new LinkedHashSet();
        this.LJIIJJI = "host";
        this.LJIIL = new LinkedHashSet();
        this.LJIILIIL = new LinkedHashSet();
        this.LJIILLIIL = new CopyOnWriteArrayList();
        this.LJIIZILJ = true;
        this.LIZ = webView;
        this.LIZIZ = new C38142Ey2(webView);
    }

    public C38116Exc(C38141Ey1 c38141Ey1) {
        this.LIZLLL = "IESJSBridge";
        this.LJIIIZ = new LinkedHashSet();
        this.LJIIJJI = "host";
        this.LJIIL = new LinkedHashSet();
        this.LJIILIIL = new LinkedHashSet();
        this.LJIILLIIL = new CopyOnWriteArrayList();
        this.LJIIZILJ = true;
        this.LIZIZ = c38141Ey1;
    }
}
