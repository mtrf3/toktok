package X;

import android.view.View;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nju, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60198Nju implements InterfaceC60214NkA<View> {
    public final /* synthetic */ AqS141S0200000_10 LIZ;
    public final /* synthetic */ C60213Nk9 LIZIZ;

    public C60198Nju(AqS141S0200000_10 aqS141S0200000_10, C60213Nk9 c60213Nk9) {
        this.LIZ = aqS141S0200000_10;
        this.LIZIZ = c60213Nk9;
    }

    @Override // X.InterfaceC60214NkA
    public final void LIZ(C60213Nk9<View> viewComponent, android.net.Uri uri) {
        o.LJIIJ(viewComponent, "viewComponent");
        o.LJIIJ(uri, "uri");
        AqS141S0200000_10 aqS141S0200000_10 = this.LIZ;
        C60193Njp c60193Njp = (C60193Njp) aqS141S0200000_10.l0;
        if (!c60193Njp.LJLJJL) {
            c60193Njp.LJLJJL = true;
            c60193Njp.LLLII(viewComponent.LIZIZ, uri, (InterfaceC40516FvE) aqS141S0200000_10.l1);
            AqS141S0200000_10 aqS141S0200000_102 = this.LIZ;
            InterfaceC60172NjU interfaceC60172NjU = ((C60193Njp) aqS141S0200000_102.l0).LJLILLLLZI;
            if (interfaceC60172NjU != null) {
                interfaceC60172NjU.LLLII(viewComponent.LIZIZ, uri, (InterfaceC40516FvE) aqS141S0200000_102.l1);
            }
        }
        C60213Nk9 c60213Nk9 = this.LIZIZ;
        c60213Nk9.getClass();
        c60213Nk9.LIZ.remove(this);
    }

    @Override // X.InterfaceC60214NkA
    public final void LIZIZ(C60213Nk9<View> viewComponent, android.net.Uri uri) {
        o.LJIIJ(viewComponent, "viewComponent");
        o.LJIIJ(uri, "uri");
        ((C60193Njp) this.LIZ.l0).LJLJJL = false;
    }

    @Override // X.InterfaceC60214NkA
    public final void LIZJ(C60213Nk9<View> viewComponent, android.net.Uri uri, Throwable th) {
        o.LJIIJ(viewComponent, "viewComponent");
        o.LJIIJ(uri, "uri");
        C60193Njp c60193Njp = (C60193Njp) this.LIZ.l0;
        if (!c60193Njp.LJLJJL) {
            c60193Njp.LJLJJL = true;
            c60193Njp.LLL(uri, th);
            InterfaceC60172NjU interfaceC60172NjU = ((C60193Njp) this.LIZ.l0).LJLILLLLZI;
            if (interfaceC60172NjU != null) {
                interfaceC60172NjU.LLL(uri, th);
            }
        }
        C60213Nk9 c60213Nk9 = this.LIZIZ;
        c60213Nk9.getClass();
        c60213Nk9.LIZ.remove(this);
    }
}
