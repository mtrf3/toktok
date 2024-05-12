package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C44729Hgz;
import X.EnumC46469ILp;
import X.InterfaceC88471Ynr;
import X.ORZ;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class AqS53S1000000_8 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS53S1000000_8(String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AqS53S1000000_8 aqS53S1000000_8, Object obj, Object aid) {
        AggregatedVideo aggregatedVideo;
        List<Aweme> list;
        SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
        o.LJIIIZ(searchMixFeed, "searchMixFeed");
        o.LJIIIZ(aid, "aid");
        boolean z = false;
        if (searchMixFeed.LJII() && (aggregatedVideo = searchMixFeed.aggregatedVideo) != null && (list = aggregatedVideo.awemes) != null) {
            String str = aqS53S1000000_8.s0;
            if (!list.isEmpty()) {
                Iterator<Aweme> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (o.LJ(it.next().getAid(), str)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AqS53S1000000_8 aqS53S1000000_8, Object obj, Object aid) {
        List<Aweme> awemeList;
        SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
        o.LJIIIZ(searchMixFeed, "searchMixFeed");
        o.LJIIIZ(aid, "aid");
        boolean z = false;
        if (searchMixFeed.getFeedType() == 65514 && searchMixFeed.LJI() != null && searchMixFeed.LJI().getOriginType() == 33 && (awemeList = searchMixFeed.LJI().getAwemeList()) != null) {
            String str = aqS53S1000000_8.s0;
            if (!awemeList.isEmpty()) {
                Iterator<Aweme> it = awemeList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (o.LJ(it.next().getAid(), str)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AqS53S1000000_8 aqS53S1000000_8, Object obj, Object aid) {
        String str;
        boolean z;
        Aweme aweme;
        SearchMixFeedBase searchMixFeed = (SearchMixFeedBase) obj;
        o.LJIIIZ(searchMixFeed, "searchMixFeed");
        o.LJIIIZ(aid, "aid");
        Aweme aweme2 = searchMixFeed.getAweme();
        String str2 = null;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (!o.LJ(str, aid)) {
            List LIZJ = C44729Hgz.LIZJ(searchMixFeed, EnumC46469ILp.GENERAL_SEARCH);
            if (LIZJ != null && (aweme = (Aweme) ORZ.LJLLLL(LIZJ)) != null) {
                str2 = aweme.getAid();
            }
            if (!o.LJ(str2, aqS53S1000000_8.s0)) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
