package X;

import Y.ARunnableS24S0200000_5;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.ai.api.trigger.ILiveTriggerService;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.extendedscreen.ExtendedScreenWidget;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.usercard.IUserCardService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.CommentOrMessageData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomNotifyEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveSelfLinkedLikeBehaviorSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;
import com.bytedance.android.livesdk.livesetting.performance.GoLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.PostponeRequestBatchShareListSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.OperateToastMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.BrP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30087BrP implements InterfaceC2301691o, InterfaceC30133Bs9, InterfaceC30135BsB, InterfaceC27469AqH, InterfaceC30152BsS {
    public final Context LJLIL;
    public final BaseFragment LJLILLLLZI;
    public final InterfaceC30105Brh LJLJI;
    public final View LJLJJI;
    public final RecyclableWidgetManager LJLJJL;
    public C29125Bbt LJLJJLL;
    public final TextView LJLJL;
    public final InterfaceC30182Bsw LJLJLJ;
    public final View LJLJLLL;
    public final ActivityC45651qj LJLL;
    public DataChannel LJLLI;
    public Room LJLLILLLL;
    public final C73318Sq2 LJLLJ;
    public IPublicScreenHolderWidget LJLLL;
    public LiveRecyclableWidget LJLLLL;
    public InterfaceC30144BsK LJLLLLLL;
    public final C29936Boy LJLZ;
    public InterfaceC30146BsM LJZ;
    public C29388Bg8 LJZI;
    public C30159BsZ LJZL;
    public C30092BrU LL;
    public final C62822Ol8 LLD;
    public C30093BrV LLF;
    public AbstractC30130Bs6 LLFF;
    public ExtendedScreenWidget LLFFF;
    public final C30145BsL LLFII;
    public final Layer2PriorityManager LLFZ;
    public Object LLI;
    public Object LLIFFJFJJ;

    public final void LIZJ() {
        RecyclableWidgetManager recyclableWidgetManager = this.LJLJJL;
        Object value = C7N.LJJI.getValue();
        o.LJIIIIZZ(value, "<get-rankService>(...)");
        recyclableWidgetManager.load(R.id.a9s, ((IRankService) value).kj(true), true, new Object[]{new C30147BsN(SystemClock.elapsedRealtime())});
    }

    public final void LJII() {
        IMessageManager iMessageManager;
        BaseFragment fragment = this.LJLILLLLZI;
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null) {
            o.LJIIIZ(fragment, "fragment");
            if (LiveClientTriggerConfig.INSTANCE.enable()) {
                ((ILiveTriggerService) C24120x6.LIZ.getValue()).bD(fragment, dataChannel);
            }
            C30770C5u.LJFF(EnumC30414Bwg.EVENT_PAGE_BROADCAST);
            C30092BrU c30092BrU = this.LL;
            if (c30092BrU != null) {
                IMessageManager iMessageManager2 = c30092BrU.LJLILLLLZI;
                if (iMessageManager2 != null) {
                    iMessageManager2.removeMessageListener(c30092BrU);
                }
                c30092BrU.LJLIL = null;
            }
            C29388Bg8 c29388Bg8 = this.LJZI;
            if (c29388Bg8 != null) {
                c29388Bg8.detachView();
            }
            InterfaceC30146BsM interfaceC30146BsM = this.LJZ;
            if (interfaceC30146BsM != null) {
                interfaceC30146BsM.onDestroy();
            }
            C30159BsZ c30159BsZ = this.LJZL;
            if (c30159BsZ != null) {
                if (c30159BsZ.LJLJJI != null && (iMessageManager = C7N.LJIILL().get(c30159BsZ.LJLJJI.getId())) != null) {
                    iMessageManager.removeMessageListener(c30159BsZ);
                }
                if (LiveMemoryOptSetting.INSTANCE.enableMemoryOpt()) {
                    ((IHostUser) CN1.LIZ(IHostUser.class)).popCaptchaV2(c30159BsZ.LJLIL.mo49getActivity(), "", new T2J());
                }
                if (GoLiveMemoryLeakOptSetting.INSTANCE.enable()) {
                    ((IHostUser) CN1.LIZ(IHostUser.class)).popCaptchaV2(c30159BsZ.LJLIL.mo49getActivity(), "", null);
                }
                C1P c1p = c30159BsZ.LJLJI;
                c1p.getClass();
                C72818Shy.LJII("live_anchor_center_mask_will_appear", c1p);
                C72818Shy.LJII("live_anchor_center_mask_will_disappear", c1p);
                ((LinkedList) c1p.LJLJJI).clear();
            }
            CKB.INSTANCE.stop();
            this.LJLLJ.LIZLLL();
            this.LJLJJL.unload(this.LJLLL);
            C30093BrV c30093BrV = this.LLF;
            if (c30093BrV != null) {
                IMessageManager iMessageManager3 = c30093BrV.LJLILLLLZI;
                if (iMessageManager3 != null) {
                    iMessageManager3.removeMessageListener(c30093BrV);
                }
                c30093BrV.LJLILLLLZI = null;
                c30093BrV.LJLIL = null;
            }
            this.LLF = null;
            IMessageService LJIILL = C7N.LJIILL();
            Room room = this.LJLLILLLL;
            if (room != null) {
                IMessageManager iMessageManager4 = LJIILL.get(room.getId());
                if (iMessageManager4 != null) {
                    iMessageManager4.removeEventListener(this.LJLJJLL);
                }
                IMessageService LJIILL2 = C7N.LJIILL();
                Room room2 = this.LJLLILLLL;
                if (room2 != null) {
                    IMessageManager iMessageManager5 = LJIILL2.get(room2.getId());
                    if (iMessageManager5 != null) {
                        iMessageManager5.stopMessage(new C30176Bsq(0));
                    }
                    this.LJLJJLL = null;
                    InterfaceC30182Bsw interfaceC30182Bsw = this.LJLJLJ;
                    if (interfaceC30182Bsw != null) {
                        interfaceC30182Bsw.LJJLI();
                    }
                    IRoomFunctionService LJIJI = C7N.LJIJI();
                    DataChannel dataChannel2 = this.LJLLI;
                    if (dataChannel2 != null) {
                        Room room3 = this.LJLLILLLL;
                        if (room3 != null) {
                            LJIJI.LLFFF(room3, dataChannel2);
                            IRoomFunctionService LJIJI2 = C7N.LJIJI();
                            if (this.LJLLI != null) {
                                Room room4 = this.LJLLILLLL;
                                if (room4 != null) {
                                    LJIJI2.fm(room4);
                                    IBannerService LIZJ = C7N.LIZJ();
                                    DataChannel dataChannel3 = this.LJLLI;
                                    if (dataChannel3 != null) {
                                        Room room5 = this.LJLLILLLL;
                                        if (room5 != null) {
                                            LIZJ.LLFFF(room5, dataChannel3);
                                            C7N.LJIJI().ZO();
                                            IPublicScreenService LJIIZILJ = C7N.LJIIZILJ();
                                            DataChannel dataChannel4 = this.LJLLI;
                                            if (dataChannel4 != null) {
                                                Room room6 = this.LJLLILLLL;
                                                if (room6 != null) {
                                                    LJIIZILJ.LLFFF(room6, dataChannel4);
                                                    ISubscribeService LJIL = C7N.LJIL();
                                                    DataChannel dataChannel5 = this.LJLLI;
                                                    if (dataChannel5 != null) {
                                                        LJIL.dq(dataChannel5);
                                                        BMS.LIZ.clear();
                                                        return;
                                                    } else {
                                                        o.LJIJI("mDataChannel");
                                                        throw null;
                                                    }
                                                }
                                                o.LJIJI("mRoom");
                                                throw null;
                                            }
                                            o.LJIJI("mDataChannel");
                                            throw null;
                                        }
                                        o.LJIJI("mRoom");
                                        throw null;
                                    }
                                    o.LJIJI("mDataChannel");
                                    throw null;
                                }
                                o.LJIJI("mRoom");
                                throw null;
                            }
                            o.LJIJI("mDataChannel");
                            throw null;
                        }
                        o.LJIJI("mRoom");
                        throw null;
                    }
                    o.LJIJI("mDataChannel");
                    throw null;
                }
                o.LJIJI("mRoom");
                throw null;
            }
            o.LJIJI("mRoom");
            throw null;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L16;
     */
    @Override // X.InterfaceC27469AqH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r6 = this;
            X.Ol8 r0 = X.C7N.LJI
            java.lang.Object r5 = r0.getValue()
            java.lang.String r0 = "<get-hostCreativeTool>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            com.bytedance.android.livesdkapi.host.IHostCreativeTool r5 = (com.bytedance.android.livesdkapi.host.IHostCreativeTool) r5
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.LJLLI
            r4 = 0
            java.lang.String r3 = "mDataChannel"
            if (r1 == 0) goto L44
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus> r0 = com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus.class
            java.lang.Object r1 = r1.kv0(r0)
            X.CKs r0 = X.EnumC31158CKs.SHOW
            r2 = 1
            if (r1 != r0) goto L2d
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.LJLLI
            if (r1 == 0) goto L29
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveExtendScreenCloseEvent> r0 = com.bytedance.android.livesdk.dataChannel.LiveExtendScreenCloseEvent.class
            r1.pv0(r0)
            return r2
        L29:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r4
        L2d:
            boolean r0 = r5.isShowStickerView()
            if (r0 == 0) goto L3a
            r5.hideStickerView()
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L43
        L3a:
            X.T0h r1 = X.C73943T0h.LIZ()
            r0 = 8
            X.UPJ.LJFF(r0, r1)
        L43:
            return r2
        L44:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30087BrP.onBackPressed():boolean");
    }

    public final void LIZIZ() {
        IBarrageService LIZLLL = C7N.LIZLLL();
        Room room = this.LJLLILLLL;
        if (room != null) {
            InterfaceC29980Bpg hq0 = LIZLLL.hq0(room.getId());
            if (hq0 != null && hq0.isEnabled()) {
                if (hq0.LIZIZ()) {
                    this.LJLJJL.load(R.id.jna, C7N.LIZLLL().Rc0(hq0));
                    if (LiveSelfLinkedLikeBehaviorSetting.INSTANCE.isSelfLikeLinkedBreathAnimatorEnable()) {
                        this.LJLJJL.load(R.id.frh, C7N.LIZLLL().w40());
                    }
                }
                if (hq0.LJIIIZ()) {
                    this.LJLJJL.load(R.id.he7, C7N.LIZLLL().Oa(hq0));
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("mRoom");
        throw null;
    }

    public final void LJI() {
        String str;
        RoomAuthStatus roomAuthStatus;
        Integer valueOf;
        C29919Boh LIZ = C29917Bof.LIZ();
        LIZ.LIZ.clear();
        LIZ.LIZJ.removeCallbacksAndMessages(null);
        LIZ.LIZLLL = null;
        CKB.INSTANCE.stop();
        IBarrageService LIZLLL = C7N.LIZLLL();
        Room room = this.LJLLILLLL;
        if (room != null) {
            LIZLLL.zM(room.getId());
            DataChannel dataChannel = this.LJLLI;
            if (dataChannel != null) {
                dataChannel.jv0(this);
                B5D b5d = (B5D) this.LLD.getValue();
                if (b5d != null) {
                    Room room2 = this.LJLLILLLL;
                    if (room2 != null) {
                        b5d.LIZ(room2.getId());
                    } else {
                        o.LJIJI("mRoom");
                        throw null;
                    }
                }
                BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_end_rankings_status");
                DataChannel dataChannel2 = this.LJLLI;
                if (dataChannel2 != null) {
                    LIZ2.LJIILLIIL(dataChannel2);
                    DataChannel dataChannel3 = this.LJLLI;
                    if (dataChannel3 != null) {
                        Room room3 = (Room) dataChannel3.kv0(RoomChannel.class);
                        if (room3 == null || (roomAuthStatus = room3.getRoomAuthStatus()) == null || (valueOf = Integer.valueOf(roomAuthStatus.getGiftRankSwitchStatus())) == null || valueOf.intValue() != 2) {
                            str = "open";
                        } else {
                            str = "close";
                        }
                        LIZ2.LJIJJ(str, "ranking_status");
                        LIZ2.LJJIIJZLJL();
                        BKY LIZIZ = BKY.LIZIZ();
                        if (LIZIZ.LIZ) {
                            LIZIZ.LIZ = false;
                            LIZIZ.LIZIZ = 0;
                            LIZIZ.LIZJ = false;
                        }
                        ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).mu0();
                        IToolbarService LJJ = C7N.LJJ();
                        DataChannel dataChannel4 = this.LJLLI;
                        if (dataChannel4 != null) {
                            LJJ.N0(dataChannel4);
                            return;
                        } else {
                            o.LJIJI("mDataChannel");
                            throw null;
                        }
                    }
                    o.LJIJI("mDataChannel");
                    throw null;
                }
                o.LJIJI("mDataChannel");
                throw null;
            }
            o.LJIJI("mDataChannel");
            throw null;
        }
        o.LJIJI("mRoom");
        throw null;
    }

    public final void LIZ(IBannerService iBannerService) {
        if (this.LJLLLL == null) {
            this.LJLLLL = this.LJLJJL.load(R.id.lfv, iBannerService.YS(true), true, new Object[]{new C30147BsN(SystemClock.elapsedRealtime())});
        }
        BaseFragment baseFragment = this.LJLILLLLZI;
        Room room = this.LJLLILLLL;
        if (room != null) {
            iBannerService.wS(baseFragment, room.getId(), true);
        } else {
            o.LJIJI("mRoom");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0302, code lost:
    
        if (X.C29137Bc5.LIZIZ(r0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f9, code lost:
    
        if (r0.getStreamType() == com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:280:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30087BrP.LIZLLL(android.os.Bundle):void");
    }

    @Override // X.InterfaceC30135BsB
    public final void onControlMessage(ControlMessage message) {
        o.LJIIIZ(message, "message");
        if (!this.LJLILLLLZI.isViewValid()) {
            return;
        }
        int i = message.action;
        if (i != 2) {
            if (i != 4) {
                return;
            }
            C73943T0h LIZ = C73943T0h.LIZ();
            C28268B7o c28268B7o = new C28268B7o(7);
            c28268B7o.LIZJ = message;
            LIZ.LIZIZ(c28268B7o);
            if (!C38354F3m.LJ(message.tips)) {
                C30868C9o.LJI(message.tips);
            }
            JSONObject jSONObject = new JSONObject();
            C05630Jz.LIZ(0, "error_code", jSONObject);
            C05630Jz.LJI(jSONObject, "error_msg", message.tips);
            C0K2.LJIIIIZZ("ttlive_anchor_close_room", 0, jSONObject);
            return;
        }
        AbstractC30130Bs6 abstractC30130Bs6 = this.LLFF;
        if (abstractC30130Bs6 != null) {
            abstractC30130Bs6.LIZIZ(2);
            Room room = this.LJLLILLLL;
            if (room != null) {
                if (room.getMosaicStatus() != 0) {
                    return;
                }
                this.LJLJL.setVisibility(8);
                JSONObject jSONObject2 = new JSONObject();
                C05630Jz.LIZ(0, "error_code", jSONObject2);
                C05630Jz.LJI(jSONObject2, "error_msg", "action_resume");
                C0K2.LJIIIIZZ("ttlive_control_message_status", 0, jSONObject2);
                return;
            }
            o.LJIJI("mRoom");
            throw null;
        }
        o.LJIJI("mLiveStatusListener");
        throw null;
    }

    @Override // X.InterfaceC30133Bs9
    public final void onPlatformMessage(BaseMessage baseMessage) {
        String str;
        if (baseMessage instanceof RoomNotifyMessage) {
            DataChannel dataChannel = this.LJLLI;
            if (dataChannel != null) {
                dataChannel.qv0(RoomNotifyEvent.class, baseMessage);
                return;
            } else {
                o.LJIJI("mDataChannel");
                throw null;
            }
        }
        if (baseMessage instanceof OperateToastMessage) {
            OperateToastMessage operateToastMessage = (OperateToastMessage) baseMessage;
            if (operateToastMessage.supportDisplayText()) {
                C29827BnD.LIZJ(operateToastMessage);
                Text text = operateToastMessage.baseMessage.displayText;
                String str2 = text.defaultPattern;
                String str3 = text.key;
                if (!TextUtils.isEmpty(str3)) {
                    str = C86881Y7x.LIZIZ().LIZ(str3);
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                Spannable LJI = CXJ.LJI(str2, text, null);
                if (operateToastMessage.delayDuration > 0) {
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS24S0200000_5(LJI, operateToastMessage, 62), operateToastMessage.delayDuration);
                } else {
                    C30868C9o.LJ(operateToastMessage.displayDuration, C15380j0.LIZLLL(), LJI.toString());
                }
            } else {
                C29827BnD.LIZ(operateToastMessage, "characterParsingError");
            }
            CKB.INSTANCE.onMessageFinish();
            return;
        }
        CKB.INSTANCE.onMessageFinish();
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.HashMap, O] */
    public final void LJIIIIZZ(View view, Bundle bundle) {
        EnumC30226Bte enumC30226Bte;
        int i;
        Room room;
        o.LJIIIZ(view, "view");
        C28246B6s LIZIZ = BJN.LIZIZ();
        if (LIZIZ != null && (room = LIZIZ.LIZIZ) != null) {
            room.setRoomOrientation("portrait");
        }
        C74740TUy.LIZLLL().LJI(0);
        C29689Bkz.LIZ.LJIIL(C30088BrQ.LJLIL);
        C30725C4b.LIZJ(this.LJLIL);
        Handler LIZ = B73.LIZ();
        o.LJIIIIZZ(LIZ, "getMainHandler()");
        EnumC30414Bwg enumC30414Bwg = EnumC30414Bwg.EVENT_PAGE_BROADCAST;
        C30770C5u.LJ(LIZ, enumC30414Bwg);
        C30446BxC c30446BxC = C30446BxC.LIZ;
        BaseFragment baseFragment = this.LJLILLLLZI;
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null) {
            c30446BxC.getClass();
            C30446BxC.LIZLLL(baseFragment, enumC30414Bwg, dataChannel);
            if (ToolBarRefactor.enable()) {
                IToolbarService LJJ = C7N.LJJ();
                Context context = this.LJLIL;
                BaseFragment baseFragment2 = this.LJLILLLLZI;
                DataChannel dataChannel2 = this.LJLLI;
                if (dataChannel2 != null) {
                    LJJ.Gv(context, baseFragment2, dataChannel2);
                } else {
                    o.LJIJI("mDataChannel");
                    throw null;
                }
            }
            IToolbarService LJJ2 = C7N.LJJ();
            Context context2 = this.LJLIL;
            if (ToolBarButtonWithTextExperiment.hasText()) {
                enumC30226Bte = EnumC30226Bte.ICON_WITH_TEXT;
            } else {
                enumC30226Bte = EnumC30226Bte.ICON;
            }
            LJJ2.vh(context2, 7, enumC30226Bte);
            view.setFitsSystemWindows(true);
            view.post(new ARunnableS24S0200000_5(this, view, 61));
            Room room2 = this.LJLLILLLL;
            if (room2 != null) {
                if (room2.getMosaicStatus() == 1) {
                    this.LJLJL.setVisibility(0);
                }
                if (this.LLF == null) {
                    C30093BrV wp0 = C7N.LJIJJ().wp0();
                    DataChannel dataChannel3 = this.LJLLI;
                    if (dataChannel3 != null) {
                        IMessageService LJIILL = C7N.LJIILL();
                        Room room3 = this.LJLLILLLL;
                        if (room3 != null) {
                            IMessageManager iMessageManager = LJIILL.get(room3.getId());
                            Room room4 = this.LJLLILLLL;
                            if (room4 != null) {
                                RoomStats stats = room4.getStats();
                                if (stats != null) {
                                    i = stats.getShareCount();
                                } else {
                                    i = 0;
                                }
                                wp0.LIZ(dataChannel3, iMessageManager, i);
                                this.LLF = wp0;
                            } else {
                                o.LJIJI("mRoom");
                                throw null;
                            }
                        } else {
                            o.LJIJI("mRoom");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mDataChannel");
                        throw null;
                    }
                }
                Room room5 = this.LJLLILLLL;
                if (room5 != null) {
                    RoomAuthStatus roomAuthStatus = room5.getRoomAuthStatus();
                    if (roomAuthStatus != null && roomAuthStatus.chatSubOnly) {
                        C30868C9o.LIZJ(R.string.obx);
                    }
                    Object value = C7N.LJJIIJ.getValue();
                    o.LJIIIIZZ(value, "<get-userManagerService>(...)");
                    IUserManageService iUserManageService = (IUserManageService) value;
                    BaseFragment baseFragment3 = this.LJLILLLLZI;
                    DataChannel dataChannel4 = this.LJLLI;
                    if (dataChannel4 != null) {
                        this.LJLLLLLL = iUserManageService.UZ(baseFragment3, dataChannel4, this.LJLLJ);
                        Object value2 = C7N.LJJIIJZLJL.getValue();
                        o.LJIIIIZZ(value2, "<get-userCardService>(...)");
                        IUserCardService iUserCardService = (IUserCardService) value2;
                        BaseFragment baseFragment4 = this.LJLILLLLZI;
                        DataChannel dataChannel5 = this.LJLLI;
                        if (dataChannel5 != null) {
                            iUserCardService.uP(baseFragment4, dataChannel5, true, baseFragment4);
                            BaseFragment baseFragment5 = this.LJLILLLLZI;
                            DataChannel dataChannel6 = this.LJLLI;
                            if (dataChannel6 != null) {
                                new BWT(baseFragment5, dataChannel6);
                                IBrowserService LJFF = C7N.LJFF();
                                BaseFragment baseFragment6 = this.LJLILLLLZI;
                                DataChannel dataChannel7 = this.LJLLI;
                                if (dataChannel7 != null) {
                                    LJFF.dr(baseFragment6, dataChannel7, true, baseFragment6);
                                    IBarrageService LIZLLL = C7N.LIZLLL();
                                    BaseFragment baseFragment7 = this.LJLILLLLZI;
                                    DataChannel dataChannel8 = this.LJLLI;
                                    if (dataChannel8 != null) {
                                        LIZLLL.x90(baseFragment7, dataChannel8, this.LJLJLJ);
                                        BaseFragment baseFragment8 = this.LJLILLLLZI;
                                        DataChannel dataChannel9 = this.LJLLI;
                                        if (dataChannel9 != null) {
                                            new C30157BsX(baseFragment8, dataChannel9);
                                            C0WV LJIIJ = C30355Bvj.LJIIJ();
                                            DataChannel dataChannel10 = this.LJLLI;
                                            if (dataChannel10 != null) {
                                                ((C32041No) LJIIJ).LJII(this.LJLILLLLZI, dataChannel10);
                                                if (C29306Beo.LJJIII(this.LJLL)) {
                                                    B5D b5d = (B5D) this.LLD.getValue();
                                                    if (b5d != null) {
                                                        FragmentManager childFragmentManager = this.LJLILLLLZI.getChildFragmentManager();
                                                        o.LJIIIIZZ(childFragmentManager, "fragment.childFragmentManager");
                                                        b5d.LIZIZ(childFragmentManager);
                                                    }
                                                    B5D b5d2 = (B5D) this.LLD.getValue();
                                                    if (b5d2 != null) {
                                                        Room room6 = this.LJLLILLLL;
                                                        if (room6 != null) {
                                                            b5d2.LIZJ(room6.getId());
                                                        } else {
                                                            o.LJIJI("mRoom");
                                                            throw null;
                                                        }
                                                    }
                                                }
                                                LivePerformanceManager LIZ2 = B4U.LIZ();
                                                Room room7 = this.LJLLILLLL;
                                                if (room7 != null) {
                                                    long id = room7.getId();
                                                    Room room8 = this.LJLLILLLL;
                                                    if (room8 != null) {
                                                        room8.getOwnerUserId();
                                                        LIZ2.LLII = id;
                                                        IRoomFunctionService LJIJI = C7N.LJIJI();
                                                        BaseFragment baseFragment9 = this.LJLILLLLZI;
                                                        DataChannel dataChannel11 = this.LJLLI;
                                                        if (dataChannel11 != null) {
                                                            Room room9 = this.LJLLILLLL;
                                                            if (room9 != null) {
                                                                LJIJI.LLZZLLIL(room9, dataChannel11, baseFragment9);
                                                                IRoomFunctionService LJIJI2 = C7N.LJIJI();
                                                                BaseFragment baseFragment10 = this.LJLILLLLZI;
                                                                DataChannel dataChannel12 = this.LJLLI;
                                                                if (dataChannel12 != null) {
                                                                    Room room10 = this.LJLLILLLL;
                                                                    if (room10 != null) {
                                                                        LJIJI2.Jc(baseFragment10, room10, dataChannel12);
                                                                        IBannerService LIZJ = C7N.LIZJ();
                                                                        DataChannel dataChannel13 = this.LJLLI;
                                                                        if (dataChannel13 != null) {
                                                                            Room room11 = this.LJLLILLLL;
                                                                            if (room11 != null) {
                                                                                LIZJ.bE(room11, dataChannel13);
                                                                                ((IGiftService) CN1.LIZ(IGiftService.class)).initPublicScreenConfiguration();
                                                                                ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).initPublicScreenConfiguration();
                                                                                ((IInteractService) CN1.LIZ(IInteractService.class)).initPublicScreenConfiguration();
                                                                                ((IQAService) CN1.LIZ(IQAService.class)).initPublicScreenConfiguration();
                                                                                ((IGameService) CN1.LIZ(IGameService.class)).initPublicScreenConfiguration();
                                                                                ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).initPublicScreenConfiguration();
                                                                                ((IStarCommentService) CN1.LIZ(IStarCommentService.class)).initPublicScreenConfiguration();
                                                                                ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).initPublicScreenConfiguration();
                                                                                IPublicScreenService LJIIZILJ = C7N.LJIIZILJ();
                                                                                BaseFragment baseFragment11 = this.LJLILLLLZI;
                                                                                DataChannel dataChannel14 = this.LJLLI;
                                                                                if (dataChannel14 != null) {
                                                                                    Room room12 = this.LJLLILLLL;
                                                                                    if (room12 != null) {
                                                                                        LJIIZILJ.LLZZLLIL(room12, dataChannel14, baseFragment11);
                                                                                        ISubscribeService LJIL = C7N.LJIL();
                                                                                        BaseFragment baseFragment12 = this.LJLILLLLZI;
                                                                                        DataChannel dataChannel15 = this.LJLLI;
                                                                                        if (dataChannel15 != null) {
                                                                                            Room room13 = this.LJLLILLLL;
                                                                                            if (room13 != null) {
                                                                                                LJIL.pc0(room13, dataChannel15, baseFragment12);
                                                                                                int value3 = PostponeRequestBatchShareListSetting.INSTANCE.getValue();
                                                                                                if (value3 <= 0) {
                                                                                                    C29936Boy c29936Boy = this.LJLZ;
                                                                                                    Room room14 = this.LJLLILLLL;
                                                                                                    if (room14 != null) {
                                                                                                        c29936Boy.LIZ(room14.getId(), this.LJLILLLLZI, null);
                                                                                                    } else {
                                                                                                        o.LJIJI("mRoom");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    view.postDelayed(new ARunnableS41S0100000_5(this, 241), TimeUnit.SECONDS.toMillis(value3));
                                                                                                }
                                                                                                DataChannel dataChannel16 = this.LJLLI;
                                                                                                if (dataChannel16 != null) {
                                                                                                    HashMap hashMap = (HashMap) dataChannel16.kv0(C28386BCc.class);
                                                                                                    HashMap hashMap2 = hashMap;
                                                                                                    if (hashMap == null) {
                                                                                                        ?? hashMap3 = new HashMap();
                                                                                                        DataChannel dataChannel17 = this.LJLLI;
                                                                                                        if (dataChannel17 != null) {
                                                                                                            ((C32537Cpp) dataChannel17.gv0(C28386BCc.class)).LIZ = hashMap3;
                                                                                                            hashMap2 = hashMap3;
                                                                                                        } else {
                                                                                                            o.LJIJI("mDataChannel");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    }
                                                                                                    hashMap2.put("param_live_slot_start_time_long", String.valueOf(SystemClock.uptimeMillis()));
                                                                                                    BKY LIZIZ2 = BKY.LIZIZ();
                                                                                                    if (LIZIZ2.LIZ) {
                                                                                                        LIZIZ2.LIZ = false;
                                                                                                        LIZIZ2.LIZIZ = 0;
                                                                                                        LIZIZ2.LIZJ = false;
                                                                                                    }
                                                                                                    LIZIZ2.LIZ = true;
                                                                                                    return;
                                                                                                }
                                                                                                o.LJIJI("mDataChannel");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("mRoom");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("mDataChannel");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("mRoom");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("mDataChannel");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("mRoom");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("mDataChannel");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("mRoom");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("mDataChannel");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mRoom");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mDataChannel");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mRoom");
                                                    throw null;
                                                }
                                                o.LJIJI("mRoom");
                                                throw null;
                                            }
                                            o.LJIJI("mDataChannel");
                                            throw null;
                                        }
                                        o.LJIJI("mDataChannel");
                                        throw null;
                                    }
                                    o.LJIJI("mDataChannel");
                                    throw null;
                                }
                                o.LJIJI("mDataChannel");
                                throw null;
                            }
                            o.LJIJI("mDataChannel");
                            throw null;
                        }
                        o.LJIJI("mDataChannel");
                        throw null;
                    }
                    o.LJIJI("mDataChannel");
                    throw null;
                }
                o.LJIJI("mRoom");
                throw null;
            }
            o.LJIJI("mRoom");
            throw null;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, java.lang.Object, O] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.Bk2, O] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.Bk1, O] */
    public final void LJIIIZ(DataChannel dataChannel, AbstractC30130Bs6 abstractC30130Bs6) {
        Object kv0 = dataChannel.kv0(RoomChannel.class);
        o.LJI(kv0);
        this.LJLLILLLL = (Room) kv0;
        ?? r1 = Boolean.FALSE;
        ((C32537Cpp) dataChannel.gv0(C30114Brq.class)).LIZ = r1;
        dataChannel.rv0(CommentOrMessageData.class, r1);
        ((C32537Cpp) dataChannel.gv0(BCW.class)).LIZ = Boolean.TRUE;
        ((C32537Cpp) dataChannel.gv0(BNK.class)).LIZ = Boolean.valueOf(ToolBarButtonWithTextExperiment.hasText());
        this.LJLLI = dataChannel;
        this.LLFF = abstractC30130Bs6;
        C30184Bsy.LIZ = true;
        BM1.LIZJ();
        Room room = this.LJLLILLLL;
        if (room != null) {
            long id = room.getId();
            Room room2 = this.LJLLILLLL;
            if (room2 != null) {
                long ownerUserId = room2.getOwnerUserId();
                BM1.LJFF = id;
                BM1.LJI = ownerUserId;
                Room room3 = this.LJLLILLLL;
                if (room3 != null) {
                    OfficialChannelInfo officialChannelInfo = room3.officialChannelInfo;
                    if (officialChannelInfo != null) {
                        DataChannel dataChannel2 = this.LJLLI;
                        if (dataChannel2 != null) {
                            ((C32537Cpp) dataChannel2.gv0(C29627Bjz.class)).LIZ = new C29630Bk2(officialChannelInfo.linkmicType);
                            DataChannel dataChannel3 = this.LJLLI;
                            if (dataChannel3 != null) {
                                ((C32537Cpp) dataChannel3.gv0(C29628Bk0.class)).LIZ = new C29629Bk1(officialChannelInfo.roleType, officialChannelInfo.existLinkmic);
                                return;
                            } else {
                                o.LJIJI("mDataChannel");
                                throw null;
                            }
                        }
                        o.LJIJI("mDataChannel");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("mRoom");
                throw null;
            }
            o.LJIJI("mRoom");
            throw null;
        }
        o.LJIJI("mRoom");
        throw null;
    }

    public final void LJFF(int i, int i2, Intent intent) {
        C28720BOy c28720BOy;
        C30159BsZ c30159BsZ = this.LJZL;
        if (c30159BsZ != null && (c28720BOy = c30159BsZ.LJLILLLLZI) != null) {
            c28720BOy.LIZLLL.LJFF(i, i2, intent);
        }
    }

    public C30087BrP(Context context, BaseFragment fragment, InterfaceC30105Brh interactionFragment, View rootView, RecyclableWidgetManager mWidgetManager) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(interactionFragment, "interactionFragment");
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(mWidgetManager, "mWidgetManager");
        this.LJLIL = context;
        this.LJLILLLLZI = fragment;
        this.LJLJI = interactionFragment;
        this.LJLJJI = rootView;
        this.LJLJJL = mWidgetManager;
        this.LJLJL = (TextView) rootView.findViewById(R.id.fxl);
        this.LJLJLJ = interactionFragment.w();
        this.LJLJLLL = rootView.findViewById(R.id.a4f);
        this.LJLL = C29306Beo.LIZIZ(context);
        this.LJLLJ = new C73318Sq2();
        this.LJLZ = new C29936Boy();
        this.LLD = C221108m2.LIZIZ(C30096BrY.LJLIL);
        this.LLFII = new C30145BsL();
        this.LLFZ = new Layer2PriorityManager(fragment);
    }
}
