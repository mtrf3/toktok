package com.ss.android.ugc.aweme.upvote.service;

import X.ASL;
import X.AV1;
import X.AbstractC73547Stj;
import X.ActivityC45651qj;
import X.AnonymousClass780;
import X.C113554cx;
import X.C181627Aw;
import X.C184077Kh;
import X.C1DH;
import X.C1FP;
import X.C214378bB;
import X.C214528bQ;
import X.C26227ARb;
import X.C3AW;
import X.C40328FsC;
import X.C48203Ivv;
import X.C58096Mr6;
import X.C65352Pkq;
import X.C71W;
import X.C76082yi;
import X.C76800UCe;
import X.C777133f;
import X.C78926UyI;
import X.C7H2;
import X.C7HD;
import X.C7HG;
import X.C7HH;
import X.C7HJ;
import X.C7HL;
import X.C7HM;
import X.C7HR;
import X.C7HV;
import X.C7IK;
import X.C7JX;
import X.C7KB;
import X.C86V;
import X.FMX;
import X.HG3;
import X.InterfaceC109364Qy;
import X.InterfaceC174526t6;
import X.InterfaceC175126u4;
import X.InterfaceC175156u7;
import X.InterfaceC200517tv;
import X.InterfaceC200587u2;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.OSZ;
import X.RBX;
import X.T16;
import X.UC0;
import X.V0N;
import X.V0P;
import Y.ACallableS13S0310000_3;
import Y.ARunnableS39S0100000_3;
import Y.IDDListenerS101S0200000_3;
import android.app.Activity;
import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.upvote.detail.repostlist.RepostProfileListFragment;
import com.ss.android.ugc.aweme.upvote.dispatcher.UpvoteEventObservable;
import com.ss.android.ugc.aweme.upvote.dispatcher.UpvoteEventObservableFixMemoryLeak;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.aweme.upvote.publish.panel.UpvoteNewbieGuideFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS17S1400000_3;
import kotlin.jvm.internal.AqS37S1300000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UpvoteServiceImpl implements IUpvoteService {
    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final int LJIIJ(int i, int i2) {
        return i2;
    }

    public static IUpvoteService LJJIFFI() {
        Object LIZ = C58096Mr6.LIZ(IUpvoteService.class, false);
        if (LIZ != null) {
            return (IUpvoteService) LIZ;
        }
        if (C58096Mr6.P7 == null) {
            synchronized (IUpvoteService.class) {
                if (C58096Mr6.P7 == null) {
                    C58096Mr6.P7 = new UpvoteServiceImpl();
                }
            }
        }
        return C58096Mr6.P7;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final ProfileListFragment LIZIZ() {
        return new RepostProfileListFragment();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void clearCache() {
        ((ConcurrentHashMap) C7H2.LIZ.getValue()).clear();
        C7H2.LIZIZ().evictAll();
        ((HashSet) C7H2.LJFF.getValue()).clear();
        ((ArrayList) C7H2.LIZIZ.getValue()).clear();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIILL() {
        List LIZIZ = C76082yi.LIZIZ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : LIZIZ) {
            String str = (String) obj;
            if (((Boolean) C777133f.LIZ.getValue()).booleanValue()) {
                Double d = (Double) C76082yi.LIZJ().get(str);
                if (d != null) {
                    if (C7H2.LIZ(str) == null && d.doubleValue() < 3.0d) {
                        arrayList.add(obj);
                    }
                } else if (C7H2.LIZ(str) == null) {
                    arrayList.add(obj);
                }
            } else if (C7H2.LIZ(str) == null) {
                arrayList.add(obj);
            }
        }
        C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(arrayList, 226));
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC109364Qy LIZLLL() {
        return new InterfaceC109364Qy() { // from class: X.7H9
            @Override // X.InterfaceC109364Qy
            public final int LIZIZ() {
                return R.drawable.dec;
            }

            @Override // X.InterfaceC109364Qy
            public final int LJ() {
                return 2;
            }

            @Override // X.InterfaceC109364Qy
            public final void LJFF() {
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                C62822Ol8 c62822Ol8 = C7HA.LIZ;
                Keva keva = (Keva) c62822Ol8.getValue();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("has_upvote_bounce_shown_");
                LIZ2.append(curUserId);
                keva.storeBoolean(X1D.LIZIZ(LIZ2), true);
                ((Keva) c62822Ol8.getValue()).storeLong(i0.LJFF("upvote_bounce_show_time_", curUserId), Calendar.getInstance().getTimeInMillis());
            }

            @Override // X.InterfaceC109364Qy
            public final String LJIIIIZZ() {
                return "upvote_repost_guide.json";
            }

            @Override // X.InterfaceC109364Qy
            public final int LIZLLL() {
                return C7HV.LIZIZ.LJIIJ(R.string.ptm, R.string.q2l);
            }

            @Override // X.InterfaceC109364Qy
            public final int LJI() {
                return C7HV.LIZIZ.LJIIJ(R.string.ptn, R.string.q2m);
            }

            @Override // X.InterfaceC109364Qy
            public final boolean LJIILIIL() {
                Keva keva = (Keva) C7HA.LIZ.getValue();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("has_upvote_bounce_shown_");
                return C268713r.LIZIZ((RBX) HG3.LJIILL(), LIZ2, LIZ2, keva, false);
            }

            @Override // X.InterfaceC109364Qy
            public final boolean LIZ(Aweme aweme) {
                boolean z;
                boolean z2;
                if (aweme == null || !((RBX) HG3.LJIILL()).isLogin()) {
                    return false;
                }
                if (C7HX.LIZ() || ((Number) C183387Hq.LIZ.getValue()).intValue() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                InteractPermission interactPermission = aweme.getInteractPermission();
                if (interactPermission != null && interactPermission.getUpvote() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean LJJI = C54838Lfe.LJJI(aweme);
                HG3.LJIIL();
                boolean z3 = !o.LJ(aweme.getAuthorUid(), HG3.LJLJL.LJFF().getCurUserId());
                boolean isAd = aweme.isAd();
                boolean isSubOnlyVideo = aweme.isSubOnlyVideo();
                if (!z || !z2 || LJJI || !z3 || isAd || isSubOnlyVideo) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC109364Qy
            public final void LJII(String str) {
                C775832s.LIZIZ = new OSZ<>(str, Long.valueOf(SystemClock.elapsedRealtime()));
            }

            @Override // X.InterfaceC109364Qy
            public final int LJIIIZ(String str) {
                List<UpvoteStruct> list;
                Object obj;
                UpvoteList LJIIIZ = C7HV.LIZIZ.LJIIIZ(str);
                if (LJIIIZ == null || (list = LJIIIZ.getUpvotes()) == null) {
                    list = C61878OQg.INSTANCE;
                }
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                Iterator<UpvoteStruct> it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    UpvoteStruct next = it.next();
                    User user = next.getUser();
                    if (user != null) {
                        obj = user.getUid();
                    }
                    if (o.LJ(obj, curUserId)) {
                        obj = next;
                        break;
                    }
                }
                UpvoteStruct upvoteStruct = (UpvoteStruct) obj;
                if (upvoteStruct == null) {
                    return 0;
                }
                if (upvoteStruct.getCacheState() == UpvoteCacheState.PRE_PUBLISH) {
                    return 1;
                }
                if (upvoteStruct.getCacheState() == UpvoteCacheState.PRE_REMOVE) {
                    return 3;
                }
                return 2;
            }

            @Override // X.InterfaceC109364Qy
            public final void LJIIJJI(String str) {
                C775832s.LIZ = new OSZ<>(str, Long.valueOf(SystemClock.elapsedRealtime()));
            }

            @Override // X.InterfaceC109364Qy
            public final void LIZJ(String str, String str2) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (o.LJ(C775832s.LIZ.getFirst(), str)) {
                    C775832s.LIZ(elapsedRealtime - C775832s.LIZ.getSecond().longValue(), str, str2, "long_press");
                    C775832s.LIZ = new OSZ<>("", -1L);
                }
            }

            @Override // X.InterfaceC109364Qy
            public final void LJIIJ(String str, String str2) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (o.LJ(C775832s.LIZIZ.getFirst(), str)) {
                    C775832s.LIZ(elapsedRealtime - C775832s.LIZIZ.getSecond().longValue(), str, str2, "share_panel");
                    C775832s.LIZIZ = new OSZ<>("", -1L);
                }
            }

            @Override // X.InterfaceC109364Qy
            public final void LJIIL(String str, UpvotePublishMobParam upvotePublishMobParam, AqS167S0100000_1 aqS167S0100000_1) {
                List<UpvoteStruct> upvotes;
                boolean z;
                String str2;
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                UpvoteList LJIIIZ = C7HV.LIZIZ.LJIIIZ(str);
                UpvoteStruct upvoteStruct = null;
                if (LJIIIZ != null && (upvotes = LJIIIZ.getUpvotes()) != null) {
                    Iterator<UpvoteStruct> it = upvotes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        UpvoteStruct next = it.next();
                        User user = next.getUser();
                        if (user != null) {
                            str2 = user.getUid();
                        } else {
                            str2 = null;
                        }
                        if (o.LJ(str2, curUserId)) {
                            upvoteStruct = next;
                            break;
                        }
                    }
                    UpvoteStruct upvoteStruct2 = upvoteStruct;
                    if (upvoteStruct2 != null) {
                        upvotePublishMobParam.enterMethod = "button";
                        String text = upvoteStruct2.getText();
                        if (text == null || text.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C113294cX.LIZIZ(C7HV.LIZIZ, str, !z, upvotePublishMobParam, false, new AqS153S0100000_3(aqS167S0100000_1, 9), 8);
                        return;
                    }
                }
                upvotePublishMobParam.enterMethod = "share_panel";
                C113294cX.LIZ(C7HV.LIZIZ, str, upvotePublishMobParam, null, null, null, false, new AqS153S0100000_3(aqS167S0100000_1, 10), null, false, 444);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC200517tv LJIIIIZZ() {
        return new InterfaceC200517tv() { // from class: X.7HE
            @Override // X.InterfaceC200517tv
            public final void LIZ() {
                C7IK.LIZJ().storeBoolean(C7IK.LIZ("upvote_toast_when_digg_video_"), true);
            }

            @Override // X.InterfaceC200517tv
            public final boolean LIZIZ() {
                return C7IK.LIZJ().getBoolean(C7IK.LIZ("upvote_toast_when_digg_video_"), false);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC175126u4 LJIILJJIL() {
        return new InterfaceC175126u4() { // from class: X.7Gt
            @Override // X.InterfaceC175126u4
            public final void LIZ(String str) {
                ActivityC45651qj activityC45651qj;
                if (str == null) {
                    return;
                }
                Activity topActivity = ActivityStack.getTopActivity();
                if (!(topActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) topActivity) == null) {
                    return;
                }
                C7H1.LJIILJJIL(str, UpvoteCacheState.PUBLISH_FAILED);
                ((UpvotePublishVM) new C214378bB(C65352Pkq.LIZ(UpvotePublishVM.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, C183207Gy.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj)).getValue()).gv0(2, null, str);
            }

            @Override // X.InterfaceC175126u4
            public final boolean LIZIZ(UpvoteStruct upvoteStruct) {
                if (!C1FP.LJII(upvoteStruct)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC175126u4
            public final boolean LJIIIZ(Throwable th) {
                return C1FP.LJIIZILJ(th);
            }

            @Override // X.InterfaceC175126u4
            public final void LIZLLL(String str, UpvoteStruct upvoteStruct) {
                ActivityC45651qj activityC45651qj;
                if (str == null) {
                    return;
                }
                Activity topActivity = ActivityStack.getTopActivity();
                if (!(topActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) topActivity) == null) {
                    return;
                }
                C7H1.LJII(str, upvoteStruct);
                ((UpvotePublishVM) new C214378bB(C65352Pkq.LIZ(UpvotePublishVM.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, C183187Gw.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj)).getValue()).gv0(1, null, str);
            }

            @Override // X.InterfaceC175126u4
            public final void LJ(String str, EnumC177746yI removeReason) {
                ActivityC45651qj activityC45651qj;
                UpvoteStruct LJIIIIZZ;
                int i;
                o.LJIIIZ(removeReason, "removeReason");
                if (str == null) {
                    return;
                }
                Activity topActivity = ActivityStack.getTopActivity();
                if (!(topActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) topActivity) == null) {
                    return;
                }
                C7H1.LIZ(str);
                UpvoteList LJIIIZ = C7HV.LIZIZ.LJIIIZ(str);
                if (LJIIIZ == null || (LJIIIIZZ = C1FP.LJIIIIZZ(LJIIIZ)) == null) {
                    return;
                }
                UpvoteCacheState cacheState = LJIIIIZZ.getCacheState();
                if (cacheState == null) {
                    i = -1;
                } else {
                    i = C181607Au.LIZ[cacheState.ordinal()];
                }
                int i2 = 1;
                if (i != 1) {
                    if (i == 2) {
                        i2 = 2;
                    }
                } else {
                    i2 = 0;
                }
                ((UpvotePublishVM) new C214378bB(C65352Pkq.LIZ(UpvotePublishVM.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, C183167Gu.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj)).getValue()).gv0(i2, LJIIIIZZ, str);
            }

            @Override // X.InterfaceC175126u4
            public final void LJI(String aid, UpvoteList upvoteList) {
                o.LJIIIZ(aid, "aid");
                C7H1.LJIIIIZZ(aid, upvoteList, true, 20);
            }

            @Override // X.InterfaceC175126u4
            public final void LJII(String str, EnumC177746yI removeReason) {
                ActivityC45651qj activityC45651qj;
                UpvoteList LJIIIZ;
                UpvoteStruct LJIIIIZZ;
                o.LJIIIZ(removeReason, "removeReason");
                if (str == null) {
                    return;
                }
                Activity topActivity = ActivityStack.getTopActivity();
                if (!(topActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) topActivity) == null || (LJIIIZ = C7HV.LIZIZ.LJIIIZ(str)) == null || (LJIIIIZZ = C1FP.LJIIIIZZ(LJIIIZ)) == null) {
                    return;
                }
                if (removeReason == EnumC177746yI.PERMISSION_DENIED) {
                    C40328FsC.LIZLLL(activityC45651qj, R.string.q3e);
                }
                C7H1.LJFF(str);
                ((UpvotePublishVM) new C214378bB(C65352Pkq.LIZ(UpvotePublishVM.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, C183177Gv.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj)).getValue()).gv0(3, LJIIIIZZ, str);
            }

            @Override // X.InterfaceC175126u4
            public final void LJIIIIZZ(String str, UpvoteList upvoteList, boolean z, int i) {
                o.LJIIIZ(upvoteList, "upvoteList");
                if (str == null) {
                    str = "";
                }
                C7H1.LJIIIIZZ(str, upvoteList, z, i);
            }

            @Override // X.InterfaceC175126u4
            public final void LIZJ(String str, long j, String insertId, String str2, C7H0 c7h0) {
                UpvoteReason upvoteReason;
                C7KB c7kb;
                o.LJIIIZ(insertId, "insertId");
                if (insertId.length() == 0) {
                    upvoteReason = C7H2.LIZJ(str);
                } else {
                    upvoteReason = null;
                }
                if (o.LJ(str2, "homepage_hot")) {
                    c7kb = C7KB.FOR_YOU_FEED;
                } else {
                    c7kb = C7KB.OTHERS;
                }
                C7H1.LIZJ(str, upvoteReason, j, insertId, c7kb, c7h0);
            }

            @Override // X.InterfaceC175126u4
            public final void LJFF(String str, String str2, boolean z, List list, List list2) {
                ActivityC45651qj activityC45651qj;
                if (str == null) {
                    return;
                }
                Activity topActivity = ActivityStack.getTopActivity();
                if (!(topActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) topActivity) == null) {
                    return;
                }
                C7H1.LJI(str, str2, z, list, list2);
                ((UpvotePublishVM) new C214378bB(C65352Pkq.LIZ(UpvotePublishVM.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, C183217Gz.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj)).getValue()).gv0(0, null, str);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC200587u2 LJIJ() {
        return C7JX.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final C71W LJIJI() {
        return new C71W() { // from class: X.7HN
            @Override // X.C71W
            public final boolean LIZ(Aweme aweme) {
                if (aweme == null || !C7HO.LIZIZ(aweme) || !C7HO.LIZ(aweme)) {
                    return false;
                }
                return true;
            }

            @Override // X.C71W
            public final boolean LIZIZ(String str) {
                boolean z;
                boolean LIZ2 = C7HX.LIZ();
                if (!C7HX.LIZ() && ORZ.LJLJJI(str, C47261Igj.LJJIJIIJI("homepage_hot", "notification_page"))) {
                    z = true;
                } else {
                    z = false;
                }
                if (!LIZ2 && !z) {
                    return false;
                }
                return true;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC175156u7 LJIL() {
        return C7HM.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final UpvoteReason LIZ(String str) {
        return C7H2.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJFF(String aid) {
        List<UpvoteStruct> upvotes;
        o.LJIIIZ(aid, "aid");
        UpvoteList LIZ = C7H2.LIZ(aid);
        if (LIZ == null || (upvotes = LIZ.getUpvotes()) == null || upvotes.isEmpty()) {
            return false;
        }
        Iterator<UpvoteStruct> it = upvotes.iterator();
        while (it.hasNext()) {
            if (AV1.LJIJ(it.next().getUser())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJI(Aweme aweme) {
        String str;
        if (!C7HV.LIZIZ.LIZLLL().LIZ(aweme)) {
            return false;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        UpvoteList LIZ = C7H2.LIZ(aid);
        if (LIZ == null || LIZ.getUpvotes().isEmpty()) {
            return false;
        }
        for (UpvoteStruct upvoteStruct : LIZ.getUpvotes()) {
            IAccountUserService LJIILL = HG3.LJIILL();
            User user = upvoteStruct.getUser();
            if (user == null || (str = user.getUid()) == null) {
                str = "";
            }
            if (((RBX) LJIILL).isMe(str)) {
                return false;
            }
        }
        C7HV c7hv = C7HV.LIZIZ;
        String aid2 = aweme.getAid();
        o.LJIIIIZZ(aid2, "aweme.aid");
        if (c7hv.LIZ.LJIIJJI(aid2)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<C181627Aw> LJII(ActivityC45651qj activityC45651qj) {
        return new C214378bB(C65352Pkq.LIZ(UpvotePublishVM.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, C7HD.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj)).getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final UpvoteList LJIIIZ(String aid) {
        o.LJIIIZ(aid, "aid");
        return C7H2.LIZ(aid);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJIIJJI(String str) {
        return C7HH.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final String LJIIZILJ(String str) {
        return AnonymousClass780.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC174526t6 LJIJJ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner == null) {
            return null;
        }
        if (((Boolean) C7HJ.LIZ.getValue()).booleanValue()) {
            int hashCode = lifecycleOwner.hashCode();
            Map<Integer, InterfaceC174526t6> map = UpvoteEventObservableFixMemoryLeak.LJLJI;
            InterfaceC174526t6 interfaceC174526t6 = (InterfaceC174526t6) ((LinkedHashMap) map).get(Integer.valueOf(hashCode));
            if (interfaceC174526t6 == null) {
                UpvoteEventObservableFixMemoryLeak upvoteEventObservableFixMemoryLeak = new UpvoteEventObservableFixMemoryLeak(new WeakReference(lifecycleOwner));
                map.put(Integer.valueOf(hashCode), upvoteEventObservableFixMemoryLeak);
                return upvoteEventObservableFixMemoryLeak;
            }
            return interfaceC174526t6;
        }
        int hashCode2 = lifecycleOwner.hashCode();
        Map<Integer, InterfaceC174526t6> map2 = UpvoteEventObservable.LJLJI;
        InterfaceC174526t6 interfaceC174526t62 = (InterfaceC174526t6) ((LinkedHashMap) map2).get(Integer.valueOf(hashCode2));
        if (interfaceC174526t62 == null) {
            UpvoteEventObservable upvoteEventObservable = new UpvoteEventObservable(lifecycleOwner);
            map2.put(Integer.valueOf(hashCode2), upvoteEventObservable);
            return upvoteEventObservable;
        }
        return interfaceC174526t62;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final Long LJIJJLI(String aid) {
        o.LJIIIZ(aid, "aid");
        return (Long) ((LinkedHashMap) C7H2.LIZJ).get(aid);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LIZJ(List<? extends Aweme> awemes, C7KB c7kb) {
        o.LJIIIZ(awemes, "awemes");
        AbstractC73547Stj.LJI(new ACallableS13S0310000_3(ORZ.LLJI(awemes), c7kb, 1)).LJIILIIL(T16.LIZ()).LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJ(String aid, String str) {
        o.LJIIIZ(aid, "aid");
        C7H2.LIZLLL.put(aid, str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIILIIL(Aweme aweme, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(aweme, "aweme");
        C7HL.LIZLLL(enterFrom, "normal", aweme, "comment_list", null, false);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJI(UpvoteList upvoteList, UpvoteList upvoteList2) {
        String str;
        UpvoteStruct LJIIIIZZ;
        if (upvoteList == null) {
            return;
        }
        UpvoteStruct LJIIIIZZ2 = C1FP.LJIIIIZZ(upvoteList);
        UpvoteStruct LJIIIIZZ3 = C1FP.LJIIIIZZ(upvoteList2);
        if (LJIIIIZZ2 != null || LJIIIIZZ3 == null) {
            return;
        }
        OSZ[] oszArr = new OSZ[1];
        if (LJIIIIZZ3.getMyNewUpvote() || ((LJIIIIZZ = C1FP.LJIIIIZZ(upvoteList2)) != null && LJIIIIZZ.isFake())) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[0] = new OSZ(str, "my_new_repost");
        FMX.LJIILL("comment_remove_my_upvote", oszArr);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJ(List list, Map map, C7KB c7kb) {
        AbstractC73547Stj.LJI(new ACallableS13S0310000_3(ORZ.LLJI(list), map, c7kb, 2)).LJIILIIL(T16.LIZ()).LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIILLIIL(String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ActivityC45651qj activityC45651qj;
        String str2;
        Activity topActivity = ActivityStack.getTopActivity();
        if (!(topActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) topActivity) == null) {
            return;
        }
        OSZ[] oszArr = new OSZ[7];
        oszArr[0] = new OSZ("enter_from", upvotePublishMobParam.enterFrom);
        oszArr[1] = new OSZ("group_id", upvotePublishMobParam.groupId);
        oszArr[2] = new OSZ("author_id", upvotePublishMobParam.authorId);
        oszArr[3] = new OSZ("follow_status", upvotePublishMobParam.followStatus);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[4] = new OSZ("with_recommendation", str2);
        oszArr[5] = new OSZ("enter_method", upvotePublishMobParam.enterMethod);
        oszArr[6] = new OSZ("panel_source", upvotePublishMobParam.panelSource);
        Map LJJL = C113554cx.LJJL(oszArr);
        FMX.LJIIL("recommend_cancel", LJJL);
        AqS17S1400000_3 aqS17S1400000_3 = new AqS17S1400000_3(activityC45651qj, (ActivityC45651qj) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) str, (String) upvotePublishMobParam, (UpvotePublishMobParam) LJJL, (Map<String, String>) 1);
        if (z && !z2) {
            Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", upvotePublishMobParam.enterFrom), new OSZ("pop_up_type", "cancel_status"));
            FMX.LJIIL("show_discard_pop_up", LJJLIIIIJ);
            String LJFF = C86V.LJFF(R.string.q38);
            String LJFF2 = C86V.LJFF(R.string.pu5);
            C26227ARb LIZ = C3AW.LIZ(activityC45651qj);
            LIZ.LJFF(LJFF);
            LIZ.LIZIZ(LJFF2);
            UC0.LIZJ(LIZ, new AqS132S0200000_1(LJJLIIIIJ, aqS17S1400000_3, 104));
            LIZ.LJI().LIZLLL();
            return;
        }
        aqS17S1400000_3.invoke();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIIL(String itemId, UpvotePublishMobParam mobParam, String str, List<? extends TextExtraStruct> list, List<CommentImageModel> list2, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Integer num, boolean z2) {
        boolean z3;
        ActivityC45651qj activityC45651qj;
        String str2;
        ActivityC45651qj activityC45651qj2;
        String str3;
        String str4;
        o.LJIIIZ(itemId, "itemId");
        o.LJIIIZ(mobParam, "mobParam");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        if (str == null || str.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        String str5 = "1";
        if (z3 && (list2 == null || list2.isEmpty())) {
            Activity topActivity = ActivityStack.getTopActivity();
            if (!(topActivity instanceof ActivityC45651qj) || (activityC45651qj2 = (ActivityC45651qj) topActivity) == null) {
                return;
            }
            if (!C48203Ivv.LJ(activityC45651qj2)) {
                C40328FsC.LIZLLL(activityC45651qj2, R.string.dtf);
                return;
            }
            if (o.LJ(mobParam.enterMethod, "share_panel")) {
                C7IK.LJI(C7IK.LIZLLL() + 1);
            }
            V0P LJJIIZI = V0N.LJJIIZI(itemId);
            boolean z4 = C7IK.LIZJ().getBoolean(C7IK.LIZ("has_displayed_comment_panel_"), false);
            if (!z4) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            mobParam.isFirst = str3;
            if (LJJIIZI.LJLIL) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            mobParam.isRecommend = str4;
            String valueOf = String.valueOf(LJJIIZI.LJLILLLLZI);
            o.LJIIIZ(valueOf, "<set-?>");
            mobParam.recommendCount = valueOf;
            Map LJJL = C113554cx.LJJL(new OSZ("enter_from", mobParam.enterFrom), new OSZ("enter_method", mobParam.enterMethod), new OSZ("group_id", mobParam.groupId), new OSZ("author_id", mobParam.authorId));
            Map LJJLIL = C113554cx.LJJLIL(LJJL);
            LJJLIL.put("follow_status", mobParam.followStatus);
            LJJLIL.put("is_first", mobParam.isFirst);
            LJJLIL.put("is_recommend", mobParam.isRecommend);
            LJJLIL.put("recommend_cnt", mobParam.recommendCount);
            LJJLIL.put("panel_source", mobParam.panelSource);
            if (!mobParam.isAiDecision) {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            LJJLIL.put("clientAI", str5);
            LJJLIL.put("trace_id", mobParam.traceId);
            LJJLIL.put("trigger", mobParam.trigger);
            FMX.LJIIL("recommend", LJJLIL);
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            AqS37S1300000_3 aqS37S1300000_3 = new AqS37S1300000_3(activityC45651qj2, itemId, num, mobParam, 4);
            if (!z4) {
                FMX.LJIIL("recommend_guide_pop_up_show", LJJL);
                ASL asl = new ASL();
                UpvoteNewbieGuideFragment upvoteNewbieGuideFragment = new UpvoteNewbieGuideFragment();
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJLLILLLL = upvoteNewbieGuideFragment;
                tuxSheet.LJLILLLLZI = new IDDListenerS101S0200000_3(LJJL, aqS37S1300000_3, 2);
                tuxSheet.LJZI = false;
                FragmentManager supportFragmentManager = activityC45651qj2.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
                tuxSheet.show(supportFragmentManager, "UpvoteNewbieGuideFragment");
                C7IK.LIZJ().storeBoolean(C7IK.LIZ("has_displayed_comment_panel_"), true);
                if (!C7HR.LIZ()) {
                    return;
                }
                C7IK.LIZJ().storeBoolean(C7IK.LIZ("has_show_repost_public_tips_"), true);
                return;
            }
            aqS37S1300000_3.invoke();
            return;
        }
        Activity topActivity2 = ActivityStack.getTopActivity();
        if (!(topActivity2 instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) topActivity2) == null) {
            return;
        }
        V0P LJJIIZI2 = V0N.LJJIIZI(itemId);
        if (!C7IK.LIZJ().getBoolean(C7IK.LIZ("has_displayed_comment_panel_"), false)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        mobParam.isFirst = str2;
        if (!LJJIIZI2.LJLIL) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        mobParam.isRecommend = str5;
        String valueOf2 = String.valueOf(LJJIIZI2.LJLILLLLZI);
        o.LJIIIZ(valueOf2, "<set-?>");
        mobParam.recommendCount = valueOf2;
        if (o.LJ(mobParam.enterMethod, "post_comment")) {
            C7IK.LJI(C7IK.LIZLLL() + 1);
        }
        if (!o.LJ(mobParam.enterMethod, "click_repost_button") && !z2) {
            FMX.LJIIL("recommend", C113554cx.LJJL(new OSZ("enter_from", mobParam.enterFrom), new OSZ("enter_method", mobParam.enterMethod), new OSZ("group_id", mobParam.groupId), new OSZ("author_id", mobParam.authorId), new OSZ("follow_status", mobParam.followStatus), new OSZ("is_first", mobParam.isFirst), new OSZ("is_recommend", mobParam.isRecommend), new OSZ("recommend_cnt", mobParam.recommendCount), new OSZ("panel_source", mobParam.panelSource), new OSZ("trigger", mobParam.trigger)));
        }
        C214378bB c214378bB = new C214378bB(C65352Pkq.LIZ(UpvotePublishVM.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C184077Kh.LJLIL, C7HG.INSTANCE, C78926UyI.LJIIJJI(activityC45651qj), C78926UyI.LJIILL(activityC45651qj));
        String str6 = "";
        if (z) {
            UpvotePublishVM upvotePublishVM = (UpvotePublishVM) c214378bB.getValue();
            if (str != null) {
                str6 = str;
            }
            upvotePublishVM.nv0(itemId, str6, mobParam, list, list2);
            return;
        }
        UpvotePublishVM upvotePublishVM2 = (UpvotePublishVM) c214378bB.getValue();
        if (str != null) {
            str6 = str;
        }
        upvotePublishVM2.ov0(itemId, str6, mobParam, list, list2, z2);
    }
}
