package Y;

import X.ActivityC45651qj;
import X.B35;
import X.B3O;
import X.B3P;
import X.B42;
import X.B57;
import X.B5A;
import X.B5F;
import X.B5S;
import X.B5T;
import X.B5U;
import X.B5V;
import X.B82;
import X.B83;
import X.B8B;
import X.BJ9;
import X.BJB;
import X.BJE;
import X.BJL;
import X.BJN;
import X.BKJ;
import X.BKP;
import X.BKY;
import X.BLH;
import X.BMU;
import X.BMV;
import X.BMW;
import X.BTH;
import X.BZI;
import X.C05170If;
import X.C06510Nj;
import X.C08680Vs;
import X.C09900aA;
import X.C0NE;
import X.C15380j0;
import X.C15620jO;
import X.C156426By;
import X.C164996dj;
import X.C16880lQ;
import X.C16970lZ;
import X.C169786lS;
import X.C17N;
import X.C279117r;
import X.C28157B3h;
import X.C28246B6s;
import X.C28268B7o;
import X.C28461BEz;
import X.C28509BGv;
import X.C28594BKc;
import X.C28733BPl;
import X.C28787BRn;
import X.C28835BTj;
import X.C28837BTl;
import X.C29049Baf;
import X.C29374Bfu;
import X.C2NU;
import X.C2V;
import X.C30180Bsu;
import X.C30868C9o;
import X.C30926CBu;
import X.C31319CQx;
import X.C31665Cbl;
import X.C31689Cc9;
import X.C31692CcC;
import X.C32004ChE;
import X.C32364Cn2;
import X.C32537Cpp;
import X.C32727Cst;
import X.C34710Djm;
import X.C36595EXv;
import X.C37392Elw;
import X.C37403Em7;
import X.C38354F3m;
import X.C38995FSd;
import X.C46625IRp;
import X.C46748IWi;
import X.C47061t0;
import X.C47634Imk;
import X.C48054ItW;
import X.C54;
import X.C56552MHk;
import X.C61360O6i;
import X.C62822Ol8;
import X.C66381Q3l;
import X.C66390Q3u;
import X.C67187QYl;
import X.C75234Tfq;
import X.C76800UCe;
import X.C78847Ux1;
import X.C7N;
import X.C80797VnN;
import X.C83741Wtl;
import X.C8BS;
import X.CI2;
import X.CN1;
import X.CQL;
import X.CQO;
import X.CR6;
import X.CRA;
import X.CRD;
import X.CRV;
import X.EF7;
import X.EnumC28203B5b;
import X.EnumC30736C4m;
import X.EnumC31700CcK;
import X.FUA;
import X.IP0;
import X.IWL;
import X.InterfaceC156116At;
import X.InterfaceC170126m0;
import X.InterfaceC28214B5m;
import X.InterfaceC28215B5n;
import X.InterfaceC30182Bsw;
import X.InterfaceC31095CIh;
import X.InterfaceC31104CIq;
import X.InterfaceC31337CRp;
import X.InterfaceC36571c5;
import X.InterfaceC65784Pro;
import X.JYS;
import X.K8R;
import X.O7D;
import X.PQB;
import X.PQZ;
import X.UFE;
import X.VW3;
import X.ViewOnClickListenerC28501BGn;
import X.ViewTreeObserverOnDrawListenerC55314LnK;
import X.W5O;
import X.X1D;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.UserWannaSendMessageEvent;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.livesdk.LandscapeInteractionMarginData;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.LivePlayContainerViewHeightChangedEvent;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveReplaceFirstStreamTypeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.PreviewEnterOpt1;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.ImDeleteMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.session.deeplink.DeepLinkData;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchContainerFragment;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.launcher.service.interceptor.ImageHeaderInterceptor;
import com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ARunnableS8S0201000_5 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C47061t0 c47061t0;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator startDelay;
        ViewPropertyAnimator withEndAction;
        if (this.i2 == 0 && (c47061t0 = ((C32727Cst) this.l0).LJLJJLL) != null && (animate = c47061t0.animate()) != null && (scaleX = animate.scaleX(0.7f)) != null && (scaleY = scaleX.scaleY(0.7f)) != null && (interpolator = scaleY.setInterpolator((C83741Wtl) this.l1)) != null && (duration = interpolator.setDuration(200L)) != null && (startDelay = duration.setStartDelay(0L)) != null && (withEndAction = startDelay.withEndAction(new ARunnableS24S0200000_5((C32727Cst) this.l0, (C83741Wtl) this.l1, 42))) != null) {
            withEndAction.start();
        }
    }

    public final void LIZ$1() {
        C47061t0 c47061t0;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator startDelay;
        ViewPropertyAnimator withEndAction;
        if (this.i2 == 0 && (c47061t0 = ((C32727Cst) this.l0).LJLJLJ) != null && (animate = c47061t0.animate()) != null && (scaleX = animate.scaleX(0.7f)) != null && (scaleY = scaleX.scaleY(0.7f)) != null && (interpolator = scaleY.setInterpolator((C83741Wtl) this.l1)) != null && (duration = interpolator.setDuration(200L)) != null && (startDelay = duration.setStartDelay(0L)) != null && (withEndAction = startDelay.withEndAction(new ARunnableS24S0200000_5((C32727Cst) this.l0, (C83741Wtl) this.l1, 44))) != null) {
            withEndAction.start();
        }
    }

    public static final void run$0(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                C31665Cbl.LJIIIZ((ImageView) aRunnableS8S0201000_5.l0, ((Room) aRunnableS8S0201000_5.l1).getOwner().getAvatarThumb(), R.drawable.cuk);
                return;
            case 1:
                EcSearchContainerFragment ecSearchContainerFragment = (EcSearchContainerFragment) aRunnableS8S0201000_5.l0;
                K8R k8r = (K8R) aRunnableS8S0201000_5.l1;
                VW3 vw3 = ecSearchContainerFragment.LJLJJI;
                if (vw3 != null) {
                    vw3.setCurrentItem(k8r.LJLIL, false);
                    return;
                }
                return;
            case 2:
                C156426By c156426By = (C156426By) aRunnableS8S0201000_5.l0;
                InterfaceC156116At interfaceC156116At = (InterfaceC156116At) aRunnableS8S0201000_5.l1;
                c156426By.LJIJJLI();
                c156426By.setVisibility(0);
                if (interfaceC156116At != null) {
                    interfaceC156116At.LIZ();
                    return;
                }
                return;
            default:
                C47634Imk c47634Imk = (C47634Imk) aRunnableS8S0201000_5.l0;
                Object obj = aRunnableS8S0201000_5.l1;
                if (obj != null) {
                    if (!((ArrayList) c47634Imk.LIZJ).contains(obj)) {
                        ((ArrayList) c47634Imk.LIZJ).add(obj);
                    }
                } else {
                    c47634Imk.getClass();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("listener: ");
                LIZ.append(((ArrayList) c47634Imk.LIZJ).size());
                TTVideoEngineLog.d("HeadsetStateMonitor", X1D.LIZIZ(LIZ));
                return;
        }
    }

    public static final void run$1(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        User user;
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS8S0201000_5.l0;
                Room room = (Room) aRunnableS8S0201000_5.l1;
                C28461BEz c28461BEz = livePlayFragment.LLIIIILZ;
                if (c28461BEz != null) {
                    IMessageManager iMessageManager = ((IMessageService) CN1.LIZ(IMessageService.class)).get(c28461BEz.LJLJJLL);
                    while (!c28461BEz.LJLZ.isEmpty() && iMessageManager != null) {
                        iMessageManager.insertMessage((IMessage) ((LinkedList) c28461BEz.LJLZ).poll());
                    }
                }
                Room room2 = livePlayFragment.LJLJI;
                if (room2 != null && room2.getStatus() == 3) {
                    long j = livePlayFragment.LJLIL;
                    ControlMessage controlMessage = new ControlMessage();
                    CommonMessageData commonMessageData = new CommonMessageData();
                    commonMessageData.roomId = j;
                    commonMessageData.messageId = -1L;
                    commonMessageData.showMsg = true;
                    controlMessage.baseMessage = commonMessageData;
                    controlMessage.action = 1;
                    IMessageManager iMessageManager2 = ((IMessageService) CN1.LIZ(IMessageService.class)).get(livePlayFragment.LJLIL);
                    if (iMessageManager2 != null) {
                        iMessageManager2.insertMessage(controlMessage, true);
                    }
                }
                if (livePlayFragment.LJZL) {
                    User user2 = new User();
                    user2.setId(livePlayFragment.LJLJJI);
                    livePlayFragment.LLLIIL.qv0(SendGiftEvent.class, new C32004ChE(livePlayFragment.LJLZ, user2, livePlayFragment.LLLZL.mLogData.enterLiveSquareSource));
                    livePlayFragment.LJZL = false;
                    livePlayFragment.LJLZ = 0L;
                } else if (livePlayFragment.LJLLL) {
                    Room room3 = livePlayFragment.LJLJI;
                    if (room3 != null && room3.getOwner() != null) {
                        user = room.getOwner();
                    } else {
                        user = new User();
                        user.setId(livePlayFragment.LJLJJI);
                    }
                    livePlayFragment.LLLIIL.qv0(SendGiftEvent.class, new C32004ChE(livePlayFragment.LJLZ, user, livePlayFragment.LLLZL.mLogData.enterLiveSquareSource));
                    livePlayFragment.LJLLL = false;
                    livePlayFragment.LJLZ = 0L;
                }
                if (livePlayFragment.LJLLLLLL) {
                    livePlayFragment.LJLLLLLL = false;
                    if (livePlayFragment.getContext() != null) {
                        ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).kg0(livePlayFragment.getContext(), livePlayFragment.LJLJI, "sub_only_preview_layer", null);
                    }
                }
                if (livePlayFragment.LJLLLL) {
                    livePlayFragment.LLLLLJLJLL.postDelayed(new ARunnableS41S0100000_5(livePlayFragment, 130), 1000L);
                    livePlayFragment.LJLLLL = false;
                }
                DeepLinkData deepLinkData = livePlayFragment.LLF;
                if (deepLinkData != null && !deepLinkData.equals(new DeepLinkData())) {
                    if (!(((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ instanceof User)) {
                        livePlayFragment.LLF = null;
                        return;
                    }
                    String LIZ = C05170If.LIZ((User) ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ);
                    if (!TextUtils.isEmpty(livePlayFragment.LLF.displayId)) {
                        Locale locale = Locale.ROOT;
                        if (!TextUtils.equals(LIZ.toLowerCase(locale), livePlayFragment.LLF.displayId.toLowerCase(locale))) {
                            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.oj9));
                            if (livePlayFragment.LLF.bizType == BMU.Subscription.getScene()) {
                                BZI LIZ2 = C28787BRn.LIZ("livesdk_subsribe_different_account_toast_show");
                                LIZ2.LJIILLIIL(livePlayFragment.LLLIIL);
                                LIZ2.LJJIIJZLJL();
                            }
                            livePlayFragment.LLF = null;
                            return;
                        }
                    }
                    Context context = livePlayFragment.getContext();
                    DeepLinkData deepLinkData2 = livePlayFragment.LLF;
                    Room room4 = livePlayFragment.LJLJI;
                    o.LJIIIZ(deepLinkData2, "deepLinkData");
                    o.LJIIIZ(room4, "room");
                    if (deepLinkData2.bizType == BMU.Subscription.getScene()) {
                        if (context != null && !TextUtils.isEmpty(deepLinkData2.openUrl)) {
                            ISubscribeService iSubscribeService = (ISubscribeService) CN1.LIZ(ISubscribeService.class);
                            String str = deepLinkData2.openUrl;
                            o.LJI(str);
                            iSubscribeService.Yl(context, room4, str);
                        }
                    } else if (!TextUtils.isEmpty(deepLinkData2.openUrl)) {
                        Uri parse = UriProtector.parse(new C32364Cn2(deepLinkData2.openUrl).LIZLLL());
                        o.LJIIIIZZ(parse, "parse(builder.build())");
                        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, parse);
                    }
                    livePlayFragment.LLF = null;
                }
                if (TextUtils.equals(livePlayFragment.LJZI, "gift_panel")) {
                    User user3 = new User();
                    user3.setId(livePlayFragment.LJLJJI);
                    livePlayFragment.LLLIIL.qv0(SendGiftEvent.class, new C32004ChE(user3));
                    livePlayFragment.LJZI = null;
                } else if (TextUtils.equals(livePlayFragment.LJZI, "package_panel")) {
                    User user4 = new User();
                    user4.setId(livePlayFragment.LJLJJI);
                    livePlayFragment.LLLIIL.qv0(SendGiftEvent.class, new C32004ChE(user4));
                    livePlayFragment.LJZI = null;
                }
                if (TextUtils.isEmpty(livePlayFragment.LJZ) || livePlayFragment.getContext() == null) {
                    return;
                }
                ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(livePlayFragment.getContext(), livePlayFragment.LJZ);
                livePlayFragment.LJZ = "";
                return;
            case 1:
                ArrayList callbacks = (ArrayList) aRunnableS8S0201000_5.l0;
                C66390Q3u requests = (C66390Q3u) aRunnableS8S0201000_5.l1;
                o.LJIIIZ(callbacks, "$callbacks");
                o.LJIIIZ(requests, "$requests");
                Iterator it = callbacks.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    BMV bmv = (BMV) pair.first;
                    Object obj = pair.second;
                    o.LJIIIIZZ(obj, "pair.second");
                    bmv.LIZ((C66381Q3l) obj);
                }
                Iterator it2 = ((ArrayList) requests.LJLJJI).iterator();
                while (it2.hasNext()) {
                    ((BMW) it2.next()).LIZ(requests);
                }
                return;
            case 2:
                Context context2 = (Context) aRunnableS8S0201000_5.l0;
                String str2 = (String) aRunnableS8S0201000_5.l1;
                if (!C16970lZ.LIZIZ(context2, str2)) {
                    C16970lZ.LJFF(context2, str2);
                    return;
                }
                return;
            default:
                IWL this$0 = (IWL) aRunnableS8S0201000_5.l0;
                IP0 ip0 = (IP0) aRunnableS8S0201000_5.l1;
                o.LJIIIZ(this$0, "this$0");
                this$0.LIZJ = ip0;
                this$0.LIZLLL.LIZLLL(ip0);
                return;
        }
    }

    public static final void run$10(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        List<Long> list;
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                Collection collection = (Collection) aRunnableS8S0201000_5.l0;
                ImDeleteMessage imDeleteMessage = (ImDeleteMessage) aRunnableS8S0201000_5.l1;
                if (collection == null || collection.isEmpty() || imDeleteMessage == null) {
                    return;
                }
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    CRD crd = (CRD) it.next();
                    if (crd.LJJIJIIJIL() && (crd instanceof CQO)) {
                        CQO cqo = (CQO) crd;
                        List<Long> list2 = imDeleteMessage.deleteUserIds;
                        if ((list2 != null && list2.contains(Long.valueOf(cqo.LJLILLLLZI()))) || ((list = imDeleteMessage.deleteMsgIds) != null && list.contains(Long.valueOf(cqo.LJIJJLI.getMessageId())))) {
                            crd.dispose();
                            it.remove();
                        }
                    }
                }
                return;
            case 1:
                ((C8BS) aRunnableS8S0201000_5.l0).handleMsg((Message) aRunnableS8S0201000_5.l1);
                return;
            default:
                C56552MHk c56552MHk = (C56552MHk) aRunnableS8S0201000_5.l0;
                c56552MHk.handleData(aRunnableS8S0201000_5.l1);
                c56552MHk.LJLIL.onSuccess();
                return;
        }
    }

    public static final void run$11(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                ((C31319CQx) aRunnableS8S0201000_5.l0).LJJIIZI((CR6) aRunnableS8S0201000_5.l1, false, null);
                return;
            default:
                OnPlayerPreparedListener onPlayerPreparedListener = (OnPlayerPreparedListener) aRunnableS8S0201000_5.l0;
                String str = (String) aRunnableS8S0201000_5.l1;
                if (onPlayerPreparedListener != null) {
                    onPlayerPreparedListener.onPreparedReady(str);
                    return;
                }
                return;
        }
    }

    public static final void run$12(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                CRV crv = (CRV) aRunnableS8S0201000_5.l0;
                crv.LIZ.LJLJI(false, (CRD) aRunnableS8S0201000_5.l1, false);
                return;
            default:
                ((JobService) aRunnableS8S0201000_5.l0).jobFinished((JobParameters) aRunnableS8S0201000_5.l1, false);
                return;
        }
    }

    public static final void run$13(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        B42 b42;
        BJL bjl;
        C80797VnN c80797VnN;
        String str;
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                ((CRV) aRunnableS8S0201000_5.l0).LIZ.LJLJI(false, (CRD) aRunnableS8S0201000_5.l1, false);
                return;
            case 1:
                LiveRoomFragment liveRoomFragment = (LiveRoomFragment) aRunnableS8S0201000_5.l0;
                EnterRoomConfig enterRoomConfig = (EnterRoomConfig) aRunnableS8S0201000_5.l1;
                BKJ currentFragment = liveRoomFragment.getCurrentFragment();
                if (currentFragment != null && currentFragment.getFragment() != null) {
                    liveRoomFragment.LLIFFJFJJ = null;
                    BKP bkp = liveRoomFragment.LLIIII;
                    if (bkp == null) {
                        C28733BPl.LJIILIIL().getClass();
                        C0NE.LIZLLL("LiveRoomFragment", "mPageChangeListener is null !");
                        return;
                    }
                    bkp.LJI(currentFragment);
                    EnterRoomConfig Jj = currentFragment.Jj();
                    EnterRoomConfig.RoomsData roomsData = Jj.mRoomsData;
                    if (roomsData.enterType == null) {
                        if (Jj.mLogData.loadDuration > 0) {
                            str = "draw";
                        } else {
                            str = "click";
                        }
                        roomsData.enterType = str;
                    }
                    String str2 = roomsData.enterType;
                    roomsData.actionType = str2;
                    if (!PreviewEnterOpt1.INSTANCE.isEnable() && Jj.mRoomsData.streamType == LiveMode.VIDEO && !liveRoomFragment.Hl() && LiveReplaceFirstStreamTypeSetting.INSTANCE.getValue()) {
                        Jj.mRoomsData.streamType = LiveMode.valueOf(Jj.mStreamData.streamType);
                    }
                    Jj.mRoomsData.timeStamps.enterRoomStarInnerTime = Long.valueOf(liveRoomFragment.LLIILZL);
                    C17N.LJJJJZI(Jj, 0);
                    currentFragment.C5();
                    RoomStatusController roomStatusController = liveRoomFragment.LJLILLLLZI;
                    if (roomStatusController != null && (c80797VnN = liveRoomFragment.LLF) != null) {
                        roomStatusController.checkRoom(c80797VnN.getCurrentItem() + 1);
                    }
                    if ((TextUtils.equals(str2, "draw") || Jj.mRoomsData.isBackPreRoom) && liveRoomFragment.LJLIL != null) {
                        BLH.LIZJ(Jj, str2);
                    }
                    if (currentFragment.O3() == null || currentFragment.O3() == B5V.IDLE) {
                        C30868C9o.LIZLLL(R.string.st3, liveRoomFragment.getContext());
                        if (liveRoomFragment.LJLIL != null) {
                            BLH.LIZIZ(Jj, "", 0L, "init_state_invalid");
                        }
                        Event event = new Event("room_fg_enter_room_fail", 33025, EnumC28203B5b.BussinessApiCall);
                        event.LIZIZ("fail to enter room, because live play fg status is null or idle.");
                        B57.LIZ.LIZ().LIZIZ(event);
                        B5S.LIZJ(enterRoomConfig, B5T.PLAY_FRAGMENT_IS_NULL);
                        ((B5F) liveRoomFragment.LJLJJI.getRoomAction()).LIZ("error");
                    }
                    C28246B6s LIZIZ = BJN.LIZIZ();
                    if (LIZIZ != null && (bjl = LIZIZ.LJFF) != null) {
                        bjl.LJ = str2;
                    }
                    if (liveRoomFragment.LJLIL != null) {
                        BLH.LIZ(Jj);
                        BLH blh = liveRoomFragment.LJLIL;
                        blh.getClass();
                        if (Jj.mLogData != null && Jj.mRoomsData != null) {
                            C38995FSd.LIZIZ().execute(new ARunnableS8S0201000_5(1, blh, Jj, 3));
                        }
                    }
                    RoomStatusController roomStatusController2 = liveRoomFragment.LJLILLLLZI;
                    if (roomStatusController2 != null) {
                        roomStatusController2.refreshTimer();
                        liveRoomFragment.LJLILLLLZI.startCheckTimer(Jj);
                    }
                }
                liveRoomFragment.z4();
                return;
            case 2:
                LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS8S0201000_5.l0;
                C28268B7o c28268B7o = (C28268B7o) aRunnableS8S0201000_5.l1;
                BJ9 bj9 = livePlayFragment.LLIIII;
                if (bj9 != null && livePlayFragment.LLII == B5V.LIVE_STARTED) {
                    bj9.LJIIJJI();
                    livePlayFragment.LLIIII.LJIIL(livePlayFragment.LJLJI);
                    BTH.LJI();
                    livePlayFragment.Dn(false);
                    ((IGiftService) CN1.LIZ(IGiftService.class)).notifyUserLeaveRoom();
                }
                if (c28268B7o.LIZ == 8 && (b42 = livePlayFragment.r) != null && ((LiveRoomFragment) b42).Jl()) {
                    return;
                }
                if (c28268B7o.LIZ == 6) {
                    livePlayFragment.Il(B3O.LIZJ);
                    livePlayFragment.Ml(B5U.USER_CLOSE_CLICK);
                    return;
                } else {
                    livePlayFragment.Il(B3O.LIZLLL);
                    livePlayFragment.Ml(B5U.USER_CLOSE);
                    return;
                }
            default:
                IDObjectS384S0100000_2 iDObjectS384S0100000_2 = (IDObjectS384S0100000_2) aRunnableS8S0201000_5.l0;
                List list = (List) aRunnableS8S0201000_5.l1;
                InterfaceC36571c5 interfaceC36571c5 = ((C169786lS) iDObjectS384S0100000_2.l0).LJJIJIIJI.LJLL;
                if (interfaceC36571c5 != null && (interfaceC36571c5 instanceof InterfaceC170126m0)) {
                    List<EffectPointModel> LLJJIJIIJIL = ((InterfaceC170126m0) interfaceC36571c5).LLJJIJIIJIL();
                    C169786lS c169786lS = (C169786lS) iDObjectS384S0100000_2.l0;
                    c169786lS.LJIIIIZZ.LJI(LLJJIJIIJIL, c169786lS.LJJII.LIZ);
                    if (C164996dj.LIZIZ(((EffectCategoryResponse) ListProtector.get(list, 0)).getKey())) {
                        ((C169786lS) iDObjectS384S0100000_2.l0).LJIJ(LLJJIJIIJIL, true, false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public static final void run$14(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                CRV crv = (CRV) aRunnableS8S0201000_5.l0;
                crv.LIZ.LJLJI(false, (CRD) aRunnableS8S0201000_5.l1, false);
                return;
            default:
                LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS8S0201000_5.l0;
                int[] iArr = (int[]) aRunnableS8S0201000_5.l1;
                livePlayFragment.getClass();
                int[] iArr2 = new int[4];
                livePlayFragment.Xl(iArr2, iArr[0], iArr[1]);
                if (livePlayFragment.LLLIIL != null) {
                    C28157B3h c28157B3h = new C28157B3h();
                    c28157B3h.LIZ = iArr2[0];
                    c28157B3h.LIZIZ = iArr2[1];
                    c28157B3h.LIZJ = iArr2[2];
                    c28157B3h.LIZLLL = iArr2[3];
                    livePlayFragment.LLLIIL.rv0(LandscapeInteractionMarginData.class, c28157B3h);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$15(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                ARunnableS41S0100000_5 aRunnableS41S0100000_5 = (ARunnableS41S0100000_5) aRunnableS8S0201000_5.l0;
                Object obj = aRunnableS8S0201000_5.l1;
                T t = ((C31319CQx) aRunnableS41S0100000_5.l0).mView;
                if (t != 0) {
                    ((CRA) t).ad();
                    C31319CQx c31319CQx = (C31319CQx) aRunnableS41S0100000_5.l0;
                    ((CRA) c31319CQx.mView).xd0(c31319CQx.LJZI.LJIIIIZZ(obj));
                    return;
                }
                return;
            case 1:
                ViewTreeObserverOnDrawListenerC55314LnK viewTreeObserverOnDrawListenerC55314LnK = (ViewTreeObserverOnDrawListenerC55314LnK) aRunnableS8S0201000_5.l0;
                Context context = (Context) aRunnableS8S0201000_5.l1;
                if (viewTreeObserverOnDrawListenerC55314LnK.LJLILLLLZI.isViewValid()) {
                    C16970lZ.LJFF(context, "common_feed_item_feed");
                    C16970lZ.LJFF(context, "common_feed_item_feed");
                    return;
                }
                return;
            default:
                ProfilePageFragment profilePageFragment = (ProfilePageFragment) aRunnableS8S0201000_5.l0;
                profilePageFragment.LJLJI.LLIFFJFJJ((Aweme) aRunnableS8S0201000_5.l1);
                profilePageFragment.LJLJI.V1(true);
                return;
        }
    }

    public static final void run$16(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        List<Long> list;
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                C31319CQx c31319CQx = (C31319CQx) aRunnableS8S0201000_5.l0;
                CR6 cr6 = (CR6) aRunnableS8S0201000_5.l1;
                c31319CQx.getClass();
                ImDeleteMessage imDeleteMessage = (ImDeleteMessage) cr6;
                if (c31319CQx.mView == 0) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int LJII = c31319CQx.LJZI.LJII() - 1; LJII >= 0; LJII--) {
                    CRD LJ = c31319CQx.LJZI.LJ(LJII);
                    if (LJ.LJJIJIIJIL() && (LJ instanceof CQO)) {
                        CQO cqo = (CQO) LJ;
                        List<Long> list2 = imDeleteMessage.deleteUserIds;
                        if ((list2 != null && list2.contains(Long.valueOf(cqo.LJLILLLLZI()))) || ((list = imDeleteMessage.deleteMsgIds) != null && list.contains(Long.valueOf(cqo.LJIJJLI.getMessageId())))) {
                            int LJIIIIZZ = c31319CQx.LJZI.LJIIIIZZ(LJ);
                            c31319CQx.LJZI.LJIIIZ(LJ);
                            if (LJ instanceof InterfaceC31337CRp) {
                                InterfaceC31337CRp interfaceC31337CRp = (InterfaceC31337CRp) LJ;
                                if (interfaceC31337CRp.LJJJJZI() != null) {
                                    arrayList.add(interfaceC31337CRp);
                                }
                            }
                            if (LJIIIIZZ != -1) {
                                ((CRA) c31319CQx.mView).zJ(LJIIIIZZ);
                                ((CRA) c31319CQx.mView).DT(true);
                            }
                        }
                    }
                }
                c31319CQx.LJIILJJIL(arrayList);
                c31319CQx.LLJJJ.LIZIZ(new ARunnableS8S0201000_5(0, c31319CQx.LJLLLLLL, imDeleteMessage, 10));
                c31319CQx.LLJJJ.LIZIZ(new ARunnableS8S0201000_5(0, c31319CQx.LJLZ, imDeleteMessage, 10));
                return;
            case 1:
                C37392Elw c37392Elw = (C37392Elw) aRunnableS8S0201000_5.l0;
                C37403Em7 c37403Em7 = (C37403Em7) aRunnableS8S0201000_5.l1;
                c37392Elw.getClass();
                if (!TextUtils.isEmpty(c37403Em7.LIZ)) {
                    ((HashMap) c37392Elw.LIZ).put(c37403Em7.LIZ, c37403Em7);
                    return;
                }
                return;
            default:
                ((BaseListFragmentPanel) aRunnableS8S0201000_5.l0).lambda$onFirstDataLoaded$10((String) aRunnableS8S0201000_5.l1);
                return;
        }
    }

    public static final void run$17(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                C31319CQx c31319CQx = (C31319CQx) aRunnableS8S0201000_5.l0;
                MemberMessage memberMessage = (MemberMessage) aRunnableS8S0201000_5.l1;
                if (c31319CQx.mView == 0) {
                    return;
                }
                List<CRD> unmodifiableRawList = c31319CQx.LJZI.LIZLLL;
                o.LJIIIIZZ(unmodifiableRawList, "unmodifiableRawList");
                for (int i = 0; i < unmodifiableRawList.size(); i++) {
                    CRD crd = (CRD) ListProtector.get(unmodifiableRawList, i);
                    if (crd instanceof CQO) {
                        CQL cql = (CQL) crd;
                        if (cql.LJLILLLLZI() == memberMessage.user.getId()) {
                            int LJIIIIZZ = c31319CQx.LJZI.LJIIIIZZ(crd);
                            User user = cql.getUser();
                            if (user != null) {
                                if (user.getUserAttr() == null) {
                                    user.setUserAttr(new UserAttr());
                                }
                                UserAttr userAttr = user.getUserAttr();
                                int i2 = memberMessage.action;
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 != 5) {
                                            if (i2 != 6) {
                                                if (i2 != 9) {
                                                    if (i2 != 10) {
                                                    }
                                                }
                                            } else {
                                                userAttr.isAdmin = false;
                                                if (LJIIIIZZ != -1) {
                                                    ((CRA) c31319CQx.mView).VM(LJIIIIZZ);
                                                }
                                            }
                                        } else {
                                            userAttr.isAdmin = true;
                                            if (LJIIIIZZ != -1) {
                                                ((CRA) c31319CQx.mView).VM(LJIIIIZZ);
                                            }
                                        }
                                    }
                                    userAttr.isMuted = false;
                                }
                                userAttr.isMuted = true;
                            }
                        }
                    }
                }
                return;
            default:
                C31692CcC c31692CcC = (C31692CcC) aRunnableS8S0201000_5.l0;
                DataChannel dataChannel = (DataChannel) aRunnableS8S0201000_5.l1;
                c31692CcC.getClass();
                ISlotService iSlotService = (ISlotService) CN1.LIZ(ISlotService.class);
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) c31692CcC.LJLILLLLZI;
                EnumC30736C4m enumC30736C4m = EnumC30736C4m.SLOT_LIVE_WATCHER_L2_TOOLBAR;
                InterfaceC31095CIh createIconSlotController = iSlotService.createIconSlotController(activityC45651qj, c31692CcC, enumC30736C4m, EnumC31700CcK.PREEMPTION);
                c31692CcC.LJLJI = createIconSlotController;
                createIconSlotController.setDataChannel(dataChannel);
                c31692CcC.LJLJI.load((ActivityC45651qj) c31692CcC.LJLILLLLZI, enumC30736C4m);
                c31692CcC.LJLIL.getLifecycle().addObserver(c31692CcC.LJLJI);
                return;
        }
    }

    public static final void run$18(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        String str;
        int i;
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                C15620jO.LIZIZ((ImageModel) aRunnableS8S0201000_5.l1, ((ViewOnClickListenerC28501BGn) aRunnableS8S0201000_5.l0).LJLIL);
                return;
            case 1:
                LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS8S0201000_5.l0;
                B3P b3p = (B3P) aRunnableS8S0201000_5.l1;
                livePlayFragment.getClass();
                livePlayFragment.Ml(B5U.JUMP_TO_OTHER);
                B42 b42 = livePlayFragment.r;
                if (b42 != null) {
                    ((LiveRoomFragment) b42).Il(b3p.LIZJ, b3p.LJ, b3p.LIZ, b3p.LIZLLL);
                    return;
                }
                return;
            default:
                W5O w5o = (W5O) aRunnableS8S0201000_5.l0;
                Throwable th = (Throwable) aRunnableS8S0201000_5.l1;
                Uri uri = w5o.LIZIZ;
                Context LIZIZ = EF7.LIZIZ();
                if (uri != null) {
                    str = uri.toString();
                } else {
                    str = null;
                }
                try {
                    if (C2NU.LIZ.LIZIZ()) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            String th2 = th.toString();
                            jSONObject.put("errorDesc", th2);
                            jSONObject.put("url", str);
                            jSONObject.put("userId", AccountService.LJIJ().LJFF().getCurUserId());
                            jSONObject.put("networkType", C16880lQ.LLJILLL(LIZIZ));
                            jSONObject.put("url_convert", false);
                            if (!TextUtils.isEmpty("")) {
                                jSONObject.put("caller_id", "");
                            }
                            FUA.LIZIZ("aweme_image_load_log", "image_error", jSONObject);
                            if (!TextUtils.isEmpty(th2)) {
                                if (!th2.contains("canceled") && !th2.contains("Canceled")) {
                                    if (th2.contains("network not available")) {
                                        i = 3;
                                        C09900aA.LJIIJJI("aweme_image_load_error_rate", i, jSONObject);
                                        return;
                                    }
                                }
                                i = 2;
                                C09900aA.LJIIJJI("aweme_image_load_error_rate", i, jSONObject);
                                return;
                            }
                            i = 1;
                            C09900aA.LJIIJJI("aweme_image_load_error_rate", i, jSONObject);
                            return;
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                            return;
                        }
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }

    public static final void run$19(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                C31689Cc9 c31689Cc9 = (C31689Cc9) aRunnableS8S0201000_5.l0;
                DataChannel dataChannel = (DataChannel) aRunnableS8S0201000_5.l1;
                c31689Cc9.getClass();
                ISlotService LJIJJLI = C7N.LJIJJLI();
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) c31689Cc9.LJLILLLLZI;
                EnumC30736C4m enumC30736C4m = EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR;
                InterfaceC31095CIh createIconSlotController = LJIJJLI.createIconSlotController(activityC45651qj, c31689Cc9, enumC30736C4m, EnumC31700CcK.AGGREGATE);
                c31689Cc9.LJLJI = createIconSlotController;
                createIconSlotController.setDataChannel(dataChannel);
                c31689Cc9.LJLJI.load((ActivityC45651qj) c31689Cc9.LJLILLLLZI, enumC30736C4m);
                c31689Cc9.LJLIL.getLifecycle().addObserver(c31689Cc9.LJLJI);
                return;
            case 1:
                CommentWidget commentWidget = (CommentWidget) aRunnableS8S0201000_5.l0;
                CI2 ci2 = (CI2) aRunnableS8S0201000_5.l1;
                commentWidget.getClass();
                commentWidget.LLIIJLIL(ci2.LJIIJ, ci2.LJIIJJI, false, true, ci2.LJIILIIL, null, null);
                BKY.LIZIZ().LJ();
                commentWidget.LLIFFJFJJ = null;
                BZI LIZ = C28787BRn.LIZ("livesdk_comment_rethink_post_ck");
                C06510Nj.LIZ((C29374Bfu) C279117r.LIZJ(LIZ, commentWidget.dataChannel), LIZ, "user_id");
                LIZ.LJIJJ(ci2.LJIIJ, "comment");
                LIZ.LJIJJ(Integer.valueOf(TextUtils.equals(ci2.LJIIIZ, ci2.LJIIJ) ? 1 : 0), "resend_same_cmt");
                UFE.LIZIZ(commentWidget.LLIIII ? 1 : 0, LIZ, "if_click_cg");
                return;
            default:
                ((DetailFragmentPanel) aRunnableS8S0201000_5.l0).LJJL((ViewGroup) aRunnableS8S0201000_5.l1);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Integer, O] */
    public static final void run$2(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                final PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) ((Fragment) aRunnableS8S0201000_5.l0);
                View view = (View) aRunnableS8S0201000_5.l1;
                ((C32537Cpp) portraitAudienceInteractionFragment.mDataChannel.gv0(C30180Bsu.class)).LIZ = Integer.valueOf(view.getHeight());
                ((InterfaceC30182Bsw) view).setOnSizeChangedListener(new C54() { // from class: X.Bsv
                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Integer, O] */
                    @Override // X.C54
                    public final void LIZ(int i, int i2) {
                        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment2 = PortraitAudienceInteractionFragment.this;
                        if (i == i2) {
                            portraitAudienceInteractionFragment2.getClass();
                            return;
                        }
                        ((C32537Cpp) portraitAudienceInteractionFragment2.mDataChannel.gv0(C30180Bsu.class)).LIZ = Integer.valueOf(i);
                        portraitAudienceInteractionFragment2.mDataChannel.qv0(LivePlayContainerViewHeightChangedEvent.class, Integer.valueOf(i));
                    }
                });
                return;
            default:
                SearchContainerFragment searchContainerFragment = (SearchContainerFragment) ((Fragment) aRunnableS8S0201000_5.l0);
                JYS jys = (JYS) aRunnableS8S0201000_5.l1;
                VW3 vw3 = searchContainerFragment.LJLJJI;
                if (vw3 != null) {
                    vw3.setCurrentItem(jys.LJLIL, false);
                    return;
                }
                return;
        }
    }

    public static final void run$3(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        BJE bje;
        BJE bje2;
        Object obj;
        String str;
        String str2;
        HashMap<String, String> hashMap;
        BJL bjl;
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS8S0201000_5.l0;
                Room room = (Room) aRunnableS8S0201000_5.l1;
                livePlayFragment.getClass();
                ((IGiftService) CN1.LIZ(IGiftService.class)).syncGiftList(livePlayFragment.p, room.getId(), 2, false);
                return;
            case 1:
                BLH blh = (BLH) aRunnableS8S0201000_5.l0;
                EnterRoomConfig enterRoomConfig = (EnterRoomConfig) aRunnableS8S0201000_5.l1;
                blh.getClass();
                EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                String str3 = logData.requestPage;
                String str4 = logData.anchorType;
                String str5 = logData.requestId;
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                long j = roomsData.roomId;
                String str6 = roomsData.sourceType;
                String str7 = roomsData.sceneId;
                String str8 = logData.gdLabel;
                String str9 = logData.anchorId;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("room_id", String.valueOf(j));
                hashMap2.put("anchor_id", String.valueOf(str9));
                hashMap2.put("enter_from_merge", enterRoomConfig.mRoomsData.enterFromMerge);
                hashMap2.put("enter_method", enterRoomConfig.mRoomsData.enterMethod);
                hashMap2.put("request_id", str5);
                if (!TextUtils.isEmpty(str6)) {
                    hashMap2.put("moment_room_source", str6);
                }
                hashMap2.put("is_sale", "unknown");
                hashMap2.put("orientation", String.valueOf(enterRoomConfig.mRoomsData.orientation));
                if (!C38354F3m.LJ(enterRoomConfig.mRoomsData.windowMode)) {
                    hashMap2.put("live_window_mode", enterRoomConfig.mRoomsData.windowMode);
                }
                long j2 = enterRoomConfig.mRoomsData.smallPictureOrder;
                if (j2 != -1) {
                    hashMap2.put("small_picture_order", String.valueOf(j2));
                }
                if (blh.LIZ) {
                    if (!TextUtils.isEmpty(enterRoomConfig.mLogData.requestId)) {
                        hashMap2.put("request_id", enterRoomConfig.mLogData.requestId);
                    }
                    if (!TextUtils.isEmpty(enterRoomConfig.mLogData.logPb)) {
                        hashMap2.put("log_pb", enterRoomConfig.mLogData.logPb);
                    }
                    B82.LIZIZ(enterRoomConfig);
                    blh.LIZ = false;
                } else {
                    Long valueOf = Long.valueOf(j);
                    C28246B6s LIZIZ = BJN.LIZIZ();
                    if (LIZIZ != null && (bje2 = LIZIZ.LJ) != null) {
                        bje2.LJ = valueOf;
                    }
                    Long valueOf2 = Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                    C28246B6s LIZIZ2 = BJN.LIZIZ();
                    if (LIZIZ2 != null && (bje = LIZIZ2.LJ) != null) {
                        bje.LJFF = valueOf2;
                    }
                    B82.LIZIZ(enterRoomConfig);
                }
                String str10 = "draw";
                if (!TextUtils.isEmpty(str7) && "draw".equals(enterRoomConfig.mRoomsData.enterType)) {
                    hashMap2.put("scene_id", str7);
                }
                String str11 = "1";
                if (!TextUtils.isEmpty(str8) && "click_push_live_cd_user".equals(str8)) {
                    hashMap2.put("is_subscribe", "1");
                } else {
                    hashMap2.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
                }
                hashMap2.put("growth_deepevent", String.valueOf(1));
                if (enterRoomConfig.mLogData.isVideoHead) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap2.put("is_video_head", obj);
                LiveMode liveMode = enterRoomConfig.mRoomsData.streamType;
                if (!LiveReplaceFirstStreamTypeSetting.INSTANCE.getValue()) {
                    LiveMode liveMode2 = enterRoomConfig.mRoomsData.streamType;
                    LiveMode liveMode3 = LiveMode.VIDEO;
                    if (liveMode2 == liveMode3 && enterRoomConfig.mStreamData.streamType != liveMode3.ordinal()) {
                        liveMode = LiveMode.valueOf(enterRoomConfig.mStreamData.streamType);
                    }
                }
                hashMap2.put("live_type", C28509BGv.LIZ(liveMode));
                hashMap2.put("request_page", str3);
                hashMap2.put("anchor_type", str4);
                if (!C38354F3m.LJ(C28594BKc.LIZJ().LIZLLL())) {
                    hashMap2.put("enter_live_method", C28594BKc.LIZJ().LIZLLL());
                }
                hashMap2.put("request_page", C28594BKc.LIZJ().LIZLLL());
                C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
                if (c28246B6s == null || (bjl = c28246B6s.LJFF) == null || (str = bjl.LJFF) == null) {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap2.put("list_item_id", String.valueOf(j));
                }
                if (!enterRoomConfig.mRoomsData.isBackPreRoom) {
                    str11 = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap2.put("is_return", str11);
                if (!TextUtils.isEmpty(enterRoomConfig.mLogData.liveReason)) {
                    hashMap2.put("live_reason", enterRoomConfig.mLogData.liveReason);
                }
                C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
                hashMap2.put("has_banner", String.valueOf(c08680Vs.LJII()));
                if (!C38354F3m.LJ(enterRoomConfig.mRoomsData.followStatus)) {
                    hashMap2.put("follow_status", enterRoomConfig.mRoomsData.followStatus);
                }
                EnterRoomConfig.ECWrapData eCWrapData = enterRoomConfig.mECData;
                if (eCWrapData != null && (hashMap = eCWrapData.ecCommonExtraParam) != null) {
                    hashMap2.putAll(hashMap);
                }
                if (!C38354F3m.LJ(enterRoomConfig.mLogData.previewCardClickArea)) {
                    hashMap2.put("click_area", enterRoomConfig.mLogData.previewCardClickArea);
                }
                long j3 = enterRoomConfig.mLogData.cardRoomId;
                if (j3 > 0) {
                    hashMap2.put("card_room_id", String.valueOf(j3));
                }
                if (enterRoomConfig.mLogData.fromRoomId > 0 || "draw".equals(enterRoomConfig.mRoomsData.actionType)) {
                    hashMap2.put("from_room_id", String.valueOf(enterRoomConfig.mLogData.fromRoomId));
                }
                ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
                hashMap2.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
                hashMap2.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
                if (!"-1".equals(enterRoomConfig.mLogData.drawAction) || "draw".equals(enterRoomConfig.mRoomsData.actionType)) {
                    hashMap2.put("draw_action", enterRoomConfig.mLogData.drawAction);
                }
                hashMap2.put("initial_follow_status", enterRoomConfig.mRoomsData.followStatus);
                hashMap2.put("is_ecom", C78847Ux1.LJJJI(enterRoomConfig));
                if (!TextUtils.isEmpty(enterRoomConfig.mLogData.clickMethod)) {
                    hashMap2.put("click_method", enterRoomConfig.mLogData.clickMethod);
                }
                if (!TextUtils.equals(enterRoomConfig.mRoomsData.enterRoomScene, "inner_draw")) {
                    str10 = "click";
                }
                hashMap2.put("user_action_type", str10);
                hashMap2.put("if_gift_effect", String.valueOf(enterRoomConfig.mLogData.giftEffectStart));
                hashMap2.put("is_complete_gift_effect", String.valueOf(enterRoomConfig.mLogData.giftEffectFinish));
                C28837BTl LJIIIIZZ = C28835BTj.LJIIIIZZ(enterRoomConfig);
                LJIIIIZZ.LJIIJ = "user_live_duration";
                if (C15380j0.LJIILLIIL()) {
                    str2 = "portrait";
                } else {
                    str2 = "landscape";
                }
                hashMap2.putAll(BJB.LIZ());
                Map<String, String> map = enterRoomConfig.mRoomsData.gameLiveExtra;
                if (map != null && map.get("tag_name") != null) {
                    hashMap2.put("live_game_name", enterRoomConfig.mRoomsData.gameLiveExtra.get("tag_name"));
                }
                BZI LIZ = C28787BRn.LIZ("rec_live_play");
                LIZ.LJJIFFI(hashMap2);
                LIZ.LJIIZILJ();
                LIZ.LIZLLL(LJIIIIZZ);
                LIZ.LJIJJ(C08680Vs.LIZLLL(enterRoomConfig.mLogData.bottomLeftRoomLabel), "connection_type");
                LIZ.LJIIIZ("live_view");
                LIZ.LIZJ(enterRoomConfig.mRoomsData.enterType);
                LIZ.LJIJJ(str2, "room_orientation");
                LIZ.LJIJJ(c08680Vs.LJIIJ, "from_drawer_tab");
                LIZ.LJJIIJZLJL();
                return;
            case 2:
                long[] jArr = (long[]) aRunnableS8S0201000_5.l0;
                long[][] jArr2 = (long[][]) aRunnableS8S0201000_5.l1;
                try {
                    C61360O6i.LIZJ().getClass();
                    if (O7D.LIZ == null) {
                        synchronized (O7D.class) {
                            if (O7D.LIZ == null) {
                                O7D.LIZ = new O7D();
                            }
                        }
                    }
                    O7D.LIZ.LIZ(jArr, jArr2);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ImageHeaderInterceptor imageHeaderInterceptor = (ImageHeaderInterceptor) aRunnableS8S0201000_5.l0;
                Context context = (Context) aRunnableS8S0201000_5.l1;
                imageHeaderInterceptor.getClass();
                imageHeaderInterceptor.LJLJLJ = C46625IRp.LIZLLL(context).LIZ();
                return;
            default:
                ((TTVideoEngineImpl) aRunnableS8S0201000_5.l0).LJJLIIIJILLIZJL((Surface) aRunnableS8S0201000_5.l1);
                return;
        }
    }

    public static final void run$4(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS8S0201000_5.l0;
                Room room = (Room) aRunnableS8S0201000_5.l1;
                livePlayFragment.getClass();
                ((IGiftService) CN1.LIZ(IGiftService.class)).resetRoomStatus();
                if (room != null && room.getRoomAuthStatus() != null && room.getRoomAuthStatus().enableGift) {
                    ((IGiftService) CN1.LIZ(IGiftService.class)).getFirstRechargeManager().LIZ(room.getId(), room.getOwnerUserId());
                    ((IGiftService) CN1.LIZ(IGiftService.class)).syncGiftList(livePlayFragment.p, room.getId(), 2, false);
                    return;
                }
                return;
            case 1:
                ((C2V) aRunnableS8S0201000_5.l0).LIZIZ((UIAnnotationErrorCode) aRunnableS8S0201000_5.l1);
                return;
            case 2:
                Object obj = aRunnableS8S0201000_5.l0;
                Intent intent = (Intent) aRunnableS8S0201000_5.l1;
                obj.getClass();
                C67187QYl.LIZ(intent);
                return;
            default:
                C46748IWi.LJJIJLIJ((C46748IWi) aRunnableS8S0201000_5.l0, (Surface) aRunnableS8S0201000_5.l1);
                return;
        }
    }

    public static final void run$5(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS8S0201000_5.l0;
                B5A b5a = (B5A) aRunnableS8S0201000_5.l1;
                livePlayFragment.getClass();
                if (b5a.LJI != null) {
                    int[] iArr = new int[2];
                    B35 b35 = livePlayFragment.LLIIIJ;
                    if (b35 != null) {
                        b35.getVideoSize(iArr);
                    }
                    b5a.LJI.J2(new C75234Tfq(iArr[0], iArr[1], 0, b5a.LIZJ, b5a.LIZ, b5a.LIZIZ, livePlayFragment.LLILL.LIZ.getLeft(), livePlayFragment.LLILL.LIZ.getTop(), livePlayFragment.LLILL.LIZ.getWidth(), livePlayFragment.LLILL.LIZ.getHeight()));
                    return;
                }
                return;
            default:
                Map map = (Map) aRunnableS8S0201000_5.l0;
                PQZ fluencyInfo = (PQZ) aRunnableS8S0201000_5.l1;
                o.LJIIIZ(fluencyInfo, "$fluencyInfo");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                List<InterfaceC28215B5n> list = PQB.LIZ;
                ArrayList arrayList = new ArrayList();
                Iterator<InterfaceC28215B5n> it = list.iterator();
                while (it.hasNext()) {
                    Map<String, String> LIZ = it.next().LIZ(fluencyInfo);
                    if (LIZ != null) {
                        arrayList.add(LIZ);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    linkedHashMap.putAll((Map) it2.next());
                }
                Map data = Collections.unmodifiableMap(linkedHashMap);
                JSONObject jSONObject = new JSONObject();
                o.LJIIIIZZ(data, "data");
                for (Map.Entry entry : data.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                B8B b8b = new B8B(jSONObject, fluencyInfo.LJLIL, data);
                Iterator<InterfaceC28214B5m> it3 = PQB.LIZIZ.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZ(b8b);
                }
                return;
        }
    }

    public static final void run$6(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        boolean LIZ;
        try {
            aRunnableS8S0201000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        boolean LIZ;
        try {
            aRunnableS8S0201000_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                CommentWidget commentWidget = (CommentWidget) aRunnableS8S0201000_5.l0;
                CI2 ci2 = (CI2) aRunnableS8S0201000_5.l1;
                commentWidget.dataChannel.qv0(UserWannaSendMessageEvent.class, new C30926CBu(3, ci2.LJIIJ));
                BKY.LIZIZ().LJ();
                commentWidget.LLIFFJFJJ = null;
                commentWidget.LLIIIL = ci2;
                BZI LIZ = C28787BRn.LIZ("livesdk_comment_rethink_edit_ck");
                C06510Nj.LIZ((C29374Bfu) C279117r.LIZJ(LIZ, commentWidget.dataChannel), LIZ, "user_id");
                LIZ.LJIJJ(ci2.LJIIJ, "comment");
                LIZ.LJIJJ(Integer.valueOf(TextUtils.equals(ci2.LJIIIZ, ci2.LJIIJ) ? 1 : 0), "resend_same_cmt");
                LIZ.LJIJJ(Integer.valueOf(commentWidget.LLIIII ? 1 : 0), "if_click_cg");
                LIZ.LJJIIJZLJL();
                commentWidget.LLIIIZ = SystemClock.uptimeMillis();
                return;
            case 1:
                ((InterfaceC31104CIq) aRunnableS8S0201000_5.l0).LJI((File) aRunnableS8S0201000_5.l1);
                return;
            case 2:
                ((DetailFragmentPanel) aRunnableS8S0201000_5.l0).LJJLI((ViewGroup) aRunnableS8S0201000_5.l1);
                return;
            case 3:
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) aRunnableS8S0201000_5.l0;
                View view = (View) aRunnableS8S0201000_5.l1;
                horizontalScrollView.getClass();
                horizontalScrollView.smoothScrollTo(((view.getRight() + view.getLeft()) / 2) - (horizontalScrollView.getWidth() / 2), 0);
                return;
            default:
                DVideoPreloadManager this$0 = (DVideoPreloadManager) aRunnableS8S0201000_5.l0;
                InterfaceC65784Pro block = (InterfaceC65784Pro) aRunnableS8S0201000_5.l1;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIZ(block, "$block");
                try {
                    new AqS155S0200000_8(this$0, (DVideoPreloadManager) block, (InterfaceC65784Pro<C76800UCe>) 47).invoke();
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }

    public static final void run$9(ARunnableS8S0201000_5 aRunnableS8S0201000_5) {
        boolean z;
        switch (aRunnableS8S0201000_5.i2) {
            case 0:
                CommentWidget commentWidget = (CommentWidget) aRunnableS8S0201000_5.l0;
                commentWidget.dataChannel.qv0(UserWannaSendMessageEvent.class, new C30926CBu(3, ((CI2) aRunnableS8S0201000_5.l1).LJIIJ));
                commentWidget.LLILII("livesdk_comment_rethink_edit_click");
                commentWidget.LLIIIZ = SystemClock.uptimeMillis();
                return;
            case 1:
                Object obj = aRunnableS8S0201000_5.l0;
                Queue queue = (Queue) aRunnableS8S0201000_5.l1;
                obj.getClass();
                while (true) {
                    Message message = (Message) queue.poll();
                    if (message != null) {
                        Handler target = message.getTarget();
                        try {
                            Field field = C36595EXv.LIZIZ;
                            field.set(message, Integer.valueOf(((Integer) field.get(message)).intValue() & (-2)));
                            z = true;
                        } catch (Throwable unused) {
                            z = false;
                        }
                        if (z) {
                            target.sendMessageAtTime(message, 1L);
                        } else {
                            Message.obtain().copyFrom(message);
                            try {
                                C36595EXv.LIZ.invoke(message, new Object[0]);
                            } catch (Throwable unused2) {
                            }
                            target.sendMessageAtTime(message, 1L);
                        }
                        C62822Ol8 c62822Ol8 = C34710Djm.LJJLIIIJJI;
                        if (((Number) c62822Ol8.getValue()).longValue() != -1) {
                            try {
                                Thread.sleep(((Number) c62822Ol8.getValue()).longValue());
                            } catch (InterruptedException unused3) {
                            }
                        }
                    } else {
                        return;
                    }
                }
            default:
                EcSearchContainerFragment ecSearchContainerFragment = (EcSearchContainerFragment) aRunnableS8S0201000_5.l0;
                K8R k8r = (K8R) aRunnableS8S0201000_5.l1;
                if (ecSearchContainerFragment.LJLJJL != null) {
                    int i = k8r.LJLIL;
                    if (C48054ItW.LIZ()) {
                        ecSearchContainerFragment.LJLJJL.LIZLLL(i, false);
                        return;
                    } else {
                        ecSearchContainerFragment.LJLJJI.setCurrentItem(i, false);
                        return;
                    }
                }
                return;
        }
    }

    public ARunnableS8S0201000_5(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
