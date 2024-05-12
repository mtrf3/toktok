package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LB0 extends AbstractC65781Prl implements InterfaceC88471Ynr<List<? extends Object>, List<? extends Object>, List<? extends Object>> {
    public static final LB0 LJLIL = new LB0();

    public LB0() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final List<? extends Object> invoke(List<? extends Object> list, List<? extends Object> list2) {
        List<? extends Object> list3 = list;
        List<? extends Object> loadMore = list2;
        o.LJIIIZ(list3, "list");
        o.LJIIIZ(loadMore, "loadMore");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list3) {
            if (obj instanceof LB1) {
                LB1 lb1 = (LB1) obj;
                if (hashSet.add(lb1.LJLILLLLZI.getUid())) {
                    arrayList.add(LB1.L(lb1, i));
                    i++;
                }
            }
            arrayList.add(obj);
        }
        for (Object obj2 : loadMore) {
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.following.model.RelationUser");
            LB1 lb12 = (LB1) obj2;
            if (hashSet.add(lb12.LJLILLLLZI.getUid())) {
                arrayList.add(LB1.L(lb12, i));
                i++;
            }
        }
        return arrayList;
    }
}
