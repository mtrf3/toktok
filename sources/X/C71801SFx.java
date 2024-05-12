package X;

import Y.AfS4S0000100_12;
import Y.IDhS1S0100100_12;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.recommendfeed.fetchlist.FeedApi;
import com.ss.android.ugc.aweme.kids.recommendfeed.model.KFeedItemList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SFx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71801SFx implements OB7 {
    @Override // X.OB7
    public final boolean LIZ() {
        return true;
    }

    @Override // X.OB7
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.OB7
    public final boolean LJIILJJIL() {
        return true;
    }

    @Override // X.OB7
    public final AbstractC73672Svk<OSZ<List<Aweme>, Integer>> LIZJ() {
        return refresh();
    }

    @Override // X.OB7
    public final C73805Sxt LJIIJJI() {
        long currentTimeMillis = System.currentTimeMillis();
        return FeedApi.LIZ(2).LJJL(T16.LIZ()).LJIJJ(new AfS4S0000100_12(currentTimeMillis, 0)).LJJIJL(new IDhS1S0100100_12(currentTimeMillis, this, 0));
    }

    @Override // X.OB7
    public final AbstractC73672Svk<OSZ<List<Aweme>, Integer>> refresh() {
        long currentTimeMillis = System.currentTimeMillis();
        return FeedApi.LIZ(1).LJJL(T16.LIZ()).LJIJJ(new AfS4S0000100_12(currentTimeMillis, 1)).LJJIJL(new IDhS1S0100100_12(currentTimeMillis, this, 1));
    }

    public static OSZ LIZLLL(KFeedItemList kFeedItemList) {
        Aweme aweme;
        List<Aweme> list = kFeedItemList.items;
        if (list == null || (aweme = (Aweme) ListProtector.get(list, 0)) == null || aweme.getLogPbBean() == null) {
            List<Aweme> list2 = kFeedItemList.items;
            o.LJI(list2);
            Iterator<Aweme> it = list2.iterator();
            while (it.hasNext()) {
                it.next().setLogPbBean(kFeedItemList.getLogPb());
            }
        }
        List<Aweme> list3 = kFeedItemList.items;
        if (list3 != null && list3.isEmpty()) {
            return new OSZ(C61878OQg.INSTANCE, -1);
        }
        List<Aweme> list4 = kFeedItemList.items;
        o.LJI(list4);
        return new OSZ(list4, 0);
    }
}
