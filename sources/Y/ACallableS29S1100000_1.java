package Y;

import X.C2ZZ;
import X.C3Q9;
import X.C76800UCe;
import X.ORZ;
import X.OSZ;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyGroupStruct;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyRspStruct;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public class ACallableS29S1100000_1 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS29S1100000_1 aCallableS29S1100000_1) {
        return new OSZ((AVMusic) aCallableS29S1100000_1.l1, aCallableS29S1100000_1.s0);
    }

    public static final Object call$1(ACallableS29S1100000_1 aCallableS29S1100000_1) {
        return ((C3Q9) aCallableS29S1100000_1.l1).LIZ(aCallableS29S1100000_1.s0);
    }

    public static final Object call$2(ACallableS29S1100000_1 aCallableS29S1100000_1) {
        return ((C3Q9) aCallableS29S1100000_1.l1).LJII(aCallableS29S1100000_1.s0);
    }

    public static final Object call$3(ACallableS29S1100000_1 aCallableS29S1100000_1) {
        if (((CopyOnWriteArraySet) C2ZZ.LJIIIIZZ.getValue()).contains(aCallableS29S1100000_1.s0)) {
            C2ZZ.LIZJ().clear();
            C2ZZ.LIZJ().addAll(((FeedItemList) aCallableS29S1100000_1.l1).getItems());
            C2ZZ.LIZLLL().clear();
        } else {
            ConsistencyRspStruct consistencyRspStruct = (ConsistencyRspStruct) C2ZZ.LJFF().get(aCallableS29S1100000_1.s0);
            if (consistencyRspStruct != null) {
                FeedItemList feedItemList = (FeedItemList) aCallableS29S1100000_1.l1;
                String str = aCallableS29S1100000_1.s0;
                if (!C2ZZ.LIZJ().isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = C2ZZ.LIZJ().iterator();
                    while (it.hasNext()) {
                        Aweme aweme = (Aweme) it.next();
                        long LJI = C2ZZ.LJI(aweme.getAid());
                        ConsistencyGroupStruct LIZIZ = C2ZZ.LIZIZ(LJI, aweme.getAid(), "cached_video");
                        HashMap<Long, ConsistencyGroupStruct> consistencyGroups = consistencyRspStruct.getConsistencyGroups();
                        if (consistencyGroups != null) {
                            consistencyGroups.put(Long.valueOf(LJI), LIZIZ);
                        }
                        arrayList.add(Long.valueOf(LJI));
                    }
                    consistencyRspStruct.setClientGidList(arrayList);
                    C2ZZ.LIZJ().clear();
                }
                if (feedItemList != null && feedItemList.getItems() != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(consistencyRspStruct.getClientGidList());
                    Iterator<Aweme> it2 = feedItemList.getItems().iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Long.valueOf(C2ZZ.LJI(it2.next().getAid())));
                    }
                    consistencyRspStruct.setClientGidList(arrayList2);
                    consistencyRspStruct.setFinalGidList(arrayList2);
                }
                C2ZZ.LJIIIIZZ(consistencyRspStruct, str, true);
                C2ZZ.LIZLLL().add(consistencyRspStruct);
            }
        }
        if (C2ZZ.LJFF().containsKey(aCallableS29S1100000_1.s0)) {
            C2ZZ.LJFF().remove(aCallableS29S1100000_1.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS29S1100000_1 aCallableS29S1100000_1) {
        ConsistencyRspStruct consistencyRspStruct;
        HashMap<Long, ConsistencyGroupStruct> consistencyGroups;
        for (Aweme aweme : (List) aCallableS29S1100000_1.l1) {
            long LJI = C2ZZ.LJI(aweme.getAid());
            ConsistencyGroupStruct LIZIZ = C2ZZ.LIZIZ(LJI, aweme.getAid(), aCallableS29S1100000_1.s0);
            if (!C2ZZ.LIZLLL().isEmpty() && (consistencyRspStruct = (ConsistencyRspStruct) ORZ.LJLLJ(C2ZZ.LIZLLL())) != null && (consistencyGroups = consistencyRspStruct.getConsistencyGroups()) != null) {
                consistencyGroups.put(Long.valueOf(LJI), LIZIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    public ACallableS29S1100000_1(Object obj, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
