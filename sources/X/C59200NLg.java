package X;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NLg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59200NLg extends NM6 {
    public final C59201NLh LJLIL;

    public C59200NLg(C59201NLh c59201NLh) {
        this.LJLIL = c59201NLh;
    }

    @Override // X.NM6, X.InterfaceC60172NjU
    public final void LLLLL(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadStart, uri: ");
        LIZ.append(uri);
        FDL.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.NM6, X.InterfaceC60172NjU
    public final void LLL(android.net.Uri uri, Throwable e) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(e, "e");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadFail error:");
        LIZ.append(e);
        LIZ.append(", uri: ");
        LIZ.append(uri);
        FDL.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.NM6, X.InterfaceC60172NjU
    public final void LLLII(View view, android.net.Uri uri, InterfaceC40516FvE instance) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        this.LJLIL.LJI = instance;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadUriSuccess, uri: ");
        LIZ.append(uri);
        FDL.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.NM6, X.InterfaceC60172NjU
    public final void gk(InterfaceC40516FvE instance, android.net.Uri uri, AbstractC59475NVv param) {
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(param, "param");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadParamsSuccess, uri: ");
        LIZ.append(uri);
        FDL.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.NM6, X.InterfaceC60172NjU
    public final void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, android.net.Uri uri, InterfaceC40516FvE instance, boolean z) {
        o.LJIIIZ(viewComponents, "viewComponents");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadKitInstanceSuccess, uri: ");
        LIZ.append(uri);
        FDL.LIZ(X1D.LIZIZ(LIZ));
    }
}
