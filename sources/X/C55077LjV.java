package X;

import Y.ARunnableS45S0100000_9;
import Y.IDRunnableS6S0101000;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.RetrofitService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.LjV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55077LjV implements InterfaceC220958ln {
    public static final Long LJIIJ;
    public static final C55078LjW LJIIJJI;
    public final java.util.Map<Long, Long> LIZ = new HashMap(20);
    public final java.util.Map<Long, Long> LIZIZ = new HashMap(20);
    public final LruCache<Long, Long> LIZJ = new LruCache<>(19);
    public final java.util.Map<Long, Long> LIZLLL = new HashMap(40);
    public final LruCache<Long, Long> LJ = new LruCache<>(40);
    public RunnableC32211CkZ LJFF = null;
    public final ArrayDeque<RunnableC32211CkZ> LJI = new ArrayDeque<>(10);
    public final LiveStateApi LJII;
    public volatile boolean LJIIIIZZ;
    public volatile boolean LJIIIZ;

    static {
        C16880lQ.LJLLJ(C55077LjV.class);
        LJIIJ = 0L;
        LJIIJJI = new C55078LjW();
    }

    public final void LJIIJ() {
        RunnableC32211CkZ runnableC32211CkZ = this.LJFF;
        if (runnableC32211CkZ != null && runnableC32211CkZ.LJLIL) {
            return;
        }
        RunnableC32211CkZ pollLast = this.LJI.pollLast();
        this.LJFF = pollLast;
        if (pollLast == null) {
            return;
        }
        pollLast.run();
    }

    public C55077LjV() {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(Live.getLiveDomain());
        this.LJII = (LiveStateApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(X1D.LIZIZ(LIZ)).create(LiveStateApi.class);
        this.LJIIIIZZ = true;
        this.LJIIIZ = false;
        if (!this.LJIIIZ) {
            C38995FSd.LIZIZ().submit(new ARunnableS45S0100000_9(this, 70));
        }
    }

    public static long LIZJ() {
        try {
            if (((Boolean) LiveOuterService.LJJJLL().LJJIJIL().LJIIIZ(Boolean.FALSE, "enable_refresh_foru_avatar_live_status")).booleanValue()) {
                return ((Integer) LiveOuterService.LJJJLL().LJJIJIL().LJIIIZ(60000, "mt_refresh_foru_avatar_live_state_interval")).intValue();
            }
            return C2YJ.LIZIZ.LIZ.getAutoLiveStateIntervalMills().longValue();
        } catch (Exception unused) {
            return 60000L;
        }
    }

    public static boolean LIZLLL() {
        return ((Boolean) C78895Uxn.LIZ().LJIIIZ(Boolean.FALSE, "live_preview_card_mpd_enable")).booleanValue();
    }

    public static boolean LJIIJJI() {
        boolean z = false;
        if (((Boolean) C78895Uxn.LIZ().LJIIIZ(Boolean.FALSE, "enable_refresh_foru_avatar_live_status")).booleanValue()) {
            return false;
        }
        if (!UTU.LIZIZ(UTU.LIZ)) {
            try {
                z = C2YJ.LIZIZ.LIZ.getEnableAutoLiveState().booleanValue();
            } catch (C158056If unused) {
            }
        }
        return !z;
    }

    public final boolean LJ() {
        if (DKI.LIZ()) {
            if (!this.LJIIIZ) {
                this.LJIIIIZZ = LIZLLL();
                this.LJIIIZ = true;
            }
            if (!this.LJIIIIZZ) {
                return true;
            }
            return false;
        }
        if (!LIZLLL()) {
            return true;
        }
        return false;
    }

    public final void LJFF(List<FollowFeed> list) {
        RoomFeedCellStruct roomStruct;
        LiveRoomStruct newLiveRoomData;
        String str;
        LiveCoreSDKData liveCoreSDKData;
        if (LJ()) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (FollowFeed followFeed : list) {
            if (followFeed.getFeedType() == 65298 && (roomStruct = followFeed.getRoomStruct()) != null && (newLiveRoomData = roomStruct.getNewLiveRoomData()) != null) {
                StreamUrlStruct streamUrlStruct = newLiveRoomData.stream_url;
                if (streamUrlStruct != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && liveCoreSDKData.getPullData() != null) {
                    str = C38393F4z.LJFF(newLiveRoomData.stream_url.liveCoreSDKData.getPullData());
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            LiveOuterService.LJJJLL().LJJIZ().LJJIJIL().LLD(arrayList);
        }
    }

    public final void LJI(List<Aweme> list) {
        if (!LJIIJJI() && !C79004UzY.LJJIFFI(list)) {
            long currentTimeMillis = System.currentTimeMillis();
            for (Aweme aweme : list) {
                if ("homepage_follow".equals(Integer.valueOf(aweme.getAwemeType()))) {
                    aweme.getAwemeType();
                }
                if (aweme.getAuthor() != null) {
                    LJII(currentTimeMillis, aweme.getAuthor());
                }
                LIZ(currentTimeMillis, aweme.getAuthor());
            }
        }
        try {
            if (!LJ()) {
                C38995FSd.LIZLLL().submit(new IDRunnableS6S0101000(7, list, 34));
            }
        } catch (Throwable th) {
            PEH.LIZLLL(th, "preloadMPDForLive");
        }
    }

    public final void LJIIIZ(long j) {
        ((HashMap) this.LIZ).remove(Long.valueOf(j));
        ((HashMap) this.LIZIZ).remove(Long.valueOf(j));
        this.LIZJ.remove(Long.valueOf(j));
    }

    public final void LIZ(long j, User user) {
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            return;
        }
        Long valueOf = CastLongProtector.valueOf(user.getUid());
        this.LJ.put(valueOf, Long.valueOf(user.roomId));
        ((HashMap) this.LIZLLL).put(valueOf, Long.valueOf(j));
    }

    public final void LIZIZ(List<User> list, java.util.Map<Long, Long> map) {
        long j;
        if (!C79004UzY.LJJIFFI(list)) {
            for (User user : list) {
                if (user != null) {
                    try {
                        j = CastLongProtector.parseLong(user.getUid());
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        j = 0;
                    }
                    Long l = map.get(Long.valueOf(j));
                    if (l == null) {
                        l = 0L;
                    }
                    if (l.longValue() != 0) {
                        ((HashMap) this.LIZ).put(Long.valueOf(j), l);
                        ((HashMap) this.LIZIZ).put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
                    }
                    this.LJ.put(Long.valueOf(j), l);
                    ((HashMap) this.LIZLLL).put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    public final void LJII(long j, User user) {
        if (LJIIJJI() || user == null || TextUtils.isEmpty(user.getUid())) {
            return;
        }
        Long valueOf = CastLongProtector.valueOf(user.getUid());
        long j2 = user.roomId;
        if (j2 == 0) {
            return;
        }
        ((HashMap) this.LIZ).put(valueOf, Long.valueOf(j2));
        ((HashMap) this.LIZIZ).put(valueOf, Long.valueOf(j));
        this.LIZJ.put(valueOf, Long.valueOf(user.roomId));
    }

    public final void LJIIIIZZ(User user, InterfaceC64592gB interfaceC64592gB, String str) {
        java.util.Set<Long> set;
        if (LJIIJJI() || user == null || TextUtils.isEmpty(user.getUid())) {
            return;
        }
        Long valueOf = CastLongProtector.valueOf(user.getUid());
        RunnableC32211CkZ runnableC32211CkZ = this.LJFF;
        if (runnableC32211CkZ != null && (set = runnableC32211CkZ.LJLJJI) != null && ((HashSet) set).contains(valueOf)) {
            ((ArrayList) this.LJFF.LJLJJL).add(interfaceC64592gB);
        } else {
            this.LJI.addFirst(new RunnableC32211CkZ(this, valueOf, Long.valueOf(user.roomId), interfaceC64592gB, str));
            LJIIJ();
        }
    }
}
