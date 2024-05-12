package com.bytedance.android.livesdk.function;

import X.ActivityC45651qj;
import X.AnonymousClass149;
import X.B5M;
import X.B83;
import X.BAF;
import X.BAI;
import X.BCN;
import X.BFI;
import X.BFL;
import X.BTJ;
import X.BV2;
import X.BYS;
import X.BZI;
import X.C04120Ee;
import X.C04130Ef;
import X.C11;
import X.C12;
import X.C14A;
import X.C15610jN;
import X.C16880lQ;
import X.C1A;
import X.C1D;
import X.C1EW;
import X.C1I;
import X.C1J;
import X.C259710f;
import X.C259810g;
import X.C28347BAp;
import X.C28447BEl;
import X.C28448BEm;
import X.C28463BFb;
import X.C28464BFc;
import X.C28466BFe;
import X.C28787BRn;
import X.C28968BYm;
import X.C29306Beo;
import X.C29338BfK;
import X.C29374Bfu;
import X.C29836BnM;
import X.C29892BoG;
import X.C29927Bop;
import X.C29930Bos;
import X.C30317Bv7;
import X.C30627C0h;
import X.C30628C0i;
import X.C30630C0k;
import X.C30922CBq;
import X.C31106CIs;
import X.C31418CUs;
import X.C31423CUx;
import X.C31424CUy;
import X.C32536Cpo;
import X.C32537Cpp;
import X.C42061kw;
import X.C43391n5;
import X.C51029K0z;
import X.C54802Dc;
import X.C54822De;
import X.C61878OQg;
import X.C72818Shy;
import X.C73318Sq2;
import X.C76800UCe;
import X.CC4;
import X.CG4;
import X.CGA;
import X.CGN;
import X.CN1;
import X.CR6;
import X.DialogInterfaceOnDismissListenerC29891BoF;
import X.EnumC04110Ed;
import X.EnumC30204BtI;
import X.EnumC31509CYf;
import X.HandlerC28345BAn;
import X.InterfaceC04100Ec;
import X.InterfaceC06050Lp;
import X.InterfaceC06060Lq;
import X.InterfaceC17380mE;
import X.InterfaceC28344BAm;
import X.InterfaceC29980Bpg;
import X.InterfaceC31062CHa;
import X.InterfaceC62096OYq;
import X.InterfaceC74834TYo;
import X.InterfaceC88472Yns;
import X.YA1;
import Y.AObjectS21S0001000_5;
import Y.AfS0S0100200_5;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.adminsetting.SwitchBatchUpdateRequest;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCorrectsRoundsChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessHasLoggedRoundEndChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartTimeChannel;
import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardStartTimeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubscribeSubOnlyChatChangeEvent;
import com.bytedance.android.livesdk.dialog.BroadcastDialogDispatcher;
import com.bytedance.android.livesdk.dislike.LiveLongPressDialog;
import com.bytedance.android.livesdk.interaction.LiveInteractionFeaturesFragment;
import com.bytedance.android.livesdk.interaction.custompoll.CustomPollCardWidget;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessCanvasWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessToolbarWidget;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.GiftSelectPollWidget;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.NormalSelectPollWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2Setting;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.PerfMetricSwitchSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.ShareEffectShowIntervalSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollUpdateVotesContent;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.android.livesdk.usermanage.KickOutApi;
import com.bytedance.android.livesdk.usermanage.MuteApi;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class RoomFunctionService implements IRoomFunctionService, InterfaceC28344BAm, OnMessageListener, InterfaceC31062CHa {
    public boolean LJLIL;
    public HandlerC28345BAn LJLILLLLZI;
    public final LongSparseArray<ArrayList<InterfaceC06060Lq>> LJLJI = new LongSparseArray<>();
    public final LongSparseArray<DataChannel> LJLJJI = new LongSparseArray<>();
    public final LongSparseArray<C43391n5> LJLJJL = new LongSparseArray<>();
    public final LongSparseArray<InterfaceC06050Lp> LJLJJLL = new LongSparseArray<>();
    public final LongSparseArray<InterfaceC06050Lp> LJLJL = new LongSparseArray<>();
    public final boolean LJLJLJ = LiveLikeOptSetting.INSTANCE.isLikeShareTransference();

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> Br() {
        return DrawGuessStatusWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> br() {
        return LiveRoomNotifyWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void onEnterBroadcastPreview() {
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> pf0() {
        return NormalSelectPollWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> rF() {
        return StreamInfoWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> vN() {
        return DrawGuessCanvasWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> z10() {
        return GiftSelectPollWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final Class<? extends LiveRecyclableWidget> z50() {
        return CustomPollCardWidget.class;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void B7() {
        Iterator it = ((LinkedHashMap) C30317Bv7.LIZ).entrySet().iterator();
        while (it.hasNext()) {
            YA1 ya1 = (YA1) ((Map.Entry) it.next()).getValue();
            ((HashMap) ya1.LJLJJI).clear();
            ((HashMap) ya1.LJLJJLL).clear();
            do {
            } while (ya1.LJLJJL.LIZIZ() != null);
            do {
            } while (ya1.LJLJL.LIZIZ() != null);
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void Hp0() {
        if (BFI.LIZLLL) {
            BFI.LIZLLL = false;
            ((ArrayList) BFI.LIZ.getValue()).clear();
            BFI.LIZJ = false;
            BFI.LIZIZ = null;
            BFI.LJ = null;
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final DrawGuessCanvasWidget Qz() {
        return new DrawGuessCanvasWidget();
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void ZO() {
        C1I c1i = C1I.LIZ;
        C1J c1j = C1I.LIZIZ;
        if (c1j != null) {
            c1j.cancel();
        }
        C1I.LJFF.clear();
        DataChannel dataChannel = C1I.LJI;
        if (dataChannel != null) {
            dataChannel.jv0(c1i);
        }
        C1I.LJI = null;
        C1I.LJ = 0;
        C1I.LIZJ = false;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final LiveGiftPollEffectWidget bv0() {
        return new LiveGiftPollEffectWidget(257);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void initPublicScreenConfiguration() {
        if (this.LJLIL) {
            return;
        }
        this.LJLIL = true;
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Dv(21, new C29836BnM());
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final DrawGuessStatusWidget yG() {
        return new DrawGuessStatusWidget();
    }

    @Override // X.InterfaceC06390Mx
    public final void onInit() {
        if (LiveServiceManagerOptSetting.enable()) {
            return;
        }
        C259810g c259810g = C259710f.LIZ;
        C42061kw c42061kw = new C42061kw();
        c259810g.getClass();
        C259810g.LJIIIIZZ(R.drawable.cz_, c42061kw);
        C259810g.LJIIIIZZ(R.drawable.d4v, new C42061kw());
        C259810g.LJIIIIZZ(R.drawable.cz8, new C42061kw());
        C259810g.LJIIIIZZ(R.drawable.cz8, new C42061kw());
        C259810g.LJIIIIZZ(R.drawable.d2w, new C42061kw());
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void Lk() {
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final long pz() {
        return CC4.LIZIZ;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean zq() {
        return CC4.LIZLLL;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean zt() {
        return C1I.LIZJ;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void D(DataChannel dataChannel) {
        BFL bfl = new BFL(dataChannel);
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = C1A.LIZ;
        concurrentHashMap.put(DrawGuessApi.class, bfl);
        concurrentHashMap.put(QAApi.class, new BV2(dataChannel));
        concurrentHashMap.put(PollApi.class, new C1D(dataChannel));
        concurrentHashMap.put(RoomSwitchApi.class, new RoomSwitchApi() { // from class: X.1TP
            @Override // com.bytedance.android.live.adminsetting.RoomSwitchApi
            public final AbstractC73672Svk<C28467BFf<Object>> batchUpdateSwitch(SwitchBatchUpdateRequest switchBatchUpdateRequest) {
                return AbstractC73672Svk.LJJIJIL(new C28467BFf());
            }

            @Override // com.bytedance.android.live.adminsetting.RoomSwitchApi
            public final AbstractC73672Svk<C28467BFf<Object>> updateSwitch(long j, int i, boolean z) {
                return AbstractC73672Svk.LJJIJIL(new C28467BFf());
            }
        });
        concurrentHashMap.put(MuteApi.class, new C28464BFc());
        concurrentHashMap.put(KickOutApi.class, new C28463BFb());
        concurrentHashMap.put(AdminApi.class, new C28466BFe());
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final LiveNormalPollEffectWidget E10(RecyclableWidgetManager widgetManager) {
        o.LJIIIZ(widgetManager, "widgetManager");
        if (LiveRecycleWidgetV2Setting.INSTANCE.getValue()) {
            LiveRecyclableWidget recyclableWidgetFromCacheOrNew = widgetManager.getRecyclableWidgetFromCacheOrNew(LiveNormalPollEffectWidget.class, new Integer[]{257}, new AObjectS21S0001000_5(6));
            o.LJIIIIZZ(recyclableWidgetFromCacheOrNew, "widgetScene: Int,\n      …          )\n            }");
            return (LiveNormalPollEffectWidget) recyclableWidgetFromCacheOrNew;
        }
        return new LiveNormalPollEffectWidget(257);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService, X.InterfaceC31062CHa
    public final int F(long j) {
        Integer num;
        DataChannel dataChannel = this.LJLJJI.get(j);
        if (dataChannel != null && (num = (Integer) dataChannel.kv0(C54802Dc.class)) != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final InterfaceC74834TYo RG(ViewModelProvider provider) {
        o.LJIIIZ(provider, "provider");
        return (InterfaceC74834TYo) provider.get(BroadcastDialogDispatcher.class);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void Tc0(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        C1I.LIZ.LIZ(2, interfaceC88472Yns);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean Xc(Room room) {
        boolean z = false;
        if (room == null) {
            return false;
        }
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus != null && roomAuthStatus.getUserCountDisplayState() == 2) {
            z = true;
        }
        return !z;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final LiveInteractionFeaturesFragment bn0(Bundle bundle) {
        LiveInteractionFeaturesFragment liveInteractionFeaturesFragment = new LiveInteractionFeaturesFragment();
        liveInteractionFeaturesFragment.setArguments(bundle);
        return liveInteractionFeaturesFragment;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.CG4, X.CGA, O] */
    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final CG4 fb(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        if (PerfMetricSwitchSetting.disable()) {
            return null;
        }
        CG4 cg4 = (CG4) dataChannel.kv0(C29892BoG.class);
        if (cg4 != null) {
            return cg4;
        }
        synchronized (this) {
            CG4 cg42 = (CG4) dataChannel.kv0(C29892BoG.class);
            if (cg42 == null) {
                ?? cga = new CGA();
                Long l = (Long) dataChannel.kv0(BCN.class);
                if (l != null) {
                    IMessageManager iMessageManager = ((IMessageService) CN1.LIZ(IMessageService.class)).get(l.longValue());
                    CGN cgn = cga.LIZLLL;
                    if ((cgn instanceof EventListener) && cgn != null && iMessageManager != null) {
                        iMessageManager.addEventListener(cgn);
                    }
                } else if (C30922CBq.LIZIZ) {
                    throw new RuntimeException("The room is not ready, you can't call getPerfMetricCollector at this time");
                }
                ((C32536Cpo) dataChannel.gv0(C29892BoG.class)).LIZ = cga;
                return cga;
            }
            return cg42;
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void fm(Room room) {
        List<PollOptionInfo> list;
        PollUpdateVotesContent pollUpdateVotesContent;
        IMessageManager iMessageManager;
        if (room != null) {
            C30627C0h c30627C0h = C30627C0h.LJLIL;
            long id = room.getId();
            C30627C0h.LJLZ = false;
            LongSparseArray<DataChannel> longSparseArray = C30627C0h.LJLILLLLZI;
            DataChannel dataChannel = longSparseArray.get(id);
            if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
                iMessageManager.removeMessageListener(C30627C0h.LJLJI.get(id));
            }
            C04120Ee LIZJ = C30627C0h.LIZJ(id);
            if (LIZJ != null) {
                if (C29306Beo.LJIIJ(longSparseArray.get(id))) {
                    LIZJ.LIZ(EnumC04110Ed.LIVE_END);
                    PollMessage pollMessage = LIZJ.LJI;
                    if (pollMessage != null) {
                        PollEndContent pollEndContent = new PollEndContent();
                        PollMessage pollMessage2 = C30627C0h.LJLJJLL;
                        if (pollMessage2 == null || (pollUpdateVotesContent = pollMessage2.updateContent) == null || (list = pollUpdateVotesContent.optionList) == null) {
                            list = C61878OQg.INSTANCE;
                        }
                        pollEndContent.optionList = list;
                        pollMessage.endContent = pollEndContent;
                    }
                    C04130Ef.LJII(longSparseArray.get(id), LIZJ, "close_take");
                } else {
                    LIZJ.LIZ(EnumC04110Ed.LEAVE_ROOM);
                }
                C30627C0h.LJIIL(id, LIZJ);
            }
            C72818Shy.LJII("custom_poll_start", c30627C0h);
            C72818Shy.LJII("custom_poll_template_page_status", c30627C0h);
            C72818Shy.LJII("custom_poll_open_interact", c30627C0h);
            C72818Shy.LJII("custom_poll_open_detailed_panel", c30627C0h);
            LongSparseArray<CopyOnWriteArrayList<InterfaceC04100Ec>> longSparseArray2 = C30627C0h.LJLL;
            longSparseArray2.remove(id);
            C30627C0h.LJLJJLL = null;
            C30627C0h.LJLJL = null;
            C30627C0h.LJLJLLL = false;
            C30627C0h.LJLLLLLL.remove(id);
            C30627C0h.LJLJJL.remove(id);
            C30627C0h.LJLLILLLL.remove(id);
            C30627C0h.LJLLI.remove(id);
            C30627C0h.LJLJI.remove(id);
            longSparseArray.remove(id);
            C30627C0h.LJLJJI.remove(id);
            longSparseArray2.remove(id);
            C30627C0h.LJLJLJ = null;
        }
    }

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
        Object obj;
        BottomMessage Ia0;
        int i;
        Object obj2 = null;
        if (message != null) {
            obj = message.obj;
        } else {
            obj = null;
        }
        int i2 = 0;
        if (obj instanceof Room) {
            if (message != null) {
                obj2 = message.obj;
            }
            o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
            if (Room.isValid((Room) obj2)) {
                Object obj3 = message.obj;
                o.LJII(obj3, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                Room room = (Room) obj3;
                IPublicScreenService iPublicScreenService = (IPublicScreenService) CN1.LIZ(IPublicScreenService.class);
                WarningTag warningTag = room.warningTag;
                int i3 = 4;
                if (warningTag == null || warningTag.text == null) {
                    if (iPublicScreenService != null && (Ia0 = iPublicScreenService.Ia0(room.getId())) != null && ((i = Ia0.bizType) == 3 || i == 4)) {
                        iPublicScreenService.Lk0(room.getId(), "");
                    }
                } else {
                    if (warningTag.tagSource != 1) {
                        i3 = 3;
                    }
                    if (warningTag.punishInfo != null) {
                        i3 = 6;
                    }
                    if (iPublicScreenService != null) {
                        long id = room.getId();
                        WarningTag warningTag2 = room.warningTag;
                        iPublicScreenService.ny(id, warningTag2.text, warningTag2.duration, warningTag2.punishInfo, i3, warningTag2.style, warningTag2.detailUrl);
                    }
                }
                Object obj4 = message.obj;
                o.LJII(obj4, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                Room room2 = (Room) obj4;
                if (C29306Beo.LJIJJ(room2)) {
                    ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Zd0(room2.getId(), false);
                } else {
                    ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).Zd0(room2.getId(), true);
                }
            }
        }
        if (message != null) {
            i2 = message.what;
        }
        C30630C0k.LIZ(i2);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void m20(DataChannel dataChannel) {
        EnumC30204BtI.AUDIENCE_INTERACTION_FEATURES.load(dataChannel, new C11(), true);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final DrawGuessToolbarWidget mR(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return new DrawGuessToolbarWidget(fragment);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final boolean nU(DataChannel dataChannel) {
        return BAF.LJFF(dataChannel);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void nj0(DataChannel dataChannel) {
        EnumC30204BtI.CUSTOM_POLL.load(dataChannel, new BYS());
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void onLocaleChanged(Locale locale) {
        C259810g c259810g = C259710f.LIZ;
        C42061kw c42061kw = new C42061kw();
        c259810g.getClass();
        C259810g.LJIIIIZZ(R.drawable.cz_, c42061kw);
        C259810g.LJIIIIZZ(R.drawable.d4v, new C42061kw());
        C259810g.LJIIIIZZ(R.drawable.cz8, new C42061kw());
        C259810g.LJIIIIZZ(R.drawable.cz8, new C42061kw());
        C259810g.LJIIIIZZ(R.drawable.d2w, new C42061kw());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        BaseMessage baseMessage;
        CommonMessageData commonMessageData;
        long j;
        DataChannel dataChannel;
        Room room;
        User user;
        int i;
        InterfaceC29980Bpg hq0;
        int i2;
        if (!(iMessage instanceof CR6) || (baseMessage = (BaseMessage) iMessage) == null || (commonMessageData = baseMessage.baseMessage) == null || (dataChannel = this.LJLJJI.get((j = commonMessageData.roomId))) == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            return;
        }
        if (iMessage instanceof RoomVerifyMessage) {
            int i3 = ((RoomVerifyMessage) iMessage).verifyAction;
            if (i3 == 32) {
                RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                if (roomAuthStatus != null) {
                    roomAuthStatus.setUserCountDisplayState(1);
                }
                ArrayList<InterfaceC06060Lq> arrayList = this.LJLJI.get(j);
                if (arrayList == null) {
                    return;
                }
                Iterator<InterfaceC06060Lq> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().LJJIJ(Xc(room));
                }
                return;
            }
            if (i3 == 33) {
                RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
                if (roomAuthStatus2 != null) {
                    roomAuthStatus2.setUserCountDisplayState(2);
                }
                ArrayList<InterfaceC06060Lq> arrayList2 = this.LJLJI.get(j);
                if (arrayList2 == null) {
                    return;
                }
                Iterator<InterfaceC06060Lq> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().LJJIJ(Xc(room));
                }
                return;
            }
            if (i3 == 36) {
                RoomAuthStatus roomAuthStatus3 = room.getRoomAuthStatus();
                if (roomAuthStatus3 != null) {
                    roomAuthStatus3.chatSubOnly = true;
                }
                DataChannel dataChannel2 = this.LJLJJI.get(j);
                if (dataChannel2 == null) {
                    return;
                }
                dataChannel2.pv0(SubscribeSubOnlyChatChangeEvent.class);
                return;
            }
            if (i3 != 37) {
                return;
            }
            RoomAuthStatus roomAuthStatus4 = room.getRoomAuthStatus();
            if (roomAuthStatus4 != null) {
                roomAuthStatus4.chatSubOnly = false;
            }
            DataChannel dataChannel3 = this.LJLJJI.get(j);
            if (dataChannel3 == null) {
                return;
            }
            dataChannel3.pv0(SubscribeSubOnlyChatChangeEvent.class);
            return;
        }
        if (!(iMessage instanceof SocialMessage)) {
            return;
        }
        SocialMessage socialMessage = (SocialMessage) iMessage;
        if (socialMessage.action != 3) {
            return;
        }
        ShareEffectShowIntervalSetting shareEffectShowIntervalSetting = ShareEffectShowIntervalSetting.INSTANCE;
        if (!shareEffectShowIntervalSetting.getValue().showShareEffect || (user = socialMessage.user) == null || user.getId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            return;
        }
        if (C30630C0k.LJ) {
            i = shareEffectShowIntervalSetting.getValue().anchorInterval;
        } else {
            i = shareEffectShowIntervalSetting.getValue().audienceInterval;
        }
        int i4 = C30630C0k.LIZJ + 1;
        C30630C0k.LIZJ = i4;
        if (i < 1) {
            i = 1;
        }
        int i5 = i4 % i;
        C30630C0k.LIZJ = i5;
        if (i5 != 0 || (hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(j)) == null) {
            return;
        }
        if (!this.LJLJLJ) {
            i2 = R.drawable.daj;
        } else {
            i2 = R.drawable.dak;
        }
        hq0.LJIIIIZZ(i2);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService, X.InterfaceC31062CHa
    public final int u4(long j) {
        Integer num;
        DataChannel dataChannel = this.LJLJJI.get(j);
        if (dataChannel != null && (num = (Integer) dataChannel.kv0(C54822De.class)) != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void xk(DataChannel dataChannel) {
        EnumC30204BtI.INTERACTION_FEATURES.load(dataChannel, new C28968BYm());
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void Ao0(long j, InterfaceC06060Lq l) {
        o.LJIIIZ(l, "l");
        ArrayList<InterfaceC06060Lq> arrayList = this.LJLJI.get(j);
        if (arrayList != null) {
            arrayList.remove(l);
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void C50(long j, InterfaceC06050Lp l) {
        o.LJIIIZ(l, "l");
        this.LJLJL.put(j, l);
        F(j);
        l.LIZ(0);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void KX(long j, InterfaceC06060Lq l) {
        o.LJIIIZ(l, "l");
        ArrayList<InterfaceC06060Lq> arrayList = this.LJLJI.get(j);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.LJLJI.put(j, arrayList);
        }
        arrayList.add(l);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void LLFFF(Room room, DataChannel dataChannel) {
        C43391n5 c43391n5;
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        if (room != null) {
            this.LJLJJI.remove(room.getId());
            c43391n5 = this.LJLJJL.get(room.getId());
            C43391n5 c43391n52 = c43391n5;
            if (c43391n52 != null) {
                c43391n52.LIZLLL = true;
                C15610jN.LIZ().removeCallbacks(c43391n52.LIZJ);
            }
            this.LJLJJL.remove(room.getId());
            this.LJLJI.remove(room.getId());
            if (ShareEffectShowIntervalSetting.INSTANCE.getValue().showShareEffect) {
                Handler handler = C30630C0k.LJI;
                if (handler != null) {
                    handler.removeMessages(291);
                }
                C30630C0k.LIZ(291);
                InterfaceC29980Bpg hq0 = ((IBarrageService) CN1.LIZ(IBarrageService.class)).hq0(C30630C0k.LJFF);
                if (hq0 != null) {
                    hq0.LJIJ((C12) C30630C0k.LIZ.getValue());
                }
                C30630C0k.LIZLLL = null;
                C30630C0k.LJI = null;
            }
            long id = room.getId();
            LongSparseArray<DataChannel> longSparseArray = C30628C0i.LJLILLLLZI;
            DataChannel dataChannel2 = longSparseArray.get(id);
            if (dataChannel2 != null && (iMessageManager2 = (IMessageManager) dataChannel2.kv0(C29927Bop.class)) != null) {
                iMessageManager2.removeMessageListener(C30628C0i.LJLJI.get(id));
            }
            LongSparseArray<CopyOnWriteArrayList<InterfaceC17380mE>> longSparseArray2 = C30628C0i.LJLJJL;
            longSparseArray2.remove(id);
            C30628C0i.LJLJL.remove(id);
            C30628C0i.LJLJJLL.remove(id);
            C30628C0i.LJLJI.remove(id);
            longSparseArray.remove(id);
            C30628C0i.LJLJJI.remove(id);
            longSparseArray2.remove(id);
            C30628C0i.LJLJLLL.remove(id);
        } else {
            c43391n5 = null;
        }
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(EnumC31509CYf.ROOM_VERIFY.getIntType(), this);
                iMessageManager.removeMessageListener(EnumC31509CYf.SOCIAL.getIntType(), this);
            }
        } else {
            iMessageManager = null;
        }
        C43391n5 c43391n53 = c43391n5;
        if (c43391n53 != null && iMessageManager != null) {
            iMessageManager.removeEventListener(c43391n53);
        }
        C31418CUs c31418CUs = C31418CUs.LIZ;
        ArrayList<C31423CUx<String>> arrayList = C31418CUs.LJII;
        arrayList.size();
        ArrayList<C31424CUy<InterfaceC88472Yns<Map<EmoteModel, ? extends Drawable>, C76800UCe>>> arrayList2 = C31418CUs.LJIIIIZZ;
        arrayList2.size();
        ArrayList<C31424CUy<InterfaceC88472Yns<List<? extends SpannableStringBuilder>, C76800UCe>>> arrayList3 = C31418CUs.LJIIIZ;
        arrayList3.size();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(c31418CUs);
        C73318Sq2 c73318Sq2 = C31106CIs.LJIIIZ;
        if (c73318Sq2 != null && !c73318Sq2.LJLILLLLZI) {
            c73318Sq2.LIZLLL();
        }
        C31106CIs.LJIIIZ = null;
        ((ArrayList) C31106CIs.LJ).clear();
        ((LinkedHashMap) C31106CIs.LJFF).clear();
        C31106CIs.LIZLLL.clear();
        C31106CIs.LJI.clear();
        C31106CIs.LJIIIIZZ.clear();
        C31418CUs.LJFF.clear();
        C31418CUs.LJ.clear();
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void am0(DataChannel dataChannel, boolean z) {
        BAI.LJ(dataChannel, z);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void ca0(Fragment fragment, String str) {
        DataChannel LJIILIIL;
        long j;
        Boolean bool;
        if (str == null || (LJIILIIL = C51029K0z.LJIILIIL(fragment)) == null) {
            return;
        }
        Long LJJ = BAF.LJJ(LJIILIIL);
        long j2 = 0;
        if (LJJ != null) {
            j = LJJ.longValue();
        } else {
            j = 0;
        }
        Long l = (Long) LJIILIIL.kv0(DrawGuessRoundIdChannel.class);
        if (l == null) {
            return;
        }
        long longValue = l.longValue();
        if (longValue <= 0) {
            return;
        }
        HashMap hashMap = (HashMap) LJIILIIL.kv0(DrawGuessCorrectsRoundsChannel.class);
        if (hashMap != null) {
            bool = Boolean.valueOf(hashMap.containsKey(Long.valueOf(longValue)));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            return;
        }
        DrawGuessApi drawGuessApi = (DrawGuessApi) C1A.LIZJ(DrawGuessApi.class);
        long LJJIZ = C29306Beo.LJJIZ(LJIILIIL);
        Long l2 = (Long) LJIILIIL.kv0(DrawGuessRoundIdChannel.class);
        if (l2 != null) {
            j2 = l2.longValue();
        }
        C1EW.LIZ(drawGuessApi.guessWord(LJJIZ, j2, str)).LJII(BTJ.LIZIZ(fragment)).LJJJLIIL(new AfS0S0100200_5(longValue, j, LJIILIIL, 2), B5M.LJLIL);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void jp0(long j, InterfaceC06050Lp l) {
        o.LJIIIZ(l, "l");
        this.LJLJJLL.remove(j);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void no(C28448BEm c28448BEm, FragmentManager fragmentManager) {
        C28447BEl.LIZ(true, c28448BEm).show(fragmentManager, "LiveProfileDialog");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Integer, O] */
    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void sS(int i, long j) {
        int F = F(j);
        if (F != i) {
            InterfaceC06050Lp interfaceC06050Lp = this.LJLJL.get(j);
            if (interfaceC06050Lp != null) {
                interfaceC06050Lp.LIZ(F);
            }
            DataChannel dataChannel = this.LJLJJI.get(j);
            if (dataChannel != null) {
                ((C32537Cpp) dataChannel.gv0(C54802Dc.class)).LIZ = Integer.valueOf(i);
            }
        }
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void uG(long j, InterfaceC06050Lp l) {
        o.LJIIIZ(l, "l");
        this.LJLJL.remove(j);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void uk0(long j, InterfaceC06050Lp l) {
        o.LJIIIZ(l, "l");
        this.LJLJJLL.put(j, l);
        u4(j);
        l.LIZ(0);
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void uw(DataChannel dataChannel, boolean z) {
        HashMap hashMap;
        String str;
        HashMap hashMap2;
        long j;
        String str2;
        if (dataChannel == null || (hashMap = (HashMap) dataChannel.kv0(DrawGuessCorrectsRoundsChannel.class)) == null) {
            hashMap = new HashMap();
        }
        Long LJIIL = BAI.LJIIL(dataChannel);
        if (LJIIL != null) {
            if (hashMap.containsKey(Long.valueOf(LJIIL.longValue()))) {
                str = "right";
            } else {
                str = "wrong";
            }
            if (dataChannel == null || (hashMap2 = (HashMap) dataChannel.kv0(DrawGuessRoundStartTimeChannel.class)) == null) {
                hashMap2 = new HashMap();
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            Long l = (Long) hashMap2.get(BAI.LJIIL(dataChannel));
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_audience_pictionary_round_end");
            BAI.LIZIZ(LIZ, dataChannel);
            BAI.LIZ(LIZ);
            LIZ.LJIJJ(str, "result");
            LIZ.LJIJJ(Long.valueOf(Math.min(uptimeMillis - j, 120000L)), "time");
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(str2, "before_end");
            LIZ.LJJIIJZLJL();
            if (dataChannel != null) {
                dataChannel.rv0(DrawGuessHasLoggedRoundEndChannel.class, Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Integer, O] */
    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void wJ(int i, long j) {
        int u4 = u4(j);
        if (u4 != i) {
            InterfaceC06050Lp interfaceC06050Lp = this.LJLJJLL.get(j);
            if (interfaceC06050Lp != null) {
                interfaceC06050Lp.LIZ(u4);
            }
            DataChannel dataChannel = this.LJLJJI.get(j);
            if (dataChannel != null) {
                ((C32537Cpp) dataChannel.gv0(C54822De.class)).LIZ = Integer.valueOf(i);
            }
        }
    }

    public static void LIZ(boolean z, Room room, C29930Bos c29930Bos) {
        String str;
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = c29930Bos.LJIJJLI;
        o.LJIIIIZZ(str2, "shareParams.enterFromMerge");
        C28347BAp.LIZ(linkedHashMap, room, str2, c29930Bos.LJIL, c29930Bos.LJJ);
        if (z) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put("user_type", str);
        if (z) {
            String str3 = "1";
            if (Collections.unmodifiableList(c29930Bos.LJJIJ).size() > 0) {
                linkedHashMap.put("top_supporters_cnt", String.valueOf(Collections.unmodifiableList(c29930Bos.LJJIJ).size()));
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_top_supporters", obj);
            if (Collections.unmodifiableList(c29930Bos.LJJIJIIJI).size() > 0) {
                linkedHashMap.put("recently_shared_cnt", String.valueOf(Collections.unmodifiableList(c29930Bos.LJJIJIIJI).size()));
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_recently_shared", str3);
        }
        BZI LIZ = C28787BRn.LIZ("click_trans_layer");
        LIZ.LJIIZILJ();
        LIZ.LJJIFFI(linkedHashMap);
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0218, code lost:
    
        if (r1 != 0) goto L46;
     */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.ss.ugc.live.sdk.message.interfaces.IMessageManager, O] */
    @Override // com.bytedance.android.live.function.IRoomFunctionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jc(androidx.fragment.app.Fragment r20, com.bytedance.android.livesdkapi.depend.model.live.Room r21, com.bytedance.ies.sdk.datachannel.DataChannel r22) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.RoomFunctionService.Jc(androidx.fragment.app.Fragment, com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r14 != null) goto L18;
     */
    @Override // com.bytedance.android.live.function.IRoomFunctionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZZLLIL(com.bytedance.android.livesdkapi.depend.model.live.Room r13, com.bytedance.ies.sdk.datachannel.DataChannel r14, androidx.lifecycle.LifecycleOwner r15) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.RoomFunctionService.LLZZLLIL(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.ies.sdk.datachannel.DataChannel, androidx.lifecycle.LifecycleOwner):void");
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final void VJ(Context context, DataChannel dataChannel, boolean z, boolean z2, long j) {
        long j2;
        String str;
        String str2;
        Long l;
        Long l2;
        String str3;
        Room room;
        User owner;
        Room room2;
        User owner2;
        Room room3;
        o.LJIIIZ(context, "context");
        Long valueOf = Long.valueOf(j);
        if (dataChannel != null && (room3 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j2 = room3.getId();
        } else {
            j2 = 0;
        }
        Map<String, String> value = LiveEventPageLynxUrl.INSTANCE.getValue();
        if (z) {
            str = value.get("event_detail_room");
        } else if (z2) {
            str = value.get("event_pin_hight");
        } else {
            str = value.get("event_pin_low");
        }
        if (str == null) {
            return;
        }
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        String str4 = "";
        if (!z) {
            str2 = "";
        } else {
            str2 = String.valueOf(valueOf);
        }
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("event_id", str2);
        if (j2 != 0) {
            str4 = String.valueOf(j2);
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("room_id", str4);
        Object obj = null;
        if (dataChannel != null && (room2 = (Room) dataChannel.kv0(RoomChannel.class)) != null && (owner2 = room2.getOwner()) != null) {
            l = Long.valueOf(owner2.getId());
        } else {
            l = null;
        }
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("anchor_id", String.valueOf(l));
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
            l2 = Long.valueOf(owner.getId());
        } else {
            l2 = null;
        }
        Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("user_id", String.valueOf(l2));
        if (z) {
            str3 = "profile";
        } else {
            str3 = "presentation_card";
        }
        Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("enter_from", str3);
        if (dataChannel != null) {
            obj = dataChannel.kv0(LiveEventCardStartTimeChannel.class);
        }
        String uri = appendQueryParameter5.appendQueryParameter("room_start_time", String.valueOf(obj)).build().toString();
        o.LJIIIIZZ(uri, "parse(url).buildUpon()\n …      .build().toString()");
        IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
        if (iHybridContainerService != null) {
            iHybridContainerService.Vs0(context, uri, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0067, code lost:
    
        if (r21 == null) goto L183;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019b  */
    @Override // com.bytedance.android.live.function.IRoomFunctionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u00(java.lang.String r19, X.ActivityC45651qj r20, com.bytedance.ies.sdk.datachannel.DataChannel r21, boolean r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.function.RoomFunctionService.u00(java.lang.String, X.1qj, com.bytedance.ies.sdk.datachannel.DataChannel, boolean, java.lang.String):void");
    }

    @Override // com.bytedance.android.live.function.IRoomFunctionService
    public final DialogInterface Je0(Context context, boolean z, Room room, C29930Bos c29930Bos, IHostLongPressCallback iHostLongPressCallback, InterfaceC62096OYq interfaceC62096OYq) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(room, "room");
        if (!((IShareService) CN1.LIZ(IShareService.class)).vo0(room)) {
            if (z) {
                return null;
            }
            LiveLongPressDialog km0 = ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).km0(iHostLongPressCallback, context, room, c29930Bos.LJIJJLI, c29930Bos.LJIL, c29930Bos.LJJJJJ);
            LIZ(z, room, c29930Bos);
            return km0;
        }
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
        if (LIZIZ == null) {
            return null;
        }
        C29338BfK c29338BfK = (C29338BfK) ((IShareService) CN1.LIZ(IShareService.class)).un0();
        c29338BfK.getClass();
        c29930Bos.LIZIZ();
        Dialog longPressShareDialog = c29338BfK.LIZ.getLongPressShareDialog(LIZIZ, c29930Bos, interfaceC62096OYq);
        if (longPressShareDialog == null) {
            return null;
        }
        C14A c14a = AnonymousClass149.LIZ;
        if (!c14a.LIZLLL()) {
            c14a.LIZ(longPressShareDialog);
            C16880lQ.LIZ(longPressShareDialog);
            longPressShareDialog.setOnDismissListener(DialogInterfaceOnDismissListenerC29891BoF.LJLIL);
        }
        LIZ(z, room, c29930Bos);
        return longPressShareDialog;
    }
}
