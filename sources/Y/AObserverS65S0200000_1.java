package Y;

import X.AbstractC029409q;
import X.AbstractC57781Mm1;
import X.AbstractC84083Rs;
import X.AbstractC92763kW;
import X.AbstractC92773kX;
import X.ActivityC45651qj;
import X.AnonymousClass114;
import X.AnonymousClass419;
import X.AnonymousClass429;
import X.C025908h;
import X.C101543yg;
import X.C1027541n;
import X.C1036745b;
import X.C1038545t;
import X.C1040246k;
import X.C109544Rq;
import X.C111414Yv;
import X.C112244aq;
import X.C119354mJ;
import X.C1AH;
import X.C1DH;
import X.C221018lt;
import X.C223338pd;
import X.C252569vg;
import X.C26045AKb;
import X.C28871Bj;
import X.C34B;
import X.C3CK;
import X.C3KN;
import X.C3KP;
import X.C3L3;
import X.C3L4;
import X.C3PO;
import X.C3PT;
import X.C3R2;
import X.C42A;
import X.C45804HyK;
import X.C45V;
import X.C48203Ivv;
import X.C4DW;
import X.C4DZ;
import X.C4FF;
import X.C4FY;
import X.C4LS;
import X.C57778Mly;
import X.C71082qe;
import X.C73305Spp;
import X.C73340SqO;
import X.C74275TDb;
import X.C76292z3;
import X.C76342z8;
import X.C77119UOl;
import X.C781134t;
import X.C78613UtF;
import X.C80533Eb;
import X.C82603Ma;
import X.C92723kS;
import X.C92733kT;
import X.C92743kU;
import X.C94603nU;
import X.C97463s6;
import X.C97933sr;
import X.C98523to;
import X.C99033ud;
import X.EnumC111404Yu;
import X.FKM;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC98113t9;
import X.MG5;
import X.O6R;
import X.ORZ;
import X.OUP;
import X.V3N;
import X.ViewOnTouchListenerC93253lJ;
import X.X1D;
import X.XKQ;
import X.XKX;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.casting.ui.playback.feed.InteractInfoTVCastAssem;
import com.ss.android.ugc.aweme.emoji.navi.NaviCreationSignal;
import com.ss.android.ugc.aweme.feed.helper.RecFeedShareComponentController;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.titlebar.QuickChatTitleBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.SingleChatTitleBarComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragmentV2;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.fragment.GroupListFragment;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.fragment.RelationSelectFragment;
import com.ss.android.ugc.aweme.im.sdk.relations.viewmodel.RelationViewModel;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.plugin.not_interested.NotInterestedTutorialData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public class AObserverS65S0200000_1 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onChanged$7(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        ((BaseListFragmentPanel) aObserverS65S0200000_1.l0).lambda$showNotInterestedTutorialInternal$19("dismiss_not_interested_tutorial", "dismiss_method", (ActivityC45651qj) aObserverS65S0200000_1.l1, "auto", (NotInterestedTutorialData) obj);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onChanged$13(this, obj);
                return;
            case 14:
                onChanged$14(this, obj);
                return;
            case 15:
                onChanged$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onChanged$16(this, obj);
                return;
            case 17:
                onChanged$17(this, obj);
                return;
            case 18:
                onChanged$18(this, obj);
                return;
            case 19:
                onChanged$19(this, obj);
                return;
            case 20:
                onChanged$20(this, obj);
                return;
            case 21:
                onChanged$21(this, obj);
                return;
            case 22:
                onChanged$22(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        List<T> list;
        C3L3 LIZIZ = C3KN.LIZIZ((C3L3) aObserverS65S0200000_1.l0, (ActivityStatus) obj);
        if (o.LJ(LIZIZ, aObserverS65S0200000_1.l0)) {
            return;
        }
        List<T> list2 = ((C97463s6) aObserverS65S0200000_1.l1).mmItems;
        int i = 0;
        if (list2 != 0) {
            Iterator it = list2.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if ((next instanceof C3L3) && o.LJ(((C3L4) next).LJFF(), LIZIZ.LJFF())) {
                    if (i2 >= 0 && (list = ((C97463s6) aObserverS65S0200000_1.l1).mmItems) != 0 && i2 < list.size()) {
                        List<T> list3 = ((C97463s6) aObserverS65S0200000_1.l1).mmItems;
                        if (list3 != 0) {
                            ListProtector.set(list3, i2, LIZIZ);
                        }
                        ((C97463s6) aObserverS65S0200000_1.l1).notifyItemChanged(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        Iterator<C3L4> it2 = ((C97463s6) aObserverS65S0200000_1.l1).LJLJJI.iterator();
        while (it2.hasNext()) {
            if (o.LJ(it2.next().LJFF(), LIZIZ.LJFF())) {
                if (i < 0) {
                    return;
                }
                ListProtector.set(((C97463s6) aObserverS65S0200000_1.l1).LJLJJI, i, LIZIZ);
                return;
            }
            i++;
        }
    }

    public static final void onChanged$1(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        Iterator it = ((Iterable) ((InterfaceC65784Pro) aObserverS65S0200000_1.l0).invoke()).iterator();
        while (it.hasNext()) {
            ((C109544Rq) it.next()).getLocalExt().remove("show_navi_tip");
        }
        ((C1038545t) aObserverS65S0200000_1.l1).LIZ = false;
    }

    public static final void onChanged$10(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        C98523to c98523to;
        IMUser fromUser;
        C98523to c98523to2;
        IMUser fromUser2;
        ActivityStatus activityStatus = (ActivityStatus) obj;
        if (activityStatus != null) {
            C82603Ma LIZ = C3KP.LIZ(activityStatus, null, (Context) aObserverS65S0200000_1.l0, 3);
            IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics().LIZLLL(((QuickChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLJJI.getConversationId(), LIZ.LJLILLLLZI);
            if (LIZ.LJLILLLLZI != C4FY.NO_STATUS) {
                ((QuickChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLILLLLZI.LIZLLL(Boolean.FALSE, LIZ.LJLIL);
            } else {
                ((QuickChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLILLLLZI.LIZ();
            }
            if (OUP.LJJII(activityStatus, null, null, 3)) {
                C1040246k LIZ2 = ((QuickChatTitleBarComponent) aObserverS65S0200000_1.l1).LIZ();
                if (LIZ2 != null) {
                    LIZ2.LIZJ(true);
                }
                C119354mJ c119354mJ = ((QuickChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLJJLL;
                if (c119354mJ != null) {
                    c119354mJ.LIZ(R.attr.cv);
                }
                C99033ud c99033ud = ((QuickChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLJJI;
                if ((c99033ud instanceof C98523to) && (c98523to2 = (C98523to) c99033ud) != null && (fromUser2 = c98523to2.getFromUser()) != null) {
                    fromUser2.setOnline(true);
                }
            } else {
                C1040246k LIZ3 = ((QuickChatTitleBarComponent) aObserverS65S0200000_1.l1).LIZ();
                if (LIZ3 != null) {
                    LIZ3.LIZJ(false);
                }
                C99033ud c99033ud2 = ((QuickChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLJJI;
                if ((c99033ud2 instanceof C98523to) && (c98523to = (C98523to) c99033ud2) != null && (fromUser = c98523to.getFromUser()) != null) {
                    fromUser.setOnline(false);
                }
            }
            C119354mJ c119354mJ2 = ((QuickChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLJJLL;
            if (c119354mJ2 == null) {
                return;
            }
            C112244aq.LIZ(c119354mJ2, activityStatus.userID, Boolean.valueOf(OUP.LJJII(activityStatus, null, null, 3)));
            return;
        }
        ((QuickChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLILLLLZI.LIZ();
    }

    public static final void onChanged$11(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        Activity LJIJJ;
        Activity activity;
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        AbstractC92763kW abstractC92763kW = (AbstractC92763kW) obj;
        if (!(abstractC92763kW instanceof C92743kU)) {
            Activity activity2 = null;
            r2 = null;
            r2 = null;
            Fragment fragment = null;
            if (abstractC92763kW instanceof C92723kS) {
                if (((ChatViewModel) aObserverS65S0200000_1.l0).LJLJJL == 101) {
                    Context context = ((InputView) aObserverS65S0200000_1.l1).getContext();
                    if (context != null) {
                        activity = C45804HyK.LJIJJ(context);
                    } else {
                        activity = null;
                    }
                    if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
                        fragment = supportFragmentManager.LJJJIL(InputView.LLIZ);
                    }
                    DialogFragment dialogFragment = (DialogFragment) fragment;
                    if (dialogFragment != null) {
                        dialogFragment.dismiss();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(abstractC92763kW instanceof C92733kT)) {
                return;
            }
            int i = ((ChatViewModel) aObserverS65S0200000_1.l0).LJLJJLL;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 102) {
                            return;
                        }
                        ((InputView) aObserverS65S0200000_1.l1).LJJIZ();
                        return;
                    }
                    Object obj2 = ((C92733kT) abstractC92763kW).LIZ;
                    String TAG = InputView.LLIZ;
                    o.LJIIIIZZ(TAG, "TAG");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onSendFailure: ");
                    LIZ.append(obj2);
                    C34B.LIZIZ(TAG, X1D.LIZIZ(LIZ));
                    return;
                }
                Context context2 = ((InputView) aObserverS65S0200000_1.l1).getContext();
                if (context2 != null) {
                    activity2 = C45804HyK.LJIJJ(context2);
                }
                V3N.LJJIJIIJI(activity2);
                return;
            }
            Context context3 = ((InputView) aObserverS65S0200000_1.l1).getContext();
            if (context3 == null || (LJIJJ = C45804HyK.LJIJJ(context3)) == null || !C73340SqO.LJJIJ(LJIJJ)) {
                return;
            }
            AnonymousClass114.LIZ(LJIJJ, R.string.h78);
        }
    }

    public static final void onChanged$12(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        ActivityStatus activityStatus = (ActivityStatus) obj;
        if (activityStatus != null) {
            C82603Ma LIZ = C3KP.LIZ(activityStatus, null, (Context) aObserverS65S0200000_1.l0, 3);
            IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics().LIZLLL(((SingleChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLIL.getConversationId(), LIZ.LJLILLLLZI);
            if (LIZ.LJLILLLLZI != C4FY.NO_STATUS) {
                ((SingleChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLJI.LIZLLL(Boolean.FALSE, LIZ.LJLIL);
            } else {
                ((SingleChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLJI.LIZ();
            }
            if (OUP.LJJII(activityStatus, null, null, 3)) {
                C1040246k LIZ2 = ((SingleChatTitleBarComponent) aObserverS65S0200000_1.l1).LIZ();
                if (LIZ2 != null) {
                    LIZ2.LIZJ(true);
                }
                C119354mJ c119354mJ = ((SingleChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLJJI;
                if (c119354mJ != null) {
                    c119354mJ.LIZ(R.attr.cv);
                }
                IMUser fromUser = ((SingleChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLIL.getFromUser();
                if (fromUser != null) {
                    fromUser.setOnline(true);
                }
            } else {
                C1040246k LIZ3 = ((SingleChatTitleBarComponent) aObserverS65S0200000_1.l1).LIZ();
                if (LIZ3 != null) {
                    LIZ3.LIZJ(false);
                }
                IMUser fromUser2 = ((SingleChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLIL.getFromUser();
                if (fromUser2 != null) {
                    fromUser2.setOnline(false);
                }
            }
            C119354mJ c119354mJ2 = ((SingleChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLJJI;
            if (c119354mJ2 == null) {
                return;
            }
            C112244aq.LIZ(c119354mJ2, activityStatus.userID, Boolean.valueOf(OUP.LJJII(activityStatus, null, null, 3)));
            return;
        }
        ((SingleChatTitleBarComponent) aObserverS65S0200000_1.l1).LJLJI.LIZ();
    }

    public static final void onChanged$13(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        ((Observer) aObserverS65S0200000_1.l0).onChanged(obj);
        ((LiveData) aObserverS65S0200000_1.l1).removeObserver(aObserverS65S0200000_1);
    }

    public static final void onChanged$14(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        List<IMConversation> value = ((GroupListViewModel) aObserverS65S0200000_1.l0).LJLIL.getValue();
        if (value == null || value.isEmpty()) {
            GroupListFragment groupListFragment = (GroupListFragment) aObserverS65S0200000_1.l1;
            C73305Spp status_view = (C73305Spp) groupListFragment._$_findCachedViewById(R.id.kf_);
            o.LJIIIIZZ(status_view, "status_view");
            C252569vg.LIZIZ(status_view, MG5.CHAT_GROUP_SELECT, null, new AqS151S0100000_1(groupListFragment, 964));
            if (C111414Yv.LIZ == EnumC111404Yu.NOT_AVAILABLE) {
                Context requireContext = groupListFragment.requireContext();
                o.LJIIIIZZ(requireContext, "requireContext()");
                if (C48203Ivv.LIZJ(requireContext)) {
                    C26045AKb c26045AKb = new C26045AKb(groupListFragment);
                    c26045AKb.LJIIIIZZ(R.string.dtk);
                    c26045AKb.LJIIJ();
                }
            }
        }
    }

    public static final void onChanged$15(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        RelationStatus relationStatus = (RelationStatus) obj;
        C221018lt.LJFF("@LinkRelation_Video", "receive follow livedata!");
        String uid = relationStatus.getUid();
        Integer followerStatus = relationStatus.getFollowerStatus();
        if (uid == null || uid.length() == 0 || followerStatus == null) {
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((ActivityC45651qj) aObserverS65S0200000_1.l0);
        SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper = (SharedVideoDeepLinkHelper) aObserverS65S0200000_1.l1;
        XKX.LIZLLL(lifecycleScope, sharedVideoDeepLinkHelper.LJLJI, null, new C76342z8(sharedVideoDeepLinkHelper, uid, relationStatus, followerStatus, null), 2);
    }

    public static final void onChanged$16(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        ActivityStatus activityStatus = (ActivityStatus) obj;
        if (activityStatus != null) {
            C82603Ma LIZ = C3KP.LIZ(activityStatus, null, (Context) aObserverS65S0200000_1.l0, 3);
            if (LIZ.LJLILLLLZI != C4FY.NO_STATUS) {
                MufUserCell mufUserCell = (MufUserCell) aObserverS65S0200000_1.l1;
                mufUserCell.M().setText(LIZ.LJLIL);
                mufUserCell.M().setVisibility(0);
                mufUserCell.L().setVisibility(8);
            }
            if (OUP.LJJII(activityStatus, null, null, 3)) {
                MufUserCell mufUserCell2 = (MufUserCell) aObserverS65S0200000_1.l1;
                C119354mJ c119354mJ = mufUserCell2.LJLJL;
                if (c119354mJ != null) {
                    c119354mJ.setActive(true);
                }
                C119354mJ c119354mJ2 = mufUserCell2.LJLJL;
                if (c119354mJ2 == null) {
                    return;
                }
                c119354mJ2.setVisibility(0);
                return;
            }
            C119354mJ c119354mJ3 = ((MufUserCell) aObserverS65S0200000_1.l1).LJLJL;
            if (c119354mJ3 == null) {
                return;
            }
            c119354mJ3.setVisibility(8);
        }
    }

    public static final void onChanged$17(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        ((C1AH) ((View) aObserverS65S0200000_1.l0).findViewById(R.id.kdv)).setVisibility(8);
        ((C1AH) ((View) aObserverS65S0200000_1.l0).findViewById(R.id.g7t)).setVisibility(0);
        ((C223338pd) ((View) aObserverS65S0200000_1.l0).findViewById(R.id.g7q)).LIZIZ();
        if (!C4LS.LIZ()) {
            XKQ xkq = C4FF.LJLJJLL;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            C4FF.LJLJJLL = XKX.LIZLLL(C4FF.LJLJJL, null, null, new C4DZ(false, null), 3);
        }
        IMService.createIIMServicebyMonsterPlugin(false).getImNaviAnalytics().LIZIZ();
        ((C4DW) aObserverS65S0200000_1.l1).LJLJI.setValue(null);
    }

    public static final void onChanged$18(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        AnonymousClass429 anonymousClass429;
        int followStatus = ((RelationStatus) obj).getFollowStatus();
        if (followStatus != 0) {
            if ((followStatus != 1 && followStatus != 2) || (anonymousClass429 = ((MessageListAssem) aObserverS65S0200000_1.l0).LLI) == null) {
                return;
            }
            User user = IMUser.toUser((IMUser) aObserverS65S0200000_1.l1);
            o.LJIIIIZZ(user, "toUser(user)");
            C80533Eb.LJIIJJI(user.getUid(), user.getSecUid(), true, new C42A(anonymousClass429, user));
            RelationButton relationButton = anonymousClass429.LLIIIZ;
            if (relationButton == null) {
                return;
            }
            relationButton.setVisibility(8);
            return;
        }
        AnonymousClass429 anonymousClass4292 = ((MessageListAssem) aObserverS65S0200000_1.l0).LLI;
        if (anonymousClass4292 == null) {
            return;
        }
        User user2 = IMUser.toUser((IMUser) aObserverS65S0200000_1.l1);
        o.LJIIIIZZ(user2, "toUser(user)");
        anonymousClass4292.n0(user2);
    }

    public static final void onChanged$19(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        List<Integer> list;
        RelationSelectFragment relationSelectFragment;
        AbstractC92763kW abstractC92763kW = (AbstractC92763kW) obj;
        List<String> list2 = null;
        Editable editable = null;
        if (abstractC92763kW instanceof C92743kU) {
            ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ = ((RelationSelectFragment) aObserverS65S0200000_1.l0).LJLILLLLZI;
            if (viewOnTouchListenerC93253lJ != null && (relationSelectFragment = viewOnTouchListenerC93253lJ.LJZ) != null) {
                EditText editText = viewOnTouchListenerC93253lJ.LJLJL;
                if (editText != null) {
                    editable = editText.getText();
                }
                relationSelectFragment.LLIIIL(String.valueOf(editable));
                return;
            }
            return;
        }
        if (abstractC92763kW instanceof C92723kS) {
            ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ2 = ((RelationSelectFragment) aObserverS65S0200000_1.l0).LJLILLLLZI;
            if (viewOnTouchListenerC93253lJ2 != null) {
                AbstractC84083Rs abstractC84083Rs = ((RelationViewModel) aObserverS65S0200000_1.l1).LJLIL;
                if (abstractC84083Rs instanceof C3R2) {
                    list = ((C3R2) abstractC84083Rs).LJIIJ();
                } else {
                    list = null;
                }
                AbstractC84083Rs abstractC84083Rs2 = ((RelationViewModel) aObserverS65S0200000_1.l1).LJLIL;
                if (abstractC84083Rs2 instanceof C3R2) {
                    list2 = ((C3R2) abstractC84083Rs2).LJIIJJI();
                }
                viewOnTouchListenerC93253lJ2.LJI(list, list2);
            }
            ViewOnTouchListenerC93253lJ viewOnTouchListenerC93253lJ3 = ((RelationSelectFragment) aObserverS65S0200000_1.l0).LJLILLLLZI;
            if (viewOnTouchListenerC93253lJ3 == null) {
                return;
            }
            viewOnTouchListenerC93253lJ3.LJFF((List) ((C92723kS) abstractC92763kW).LIZ);
            return;
        }
        if (!(abstractC92763kW instanceof AbstractC92773kX)) {
            return;
        }
        abstractC92763kW.getClass();
        o.LJII(null, "null cannot be cast to non-null type kotlin.Throwable");
        throw null;
    }

    public static final void onChanged$2(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        C57778Mly c57778Mly = (C57778Mly) obj;
        if (c57778Mly.LIZLLL()) {
            SessionListFragmentV2 sessionListFragmentV2 = (SessionListFragmentV2) aObserverS65S0200000_1.l0;
            AbstractC57781Mm1 LJJLIIIJJIZ = ((InterfaceC98113t9) aObserverS65S0200000_1.l1).LJJLIIIJJIZ();
            boolean LIZIZ = c57778Mly.LIZIZ();
            sessionListFragmentV2.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("recommendedList is empty: ");
            LIZ.append(LIZIZ);
            C34B.LJI("SessionListFragmentV2", X1D.LIZIZ(LIZ));
            if (!LIZIZ) {
                List<? extends AbstractC029409q<? extends RecyclerView.ViewHolder>> LJLZ = ((C28871Bj) sessionListFragmentV2.LJLLLLLL.getValue()).LJLZ();
                o.LJIIIIZZ(LJLZ, "concatAdapter.adapters");
                if (!ORZ.LJLJJI(LJJLIIIJJIZ, LJLZ)) {
                    sessionListFragmentV2.xl().LJLJJL = new AqS148S0200000_1(sessionListFragmentV2, LJJLIIIJJIZ, 4);
                    sessionListFragmentV2.xl().LJLLLLLL();
                    C97933sr c97933sr = sessionListFragmentV2.LJLIL;
                    if (c97933sr != null) {
                        c97933sr.LIZ();
                        sessionListFragmentV2.xl().notifyDataSetChanged();
                    } else {
                        o.LJIJI("mSessionListView");
                        throw null;
                    }
                }
            }
        }
        C97933sr c97933sr2 = ((SessionListFragmentV2) aObserverS65S0200000_1.l0).LJLIL;
        if (c97933sr2 != null) {
            c97933sr2.LJLJLLL = c57778Mly.LIZIZ();
        } else {
            o.LJIJI("mSessionListView");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (X.OUP.LJJII(r4, null, null, 3) == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$20(Y.AObserverS65S0200000_1 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.im.service.model.ActivityStatus r4 = (com.ss.android.ugc.aweme.im.service.model.ActivityStatus) r4
            java.lang.Object r2 = r3.l0
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r2
            if (r4 == 0) goto L42
            r1 = 3
            r0 = 0
            boolean r1 = X.OUP.LJJII(r4, r0, r0, r1)
            r0 = 1
            if (r1 != r0) goto L42
        L11:
            r2.setOnline(r0)
            java.lang.Object r1 = r3.l1
            X.4Pe r1 = (X.C108904Pe) r1
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            r1.P(r0)
            java.lang.Object r0 = r3.l1
            X.4Pe r0 = (X.C108904Pe) r0
            android.view.View r2 = r0.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            java.lang.String r1 = r0.getUid()
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            boolean r0 = r0.isOnline()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C112244aq.LIZ(r2, r1, r0)
            return
        L42:
            r0 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS65S0200000_1.onChanged$20(Y.AObserverS65S0200000_1, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (X.OUP.LJJII(r4, null, null, 3) == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$21(Y.AObserverS65S0200000_1 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.im.service.model.ActivityStatus r4 = (com.ss.android.ugc.aweme.im.service.model.ActivityStatus) r4
            java.lang.Object r2 = r3.l0
            com.ss.android.ugc.aweme.im.service.model.IMContact r2 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r2
            com.ss.android.ugc.aweme.im.service.model.IMUser r2 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r2
            if (r4 == 0) goto L4e
            r1 = 3
            r0 = 0
            boolean r1 = X.OUP.LJJII(r4, r0, r0, r1)
            r0 = 1
            if (r1 != r0) goto L4e
        L13:
            r2.setOnline(r0)
            java.lang.Object r1 = r3.l1
            X.4Pn r1 = (X.C108994Pn) r1
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.im.service.model.IMContact r0 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r0
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            boolean r0 = r0.isOnline()
            r1.Q(r0)
            java.lang.Object r0 = r3.l1
            X.4Pn r0 = (X.C108994Pn) r0
            android.view.View r2 = r0.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.im.service.model.IMContact r0 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r0
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            java.lang.String r1 = r0.getUid()
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.im.service.model.IMContact r0 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r0
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            boolean r0 = r0.isOnline()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C112244aq.LIZ(r2, r1, r0)
            return
        L4e:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS65S0200000_1.onChanged$21(Y.AObserverS65S0200000_1, java.lang.Object):void");
    }

    public static final void onChanged$22(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        int i;
        ChatNoticeViewModel chatNoticeViewModel;
        RelationStatus relationStatus = (RelationStatus) obj;
        if (o.LJ(((IMUser) aObserverS65S0200000_1.l0).getUid(), relationStatus.getUid())) {
            if (relationStatus.getFollowStatus() == 1 || relationStatus.getFollowStatus() == 2) {
                IMUser iMUser = (IMUser) aObserverS65S0200000_1.l0;
                if (relationStatus.getFollowStatus() == 1) {
                    i = 1;
                } else {
                    i = 2;
                }
                iMUser.setFollowStatus(i);
                AnonymousClass429 anonymousClass429 = ((BaseChatPanel) aObserverS65S0200000_1.l1).LLIZ;
                if (anonymousClass429 != null) {
                    User user = IMUser.toUser((IMUser) aObserverS65S0200000_1.l0);
                    o.LJIIIIZZ(user, "toUser(this)");
                    C80533Eb.LJIIJJI(user.getUid(), user.getSecUid(), true, new C42A(anonymousClass429, user));
                    RelationButton relationButton = anonymousClass429.LLIIIZ;
                    if (relationButton != null) {
                        relationButton.setVisibility(8);
                    }
                }
                C1036745b LJI = ((BaseChatPanel) aObserverS65S0200000_1.l1).LJI();
                if (LJI != null) {
                    C1036745b.LJII(LJI, new C1027541n(null), 1);
                }
                BaseChatPanel baseChatPanel = (BaseChatPanel) aObserverS65S0200000_1.l1;
                baseChatPanel.LLJJJJLIIL = true;
                AnonymousClass419 anonymousClass419 = baseChatPanel.LLJI;
                if ((anonymousClass419 == null || !anonymousClass419.LJII((IMUser) aObserverS65S0200000_1.l0)) && ((Boolean) C45V.LIZ.getValue()).booleanValue() && relationStatus.getFollowStatus() == 2 && (chatNoticeViewModel = (ChatNoticeViewModel) ((BaseChatPanel) aObserverS65S0200000_1.l1).LLJJIJI.getValue()) != null) {
                    chatNoticeViewModel.gv0();
                }
            } else if (relationStatus.getFollowStatus() == 0) {
                ((IMUser) aObserverS65S0200000_1.l0).setFollowStatus(0);
                AnonymousClass429 anonymousClass4292 = ((BaseChatPanel) aObserverS65S0200000_1.l1).LLIZ;
                if (anonymousClass4292 != null) {
                    User user2 = IMUser.toUser((IMUser) aObserverS65S0200000_1.l0);
                    o.LJIIIIZZ(user2, "toUser(this)");
                    anonymousClass4292.n0(user2);
                }
                BaseChatPanel baseChatPanel2 = (BaseChatPanel) aObserverS65S0200000_1.l1;
                baseChatPanel2.LLJJJJLIIL = false;
                AnonymousClass419 anonymousClass4192 = baseChatPanel2.LLJI;
                if (anonymousClass4192 != null) {
                    anonymousClass4192.LJII((IMUser) aObserverS65S0200000_1.l0);
                }
            }
            C101543yg c101543yg = C101543yg.LIZ;
            int followStatus = relationStatus.getFollowStatus();
            c101543yg.getClass();
            C101543yg.LIZIZ = followStatus;
        }
    }

    public static final void onChanged$3(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aObserverS65S0200000_1.l0;
        MediatorLiveData mediatorLiveData = (MediatorLiveData) aObserverS65S0200000_1.l1;
        interfaceC88471Ynr.invoke(mediatorLiveData, mediatorLiveData);
    }

    public static final void onChanged$4(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        if (obj != null) {
            if (!C781134t.LIZ) {
                C781134t.LIZ = true;
                FKM.LIZ().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.34s
                    public static final String[] LJLILLLLZI = {"live"};

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        o.LJIIIZ(activity, "activity");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        o.LJIIIZ(activity, "activity");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                        o.LJIIIZ(activity, "activity");
                        o.LJIIIZ(outState, "outState");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        o.LJIIIZ(activity, "activity");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        o.LJIIIZ(activity, "activity");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        o.LJIIIZ(activity, "activity");
                        View decorView = activity.getWindow().getDecorView();
                        o.LJIIIIZZ(decorView, "activity.window.decorView");
                        if (decorView instanceof ViewGroup) {
                            C781134t.LIZIZ((ViewGroup) decorView);
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        o.LJIIIZ(activity, "activity");
                        C71082qe c71082qe = C71042qa.LIZIZ;
                        if (c71082qe == null || !c71082qe.LIZIZ.LJIIIZ()) {
                            return;
                        }
                        for (String str : LJLILLLLZI) {
                            String lowerCase = C16880lQ.LJLLJ(activity.getClass()).toLowerCase(Locale.ROOT);
                            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (s.LJJJLZIJ(lowerCase, str, false)) {
                                return;
                            }
                        }
                        View decorView = activity.getWindow().getDecorView();
                        o.LJIIIIZZ(decorView, "activity.window.decorView");
                        if (decorView instanceof ViewGroup) {
                            C781134t.LIZ((ViewGroup) decorView, activity);
                        }
                    }
                });
            }
            C1DH.LJJIJIIJI(new ARunnableS20S0200000_1((InteractInfoTVCastAssem) aObserverS65S0200000_1.l0, (C71082qe) aObserverS65S0200000_1.l1, 6));
            return;
        }
        if (C781134t.LIZ) {
            FKM.LIZ().unregisterActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.34s
                public static final String[] LJLILLLLZI = {"live"};

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                    o.LJIIIZ(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                    o.LJIIIZ(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                    o.LJIIIZ(activity, "activity");
                    o.LJIIIZ(outState, "outState");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                    o.LJIIIZ(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    o.LJIIIZ(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    o.LJIIIZ(activity, "activity");
                    View decorView = activity.getWindow().getDecorView();
                    o.LJIIIIZZ(decorView, "activity.window.decorView");
                    if (decorView instanceof ViewGroup) {
                        C781134t.LIZIZ((ViewGroup) decorView);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    o.LJIIIZ(activity, "activity");
                    C71082qe c71082qe = C71042qa.LIZIZ;
                    if (c71082qe == null || !c71082qe.LIZIZ.LJIIIZ()) {
                        return;
                    }
                    for (String str : LJLILLLLZI) {
                        String lowerCase = C16880lQ.LJLLJ(activity.getClass()).toLowerCase(Locale.ROOT);
                        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (s.LJJJLZIJ(lowerCase, str, false)) {
                            return;
                        }
                    }
                    View decorView = activity.getWindow().getDecorView();
                    o.LJIIIIZZ(decorView, "activity.window.decorView");
                    if (decorView instanceof ViewGroup) {
                        C781134t.LIZ((ViewGroup) decorView, activity);
                    }
                }
            });
            C781134t.LIZ = false;
        }
        C1DH.LJJIJIIJI(new ARunnableS37S0100000_1((InteractInfoTVCastAssem) aObserverS65S0200000_1.l0, 22));
    }

    public static final void onChanged$5(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        if (obj != null) {
            ((Observer) aObserverS65S0200000_1.l0).onChanged(obj);
            ((NaviCreationSignal.SingleLiveData) aObserverS65S0200000_1.l1).postValue(null);
        }
    }

    public static final void onChanged$6(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        RelationStatus relationStatus = (RelationStatus) obj;
        String uid = relationStatus.getUid();
        Integer followerStatus = relationStatus.getFollowerStatus();
        if (uid == null || uid.length() == 0 || followerStatus == null) {
            return;
        }
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope((ActivityC45651qj) aObserverS65S0200000_1.l0), C78613UtF.LIZJ, null, new C76292z3((RecFeedShareComponentController) aObserverS65S0200000_1.l1, uid, relationStatus, followerStatus, null), 2);
    }

    public static final void onChanged$8(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        double d;
        C94603nU it = (C94603nU) obj;
        DiskManagerPage diskManagerPage = (DiskManagerPage) aObserverS65S0200000_1.l0;
        View view = (View) aObserverS65S0200000_1.l1;
        o.LJIIIIZZ(it, "it");
        diskManagerPage.getClass();
        if (it.LJLIL < 0) {
            ((TextView) view.findViewById(R.id.mng)).setText(diskManagerPage.getString(R.string.jin));
        } else {
            String string = diskManagerPage.getString(R.string.jiq);
            o.LJIIIIZZ(string, "getString(R.string.pfnf_…eUpSpacePage_placeholder)");
            C025908h.LJ(new Object[]{Double.valueOf(it.LJLIL / 1.0E9d)}, 1, ujb.o.LJJJJZ(string, "%f", "%.2f", false), "format(format, *args)", (TuxTextView) view.findViewById(R.id.mng));
        }
        long j = it.LJLIL;
        if (j < 0) {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        } else {
            d = j / it.LJLILLLLZI;
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.mnf);
        String string2 = diskManagerPage.getString(R.string.jio);
        o.LJIIIIZZ(string2, "getString(R.string.pfnf_…ign_freeUpSpacePage_desc)");
        C025908h.LJ(new Object[]{Integer.valueOf(O6R.LJJIIJZLJL(100 * d))}, 1, string2, "format(format, *args)", tuxTextView);
        double d2 = 1 - (it.LJLJI / it.LJLILLLLZI);
        int LJIILJJIL = C77119UOl.LJIILJJIL(view.getContext());
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        int LIZJ = LJIILJJIL - C74275TDb.LIZJ(48.0d, context);
        View appProgress = view.findViewById(R.id.nbc);
        o.LJIIIIZZ(appProgress, "appProgress");
        double d3 = LIZJ;
        appProgress.setVisibility(0);
        ValueAnimator ofInt = ValueAnimator.ofInt(appProgress.getLayoutParams().width, (int) (d * d3));
        diskManagerPage.LJLJJI = ofInt;
        if (ofInt != null) {
            ofInt.setDuration(250L);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.addUpdateListener(new AUListenerS90S0100000_1(appProgress, 75));
        }
        ValueAnimator valueAnimator = diskManagerPage.LJLJJI;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        View otherProgress = view.findViewById(R.id.nbe);
        o.LJIIIIZZ(otherProgress, "otherProgress");
        otherProgress.setVisibility(0);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(otherProgress.getLayoutParams().width, (int) (d2 * d3));
        diskManagerPage.LJLJJL = ofInt2;
        if (ofInt2 != null) {
            ofInt2.setDuration(250L);
            ofInt2.setInterpolator(new LinearInterpolator());
            ofInt2.addUpdateListener(new AUListenerS90S0100000_1(otherProgress, 76));
        }
        ValueAnimator valueAnimator2 = diskManagerPage.LJLJJL;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    public static final void onChanged$9(AObserverS65S0200000_1 aObserverS65S0200000_1, Object obj) {
        RelationStatus relationStatus = (RelationStatus) obj;
        if (relationStatus == null || ((Boolean) ((InterfaceC88472Yns) aObserverS65S0200000_1.l0).invoke(Integer.valueOf(relationStatus.getFollowStatus()))).booleanValue()) {
            return;
        }
        C3CK c3ck = (C3CK) aObserverS65S0200000_1.l1;
        C3PO c3po = C3PO.REMOVE;
        String uid = relationStatus.getUid();
        if (uid == null) {
            uid = "";
        }
        c3ck.LJIILLIIL(new C3PT(c3po, uid, false, 4));
    }

    public AObserverS65S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
