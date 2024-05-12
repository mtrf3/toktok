package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9rY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250009rY implements InterfaceC251599u7 {
    public final /* synthetic */ C249999rX LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ int LIZLLL;

    @Override // X.InterfaceC251599u7
    public final void onSuccess() {
        this.LIZ.LJ(1, this.LIZIZ);
        Iterator it = ((List) this.LIZ.LIZJ.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC250199rr) it.next()).LJIJI();
        }
        C247749nu.LIZ(1, this.LIZJ, this.LIZLLL, "");
    }

    @Override // X.InterfaceC251599u7
    public final void LIZ(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LIZ.LJ(2, this.LIZIZ);
        Iterator it = ((List) this.LIZ.LIZJ.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC250199rr) it.next()).LJIJ();
        }
        C247749nu.LIZ(0, this.LIZJ, this.LIZLLL, e.toString());
    }

    public C250009rY(C249999rX c249999rX, String str, int i, int i2, int i3) {
        this.LIZ = c249999rX;
        this.LIZIZ = str;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
