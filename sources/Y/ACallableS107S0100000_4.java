package Y;

import X.C10I;
import X.C10K;
import X.C16880lQ;
import X.C186977Vl;
import X.C186997Vn;
import X.C198517qh;
import X.C237519Tv;
import X.C242419fJ;
import X.C39398FdC;
import X.C39579Fg7;
import X.C3GF;
import X.C45804HyK;
import X.C55693LtR;
import X.C61878OQg;
import X.C76800UCe;
import X.C77125UOr;
import X.C78250UnO;
import X.C7DJ;
import X.C82711Wd9;
import X.C95J;
import X.C9NF;
import X.C9OT;
import X.C9T5;
import X.C9XU;
import X.EnumC58085Mqv;
import X.EnumC89753ff;
import X.F30;
import X.HG3;
import X.InterfaceC247459nR;
import X.MBB;
import X.ORZ;
import X.ViewOnClickListenerC250559sR;
import X.XKX;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.core.model.ActivityTask;
import com.bytedance.touchpoint.core.model.AgeGatePopup;
import com.bytedance.touchpoint.core.model.NormalPendant;
import com.bytedance.touchpoint.data.request.INetworkApi;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.profile.api.AwemeApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.tag.api.MentionCheckResult;
import com.ss.android.ugc.aweme.tag.api.MentionCheckSingleTypeResult;
import com.ss.android.ugc.aweme.tag.api.MentionRecentContactResponse;
import com.ss.android.ugc.aweme.tag.api.VideoTagApi;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import defpackage.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ACallableS107S0100000_4 implements Callable {
    public final int $t;
    public Object l0;

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
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return call$16(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        INetworkApi LJFF;
        int i;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null && (LJFF = interfaceC247459nR.LJFF()) != null) {
            Integer num = ((ViewOnClickListenerC250559sR) aCallableS107S0100000_4.l0).LJLJLLL.inAppPushId;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            LJFF.requestOnPopupClick(i, !ViewOnClickListenerC250559sR.LJLLI ? 1 : 0);
        }
        ViewOnClickListenerC250559sR.LJLLI = false;
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        C78250UnO c78250UnO = C78250UnO.LIZ;
        Context context = (Context) aCallableS107S0100000_4.l0;
        c78250UnO.getClass();
        C78250UnO.LIZ(context);
        return C76800UCe.LIZ;
    }

    public static final Object call$10(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        Object LJ;
        LJ = XKX.LJ(MBB.INSTANCE, new C237519Tv((EnumC58085Mqv) aCallableS107S0100000_4.l0, null));
        Collection collection = (Collection) LJ;
        if (collection != null && !collection.isEmpty()) {
            Keva repo = Keva.getRepo("friendslist_permission_keva_name");
            long currentTimeMillis = System.currentTimeMillis();
            SettingsManager.LIZLLL().getClass();
            repo.storeLong("contact_upload_next_time_key", (SettingsManager.LJFF("addressbook_upload_interval", 86400L) * 1000) + currentTimeMillis);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$11(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        INetworkApi LJFF;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null && (LJFF = interfaceC247459nR.LJFF()) != null) {
            ActivityTask activityTask = (ActivityTask) aCallableS107S0100000_4.l0;
            String str = activityTask.notificationId;
            if (str == null) {
                str = "";
            }
            return LJFF.requestOnNotificationAction(str, -1, "", "", -1, Integer.valueOf(activityTask.isAuto ? 1 : 0));
        }
        return null;
    }

    public static final Object call$12(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        INetworkApi LJFF;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null && (LJFF = interfaceC247459nR.LJFF()) != null) {
            return LJFF.confirmAgeGate(((AgeGatePopup) ((ACListenerS39S0200000_4) aCallableS107S0100000_4.l0).l1).buttonLink);
        }
        return null;
    }

    public static final Object call$13(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        String str;
        String str2;
        C39398FdC c39398FdC = C39398FdC.LIZ;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("enter_from", ((C82711Wd9) aCallableS107S0100000_4.l0).LJLJI);
        Aweme aweme = ((C82711Wd9) aCallableS107S0100000_4.l0).LJLZ;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c198517qh.LIZ.put("group_id", str);
        Aweme aweme2 = ((C82711Wd9) aCallableS107S0100000_4.l0).LJLZ;
        if (aweme2 != null) {
            str2 = aweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        c198517qh.LIZ.put("author_id", str2);
        Aweme aweme3 = ((C82711Wd9) aCallableS107S0100000_4.l0).LJLZ;
        if (aweme3 != null) {
            str3 = aweme3.getLogPbString();
        }
        C39398FdC.LIZIZ("video_play_finish", q.LIZJ(c198517qh.LIZ, "log_pb", str3, c198517qh, c39398FdC));
        return C76800UCe.LIZ;
    }

    public static final Object call$14(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        ((C9T5) aCallableS107S0100000_4.l0).LJLIL.get();
        return null;
    }

    public static final Object call$15(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        int i;
        FeedItemList LJ = AwemeApi.LJ(true, ((Aweme) aCallableS107S0100000_4.l0).getAuthorUid(), ((Aweme) aCallableS107S0100000_4.l0).getAuthor().getSecUid(), 0, 0L, 20, "profile_preload", 0, 0, null, new F30(), false, "");
        if (((Aweme) aCallableS107S0100000_4.l0).getAuthorUid() != null) {
            String authorUid = ((Aweme) aCallableS107S0100000_4.l0).getAuthorUid();
            HG3.LJIIL();
            if (TextUtils.equals(authorUid, HG3.LJLJL.LJFF().getCurUserId())) {
                i = 1000;
                C55693LtR.LJIL(LJ, true, 0, i);
                return C76800UCe.LIZ;
            }
        }
        i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        C55693LtR.LJIL(LJ, true, 0, i);
        return C76800UCe.LIZ;
    }

    public static final Object call$16(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        INetworkApi LJFF;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null && (LJFF = interfaceC247459nR.LJFF()) != null) {
            return LJFF.confirmAgeGate(((AgeGatePopup) ((ACListenerS24S0100000_4) aCallableS107S0100000_4.l0).l0).buttonLink);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$2(Y.ACallableS107S0100000_4 r14) {
        /*
            X.9XQ r2 = X.C9XP.LIZ
            java.lang.Object r0 = r14.l0
            com.ss.android.ugc.aweme.feed.prompt.panel.PromptMainPageFragment r0 = (com.ss.android.ugc.aweme.feed.prompt.panel.PromptMainPageFragment) r0
            android.os.Bundle r1 = r0.getArguments()
            r8 = 0
            if (r1 == 0) goto Lf9
            java.lang.String r0 = "event_type"
            java.lang.String r3 = r1.getString(r0)
        L13:
            r2.getClass()
            r4 = 10
            if (r3 != 0) goto L7a
        L1a:
            r3 = r8
        L1b:
            com.ss.android.ugc.aweme.feed.prompt.data.RecommendPromptRequest r2 = new com.ss.android.ugc.aweme.feed.prompt.data.RecommendPromptRequest
            java.lang.Object r0 = r14.l0
            com.ss.android.ugc.aweme.feed.prompt.panel.PromptMainPageFragment r0 = (com.ss.android.ugc.aweme.feed.prompt.panel.PromptMainPageFragment) r0
            android.os.Bundle r1 = r0.getArguments()
            if (r1 == 0) goto L78
            java.lang.String r0 = "current_aweme_id"
            java.lang.String r1 = r1.getString(r0)
        L2d:
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.<init>(r3, r1, r0)
            java.lang.Object r4 = r14.l0
            com.ss.android.ugc.aweme.feed.prompt.panel.PromptMainPageFragment r4 = (com.ss.android.ugc.aweme.feed.prompt.panel.PromptMainPageFragment) r4
            r4.getClass()
            X.9Uh r0 = com.ss.android.ugc.aweme.feed.prompt.api.FeedPromptApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.feed.prompt.api.FeedPromptApi r0 = X.C237639Uh.LIZ()
            X.Svk r1 = r0.getRecommendPrompts(r2)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r1 = r1.LJJL(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r3 = r1.LJJJ(r0)
            r1 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.Syw r3 = r3.LJJLIIIJJI(r1, r0)
            Y.AfS56S0100000_4 r2 = new Y.AfS56S0100000_4
            r0 = 154(0x9a, float:2.16E-43)
            r2.<init>(r4, r0)
            Y.AfS56S0100000_4 r1 = new Y.AfS56S0100000_4
            r0 = 155(0x9b, float:2.17E-43)
            r1.<init>(r4, r0)
            X.3kP r0 = r3.LJJJLIIL(r2, r1)
            X.SrX r0 = (X.C73411SrX) r0
            r4.LJLJJL = r0
            return r8
        L78:
            r1 = r8
            goto L2d
        L7a:
            X.9kR r2 = X.C86918Y9i.LIZJ
            java.lang.String r1 = X.C86918Y9i.LJ
            java.lang.String r0 = "curUserId"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.9XS r0 = r2.LIZIZ(r1, r3)
            if (r0 == 0) goto L1a
            X.9kQ r0 = r0.LIZIZ
            if (r0 == 0) goto L1a
            java.util.ArrayList r1 = r0.LIZIZ(r4)
            if (r1 == 0) goto L1a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9a
            goto L1a
        L9a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r1.iterator()
        La3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r5 = r6.next()
            X.Y9j r5 = (X.C86919Y9j) r5
            com.ss.android.ugc.aweme.feed.prompt.data.InteractionImpression r7 = new com.ss.android.ugc.aweme.feed.prompt.data.InteractionImpression
            r12 = 15
            r9 = r8
            r10 = r8
            r11 = r8
            r13 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = r5.LJLIL
            r7.setGid(r0)
            java.util.List<X.ONP> r1 = r5.LLIIIILZ
            java.util.ArrayList r2 = new java.util.ArrayList
            int r0 = X.C32I.LJJL(r1, r4)
            r2.<init>(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        Ld0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Le8
            java.lang.Object r0 = r1.next()
            X.ONP r0 = (X.ONP) r0
            int r0 = r0.getTYPE()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            goto Ld0
        Le8:
            r7.setActions(r2)
            java.lang.Long r0 = r5.LLI
            r7.setTimestamp(r0)
            java.lang.String r0 = r5.LJLJJLL
            r7.setLogId(r0)
            r3.add(r7)
            goto La3
        Lf9:
            r3 = r8
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS107S0100000_4.call$2(Y.ACallableS107S0100000_4):java.lang.Object");
    }

    public static final Object call$3(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        return Boolean.valueOf(((ArrayList) C9XU.LIZ).add((C9NF) aCallableS107S0100000_4.l0));
    }

    public static final Object call$4(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        INetworkApi LJFF;
        int i;
        NormalPendant normalPendant;
        Integer num;
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR == null || (LJFF = interfaceC247459nR.LJFF()) == null) {
            return null;
        }
        C9OT c9ot = (C9OT) aCallableS107S0100000_4.l0;
        if (c9ot != null && (normalPendant = c9ot.LJLIL) != null && (num = normalPendant.LIZJ) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        C10K<String> requestTouchPointShow = LJFF.requestTouchPointShow(1, i);
        if (requestTouchPointShow == null) {
            return null;
        }
        return requestTouchPointShow.LJ(new C10I() { // from class: X.9iH
            @Override // X.C10I
            public final Object then(C10K c10k) {
                return c10k;
            }
        }, C10K.LJI, null);
    }

    public static final Object call$5(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4((BaseMyProfileGuideWidget) aCallableS107S0100000_4.l0, 1082);
        if (HG3.LJFF().shouldShowEmailPopUp(2, aqS154S0100000_4)) {
            BaseMyProfileGuideWidget baseMyProfileGuideWidget = (BaseMyProfileGuideWidget) aCallableS107S0100000_4.l0;
            baseMyProfileGuideWidget.getClass();
            if (C45804HyK.LJJIFFI(C77125UOr.LIZJ(baseMyProfileGuideWidget)) != null) {
                IBindService LJFF = HG3.LJFF();
                BaseMyProfileGuideWidget baseMyProfileGuideWidget2 = (BaseMyProfileGuideWidget) aCallableS107S0100000_4.l0;
                baseMyProfileGuideWidget2.getClass();
                LJFF.showEmailPopUp(C45804HyK.LJJIFFI(C77125UOr.LIZJ(baseMyProfileGuideWidget2)), 2, aqS154S0100000_4);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        List<IMUser> list;
        long longValue;
        List<IMUser> LJIILLIIL;
        C3GF imUserService = ((IIMService) ((VideoTagFriendsListViewModel) aCallableS107S0100000_4.l0).LJLJL.getValue()).getImUserService();
        if (imUserService != null && (LJIILLIIL = imUserService.LJIILLIIL()) != null) {
            VideoTagFriendsListViewModel videoTagFriendsListViewModel = (VideoTagFriendsListViewModel) aCallableS107S0100000_4.l0;
            ArrayList arrayList = new ArrayList();
            for (IMUser iMUser : LJIILLIIL) {
                if (!o.LJ(iMUser.getUid(), videoTagFriendsListViewModel.LJLJJL.getUid())) {
                    arrayList.add(iMUser);
                }
            }
            list = ORZ.LLJILJILJ(arrayList);
        } else {
            list = C61878OQg.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        try {
            VideoTagApi.LIZ.getClass();
            MentionRecentContactResponse mentionRecentContactResponse = C7DJ.LIZ().mentionRecentContactQuery(EnumC89753ff.VIDEO_TAG.getType(), 0L, false).execute().LIZIZ;
            o.LJIIIIZZ(mentionRecentContactResponse, "create().mentionRecentCo…  false).execute().body()");
            MentionRecentContactResponse mentionRecentContactResponse2 = mentionRecentContactResponse;
            HashMap hashMap = new HashMap();
            ArrayList<MentionCheckResult> arrayList3 = mentionRecentContactResponse2.blockResults;
            if (arrayList3 != null) {
                Iterator<MentionCheckResult> it = arrayList3.iterator();
                while (it.hasNext()) {
                    MentionCheckResult next = it.next();
                    ArrayList<MentionCheckSingleTypeResult> tagUpdateStatus = next.getTagUpdateStatus();
                    if (tagUpdateStatus != null) {
                        Iterator<MentionCheckSingleTypeResult> it2 = tagUpdateStatus.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().getMentionType() == EnumC89753ff.VIDEO_TAG.getType()) {
                                hashMap.put(String.valueOf(next.getUid()), Long.valueOf(r9.getBlockType()));
                            }
                        }
                    }
                }
            }
            ArrayList<User> arrayList4 = mentionRecentContactResponse2.userList;
            if (arrayList4 != null) {
                Iterator<User> it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    User next2 = it3.next();
                    if (arrayList2.size() < 10) {
                        IMUser fromUser = IMUser.fromUser(next2);
                        Long l = (Long) hashMap.get(fromUser.getUid());
                        if (l == null) {
                            longValue = 0;
                        } else {
                            longValue = l.longValue();
                        }
                        fromUser.setVideoTagBlockStatus(longValue);
                        arrayList2.add(fromUser);
                    }
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (arrayList2.size() < 10) {
            List<IMUser> LJIILIIL = ((IIMService) ((VideoTagFriendsListViewModel) aCallableS107S0100000_4.l0).LJLJL.getValue()).getImUserService().LJIILIIL();
            VideoTagFriendsListViewModel videoTagFriendsListViewModel2 = (VideoTagFriendsListViewModel) aCallableS107S0100000_4.l0;
            for (IMUser iMUser2 : LJIILIIL) {
                if (arrayList2.size() < 10 && !arrayList2.contains(iMUser2) && !o.LJ(iMUser2.getUid(), videoTagFriendsListViewModel2.LJLJJL.getUid())) {
                    arrayList2.add(iMUser2);
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        for (IMUser iMUser3 : list) {
            if (!arrayList2.contains(iMUser3)) {
                if (iMUser3.getFollowStatus() == 2) {
                    arrayList5.add(iMUser3);
                } else {
                    arrayList6.add(iMUser3);
                }
            }
        }
        if (C186997Vn.LIZJ()) {
            List<? extends IMUser> list2 = C186977Vl.LIZ;
            for (IMUser iMUser4 : list2) {
                if (arrayList2.contains(iMUser4)) {
                    arrayList2.remove(iMUser4);
                } else if (arrayList5.contains(iMUser4)) {
                    arrayList5.remove(iMUser4);
                } else if (arrayList6.contains(iMUser4)) {
                    arrayList6.remove(iMUser4);
                }
            }
            arrayList2.addAll(0, list2);
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList2);
        arrayList7.addAll(arrayList5);
        arrayList7.addAll(arrayList6);
        ((VideoTagFriendsListViewModel) aCallableS107S0100000_4.l0).LJLLL = new C242419fJ(arrayList2, arrayList5, arrayList6, arrayList7);
        return ((VideoTagFriendsListViewModel) aCallableS107S0100000_4.l0).LJLLL;
    }

    public static final Object call$7(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        Object[] objArr = (Object[]) aCallableS107S0100000_4.l0;
        return PushSettingsApiManager.LIZJ(((Long) objArr[0]).longValue(), ((Long) objArr[1]).longValue(), (String) objArr[2], (String) objArr[3], (String) objArr[4]);
    }

    public static final Object call$8(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        if (C39579Fg7.LIZIZ(((AwemeDraft) aCallableS107S0100000_4.l0).LJII())) {
            C16880lQ.LLLZZIL(new File(((AwemeDraft) aCallableS107S0100000_4.l0).LJII()));
            return null;
        }
        return null;
    }

    public static final Object call$9(ACallableS107S0100000_4 aCallableS107S0100000_4) {
        if (HG3.LJFF().shouldShowEmailPopUp(1, null)) {
            HG3.LJFF().showEmailPopUp(((InboxFragment) aCallableS107S0100000_4.l0).mo49getActivity(), 1, null);
        }
        return C76800UCe.LIZ;
    }

    public ACallableS107S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
