package X;

import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Kva, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53278Kva extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends Integer>> {
    public static final C53278Kva LJLIL = new C53278Kva();

    public C53278Kva() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends Integer> invoke() {
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(1, 2, 4);
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJJIJIIJI) {
            if ((((Number) obj).intValue() & ImagePreloadExperiment.INSTANCE.getConfig().option) != 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
