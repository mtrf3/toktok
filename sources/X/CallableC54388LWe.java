package X;

import Y.AObjectS12S0001000_7;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2;
import com.ss.android.ugc.aweme.follow.api.IFollowFeedApiV1;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.legacy.FollowTabBubbleGuideHelperImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* renamed from: X.LWe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC54388LWe implements Callable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ int LJLL;
    public final /* synthetic */ long LJLLI;
    public final /* synthetic */ int LJLLILLLL;
    public final /* synthetic */ String LJLLJ;
    public final /* synthetic */ String LJLLL;
    public final /* synthetic */ int LJLLLL;
    public final /* synthetic */ String LJLLLLLL;
    public final /* synthetic */ String LJLZ;
    public final /* synthetic */ int LJZ;
    public final /* synthetic */ String LJZI;
    public final /* synthetic */ String LJZL;
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLD;
    public final /* synthetic */ C54883LgN LLF;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        FollowFeedList followFeedList;
        LiveRoomStruct newLiveRoomData;
        int i2;
        if (((RBY) HG3.LJIILL()).isUidContactPermisioned()) {
            i = 1;
        } else {
            i = 2;
        }
        if (TextUtils.equals(this.LLF.LJLILLLLZI, "extra_follow_type_friend")) {
            long j = this.LJLIL;
            long j2 = this.LJLILLLLZI;
            int i3 = this.LJLJI;
            int i4 = this.LJLJJI;
            this.LLF.getClass();
            T t = this.LLF.mData;
            if (t != 0) {
                i2 = ((FollowFeedList) t).getFetchRecommend();
            } else {
                i2 = 1;
            }
            String str = this.LJLJJL;
            String str2 = this.LJLJJLL;
            int i5 = this.LJLJL;
            int i6 = this.LJLJLJ;
            IFollowFeedApiV1 iFollowFeedApiV1 = C53827LAp.LIZIZ;
            Integer num = C54389LWf.LIZ.get(3, 0);
            o.LJIIIIZZ(num, "followTabChannelCountArray.get(channel, 0)");
            FollowFeedList followFeedList2 = iFollowFeedApiV1.getFriendList(j, j2, 20, i3, i4, 0L, i2, str, i5, i6, str2, i, "", Integer.valueOf(num.intValue()), 0, 0L, 0L).get();
            o.LJIIIIZZ(followFeedList2, "api.getFriendList(maxCur…lastLongLinkItemId).get()");
            followFeedList = followFeedList2;
            this.LLF.LJLJLLL = 2;
        } else if (TextUtils.equals(this.LLF.LJLIL, "rec_follow")) {
            int i7 = this.LJLJI;
            int i8 = this.LJLJJI;
            this.LLF.getClass();
            FollowFeedList followFeedList3 = C53827LAp.LIZIZ.getRecommendList(20, i7, i8, 0L, this.LJLJJL, this.LJLJLLL).get();
            o.LJIIIIZZ(followFeedList3, "api.getRecommendList(cou…onIds, lastFeedIds).get()");
            followFeedList = followFeedList3;
        } else {
            int i9 = this.LJLL;
            long j3 = this.LJLLI;
            int i10 = this.LJLLILLLL;
            int i11 = this.LJLJI;
            int i12 = this.LJLJJI;
            this.LLF.getClass();
            T t2 = this.LLF.mData;
            if (t2 != 0) {
                ((FollowFeedList) t2).getFetchRecommend();
            }
            String str3 = this.LJLLJ;
            String str4 = this.LJLLL;
            String str5 = this.LJLJJLL;
            int i13 = this.LJLLLL;
            String userAvatarShrink = this.LJLLLLLL;
            String adUserAgent = this.LJLZ;
            int i14 = this.LJZ;
            String cmplEnc = this.LJZI;
            String gaid = this.LJZL;
            String lastShowLives = this.LL;
            String lastPlayLives = this.LLD;
            o.LJIIIZ(userAvatarShrink, "userAvatarShrink");
            o.LJIIIZ(adUserAgent, "adUserAgent");
            o.LJIIIZ(cmplEnc, "cmplEnc");
            o.LJIIIZ(gaid, "gaid");
            o.LJIIIZ(lastShowLives, "lastShowLives");
            o.LJIIIZ(lastPlayLives, "lastPlayLives");
            if (str3 != null) {
                try {
                    LW9.LIZJ("awemeIds not empty");
                } catch (ExecutionException e) {
                    RuntimeException compatibleException = AbstractC36908Ee8.getCompatibleException(e);
                    o.LJIIIIZZ(compatibleException, "getCompatibleException(e)");
                    throw compatibleException;
                }
            }
            FollowFeedApiV2 followFeedApiV2 = LWJ.LIZ;
            String LIZJ = C54960Lhc.LIZ.LIZJ();
            FollowTabBubbleGuideHelperImpl.LIZJ().LIZIZ();
            FollowFeedList followFeedList4 = followFeedApiV2.getFollowFeedListNew(i9, j3, i10, 20, i11, i12, 0L, LIZJ, str3, str4, str5, "", i, 2, null, null, null, null, null, null, Integer.valueOf(i13), userAvatarShrink, adUserAgent, Integer.valueOf(i14), cmplEnc, gaid, lastShowLives, lastPlayLives, AdSessionPositionHelper.LJIIIIZZ("following"), LW9.LIZ(), 0, null).get();
            o.LJIIIIZZ(followFeedList4, "api.getFollowFeedListNew…)\n                ).get()");
            followFeedList = followFeedList4;
            this.LLF.LJLJLLL = 1;
        }
        if (this.LJLJI == 0) {
            this.LLF.LJLJL.LIZ();
        }
        this.LLF.LJLL = this.LJLJI;
        InterfaceC220958ln liveStateManager = BusinessComponentServiceUtils.getLiveStateManager();
        List<FollowFeed> items = followFeedList.getItems();
        C55077LjV c55077LjV = (C55077LjV) liveStateManager;
        c55077LjV.getClass();
        try {
            c55077LjV.LJFF(items);
        } catch (Throwable th) {
            PEH.LIZLLL(th, "preloadMPDForLiveInFollow");
        }
        if (!C55077LjV.LJIIJJI() && !C79004UzY.LJJIFFI(items)) {
            long currentTimeMillis = System.currentTimeMillis();
            for (FollowFeed followFeed : items) {
                if (followFeed.getFeedType() == 65298) {
                    RoomFeedCellStruct roomStruct = followFeed.getRoomStruct();
                    if (roomStruct != null && (newLiveRoomData = roomStruct.getNewLiveRoomData()) != null) {
                        User user = newLiveRoomData.owner;
                        user.roomId = newLiveRoomData.id;
                        c55077LjV.LJII(currentTimeMillis, user);
                        c55077LjV.LIZ(currentTimeMillis, newLiveRoomData.owner);
                    }
                } else {
                    Aweme aweme = followFeed.getAweme();
                    if (aweme != null) {
                        c55077LjV.LJII(currentTimeMillis, aweme.getAuthor());
                        c55077LjV.LIZ(currentTimeMillis, aweme.getAuthor());
                    }
                }
            }
        }
        C54883LgN c54883LgN = this.LLF;
        followFeedList.getBlankPanelText();
        c54883LgN.getClass();
        L6F.LIZIZ.LIZLLL(L61.STORY, EnumC53719L6l.FEED, followFeedList.getItems(), new AObjectS12S0001000_7(0, 0));
        return followFeedList;
    }

    public CallableC54388LWe(C54883LgN c54883LgN, long j, long j2, int i, int i2, String str, String str2, int i3, int i4, String str3, int i5, long j3, int i6, String str4, String str5, int i7, String str6, String str7, int i8, String str8, String str9, String str10, String str11) {
        this.LLF = c54883LgN;
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = i3;
        this.LJLJLJ = i4;
        this.LJLJLLL = str3;
        this.LJLL = i5;
        this.LJLLI = j3;
        this.LJLLILLLL = i6;
        this.LJLLJ = str4;
        this.LJLLL = str5;
        this.LJLLLL = i7;
        this.LJLLLLLL = str6;
        this.LJLZ = str7;
        this.LJZ = i8;
        this.LJZI = str8;
        this.LJZL = str9;
        this.LL = str10;
        this.LLD = str11;
    }
}
