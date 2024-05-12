package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3R3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3R3 extends AbstractC82553Lv {
    public final int LJLLI;
    public final C83943Re<IMContact> LJLLILLLL;
    public C3RZ<IMContact> LJLLJ;

    @Override // X.AbstractC82553Lv
    public final C3RZ LJ() {
        C3RZ c3rz = this.LJLLJ;
        if (c3rz == null) {
            C3RF c3rf = new C3RF();
            C83943Re provider = this.LJLLILLLL;
            o.LJIIIZ(provider, "provider");
            c3rf.LIZ.LIZIZ = provider;
            c3rf.LIZ.LIZLLL = new C3R4(this);
            c3rf.LIZ(this);
            c3rz = c3rf.LIZ;
            this.LJLLJ = c3rz;
            if (c3rz == null) {
                o.LJIJI("combinedLoader");
                throw null;
            }
        }
        return c3rz;
    }

    public C3R3(C3R9 c3r9) {
        super(c3r9);
        this.LJLLI = 100;
        C83943Re<IMContact> c83943Re = new C83943Re<>();
        c83943Re.LIZ(this.LJLJL);
        c83943Re.LIZ(this.LJLJLJ);
        this.LJLLILLLL = c83943Re;
    }

    @Override // X.AbstractC82553Lv, X.InterfaceC82613Mb
    public final void Y8(Throwable th) {
        C34B.LIZLLL("ActiveRelationModel", "onLoadError", th);
        InterfaceC82613Mb<IMContact> interfaceC82613Mb = this.LJLJI;
        if (interfaceC82613Mb != null) {
            interfaceC82613Mb.Y8(th);
        }
    }

    @Override // X.AbstractC82553Lv, X.InterfaceC82613Mb
    public final void zr0(List<IMContact> list, boolean z) {
        o.LJIIIZ(list, "list");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadSuccess list size before limit: ");
        LIZ.append(list.size());
        LIZ.append(" hasMore: ");
        LIZ.append(z);
        C34B.LJI("ActiveRelationModel", X1D.LIZIZ(LIZ));
        int size = list.size();
        int i = this.LJLLI;
        if (size > i) {
            list = list.subList(0, i);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onLoadSuccess limit list size: ");
        LIZ2.append(list.size());
        LIZ2.append(" hasMore: ");
        LIZ2.append(z);
        C34B.LJI("ActiveRelationModel", X1D.LIZIZ(LIZ2));
        super.zr0(list, false);
    }
}
