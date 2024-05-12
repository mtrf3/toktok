package X;

import Y.IDuS19S0300000_9;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LWa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54384LWa {
    public final C73318Sq2 LIZ = new C73318Sq2();
    public boolean LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final C73390SrC LIZ(int i, String str, LWX lwx, Handler handler) {
        C54385LWb c54385LWb;
        String str2;
        Object obj;
        Object obj2;
        Object obj3;
        UserStory userStory;
        Aweme aweme;
        String authorUid;
        int currentPosition;
        String str3;
        String str4;
        Aweme aweme2;
        User author;
        User author2;
        UserStory userStory2;
        int i2;
        int currentPosition2;
        Integer currentIndex;
        UserStory userStory3;
        UserStory userStory4;
        List<Aweme> stories;
        UserStory userStory5;
        UserStoryCurrentInfo maxViewedInfo;
        UserStory userStory6;
        User author3;
        Long l = null;
        if (!((Boolean) C34166Db0.LIZIZ.getValue()).booleanValue() || !LX1.LJIILIIL || i != EnumC54377LVt.REFRESH.getType() || this.LIZIZ || !TextUtils.isEmpty(str) || (c54385LWb = lwx.LJLJJI) == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        List items = ((AbstractC51036K1g) c54385LWb.LIZ.LIZJ.LJLIL).getItems();
        if (items == null || items.isEmpty()) {
            c54385LWb.LIZIZ = 0;
            c54385LWb.LIZ().clear();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FriendsFeed friendsFeed : items.subList(0, Math.min(c54385LWb.LIZIZ + 1, items.size()))) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("story author: ");
            Aweme aweme3 = friendsFeed.getAweme();
            if (aweme3 != null && (author3 = aweme3.getAuthor()) != null) {
                str2 = author3.getNickname();
            } else {
                str2 = l;
            }
            LIZ.append(str2);
            LIZ.append("cur_index = ");
            Aweme aweme4 = friendsFeed.getAweme();
            if (aweme4 != null && (userStory6 = aweme4.getUserStory()) != null) {
                obj = UserStoryKt.currentIndex(userStory6);
            } else {
                obj = l;
            }
            LIZ.append(obj);
            LIZ.append(", max = ");
            Aweme aweme5 = friendsFeed.getAweme();
            if (aweme5 != null && (userStory5 = aweme5.getUserStory()) != null && (maxViewedInfo = userStory5.getMaxViewedInfo()) != null) {
                obj2 = maxViewedInfo.getCurrentIndex();
            } else {
                obj2 = l;
            }
            LIZ.append(obj2);
            LIZ.append(", size = ");
            Aweme aweme6 = friendsFeed.getAweme();
            if (aweme6 != null && (userStory4 = aweme6.getUserStory()) != null && (stories = userStory4.getStories()) != null) {
                obj3 = Integer.valueOf(stories.size());
            } else {
                obj3 = l;
            }
            LIZ.append(obj3);
            LIZ.append(", totalCount = ");
            Aweme aweme7 = friendsFeed.getAweme();
            if (aweme7 != null && (userStory3 = aweme7.getUserStory()) != null) {
                l = Long.valueOf(userStory3.getTotalCount());
            }
            LIZ.append(l);
            X1D.LIZIZ(LIZ);
            Aweme aweme8 = friendsFeed.getAweme();
            if (aweme8 != null && aweme8.getIsTikTokStory()) {
                Aweme aweme9 = friendsFeed.getAweme();
                if (aweme9 != null && (userStory2 = aweme9.getUserStory()) != null) {
                    if (!userStory2.getAllViewed()) {
                        UserStoryCurrentInfo maxViewedInfo2 = userStory2.getMaxViewedInfo();
                        if (maxViewedInfo2 != null && (currentIndex = maxViewedInfo2.getCurrentIndex()) != null) {
                            i2 = currentIndex.intValue();
                        } else {
                            i2 = 0;
                        }
                        if (i2 < userStory2.getTotalCount() - 1) {
                            Integer currentIndex2 = UserStoryKt.currentIndex(userStory2);
                            if (currentIndex2 != null) {
                                currentPosition2 = currentIndex2.intValue();
                            } else {
                                currentPosition2 = (int) userStory2.getCurrentPosition();
                            }
                            if (currentPosition2 >= userStory2.getTotalCount() - 1) {
                            }
                        }
                    }
                }
                Aweme aweme10 = friendsFeed.getAweme();
                if (aweme10 != null && (userStory = aweme10.getUserStory()) != null && (aweme = friendsFeed.getAweme()) != null && (authorUid = aweme.getAuthorUid()) != null) {
                    Integer currentIndex3 = UserStoryKt.currentIndex(userStory);
                    if (currentIndex3 != null) {
                        currentPosition = currentIndex3.intValue();
                    } else {
                        currentPosition = (int) userStory.getCurrentPosition();
                    }
                    int nextStoryIndex = userStory.getNextStoryIndex(currentPosition);
                    c54385LWb.LIZ().put(authorUid, Integer.valueOf(nextStoryIndex));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("author: ");
                    Aweme aweme11 = friendsFeed.getAweme();
                    if (aweme11 != null && (author2 = aweme11.getAuthor()) != null) {
                        str3 = author2.getNickname();
                    } else {
                        str3 = null;
                    }
                    C0EH.LIZLLL(LIZ2, str3, ", new_position = ", nextStoryIndex, ", story hash = ");
                    LIZ2.append(userStory.hashCode());
                    X1D.LIZIZ(LIZ2);
                    arrayList.add(friendsFeed);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("aweme hash = ");
                    FriendsFeed friendsFeed2 = (FriendsFeed) ORZ.LLFII(arrayList);
                    if (friendsFeed2 != null && (aweme2 = friendsFeed2.getAweme()) != null && (author = aweme2.getAuthor()) != null) {
                        str4 = author.getNickname();
                    } else {
                        str4 = null;
                    }
                    LIZ3.append(str4);
                    X1D.LIZIZ(LIZ3);
                }
            }
            l = null;
        }
        if (c54385LWb.LIZIZ + 1 < items.size()) {
            List subList = items.subList(c54385LWb.LIZIZ + 1, items.size());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : subList) {
                Aweme aweme12 = ((FriendsFeed) obj4).getAweme();
                if (aweme12 == null || aweme12.getAwemeType() != 4004) {
                    arrayList2.add(obj4);
                }
            }
            arrayList.addAll(arrayList2);
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        c54385LWb.LIZIZ = 0;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Aweme aweme13 = ((FriendsFeed) next).getAweme();
            if (aweme13 != null && aweme13.getIsTikTokStory()) {
                arrayList3.add(next);
            }
        }
        int size = arrayList3.size();
        long j = currentTimeMillis - c54385LWb.LIZJ;
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(arrayList.size(), "total_num_cnt");
        c188727au.LIZLLL(size, "story_num_cnt");
        c188727au.LJ(j, "last_request_to_cache_show");
        FMX.LJIIL("friend_feed_nonfirst_refresh_cache", c188727au.LIZ);
        if (arrayList.isEmpty()) {
            return null;
        }
        return AbstractC73672Svk.LJIIJ(new IDuS19S0300000_9(lwx, arrayList, handler, 0));
    }
}
