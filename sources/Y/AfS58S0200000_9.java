package Y;

import X.A2F;
import X.A2G;
import X.A2H;
import X.A2V;
import X.AYX;
import X.AnonymousClass349;
import X.BPL;
import X.C00F;
import X.C221018lt;
import X.C35794E3a;
import X.C36922EeM;
import X.C38306F1q;
import X.C38333F2r;
import X.C38891fp;
import X.C3C5;
import X.C46728IVo;
import X.C47261Igj;
import X.C52489Kir;
import X.C53578L1a;
import X.C54015LHv;
import X.C54316LTk;
import X.C54595Lbj;
import X.C54884LgO;
import X.C55478Lpy;
import X.C55480Lq0;
import X.C55674Lt8;
import X.C56575MIh;
import X.C56579MIl;
import X.C56686MMo;
import X.C56707MNj;
import X.C56745MOv;
import X.C56757MPh;
import X.C56760MPk;
import X.C56805MRd;
import X.C56962MXe;
import X.C57266Mdi;
import X.C57267Mdj;
import X.C57270Mdm;
import X.C57391Mfj;
import X.C58049MqL;
import X.C58053MqP;
import X.C58055MqR;
import X.C61878OQg;
import X.C68322mC;
import X.C77157UPx;
import X.C84754XOc;
import X.C85429Xft;
import X.C85433Xfx;
import X.C86478Xwo;
import X.EnumC36206EIw;
import X.EnumC56806MRe;
import X.EnumC58006Mpe;
import X.EnumC58046MqI;
import X.EnumC77154UPu;
import X.HG3;
import X.HH1;
import X.ILE;
import X.InterfaceC57784Mm4;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC73573Su9;
import X.KQA;
import X.LJ6;
import X.LSJ;
import X.LW7;
import X.LWX;
import X.LX1;
import X.M89;
import X.M8G;
import X.MG8;
import X.MLW;
import X.MO3;
import X.MO5;
import X.MO7;
import X.MP1;
import X.MP2;
import X.MPO;
import X.MQ2;
import X.NHG;
import X.OSZ;
import X.RBX;
import X.X1D;
import X.XKX;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.LruCache;
import android.widget.RemoteViews;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.AdReRankServiceManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ad.feed.candidate.CandidateResponse;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.feed.candidate.CandidateRequestImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM;
import com.ss.android.ugc.aweme.placediscovery.api.NearbyPoiCategoryResponse;
import com.ss.android.ugc.aweme.placediscovery.manager.NearbyCategoryTabViewModel;
import com.ss.android.ugc.aweme.placediscovery.model.POICategoryApiState;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS1S4000000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AfS58S0200000_9 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            case 21:
                accept$21(this, obj);
                return;
            case 22:
                accept$22(this, obj);
                return;
            case 23:
                accept$23(this, obj);
                return;
            case 24:
                accept$24(this, obj);
                return;
            case 25:
                accept$25(this, obj);
                return;
            case 26:
                accept$26(this, obj);
                return;
            case 27:
                accept$27(this, obj);
                return;
            case 28:
                accept$28(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C58053MqP c58053MqP = (C58053MqP) afS58S0200000_9.l0;
        SpannableStringBuilder spannableStringBuilder = c58053MqP.LJIIL;
        InterfaceC73573Su9 interfaceC73573Su9 = (InterfaceC73573Su9) afS58S0200000_9.l1;
        synchronized (spannableStringBuilder) {
            SpannableStringBuilder spannableStringBuilder2 = c58053MqP.LJIIL;
            o.LJIIIIZZ(bitmap, "bitmap");
            c58053MqP.LJFF(spannableStringBuilder2, bitmap);
            interfaceC73573Su9.onNext(c58053MqP.LJIIL);
        }
    }

    public static final void accept$1(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        ((C58053MqP) afS58S0200000_9.l0).LJIILIIL = "avatar_union_exception";
        ((InterfaceC73573Su9) afS58S0200000_9.l1).onError((Throwable) obj);
    }

    public static final void accept$10(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        List<Aweme> list = (List) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("requestAweme success aweme size:");
        LIZ.append(list.size());
        LIZ.append(' ');
        C86478Xwo.LIZ("InnerPushPreloadManager", X1D.LIZIZ(LIZ));
        ((InnerPushMessage) afS58S0200000_9.l0).getTracker().LJ = 1;
        C56962MXe c56962MXe = (C56962MXe) afS58S0200000_9.l1;
        for (Aweme aweme : list) {
            ((LruCache) c56962MXe.LIZ.getValue()).put(aweme.getAid(), aweme);
        }
        ((InnerPushMessage) afS58S0200000_9.l0).getTracker().LJI = System.currentTimeMillis() - ((InnerPushMessage) afS58S0200000_9.l0).getTracker().LJFF;
        ((C56962MXe) afS58S0200000_9.l1).LJ((InnerPushMessage) afS58S0200000_9.l0);
    }

    public static final void accept$11(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        Message obtainMessage = ((Handler) afS58S0200000_9.l0).obtainMessage(0);
        o.LJIIIIZZ(obtainMessage, "mHandler.obtainMessage(MSG_REQUEST)");
        if (throwable instanceof LW7) {
            ((LWX) afS58S0200000_9.l1).LJIIIZ();
            obtainMessage.obj = ((LW7) throwable).getResponse();
        } else {
            obtainMessage.obj = new Exception(throwable.getMessage());
        }
        if (!LX1.LJIILIIL) {
            LX1.LIZLLL = SystemClock.elapsedRealtime();
        }
        obtainMessage.sendToTarget();
    }

    public static final void accept$12(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        KQA kqa;
        Throwable it = (Throwable) obj;
        ((C55478Lpy) afS58S0200000_9.l0).LJLJJI = false;
        boolean isExposeSharerMsg = ((M89) afS58S0200000_9.l1).isExposeSharerMsg();
        int i = R.string.tp6;
        if (isExposeSharerMsg) {
            C55478Lpy c55478Lpy = (C55478Lpy) afS58S0200000_9.l0;
            o.LJIIIIZZ(it, "it");
            c55478Lpy.getClass();
            if ((it instanceof C38333F2r) && ((C38306F1q) it).getErrorCode() == 2053) {
                KQA kqa2 = c55478Lpy.LJLILLLLZI;
                if (kqa2 != null) {
                    kqa2.VC();
                }
            } else {
                C55478Lpy c55478Lpy2 = (C55478Lpy) afS58S0200000_9.l0;
                C53578L1a.LIZ.getClass();
                if (!C53578L1a.LIZ()) {
                    i = R.string.tob;
                }
                c55478Lpy2.LIZJ(i);
            }
        } else {
            C55478Lpy c55478Lpy3 = (C55478Lpy) afS58S0200000_9.l0;
            C53578L1a.LIZ.getClass();
            if (!C53578L1a.LIZ()) {
                i = R.string.tob;
            }
            c55478Lpy3.LIZJ(i);
        }
        if (o.LJ("comment_history", ((M89) afS58S0200000_9.l1).getEventType()) && (it instanceof C38333F2r) && ((C38306F1q) it).getErrorCode() == 2053 && (kqa = ((C55478Lpy) afS58S0200000_9.l0).LJLILLLLZI) != null) {
            kqa.ZF(new OSZ<>(3020004, null));
        }
        C36922EeM.LJFF(it);
        C55480Lq0.LIZIZ.LIZ(249372176, false);
    }

    public static final void accept$13(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        ((C54015LHv) afS58S0200000_9.l0).LJIIIZ().V6();
        C54015LHv.LJIILJJIL((C54015LHv) afS58S0200000_9.l0, (EnumC36206EIw) afS58S0200000_9.l1, false, 4);
    }

    public static final void accept$14(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        User m150clone;
        User user = (User) ((C35794E3a) obj).LIZ();
        if (user != null && (m150clone = user.m150clone()) != null) {
            FollowStatus followStatus = (FollowStatus) afS58S0200000_9.l0;
            C57266Mdi c57266Mdi = (C57266Mdi) afS58S0200000_9.l1;
            int followStatus2 = m150clone.getFollowStatus();
            int i = followStatus.followStatus;
            if (followStatus2 != i) {
                m150clone.setFollowStatus(i);
                ConcurrentHashMap<String, User> concurrentHashMap = c57266Mdi.LIZ;
                String uid = m150clone.getUid();
                o.LJIIIIZZ(uid, "user.uid");
                concurrentHashMap.put(uid, m150clone);
                if (m150clone.getFollowStatus() == 0) {
                    m150clone.setLivePushNotificationStatus(2);
                }
                AYX ayx = C57267Mdj.LIZ;
                String uid2 = m150clone.getUid();
                o.LJIIIIZZ(uid2, "user.uid");
                ayx.put(uid2, m150clone);
            }
        }
    }

    public static final void accept$15(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        ((C57270Mdm) afS58S0200000_9.l0).LJLJJL.onNext(new OSZ<>((M8G) afS58S0200000_9.l1, obj));
    }

    public static final void accept$16(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("refreshBottom error:");
        LIZ.append((AnonymousClass349) afS58S0200000_9.l0);
        C221018lt.LIZJ("NotificationCombineVM", X1D.LIZIZ(LIZ), (Throwable) obj);
        NotificationCombineVM notificationCombineVM = (NotificationCombineVM) afS58S0200000_9.l1;
        notificationCombineVM.LJZI = false;
        ((LiveData) notificationCombineVM.LJLLJ.getValue()).setValue(Boolean.TRUE);
    }

    public static final void accept$17(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        ((C56757MPh) afS58S0200000_9.l0).LIZLLL().setValue(new OSZ<>((MusNotice) afS58S0200000_9.l1, MQ2.SUCCESS));
        C56760MPk.LIZLLL((MusNotice) afS58S0200000_9.l1, (BaseResponse) obj, null);
    }

    public static final void accept$18(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        Throwable th = (Throwable) obj;
        C221018lt.LIZJ("NotificationModel", "deleteData error", th);
        ((C56757MPh) afS58S0200000_9.l0).LIZLLL().setValue(new OSZ<>((MusNotice) afS58S0200000_9.l1, MQ2.REQ_ERR));
        C56760MPk.LIZLLL((MusNotice) afS58S0200000_9.l1, null, th);
    }

    public static final void accept$19(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("refresh error, reason:");
        LIZ.append((MLW) afS58S0200000_9.l0);
        C221018lt.LIZJ("NotificationTLModel", X1D.LIZIZ(LIZ), (Throwable) obj);
        ((MP2) afS58S0200000_9.l1).LJIIZILJ((MLW) afS58S0200000_9.l0, true);
    }

    public static final void accept$2(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        List<MixStruct> list;
        List<MixStruct> mixList;
        List<MixStruct> list2;
        List<MixStruct> list3;
        MixListResponse mixListResponse = (MixListResponse) obj;
        if (mixListResponse != null && (mixList = mixListResponse.getMixList()) != null) {
            MG8 mg8 = (MG8) afS58S0200000_9.l1;
            mg8.LJLJJLL.addAll(mixList);
            MixListResponse mixListResponse2 = mg8.LJLLLLLL;
            if (mixListResponse2 != null) {
                list2 = mixListResponse2.getMixList();
            } else {
                list2 = null;
            }
            if (list2 instanceof ArrayList) {
                MixListResponse mixListResponse3 = mg8.LJLLLLLL;
                if (mixListResponse3 != null) {
                    list3 = mixListResponse3.getMixList();
                } else {
                    list3 = null;
                }
                o.LJII(list3, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.mix.model.MixStruct>");
                ((ArrayList) list3).addAll(mixList);
            }
        }
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS58S0200000_9.l0;
        A2F a2f = A2G.LIZ;
        MG8 mg82 = (MG8) afS58S0200000_9.l1;
        if (mixListResponse != null) {
            list = mixListResponse.getMixList();
        } else {
            list = null;
        }
        List<InterfaceC57784Mm4> L = mg82.L(list);
        a2f.getClass();
        A2V LIZLLL = A2F.LIZLLL(null, mixListResponse, L);
        C3C5.m7constructorimpl(LIZLLL);
        interfaceC67352kd.resumeWith(LIZLLL);
        ((MG8) afS58S0200000_9.l1).LJLLI.LJJJJZI();
    }

    public static final void accept$20(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        ArrayList arrayList;
        NoticeListsResponse it = (NoticeListsResponse) obj;
        C56686MMo.LIZIZ(it);
        if (C54316LTk.LIZ && it != null) {
            List<NoticeItems> notices = it.getNotices();
            if (notices != null) {
                arrayList = new ArrayList();
                for (NoticeItems noticeItems : notices) {
                    if (noticeItems.getGroup() != 210) {
                        arrayList.add(noticeItems);
                    }
                }
            } else {
                arrayList = null;
            }
            it.setNotices(arrayList);
        }
        C56707MNj c56707MNj = C56707MNj.LJI;
        o.LJIIIIZZ(it, "it");
        c56707MNj.LJIIIIZZ(it, ((MP1) afS58S0200000_9.l0).LIZ);
        InterfaceC73573Su9 emitter = (InterfaceC73573Su9) afS58S0200000_9.l1;
        o.LJIIIIZZ(emitter, "emitter");
        MP1 mp1 = (MP1) afS58S0200000_9.l0;
        mp1.LJIILJJIL(it, false);
        mp1.LJIILJJIL = false;
        mp1.LJIILL = false;
        C38891fp.LJJIJ(emitter, mp1.LJIILIIL(mp1.LIZIZ(), null));
    }

    public static final void accept$21(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        Throwable it = (Throwable) obj;
        ((MP1) afS58S0200000_9.l0).LJIILL = false;
        InterfaceC73573Su9 emitter = (InterfaceC73573Su9) afS58S0200000_9.l1;
        o.LJIIIIZZ(emitter, "emitter");
        o.LJIIIIZZ(it, "it");
        C38891fp.LJJIIZI(emitter, it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object] */
    public static final void accept$22(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        NoticeListsResponse noticeListsResponse;
        ArrayList arrayList;
        OSZ osz = (OSZ) obj;
        if (osz.getFirst() == MPO.GROUP) {
            ((C68322mC) afS58S0200000_9.l0).element = osz.getSecond();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("report time line isFixed: ");
            boolean z = C52489Kir.LIZ;
            HH1.LIZIZ(LIZ, z, LIZ, "MiddleDataSource");
            if (z) {
                ((MP1) afS58S0200000_9.l1).LJFF().clear();
            }
            MP1 mp1 = (MP1) afS58S0200000_9.l1;
            synchronized (mp1.LIZIZ) {
                List<NoticeItems> notices = ((NoticeListsResponse) osz.getSecond()).getNotices();
                if (notices != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (NoticeItems noticeItems : notices) {
                        if (noticeItems.getGroup() != mp1.LIZ) {
                            arrayList2.add(noticeItems);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        NoticeItems noticeItems2 = (NoticeItems) it.next();
                        if (!C54316LTk.LIZ || noticeItems2.getGroup() != 210) {
                            mp1.LJFF().put(Integer.valueOf(noticeItems2.getGroup()), noticeItems2);
                        }
                    }
                }
            }
            if (C54316LTk.LIZ && (noticeListsResponse = (NoticeListsResponse) ((C68322mC) afS58S0200000_9.l0).element) != null) {
                List<NoticeItems> notices2 = noticeListsResponse.getNotices();
                if (notices2 != null) {
                    arrayList = new ArrayList();
                    for (NoticeItems noticeItems3 : notices2) {
                        if (noticeItems3.getGroup() != 210) {
                            arrayList.add(noticeItems3);
                        }
                    }
                } else {
                    arrayList = null;
                }
                noticeListsResponse.setNotices(arrayList);
            }
            C56707MNj.LJI.LJIIIIZZ((NoticeListsResponse) osz.getSecond(), ((MP1) afS58S0200000_9.l1).LIZ);
        } else {
            MP1 mp12 = (MP1) afS58S0200000_9.l1;
            synchronized (mp12.LIZIZ) {
                List<NoticeItems> notices3 = ((NoticeListsResponse) osz.getSecond()).getNotices();
                if (notices3 != null) {
                    for (NoticeItems noticeItems4 : notices3) {
                        mp12.LJFF().put(Integer.valueOf(noticeItems4.getGroup()), noticeItems4);
                    }
                }
            }
        }
        NoticeListsResponse noticeListsResponse2 = (NoticeListsResponse) osz.getSecond();
        if (noticeListsResponse2 != null) {
            C56686MMo.LIZIZ(noticeListsResponse2);
        }
    }

    public static final void accept$23(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        Throwable th = (Throwable) obj;
        C221018lt.LIZJ("TopDataSource", "refresh error", th);
        ((C56745MOv) afS58S0200000_9.l0).LIZJ();
        if (C56805MRd.LIZJ()) {
            EnumC56806MRe.LJLJL.LIZLLL();
        }
        InterfaceC73573Su9 emitter = (InterfaceC73573Su9) afS58S0200000_9.l1;
        o.LJIIIIZZ(emitter, "emitter");
        C56745MOv c56745MOv = (C56745MOv) afS58S0200000_9.l0;
        C38891fp.LJJIJ(emitter, c56745MOv.LJII(c56745MOv.LIZIZ(), th));
    }

    public static final void accept$24(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        Activity activity;
        BPL bpl = (BPL) obj;
        if (bpl != null) {
            activity = bpl.LIZ;
        } else {
            activity = null;
        }
        if (activity == ((WeakReference) afS58S0200000_9.l0).get()) {
            ((C84754XOc) afS58S0200000_9.l1).LIZIZ(0);
        }
    }

    public static final void accept$25(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        if (obj == ((WeakReference) afS58S0200000_9.l0).get()) {
            ((C84754XOc) afS58S0200000_9.l1).LIZIZ(3);
        }
    }

    public static final void accept$26(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        if (obj == ((WeakReference) afS58S0200000_9.l0).get()) {
            ((C84754XOc) afS58S0200000_9.l1).LIZIZ(4);
        }
    }

    public static final void accept$27(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        MO7 mo7;
        if (((C77157UPx) obj).LJLIL == EnumC77154UPu.AUTHORIZED && (mo7 = ((MO3) afS58S0200000_9.l0).LJLIL) != null) {
            mo7.LLIILII((MO5) afS58S0200000_9.l1);
        }
    }

    public static final void accept$28(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        ((RemoteViews) afS58S0200000_9.l0).setViewVisibility(R.id.gw7, 8);
        ((RemoteViews) afS58S0200000_9.l0).setViewVisibility(R.id.l8f, 8);
        ((RemoteViews) afS58S0200000_9.l0).setViewVisibility(R.id.ad2, 0);
        ((RemoteViews) afS58S0200000_9.l0).setImageViewBitmap(R.id.ad2, (Bitmap) obj);
        ((InterfaceC65784Pro) afS58S0200000_9.l1).invoke();
    }

    public static final void accept$3(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        boolean z;
        String str;
        String num;
        CandidateResponse candidateResponse = (CandidateResponse) obj;
        List<Aweme> candidateList = candidateResponse.getCandidateList();
        if (candidateList == null) {
            candidateList = C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : candidateList) {
            List dataList = (List) afS58S0200000_9.l0;
            String LIZ = C55674Lt8.LIZ(0);
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(dataList, "dataList");
            if (C54884LgO.LIZ(aweme, dataList)) {
                C46728IVo.LJIIL(0, aweme);
                NHG.LIZ.LJIILJJIL(LIZ, C47261Igj.LJII(aweme));
                arrayList.add(aweme);
            }
        }
        AdReRankServiceManager.LIZJ().LIZIZ(ILE.FEED).LJ(candidateResponse.getSatiParamForPitaya(), arrayList);
        ((CandidateRequestImpl) afS58S0200000_9.l1).getClass();
        if (candidateResponse.status_code == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "1";
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (!candidateList.isEmpty()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        int i = candidateResponse.error_code;
        if (i == 0 || (num = Integer.valueOf(i).toString()) == null) {
            num = "-1";
        }
        String str3 = candidateResponse.status_msg;
        if (str3 == null) {
            str3 = "";
        }
        C56575MIh c56575MIh = new C56575MIh(new Object[0]);
        C56579MIl.LIZ.getClass();
        c56575MIh.LJIILJJIL(C56579MIl.LIZIZ, new AqS1S4000000_9(str2, str, num, str3, 1));
    }

    public static final void accept$4(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        boolean z;
        C57391Mfj c57391Mfj = (C57391Mfj) obj;
        Bundle bundle = c57391Mfj.LJI;
        if (bundle != null && bundle.getString("from_empty_click") != null) {
            z = true;
        } else {
            z = false;
        }
        EnumC58006Mpe enumC58006Mpe = c57391Mfj.LIZIZ;
        if (enumC58006Mpe == EnumC58006Mpe.CHECKED) {
            FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = ((FriendsEmptyPageRootVM) afS58S0200000_9.l0).LJLILLLLZI;
            if (friendsEmptyPageMainSectionVM != null) {
                XKX.LIZLLL(friendsEmptyPageMainSectionVM.LJLIL, null, null, new LSJ(z, friendsEmptyPageMainSectionVM, null), 3);
                return;
            } else {
                o.LJIJI("emptyPageMainSectionVM");
                throw null;
            }
        }
        if (enumC58006Mpe != EnumC58006Mpe.SYNCED || !c57391Mfj.LIZLLL) {
            return;
        }
        if (!z) {
            FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM2 = ((FriendsEmptyPageRootVM) afS58S0200000_9.l0).LJLILLLLZI;
            if (friendsEmptyPageMainSectionVM2 != null) {
                if (!friendsEmptyPageMainSectionVM2.LJLJJI) {
                    return;
                }
            } else {
                o.LJIJI("emptyPageMainSectionVM");
                throw null;
            }
        }
        ((FriendsEmptyPageRootVM) afS58S0200000_9.l0).hv0((EnumC58046MqI) afS58S0200000_9.l1);
    }

    public static final void accept$5(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        MixListResponse mixListResponse = (MixListResponse) obj;
        if (mixListResponse != null) {
            GetMixListViewModel getMixListViewModel = (GetMixListViewModel) afS58S0200000_9.l0;
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS58S0200000_9.l1;
            List<C85433Xfx> gv0 = getMixListViewModel.gv0(mixListResponse.getMixList(), true);
            List<C85429Xft> list = getMixListViewModel.LJLJJL;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.addAll(gv0);
            if (mixListResponse.getHasMore()) {
                A2F a2f = A2G.LIZ;
                List<C85433Xfx> gv02 = getMixListViewModel.gv0(mixListResponse.getMixList(), true);
                a2f.getClass();
                A2V LIZLLL = A2F.LIZLLL(null, mixListResponse, gv02);
                C3C5.m7constructorimpl(LIZLLL);
                interfaceC67352kd.resumeWith(LIZLLL);
                return;
            }
            A2F a2f2 = A2G.LIZ;
            List<C85433Xfx> gv03 = getMixListViewModel.gv0(mixListResponse.getMixList(), true);
            a2f2.getClass();
            A2H LIZ = A2F.LIZ(gv03);
            C3C5.m7constructorimpl(LIZ);
            interfaceC67352kd.resumeWith(LIZ);
        }
    }

    public static final void accept$6(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        MixListResponse mixListResponse = (MixListResponse) obj;
        if (mixListResponse != null) {
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS58S0200000_9.l0;
            GetMixListViewModel getMixListViewModel = (GetMixListViewModel) afS58S0200000_9.l1;
            List<MixStruct> mixList = mixListResponse.getMixList();
            if (mixList != null && mixList.isEmpty()) {
                A2F a2f = A2G.LIZ;
                List<C85433Xfx> gv0 = getMixListViewModel.gv0(mixListResponse.getMixList(), false);
                a2f.getClass();
                A2H LIZ = A2F.LIZ(gv0);
                C3C5.m7constructorimpl(LIZ);
                interfaceC67352kd.resumeWith(LIZ);
                return;
            }
            if (mixListResponse.getHasMore()) {
                A2F a2f2 = A2G.LIZ;
                List<C85433Xfx> gv02 = getMixListViewModel.gv0(mixListResponse.getMixList(), false);
                a2f2.getClass();
                A2V LIZLLL = A2F.LIZLLL(null, mixListResponse, gv02);
                C3C5.m7constructorimpl(LIZLLL);
                interfaceC67352kd.resumeWith(LIZLLL);
                return;
            }
            A2F a2f3 = A2G.LIZ;
            List<C85433Xfx> gv03 = getMixListViewModel.gv0(mixListResponse.getMixList(), false);
            a2f3.getClass();
            A2H LIZ2 = A2F.LIZ(gv03);
            C3C5.m7constructorimpl(LIZ2);
            interfaceC67352kd.resumeWith(LIZ2);
        }
    }

    public static final void accept$7(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        NearbyPoiCategoryResponse res = (NearbyPoiCategoryResponse) obj;
        if (res != null && res.status_code == 0) {
            RoamingLocationInfo roamingLocationInfo = (RoamingLocationInfo) afS58S0200000_9.l0;
            o.LJIIIIZZ(res, "res");
            LJ6.LIZ.storeString(C00F.LIZIZ(((RBX) HG3.LJIILL()).getCurUserId(), '_', "nearby_poi_category_list"), JsonParseUtils.LIZLLL(new POICategoryApiState(roamingLocationInfo, false, res)));
            ((NearbyCategoryTabViewModel) afS58S0200000_9.l1).setState(new AqS140S0200000_9((RoamingLocationInfo) afS58S0200000_9.l0, res, 20));
            return;
        }
        ((NearbyCategoryTabViewModel) afS58S0200000_9.l1).setState(C54595Lbj.LJLIL);
    }

    public static final void accept$8(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        if (((C58049MqL) afS58S0200000_9.l0).LJLLLLLL != null && (!r0.isDisposed())) {
            ((C58049MqL) afS58S0200000_9.l0).setText(spannableStringBuilder);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((C58049MqL) afS58S0200000_9.l0).hashCode());
            LIZ.append(" set subscribe text ");
            LIZ.append((Object) spannableStringBuilder);
            C221018lt.LIZ("RelationLabel[V]", X1D.LIZIZ(LIZ));
        }
        if (((C58055MqR) afS58S0200000_9.l1).LJII) {
            ((C58049MqL) afS58S0200000_9.l0).LJLZ = spannableStringBuilder;
        }
    }

    public static final void accept$9(AfS58S0200000_9 afS58S0200000_9, Object obj) {
        Aweme aweme = (Aweme) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("requestAweme success aweme aid:");
        LIZ.append(aweme.getAid());
        LIZ.append(' ');
        C86478Xwo.LIZ("InnerPushPreloadManager", X1D.LIZIZ(LIZ));
        ((InnerPushMessage) afS58S0200000_9.l0).getTracker().LJ = 1;
        ((LruCache) ((C56962MXe) afS58S0200000_9.l1).LIZ.getValue()).put(aweme.getAid(), aweme);
        ((InnerPushMessage) afS58S0200000_9.l0).getTracker().LJI = System.currentTimeMillis() - ((InnerPushMessage) afS58S0200000_9.l0).getTracker().LJFF;
        ((C56962MXe) afS58S0200000_9.l1).LJ((InnerPushMessage) afS58S0200000_9.l0);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS58S0200000_9(com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel r2, com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel r3, X.InterfaceC67352kd<? super X.A2G<com.ss.android.ugc.aweme.mix.model.MixListResponse>> r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 5: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS58S0200000_9.<init>(com.ss.android.ugc.aweme.mix.addfeed.viewmodel.GetMixListViewModel, X.2kd, int):void");
    }

    public AfS58S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
