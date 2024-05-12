package X;

import Y.ARunnableS12S0101000_8;
import Y.IDRunnableS6S0101000;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.bridge.channel.WebViewPort;
import com.bytedance.pia.core.setting.Settings;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: X.Eng, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37500Eng implements InterfaceC60656NrI {
    public final Object LIZLLL;
    public final C37496Enc LIZ = new C37496Enc();
    public WeakReference<View> LIZIZ = null;
    public boolean LJ = false;
    public C37499Enf LJFF = null;
    public InterfaceC37589Ep7 LJI = null;
    public final String LIZJ = "HybridKit";

    @Override // X.InterfaceC60656NrI
    public final void LIZJ() {
        this.LJ = false;
        C37499Enf c37499Enf = this.LJFF;
        if (c37499Enf != null) {
            if (c37499Enf.LJJIFFI.get()) {
                C37238EjS.LIZLLL(6, "[Runtime] call onLoadStarted after release.", null);
                return;
            }
            if (!c37499Enf.LJJ.compareAndSet(false, true)) {
                C37238EjS.LIZLLL(6, "[Runtime] onLoadStarted more than once!", null);
                return;
            }
            Iterator<AbstractC37502Eni> it = c37499Enf.LJIIZILJ.iterator();
            while (it.hasNext()) {
                AbstractC37502Eni next = it.next();
                try {
                    next.LJI();
                } catch (Throwable th) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("[Runtime] ");
                    LIZ.append(next.LIZ());
                    LIZ.append(" onLoadStarted error:");
                    C37238EjS.LIZLLL(4, X1D.LIZIZ(LIZ), th);
                }
            }
        }
    }

    @Override // X.InterfaceC60656NrI
    public final void LIZIZ() {
        C37499Enf c37499Enf = this.LJFF;
        if (c37499Enf != null) {
            if (c37499Enf.LJJIFFI.get()) {
                C37238EjS.LIZLLL(6, "[Runtime] call onLoadFinished after release.", null);
                return;
            }
            if (!c37499Enf.LJJI.compareAndSet(false, true)) {
                C37238EjS.LIZLLL(6, "[Runtime] onLoadFinished more than once!", null);
                return;
            }
            C37477EnJ c37477EnJ = c37499Enf.LJII;
            c37477EnJ.getClass();
            C37613EpV.LIZJ(new IDRunnableS6S0101000(2, c37477EnJ, 39));
            Iterator<AbstractC37502Eni> it = c37499Enf.LJIIZILJ.iterator();
            while (it.hasNext()) {
                AbstractC37502Eni next = it.next();
                try {
                    next.getClass();
                } catch (Throwable th) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("[Runtime] ");
                    LIZ.append(next.LIZ());
                    LIZ.append(" onLoadFinished error:");
                    C37238EjS.LIZLLL(4, X1D.LIZIZ(LIZ), th);
                }
            }
        }
    }

    public final void LJIIJ() {
        WebViewPort.JSInterface jSInterface;
        if (this.LJFF != null) {
            View view = this.LIZIZ.get();
            if ((view instanceof WebView) && (jSInterface = WebViewPort.JSInterface.LIZJ.get(view)) != null) {
                jSInterface.LIZ.set(null);
                jSInterface.LIZIZ = null;
            }
            this.LJFF.release();
            this.LJFF = null;
        }
    }

    @Override // X.InterfaceC60656NrI
    public final void onDestroy() {
        this.LIZ.release();
        LJIIJ();
        View view = this.LIZIZ.get();
        if (view instanceof WebView) {
            C37613EpV.LIZIZ(new ARunnableS12S0101000_8(1, view, 3));
        }
    }

    @Override // X.InterfaceC60656NrI
    public final void LJII() {
        LJIIJ();
    }

    public C37500Eng(C37531EoB c37531EoB) {
        this.LIZLLL = c37531EoB;
    }

    @Override // X.InterfaceC60656NrI
    public final InterfaceC37464En6 LIZLLL(InterfaceC37454Emw interfaceC37454Emw) {
        InterfaceC37464En6 interfaceC37464En6;
        C37238EjS.LJI(6, "[Runtime] start onBeforeLoadResource.", null);
        if (!C85693Xx.LIZIZ(interfaceC37454Emw.getUrl())) {
            return null;
        }
        if (!this.LJ && this.LJFF != null && interfaceC37454Emw.isForMainFrame() && interfaceC37454Emw.getUrl() != null) {
            C37504Enk c37504Enk = new C37504Enk();
            c37504Enk.LIZIZ = interfaceC37454Emw.getUrl().toString();
            if (c37504Enk.LIZIZ() != null) {
                LJIIJ();
                this.LJFF = LJIIIIZZ(interfaceC37454Emw.getUrl().toString());
            }
        }
        C37499Enf c37499Enf = this.LJFF;
        if (c37499Enf != null) {
            if (c37499Enf.LJJIFFI.get()) {
                C37238EjS.LIZLLL(6, "[Runtime] call onBeforeLoadResource after release.", null);
            } else {
                Iterator<AbstractC37502Eni> it = c37499Enf.LJIIZILJ.iterator();
                while (it.hasNext()) {
                    AbstractC37502Eni next = it.next();
                    try {
                        interfaceC37464En6 = next.LIZLLL(interfaceC37454Emw);
                    } catch (Throwable th) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("[Runtime] ");
                        LIZ.append(next.LIZ());
                        LIZ.append(" error:");
                        C37238EjS.LIZLLL(4, X1D.LIZIZ(LIZ), th);
                    }
                    if (interfaceC37464En6 != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("[Runtime] ");
                        LIZ2.append(next.LIZ());
                        LIZ2.append(" intercepted resource loading, url=");
                        LIZ2.append(interfaceC37454Emw.getUrl());
                        C37238EjS.LJFF(X1D.LIZIZ(LIZ2));
                        break;
                    }
                    continue;
                }
            }
        }
        interfaceC37464En6 = null;
        C37238EjS.LJI(6, "[Runtime] end onBeforeLoadResource.", null);
        return interfaceC37464En6;
    }

    @Override // X.InterfaceC60656NrI
    public final void LJ(InterfaceC37589Ep7 interfaceC37589Ep7) {
        this.LJI = interfaceC37589Ep7;
        C37499Enf c37499Enf = this.LJFF;
        if (c37499Enf != null) {
            c37499Enf.LJIIJJI("event-on-bind-bridge-handle", interfaceC37589Ep7);
        }
    }

    @Override // X.InterfaceC60656NrI
    public final void LJFF(String str) {
        android.net.Uri uri;
        if (str != null) {
            uri = UriProtector.parse(str);
        } else {
            uri = null;
        }
        if (!C85693Xx.LIZIZ(uri)) {
            return;
        }
        this.LJ = true;
        if (this.LJFF == null) {
            return;
        }
        LJIIJ();
        this.LJFF = LJIIIIZZ(str);
    }

    @Override // X.InterfaceC60656NrI
    public final boolean LJI(android.net.Uri uri) {
        C37499Enf c37499Enf = this.LJFF;
        if (c37499Enf == null) {
            return false;
        }
        c37499Enf.getClass();
        if (!C85693Xx.LIZIZ(uri)) {
            return false;
        }
        if (!uri.getBooleanQueryParameter("__pia_manifest__", false) && !uri.getBooleanQueryParameter("_pia_", false) && (!Settings.LIZ().isPiaQueryDisable || !TextUtils.equals(uri.getHost(), c37499Enf.LJ.getHost()) || !TextUtils.equals(uri.getPath(), c37499Enf.LJ.getPath()))) {
            return false;
        }
        return true;
    }

    public final C37499Enf LJIIIIZZ(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C37505Enl c37505Enl = C37488EnU.LIZ;
        String str2 = this.LIZJ;
        Object obj = this.LIZLLL;
        c37505Enl.getClass();
        C37499Enf LIZ = C37505Enl.LIZ(str, str2, obj, null, true);
        if (LIZ != null) {
            C37496Enc c37496Enc = this.LIZ;
            LIZ.LJJII = c37496Enc;
            c37496Enc.LIZ(LIZ, "ctx-pia-runtime");
            if (!LIZ.LJIJJLI.get()) {
                C37420EmO.LIZIZ.LIZ(LIZ);
                LIZ.LJII();
            }
            View view = this.LIZIZ.get();
            if (view != null) {
                LIZ.LJIIJ(view);
            }
            InterfaceC37589Ep7 interfaceC37589Ep7 = this.LJI;
            if (interfaceC37589Ep7 != null) {
                LIZ.LJIIJJI("event-on-bind-bridge-handle", interfaceC37589Ep7);
            }
        }
        return LIZ;
    }

    public final void LJIIIZ(WebKitView webKitView) {
        this.LIZIZ = new WeakReference<>(webKitView);
        String userAgentString = webKitView.getSettings().getUserAgentString();
        if (!userAgentString.contains("PIA/2.3.0")) {
            WebSettings settings = webKitView.getSettings();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(userAgentString);
            LIZ.append(" ");
            LIZ.append("PIA/2.3.0");
            C16880lQ.LLZL(settings, X1D.LIZIZ(LIZ));
        }
        C37499Enf c37499Enf = this.LJFF;
        if (c37499Enf != null) {
            c37499Enf.LJIIJ(webKitView);
        }
    }

    @Override // X.InterfaceC60656NrI
    public final void loadUrl(String str) {
        android.net.Uri uri = null;
        C37238EjS.LJI(6, "[Runtime] start loadUrl", null);
        if (str != null) {
            uri = UriProtector.parse(str);
        }
        if (!C85693Xx.LIZIZ(uri)) {
            return;
        }
        this.LJ = true;
        LJIIJ();
        this.LJFF = LJIIIIZZ(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.En6] */
    @Override // X.InterfaceC60656NrI
    public final InterfaceC37464En6 LIZ(C37382Elm c37382Elm, C37647Eq3 c37647Eq3) {
        ?? r3;
        C37499Enf c37499Enf = this.LJFF;
        if (c37499Enf == null) {
            return null;
        }
        if (c37499Enf.LJJIFFI.get()) {
            C37238EjS.LIZLLL(6, "[Runtime] call onAfterLoadResource after release.", null);
        } else {
            Iterator<AbstractC37502Eni> it = c37499Enf.LJIIZILJ.iterator();
            while (it.hasNext()) {
                AbstractC37502Eni next = it.next();
                try {
                    r3 = next.LIZJ(c37382Elm, c37647Eq3);
                    if (r3 != c37647Eq3) {
                        try {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("[Runtime] ");
                            LIZ.append(next.LIZ());
                            LIZ.append(" edited resource response, url=");
                            LIZ.append(c37382Elm.getUrl());
                            C37238EjS.LJFF(X1D.LIZIZ(LIZ));
                        } catch (Throwable th) {
                            th = th;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("[Runtime] ");
                            LIZ2.append(next.LIZ());
                            LIZ2.append(" error:");
                            C37238EjS.LIZLLL(4, X1D.LIZIZ(LIZ2), th);
                            c37647Eq3 = r3;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r3 = c37647Eq3;
                }
                c37647Eq3 = r3;
            }
        }
        return c37647Eq3;
    }
}
