package X;

import android.view.View;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Njv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60199Njv implements InterfaceC60214NkA<View> {
    public final /* synthetic */ AqS176S0100000_10 LIZ;
    public final /* synthetic */ C60213Nk9 LIZIZ;

    @Override // X.InterfaceC60214NkA
    public final void LIZIZ(C60213Nk9<View> viewComponent, android.net.Uri uri) {
        o.LJIIJ(viewComponent, "viewComponent");
        o.LJIIJ(uri, "uri");
    }

    public C60199Njv(AqS176S0100000_10 aqS176S0100000_10, C60213Nk9 c60213Nk9) {
        this.LIZ = aqS176S0100000_10;
        this.LIZIZ = c60213Nk9;
    }

    @Override // X.InterfaceC60214NkA
    public final void LIZ(C60213Nk9<View> viewComponent, android.net.Uri uri) {
        o.LJIIJ(viewComponent, "viewComponent");
        o.LJIIJ(uri, "uri");
        C60193Njp c60193Njp = (C60193Njp) this.LIZ.l0;
        InterfaceC60172NjU interfaceC60172NjU = c60193Njp.LJLILLLLZI;
        if (interfaceC60172NjU != null) {
            View view = viewComponent.LIZIZ;
            InterfaceC40516FvE interfaceC40516FvE = c60193Njp.LJLJI;
            if (interfaceC40516FvE != null) {
                interfaceC60172NjU.LLLII(view, uri, interfaceC40516FvE);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        C60213Nk9 c60213Nk9 = this.LIZIZ;
        c60213Nk9.getClass();
        c60213Nk9.LIZ.remove(this);
    }

    @Override // X.InterfaceC60214NkA
    public final void LIZJ(C60213Nk9<View> viewComponent, android.net.Uri uri, Throwable th) {
        o.LJIIJ(viewComponent, "viewComponent");
        o.LJIIJ(uri, "uri");
        InterfaceC60172NjU interfaceC60172NjU = ((C60193Njp) this.LIZ.l0).LJLILLLLZI;
        if (interfaceC60172NjU != null) {
            interfaceC60172NjU.LLL(uri, th);
        }
        C60213Nk9 c60213Nk9 = this.LIZIZ;
        c60213Nk9.getClass();
        c60213Nk9.LIZ.remove(this);
    }
}
