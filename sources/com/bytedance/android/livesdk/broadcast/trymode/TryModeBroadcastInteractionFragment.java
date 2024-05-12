package com.bytedance.android.livesdk.broadcast.trymode;

import X.AbstractC30130Bs6;
import X.ActivityC45651qj;
import X.AnonymousClass373;
import X.B4U;
import X.B73;
import X.BCW;
import X.BCX;
import X.BDE;
import X.BKY;
import X.BM1;
import X.BMS;
import X.BNK;
import X.BZI;
import X.C0NB;
import X.C0WR;
import X.C0WV;
import X.C10A;
import X.C141335gf;
import X.C14490hZ;
import X.C16880lQ;
import X.C1DH;
import X.C1XG;
import X.C20910rv;
import X.C28787BRn;
import X.C29078Bb8;
import X.C29306Beo;
import X.C29535BiV;
import X.C29726Bla;
import X.C29867Bnr;
import X.C29935Box;
import X.C29S;
import X.C30025BqP;
import X.C30104Brg;
import X.C30114Brq;
import X.C30157BsX;
import X.C30168Bsi;
import X.C30183Bsx;
import X.C30287Bud;
import X.C30290Bug;
import X.C30294Buk;
import X.C30296Bum;
import X.C30298Buo;
import X.C30300Buq;
import X.C30306Buw;
import X.C30317Bv7;
import X.C30326BvG;
import X.C30355Bvj;
import X.C30429Bwv;
import X.C30466BxW;
import X.C30471Bxb;
import X.C30501By5;
import X.C30503By7;
import X.C30561Bz3;
import X.C30725C4b;
import X.C30735C4l;
import X.C30770C5u;
import X.C30876C9w;
import X.C31691Mf;
import X.C31701Mg;
import X.C32041No;
import X.C32101Nu;
import X.C32141Ny;
import X.C32537Cpp;
import X.C32811Qn;
import X.C3C5;
import X.C45;
import X.C47261Igj;
import X.C48459J0d;
import X.C51;
import X.C5H3;
import X.C61898ORa;
import X.C73318Sq2;
import X.C73943T0h;
import X.C74740TUy;
import X.C74969TbZ;
import X.C76800UCe;
import X.C77067UMl;
import X.C78996UzQ;
import X.C7N;
import X.C90903hW;
import X.CMS;
import X.CN1;
import X.EnumC30204BtI;
import X.EnumC30226Bte;
import X.EnumC30414Bwg;
import X.InterfaceC08090Tl;
import X.InterfaceC27469AqH;
import X.InterfaceC29980Bpg;
import X.InterfaceC30146BsM;
import X.InterfaceC30313Bv3;
import X.InterfaceC30314Bv4;
import X.InterfaceC30442Bx8;
import X.InterfaceC31961Ng;
import X.ScaleGestureDetectorOnScaleGestureListenerC30428Bwu;
import X.UB9;
import X.UPJ;
import X.X1D;
import X.YLE;
import Y.ARunnableS24S0200000_5;
import Y.ARunnableS41S0100000_5;
import Y.AUListenerS94S0100000_5;
import Y.IDTListenerS115S0100000_5;
import android.animation.ValueAnimator;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.broadcast.api.ExposureCompensationVisibleChannel;
import com.bytedance.android.live.broadcast.api.IsHandleEffectChannel;
import com.bytedance.android.live.broadcast.api.RefreshExposureCompensationViewChannel;
import com.bytedance.android.live.broadcast.api.ZoomCameraScaleEvent;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.decoration.IDecorationService;
import com.bytedance.android.live.effect.api.ActionEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGameEffectFetchFailedEvent;
import com.bytedance.android.live.effect.api.LiveGameEffectFetchedChannel;
import com.bytedance.android.live.effect.api.LiveGoalEffectChannel;
import com.bytedance.android.live.effect.api.LiveGoalOverlayEvent;
import com.bytedance.android.live.effect.api.MoveLiveGoalEffectEvent;
import com.bytedance.android.live.effect.api.OpenLiveGoalPanelChannel;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCaptureImageChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.DrawGuessStartGameEvent;
import com.bytedance.android.live.liveinteract.api.CoHostPermissionCheckEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.userinfowidget.IUserInfoWidgetService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.broadcast.TryModeGoLiveChannel;
import com.bytedance.android.livesdk.broadcast.interaction.widget.BroadcastFilterStyleWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelPalletWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.StickerHintWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.TryModeLiveCenterEntranceWidget;
import com.bytedance.android.livesdk.broadcast.trymode.layer.TryModeVideoLayeredElementManager;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.chatroom.widget.LiveCloseWidget;
import com.bytedance.android.livesdk.dataChannel.CommentOrMessageData;
import com.bytedance.android.livesdk.dataChannel.HideInteractionEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveOpenCustomPollLynxEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdk.dataChannel.WidgetLoadedEvent;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterLayoutStyleSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectShortcutPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDelayDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userinfowidget.TryModeUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.message.IMessageService;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class TryModeBroadcastInteractionFragment extends BaseFragment implements InterfaceC30314Bv4, InterfaceC30313Bv3, InterfaceC27469AqH {
    public boolean LJLIL;
    public UB9 LJLILLLLZI;
    public BroadcastFilterStyleWidget LJLJI;
    public LiveRecyclableWidget LJLJJI;
    public LiveRecyclableWidget LJLJJL;
    public LiveRecyclableWidget LJLJJLL;
    public InterfaceC30146BsM LJLJL;
    public IPublicScreenHolderWidget LJLJLJ;
    public C30429Bwv LJLJLLL;
    public LayeredConstraintLayout LJLL;
    public DataChannel LJLLJ;
    public LayeredWidgetManager LJLLL;
    public Room LJLLLL;
    public C29935Box LJLLLLLL;
    public Runnable LJLZ;
    public C51 LJZ;
    public C30876C9w LJZI;
    public final C5H3 LJZL;
    public TryModeVideoLayeredElementManager LL;
    public C30561Bz3 LLD;
    public YLE LLF;
    public YLE LLFF;
    public ScaleGestureDetectorOnScaleGestureListenerC30428Bwu LLFFF;
    public C30025BqP LLFII;
    public C30183Bsx LLFZ;
    public C14490hZ LLI;
    public boolean LLIFFJFJJ;
    public final Map<Integer, View> LLII = new LinkedHashMap();
    public final C73318Sq2 LJLLI = new C73318Sq2();
    public final C5H3 LJLLILLLL = C78996UzQ.LJJIJIIJI(C30300Buq.LJLIL);

    @Override // X.InterfaceC30105Brh
    public final void R2(Layer2PriorityManager layer2PriorityManager) {
        o.LJIIIZ(layer2PriorityManager, "layer2PriorityManager");
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLII;
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
        C30876C9w c30876C9w = this.LJZI;
        if (c30876C9w != null) {
            c30876C9w.LJJJLL(new IDTListenerS115S0100000_5(this, 5));
        }
        postOnViewModulePrepared(this.LJLZ);
        IMessageService LJIILL = C7N.LJIILL();
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            View live_pause_text_view = _$_findCachedViewById(R.id.fxl);
            o.LJIIIIZZ(live_pause_text_view, "live_pause_text_view");
            this.LJLJL = LJIILL.configInteractionMessageHelper(this, dataChannel, null, live_pause_text_view, null, new C30104Brg(this), C30296Bum.LJLIL);
            return;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    @Override // X.InterfaceC30105Brh
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC30105Brh
    public final void handleCopyrightViolation(RemindMessage remindMessage) {
        o.LJIIIZ(remindMessage, "remindMessage");
    }

    public TryModeBroadcastInteractionFragment() {
        C29306Beo.LIZIZ(getContext());
        this.LJZL = C78996UzQ.LJJIJIIJI(C30294Buk.LJLIL);
        this.LLIFFJFJJ = true;
    }

    public final void Dl() {
        CMS cms;
        LayeredElementContext layeredElementContext;
        ConstraintProperty constraintPropertyById;
        LayeredElementContext layeredElementContext2;
        ConstraintProperty constraintPropertyById2;
        TryModeVideoLayeredElementManager tryModeVideoLayeredElementManager = this.LL;
        if (tryModeVideoLayeredElementManager != null && (layeredElementContext2 = tryModeVideoLayeredElementManager.getLayeredElementContext()) != null && (constraintPropertyById2 = layeredElementContext2.getConstraintPropertyById(C77067UMl.LIZJ)) != null && constraintPropertyById2.visibility() == 8) {
            return;
        }
        LiveRecyclableWidget liveRecyclableWidget = this.LJLJJI;
        if (liveRecyclableWidget != null) {
            liveRecyclableWidget.show();
        }
        LiveRecyclableWidget liveRecyclableWidget2 = this.LJLJJL;
        if (liveRecyclableWidget2 != null) {
            liveRecyclableWidget2.show();
        }
        TryModeVideoLayeredElementManager tryModeVideoLayeredElementManager2 = this.LL;
        if (tryModeVideoLayeredElementManager2 != null && (layeredElementContext = tryModeVideoLayeredElementManager2.getLayeredElementContext()) != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(C77067UMl.LIZJ)) != null) {
            constraintPropertyById.visibility(8);
        }
        C51 c51 = this.LJZ;
        if (c51 != null) {
            c51.setBlockTouchEvent(true);
        }
        TryModeVideoLayeredElementManager tryModeVideoLayeredElementManager3 = this.LL;
        if (tryModeVideoLayeredElementManager3 != null && (cms = (CMS) tryModeVideoLayeredElementManager3.getElementById(C77067UMl.LIZIZ)) != null && !cms.LJLJI) {
            ConstraintProperty constraintPropertyById3 = cms.LJLIL.getConstraintPropertyById(cms.getId());
            cms.LJLJI = true;
            if (constraintPropertyById3 != null) {
                ValueAnimator value = cms.LJLILLLLZI.getValue();
                value.cancel();
                value.removeAllUpdateListeners();
                value.setFloatValues(constraintPropertyById3.alpha(), 0.5f);
                value.addUpdateListener(new AUListenerS94S0100000_5(constraintPropertyById3, 37));
                value.start();
            }
        }
    }

    public final void hideFloatFragment() {
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            dataChannel.pv0(HideInteractionEvent.class);
            C7N.LJFF().Yd0().LIZ();
        } else {
            o.LJIJI("mDataChannel");
            throw null;
        }
    }

    @Override // X.InterfaceC30105Brh
    public final void nj() {
        C29935Box c29935Box = this.LJLLLLLL;
        if (c29935Box != null) {
            c29935Box.LIZIZ();
        } else {
            o.LJIJI("mLongPressHelper");
            throw null;
        }
    }

    @Override // X.InterfaceC27469AqH
    public final boolean onBackPressed() {
        Object value = C7N.LJI.getValue();
        o.LJIIIIZZ(value, "<get-hostCreativeTool>(...)");
        IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) value;
        if (iHostCreativeTool.isShowStickerView()) {
            iHostCreativeTool.hideStickerView();
            if (C76800UCe.LIZ != null) {
                return true;
            }
        }
        UPJ.LJFF(8, C73943T0h.LIZ());
        return true;
    }

    public final ValueAnimator vl() {
        return (ValueAnimator) this.LJZL.getValue();
    }

    public final void wl() {
        CMS cms;
        LayeredElementContext layeredElementContext;
        ConstraintProperty constraintPropertyById;
        LiveRecyclableWidget liveRecyclableWidget = this.LJLJJI;
        if (liveRecyclableWidget != null) {
            liveRecyclableWidget.hide();
        }
        LiveRecyclableWidget liveRecyclableWidget2 = this.LJLJJL;
        if (liveRecyclableWidget2 != null) {
            liveRecyclableWidget2.hide();
        }
        LiveRecyclableWidget liveRecyclableWidget3 = this.LJLJJLL;
        if (liveRecyclableWidget3 != null) {
            liveRecyclableWidget3.hide();
        }
        TryModeVideoLayeredElementManager tryModeVideoLayeredElementManager = this.LL;
        if (tryModeVideoLayeredElementManager != null && (layeredElementContext = tryModeVideoLayeredElementManager.getLayeredElementContext()) != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(C77067UMl.LIZJ)) != null) {
            constraintPropertyById.visibility(0);
        }
        C51 c51 = this.LJZ;
        if (c51 != null) {
            c51.setBlockTouchEvent(false);
        }
        TryModeVideoLayeredElementManager tryModeVideoLayeredElementManager2 = this.LL;
        if (tryModeVideoLayeredElementManager2 != null && (cms = (CMS) tryModeVideoLayeredElementManager2.getElementById(C77067UMl.LIZIZ)) != null && cms.LJLJI) {
            ConstraintProperty constraintPropertyById2 = cms.LJLIL.getConstraintPropertyById(cms.getId());
            cms.LJLJI = false;
            if (constraintPropertyById2 != null) {
                ValueAnimator value = cms.LJLILLLLZI.getValue();
                value.cancel();
                value.removeAllUpdateListeners();
                value.setFloatValues(constraintPropertyById2.alpha(), 1.0f);
                value.addUpdateListener(new AUListenerS94S0100000_5(constraintPropertyById2, 38));
                value.start();
            }
        }
    }

    @Override // X.InterfaceC30313Bv3
    public final AnonymousClass373 Lj() {
        return (AnonymousClass373) _$_findCachedViewById(R.id.kgs);
    }

    @Override // X.InterfaceC30105Brh
    public final void loadIndependentBehaviors() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.MORE;
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            enumC30204BtI.load(dataChannel, new C30168Bsi());
            EnumC30204BtI enumC30204BtI2 = EnumC30204BtI.SETTING;
            DataChannel dataChannel2 = this.LJLLJ;
            if (dataChannel2 != null) {
                enumC30204BtI2.load(dataChannel2, new BDE(context));
                EnumC30204BtI enumC30204BtI3 = EnumC30204BtI.INTRO;
                DataChannel dataChannel3 = this.LJLLJ;
                if (dataChannel3 != null) {
                    enumC30204BtI3.load(dataChannel3, new C29078Bb8(context));
                    ICommentService iCommentService = (ICommentService) CN1.LIZ(ICommentService.class);
                    DataChannel dataChannel4 = this.LJLLJ;
                    if (dataChannel4 != null) {
                        iCommentService.o50(context, dataChannel4);
                        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                        DataChannel dataChannel5 = this.LJLLJ;
                        if (dataChannel5 != null) {
                            iInteractService.od0(dataChannel5);
                            IInteractService iInteractService2 = (IInteractService) CN1.LIZ(IInteractService.class);
                            DataChannel dataChannel6 = this.LJLLJ;
                            if (dataChannel6 != null) {
                                iInteractService2.Wx(dataChannel6);
                                IRoomFunctionService LJIJI = C7N.LJIJI();
                                DataChannel dataChannel7 = this.LJLLJ;
                                if (dataChannel7 != null) {
                                    LJIJI.xk(dataChannel7);
                                    EnumC30204BtI enumC30204BtI4 = EnumC30204BtI.EFFECT;
                                    DataChannel dataChannel8 = this.LJLLJ;
                                    if (dataChannel8 != null) {
                                        enumC30204BtI4.load(dataChannel8, new C30466BxW(context, this));
                                        InterfaceC31961Ng insertStickerManager = C7N.LJII().getInsertStickerManager();
                                        if (insertStickerManager != null) {
                                            DataChannel dataChannel9 = this.LJLLJ;
                                            if (dataChannel9 != null) {
                                                insertStickerManager.JL(this, dataChannel9);
                                            } else {
                                                o.LJIJI("mDataChannel");
                                                throw null;
                                            }
                                        }
                                        EnumC30204BtI enumC30204BtI5 = EnumC30204BtI.PAUSE_LIVE;
                                        DataChannel dataChannel10 = this.LJLLJ;
                                        if (dataChannel10 != null) {
                                            enumC30204BtI5.load(dataChannel10, new C45());
                                            ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
                                            if (LIZIZ != null) {
                                                EnumC30204BtI enumC30204BtI6 = EnumC30204BtI.SHARE;
                                                DataChannel dataChannel11 = this.LJLLJ;
                                                if (dataChannel11 != null) {
                                                    C29867Bnr bW = C7N.LJIJJ().bW(LIZIZ, context, LiveMode.VIDEO, this);
                                                    o.LJIIIIZZ(bW, "shareService.getShareBeh…xt, LiveMode.VIDEO, this)");
                                                    enumC30204BtI6.load(dataChannel11, bW);
                                                    return;
                                                }
                                                o.LJIJI("mDataChannel");
                                                throw null;
                                            }
                                            return;
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
            o.LJIJI("mDataChannel");
            throw null;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((CopyOnWriteArrayList) B4U.LIZ().LLIIZ).clear();
        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGameEffectHelper();
        C1XG.LIZLLL();
        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalLogHelper();
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            C31701Mg.LIZJ(dataChannel, true);
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
            C32101Nu.LJIILIIL(C31691Mf.LJIIIIZZ, true);
            C31691Mf.LJIIIIZZ = null;
            IToolbarService LJJ = C7N.LJJ();
            DataChannel dataChannel2 = this.LJLLJ;
            if (dataChannel2 != null) {
                LJJ.N0(dataChannel2);
                C30561Bz3 c30561Bz3 = this.LLD;
                if (c30561Bz3 != null) {
                    YLE yle = this.LLF;
                    if (yle != null) {
                        c30561Bz3.LIZJ(yle);
                        C30561Bz3 c30561Bz32 = this.LLD;
                        if (c30561Bz32 != null) {
                            YLE yle2 = this.LLFF;
                            if (yle2 != null) {
                                c30561Bz32.LIZJ(yle2);
                                C30561Bz3 c30561Bz33 = this.LLD;
                                if (c30561Bz33 != null) {
                                    ScaleGestureDetectorOnScaleGestureListenerC30428Bwu scaleGestureDetectorOnScaleGestureListenerC30428Bwu = this.LLFFF;
                                    if (scaleGestureDetectorOnScaleGestureListenerC30428Bwu != null) {
                                        c30561Bz33.LIZJ(scaleGestureDetectorOnScaleGestureListenerC30428Bwu);
                                        C30561Bz3 c30561Bz34 = this.LLD;
                                        if (c30561Bz34 != null) {
                                            C30025BqP c30025BqP = this.LLFII;
                                            if (c30025BqP != null) {
                                                c30561Bz34.LIZJ(c30025BqP);
                                                C30561Bz3 c30561Bz35 = this.LLD;
                                                if (c30561Bz35 != null) {
                                                    C30183Bsx c30183Bsx = this.LLFZ;
                                                    if (c30183Bsx != null) {
                                                        c30561Bz35.LIZJ(c30183Bsx);
                                                        InterfaceC31961Ng insertStickerManager = C7N.LJII().getInsertStickerManager();
                                                        if (insertStickerManager != null) {
                                                            insertStickerManager.release();
                                                        }
                                                        DataChannel dataChannel3 = this.LJLLJ;
                                                        if (dataChannel3 != null) {
                                                            dataChannel3.jv0(this);
                                                            IBarrageService LIZLLL = C7N.LIZLLL();
                                                            Room room = this.LJLLLL;
                                                            if (room != null) {
                                                                LIZLLL.zM(room.getId());
                                                                DataChannel dataChannel4 = this.LJLLJ;
                                                                if (dataChannel4 != null) {
                                                                    dataChannel4.jv0(this);
                                                                    BKY LIZIZ = BKY.LIZIZ();
                                                                    if (LIZIZ.LIZ) {
                                                                        LIZIZ.LIZ = false;
                                                                        LIZIZ.LIZIZ = 0;
                                                                        LIZIZ.LIZJ = false;
                                                                    }
                                                                    BluetoothAdapter.getDefaultAdapter().closeProfileProxy(2, C30306Buw.LIZ);
                                                                    DataChannel dataChannel5 = this.LJLLJ;
                                                                    if (dataChannel5 != null) {
                                                                        if (C29306Beo.LJIILLIIL((Boolean) dataChannel5.kv0(TryModeGoLiveChannel.class))) {
                                                                            C30355Bvj.LJIIJJI();
                                                                            C32141Ny.LIZLLL();
                                                                        }
                                                                        C30501By5.LIZ.LIZJ(false, false);
                                                                        C30501By5.LIZJ = null;
                                                                        LayeredWidgetManager layeredWidgetManager = this.LJLLL;
                                                                        if (layeredWidgetManager != null) {
                                                                            C30317Bv7.LIZIZ(layeredWidgetManager);
                                                                            C30317Bv7.LJFF(2);
                                                                            if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
                                                                                ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
                                                                                C31691Mf.LIZJ = null;
                                                                            }
                                                                            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                                                                            dataChannelGlobal.getClass();
                                                                            dataChannelGlobal.jv0(this);
                                                                            IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                                                                            Room room2 = this.LJLLLL;
                                                                            if (room2 != null) {
                                                                                iInteractService.yW(room2);
                                                                                return;
                                                                            } else {
                                                                                o.LJIJI("mRoom");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        o.LJIJI("mWidgetManager");
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
                                                        o.LJIJI("mDataChannel");
                                                        throw null;
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
                                    o.LJIJI("cameraGestureDetector");
                                    throw null;
                                }
                                o.LJIJI("liveBroadcastGestureDetector");
                                throw null;
                            }
                            o.LJIJI("touchEffectGestureDetector");
                            throw null;
                        }
                        o.LJIJI("liveBroadcastGestureDetector");
                        throw null;
                    }
                    o.LJIJI("drawGuessGestureDetector");
                    throw null;
                }
                o.LJIJI("liveBroadcastGestureDetector");
                throw null;
            }
            o.LJIJI("mDataChannel");
            throw null;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC30442Bx8.LLF.LIZ(Boolean.valueOf(this.LLIFFJFJJ));
        this.LJLZ = null;
        C29935Box c29935Box = this.LJLLLLLL;
        if (c29935Box != null) {
            DialogInterface dialogInterface = c29935Box.LJFF;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            InterfaceC30146BsM interfaceC30146BsM = this.LJLJL;
            if (interfaceC30146BsM != null) {
                interfaceC30146BsM.onDestroy();
            }
            C30770C5u.LJFF(EnumC30414Bwg.EVENT_PAGE_BROADCAST);
            LayeredWidgetManager layeredWidgetManager = this.LJLLL;
            if (layeredWidgetManager != null) {
                layeredWidgetManager.unload(this.LJLJLJ);
                C30876C9w c30876C9w = this.LJZI;
                if (c30876C9w != null) {
                    c30876C9w.LJJLI();
                }
                IRoomFunctionService LJIJI = C7N.LJIJI();
                DataChannel dataChannel = this.LJLLJ;
                if (dataChannel != null) {
                    LJIJI.LLFFF(null, dataChannel);
                    IRoomFunctionService LJIJI2 = C7N.LJIJI();
                    if (this.LJLLJ != null) {
                        LJIJI2.fm(null);
                        C7N.LJIJI().ZO();
                        ISubscribeService LJIL = C7N.LJIL();
                        DataChannel dataChannel2 = this.LJLLJ;
                        if (dataChannel2 != null) {
                            LJIL.dq(dataChannel2);
                            BMS.LIZ.clear();
                            this.LJLLI.LIZLLL();
                            C7N.LJIJI().Hp0();
                            IRoomFunctionService LJIJI3 = C7N.LJIJI();
                            if (this.LJLLJ != null) {
                                Room room = this.LJLLLL;
                                if (room != null) {
                                    LJIJI3.fm(room);
                                    C14490hZ c14490hZ = this.LLI;
                                    if (c14490hZ != null) {
                                        getView();
                                        c14490hZ.LIZIZ();
                                    }
                                    ((LinkedHashMap) this.LLII).clear();
                                    return;
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
            o.LJIJI("mWidgetManager");
            throw null;
        }
        o.LJIJI("mLongPressHelper");
        throw null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            Context context = getContext();
            if (context != null) {
                C16880lQ.LJJLIIIJL(context, (C30503By7) this.LJLLILLLL.getValue());
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unregisterHeadsetReceiver ");
            LIZ.append(e.getMessage());
            C0NB.LJ("VideoBroadcastInteractionFragment", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        DataChannel dataChannel = this.LJLLJ;
        LiveEffect liveEffect = null;
        if (dataChannel != null) {
            dataChannel.pv0(CoHostPermissionCheckEvent.class);
            try {
                Context context = getContext();
                if (context != null) {
                    BroadcastReceiver broadcastReceiver = (BroadcastReceiver) this.LJLLILLLL.getValue();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                    intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.bluetooth.a2dp.profile.action.ACTIVE_DEVICE_CHANGED");
                    intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
                    C16880lQ.LJJLIIIJILLIZJL(broadcastReceiver, context, intentFilter);
                    this.LJLLILLLL.getValue().getClass();
                    C30503By7.LIZIZ(context);
                }
            } catch (IllegalArgumentException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("registerHeadsetReceiver ");
                LIZ.append(e.getMessage());
                C0NB.LJ("VideoBroadcastInteractionFragment", X1D.LIZIZ(LIZ));
            }
            C30501By5.LIZ.LIZLLL();
            if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
                InterfaceC08090Tl liveGoalEffectHelper = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                DataChannel dataChannel2 = this.LJLLJ;
                if (dataChannel2 != null) {
                    liveGoalEffectHelper.getClass();
                    C31691Mf.LIZJ = dataChannel2;
                    if (C31691Mf.LIZLLL() && C31691Mf.LIZIZ()) {
                        if (!C31691Mf.LJIIIZ()) {
                            List<? extends LiveEffect> list = C31691Mf.LIZIZ;
                            if (list != null) {
                                Integer LIZJ = InterfaceC30442Bx8.i2.LIZJ();
                                o.LJIIIIZZ(LIZJ, "LIVE_GOAL_EFFECT_POSITION.value");
                                liveEffect = (LiveEffect) ListProtector.get(list, LIZJ.intValue());
                            }
                            C31691Mf.LIZ(liveEffect);
                        }
                        C31691Mf.LJIILLIIL(false);
                        return;
                    }
                    return;
                }
                o.LJIJI("mDataChannel");
                throw null;
            }
            return;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            dataChannel.qv0(ZoomCameraScaleEvent.class, Float.valueOf(0.0f));
        } else {
            o.LJIJI("mDataChannel");
            throw null;
        }
    }

    public final void xl() {
        BroadcastFilterStyleWidget broadcastFilterStyleWidget;
        if (isViewValid() && (broadcastFilterStyleWidget = this.LJLJI) != null) {
            broadcastFilterStyleWidget.LJZ();
        }
    }

    @Override // X.InterfaceC30105Brh
    public final /* bridge */ /* synthetic */ C30876C9w w() {
        return this.LJZI;
    }

    @Override // X.InterfaceC30105Brh
    public final boolean LJIIIIZZ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        C30471Bxb.LIZ();
        int action = event.getAction() & 255;
        if (action != 1) {
            if (action == 2 && C30471Bxb.LJFF) {
                ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                if (C31691Mf.LJIIIZ()) {
                    DataChannel dataChannel = this.LJLLJ;
                    if (dataChannel != null) {
                        dataChannel.qv0(LiveGoalOverlayEvent.class, new ActionEvent(true, event.getX(), event.getY()));
                    } else {
                        o.LJIJI("mDataChannel");
                        throw null;
                    }
                }
            }
        } else if (C30471Bxb.LJFF) {
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
            if (C31691Mf.LJIIIZ()) {
                DataChannel dataChannel2 = this.LJLLJ;
                if (dataChannel2 != null) {
                    dataChannel2.qv0(LiveGoalOverlayEvent.class, new ActionEvent(false, event.getX(), event.getY()));
                } else {
                    o.LJIJI("mDataChannel");
                    throw null;
                }
            }
        }
        C30561Bz3 c30561Bz3 = this.LLD;
        if (c30561Bz3 != null) {
            return c30561Bz3.LIZ(event, new C32811Qn(C30471Bxb.LIZIZ, C30471Bxb.LIZJ, C30471Bxb.LJII, C30471Bxb.LJI));
        }
        o.LJIJI("liveBroadcastGestureDetector");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.LJLL == null) {
            return;
        }
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            dataChannel.mv0(WidgetLoadedEvent.class, this, new AqS171S0100000_5(this, 248));
            DataChannel dataChannel2 = this.LJLLJ;
            if (dataChannel2 != null) {
                dataChannel2.lv0(this, LiveOpenCustomPollLynxEvent.class, new AqS171S0100000_5(this, 530));
                C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLF;
                Boolean LIZJ = c48459J0d.LIZJ();
                o.LJIIIIZZ(LIZJ, "ANCHOR_COMMENTS_ENABLE.value");
                this.LLIFFJFJJ = LIZJ.booleanValue();
                Boolean bool = Boolean.TRUE;
                c48459J0d.LIZ(bool);
                Object value = C7N.LJJIIZI.getValue();
                o.LJIIIIZZ(value, "<get-userInfoWidgetService>(...)");
                TryModeUserInfoWidget zm = ((IUserInfoWidgetService) value).zm();
                if (zm != null) {
                    LayeredWidgetManager layeredWidgetManager = this.LJLLL;
                    if (layeredWidgetManager != null) {
                        layeredWidgetManager.load(R.id.mz0, zm);
                    } else {
                        o.LJIJI("mWidgetManager");
                        throw null;
                    }
                }
                LayeredWidgetManager layeredWidgetManager2 = this.LJLLL;
                if (layeredWidgetManager2 != null) {
                    IGiftService LJIIIIZZ = C7N.LJIIIIZZ();
                    LayeredWidgetManager layeredWidgetManager3 = this.LJLLL;
                    if (layeredWidgetManager3 != null) {
                        layeredWidgetManager2.load(R.id.n4b, (Widget) LJIIIIZZ.getGiftWidget(null, layeredWidgetManager3), true);
                        DataChannel dataChannel3 = this.LJLLJ;
                        if (dataChannel3 != null) {
                            dataChannel3.rv0(CommentOrMessageData.class, bool);
                            LayeredWidgetManager layeredWidgetManager4 = this.LJLLL;
                            if (layeredWidgetManager4 != null) {
                                this.LJLJLJ = (IPublicScreenHolderWidget) layeredWidgetManager4.load(R.id.gi_, C7N.LJIIZILJ().pq(true));
                                LayeredWidgetManager layeredWidgetManager5 = this.LJLLL;
                                if (layeredWidgetManager5 != null) {
                                    Object value2 = C7N.LJJIJIIJIL.getValue();
                                    o.LJIIIIZZ(value2, "<get-commentService>(...)");
                                    layeredWidgetManager5.load(R.id.bkq, ((ICommentService) value2).XC());
                                    LayeredWidgetManager layeredWidgetManager6 = this.LJLLL;
                                    if (layeredWidgetManager6 != null) {
                                        layeredWidgetManager6.load(R.id.fvp, new LiveCloseWidget());
                                        LayeredWidgetManager layeredWidgetManager7 = this.LJLLL;
                                        if (layeredWidgetManager7 != null) {
                                            layeredWidgetManager7.load(R.id.drp, StickerHintWidget.class);
                                            LayeredWidgetManager layeredWidgetManager8 = this.LJLLL;
                                            if (layeredWidgetManager8 != null) {
                                                IBannerService iBannerService = (IBannerService) CN1.LIZ(IBannerService.class);
                                                LayeredWidgetManager layeredWidgetManager9 = this.LJLLL;
                                                if (layeredWidgetManager9 != null) {
                                                    layeredWidgetManager8.load(R.id.nji, iBannerService.E80(layeredWidgetManager9));
                                                    loadIndependentBehaviors();
                                                    LiveGiftPollEffectWidget bv0 = C7N.LJIJI().bv0();
                                                    IRoomFunctionService LJIJI = C7N.LJIJI();
                                                    LayeredWidgetManager layeredWidgetManager10 = this.LJLLL;
                                                    if (layeredWidgetManager10 != null) {
                                                        LiveNormalPollEffectWidget E10 = LJIJI.E10(layeredWidgetManager10);
                                                        if (E10 != null) {
                                                            LayeredWidgetManager layeredWidgetManager11 = this.LJLLL;
                                                            if (layeredWidgetManager11 != null) {
                                                                layeredWidgetManager11.load(R.id.fxi, E10);
                                                            } else {
                                                                o.LJIJI("mWidgetManager");
                                                                throw null;
                                                            }
                                                        }
                                                        if (bv0 != null) {
                                                            LayeredWidgetManager layeredWidgetManager12 = this.LJLLL;
                                                            if (layeredWidgetManager12 != null) {
                                                                layeredWidgetManager12.load(R.id.fwx, bv0);
                                                            } else {
                                                                o.LJIJI("mWidgetManager");
                                                                throw null;
                                                            }
                                                        }
                                                        LayeredWidgetManager layeredWidgetManager13 = this.LJLLL;
                                                        if (layeredWidgetManager13 != null) {
                                                            layeredWidgetManager13.load(R.id.dno, C7N.LJIJJLI().getFreeFrameSlotWidget());
                                                            LayeredWidgetManager layeredWidgetManager14 = this.LJLLL;
                                                            if (layeredWidgetManager14 != null) {
                                                                layeredWidgetManager14.load(R.id.llr, new TryModeGoLiveWidget());
                                                                DataChannel dataChannel4 = this.LJLLJ;
                                                                if (dataChannel4 != null) {
                                                                    dataChannel4.lv0(this, DrawGuessCaptureImageChannel.class, new AqS171S0100000_5(this, 543));
                                                                    dataChannel4.ov0(this, StickerSelectedEvent.class, new AqS171S0100000_5(this, 545));
                                                                    dataChannel4.ov0(this, StickerCancelChannel.class, new AqS171S0100000_5(this, 546));
                                                                    dataChannel4.lv0(this, LiveGoalEffectChannel.class, C30290Bug.LJLIL);
                                                                    dataChannel4.lv0(this, MoveLiveGoalEffectEvent.class, C30287Bud.LJLIL);
                                                                    dataChannel4.lv0(this, ExposureCompensationVisibleChannel.class, new AqS171S0100000_5(this, 550));
                                                                    dataChannel4.lv0(this, RefreshExposureCompensationViewChannel.class, new AqS171S0100000_5(this, 552));
                                                                    if (LiveMemoryOptSetting.INSTANCE.enableMemoryOpt()) {
                                                                        DataChannel dataChannel5 = this.LJLLJ;
                                                                        if (dataChannel5 != null) {
                                                                            dataChannel5.lv0(this, LiveCenterAlpha.class, new AqS171S0100000_5(this, 554));
                                                                            dataChannel5.lv0(this, LiveCenterStatusChannel.class, new AqS171S0100000_5(this, 540));
                                                                        } else {
                                                                            o.LJIJI("mDataChannel");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                    DataChannel dataChannel6 = this.LJLLJ;
                                                                    if (dataChannel6 != null) {
                                                                        if (C1DH.LJJIIJ(dataChannel6)) {
                                                                            LayeredWidgetManager layeredWidgetManager15 = this.LJLLL;
                                                                            if (layeredWidgetManager15 != null) {
                                                                                layeredWidgetManager15.load(R.id.ijo, ((IQAService) CN1.LIZ(IQAService.class)).ck());
                                                                            } else {
                                                                                o.LJIJI("mWidgetManager");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        LayeredWidgetManager layeredWidgetManager16 = this.LJLLL;
                                                                        if (layeredWidgetManager16 != null) {
                                                                            layeredWidgetManager16.load(R.id.fvk, new TryModeLiveCenterEntranceWidget());
                                                                            if (LiveBroadcastPoorDeviceDowngradeSetting.INSTANCE.enable()) {
                                                                                B73.LIZ().postDelayed(new ARunnableS41S0100000_5(this, 208), LiveBroadcastPoorDeviceDelayDurationSetting.INSTANCE.value());
                                                                            } else {
                                                                                LayeredWidgetManager layeredWidgetManager17 = this.LJLLL;
                                                                                if (layeredWidgetManager17 != null) {
                                                                                    BroadcastFilterStyleWidget broadcastFilterStyleWidget = new BroadcastFilterStyleWidget();
                                                                                    this.LJLJI = broadcastFilterStyleWidget;
                                                                                    layeredWidgetManager17.load(R.id.d_c, broadcastFilterStyleWidget);
                                                                                } else {
                                                                                    o.LJIJI("mWidgetManager");
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            LayeredWidgetManager layeredWidgetManager18 = this.LJLLL;
                                                                            if (layeredWidgetManager18 != null) {
                                                                                IDecorationService iDecorationService = (IDecorationService) CN1.LIZ(IDecorationService.class);
                                                                                LayeredWidgetManager layeredWidgetManager19 = this.LJLLL;
                                                                                if (layeredWidgetManager19 != null) {
                                                                                    layeredWidgetManager18.load(R.id.fvv, iDecorationService.Sp0(layeredWidgetManager19));
                                                                                    if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
                                                                                        LayeredWidgetManager layeredWidgetManager20 = this.LJLLL;
                                                                                        if (layeredWidgetManager20 != null) {
                                                                                            layeredWidgetManager20.load(R.id.fx0, ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectWidget());
                                                                                        } else {
                                                                                            o.LJIJI("mWidgetManager");
                                                                                            throw null;
                                                                                        }
                                                                                    }
                                                                                    LayeredWidgetManager layeredWidgetManager21 = this.LJLLL;
                                                                                    if (layeredWidgetManager21 != null) {
                                                                                        layeredWidgetManager21.load(C7N.LJIIIIZZ().getRedEnvelopeWidget());
                                                                                        DataChannel dataChannel7 = this.LJLLJ;
                                                                                        if (dataChannel7 != null) {
                                                                                            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveEffectDataProvider().LJFF(dataChannel7);
                                                                                            if (ToolBarRefactor.enable()) {
                                                                                                LayeredWidgetManager layeredWidgetManager22 = this.LJLLL;
                                                                                                if (layeredWidgetManager22 != null) {
                                                                                                    IToolbarService iToolbarService = (IToolbarService) CN1.LIZ(IToolbarService.class);
                                                                                                    DataChannel dataChannel8 = this.LJLLJ;
                                                                                                    if (dataChannel8 != null) {
                                                                                                        layeredWidgetManager22.load(R.id.lcv, iToolbarService.EA(null, dataChannel8), false);
                                                                                                    } else {
                                                                                                        o.LJIJI("mDataChannel");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    o.LJIJI("mWidgetManager");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                LayeredWidgetManager layeredWidgetManager23 = this.LJLLL;
                                                                                                if (layeredWidgetManager23 != null) {
                                                                                                    Class<? extends LiveRecyclableWidget> Uu0 = ((IToolbarService) CN1.LIZ(IToolbarService.class)).Uu0();
                                                                                                    ArrayList arrayList = new ArrayList();
                                                                                                    arrayList.add(EnumC30204BtI.INTERACTION_FEATURES);
                                                                                                    arrayList.add(EnumC30204BtI.SHARE);
                                                                                                    arrayList.add(EnumC30204BtI.EFFECT);
                                                                                                    arrayList.add(EnumC30204BtI.MORE);
                                                                                                    layeredWidgetManager23.load(R.id.lcv, Uu0, false, C61898ORa.LJJII(new C29726Bla(SystemClock.elapsedRealtime()), new Object[]{arrayList, C47261Igj.LJII(EnumC30204BtI.TRY_MODE_COHOST, EnumC30204BtI.TRY_MODE_MULTIGUEST)}));
                                                                                                } else {
                                                                                                    o.LJIJI("mWidgetManager");
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                            DataChannel dataChannel9 = this.LJLLJ;
                                                                                            if (dataChannel9 != null) {
                                                                                                dataChannel9.lv0(this, LiveGameEffectFetchedChannel.class, C29535BiV.LJLIL);
                                                                                                dataChannel9.lv0(this, LiveGameEffectFetchFailedEvent.class, C30298Buo.LJLIL);
                                                                                                dataChannel9.lv0(this, DrawGuessStartGameEvent.class, new AqS171S0100000_5(this, 535));
                                                                                                dataChannel9.lv0(this, DrawGuessExitGameEvent.class, new AqS171S0100000_5(this, 536));
                                                                                                dataChannel9.lv0(this, DrawGuessIsCountingDownRoundStart.class, new AqS171S0100000_5(this, 537));
                                                                                                dataChannel9.lv0(this, DrawGuessFreelyStartChannel.class, new AqS171S0100000_5(this, 539));
                                                                                                C0WR liveEffectDataProvider = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveEffectDataProvider();
                                                                                                DataChannel dataChannel10 = this.LJLLJ;
                                                                                                if (dataChannel10 != null) {
                                                                                                    liveEffectDataProvider.LIZIZ(dataChannel10);
                                                                                                    this.LJLJJI = C7N.LJIJI().mR(this);
                                                                                                    this.LJLJJL = C7N.LJIJI().Qz();
                                                                                                    this.LJLJJLL = C7N.LJIJI().yG();
                                                                                                    LayeredWidgetManager layeredWidgetManager24 = this.LJLLL;
                                                                                                    if (layeredWidgetManager24 != null) {
                                                                                                        layeredWidgetManager24.load(R.id.ch9, this.LJLJJI);
                                                                                                        LayeredWidgetManager layeredWidgetManager25 = this.LJLLL;
                                                                                                        if (layeredWidgetManager25 != null) {
                                                                                                            layeredWidgetManager25.load(R.id.ch5, this.LJLJJL);
                                                                                                            LayeredWidgetManager layeredWidgetManager26 = this.LJLLL;
                                                                                                            if (layeredWidgetManager26 != null) {
                                                                                                                layeredWidgetManager26.load(R.id.ch8, this.LJLJJLL);
                                                                                                                if (LiveEffectShortcutPanelTypeSetting.INSTANCE.getValue() != 0) {
                                                                                                                    LayeredWidgetManager layeredWidgetManager27 = this.LJLLL;
                                                                                                                    if (layeredWidgetManager27 != null) {
                                                                                                                        layeredWidgetManager27.load(R.id.jz8, new ShortCutPanelPalletWidget());
                                                                                                                    } else {
                                                                                                                        o.LJIJI("mWidgetManager");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                }
                                                                                                                LayeredWidgetManager layeredWidgetManager28 = this.LJLLL;
                                                                                                                if (layeredWidgetManager28 != null) {
                                                                                                                    layeredWidgetManager28.load(R.id.jz6, new ShortCutPanelWidget());
                                                                                                                    DataChannelGlobal.LJLJJI.nv0(this, this, OpenLiveGoalPanelChannel.class, new AqS171S0100000_5(this, 541));
                                                                                                                    IBarrageService LIZLLL = C7N.LIZLLL();
                                                                                                                    Room room = this.LJLLLL;
                                                                                                                    if (room != null) {
                                                                                                                        InterfaceC29980Bpg hq0 = LIZLLL.hq0(room.getId());
                                                                                                                        if (hq0 != null && hq0.isEnabled()) {
                                                                                                                            if (hq0.LIZIZ()) {
                                                                                                                                LayeredWidgetManager layeredWidgetManager29 = this.LJLLL;
                                                                                                                                if (layeredWidgetManager29 != null) {
                                                                                                                                    layeredWidgetManager29.load(R.id.jna, C7N.LIZLLL().Rc0(hq0));
                                                                                                                                } else {
                                                                                                                                    o.LJIJI("mWidgetManager");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (hq0.LJIIIZ()) {
                                                                                                                                LayeredWidgetManager layeredWidgetManager30 = this.LJLLL;
                                                                                                                                if (layeredWidgetManager30 != null) {
                                                                                                                                    layeredWidgetManager30.load(R.id.he7, C7N.LIZLLL().Oa(hq0));
                                                                                                                                } else {
                                                                                                                                    o.LJIJI("mWidgetManager");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        LayeredWidgetManager layeredWidgetManager31 = this.LJLLL;
                                                                                                                        if (layeredWidgetManager31 != null) {
                                                                                                                            layeredWidgetManager31.load(R.id.c22, ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).z50());
                                                                                                                            LayeredWidgetManager layeredWidgetManager32 = this.LJLLL;
                                                                                                                            if (layeredWidgetManager32 != null) {
                                                                                                                                layeredWidgetManager32.load(R.id.cww, new EndWidget());
                                                                                                                                return;
                                                                                                                            } else {
                                                                                                                                o.LJIJI("mWidgetManager");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        o.LJIJI("mWidgetManager");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    o.LJIJI("mRoom");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                o.LJIJI("mWidgetManager");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            o.LJIJI("mWidgetManager");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        o.LJIJI("mWidgetManager");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    o.LJIJI("mWidgetManager");
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
                                                                                    o.LJIJI("mWidgetManager");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("mWidgetManager");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("mWidgetManager");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("mWidgetManager");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("mDataChannel");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("mDataChannel");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mWidgetManager");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mWidgetManager");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mWidgetManager");
                                                    throw null;
                                                }
                                                o.LJIJI("mWidgetManager");
                                                throw null;
                                            }
                                            o.LJIJI("mWidgetManager");
                                            throw null;
                                        }
                                        o.LJIJI("mWidgetManager");
                                        throw null;
                                    }
                                    o.LJIJI("mWidgetManager");
                                    throw null;
                                }
                                o.LJIJI("mWidgetManager");
                                throw null;
                            }
                            o.LJIJI("mWidgetManager");
                            throw null;
                        }
                        o.LJIJI("mDataChannel");
                        throw null;
                    }
                    o.LJIJI("mWidgetManager");
                    throw null;
                }
                o.LJIJI("mWidgetManager");
                throw null;
            }
            o.LJIJI("mDataChannel");
            throw null;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    public final void postOnViewModulePrepared(Runnable runnable) {
        if (getView() != null && runnable != null) {
            this.LJLZ = null;
            View view = getView();
            if (view != null) {
                view.post(new ARunnableS41S0100000_5(runnable, 83));
                return;
            }
            return;
        }
        this.LJLZ = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.android.livesdkapi.depend.model.live.LiveMode, O] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean, java.lang.Object, O] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    public final void Al(DataChannel dataChannel, AbstractC30130Bs6 abstractC30130Bs6) {
        this.LJLLJ = dataChannel;
        Object kv0 = dataChannel.kv0(RoomChannel.class);
        o.LJI(kv0);
        this.LJLLLL = (Room) kv0;
        DataChannel dataChannel2 = this.LJLLJ;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(BCX.class)).LIZ = LiveMode.VIDEO;
            DataChannel dataChannel3 = this.LJLLJ;
            if (dataChannel3 != 0) {
                ?? r1 = Boolean.FALSE;
                ((C32537Cpp) dataChannel3.gv0(C30114Brq.class)).LIZ = r1;
                dataChannel3.rv0(CommentOrMessageData.class, r1);
                ((C32537Cpp) dataChannel3.gv0(BCW.class)).LIZ = Boolean.TRUE;
                ((C32537Cpp) dataChannel3.gv0(BNK.class)).LIZ = Boolean.valueOf(ToolBarButtonWithTextExperiment.hasText());
                BM1.LIZJ();
                return;
            }
            o.LJIJI("mDataChannel");
            throw null;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    @Override // X.InterfaceC30314Bv4
    public final void j1(String str, boolean z) {
        BroadcastFilterStyleWidget broadcastFilterStyleWidget;
        if (!isViewValid() || str == null || str.length() == 0) {
            return;
        }
        if (this.LJLIL && (broadcastFilterStyleWidget = this.LJLJI) != null) {
            broadcastFilterStyleWidget.LJZI(str, z);
        }
        this.LJLIL = true;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [X.TYo, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC30226Bte enumC30226Bte;
        C30429Bwv c30429Bwv;
        C30735C4l exposureBar;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        LayeredConstraintLayout layeredConstraintLayout = (LayeredConstraintLayout) view;
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            TryModeVideoLayeredElementManager tryModeVideoLayeredElementManager = new TryModeVideoLayeredElementManager(context, this, layeredConstraintLayout, dataChannel);
            LayeredWidgetManager of = LayeredWidgetManager.Companion.of(false, this, view, LiveWidgetNonOpProvider.Companion.getInstance(), C30326BvG.LIZ, tryModeVideoLayeredElementManager);
            this.LJLLL = of;
            this.LL = tryModeVideoLayeredElementManager;
            if (of != null) {
                C30317Bv7.LJI(2, of);
                LayeredWidgetManager layeredWidgetManager = this.LJLLL;
                if (layeredWidgetManager != null) {
                    C30317Bv7.LIZ(2, layeredWidgetManager);
                    C74740TUy.LIZLLL().LJI(0);
                    C30725C4b.LIZJ(getContext());
                    IToolbarService LJJ = C7N.LJJ();
                    Context context2 = getContext();
                    DataChannel dataChannel2 = this.LJLLJ;
                    if (dataChannel2 != null) {
                        LJJ.Gv(context2, this, dataChannel2);
                        IToolbarService LJJ2 = C7N.LJJ();
                        Context context3 = getContext();
                        if (ToolBarButtonWithTextExperiment.hasText()) {
                            enumC30226Bte = EnumC30226Bte.ICON_WITH_TEXT;
                        } else {
                            enumC30226Bte = EnumC30226Bte.ICON;
                        }
                        LJJ2.vh(context3, 7, enumC30226Bte);
                        view.setFitsSystemWindows(true);
                        view.post(new ARunnableS24S0200000_5(this, view, 40));
                        IBrowserService LJFF = C7N.LJFF();
                        DataChannel dataChannel3 = this.LJLLJ;
                        if (dataChannel3 != null) {
                            LJFF.dr(this, dataChannel3, true, this);
                            IBarrageService LIZLLL = C7N.LIZLLL();
                            DataChannel dataChannel4 = this.LJLLJ;
                            if (dataChannel4 != null) {
                                LIZLLL.x90(this, dataChannel4, this.LJZI);
                                DataChannel dataChannel5 = this.LJLLJ;
                                if (dataChannel5 != null) {
                                    new C30157BsX(this, dataChannel5);
                                    C0WV LJIIJ = C30355Bvj.LJIIJ();
                                    DataChannel dataChannel6 = this.LJLLJ;
                                    if (dataChannel6 != null) {
                                        ((C32041No) LJIIJ).LJII(this, dataChannel6);
                                        BKY LIZIZ = BKY.LIZIZ();
                                        if (LIZIZ.LIZ) {
                                            LIZIZ.LIZ = false;
                                            LIZIZ.LIZIZ = 0;
                                            LIZIZ.LIZJ = false;
                                        }
                                        LIZIZ.LIZ = true;
                                        Room room = this.LJLLLL;
                                        if (room != null) {
                                            Context context4 = getContext();
                                            DataChannel dataChannel7 = this.LJLLJ;
                                            if (dataChannel7 != null) {
                                                C29935Box c29935Box = new C29935Box(room, this, view, context4, dataChannel7);
                                                c29935Box.LIZ();
                                                this.LJLLLLLL = c29935Box;
                                                C51 c51 = this.LJZ;
                                                if (c51 != null) {
                                                    DataChannel dataChannel8 = this.LJLLJ;
                                                    if (dataChannel8 != null) {
                                                        c51.setDataChannel(dataChannel8);
                                                    } else {
                                                        o.LJIJI("mDataChannel");
                                                        throw null;
                                                    }
                                                }
                                                DataChannel dataChannel9 = this.LJLLJ;
                                                if (dataChannel9 != null) {
                                                    C30501By5.LIZJ = dataChannel9;
                                                    IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class);
                                                    ViewModelProvider of2 = ViewModelProviders.of(this);
                                                    o.LJIIIIZZ(of2, "of(this)");
                                                    ?? RG = iRoomFunctionService.RG(of2);
                                                    DataChannel dataChannel10 = this.LJLLJ;
                                                    if (dataChannel10 != null) {
                                                        ((C32537Cpp) dataChannel10.gv0(C74969TbZ.class)).LIZ = RG;
                                                        DataChannel dataChannel11 = this.LJLLJ;
                                                        if (dataChannel11 != null) {
                                                            this.LLD = new C30561Bz3(dataChannel11);
                                                            Context context5 = getContext();
                                                            DataChannel dataChannel12 = this.LJLLJ;
                                                            if (dataChannel12 != null) {
                                                                this.LLF = new YLE(context5, dataChannel12, 1);
                                                                Context context6 = getContext();
                                                                DataChannel dataChannel13 = this.LJLLJ;
                                                                if (dataChannel13 != null) {
                                                                    this.LLFF = new YLE(context6, dataChannel13, 2);
                                                                    Context context7 = getContext();
                                                                    DataChannel dataChannel14 = this.LJLLJ;
                                                                    if (dataChannel14 != null) {
                                                                        LayeredConstraintLayout parent_view = (LayeredConstraintLayout) _$_findCachedViewById(R.id.hif);
                                                                        o.LJIIIIZZ(parent_view, "parent_view");
                                                                        this.LLFII = new C30025BqP(context7, dataChannel14, this, parent_view);
                                                                        Context context8 = getContext();
                                                                        DataChannel dataChannel15 = this.LJLLJ;
                                                                        if (dataChannel15 != null) {
                                                                            this.LLFFF = new ScaleGestureDetectorOnScaleGestureListenerC30428Bwu(context8, dataChannel15, 4, this);
                                                                            this.LLFZ = new C30183Bsx(this.LJZI, 5, new AqS171S0100000_5(this, 531));
                                                                            C30561Bz3 c30561Bz3 = this.LLD;
                                                                            if (c30561Bz3 != null) {
                                                                                YLE yle = this.LLF;
                                                                                if (yle != null) {
                                                                                    c30561Bz3.LIZIZ(yle);
                                                                                    C30561Bz3 c30561Bz32 = this.LLD;
                                                                                    if (c30561Bz32 != null) {
                                                                                        YLE yle2 = this.LLFF;
                                                                                        if (yle2 != null) {
                                                                                            c30561Bz32.LIZIZ(yle2);
                                                                                            C30561Bz3 c30561Bz33 = this.LLD;
                                                                                            if (c30561Bz33 != null) {
                                                                                                C30025BqP c30025BqP = this.LLFII;
                                                                                                if (c30025BqP != null) {
                                                                                                    c30561Bz33.LIZIZ(c30025BqP);
                                                                                                    C30561Bz3 c30561Bz34 = this.LLD;
                                                                                                    if (c30561Bz34 != null) {
                                                                                                        ScaleGestureDetectorOnScaleGestureListenerC30428Bwu scaleGestureDetectorOnScaleGestureListenerC30428Bwu = this.LLFFF;
                                                                                                        if (scaleGestureDetectorOnScaleGestureListenerC30428Bwu != null) {
                                                                                                            c30561Bz34.LIZIZ(scaleGestureDetectorOnScaleGestureListenerC30428Bwu);
                                                                                                            if (!LiveCenterLayoutStyleSetting.INSTANCE.enableNewStyle()) {
                                                                                                                C30561Bz3 c30561Bz35 = this.LLD;
                                                                                                                if (c30561Bz35 != null) {
                                                                                                                    C30183Bsx c30183Bsx = this.LLFZ;
                                                                                                                    if (c30183Bsx != null) {
                                                                                                                        c30561Bz35.LIZIZ(c30183Bsx);
                                                                                                                        C51 c512 = this.LJZ;
                                                                                                                        if (c512 != null) {
                                                                                                                            c512.setGestureDetectLayout(this.LJZI);
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        o.LJIJI("liveCenterGestureDetector");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    o.LJIJI("liveBroadcastGestureDetector");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                            }
                                                                                                            if (this.LLFF != null) {
                                                                                                                if (YLE.LJI()) {
                                                                                                                    ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                                                                                                                    if (!C31691Mf.LJIIIZ()) {
                                                                                                                        DataChannel dataChannel16 = this.LJLLJ;
                                                                                                                        if (dataChannel16 != null) {
                                                                                                                            dataChannel16.rv0(IsHandleEffectChannel.class, Boolean.TRUE);
                                                                                                                        } else {
                                                                                                                            o.LJIJI("mDataChannel");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                BZI LIZ = C28787BRn.LIZ("livesdk_trymode_practice_enter_success");
                                                                                                                DataChannel dataChannel17 = this.LJLLJ;
                                                                                                                if (dataChannel17 != null) {
                                                                                                                    LIZ.LJIILLIIL(dataChannel17);
                                                                                                                    LIZ.LJJIIJZLJL();
                                                                                                                    Context context9 = getContext();
                                                                                                                    if (context9 != null) {
                                                                                                                        c30429Bwv = new C30429Bwv(context9);
                                                                                                                    } else {
                                                                                                                        c30429Bwv = null;
                                                                                                                    }
                                                                                                                    this.LJLJLLL = c30429Bwv;
                                                                                                                    if (c30429Bwv != null) {
                                                                                                                        DataChannel dataChannel18 = this.LJLLJ;
                                                                                                                        if (dataChannel18 != null) {
                                                                                                                            c30429Bwv.setDataChannel(dataChannel18);
                                                                                                                        } else {
                                                                                                                            o.LJIJI("mDataChannel");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    C30429Bwv c30429Bwv2 = this.LJLJLLL;
                                                                                                                    if (c30429Bwv2 != null && (exposureBar = c30429Bwv2.getExposureBar()) != null) {
                                                                                                                        DataChannel dataChannel19 = this.LJLLJ;
                                                                                                                        if (dataChannel19 != null) {
                                                                                                                            exposureBar.setDataChannel(dataChannel19);
                                                                                                                        } else {
                                                                                                                            o.LJIJI("mDataChannel");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    this.LJLL = layeredConstraintLayout;
                                                                                                                    layeredConstraintLayout.addView(this.LJLJLLL, new ViewGroup.LayoutParams(-1, -1));
                                                                                                                    ScaleGestureDetectorOnScaleGestureListenerC30428Bwu scaleGestureDetectorOnScaleGestureListenerC30428Bwu2 = this.LLFFF;
                                                                                                                    if (scaleGestureDetectorOnScaleGestureListenerC30428Bwu2 != null) {
                                                                                                                        scaleGestureDetectorOnScaleGestureListenerC30428Bwu2.LJLLL = new AqS171S0100000_5(this, 249);
                                                                                                                        IRoomFunctionService LJIJI = C7N.LJIJI();
                                                                                                                        DataChannel dataChannel20 = this.LJLLJ;
                                                                                                                        if (dataChannel20 != null) {
                                                                                                                            Room room2 = this.LJLLLL;
                                                                                                                            if (room2 != null) {
                                                                                                                                LJIJI.Jc(this, room2, dataChannel20);
                                                                                                                                ScaleGestureDetectorOnScaleGestureListenerC30428Bwu scaleGestureDetectorOnScaleGestureListenerC30428Bwu3 = this.LLFFF;
                                                                                                                                if (scaleGestureDetectorOnScaleGestureListenerC30428Bwu3 != null) {
                                                                                                                                    scaleGestureDetectorOnScaleGestureListenerC30428Bwu3.LJZL = new AqS152S0200000_5(this, view, 6);
                                                                                                                                    return;
                                                                                                                                } else {
                                                                                                                                    o.LJIJI("cameraGestureDetector");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            o.LJIJI("mRoom");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        o.LJIJI("mDataChannel");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    o.LJIJI("cameraGestureDetector");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                o.LJIJI("mDataChannel");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            o.LJIJI("touchEffectGestureDetector");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        o.LJIJI("cameraGestureDetector");
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
                                                                                        o.LJIJI("touchEffectGestureDetector");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("liveBroadcastGestureDetector");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("drawGuessGestureDetector");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("liveBroadcastGestureDetector");
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
                                            o.LJIJI("mDataChannel");
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
                o.LJIJI("mWidgetManager");
                throw null;
            }
            o.LJIJI("mWidgetManager");
            throw null;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LJI = C20910rv.LJI(R.layout.d3i, viewGroup, false, 12);
        DataChannel dataChannel = this.LJLLJ;
        C29S c29s = null;
        if (dataChannel != null) {
            C14490hZ c14490hZ = new C14490hZ(dataChannel);
            this.LLI = c14490hZ;
            c14490hZ.LIZ(LJI, getViewLifecycleOwner());
            try {
                ViewTreeLifecycleOwner.set(LJI, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LJI, this);
                C10A.LIZIZ(LJI, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            return LJI;
        }
        o.LJIJI("mDataChannel");
        throw null;
    }
}
