package X;

import android.util.SparseIntArray;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kvd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53281Kvd extends AbstractC65781Prl implements InterfaceC65784Pro<SparseIntArray> {
    public static final C53281Kvd LJLIL = new C53281Kvd();

    public C53281Kvd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SparseIntArray invoke() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        List LJJIJIL = C47261Igj.LJJIJIL(1, 2, 4);
        Iterator<Integer> it = ImagePreloadExperiment.INSTANCE.getConfig().priority.iterator();
        int i = 10;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            LJJIJIL.remove(Integer.valueOf(intValue));
            sparseIntArray.put(intValue, i);
            i += 1000;
        }
        Iterator it2 = LJJIJIL.iterator();
        while (it2.hasNext()) {
            sparseIntArray.put(((Number) it2.next()).intValue(), i);
        }
        return sparseIntArray;
    }
}
