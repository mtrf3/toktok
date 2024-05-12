package X;

import Y.ARunnableS19S0300000_8;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JZd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49369JZd {
    public static final C49369JZd LIZ = new C49369JZd();
    public static final IAwemeService LIZIZ = AwemeService.LIZ();
    public static final IRequestIdService LIZJ = RequestIdService.LJ();
    public static final java.util.Set<String> LIZLLL = C77275UUl.LJIIIIZZ("sounds", "hashtags", "effects", "related_search");

    public static boolean LIZIZ(SearchMixFeed feed) {
        o.LJIIIZ(feed, "feed");
        if (C77275UUl.LJIIIIZZ(65465, 1048336).contains(Integer.valueOf(feed.getFeedType())) && !C49604JdQ.LIZ(feed)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0154, code lost:
    
        if (r0 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0142, code lost:
    
        if (r0.size() > 0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49369JZd.LIZJ(java.util.List):java.util.List");
    }

    public static List LIZLLL(List list) {
        List LLJILJILJ = ORZ.LLJILJILJ(list);
        Iterator it = ((ArrayList) LLJILJILJ).iterator();
        int i = 0;
        while (it.hasNext()) {
            ((SearchMixFeed) it.next()).LJLILLLLZI = i;
            i++;
        }
        return LLJILJILJ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.ArrayList] */
    public final void LIZ(SearchMixFeedList data) {
        int i;
        Aweme forwardItem;
        o.LJIIIZ(data, "data");
        List<SearchMixFeed> list = data.mItems;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new ArrayList();
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            SearchMixFeed searchMixFeed = (SearchMixFeed) ListProtector.get(data.mItems, i2);
            o.LJI(searchMixFeed);
            searchMixFeed.LJLJJLL = data.logPb;
            InterfaceC49373JZh.LIZ.getClass();
            if (searchMixFeed.getFeedType() == 65280) {
                Aweme aweme = searchMixFeed.getAweme();
                ArrayList arrayList = new ArrayList();
                if (C49372JZg.LIZ(aweme)) {
                    o.LJIIIIZZ(aweme, "aweme");
                    arrayList.add(aweme);
                    IRequestIdService iRequestIdService = LIZJ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(aweme.getAid());
                    LIZ2.append('9');
                    iRequestIdService.LIZJ(i2, X1D.LIZIZ(LIZ2), data.getRequestId());
                    searchMixFeed.setAweme(aweme);
                    ListProtector.set(data.mItems, i2, searchMixFeed);
                    aweme.setRequestId(data.getRequestId());
                    if (aweme.getAwemeType() == 13 && (forwardItem = aweme.getForwardItem()) != null) {
                        forwardItem.setRepostFromGroupId(aweme.getAid());
                        forwardItem.setRepostFromUserId(aweme.getAuthorUid());
                        arrayList.add(forwardItem);
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(forwardItem.getAid());
                        LIZ3.append('1');
                        iRequestIdService.LIZJ(i2, X1D.LIZIZ(LIZ3), data.getRequestId());
                        forwardItem.setRequestId(data.getRequestId());
                    }
                }
                ((List) c68322mC2.element).addAll(arrayList);
            }
            if (searchMixFeed.getFeedType() == 65458) {
                for (SearchUser searchUser : searchMixFeed.users) {
                    User user = searchUser.user;
                    if (user != null) {
                        user.setRequestId(data.getRequestId());
                        searchUser.mGlobalDoodleConfig = data.globalDoodleConfig;
                        String requestId = data.getRequestId();
                        if (!C79004UzY.LJJIFFI(searchUser.awemeCards)) {
                            ArrayList arrayList2 = new ArrayList();
                            int i3 = 0;
                            for (Aweme aweme2 : searchUser.awemeCards) {
                                int i4 = i3 + 1;
                                if (aweme2 != null) {
                                    aweme2.setRequestId(requestId);
                                    IRequestIdService iRequestIdService2 = LIZJ;
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append(aweme2.getAid());
                                    LIZ4.append('9');
                                    iRequestIdService2.LIZJ(i3, X1D.LIZIZ(LIZ4), requestId);
                                    arrayList2.add(aweme2);
                                }
                                i3 = i4;
                            }
                            searchUser.awemeCards = arrayList2;
                            ((List) c68322mC.element).addAll(arrayList2);
                        }
                    }
                }
            }
            if (searchMixFeed.getFeedType() == 65456) {
                C49370JZe.LIZ(searchMixFeed.challengeList);
                for (SearchChallenge searchChallenge : searchMixFeed.challengeList) {
                    if (searchChallenge != null) {
                        searchChallenge.setRequestId(data.getRequestId());
                        if (searchChallenge.getChallenge() != null) {
                            searchChallenge.getChallenge().setRequestId(data.getRequestId());
                        }
                    }
                }
            }
            if (searchMixFeed.getFeedType() == 70) {
                List list2 = searchMixFeed.hotSpot.awemeCards;
                if (list2 == null) {
                    list2 = C61878OQg.INSTANCE;
                }
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((Aweme) it.next()).setRequestId(data.getRequestId());
                }
            }
        }
        C38995FSd.LJFF().submit(new ARunnableS19S0300000_8(this, c68322mC, c68322mC2, 2));
    }

    public static int LJ(int i, boolean z, List list) {
        if (z) {
            i = 0;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Aweme) it.next()).setRank(i);
                i++;
            }
        }
        return i;
    }
}
