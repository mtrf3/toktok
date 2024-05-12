package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LHg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54000LHg extends AbstractC65781Prl implements InterfaceC65784Pro<ArrayList<Integer>> {
    public static final C54000LHg LJLIL = new C54000LHg();

    public C54000LHg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ArrayList<Integer> invoke() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> social2TabFeedTypeList = LHM.LIZIZ.LIZ().getSocial2TabFeedTypeList();
        if (social2TabFeedTypeList != null) {
            arrayList.addAll(social2TabFeedTypeList);
        }
        return arrayList;
    }
}
