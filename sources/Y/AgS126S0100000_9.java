package Y;

import X.C10I;
import X.C10K;
import X.C26045AKb;
import X.C36922EeM;
import X.C45804HyK;
import X.C54883LgN;
import X.C56962MXe;
import X.C56964MXg;
import X.C57036Ma0;
import X.C57037Ma1;
import X.C57063MaR;
import X.C57064MaS;
import X.C59895Nf1;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C76800UCe;
import X.C8BT;
import X.EnumC36206EIw;
import X.InterfaceC88472Yns;
import X.LH7;
import X.LHH;
import X.LKF;
import X.LWX;
import X.MGN;
import X.MZS;
import X.MZT;
import X.MZU;
import X.MZV;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.util.LruCache;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.inbox.InboxFollowerFragment;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.notification.LikeListDetailFragment;
import com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity;
import com.ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity;
import com.ss.android.ugc.aweme.notification.MusNotificationDetailFragment;
import com.ss.android.ugc.aweme.notification.NoticeCardFragment;
import com.ss.android.ugc.aweme.notification.UserListActivity;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AgS126S0100000_9 implements C10I {
    public final int $t;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            case 6:
                return then$6(this, c10k);
            case 7:
                return then$7(this, c10k);
            case 8:
                return then$8(this, c10k);
            case 9:
                return then$9(this, c10k);
            case 10:
                return then$10(this, c10k);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return then$11(this, c10k);
            case 12:
                return then$12(this, c10k);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return then$13(this, c10k);
            case 14:
                return then$14(this, c10k);
            case 15:
                return then$15(this, c10k);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return then$16(this, c10k);
            default:
                return null;
        }
    }

    public AgS126S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        ((InterfaceC88472Yns) agS126S0100000_9.l0).invoke(c10k.LJIIJJI());
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        List<C8BT> list = ((C54883LgN) agS126S0100000_9.l0).mNotifyListeners;
        if (list != null) {
            try {
                Iterator<C8BT> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess();
                }
                return null;
            } catch (Exception e) {
                throw e;
            }
        }
        return null;
    }

    public static final Object then$10(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        List<C8BT> list = ((LWX) agS126S0100000_9.l0).mNotifyListeners;
        if (list != null) {
            try {
                Iterator<C8BT> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess();
                }
                return null;
            } catch (Exception e) {
                StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "FriendsFeedModel handleMsg error ");
                LIZIZ.append(e.getMessage());
                C36922EeM.LJ(X1D.LIZIZ(LIZIZ));
                throw e;
            }
        }
        return null;
    }

    public static final Object then$11(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        ((LHH) agS126S0100000_9.l0).runColdStartTaskV2(false, EnumC36206EIw.SWITCH_ACCOUNT);
        return C76800UCe.LIZ;
    }

    public static final Object then$12(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        ((MultiViewModel) agS126S0100000_9.l0).LJLJJLL.postValue(Boolean.TRUE);
        return C76800UCe.LIZ;
    }

    public static final Object then$13(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        ((LH7) agS126S0100000_9.l0).runColdStartTaskV2(false, EnumC36206EIw.SWITCH_ACCOUNT);
        return C76800UCe.LIZ;
    }

    public static final Object then$14(AgS126S0100000_9 agS126S0100000_9, C10K it) {
        o.LJIIIIZZ(it, "it");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) agS126S0100000_9.l0;
        Object LJIIJJI = it.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "it.result");
        interfaceC88472Yns.invoke(LJIIJJI);
        return C76800UCe.LIZ;
    }

    public static final Object then$15(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        if (!((UserListActivity) agS126S0100000_9.l0).isDestroyed()) {
            ((C73305Spp) ((UserListActivity) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_)).setVisibility(0);
            MGN mgn = MGN.LJLILLLLZI;
            if (mgn.isStandardUIEnable()) {
                C73305Spp status_view = (C73305Spp) ((UserListActivity) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_);
                o.LJIIIIZZ(status_view, "status_view");
                mgn.setStatusView(status_view, "inbox_like_list", new C57063MaR((UserListActivity) agS126S0100000_9.l0), (Exception) null);
                UserListActivity userListActivity = (UserListActivity) agS126S0100000_9.l0;
                mgn.triggerNetworkTips(userListActivity, "inbox_like_list", (Exception) null, (C73305Spp) userListActivity._$_findCachedViewById(R.id.kf_));
            } else {
                C73305Spp c73305Spp = (C73305Spp) ((UserListActivity) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_);
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new C57064MaS((UserListActivity) agS126S0100000_9.l0));
                c73305Spp.setStatus(c73306Spq);
                C26045AKb c26045AKb = new C26045AKb((UserListActivity) agS126S0100000_9.l0);
                c26045AKb.LJIIIIZZ(R.string.img);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$16(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        if (!((LikeListDetailFragment) agS126S0100000_9.l0).isDetached()) {
            ((C73305Spp) ((LikeListDetailFragment) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_)).setVisibility(0);
            MGN mgn = MGN.LJLILLLLZI;
            if (mgn.isStandardUIEnable()) {
                C73305Spp status_view = (C73305Spp) ((LikeListDetailFragment) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_);
                o.LJIIIIZZ(status_view, "status_view");
                mgn.setStatusView(status_view, "inbox_like_list", new C57036Ma0((LikeListDetailFragment) agS126S0100000_9.l0), (Exception) null);
                Context context = ((LikeListDetailFragment) agS126S0100000_9.l0).getContext();
                o.LJI(context);
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                o.LJI(LJIJJ);
                mgn.triggerNetworkTips(LJIJJ, "inbox_like_list", (Exception) null, (C73305Spp) ((LikeListDetailFragment) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_));
            } else {
                C73305Spp c73305Spp = (C73305Spp) ((LikeListDetailFragment) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_);
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new C57037Ma1((LikeListDetailFragment) agS126S0100000_9.l0));
                c73305Spp.setStatus(c73306Spq);
                C26045AKb c26045AKb = new C26045AKb((LikeListDetailFragment) agS126S0100000_9.l0);
                c26045AKb.LJIIIIZZ(R.string.img);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        InboxFollowerFragment inboxFollowerFragment = (InboxFollowerFragment) agS126S0100000_9.l0;
        if (!inboxFollowerFragment.mStatusDestroyed) {
            ((C73305Spp) inboxFollowerFragment._$_findCachedViewById(R.id.keh)).setStatus((C73306Spq) ((InboxFollowerFragment) agS126S0100000_9.l0).LJLLLLLL.getValue());
            ((C73305Spp) ((InboxFollowerFragment) agS126S0100000_9.l0)._$_findCachedViewById(R.id.keh)).setVisibility(0);
            ((C73305Spp) ((InboxFollowerFragment) agS126S0100000_9.l0)._$_findCachedViewById(R.id.g7z)).setVisibility(8);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$3(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        return Boolean.valueOf(((LKF) agS126S0100000_9.l0).LJIILIIL());
    }

    public static final Object then$4(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        if (!((MusFollowRequestDetailActivity) agS126S0100000_9.l0).isDestroyed()) {
            C73305Spp c73305Spp = (C73305Spp) ((MusFollowRequestDetailActivity) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_);
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJI(c73306Spq, new AqS159S0100000_9((MusFollowRequestDetailActivity) agS126S0100000_9.l0, 402));
            c73305Spp.setStatus(c73306Spq);
            ((C73305Spp) ((MusFollowRequestDetailActivity) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_)).setVisibility(0);
            C26045AKb c26045AKb = new C26045AKb((MusFollowRequestDetailActivity) agS126S0100000_9.l0);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$5(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        if (((MusNewNotificationFragment) agS126S0100000_9.l0).isViewValid()) {
            ((MusNewNotificationFragment) agS126S0100000_9.l0).Yl();
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$6(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        if (!((MusNotificationDetailActivity) agS126S0100000_9.l0).isDestroyed()) {
            ((C73305Spp) ((MusNotificationDetailActivity) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_)).setVisibility(0);
            MGN mgn = MGN.LJLILLLLZI;
            if (mgn.isStandardUIEnable()) {
                C73305Spp status_view = (C73305Spp) ((MusNotificationDetailActivity) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_);
                o.LJIIIIZZ(status_view, "status_view");
                mgn.setStatusView(status_view, "inbox_notification_detail", new MZS((MusNotificationDetailActivity) agS126S0100000_9.l0), (Exception) null);
                MusNotificationDetailActivity musNotificationDetailActivity = (MusNotificationDetailActivity) agS126S0100000_9.l0;
                mgn.triggerNetworkTips(musNotificationDetailActivity, "inbox_notification_detail", (Exception) null, (C73305Spp) musNotificationDetailActivity._$_findCachedViewById(R.id.kf_));
            } else {
                C73305Spp c73305Spp = (C73305Spp) ((MusNotificationDetailActivity) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_);
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new MZT((MusNotificationDetailActivity) agS126S0100000_9.l0));
                c73305Spp.setStatus(c73306Spq);
                C26045AKb c26045AKb = new C26045AKb((MusNotificationDetailActivity) agS126S0100000_9.l0);
                c26045AKb.LJIIIIZZ(R.string.img);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$7(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        if (!((MusNotificationDetailFragment) agS126S0100000_9.l0).isDetached()) {
            ((C73305Spp) ((MusNotificationDetailFragment) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_)).setVisibility(0);
            MGN mgn = MGN.LJLILLLLZI;
            if (mgn.isStandardUIEnable()) {
                C73305Spp status_view = (C73305Spp) ((MusNotificationDetailFragment) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_);
                o.LJIIIIZZ(status_view, "status_view");
                mgn.setStatusView(status_view, "inbox_notification_detail", new MZU((MusNotificationDetailFragment) agS126S0100000_9.l0), (Exception) null);
                Context context = ((MusNotificationDetailFragment) agS126S0100000_9.l0).getContext();
                o.LJI(context);
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                o.LJI(LJIJJ);
                mgn.triggerNetworkTips(LJIJJ, "inbox_notification_detail", (Exception) null, (C73305Spp) ((MusNotificationDetailFragment) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_));
            } else {
                C73305Spp c73305Spp = (C73305Spp) ((MusNotificationDetailFragment) agS126S0100000_9.l0)._$_findCachedViewById(R.id.kf_);
                C73306Spq c73306Spq = new C73306Spq();
                C73312Spw.LJI(c73306Spq, new MZV((MusNotificationDetailFragment) agS126S0100000_9.l0));
                c73305Spp.setStatus(c73306Spq);
                C26045AKb c26045AKb = new C26045AKb((MusNotificationDetailFragment) agS126S0100000_9.l0);
                c26045AKb.LJIIIIZZ(R.string.img);
                c26045AKb.LJIIJ();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$8(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        NoticeCardFragment noticeCardFragment = (NoticeCardFragment) agS126S0100000_9.l0;
        if (!noticeCardFragment.mStatusDestroyed) {
            ((C73305Spp) noticeCardFragment._$_findCachedViewById(R.id.keh)).setStatus((C73306Spq) ((NoticeCardFragment) agS126S0100000_9.l0).LJLJJL.getValue());
            ((C73305Spp) ((NoticeCardFragment) agS126S0100000_9.l0)._$_findCachedViewById(R.id.keh)).setVisibility(0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$9(AgS126S0100000_9 agS126S0100000_9, C10K c10k) {
        C56962MXe c56962MXe = C56964MXg.LIZ;
        InnerPushMessage msg = (InnerPushMessage) agS126S0100000_9.l0;
        c56962MXe.getClass();
        o.LJIIIZ(msg, "msg");
        CopyOnWriteArraySet LIZIZ = C56962MXe.LIZIZ(msg);
        if (!LIZIZ.isEmpty()) {
            Iterator it = LIZIZ.iterator();
            while (it.hasNext()) {
                ((LruCache) c56962MXe.LIZ.getValue()).remove(it.next());
            }
        }
        return C76800UCe.LIZ;
    }
}
