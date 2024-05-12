package X;

import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: X.NtA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60772NtA extends OM2 {
    public final /* synthetic */ C60769Nt7 LJLIL;

    @Override // X.OM2
    public final void LJIJJ() {
        InterfaceC60770Nt8 interfaceC60770Nt8 = this.LJLIL.LJLJL;
        if (interfaceC60770Nt8 != null) {
            interfaceC60770Nt8.goBack();
        }
        super.LJIJJ();
    }

    @Override // X.OM2
    public final void LJIL() {
        InterfaceC60770Nt8 interfaceC60770Nt8 = this.LJLIL.LJLJL;
        if (interfaceC60770Nt8 != null) {
            interfaceC60770Nt8.goForward();
        }
        super.LJIL();
    }

    @Override // X.OM2
    public final boolean LIZIZ() {
        boolean LIZIZ = super.LIZIZ();
        InterfaceC60770Nt8 interfaceC60770Nt8 = this.LJLIL.LJLJL;
        if (interfaceC60770Nt8 != null) {
            interfaceC60770Nt8.canGoBack();
        }
        return LIZIZ;
    }

    @Override // X.OM2
    public final boolean LIZLLL() {
        boolean LIZLLL = super.LIZLLL();
        InterfaceC60770Nt8 interfaceC60770Nt8 = this.LJLIL.LJLJL;
        if (interfaceC60770Nt8 != null) {
            interfaceC60770Nt8.canGoForward();
        }
        return LIZLLL;
    }

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr<?> getExtension() {
        return this.LJLIL;
    }

    public C60772NtA(C60769Nt7 c60769Nt7) {
        this.LJLIL = c60769Nt7;
    }

    @Override // X.OM2
    public final void LJJIFFI(String str) {
        InterfaceC60770Nt8 interfaceC60770Nt8 = this.LJLIL.LJLJL;
        if (interfaceC60770Nt8 != null) {
            interfaceC60770Nt8.loadUrl(str);
        }
        super.LJJIFFI(str);
    }

    @Override // X.OM2
    public final boolean LJJJJL(MotionEvent motionEvent) {
        OM1 om1;
        InterfaceC60770Nt8 interfaceC60770Nt8 = this.LJLIL.LJLJL;
        if (interfaceC60770Nt8 != null) {
            OM1 extendable = getExtendable();
            if (extendable instanceof WebView) {
                om1 = extendable;
            } else {
                om1 = null;
            }
            interfaceC60770Nt8.LJIIJ(om1, motionEvent);
        }
        return super.LJJJJL(motionEvent);
    }

    @Override // X.OM2
    public final void LJJII(String str, java.util.Map<String, String> map) {
        InterfaceC60770Nt8 interfaceC60770Nt8 = this.LJLIL.LJLJL;
        java.util.Map<String, String> map2 = null;
        OM1 om1 = null;
        if (interfaceC60770Nt8 != null) {
            OM1 extendable = getExtendable();
            if (extendable instanceof WebView) {
                om1 = extendable;
            }
            interfaceC60770Nt8.LJFF(om1, str, map);
            map2 = map;
        }
        super.LJJII(str, map2);
    }

    @Override // X.OM2
    public final void LJJJIL(int i, int i2, boolean z, boolean z2) {
        OM1 om1;
        InterfaceC60770Nt8 interfaceC60770Nt8 = this.LJLIL.LJLJL;
        if (interfaceC60770Nt8 != null) {
            OM1 extendable = getExtendable();
            if (extendable instanceof WebView) {
                om1 = extendable;
            } else {
                om1 = null;
            }
            interfaceC60770Nt8.LJIILL(om1, z, z2);
        }
        super.LJJJIL(i, i2, z, z2);
    }

    @Override // X.OM2
    public final void LJJJJIZL(int i, int i2, int i3, int i4) {
        super.LJJJJIZL(i, i2, i3, i4);
        InterfaceC60770Nt8 interfaceC60770Nt8 = this.LJLIL.LJLJL;
        if (interfaceC60770Nt8 != null) {
            interfaceC60770Nt8.onScrollChanged(i, i2, i3, i4);
        }
    }
}
