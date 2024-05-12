package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C0NB;
import X.C15380j0;
import X.C184077Kh;
import X.C214528bQ;
import X.C221108m2;
import X.C28329B9x;
import X.C29306Beo;
import X.C29494Bhq;
import X.C30868C9o;
import X.C31037CGb;
import X.C32014ChO;
import X.C32213Ckb;
import X.C32537Cpp;
import X.C51029K0z;
import X.C55230Lly;
import X.C59994Ngc;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73943T0h;
import X.C73994T2g;
import X.C74630TQs;
import X.C74632TQu;
import X.C74650TRm;
import X.C74830TYk;
import X.C74838TYs;
import X.C74842TYw;
import X.C74987Tbr;
import X.C75042Tck;
import X.C75053Tcv;
import X.C75072TdE;
import X.C75081TdN;
import X.C75089TdV;
import X.C75286Tgg;
import X.C75415Til;
import X.C75515TkN;
import X.C75559Tl5;
import X.C78857UxB;
import X.C78926UyI;
import X.C79234V7u;
import X.C8E;
import X.EnumC30204BtI;
import X.EnumC74778TWk;
import X.EnumC75468Tjc;
import X.InterfaceC30237Btp;
import X.InterfaceC30442Bx8;
import X.InterfaceC31781Cdd;
import X.InterfaceC31805Ce1;
import X.InterfaceC55235Lm3;
import X.InterfaceC74695TTf;
import X.InterfaceC75138TeI;
import X.InterfaceC75441TjB;
import X.TQU;
import X.TUW;
import X.TXZ;
import X.TYQ;
import X.TZC;
import X.TZJ;
import X.UC0;
import X.UPJ;
import X.X1D;
import Y.ARunnableS49S0100000_13;
import Y.IDDListenerS152S0100000_13;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorOpenCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorOpenListDialogWithPositionEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorResumeSharedBgEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.opencamera.MultiLiveAnchorOpenCameraDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AudioStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.FetchListByTypeErrorEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveDialogBackEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveOpenModeratorListEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.PlayerPauseLiveForAnchorDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ShowUserListDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.share.anchor.MultiLiveInviterShareHelper;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.ThemeAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.SharedBgAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveAnchorMuteVideoEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.CoHostBeInvitedDialogShow;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.CoHostInProgressChanged;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkInGuestCountDownFinishChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestOpenWaitingDialog;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.dataChannel.MultiGuestLiveSuspended;
import com.bytedance.android.livesdk.dataChannel.MultiGuestShowLayoutSettingDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BackgroundFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowSetting;
import com.bytedance.android.livesdkapi.dataChannel.ForceCloseLinkEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestV3AnchorWidget extends BaseMultiGuestV3AnchorWidget {
    public static final /* synthetic */ int LJLLL = 0;
    public final FrameLayout LJLIL;
    public C74842TYw LJLILLLLZI;
    public MultiLiveAsAnchorListDialogV2 LJLJI;
    public Room LJLJJI;
    public MultiLiveAnchorOpenCameraDialog LJLJJL;
    public C75072TdE LJLJJLL;
    public LiveShowAnchorWidget LJLJL;
    public C75053Tcv LJLJLJ;
    public final C75042Tck LJLJLLL;
    public LinkDialog LJLL;
    public final AqS179S0100000_13 LJLLI;
    public MultiGuestThemeViewModel LJLLILLLL;
    public MultiGuestSharedBgAnchorViewModel LJLLJ;

    @InterfaceC75138TeI(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder dataHolder;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dl4;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.TZC
    public final void l1() {
        C75042Tck c75042Tck;
        IWindowAbility LIZLLL;
        if (C59994Ngc.LIZJ() != EnumC74778TWk.NORMAL && (c75042Tck = this.LJLJLLL) != null && (LIZLLL = c75042Tck.LIZLLL()) != null) {
            LIZLLL.e00();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, com.bytedance.android.live.liveinteract.api.LinkMicAnchorWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.TZC
    public final boolean BG() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLJI;
        if (multiLiveAsAnchorListDialogV2 == null || !multiLiveAsAnchorListDialogV2.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC32182Ck6
    public final void LJLILLLLZI() {
        C74842TYw c74842TYw = this.LJLILLLLZI;
        if (c74842TYw != null) {
            C30868C9o.LIZJ(R.string.kv9);
            c74842TYw.LJJJJL(TZJ.MIC_ROOM, C78857UxB.LJJIIJ(1476788483, "bpea-linkmic_anchorpre_onMicRoomStart"));
        }
    }

    public final void LJLZ() {
        LinkDialog linkDialog = this.LJLL;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLJI;
        if (multiLiveAsAnchorListDialogV2 != null) {
            C29306Beo.LJJJJ(multiLiveAsAnchorListDialogV2);
        }
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            this.LJLL = null;
        }
    }

    public final void LJZ() {
        InterfaceC30237Btp interfaceC30237Btp;
        if (!MultiGuestLiveShowSetting.INSTANCE.isV1()) {
            return;
        }
        C0NB.LIZIZ("MultiGuestV3AnchorWidget", "hideLiveShowBtn");
        C75053Tcv c75053Tcv = this.LJLJLJ;
        if (c75053Tcv != null) {
            interfaceC30237Btp = c75053Tcv.LJLILLLLZI;
        } else {
            interfaceC30237Btp = null;
        }
        C75515TkN.LIZIZ(interfaceC30237Btp, new ARunnableS49S0100000_13(this, 39), EnumC75468Tjc.MULTI_GUEST_SHOW);
    }

    public final void LJZI() {
        if (!MultiGuestLiveShowSetting.INSTANCE.isV1()) {
            return;
        }
        C0NB.LIZIZ("MultiGuestV3AnchorWidget", "loadShowWidget");
        this.LJLJL = new LiveShowAnchorWidget(this.LJLIL);
        enableSubWidgetManager(C28329B9x.LIZJ(getContext()));
        try {
            this.subWidgetManager.load(this.LJLJL);
            LiveShowAnchorWidget liveShowAnchorWidget = this.LJLJL;
            if (liveShowAnchorWidget != null) {
                this.LJLJLJ = new C75053Tcv(liveShowAnchorWidget);
            }
            C75053Tcv c75053Tcv = this.LJLJLJ;
            if (c75053Tcv != null) {
                EnumC30204BtI.MULTI_GUEST_LIVE_SHOW.load(this.dataChannel, c75053Tcv, false);
            }
            EnumC75468Tjc.MULTI_GUEST_SHOW.setVisibility(false);
            C74838TYs.LJ().LJII = new TUW(this);
        } catch (Exception e) {
            C0NB.LJ("MultiGuestV3AnchorWidget", String.valueOf(e));
        }
    }

    public final void LL() {
        InterfaceC30237Btp interfaceC30237Btp;
        if (!MultiGuestLiveShowSetting.INSTANCE.isV1()) {
            return;
        }
        if (this.LJLJL == null) {
            LJZI();
        }
        C0NB.LIZIZ("MultiGuestV3AnchorWidget", "showLiveShowBtn");
        EnumC75468Tjc enumC75468Tjc = EnumC75468Tjc.MULTI_GUEST_SHOW;
        enumC75468Tjc.setVisibility(false);
        C75053Tcv c75053Tcv = this.LJLJLJ;
        if (c75053Tcv != null) {
            interfaceC30237Btp = c75053Tcv.LJLILLLLZI;
        } else {
            interfaceC30237Btp = null;
        }
        C75515TkN.LIZ(interfaceC30237Btp, new ARunnableS49S0100000_13(this, 40), enumC75468Tjc, true);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.TZC
    public final void aP() {
        C30868C9o.LIZLLL(R.string.su9, this.context);
        C74842TYw c74842TYw = this.LJLILLLLZI;
        if (c74842TYw != null) {
            c74842TYw.LJJJJL(TZJ.RTC_ERROR, C78857UxB.LJJIIJ(1476788485, "bpea-linkmic_anchor_anchorwidget_onStartInteractFailed"));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.TZC
    public final void gg0() {
        FragmentManager fragmentManager;
        LinkDialog linkDialog;
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            if (this.LJLL == null) {
                LinkDialog LJJIIJZLJL = C51029K0z.LJJIIJZLJL(this);
                this.LJLL = LJJIIJZLJL;
                LJJIIJZLJL.setOnDismissListener(new IDDListenerS152S0100000_13(this, 0));
            }
        } else {
            this.LJLL = C51029K0z.LJJIIJZLJL(this);
        }
        C74987Tbr.LIZ("MultiGuestV3AnchorWidget", "showLayoutSettingDialog");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null && (linkDialog = this.LJLL) != null) {
            linkDialog.show(fragmentManager, "LinkDialog");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.TZC
    public final void l80() {
        MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog = this.LJLJJL;
        if (multiLiveAnchorOpenCameraDialog != null && multiLiveAnchorOpenCameraDialog.isShowing()) {
            return;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
        if (multiGuestDataHolder != null) {
            if (!multiGuestDataHolder.LJ && !C74838TYs.LJ().LJJIL) {
                MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLJI;
                if (multiLiveAsAnchorListDialogV2 != null) {
                    multiLiveAsAnchorListDialogV2.dismiss();
                }
                Context context = this.context;
                o.LJIIIIZZ(context, "context");
                MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog2 = new MultiLiveAnchorOpenCameraDialog(context, this.dataChannel, this, "end_link_and_no_guest");
                this.LJLJJL = multiLiveAnchorOpenCameraDialog2;
                if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/anchor/opencamera/MultiLiveAnchorOpenCameraDialog", "show", multiLiveAnchorOpenCameraDialog2, new Object[0], "void", new C65300Pk0(false, "()V", "3494914171028690256")).LIZ) {
                    return;
                }
                multiLiveAnchorOpenCameraDialog2.show();
                return;
            }
            return;
        }
        o.LJIJI("dataHolder");
        throw null;
    }

    @Override // X.TZC
    public final InterfaceC55235Lm3 linkScope() {
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null) {
            return UC0.LJJIL(frameLayout);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Room room;
        Fragment LJIIIZ;
        MultiGuestThemeViewModel multiGuestThemeViewModel;
        Fragment LJIIIZ2;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel;
        IThemeAbility iThemeAbility;
        InterfaceC31805Ce1 interfaceC31805Ce1;
        InterfaceC55235Lm3 linkScope;
        ILinkStateAbility iLinkStateAbility;
        InterfaceC55235Lm3 interfaceC55235Lm3;
        Fragment LJIIIZ3;
        Fragment LJIIIZ4;
        Fragment LJIIIZ5;
        O o;
        super.onCreate();
        TYQ.LIZJ("LinkIn_Anchor_Widget_onCreate");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJJI = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
            if ((interfaceC31781Cdd != null && (LJIIIZ5 = interfaceC31781Cdd.getFragment()) != null) || (LJIIIZ5 = C79234V7u.LJIIIZ(getView())) != null) {
                o = C55230Lly.LIZJ(LJIIIZ5, "linkMicScope");
            } else {
                o = 0;
            }
            ((C32537Cpp) dataChannel2.gv0(C75415Til.class)).LIZ = o;
        }
        InterfaceC31781Cdd interfaceC31781Cdd2 = this.widgetCallback;
        if (interfaceC31781Cdd2 == null || (LJIIIZ = interfaceC31781Cdd2.getFragment()) == null) {
            LJIIIZ = C79234V7u.LJIIIZ(getView());
        }
        if (LJIIIZ != null) {
            C65776Prg LIZ = C65352Pkq.LIZ(MultiGuestThemeViewModel.class);
            multiGuestThemeViewModel = (MultiGuestThemeViewModel) C73994T2g.LJJIIJ(new AqS154S0100000_4(LIZ, 1168), C214528bQ.LJLIL, C78926UyI.LJJII(LJIIIZ, false), C78926UyI.LJJIIJZLJL(LJIIIZ, false), C184077Kh.LJLIL, C78926UyI.LJJ(LJIIIZ, false), C78926UyI.LJIILLIIL(LJIIIZ, false), C75089TdV.INSTANCE, LIZ);
            InterfaceC31781Cdd interfaceC31781Cdd3 = this.widgetCallback;
            if ((interfaceC31781Cdd3 != null && (LJIIIZ4 = interfaceC31781Cdd3.getFragment()) != null) || (LJIIIZ4 = C79234V7u.LJIIIZ(getView())) != null) {
                InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LJIIIZ4, "linkMicScope");
                UC0.LJII(LIZJ, new ThemeAbilityImpl(multiGuestThemeViewModel), IThemeAbility.class);
                multiGuestThemeViewModel.gv0(LIZJ);
            }
        } else {
            multiGuestThemeViewModel = null;
        }
        this.LJLLILLLL = multiGuestThemeViewModel;
        InterfaceC31781Cdd interfaceC31781Cdd4 = this.widgetCallback;
        if ((interfaceC31781Cdd4 != null && (LJIIIZ2 = interfaceC31781Cdd4.getFragment()) != null) || (LJIIIZ2 = C79234V7u.LJIIIZ(getView())) != null) {
            C65776Prg LIZ2 = C65352Pkq.LIZ(MultiGuestSharedBgAnchorViewModel.class);
            multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) C73994T2g.LJJIIJ(new AqS154S0100000_4(LIZ2, 1168), C214528bQ.LJLIL, C78926UyI.LJJII(LJIIIZ2, false), C78926UyI.LJJIIJZLJL(LJIIIZ2, false), C184077Kh.LJLIL, C78926UyI.LJJ(LJIIIZ2, false), C78926UyI.LJIILLIIL(LJIIIZ2, false), C75089TdV.INSTANCE, LIZ2);
            InterfaceC31781Cdd interfaceC31781Cdd5 = this.widgetCallback;
            if ((interfaceC31781Cdd5 != null && (LJIIIZ3 = interfaceC31781Cdd5.getFragment()) != null) || (LJIIIZ3 = C79234V7u.LJIIIZ(getView())) != null) {
                InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(LJIIIZ3, "linkMicScope");
                UC0.LJII(LIZJ2, new SharedBgAbilityImpl(multiGuestSharedBgAnchorViewModel, null), ISharedBgAbility.class);
                C74987Tbr.LIZ("anchor_shared_bg", "onCreate");
                AssemViewModel.subscribeInternal$default(multiGuestSharedBgAnchorViewModel, null, null, null, new AqS144S0200000_13(LIZJ2, multiGuestSharedBgAnchorViewModel, 16), 7, null);
                C8E.LJ().e3(multiGuestSharedBgAnchorViewModel.LJLJJI);
                C8E.LJ().Aq(multiGuestSharedBgAnchorViewModel.LJLJJL);
            }
        } else {
            multiGuestSharedBgAnchorViewModel = null;
        }
        this.LJLLJ = multiGuestSharedBgAnchorViewModel;
        if (multiGuestSharedBgAnchorViewModel != null) {
            multiGuestSharedBgAnchorViewModel.LJLIL = this.dataChannel;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.ov0(MultiGuestOpenWaitingDialog.class, this, new AqS179S0100000_13(this, 80));
        dataChannelGlobal.nv0(this, this, MultiGuestLiveSuspended.class, new AqS179S0100000_13(this, 81));
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.mv0(InteractStateChangeEvent.class, this, this.LJLLI);
            dataChannel3.lv0(this, ForceCloseLinkEvent.class, new AqS179S0100000_13(this, 82));
            dataChannel3.lv0(this, CoHostInProgressChanged.class, new AqS179S0100000_13(this, 83));
            dataChannel3.lv0(this, MultiLiveDialogBackEvent.class, new AqS179S0100000_13(this, 84));
            dataChannel3.mv0(AnchorOpenListDialogWithPositionEvent.class, this, new AqS179S0100000_13(this, 85));
            dataChannel3.lv0(this, CoHostBeInvitedDialogShow.class, new AqS179S0100000_13(this, 86));
            dataChannel3.mv0(ShowUserListDialog.class, this, new AqS179S0100000_13(this, 73));
            dataChannel3.lv0(this, PlayerPauseLiveForAnchorDialogEvent.class, new AqS179S0100000_13(this, 74));
            dataChannel3.lv0(this, AudioStateChangeEvent.class, new AqS179S0100000_13(this, 75));
            dataChannel3.lv0(this, LinkInGuestCountDownFinishChannel.class, new AqS179S0100000_13(this, 76));
            dataChannel3.lv0(this, FetchListByTypeErrorEvent.class, new AqS179S0100000_13(this, 77));
            dataChannel3.lv0(this, MultiLiveOpenModeratorListEvent.class, new AqS171S0100000_5(this, 71));
            dataChannel3.lv0(this, MultiGuestShowLayoutSettingDialogEvent.class, new AqS179S0100000_13(this, 78));
            dataChannel3.lv0(this, AnchorResumeSharedBgEvent.class, new AqS179S0100000_13(this, 79));
        }
        Room room2 = this.LJLJJI;
        if (room2 != null) {
            DataChannel dataChannel4 = this.dataChannel;
            o.LJIIIIZZ(dataChannel4, "dataChannel");
            this.LJLILLLLZI = new C74842TYw(room2, dataChannel4, this);
        }
        C74842TYw c74842TYw = this.LJLILLLLZI;
        if (c74842TYw != null) {
            c74842TYw.attachView((C74842TYw) this);
        }
        C30868C9o.LIZJ(R.string.k_2);
        FrameLayout frameLayout = this.LJLIL;
        C75042Tck c75042Tck = this.LJLJLLL;
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null && (interfaceC55235Lm3 = (InterfaceC55235Lm3) dataChannel5.kv0(C75415Til.class)) != null) {
            iThemeAbility = (IThemeAbility) UC0.LJIIL(interfaceC55235Lm3, IThemeAbility.class, null);
        } else {
            iThemeAbility = null;
        }
        AnimationManagerImpl LIZ3 = TXZ.LIZ(frameLayout, c75042Tck, this, iThemeAbility, this.dataChannel);
        if (LIZ3 != null) {
            LIZ3.LJLJLLL = false;
        }
        C75042Tck c75042Tck2 = this.LJLJLLL;
        FrameLayout frameLayout2 = this.LJLIL;
        C74842TYw c74842TYw2 = this.LJLILLLLZI;
        if (c74842TYw2 != null) {
            interfaceC31805Ce1 = c74842TYw2.LJJJJJ();
        } else {
            interfaceC31805Ce1 = null;
        }
        c75042Tck2.LIZ(this, frameLayout2, interfaceC31805Ce1, true);
        C74842TYw c74842TYw3 = this.LJLILLLLZI;
        if (c74842TYw3 != null && (linkScope = linkScope()) != null && (iLinkStateAbility = (ILinkStateAbility) UC0.LJIIL(linkScope, ILinkStateAbility.class, null)) != null) {
            c74842TYw3.subscribeStateChange(iLinkStateAbility);
        }
        C31037CGb c31037CGb = MultiLiveInviterShareHelper.LJIIJ;
        Room room3 = this.LJLJJI;
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(this.context);
        DataChannel dataChannel6 = this.dataChannel;
        c31037CGb.getClass();
        if (room3 != null && LIZIZ != null && dataChannel6 != null) {
            C75559Tl5.LIZIZ.LJI(new MultiLiveInviterShareHelper(room3, LIZIZ, dataChannel6), null);
        }
        LJZI();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        TYQ.LIZJ("LinkIn_Anchor_Widget_onDestroy");
        C74842TYw c74842TYw = this.LJLILLLLZI;
        if (c74842TYw != null) {
            c74842TYw.detachView();
        }
        this.LJLJLLL.LIZIZ();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(C75081TdN.class)).LIZ = null;
        }
        super.onDestroy();
        LJLZ();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null) {
            MultiGuestThemeViewModel multiGuestThemeViewModel = this.LJLLILLLL;
            if (multiGuestThemeViewModel != null) {
                multiGuestThemeViewModel.hv0(UC0.LJJIJL(frameLayout));
            }
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LJLLJ;
            if (multiGuestSharedBgAnchorViewModel != null) {
                UC0.LJJIJL(frameLayout);
                C74987Tbr.LIZ("anchor_shared_bg", "onDestroy");
                C75286Tgg c75286Tgg = multiGuestSharedBgAnchorViewModel.LJLJI;
                if (c75286Tgg != null) {
                    c75286Tgg.LIZJ();
                }
                C8E.LJ().X3(multiGuestSharedBgAnchorViewModel.LJLJJI);
                C8E.LJ().zF(multiGuestSharedBgAnchorViewModel.LJLJJL);
                multiGuestSharedBgAnchorViewModel.LJLIL = null;
                multiGuestSharedBgAnchorViewModel.onCleared();
            }
            if (UC0.LJIIL(UC0.LJJIJL(frameLayout), IThemeAbility.class, null) != null) {
                UC0.LJJLIIIJILLIZJL(frameLayout, IThemeAbility.class);
            }
            if (UC0.LJIIL(UC0.LJJIJL(frameLayout), ISharedBgAbility.class, null) != null) {
                UC0.LJJLIIIJILLIZJL(frameLayout, ISharedBgAbility.class);
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        C74842TYw c74842TYw;
        if (!LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue() && (c74842TYw = this.LJLILLLLZI) != null) {
            c74842TYw.onEnterBackground();
        }
        super.onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStop() {
        C74842TYw c74842TYw;
        if (LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue() && (c74842TYw = this.LJLILLLLZI) != null) {
            c74842TYw.onEnterBackground();
        }
        super.onStop();
    }

    @Override // com.bytedance.android.live.liveinteract.api.LinkMicAnchorWidget, X.InterfaceC75487Tjv
    public final void unLoadPlayModeWidget() {
        if (!MultiGuestLiveShowSetting.INSTANCE.isV1() || this.LJLJL == null) {
            return;
        }
        C0NB.LIZIZ("MultiGuestV3AnchorWidget", "unLoadLiveShowWidget");
        LJZ();
        this.subWidgetManager.unload(this.LJLJL);
        EnumC30204BtI.MULTI_GUEST_LIVE_SHOW.unload(this.dataChannel);
        this.LJLJL = null;
        this.LJLJLJ = null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.TZC
    public final void AP() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2;
        if (isViewValid() && (multiLiveAsAnchorListDialogV2 = this.LJLJI) != null) {
            multiLiveAsAnchorListDialogV2.isShowing();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        boolean z;
        TQU LIZLLL;
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC74695TTf LLIIJLIL2;
        InterfaceC55235Lm3 linkScope;
        IWindowAbility iWindowAbility;
        super.onResume();
        C74842TYw c74842TYw = this.LJLILLLLZI;
        if (c74842TYw != null) {
            C32014ChO.LIZJ(c74842TYw.logTAG(1777), "onEnterForeground", null);
            if (C29306Beo.LJJ(c74842TYw.LJLJLLL) || !LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue()) {
                String logTAG = c74842TYw.logTAG(1780);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onEnterForegroundLogic, isEnterBackground: ");
                LIZ.append(c74842TYw.LJLJLLL);
                LIZ.append(", fixSetting: ");
                LIZ.append(LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue());
                C32014ChO.LIZJ(logTAG, X1D.LIZIZ(LIZ), null);
                c74842TYw.LJLJLLL = Boolean.FALSE;
                InterfaceC75441TjB R6 = C8E.LJ().R6();
                if (R6 != null && (LLIIJLIL2 = R6.LLIIJLIL()) != null) {
                    LLIIJLIL2.resume();
                }
                InterfaceC75441TjB R62 = C8E.LJ().R6();
                if (R62 != null && (LLIIJLIL = R62.LLIIJLIL()) != null) {
                    LLIIJLIL.LJJIIZ("MultiGuestV3AnchorPresenter onEnterForeground");
                }
                C74830TYk.LIZ = System.currentTimeMillis();
            }
            TZC tzc = (TZC) c74842TYw.mView;
            if (tzc != null && (linkScope = tzc.linkScope()) != null && (iWindowAbility = (IWindowAbility) UC0.LJIIL(linkScope, IWindowAbility.class, null)) != null) {
                iWindowAbility.g();
            }
        }
        MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog = this.LJLJJL;
        boolean z2 = true;
        if (multiLiveAnchorOpenCameraDialog != null && multiLiveAnchorOpenCameraDialog.isShowing()) {
            MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog2 = this.LJLJJL;
            if (multiLiveAnchorOpenCameraDialog2 != null) {
                multiLiveAnchorOpenCameraDialog2.LJJIIJZLJL();
                return;
            }
            return;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
        if (multiGuestDataHolder != null) {
            if (multiGuestDataHolder.LJIILIIL != 0) {
                return;
            }
            InterfaceC75441TjB R63 = C8E.LJ().R6();
            if (R63 != null) {
                z = R63.LLLLZLLIL();
            } else {
                z = false;
            }
            if (!z) {
                MultiGuestDataHolder multiGuestDataHolder2 = this.dataHolder;
                if (multiGuestDataHolder2 != null) {
                    multiGuestDataHolder2.LJ = true;
                    InterfaceC75441TjB R64 = C8E.LJ().R6();
                    if (R64 != null && (LIZLLL = R64.LIZLLL()) != null) {
                        LIZLLL.LIZ(Boolean.FALSE, "business_mute_host_on_resume_and_no_guest", null);
                    }
                    UPJ.LJFF(40, C73943T0h.LIZ());
                    DataChannel dataChannel = this.dataChannel;
                    if (dataChannel != null) {
                        dataChannel.qv0(MultiLiveAnchorMuteVideoEvent.class, new C74632TQu(true, "business_mute_host_on_resume_and_no_guest"));
                    }
                    DataChannel dataChannel2 = this.dataChannel;
                    if (dataChannel2 == null) {
                        return;
                    }
                    dataChannel2.qv0(AnchorOpenCameraEvent.class, new C32213Ckb(false, "end_link_and_no_guest"));
                    return;
                }
                o.LJIJI("dataHolder");
                throw null;
            }
            DataChannel dataChannel3 = this.dataChannel;
            if (!C29306Beo.LJIIJ(dataChannel3)) {
                return;
            }
            MultiGuestDataHolder multiGuestDataHolder3 = (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
            Boolean LIZ2 = InterfaceC30442Bx8.A1.LIZ();
            if (LIZ2 != null) {
                z2 = LIZ2.booleanValue();
            }
            if (multiGuestDataHolder3 != null) {
                multiGuestDataHolder3.LJ = z2;
            }
            if (z2) {
                UPJ.LJFF(40, C73943T0h.LIZ());
            } else {
                UPJ.LJFF(41, C73943T0h.LIZ());
            }
            if (dataChannel3 != null) {
                dataChannel3.qv0(MultiLiveAnchorMuteVideoEvent.class, new C74632TQu(z2, "business_unknown"));
            }
            if (!z2 || dataChannel3 == null) {
                return;
            }
            dataChannel3.qv0(AnchorOpenCameraEvent.class, new C32213Ckb(false, "end_link_and_no_guest"));
            return;
        }
        o.LJIJI("dataHolder");
        throw null;
    }

    public MultiGuestV3AnchorWidget(FrameLayout mAnchorContainer) {
        o.LJIIIZ(mAnchorContainer, "mAnchorContainer");
        this.LJLIL = mAnchorContainer;
        C75042Tck c75042Tck = new C75042Tck();
        C74650TRm.LIZ = true;
        this.LJLJLLL = c75042Tck;
        this.LJLLI = new AqS179S0100000_13(this, 72);
        C75559Tl5.LIZIZ.LJ(this);
        C221108m2.LIZIZ(new AqS163S0100000_13(this, 69));
    }

    @Override // X.TZC
    public final void onPlayerListChange(List<LinkPlayerInfo> list) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22;
        if (isViewValid() && (multiLiveAsAnchorListDialogV2 = this.LJLJI) != null && multiLiveAsAnchorListDialogV2.isShowing() && (multiLiveAsAnchorListDialogV22 = this.LJLJI) != null) {
            multiLiveAsAnchorListDialogV22.onPlayerListChange(list);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.TZC
    public final void onTalkVoiceUpdated(int i) {
        C75042Tck c75042Tck = this.LJLJLLL;
        if (c75042Tck != null) {
            c75042Tck.E7();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.TZC
    public final void s30(C74630TQs c74630TQs) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2;
        if (c74630TQs != null && (multiLiveAsAnchorListDialogV2 = this.LJLJI) != null) {
            multiLiveAsAnchorListDialogV2.onEvent(c74630TQs);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.TZC
    public final void v9(String str) {
        C30868C9o.LJI(C15380j0.LJIILL(R.string.mht, str));
    }

    @Override // X.InterfaceC32182Ck6
    public final void LJIL(String str, String str2) {
        LJZL("guest_icon", str2);
    }

    public final void LJZL(String str, String str2) {
        if (MultiGuestAnchorPanelTypeSetting.INSTANCE.isInLabGroup() && str.length() > 0) {
            C74842TYw c74842TYw = this.LJLILLLLZI;
            if (c74842TYw != null) {
                c74842TYw.LJJLIIIJL(str, str2);
                return;
            }
            return;
        }
        C74842TYw c74842TYw2 = this.LJLILLLLZI;
        if (c74842TYw2 == null) {
            return;
        }
        c74842TYw2.LJJJLL();
    }

    @Override // X.TZC
    public final void tv(String str, String str2, List listPlayerList) {
        C74842TYw c74842TYw;
        int i;
        DataChannel dataChannel;
        o.LJIIIZ(listPlayerList, "listPlayerList");
        if (isViewValid() && (c74842TYw = this.LJLILLLLZI) != null) {
            MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
            if (multiGuestDataHolder != null) {
                C75072TdE c75072TdE = this.LJLJJLL;
                if (c75072TdE != null) {
                    i = c75072TdE.LJLIL;
                } else {
                    i = -1;
                }
                multiGuestDataHolder.LJJIIZI = i;
                if (this.LJLJI == null) {
                    Context context = this.context;
                    o.LJIIIIZZ(context, "context");
                    C74842TYw c74842TYw2 = this.LJLILLLLZI;
                    if (c74842TYw2 != null) {
                        dataChannel = c74842TYw2.LJLJJI;
                    } else {
                        dataChannel = null;
                    }
                    this.LJLJI = new MultiLiveAsAnchorListDialogV2(context, dataChannel, c74842TYw, 0);
                }
                MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLJI;
                if (multiLiveAsAnchorListDialogV2 != null) {
                    multiLiveAsAnchorListDialogV2.setOnDismissListener(new IDDListenerS152S0100000_13(this, 16));
                }
                MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22 = this.LJLJI;
                if (multiLiveAsAnchorListDialogV22 != null) {
                    multiLiveAsAnchorListDialogV22.LJLJI(str);
                }
                MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV23 = this.LJLJI;
                if (multiLiveAsAnchorListDialogV23 != null) {
                    multiLiveAsAnchorListDialogV23.LLILLIZIL = str2;
                    if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/userinfo/anchor/MultiLiveAsAnchorListDialogV2", "show", multiLiveAsAnchorListDialogV23, new Object[0], "void", new C65300Pk0(false, "()V", "3494914171028690256")).LIZ) {
                        multiLiveAsAnchorListDialogV23.show();
                    }
                }
                this.LJLJJLL = null;
                return;
            }
            o.LJIJI("dataHolder");
            throw null;
        }
    }
}
