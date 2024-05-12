package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.GLs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC41376GLs<V> implements Callable {
    public static final CallableC41376GLs<V> LJLIL = new CallableC41376GLs<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<String> LIZJ = C60903NvH.LJIIJJI().getPublishService().LJIILIIL().LIZJ();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = LIZJ.iterator();
        while (it.hasNext()) {
            AwemeDraft LJ = C1DG.LJFF().LJ(new C41363GLf(new CreativeInfo(it.next(), 0, null, 6, null), true));
            if (LJ != null && (!C41802Gas.LJII(LJ) || C41802Gas.LJI(LJ))) {
                arrayList.add(LJ);
            }
        }
        return ORZ.LLJI(arrayList);
    }
}
