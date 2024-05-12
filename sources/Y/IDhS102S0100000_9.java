package Y;

import X.AbstractC73672Svk;
import X.AnonymousClass391;
import X.C1791471i;
import X.C198517qh;
import X.C23220ve;
import X.C34031DXf;
import X.C35168DrA;
import X.C36922EeM;
import X.C54239LQl;
import X.C54262LRi;
import X.C54362LVe;
import X.C54415LXf;
import X.C54416LXg;
import X.C54789Ler;
import X.C55668Lt2;
import X.C55670Lt4;
import X.C55671Lt5;
import X.C56646MLa;
import X.C56681MMj;
import X.C56682MMk;
import X.C56686MMo;
import X.C56702MNe;
import X.C56742Ko;
import X.C56745MOv;
import X.C56757MPh;
import X.C56769MPt;
import X.C56897MUr;
import X.C57266Mdi;
import X.C61878OQg;
import X.C65314PkE;
import X.C68322mC;
import X.C76732zl;
import X.C76800UCe;
import X.C77800Ug8;
import X.C81154Vt8;
import X.C8HX;
import X.C9K4;
import X.C9K6;
import X.EFJ;
import X.F9J;
import X.FMX;
import X.InterfaceC48038ItG;
import X.LW7;
import X.LWR;
import X.LX1;
import X.LY5;
import X.M4S;
import X.MG0;
import X.MGJ;
import X.MLS;
import X.MP1;
import X.MPM;
import X.MPO;
import X.MS5;
import X.ORZ;
import X.OSZ;
import X.PEH;
import X.RKZ;
import X.TBW;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.dsp.api.MusicVipInfoApi;
import com.ss.android.ugc.aweme.feed.api.FeedApi;
import com.ss.android.ugc.aweme.feed.api.FollowFeedApi;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import com.ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.ss.android.ugc.aweme.inbox.widget.multi.NoticeAndDMCombineWidget;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxNoticePreviewWindowResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.ss.android.ugc.aweme.notification.perf.ActivitiesPerfCacheManager;
import com.ss.android.ugc.aweme.notification.perf.NoticePerfManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.story.ProfileStoryApi;
import com.ss.android.ugc.aweme.story.model.StoryArchDetailResponse;
import com.ss.android.ugc.tiktok.ConvertHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDhS102S0100000_9 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case 9:
                return apply$9(this, obj);
            case 10:
                return apply$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return apply$11(this, obj);
            case 12:
                return apply$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return apply$13(this, obj);
            case 14:
                return apply$14(this, obj);
            case 15:
                return apply$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return apply$16(this, obj);
            case 17:
                return apply$17(this, obj);
            case 18:
                return apply$18(this, obj);
            case 19:
                return apply$19(this, obj);
            case 20:
                return apply$20(this, obj);
            case 21:
                return apply$21(this, obj);
            case 22:
                return apply$22(this, obj);
            case 23:
                return apply$23(this, obj);
            case 24:
                return apply$24(this, obj);
            case 25:
                return apply$25(this, obj);
            case 26:
                return apply$26(this, obj);
            case 27:
                return apply$27(this, obj);
            default:
                return null;
        }
    }

    public IDhS102S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        C55671Lt5 c55671Lt5 = (C55671Lt5) iDhS102S0100000_9.l0;
        RKZ rkz = (RKZ) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            FeedItemList com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList = ConvertHelper.com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(rkz, null);
            Integer num = c55671Lt5.LJI;
            if (num != null && num.intValue() == 8 && com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList != null) {
                com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList.pbData = rkz;
            }
            C9K4.LIZIZ("pbConvert2Json success", "");
            C65314PkE.LJLIL = SystemClock.elapsedRealtime() - elapsedRealtime;
            return com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList;
        } catch (Throwable th) {
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("errMsg", Log.getStackTraceString(th));
            C8HX.LIZIZ("service_monitor", "log_bean_copy_convert_error", c198517qh.LJ());
            C55668Lt2 c55668Lt2 = new C55668Lt2(th);
            C36922EeM.LJFF(c55668Lt2);
            if (C35168DrA.LIZ()) {
                C56742Ko c56742Ko = new C56742Ko();
                c56742Ko.LIZ(String.valueOf(1), "isSuccess");
                c56742Ko.LIZ(c55668Lt2.getMessage(), "errMsg");
                c56742Ko.LIZ("pbToJson", "source");
                C9K4.LIZLLL(c56742Ko.LIZ, "", C9K6.REQUEST_DATA, null);
            }
            PEH.LIZJ(c55668Lt2);
            F9J.LIZIZ(C1791471i.LIZ, 0, "pb_convert_flag").edit().clear().putBoolean(C55670Lt4.LIZ, true).commit();
            return FeedApi.LJ(c55671Lt5, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse, T, java.lang.Object] */
    public static final Object apply$1(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        NoticeCount noticeCount;
        ?? it = (InboxEntranceResponse) obj;
        o.LJIIIZ(it, "it");
        MLS.LJI(it);
        ((C68322mC) iDhS102S0100000_9.l0).element = it;
        List<NoticeCount> noticeCounts = it.getNoticeCounts();
        if (noticeCounts != null) {
            Iterator<NoticeCount> it2 = noticeCounts.iterator();
            while (true) {
                if (it2.hasNext()) {
                    noticeCount = it2.next();
                    if (noticeCount.getGroup() == 210) {
                        break;
                    }
                } else {
                    noticeCount = null;
                    break;
                }
            }
            NoticeCount noticeCount2 = noticeCount;
            if (noticeCount2 != null && noticeCount2.getCount() == 0 && !C54239LQl.LIZIZ.LIZLLL()) {
                C54262LRi c54262LRi = new C54262LRi(-99999);
                c54262LRi.LIZLLL(-999999, -1);
                c54262LRi.post();
            }
        }
        return C54362LVe.LJIJI(new NoticeList(null, MLS.LIZJ(it), 0L, 0 == true ? 1 : 0, it.getGroups(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 109, 0 == true ? 1 : 0));
    }

    public static final Object apply$10(IDhS102S0100000_9 iDhS102S0100000_9, Object it) {
        o.LJIIIZ(it, "it");
        C81154Vt8 LIZ = FlyMainColor.LIZ.LIZ(new C23220ve((Bitmap) iDhS102S0100000_9.l0, null));
        LIZ.LJI(20.0f);
        return LIZ;
    }

    public static final Object apply$11(IDhS102S0100000_9 iDhS102S0100000_9, Object it) {
        o.LJIIIZ(it, "it");
        C81154Vt8 LIZ = FlyMainColor.LIZ.LIZ(new C23220ve((Bitmap) iDhS102S0100000_9.l0, null));
        LIZ.LJI(20.0f);
        return LIZ;
    }

    public static final Object apply$12(IDhS102S0100000_9 iDhS102S0100000_9, Object it) {
        o.LJIIIZ(it, "it");
        return ((NoticeAndDMCombineWidget) iDhS102S0100000_9.l0).LJIJJLI();
    }

    public static final Object apply$13(IDhS102S0100000_9 iDhS102S0100000_9, Object it) {
        o.LJIIIZ(it, "it");
        C81154Vt8 LIZ = FlyMainColor.LIZ.LIZ(new C23220ve((Bitmap) iDhS102S0100000_9.l0, null));
        LIZ.LJI(20.0f);
        return LIZ;
    }

    public static final Object apply$14(IDhS102S0100000_9 iDhS102S0100000_9, Object it) {
        o.LJIIIZ(it, "it");
        FollowFeedApi.LIZ.getClass();
        AbstractC73672Svk<FollowingInterestUsersResponse> interestUsers = LY5.LIZ().getInterestUsers(2, 0L, 2, ((C76732zl) iDhS102S0100000_9.l0).element);
        LWR.LJ.set(true);
        return interestUsers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$15(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        User user;
        boolean z;
        List<OSZ> list = (List) obj;
        ArrayList LJ = AnonymousClass391.LJ(list, "pairList");
        C57266Mdi c57266Mdi = (C57266Mdi) iDhS102S0100000_9.l0;
        for (OSZ osz : list) {
            User user2 = c57266Mdi.LIZ.get(osz.getFirst());
            User user3 = (User) osz.getSecond();
            if (user2 != null && user3 != null && user2.getFollowStatus() != user3.getFollowStatus()) {
                FollowStatus followStatus = new FollowStatus(user3.getUid(), user3.getFollowStatus());
                if (user2.getFollowStatus() == 0 || user3.getFollowStatus() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                followStatus.isFollowChange = z;
                followStatus.preStatus = user2.getFollowStatus();
                LJ.add(followStatus);
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).updateIMUserFollowStatus(user3);
            }
            ConcurrentHashMap<String, User> concurrentHashMap = c57266Mdi.LIZ;
            Object first = osz.getFirst();
            User user4 = (User) osz.getSecond();
            if (user4 != null) {
                user = user4.m150clone();
            } else {
                user = null;
            }
            concurrentHashMap.put(first, user);
        }
        return LJ;
    }

    public static final Object apply$16(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        C56769MPt it = (C56769MPt) obj;
        o.LJIIIZ(it, "it");
        C56757MPh c56757MPh = (C56757MPh) iDhS102S0100000_9.l0;
        List LLJILJILJ = ORZ.LLJILJILJ((Collection) it.LIZIZ);
        c56757MPh.LIZJ(LLJILJILJ);
        if (it.LIZ.hasMore()) {
            ((ArrayList) LLJILJILJ).add(new MPM());
        }
        return new C56769MPt(it.LIZ, LLJILJILJ, it.LIZJ);
    }

    public static final Object apply$17(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        C56769MPt it = (C56769MPt) obj;
        o.LJIIIZ(it, "it");
        C56757MPh c56757MPh = (C56757MPh) iDhS102S0100000_9.l0;
        List LLJILJILJ = ORZ.LLJILJILJ((Collection) it.LIZIZ);
        c56757MPh.LIZJ(LLJILJILJ);
        if (it.LIZ.hasMore()) {
            ((ArrayList) LLJILJILJ).add(new MPM());
        }
        return new C56769MPt(it.LIZ, LLJILJILJ, it.LIZJ);
    }

    public static final Object apply$18(IDhS102S0100000_9 iDhS102S0100000_9, Object it) {
        int i;
        o.LJIIIZ(it, "it");
        C81154Vt8 LIZ = FlyMainColor.LIZ.LIZ(new C23220ve((Bitmap) iDhS102S0100000_9.l0, null));
        Integer LIZJ = LIZ.LIZJ();
        if (LIZJ != null) {
            i = LIZJ.intValue();
        } else {
            i = 0;
        }
        if (LIZ.LIZLLL >= 0) {
            return Integer.valueOf(i);
        }
        throw new IllegalStateException("Could not find main color");
    }

    public static final Object apply$19(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        long j;
        NoticeItems noticeItems;
        NoticeListsResponse it = (NoticeListsResponse) obj;
        o.LJIIIZ(it, "it");
        C56686MMo.LIZIZ(it);
        if (((MP1) iDhS102S0100000_9.l0).LIZ == C56702MNe.LIZ) {
            M4S LIZJ = NoticePerfManager.LIZJ();
            if (LIZJ != null) {
                MS5.LIZ(new AqS156S0200000_9(LIZJ, it, 26));
            }
            C56681MMj LIZ = ActivitiesPerfCacheManager.LIZ();
            if (LIZ != null) {
                LIZ.LIZJ(it, true);
            }
            if (((Boolean) C34031DXf.LIZIZ.getValue()).booleanValue()) {
                MP1 mp1 = (MP1) iDhS102S0100000_9.l0;
                List<NoticeItems> notices = it.getNotices();
                if (notices != null) {
                    Iterator<NoticeItems> it2 = notices.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            noticeItems = it2.next();
                            if (noticeItems.getGroup() == C56702MNe.LIZ) {
                                break;
                            }
                        } else {
                            noticeItems = null;
                            break;
                        }
                    }
                    NoticeItems noticeItems2 = noticeItems;
                    if (noticeItems2 != null) {
                        j = noticeItems2.getCommonLastReadTime();
                        mp1.LJIIJJI = j;
                    }
                }
                j = 0;
                mp1.LJIIJJI = j;
            }
        }
        return new OSZ(MPO.GROUP, it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$2(IDhS102S0100000_9 iDhS102S0100000_9, Object it) {
        o.LJIIIZ(it, "it");
        T t = ((C68322mC) iDhS102S0100000_9.l0).element;
        if (t == 0) {
            return new InboxEntranceResponse(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
        }
        return t;
    }

    public static final Object apply$20(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        NoticeCombineResponse it = (NoticeCombineResponse) obj;
        o.LJIIIZ(it, "it");
        M4S LIZJ = NoticePerfManager.LIZJ();
        if (LIZJ != null) {
            MS5.LIZ(new AqS156S0200000_9(LIZJ, it, 25));
        }
        C56681MMj LIZ = ActivitiesPerfCacheManager.LIZ();
        if (LIZ != null) {
            synchronized (LIZ) {
                LIZ.LIZJ = new ActivitiesPerfCacheManager.JanusData(SystemClock.currentThreadTimeMillis(), it);
                LIZ.LJFF = true;
            }
        }
        ((C56745MOv) iDhS102S0100000_9.l0).LJIIIIZZ(it);
        C56682MMk c56682MMk = C56682MMk.LJI;
        int intValue = ((Number) ((C56745MOv) iDhS102S0100000_9.l0).LJII.getValue()).intValue();
        c56682MMk.LIZLLL();
        if (c56682MMk.LJFF()) {
            c56682MMk.LJ = "new_activities";
            C56682MMk.LJII = intValue;
        }
        c56682MMk.LJIIIIZZ(it);
        return C76800UCe.LIZ;
    }

    public static final Object apply$21(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        TutorialVideoResp it = (TutorialVideoResp) obj;
        o.LJIIIZ(it, "it");
        C56745MOv c56745MOv = (C56745MOv) iDhS102S0100000_9.l0;
        synchronized (c56745MOv) {
            ((List) c56745MOv.LIZJ.getValue()).clear();
            if (it.getInfo() != null) {
                List list = (List) c56745MOv.LIZJ.getValue();
                TutorialVideoInfo info = it.getInfo();
                o.LJI(info);
                list.add(C56897MUr.LIZ(info));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object apply$22(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        int i;
        Boolean valueOf;
        FollowRequestResponse it = (FollowRequestResponse) obj;
        o.LJIIIZ(it, "it");
        int i2 = it.total;
        C56745MOv c56745MOv = (C56745MOv) iDhS102S0100000_9.l0;
        synchronized (c56745MOv) {
            C56646MLa c56646MLa = (C56646MLa) ORZ.LJLLLL(c56745MOv.LIZLLL());
            boolean z = false;
            if (c56646MLa != null) {
                i = c56646MLa.LIZ;
            } else {
                i = 0;
            }
            if (i2 != i) {
                c56745MOv.LIZLLL().clear();
                if (i2 > 0) {
                    c56745MOv.LIZLLL().add(new C56646MLa(i2, C61878OQg.INSTANCE));
                }
                c56745MOv.LIZJ();
                z = true;
            }
            valueOf = Boolean.valueOf(z);
        }
        return valueOf;
    }

    public static final Object apply$23(IDhS102S0100000_9 iDhS102S0100000_9, Object it) {
        o.LJIIIZ(it, "it");
        C81154Vt8 LIZ = FlyMainColor.LIZ.LIZ(new C23220ve((Bitmap) iDhS102S0100000_9.l0, null));
        LIZ.LJI(20.0f);
        return LIZ;
    }

    public static final Object apply$24(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        C54789Ler it = (C54789Ler) obj;
        o.LJIIIZ(it, "it");
        return C54789Ler.LIZ(it, (TBW[]) iDhS102S0100000_9.l0);
    }

    public static final Object apply$25(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        C54789Ler it = (C54789Ler) obj;
        o.LJIIIZ(it, "it");
        return C54789Ler.LIZ(it, (TBW[]) iDhS102S0100000_9.l0);
    }

    public static final Object apply$26(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        MG0.LIZJ = true;
        MGJ mgj = (MGJ) iDhS102S0100000_9.l0;
        int i = mgj.LJLILLLLZI;
        String str = mgj.LJLJI;
        Boolean valueOf = Boolean.valueOf(mgj.LJLJJI);
        MusicVipInfoApi.MusicVipInfoOperatorApi musicVipInfoOperatorApi = MusicVipInfoApi.LIZ;
        if (musicVipInfoOperatorApi == null) {
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String str2 = EFJ.LIZJ;
            musicVipInfoOperatorApi = (MusicVipInfoApi.MusicVipInfoOperatorApi) C77800Ug8.LIZIZ(str2, "API_URL_PREFIX_SI", LIZLLL, str2, MusicVipInfoApi.MusicVipInfoOperatorApi.class);
            MusicVipInfoApi.LIZ = musicVipInfoOperatorApi;
        }
        return musicVipInfoOperatorApi.getVipInfo(i, str, valueOf, it, null);
    }

    public static final Object apply$27(IDhS102S0100000_9 iDhS102S0100000_9, Object it) {
        o.LJIIIZ(it, "it");
        return ((DislikeRecommendParams) iDhS102S0100000_9.l0).uid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, java.lang.Object, com.ss.android.ugc.aweme.notice.repo.list.bean.InboxNoticePreviewWindowResponse] */
    public static final Object apply$3(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        ?? it = (InboxNoticePreviewWindowResponse) obj;
        o.LJIIIZ(it, "it");
        ((C68322mC) iDhS102S0100000_9.l0).element = it;
        return C54362LVe.LJIJI(new NoticeList(null, it.getNoticeCounts(), 0L, 0 == true ? 1 : 0, it.getGroups(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 109, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$4(IDhS102S0100000_9 iDhS102S0100000_9, Object it) {
        o.LJIIIZ(it, "it");
        T t = ((C68322mC) iDhS102S0100000_9.l0).element;
        if (t == 0) {
            return new InboxNoticePreviewWindowResponse(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0L, 127, 0 == true ? 1 : 0);
        }
        return t;
    }

    public static final Object apply$5(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) iDhS102S0100000_9.l0;
        awemeListFragmentImpl.getClass();
        AbstractC73672Svk<StoryArchDetailResponse> storyArchDetail = ProfileStoryApi.LIZIZ.getStoryArchDetail();
        awemeListFragmentImpl.LLLIILIL.set(true);
        return storyArchDetail;
    }

    public static final Object apply$6(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        C54789Ler it = (C54789Ler) obj;
        o.LJIIIZ(it, "it");
        return C54789Ler.LIZ(it, (TBW[]) iDhS102S0100000_9.l0);
    }

    public static final Object apply$7(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        C54789Ler it = (C54789Ler) obj;
        o.LJIIIZ(it, "it");
        return C54789Ler.LIZ(it, (TBW[]) iDhS102S0100000_9.l0);
    }

    public static final Object apply$8(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        if (throwable instanceof LW7) {
            C54415LXf c54415LXf = (C54415LXf) iDhS102S0100000_9.l0;
            int i = c54415LXf.LJLIL;
            c54415LXf.LJLIL = i + 1;
            if (i < ((Number) c54415LXf.LJLILLLLZI.getValue()).intValue()) {
                FMX.LJIILL("friends_feed_empty_client_retry", new OSZ(2, "pull_type"), new OSZ(Integer.valueOf(((C54415LXf) iDhS102S0100000_9.l0).LJLIL), "retry_times"));
                return AbstractC73672Svk.LJJLIIIJLJLI(0L, TimeUnit.MILLISECONDS);
            }
        }
        return AbstractC73672Svk.LJJI(throwable);
    }

    public static final Object apply$9(IDhS102S0100000_9 iDhS102S0100000_9, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        if (throwable instanceof LW7) {
            C54416LXg c54416LXg = (C54416LXg) iDhS102S0100000_9.l0;
            int i = c54416LXg.LJLIL;
            c54416LXg.LJLIL = i + 1;
            if (i < ((Number) c54416LXg.LJLILLLLZI.getValue()).intValue()) {
                FMX.LJIILL("friends_feed_empty_client_retry", new OSZ(1, "pull_type"), new OSZ(Integer.valueOf(((C54416LXg) iDhS102S0100000_9.l0).LJLIL), "retry_times"));
                if (!LX1.LJIILIIL) {
                    LX1.LJIIIZ = ((C54416LXg) iDhS102S0100000_9.l0).LJLIL;
                }
                return AbstractC73672Svk.LJJLIIIJLJLI(0L, TimeUnit.MILLISECONDS);
            }
        }
        return AbstractC73672Svk.LJJI(throwable);
    }
}
