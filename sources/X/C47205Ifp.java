package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ifp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47205Ifp extends AbstractC47210Ifu {
    public final IZ1 LJ;
    public final C47211Ifv LJFF = new C47211Ifv(this);
    public final C47226IgA LJI = new C47226IgA();

    @Override // X.AbstractC47210Ifu
    public final boolean LJIIJJI() {
        this.LJ.getClass();
        return false;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final InterfaceC46540IOi LJII() {
        return this.LJFF;
    }

    @Override // X.AbstractC47210Ifu
    public final InterfaceC47234IgI LJIIJ() {
        return this.LJI;
    }

    public C47205Ifp(IZ1 iz1) {
        this.LJ = iz1;
    }

    public static List LJIIL(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SimVideoUrlModel model = C46767IXb.LIZ(C46810IYs.LIZIZ((InterfaceC46811IYt) it.next()), IXN.LIZJ.getPlayerType());
            o.LJIIIIZZ(model, "model");
            arrayList.add(model);
        }
        return arrayList;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LJI(String str, List<InterfaceC46811IYt> list) {
        String str2;
        List<SimVideoUrlModel> LJIIL = LJIIL(list);
        InterfaceC46732IVs LIZ = C13870gZ.LIZ();
        try {
            str2 = this.LIZLLL.peek();
        } catch (EmptyStackException unused) {
            str2 = null;
        }
        LIZ.addMedias(LJIIL, true, true, str2);
    }
}
