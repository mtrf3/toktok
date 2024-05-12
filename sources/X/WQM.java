package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQM<T, R> implements InterfaceC48038ItG<WQO, C82237WPh> {
    public final /* synthetic */ boolean LJLIL;

    public WQM(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.InterfaceC48038ItG
    public final C82237WPh apply(WQO wqo) {
        WQO it = wqo;
        o.LJIIIZ(it, "it");
        if (this.LJLIL) {
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder sb = new StringBuilder("viki filter, DefaultFilterRepository#fetchDataWithReturn -> ret -> filterTable=");
            List<OSZ<EffectCategoryResponse, List<C79155V4t>>> list = it.LJLIL.LJLILLLLZI;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<OSZ<EffectCategoryResponse, List<C79155V4t>>> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getFirst().getName());
            }
            sb.append(arrayList);
            sb.append(", filter.size=");
            sb.append(it.LJLIL.LJLIL.size());
            LIZLLL.d(sb.toString());
        }
        return it.LJLIL;
    }
}
