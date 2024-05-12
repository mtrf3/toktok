package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Qc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83663Qc extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C83663Qc LJLIL = new C83663Qc();

    public C83663Qc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        AbstractC108324My abstractC108324My;
        List LJIIJ;
        boolean LJI;
        AbstractC108304Mw LIZ = C83263Oo.LIZ(C3QW.LIZ().defaultPullCount, EnumC97443s4.REGULAR);
        if ((LIZ instanceof AbstractC108324My) && (abstractC108324My = (AbstractC108324My) LIZ) != null && (LJIIJ = abstractC108324My.LJIIJ(null)) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : LJIIJ) {
                LJI = C82473Ln.LJI((C63120Opw) obj, new C43001GuD());
                if (LJI) {
                    arrayList.add(obj);
                }
            }
            i = arrayList.size();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
