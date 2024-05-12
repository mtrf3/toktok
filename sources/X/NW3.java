package X;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class NW3 implements InterfaceC60179Njb {
    public C59827Ndv LIZ() {
        return null;
    }

    public C59458NVe LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC60179Njb, X.InterfaceC60172NjU
    public void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, android.net.Uri uri, InterfaceC40516FvE instance, boolean z) {
        o.LJIIIZ(viewComponents, "viewComponents");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
    }

    @Override // X.InterfaceC60179Njb, X.InterfaceC60172NjU
    public void LLL(android.net.Uri uri, Throwable e) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC60179Njb, X.InterfaceC60172NjU
    public void LLLII(View view, android.net.Uri uri, InterfaceC40516FvE instance) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
    }

    @Override // X.InterfaceC60179Njb, X.InterfaceC60172NjU
    public void LLLLL(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
    }

    @Override // X.InterfaceC60179Njb
    public void Rd(NP1 np1) {
    }

    @Override // X.InterfaceC60179Njb
    public InterfaceC60180Njc Ug() {
        return new C59551NYt();
    }

    @Override // X.InterfaceC60179Njb
    public void M3(Context context) {
        o.LJIIJ(context, "context");
    }
}
