package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fm1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39945Fm1 implements InterfaceC39937Flt {
    public final /* synthetic */ C39935Flr LIZ;
    public final /* synthetic */ C34K LIZIZ;

    public C39945Fm1(C39935Flr c39935Flr, C34K c34k) {
        this.LIZ = c39935Flr;
        this.LIZIZ = c34k;
    }

    @Override // X.InterfaceC39937Flt
    public final List create() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZ.LJ);
        if (this.LIZIZ.element) {
            arrayList.addAll(new C58377Mvd().create());
        }
        return arrayList;
    }
}
