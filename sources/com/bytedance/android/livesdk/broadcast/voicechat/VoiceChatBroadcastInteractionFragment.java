package com.bytedance.android.livesdk.broadcast.voicechat;

import X.AbstractC30130Bs6;
import X.ActivityC45651qj;
import X.B4U;
import X.B73;
import X.BCX;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1DH;
import X.C20910rv;
import X.C28329B9x;
import X.C29306Beo;
import X.C29867Bnr;
import X.C29935Box;
import X.C29S;
import X.C30025BqP;
import X.C30026BqQ;
import X.C30087BrP;
import X.C30183Bsx;
import X.C30282BuY;
import X.C30326BvG;
import X.C30466BxW;
import X.C30501By5;
import X.C30561Bz3;
import X.C30791C6p;
import X.C30876C9w;
import X.C32537Cpp;
import X.C32811Qn;
import X.C3C5;
import X.C51;
import X.C5H3;
import X.C74969TbZ;
import X.C76800UCe;
import X.C78996UzQ;
import X.C7N;
import X.C90903hW;
import X.CN1;
import X.EnumC30204BtI;
import X.InterfaceC27469AqH;
import X.InterfaceC30105Brh;
import X.InterfaceC30283BuZ;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS24S0200000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.live.broadcast.api.StartPushStreamChannel;
import com.bytedance.android.live.decoration.IDecorationService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.OpenLiveGoalPanelChannel;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatControlWidget;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.livesdk.broadcast.StartLiveEvent;
import com.bytedance.android.livesdk.broadcast.interaction.widget.BroadcastCountDownWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.CaptchaLiveWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.broadcast.video.layer.VideoLayeredElementManager;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.LiveCenterAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorDebugInfoSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterLayoutStyleSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCheckContentViewAttachedSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableLiveCoreSetting;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class VoiceChatBroadcastInteractionFragment extends BaseFragment implements InterfaceC30105Brh, InterfaceC27469AqH {
    public C30087BrP LJLIL;
    public LayeredWidgetManager LJLILLLLZI;
    public C30876C9w LJLJI;
    public C51 LJLJJI;
    public C30561Bz3 LJLJJL;
    public C30026BqQ LJLJJLL;
    public C30025BqP LJLJL;
    public C30183Bsx LJLJLJ;
    public DataChannel LJLJLLL;
    public C29935Box LJLLI;
    public AbstractC30130Bs6 LJLLILLLL;
    public NetSpeedMonitorWidget LJLLJ;
    public Room LJLLLL;
    public AbsVoiceChatControlWidget LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public final C5H3 LJLL = C78996UzQ.LJJIJIIJI(C30282BuY.LJLIL);
    public final AtomicBoolean LJLLL = new AtomicBoolean(false);
    public final C5H3 LJLLLLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 180));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC30105Brh
    public final void c8(int i) {
    }

    @Override // X.InterfaceC30105Brh
    public final void continueAfterWidgetLoaded() {
    }

    @Override // X.InterfaceC30105Brh
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC30105Brh
    public final void nj() {
        C29935Box c29935Box = this.LJLLI;
        if (c29935Box != null) {
            c29935Box.LIZIZ();
        } else {
            o.LJIJI("longPressHelper");
            throw null;
        }
    }

    @Override // X.InterfaceC27469AqH
    public final boolean onBackPressed() {
        C30087BrP c30087BrP = this.LJLIL;
        if (c30087BrP != null) {
            c30087BrP.onBackPressed();
            return true;
        }
        return false;
    }

    public final ValueAnimator vl() {
        return (ValueAnimator) this.LJLL.getValue();
    }

    public final void wl() {
        DataChannel dataChannel;
        if (((Boolean) this.LJLLLLLL.getValue()).booleanValue()) {
            if (!this.LJLLL.get() && (dataChannel = this.LJLJLLL) != null) {
                dataChannel.pv0(StartLiveEvent.class);
                return;
            }
            return;
        }
        LayeredWidgetManager layeredWidgetManager = this.LJLILLLLZI;
        if (layeredWidgetManager == null) {
            return;
        }
        BroadcastCountDownWidget broadcastCountDownWidget = new BroadcastCountDownWidget();
        broadcastCountDownWidget.LJLIL = new InterfaceC30283BuZ() { // from class: X.BuX
            @Override // X.InterfaceC30283BuZ
            public final void LIZ() {
                DataChannel dataChannel2;
                VoiceChatBroadcastInteractionFragment voiceChatBroadcastInteractionFragment = VoiceChatBroadcastInteractionFragment.this;
                if (!voiceChatBroadcastInteractionFragment.LJLLL.get() && (dataChannel2 = voiceChatBroadcastInteractionFragment.LJLJLLL) != null) {
                    dataChannel2.pv0(StartLiveEvent.class);
                }
            }
        };
        layeredWidgetManager.load(R.id.bvx, broadcastCountDownWidget);
    }

    @Override // X.InterfaceC30105Brh
    public final void loadIndependentBehaviors() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        EnumC30204BtI.EFFECT.load(this.LJLJLLL, new C30466BxW(context, this));
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            EnumC30204BtI enumC30204BtI = EnumC30204BtI.SHARE;
            DataChannel dataChannel = this.LJLJLLL;
            C29867Bnr bW = C7N.LJIJJ().bW(mo49getActivity, context, LiveMode.LIVE_VOICE, this);
            o.LJIIIIZZ(bW, "shareService.getShareBeh…iveMode.LIVE_VOICE, this)");
            enumC30204BtI.load(dataChannel, bW);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C30561Bz3 c30561Bz3 = this.LJLJJL;
        if (c30561Bz3 != null) {
            c30561Bz3.LIZJ(this.LJLJJLL);
            C30561Bz3 c30561Bz32 = this.LJLJJL;
            if (c30561Bz32 != null) {
                C30025BqP c30025BqP = this.LJLJL;
                if (c30025BqP != null) {
                    c30561Bz32.LIZJ(c30025BqP);
                    C30561Bz3 c30561Bz33 = this.LJLJJL;
                    if (c30561Bz33 != null) {
                        C30183Bsx c30183Bsx = this.LJLJLJ;
                        if (c30183Bsx != null) {
                            c30561Bz33.LIZJ(c30183Bsx);
                            C30087BrP c30087BrP = this.LJLIL;
                            if (c30087BrP != null) {
                                c30087BrP.LJI();
                                return;
                            }
                            return;
                        }
                        o.LJIJI("liveCenterGestureDetector");
                        throw null;
                    }
                    o.LJIJI("liveBroadcastGestureDetector");
                    throw null;
                }
                o.LJIJI("otherGestureDetector");
                throw null;
            }
            o.LJIJI("liveBroadcastGestureDetector");
            throw null;
        }
        o.LJIJI("liveBroadcastGestureDetector");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C29935Box c29935Box = this.LJLLI;
        if (c29935Box != null) {
            DialogInterface dialogInterface = c29935Box.LJFF;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            C30087BrP c30087BrP = this.LJLIL;
            if (c30087BrP != null) {
                c30087BrP.LJII();
            }
            ((LinkedHashMap) this.LJZ).clear();
            return;
        }
        o.LJIJI("longPressHelper");
        throw null;
    }

    @Override // X.InterfaceC30105Brh
    public final C30876C9w w() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC30105Brh
    public final boolean LJIIIIZZ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        C30561Bz3 c30561Bz3 = this.LJLJJL;
        if (c30561Bz3 != null) {
            return c30561Bz3.LIZ(event, new C32811Qn(_$_findCachedViewById(R.id.hif).getWidth(), _$_findCachedViewById(R.id.hif).getHeight(), _$_findCachedViewById(R.id.hif).getTop(), _$_findCachedViewById(R.id.hif).getLeft()));
        }
        o.LJIJI("liveBroadcastGestureDetector");
        throw null;
    }

    @Override // X.InterfaceC30105Brh
    public final void R2(Layer2PriorityManager layer2PriorityManager) {
        View findViewById;
        Room room;
        DataChannel dataChannel;
        o.LJIIIZ(layer2PriorityManager, "layer2PriorityManager");
        LayeredWidgetManager layeredWidgetManager = this.LJLILLLLZI;
        if (layeredWidgetManager != null) {
            LiveGiftPollEffectWidget bv0 = C7N.LJIJI().bv0();
            LiveNormalPollEffectWidget E10 = C7N.LJIJI().E10(layeredWidgetManager);
            if (E10 != null) {
                layeredWidgetManager.load(R.id.fxi, E10);
            }
            if (bv0 != null) {
                layeredWidgetManager.load(R.id.fwx, bv0);
            }
            DataChannel dataChannel2 = this.LJLJLLL;
            if (dataChannel2 != null) {
                dataChannel2.ov0(this, StartPushStreamChannel.class, new AqS171S0100000_5(this, 722));
            }
            if (LiveMemoryOptSetting.INSTANCE.enableMemoryOpt() && (dataChannel = this.LJLJLLL) != null) {
                dataChannel.lv0(this, LiveCenterAlpha.class, new AqS171S0100000_5(this, 724));
                dataChannel.lv0(this, LiveCenterStatusChannel.class, new AqS171S0100000_5(this, 726));
            }
            LayeredWidgetManager layeredWidgetManager2 = this.LJLILLLLZI;
            if (layeredWidgetManager2 != null) {
                layeredWidgetManager2.load(R.id.j6m, C7N.LJI().SF(layer2PriorityManager));
            }
            View captcha_live_bg = _$_findCachedViewById(R.id.b4h);
            o.LJIIIIZZ(captcha_live_bg, "captcha_live_bg");
            layeredWidgetManager.load(R.id.b4i, new CaptchaLiveWidget(captcha_live_bg));
            if (C1DH.LJJIIJ(this.LJLJLLL)) {
                layeredWidgetManager.load(R.id.ijo, ((IQAService) CN1.LIZ(IQAService.class)).ck());
            }
            if (TestEnableLiveCoreSetting.INSTANCE.enable()) {
                wl();
            } else {
                View view = getView();
                if (view != null && (findViewById = view.findViewById(R.id.l2s)) != null) {
                    C29306Beo.LJJLJLI(findViewById);
                    C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 341), findViewById);
                }
            }
            if (!LiveCenterLayoutStyleSetting.INSTANCE.enableNewStyle()) {
                layeredWidgetManager.load(R.id.fvk, new LiveCenterEntranceWidget());
            } else {
                NetSpeedMonitorWidget netSpeedMonitorWidget = new NetSpeedMonitorWidget();
                this.LJLLJ = netSpeedMonitorWidget;
                layeredWidgetManager.load(R.id.gyq, netSpeedMonitorWidget);
            }
            DataChannel dataChannel3 = this.LJLJLLL;
            if (dataChannel3 != null) {
                room = (Room) dataChannel3.kv0(RoomChannel.class);
            } else {
                room = null;
            }
            if (C30791C6p.LIZ(room) && this.LJLLJ == null) {
                NetSpeedMonitorWidget netSpeedMonitorWidget2 = new NetSpeedMonitorWidget();
                this.LJLLJ = netSpeedMonitorWidget2;
                layeredWidgetManager.load(R.id.gyq, netSpeedMonitorWidget2);
            }
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveEffectDataProvider().LJFF(this.LJLJLLL);
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveEffectDataProvider().LJI(this.LJLJLLL);
            layeredWidgetManager.load(R.id.fvv, ((IDecorationService) CN1.LIZ(IDecorationService.class)).Sp0(layeredWidgetManager));
            B73.LIZIZ(new ARunnableS24S0200000_5(layeredWidgetManager, this, 74), this.LJLJLLL);
            layeredWidgetManager.load(R.id.jz6, new ShortCutPanelWidget());
            layeredWidgetManager.load(R.id.hpi, (Widget) ((IGiftService) CN1.LIZ(IGiftService.class)).getPinCardWidget(), false);
            DataChannelGlobal.LJLJJI.nv0(this, this, OpenLiveGoalPanelChannel.class, new AqS171S0100000_5(this, 729));
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(VoiceChatBroadcastInteractionFragment.class));
        LIZ.append("_prepareChildWidgets return as widgetManager is null");
        C0NB.LIZIZ("voice_chat", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC30105Brh
    public final void handleCopyrightViolation(RemindMessage remindMessage) {
        o.LJIIIZ(remindMessage, "remindMessage");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        B73.LIZIZ(new ARunnableS24S0200000_5(this, bundle, 20), this.LJLJLLL);
    }

    public final void xj(int i) {
        DataChannel dataChannel = this.LJLJLLL;
        if (dataChannel != null) {
            dataChannel.rv0(NetworkStatus.class, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [X.TYo, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC30130Bs6 abstractC30130Bs6;
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        LayeredWidgetManager of$default = LayeredWidgetManager.Companion.of$default(LayeredWidgetManager.Companion, false, this, view, LiveWidgetNonOpProvider.Companion.getInstance(), C30326BvG.LIZ, new VideoLayeredElementManager(getContext(), this, (LayeredConstraintLayout) view, this.LJLJLLL), C28329B9x.LIZJ(getContext()), false, 0, 384, null);
        of$default.setCheckContentViewAttached(LiveCheckContentViewAttachedSetting.INSTANCE.getValue());
        this.LJLILLLLZI = of$default;
        DataChannel dataChannel = this.LJLJLLL;
        if (dataChannel != null && (abstractC30130Bs6 = this.LJLLILLLL) != null) {
            C30087BrP c30087BrP = new C30087BrP(getContext(), this, this, view, of$default);
            c30087BrP.LJIIIZ(dataChannel, abstractC30130Bs6);
            c30087BrP.LJIIIIZZ(view, bundle);
            this.LJLIL = c30087BrP;
        }
        DataChannel dataChannel2 = this.LJLJLLL;
        if (dataChannel2 != null) {
            Room room = this.LJLLLL;
            if (room != null) {
                C29935Box c29935Box = new C29935Box(room, this, view, getContext(), dataChannel2);
                c29935Box.LIZ();
                this.LJLLI = c29935Box;
                C51 c51 = this.LJLJJI;
                if (c51 != null) {
                    c51.setDataChannel(this.LJLJLLL);
                }
                C30501By5.LIZJ = this.LJLJLLL;
                IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
                ViewModelProvider of = ViewModelProviders.of(this);
                o.LJIIIIZZ(of, "of(this@VoiceChatBroadcastInteractionFragment)");
                ?? RG = iRoomFunctionService.RG(of);
                StringBuilder sb = new StringBuilder("VideoBroadcastInteractionFragment_setPriorityTaskDispatcherData mDataChannel:");
                DataChannel dataChannel3 = this.LJLJLLL;
                if (dataChannel3 != null) {
                    i = dataChannel3.hashCode();
                } else {
                    i = 0;
                }
                sb.append(i);
                C0NB.LIZIZ("voice_chat", sb.toString());
                ((C32537Cpp) dataChannel2.gv0(C74969TbZ.class)).LIZ = RG;
            } else {
                o.LJIJI("room");
                throw null;
            }
        }
        C51 c512 = this.LJLJJI;
        if (c512 != null) {
            c512.setDataChannel(this.LJLJLLL);
        }
        if (LiveAnchorDebugInfoSetting.INSTANCE.enable()) {
            LivePerformanceManager LIZ = B4U.LIZ();
            AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(this, 296);
            LIZ.getClass();
            ((CopyOnWriteArrayList) LIZ.LLIIZ).add(aqS171S0100000_5);
            C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.asy));
        } else {
            C29306Beo.LJI(_$_findCachedViewById(R.id.asy));
        }
        DataChannel dataChannel4 = this.LJLJLLL;
        if (dataChannel4 != null) {
            this.LJLJJLL = new C30026BqQ(getContext(), dataChannel4);
            C30561Bz3 c30561Bz3 = new C30561Bz3(dataChannel4);
            this.LJLJJL = c30561Bz3;
            c30561Bz3.LIZIZ(this.LJLJJLL);
            Context context = getContext();
            LayeredConstraintLayout parent_view = (LayeredConstraintLayout) _$_findCachedViewById(R.id.hif);
            o.LJIIIIZZ(parent_view, "parent_view");
            this.LJLJL = new C30025BqP(context, dataChannel4, this, parent_view);
            this.LJLJLJ = new C30183Bsx(this.LJLJI, 5, new AqS171S0100000_5(this, 719));
            C30561Bz3 c30561Bz32 = this.LJLJJL;
            if (c30561Bz32 != null) {
                C30025BqP c30025BqP = this.LJLJL;
                if (c30025BqP != null) {
                    c30561Bz32.LIZIZ(c30025BqP);
                    if (!LiveCenterLayoutStyleSetting.INSTANCE.enableNewStyle()) {
                        C30561Bz3 c30561Bz33 = this.LJLJJL;
                        if (c30561Bz33 != null) {
                            C30183Bsx c30183Bsx = this.LJLJLJ;
                            if (c30183Bsx != null) {
                                c30561Bz33.LIZIZ(c30183Bsx);
                                C51 c513 = this.LJLJJI;
                                if (c513 != null) {
                                    c513.setGestureDetectLayout(this.LJLJI);
                                    return;
                                }
                                return;
                            }
                            o.LJIJI("liveCenterGestureDetector");
                            throw null;
                        }
                        o.LJIJI("liveBroadcastGestureDetector");
                        throw null;
                    }
                    return;
                }
                o.LJIJI("otherGestureDetector");
                throw null;
            }
            o.LJIJI("liveBroadcastGestureDetector");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.android.livesdkapi.depend.model.live.LiveMode, O] */
    public final void xl(DataChannel dataChannel, AbstractC30130Bs6 abstractC30130Bs6) {
        this.LJLJLLL = dataChannel;
        this.LJLLILLLL = abstractC30130Bs6;
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        if (room == null) {
            return;
        }
        this.LJLLLL = room;
        ((C32537Cpp) dataChannel.gv0(BCX.class)).LIZ = LiveMode.LIVE_VOICE;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LJI = C20910rv.LJI(R.layout.d3h, viewGroup, false, 12);
        try {
            ViewTreeLifecycleOwner.set(LJI, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LJI, this);
            C10A.LIZIZ(LJI, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LJI;
    }
}
