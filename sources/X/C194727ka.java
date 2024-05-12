package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.models.NowFeedResponse;
import com.ss.android.ugc.aweme.models.NowPublishInfoResponse;
import com.ss.android.ugc.aweme.models.NowUserPostResponse;
import com.ss.android.ugc.aweme.models.UserPublishInfo;
import com.ss.android.ugc.aweme.now.UserNowPost;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194727ka implements InterfaceC88763e4 {
    public final C194667kU LJLIL;

    public final UserPublishInfo LLIIIL() {
        UserPublishInfo userPublishInfo;
        try {
            NowPublishInfoResponse nowPublishInfoResponse = C7X6.LIZJ().getPublishInfo().execute().LIZIZ;
            o.LJIIIIZZ(nowPublishInfoResponse, "api.getPublishInfo().execute().body()");
            userPublishInfo = nowPublishInfoResponse.userPublishInfo;
        } catch (Exception unused) {
            userPublishInfo = null;
        }
        this.LJLIL.LIZ(userPublishInfo);
        return userPublishInfo;
    }

    public C194727ka(C194667kU repo) {
        o.LJIIIZ(repo, "repo");
        this.LJLIL = repo;
    }

    public final void LLIIIZ(NowFeedResponse nowFeedResponse) {
        Aweme aweme;
        List<Aweme> nowPosts;
        String str;
        C194707kY c194707kY = C78596Usy.LJJIFFI().LIZJ;
        List<Aweme> awemeList = nowFeedResponse.getData();
        c194707kY.getClass();
        o.LJIIIZ(awemeList, "awemeList");
        c194707kY.LIZJ.clear();
        c194707kY.LIZLLL.clear();
        Iterator<Aweme> it = awemeList.iterator();
        while (true) {
            if (it.hasNext()) {
                aweme = it.next();
                C196367nE c196367nE = C196367nE.LIZ;
                User author = aweme.getAuthor();
                if (author == null || (str = author.getUid()) == null) {
                    str = "";
                }
                c196367nE.getClass();
                if (C196367nE.LJI(str)) {
                    break;
                }
            } else {
                aweme = null;
                break;
            }
        }
        Aweme aweme2 = aweme;
        if (aweme2 != null) {
            UserNowPost userNowPost = aweme2.userNowPost;
            if (userNowPost != null && (nowPosts = userNowPost.getNowPosts()) != null && (!nowPosts.isEmpty())) {
                for (Aweme aweme3 : nowPosts) {
                    if (C78996UzQ.LJJIIZI(aweme3)) {
                        LinkedHashMap<String, Aweme> linkedHashMap = c194707kY.LIZJ;
                        String aid = aweme3.getAid();
                        o.LJIIIIZZ(aid, "aweme.aid");
                        linkedHashMap.put(aid, aweme3);
                    }
                }
            } else if (C78996UzQ.LJJIIZI(aweme2)) {
                LinkedHashMap<String, Aweme> linkedHashMap2 = c194707kY.LIZJ;
                String aid2 = aweme2.getAid();
                o.LJIIIIZZ(aid2, "aweme.aid");
                linkedHashMap2.put(aid2, aweme2);
            }
        }
        java.util.Set<String> keySet = c194707kY.LIZJ.keySet();
        o.LJIIIIZZ(keySet, "fromServerMap.keys");
        for (String str2 : keySet) {
            if (c194707kY.LIZIZ.containsKey(str2) && str2 != null) {
                c194707kY.LIZIZ.remove(str2);
            }
        }
        C3KA<C194227jm> c3ka = this.LJLIL.LIZIZ;
        XKX.LIZLLL(c3ka.LIZIZ, null, null, new C66362j2(c3ka, new C194227jm(nowFeedResponse.introductionVideoInfo, nowFeedResponse.limitDiversionInfo), null), 3);
        this.LJLIL.LIZ.set(new C194737kb(nowFeedResponse, 0, 0L));
    }

    public final void LLIIJI(C194227jm c194227jm) {
        C3KA<C194227jm> c3ka = this.LJLIL.LIZIZ;
        XKX.LIZLLL(c3ka.LIZIZ, null, null, new C66362j2(c3ka, c194227jm, null), 3);
    }

    public final C194737kb LJJJIL(int i, long j) {
        NowFeedResponse resp = C7X6.LIZJ().getNowDiscoveryFeed(j, i, 0, null).execute().LIZIZ;
        o.LJIIIIZZ(resp, "resp");
        C194737kb c194737kb = new C194737kb(resp, 1, j);
        this.LJLIL.LIZ(c194737kb.LJLIL.userPublishInfo);
        return c194737kb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C194737kb LLIIIILZ(int i, List list) {
        NowFeedResponse resp = (NowFeedResponse) C7X6.LIZIZ(0L, i, list, null, 40).execute().LIZIZ;
        o.LJIIIIZZ(resp, "resp");
        C194737kb c194737kb = new C194737kb(resp, 0, 0L);
        List<Aweme> awemes = resp.getData();
        o.LJIIIZ(awemes, "awemes");
        C72085SQv.LJ(new AqS153S0100000_3((List) awemes, (List<? extends Aweme>) 1552));
        this.LJLIL.LIZ(resp.userPublishInfo);
        return c194737kb;
    }

    public final C194737kb LJJJLL(int i, long j, String str) {
        Object LIZ;
        try {
            LIZ = (NowFeedResponse) C7X6.LIZIZ(j, i, null, str, 24).execute().LIZIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m13isSuccessimpl(LIZ)) {
            return null;
        }
        NowFeedResponse resp = (NowFeedResponse) LIZ;
        if (j == 0) {
            o.LJIIIIZZ(resp, "resp");
            LLIIIZ(resp);
        }
        o.LJIIIIZZ(resp, "resp");
        XKX.LIZLLL((InterfaceC70422pa) C194937kv.LIZ.getValue(), null, null, new C194957kx(resp, null), 3);
        this.LJLIL.LIZ(resp.userPublishInfo);
        C194737kb c194737kb = new C194737kb(resp, 0, j);
        List<Aweme> awemes = resp.getData();
        o.LJIIIZ(awemes, "awemes");
        C72085SQv.LJ(new AqS153S0100000_3((List) awemes, (List<? extends Aweme>) 1552));
        return c194737kb;
    }

    public final NowUserPostResponse LLIIIJ(@InterfaceC195707mA int i, long j, String authorId) {
        Object obj;
        o.LJIIIZ(authorId, "authorId");
        try {
            NowUserPostResponse nowUserPostResponse = C7X6.LIZJ().getUserNowPost(authorId, j, true, 20, i).execute().LIZIZ;
            nowUserPostResponse.checkValid();
            C3C5.m7constructorimpl(nowUserPostResponse);
            obj = nowUserPostResponse;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            obj = LIZ;
        }
        if (C3C5.m13isSuccessimpl(obj)) {
            return (NowUserPostResponse) obj;
        }
        return null;
    }
}
