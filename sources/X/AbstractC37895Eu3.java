package X;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* renamed from: X.Eu3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37895Eu3 implements InterfaceC37958Ev4 {
    @Override // X.InterfaceC37958Ev4
    public final WebView LIZ() {
        return null;
    }

    @Override // X.InterfaceC37901Eu9
    public final boolean LIZIZ(String str) {
        return false;
    }

    @Override // X.InterfaceC37901Eu9
    public final void LIZJ(String url) {
        o.LJIIJ(url, "url");
    }

    @Override // X.InterfaceC37901Eu9
    public final void LIZLLL(String url) {
        o.LJIIJ(url, "url");
    }

    @Override // X.InterfaceC37958Ev4
    public final void LJ(AbstractC37899Eu7 object, String name) {
        o.LJIIJ(object, "object");
        o.LJIIJ(name, "name");
    }

    @Override // X.InterfaceC37958Ev4
    public final void LJFF(InterfaceC37901Eu9 listener) {
        o.LJIIJ(listener, "listener");
    }

    @Override // X.InterfaceC37958Ev4
    public final void LJII(ValueCallback valueCallback, String url) {
        o.LJIIJ(url, "url");
    }

    @Override // X.InterfaceC37901Eu9
    public final void onDestroy() {
    }
}
