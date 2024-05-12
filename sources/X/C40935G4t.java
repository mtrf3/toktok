package X;

import com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.G4t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40935G4t extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C40935G4t LJLIL = new C40935G4t();

    public C40935G4t() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = AbsSearchService.LIZJ.iterator();
        while (it.hasNext()) {
            Object obj = ((java.util.Map) FMP.LIZIZ.getValue()).get(it.next());
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return ORZ.LLJI(arrayList);
    }
}
