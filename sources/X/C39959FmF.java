package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FmF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39959FmF implements InterfaceC39937Flt {
    public final /* synthetic */ C39966FmM LIZ;
    public final /* synthetic */ C34K LIZIZ;

    public C39959FmF(C39966FmM c39966FmM, C34K c34k) {
        this.LIZ = c39966FmM;
        this.LIZIZ = c34k;
    }

    @Override // X.InterfaceC39937Flt
    public final List create() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZ.LIZ.LIZJ);
        if (this.LIZIZ.element) {
            arrayList.addAll(new C58377Mvd().create());
        }
        return arrayList;
    }
}
