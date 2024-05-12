package X;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mg8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57416Mg8 implements InterfaceC60172NjU {
    public final /* synthetic */ C223338pd LJLIL;

    @Override // X.InterfaceC60172NjU
    public final void LLIIL(List<? extends C60213Nk9<? extends View>> viewComponents, android.net.Uri uri, InterfaceC40516FvE instance, boolean z) {
        o.LJIIIZ(viewComponents, "viewComponents");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
    }

    @Override // X.InterfaceC60172NjU
    public final void LLL(android.net.Uri uri, Throwable e) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLLL(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
    }

    @Override // X.InterfaceC60172NjU
    public final void gk(InterfaceC40516FvE instance, android.net.Uri uri, AbstractC59475NVv param) {
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(param, "param");
    }

    public C57416Mg8(C223338pd c223338pd) {
        this.LJLIL = c223338pd;
    }

    @Override // X.InterfaceC60172NjU
    public final void LLLII(View view, android.net.Uri uri, InterfaceC40516FvE instance) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        this.LJLIL.LIZJ();
        this.LJLIL.setVisibility(8);
    }
}
