package com.bytedance.android.live.liveinteract.multiguestv3.main.mask;

import X.AbstractC74727TUl;
import X.B83;
import X.B8S;
import X.C15380j0;
import X.C15610jN;
import X.C15650jR;
import X.C16880lQ;
import X.C19U;
import X.C1DD;
import X.C212428Vi;
import X.C214528bQ;
import X.C221108m2;
import X.C28212B5k;
import X.C28406BCw;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29556Biq;
import X.C29927Bop;
import X.C2K0;
import X.C2L4;
import X.C30658C1m;
import X.C31657Cbd;
import X.C44729Hgz;
import X.C47061t0;
import X.C47704Ins;
import X.C55749LuL;
import X.C56412MCa;
import X.C58436Mwa;
import X.C58437Mwb;
import X.C58569Myj;
import X.C59994Ngc;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73994T2g;
import X.C74719TUd;
import X.C74723TUh;
import X.C74735TUt;
import X.C74740TUy;
import X.C74838TYs;
import X.C74947TbD;
import X.C74979Tbj;
import X.C74983Tbn;
import X.C74987Tbr;
import X.C75161Tef;
import X.C75177Tev;
import X.C75232Tfo;
import X.C75234Tfq;
import X.C75244Tg0;
import X.C75247Tg3;
import X.C75251Tg7;
import X.C75256TgC;
import X.C75267TgN;
import X.C75349Thh;
import X.C75357Thp;
import X.C75358Thq;
import X.C75409Tif;
import X.C75410Tig;
import X.C75415Til;
import X.C75559Tl5;
import X.C76173Tuz;
import X.C76696U8e;
import X.C76917UGr;
import X.C76965UIn;
import X.C78720Uuy;
import X.C78886Uxe;
import X.C78926UyI;
import X.C87277YNd;
import X.C8E;
import X.EnumC31509CYf;
import X.EnumC74778TWk;
import X.EnumC74991Tbv;
import X.InterfaceC28213B5l;
import X.InterfaceC28296B8q;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC74236TBo;
import X.InterfaceC75179Tex;
import X.InterfaceC75238Tfu;
import X.InterfaceC75252Tg8;
import X.InterfaceC75266TgM;
import X.InterfaceC75353Thl;
import X.InterfaceC75441TjB;
import X.InterfaceC75579TlP;
import X.InterfaceC75973Trl;
import X.QZY;
import X.TBT;
import X.TBV;
import X.TQ8;
import X.TRS;
import X.TSJ;
import X.TUI;
import X.TV3;
import X.TZX;
import X.U4N;
import X.U8H;
import X.UC0;
import X.X1D;
import Y.ARunnableS12S0210000_13;
import Y.ARunnableS49S0100000_13;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel;
import com.bytedance.android.live.liveinteract.api.event.LivePauseViewSizeChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.AnchorWindowParamsChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceUpdateShareBgEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.AudienceVideoViewParams;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3AnchorContainerIsVisibleChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3RealVideoWidthChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoSizeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.OuterMultiGuestLayoutChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowBeginEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowCountDownEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowEndEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowMaskOrderEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowMatchTotalScoreUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveAnchorMuteVideoEvent;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.room.GlobalMultiLiveSettingChangeEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PlayerData;
import com.bytedance.android.livesdk.dataChannel.PIPModeChangeEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.ShortCutPanelShowChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAudioMuteTypeSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkMultiGuestCrossDevicePauseFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkSubShortCutPanelCombineSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkVoiceChatAudienceContainerSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorMuteViewSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPublicScreenWidthFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestShareBgRtlOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestShareBgSupportLayoutAnimationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3RoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AudioBeOccupiedSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiGuestGiftTrayOptSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class WindowMaskAssem extends UISlotAssem implements IWindowAbility, InterfaceC75353Thl, OnMessageListener, TUI, InterfaceC28213B5l, InterfaceC55102Lju, C2L4 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIIZ;
    public C74723TUh LJLL;
    public DataChannel LJLLI;
    public FrameLayout LJLLILLLL;
    public boolean LJLLJ;
    public C75358Thq LJLLL;
    public C47061t0 LJLZ;
    public C75177Tev LJZ;
    public boolean LJZI;
    public TRS LJZL;
    public C75410Tig LLD;
    public PlayerData LLF;
    public int LLFII;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public IThemeAbility LLIIII;
    public ISharedBgAbility LLIIIILZ;
    public final TSJ LLIIIJ;
    public final C75232Tfo LLIIIL;
    public final C55749LuL LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C75251Tg7.class, null), checkSupervisorPrepared());
    public boolean LJLLLL = true;
    public final Map<String, InterfaceC75266TgM> LJLLLLLL = new HashMap();
    public final C62822Ol8 LL = C221108m2.LIZIZ(C58569Myj.LJLIL);
    public int LLFF = 1;
    public int LLFFF = 1;
    public final C62822Ol8 LLFZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 85));
    public final C31657Cbd LLI = new C31657Cbd("ZOOM_SERVICE");

    static {
        TBT tbt = new TBT(WindowMaskAssem.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/ZoomService;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIIZ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.TUI
    public final void LJJIJL(Throwable t) {
        o.LJIIIZ(t, "t");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility
    public final void g() {
        X3(this, false, null, 3);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1368434413) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return 0;
    }

    public final void D5() {
        InterfaceC75441TjB R6;
        InterfaceC75973Trl LLIIJI;
        AqS179S0100000_13 aqS179S0100000_13 = new AqS179S0100000_13(this, 141);
        C65776Prg LIZ = C65352Pkq.LIZ(LinkStatusViewModel.class);
        LinkStatusViewModel linkStatusViewModel = (LinkStatusViewModel) C73994T2g.LJJIIJ(new AqS154S0100000_4(LIZ, 1167), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C78926UyI.LJIJJ(this), C78926UyI.LJJI(this), C78926UyI.LJJIFFI(this), aqS179S0100000_13, LIZ);
        View containerView = getContainerView();
        if (containerView != null) {
            linkStatusViewModel.kv0(UC0.LJJIJL(containerView));
        }
        C75410Tig c75410Tig = this.LLD;
        if (c75410Tig != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("add Observer on userState[");
            LIZ2.append(linkStatusViewModel);
            LIZ2.append(']');
            C75410Tig.LIZIZ(X1D.LIZIZ(LIZ2));
            linkStatusViewModel.CQ(new TBT() { // from class: X.TiZ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C75814TpC) obj).LJLJI;
                }
            }, null, new C75409Tif(c75410Tig));
            if (MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getShowNetworkTip() && (R6 = C8E.LJ().R6()) != null && (LLIIJI = R6.LLIIJI()) != null) {
                LLIIJI.LJJIJL((U4N) c75410Tig.LJLJL.getValue());
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility
    public final void E7() {
        C75357Thp c75357Thp;
        String str;
        String str2;
        C75358Thq c75358Thq = this.LJLLL;
        if (c75358Thq != null) {
            if (L3().LJLIL) {
                str2 = "anchor";
            } else if (this.LJLLLL) {
                str2 = "viewer";
            } else {
                str2 = "guest";
            }
            c75358Thq.LJII(str2);
        }
        for (Map.Entry entry : ((HashMap) this.LJLLLLLL).entrySet()) {
            String str3 = (String) entry.getKey();
            InterfaceC75266TgM interfaceC75266TgM = (InterfaceC75266TgM) entry.getValue();
            if ((interfaceC75266TgM instanceof C75357Thp) && (c75357Thp = (C75357Thp) interfaceC75266TgM) != null) {
                if (L3().LJLIL) {
                    str = "anchor";
                } else if (this.LJLLLL) {
                    str = "viewer";
                } else {
                    str = "guest";
                }
                c75357Thp.LJIIIIZZ(str3, str);
            }
        }
    }

    public final C75251Tg7 L3() {
        return (C75251Tg7) this.LJLJLLL.getValue();
    }

    public final InterfaceC75238Tfu M3() {
        return (InterfaceC75238Tfu) this.LLFZ.getValue();
    }

    public final C74719TUd O3() {
        return (C74719TUd) this.LLII.getValue();
    }

    public final void P3() {
        C75358Thq c75358Thq;
        if (!LiveAudioMuteTypeSetting.INSTANCE.canShowMuteMicLayout() || !MultiGuestAnchorMuteViewSwitcherSetting.INSTANCE.isEnable() || !TV3.LIZJ()) {
            return;
        }
        int LIZLLL = TV3.LIZLLL();
        int i = this.LLFF;
        if (i == 1 && LIZLLL > 1) {
            C75358Thq c75358Thq2 = this.LJLLL;
            if (c75358Thq2 != null) {
                c75358Thq2.LJ();
            }
        } else if (LIZLLL == 1 && i > 1 && (c75358Thq = this.LJLLL) != null) {
            c75358Thq.LJIIIIZZ();
        }
        this.LLFF = LIZLLL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility
    public final void e00() {
        W3(3, EnumC74991Tbv.NORMAL);
    }

    public final void g4() {
        if (this.LJZ == null && this.LJZI) {
            C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
            c75559Tl5.getClass();
            if (c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER") != null && !C29306Beo.LJIIJ(this.LJLLI)) {
                this.LJZ = new C75177Tev(this.LJLLI, this.LJLLILLLL);
            }
        }
        C75177Tev c75177Tev = this.LJZ;
        if (c75177Tev != null) {
            c75177Tev.LJIIJ(this.LJLLLL);
        }
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(LinkMicScope.class);
    }

    public WindowMaskAssem() {
        C221108m2.LIZIZ(C58436Mwa.LJLIL);
        this.LLIFFJFJJ = C221108m2.LIZIZ(C58437Mwb.LJLIL);
        this.LLII = C221108m2.LIZIZ(new AqS163S0100000_13(this, 84));
        this.LLIIIJ = new TSJ(this);
        this.LLIIIL = new C75232Tfo(this);
    }

    public static Rect K3() {
        U8H LJJZZI;
        C76696U8e LJJIII;
        List<InterfaceC75179Tex> allLayoutWindows;
        InterfaceC75179Tex interfaceC75179Tex;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 == null || (LJJZZI = R6.LJJZZI()) == null || (LJJIII = LJJZZI.LJJIII()) == null || (allLayoutWindows = LJJIII.getAllLayoutWindows()) == null) {
            return null;
        }
        Iterator<InterfaceC75179Tex> it = allLayoutWindows.iterator();
        while (true) {
            if (it.hasNext()) {
                interfaceC75179Tex = it.next();
                if (interfaceC75179Tex.LJLJI()) {
                    break;
                }
            } else {
                interfaceC75179Tex = null;
                break;
            }
        }
        InterfaceC75179Tex interfaceC75179Tex2 = interfaceC75179Tex;
        if (interfaceC75179Tex2 == null) {
            return null;
        }
        return interfaceC75179Tex2.w();
    }

    public final void k8() {
        InterfaceC55235Lm3 LJJIL;
        LinkStatusViewModel linkStatusViewModel;
        View containerView = getContainerView();
        if (containerView != null && (LJJIL = UC0.LJJIL(containerView)) != null) {
            C2K0 LJIIL = UC0.LJIIL(LJJIL, ILinkStateAbility.class, null);
            if ((LJIIL instanceof LinkStatusViewModel) && (linkStatusViewModel = (LinkStatusViewModel) LJIIL) != null) {
                linkStatusViewModel.lv0(LJJIL);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        InterfaceC75441TjB R6;
        InterfaceC75973Trl LLIIJI;
        FrameLayout frameLayout;
        IMessageManager iMessageManager;
        DataChannel dataChannel;
        super.onDestroy();
        this.LJZI = false;
        if (LiveMultiGuestGiftTrayOptSetting.enableGiftTrayPositionChange() && (dataChannel = this.LJLLI) != null) {
            dataChannel.rv0(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, new C74735TUt(false, 4));
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        C8E.LJ().X3(this.LLIIIJ);
        C8E.LJ().zF(this.LLIIIL);
        C74723TUh c74723TUh = this.LJLL;
        if (c74723TUh != null) {
            TRS trs = c74723TUh.LJLJI;
            if (trs != null) {
                trs.LIZLLL(c74723TUh.LJLJJLL);
            }
            IMessageManager iMessageManager2 = c74723TUh.LJLILLLLZI;
            if (iMessageManager2 != null) {
                iMessageManager2.removeMessageListener(c74723TUh);
            }
            C8E.LJ().X3(c74723TUh.LJLJL);
            ((LinkedHashMap) c74723TUh.LJLJJL).clear();
        }
        DataChannel dataChannel2 = this.LJLLI;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(this);
        }
        TRS trs2 = this.LJZL;
        if (trs2 != null) {
            trs2.LIZLLL(this);
        }
        M3().onDetach();
        C74719TUd O3 = O3();
        O3.LJFF();
        C8E.LJ().X3(O3);
        C47061t0 c47061t0 = this.LJLZ;
        if (c47061t0 != null && (frameLayout = this.LJLLILLLL) != null) {
            C16880lQ.LJLLLL(c47061t0, frameLayout);
        }
        this.LJLLILLLL = null;
        this.LJLLL = null;
        ((HashMap) this.LJLLLLLL).clear();
        k8();
        C75410Tig c75410Tig = this.LLD;
        if (c75410Tig != null) {
            MultiGuestDataHolder LIZJ = c75410Tig.LIZJ();
            if (LIZJ != null) {
                ((ConcurrentHashMap) LIZJ.LJIJI).clear();
                ((ConcurrentHashMap) LIZJ.LJIJJLI).clear();
                if (1 == MultiGuestV3AudioBeOccupiedSettings.getValue()) {
                    ((ConcurrentHashMap) LIZJ.LJJI).clear();
                }
            }
            if (MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getShowNetworkTip() && (R6 = C8E.LJ().R6()) != null && (LLIIJI = R6.LLIIJI()) != null) {
                LLIIJI.LJJIL((U4N) c75410Tig.LJLJL.getValue());
            }
            c75410Tig.LIZ();
        }
        this.LLD = null;
        C75177Tev c75177Tev = this.LJZ;
        if (c75177Tev != null) {
            TextView textView = c75177Tev.LIZJ;
            if (textView != null) {
                TV3.LJIIJJI(textView);
            }
            c75177Tev.LIZJ = null;
            LiveDialog liveDialog = c75177Tev.LJ;
            if (liveDialog != null && liveDialog.isShowing()) {
                liveDialog.dismiss();
            }
            DataChannel dataChannel3 = c75177Tev.LIZ;
            if (dataChannel3 != null) {
                dataChannel3.jv0(c75177Tev);
            }
        }
        this.LJZ = null;
        ((List) this.LL.getValue()).clear();
        DataChannel dataChannel4 = this.LJLLI;
        if (dataChannel4 != null) {
            dataChannel4.jv0(this);
        }
        this.LJLLI = null;
        this.LLFFF = 1;
        if (L3().LJLIL) {
            C74979Tbj.LIZIZ("end_link_mic");
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        View containerView;
        ILinkStateAbility LJJIL;
        super.onResume();
        if (C74740TUy.LIZLLL().LJ() && (containerView = getContainerView()) != null && (LJJIL = C44729Hgz.LJJIL(containerView)) != null) {
            LJJIL.Jv(1, null);
        }
    }

    @Override // X.C8W0
    public final void onStop() {
        ILinkStateAbility LJJIL;
        super.onStop();
        if (C74740TUy.LIZLLL().LJ() && (!C74838TYs.LJ().LJJIJIIJIL || !LinkmicSdkMultiGuestCrossDevicePauseFixSetting.INSTANCE.isFix())) {
            View containerView = getContainerView();
            if (containerView != null && (LJJIL = C44729Hgz.LJJIL(containerView)) != null) {
                LJJIL.Jv(2, null);
                return;
            }
            return;
        }
        C76173Tuz.LIZ.LIZIZ(51001, "on MaskWindow enter background without stateChange", new Throwable("on MaskWindow enter background without stateChange"), null);
    }

    public static int N3(List list) {
        int LIZ;
        FrameLayout LJJIJIL;
        ViewGroup.LayoutParams layoutParams;
        C76696U8e LJJIII;
        Rect containerActualRange;
        Integer valueOf;
        int i = 0;
        if (list.size() < 2) {
            return 0;
        }
        InterfaceC75579TlP LJJJIL = C78886Uxe.LJJJIL(C8E.LJ());
        Object obj = null;
        if (LJJJIL != null && (LJJIII = ((U8H) LJJJIL).LJJIII()) != null && (containerActualRange = LJJIII.getContainerActualRange()) != null && (valueOf = Integer.valueOf(containerActualRange.width())) != null && MultiGuestPublicScreenWidthFixSetting.INSTANCE.isFix()) {
            i = (C15380j0.LJIIL() - valueOf.intValue()) / 2;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!((InterfaceC75179Tex) next).LJLJI()) {
                obj = next;
                break;
            }
        }
        InterfaceC75179Tex interfaceC75179Tex = (InterfaceC75179Tex) obj;
        if (interfaceC75179Tex != null && (LJJIJIL = interfaceC75179Tex.LJJIJIL()) != null && (layoutParams = LJJIJIL.getLayoutParams()) != null) {
            LIZ = layoutParams.width;
        } else {
            LIZ = C15380j0.LIZ(124.0f);
        }
        return i + LIZ;
    }

    public static boolean Q3(InterfaceC75179Tex interfaceC75179Tex) {
        if (interfaceC75179Tex == null || interfaceC75179Tex.LJJIIJZLJL() != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() || !(!interfaceC75179Tex.LJLJI())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
    
        if (r1 >= 0) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H3(X.EnumC74991Tbv r10) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem.H3(X.Tbv):void");
    }

    public final void I3(String str) {
        int width;
        int i;
        FrameLayout.LayoutParams layoutParams;
        if (!TextUtils.isEmpty(str)) {
            C74987Tbr.LIZ("shared_bg", "WindowMaskAssem selectThemeSubscribe, apply shared bg in multi view for guest");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WindowMaskAssem_updateImageUrl shareBgIv:");
            C47061t0 c47061t0 = this.LJLZ;
            Integer num = null;
            if (c47061t0 != null) {
                num = Integer.valueOf(c47061t0.hashCode());
            }
            QZY.LIZJ(LIZ, num, LIZ, "shared_bg");
            C47061t0 c47061t02 = this.LJLZ;
            if (c47061t02 != null) {
                C87277YNd.LJJIJ(c47061t02);
            }
            C47061t0 c47061t03 = this.LJLZ;
            if (c47061t03 != null) {
                if (MultiGuestShareBgSupportLayoutAnimationSetting.INSTANCE.isOpen()) {
                    Rect LJIJJ = C78886Uxe.LJIJJ(C8E.LJ());
                    if (LJIJJ == null) {
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams2 = c47061t03.getLayoutParams();
                    if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null) {
                        return;
                    }
                    layoutParams.leftMargin = LJIJJ.left;
                    layoutParams.topMargin = LJIJJ.top;
                    layoutParams.width = LJIJJ.width();
                    layoutParams.height = LJIJJ.height();
                    width = LJIJJ.width();
                    i = LJIJJ.height();
                    c47061t03.setLayoutParams(layoutParams);
                } else {
                    FrameLayout frameLayout = this.LJLLILLLL;
                    if (frameLayout == null) {
                        return;
                    }
                    width = (frameLayout.getWidth() * 10) / 9;
                    i = (width * 12) / 5;
                    ViewGroup.LayoutParams layoutParams3 = c47061t03.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    if (layoutParams4 != null) {
                        layoutParams4.topMargin = 0;
                    }
                    layoutParams3.width = -1;
                    layoutParams3.height = -1;
                    c47061t03.setLayoutParams(layoutParams3);
                }
                C78720Uuy LJIIJ = C15650jR.LIZ().LJIIJ(new File(str));
                LJIIJ.LJ = width;
                LJIIJ.LJFF = i;
                LJIIJ.LJIIJJI(c47061t03);
                return;
            }
            return;
        }
        C74987Tbr.LIZ("shared_bg", "WindowMaskAssem selectThemeSubscribe, clear shared bg in multi view for guest");
        C47061t0 c47061t04 = this.LJLZ;
        if (c47061t04 == null) {
            return;
        }
        C87277YNd.LJJIIZ(c47061t04);
    }

    @Override // X.InterfaceC28213B5l
    public final void J2(C75234Tfq c75234Tfq) {
        InterfaceC75441TjB R6;
        U8H LJJZZI;
        C76696U8e LJJIII;
        this.LLF = new PlayerData(c75234Tfq.LJLIL, c75234Tfq.LJLILLLLZI, c75234Tfq.LJLJI, c75234Tfq.LJLJJI, c75234Tfq.LJLJJL, c75234Tfq.LJLJJLL, c75234Tfq.LJLJL, c75234Tfq.LJLJLJ, c75234Tfq.LJLJLLL, c75234Tfq.LJLL);
        if (this.LJLLLL && (R6 = C8E.LJ().R6()) != null && (LJJZZI = R6.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null) {
            LJJIII.LJIIJ(this.LLF);
        }
    }

    public final void U3(int i) {
        InterfaceC28296B8q interfaceC28296B8q;
        DataChannel dataChannel;
        InterfaceC28296B8q interfaceC28296B8q2;
        if (this.LLFII == 0 && (dataChannel = this.LJLLI) != null && (interfaceC28296B8q2 = (InterfaceC28296B8q) dataChannel.kv0(C28406BCw.class)) != null) {
            interfaceC28296B8q2.LJIIJ();
        }
        int i2 = this.LLFII + 1;
        this.LLFII = i2;
        if (i2 >= i) {
            this.LLFII = 0;
            DataChannel dataChannel2 = this.LJLLI;
            if (dataChannel2 != null && (interfaceC28296B8q = (InterfaceC28296B8q) dataChannel2.kv0(C28406BCw.class)) != null) {
                interfaceC28296B8q.LJIILLIIL(System.currentTimeMillis());
            }
        }
    }

    @Override // X.TUI
    public final void V(TZX provider) {
        o.LJIIIZ(provider, "provider");
        g4();
        if (provider.LIZLLL(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) != null) {
            O3().LJIL(false);
        } else {
            O3().LJIL(true);
        }
        C75358Thq c75358Thq = this.LJLLL;
        if (c75358Thq != null) {
            c75358Thq.LJIILJJIL();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0105, code lost:
    
        if (r0 <= 0) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y3(X.InterfaceC75179Tex r25) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem.Y3(X.Tex):void");
    }

    public final void Z3(InterfaceC75179Tex interfaceC75179Tex) {
        if (!interfaceC75179Tex.LJLJI()) {
            interfaceC75179Tex.LJJIJIL().removeAllViews();
            C75161Tef c75161Tef = new C75161Tef(interfaceC75179Tex, this.LJLLI, this);
            interfaceC75179Tex.LJJIJIL().addView(c75161Tef);
            ((HashMap) this.LLIFFJFJJ.getValue()).put(Integer.valueOf(interfaceC75179Tex.LJZ()), c75161Tef);
        }
    }

    public final void a4(InterfaceC75179Tex interfaceC75179Tex) {
        FrameLayout frameLayout;
        int i = C75267TgN.LIZ[interfaceC75179Tex.LJJIL().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                if (!interfaceC75179Tex.LJLJI()) {
                    Y3(interfaceC75179Tex);
                    return;
                }
                if (!interfaceC75179Tex.LJLJI()) {
                    return;
                }
                interfaceC75179Tex.LJJIJIL().removeAllViews();
                if (!(!interfaceC75179Tex.LJLJI())) {
                    Context context = getContext();
                    C75358Thq c75358Thq = null;
                    if (context != null || ((frameLayout = this.LJLLILLLL) != null && (context = frameLayout.getContext()) != null)) {
                        c75358Thq = new C75358Thq(context, interfaceC75179Tex, this.LJLLI, this.LJLLLL);
                    }
                    this.LJLLL = c75358Thq;
                    if (c75358Thq != null) {
                        c75358Thq.LJJIJ(interfaceC75179Tex);
                    }
                }
                if (!this.LJLLLL) {
                    return;
                }
                Rect LJJLIIIJ = interfaceC75179Tex.LJJLIIIJ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("windowRect.top:");
                C1DD.LJFF(LIZ, LJJLIIIJ.top, LIZ, "WindowMaskAssem");
                int i2 = LJJLIIIJ.top;
                if (i2 == 0) {
                    B8S b8s = new B8S(0, 0, LJJLIIIJ.left, i2, true);
                    DataChannel dataChannel = this.LJLLI;
                    if (dataChannel == null) {
                        return;
                    }
                    dataChannel.qv0(LivePauseViewSizeChangeEvent.class, b8s);
                    return;
                }
                B8S b8s2 = new B8S(LJJLIIIJ.width(), LJJLIIIJ.height(), LJJLIIIJ.left, LJJLIIIJ.top, false);
                DataChannel dataChannel2 = this.LJLLI;
                if (dataChannel2 == null) {
                    return;
                }
                dataChannel2.qv0(LivePauseViewSizeChangeEvent.class, b8s2);
                return;
            }
            if (Q3(interfaceC75179Tex)) {
                return;
            }
            Y3(interfaceC75179Tex);
            return;
        }
        Z3(interfaceC75179Tex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC75353Thl
    public final void d3(C75349Thh bizMask) {
        C75410Tig c75410Tig;
        InterfaceC75252Tg8 interfaceC75252Tg8;
        String LJJ;
        MultiGuestDataHolder LIZJ;
        LinkPlayerInfo linkPlayerInfo;
        MultiGuestDataHolder LIZJ2;
        String LJJ2;
        User user;
        TQ8 tq8;
        AbstractC74727TUl LIZ;
        LinkListUser LJJIJIL;
        o.LJIIIZ(bizMask, "bizMask");
        if (C59994Ngc.LIZJ() == EnumC74778TWk.GRID || C59994Ngc.LIZJ() == EnumC74778TWk.FLOATING) {
            return;
        }
        Z3(bizMask.getWindow());
        if (!(bizMask instanceof InterfaceC75266TgM) || (c75410Tig = this.LLD) == null || (LJJ = (interfaceC75252Tg8 = (InterfaceC75252Tg8) bizMask).LJJ()) == null || (LIZJ = c75410Tig.LIZJ()) == null) {
            return;
        }
        String LJJ3 = interfaceC75252Tg8.LJJ();
        if (LJJ3 != null) {
            ((ConcurrentHashMap) LIZJ.LJIJJ).remove(LJJ3);
        }
        String LJJ4 = interfaceC75252Tg8.LJJ();
        if (LJJ4 != null) {
            ((ConcurrentHashMap) LIZJ.LJIJI).remove(LJJ4);
        }
        String LJJ5 = interfaceC75252Tg8.LJJ();
        if (LJJ5 != null) {
            ((ConcurrentHashMap) LIZJ.LJJI).remove(LJJ5);
        }
        Object obj = C75559Tl5.LIZIZ.LIZJ().get("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        Long l = null;
        if ((obj instanceof TQ8) && (tq8 = (TQ8) obj) != null && (LIZ = tq8.LIZ()) != null && (LJJIJIL = C76917UGr.LJJIJIL(LIZ, LJJ)) != null) {
            linkPlayerInfo = TV3.LIZ(LJJIJIL);
        } else {
            linkPlayerInfo = null;
        }
        if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
            l = Long.valueOf(user.getId());
        }
        if (C74947TbD.LJIIZILJ(l) || (LIZJ2 = c75410Tig.LIZJ()) == null || (LJJ2 = interfaceC75252Tg8.LJJ()) == null) {
            return;
        }
        ((ConcurrentHashMap) LIZJ2.LJIJJLI).remove(LJJ2);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        FrameLayout.LayoutParams layoutParams;
        DataChannel dataChannel;
        MultiGuestThemeViewModel B70;
        MultiGuestThemeViewModel B702;
        MultiGuestSharedBgGuestViewModel n90;
        InterfaceC55235Lm3 interfaceC55235Lm3;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        U8H LJJZZI;
        IMessageManager iMessageManager;
        Room room;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJZI = true;
        this.LJLLI = L3().LJLILLLLZI;
        if (!(view instanceof FrameLayout)) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) view;
        this.LJLLILLLL = frameLayout;
        C47061t0 c47061t0 = new C47061t0(frameLayout.getContext());
        this.LJLZ = c47061t0;
        if (MultiGuestShareBgRtlOptSetting.INSTANCE.isEnable()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 3);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        boolean z = false;
        frameLayout.addView(c47061t0, 0, layoutParams);
        LinkMicScope.LIZ(new LinkMicScope(getContainerView()), this, IWindowAbility.class);
        M3().LJ(true);
        this.LJZL = L3().LJLJI;
        DataChannel dataChannel4 = this.LJLLI;
        if (dataChannel4 != null && (iMessageManager = (IMessageManager) dataChannel4.kv0(C29927Bop.class)) != null) {
            DataChannel dataChannel5 = this.LJLLI;
            if (dataChannel5 != null) {
                room = (Room) dataChannel5.kv0(RoomChannel.class);
            } else {
                room = null;
            }
            boolean z2 = L3().LJLIL;
            TRS trs = this.LJZL;
            C74723TUh c74723TUh = new C74723TUh(room, z2, iMessageManager, trs);
            this.LJLL = c74723TUh;
            C8E.LJ().e3(c74723TUh.LJLJL);
            EnumC31509CYf enumC31509CYf = EnumC31509CYf.LINK_MIC;
            iMessageManager.addMessageListener(enumC31509CYf.getIntType(), c74723TUh);
            EnumC31509CYf enumC31509CYf2 = EnumC31509CYf.LINK_MIC_FAN_TICKET_METHOD;
            iMessageManager.addMessageListener(enumC31509CYf2.getIntType(), c74723TUh);
            if (trs != null) {
                trs.LJ(c74723TUh.LJLJJLL);
            }
            iMessageManager.addMessageListener(enumC31509CYf.getIntType(), this);
            iMessageManager.addMessageListener(enumC31509CYf2.getIntType(), this);
        }
        TRS trs2 = this.LJZL;
        if (trs2 != null) {
            trs2.LJ(this);
        }
        C8E.LJ().e3(this.LLIIIJ);
        C8E.LJ().Aq(this.LLIIIL);
        DataChannel dataChannel6 = this.LJLLI;
        if (dataChannel6 != null) {
            dataChannel6.kv0(MultiGuestV3VideoSizeChannel.class);
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            InterfaceC75441TjB R62 = C8E.LJ().R6();
            if (R62 != null && R62.LLLLLILLIL()) {
                z = true;
            }
            LJJZZI.LJJLIIIIJ(viewGroup, z, true);
        }
        DataChannel dataChannel7 = this.LJLLI;
        if (dataChannel7 != null) {
            dataChannel7.ov0(this, MultiGuestV3AnchorContainerIsVisibleChannel.class, new AqS179S0100000_13(this, 150));
        }
        DataChannel dataChannel8 = this.LJLLI;
        if (dataChannel8 != null) {
            dataChannel8.ov0(this, MultiGuestV3VideoSizeChannel.class, new AqS179S0100000_13(this, 151));
            dataChannel8.lv0(this, MultiGuestV3RealVideoWidthChannel.class, new AqS179S0100000_13(this, 152));
        }
        if (LivesdkVoiceChatAudienceContainerSwitchSetting.INSTANCE.userInteractAnchorContainer() && (dataChannel3 = this.LJLLI) != null) {
            dataChannel3.ov0(this, SubOnlyLiveAudienceStatusChannel.class, new AqS179S0100000_13(this, 153));
        }
        DataChannel dataChannel9 = this.LJLLI;
        if (dataChannel9 != null) {
            dataChannel9.mv0(MultiLiveAnchorMuteVideoEvent.class, this, new AqS179S0100000_13(this, 154));
            dataChannel9.mv0(PIPModeChangeEvent.class, this, new AqS179S0100000_13(this, 138));
            dataChannel9.mv0(LiveShowCountDownEvent.class, this, new AqS179S0100000_13(this, 139));
            dataChannel9.mv0(LiveShowMaskOrderEvent.class, this, new AqS179S0100000_13(this, UserLevelGeckoUpdateSetting.DEFAULT));
            dataChannel9.mv0(LiveShowBeginEvent.class, this, new AqS179S0100000_13(this, 142));
            dataChannel9.mv0(LiveShowEndEvent.class, this, new AqS179S0100000_13(this, 143));
            dataChannel9.mv0(LiveShowMatchTotalScoreUpdateEvent.class, this, new AqS179S0100000_13(this, 144));
        }
        if (LivesdkSubShortCutPanelCombineSetting.INSTANCE.getValue() && (dataChannel2 = this.LJLLI) != null) {
            dataChannel2.ov0(this, ShortCutPanelShowChannel.class, new AqS179S0100000_13(this, 145));
        }
        if (L3().LJLIL) {
            DataChannelGlobal.LJLJJI.nv0(this, this, GlobalMultiLiveSettingChangeEvent.class, new AqS179S0100000_13(this, 633));
        }
        if (L3().LJLIL && (dataChannel = this.LJLLI) != null) {
            dataChannel.lv0(this, OuterMultiGuestLayoutChangeEvent.class, new AqS179S0100000_13(this, 634));
        }
        LifecycleOwner LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL == null) {
            LIZLLL = this;
        }
        this.LLD = new C75410Tig(LIZLLL, this.LJLLI, new AqS163S0100000_13(this, 86));
        if (L3().LJLIL) {
            D5();
        }
        DataChannel dataChannel10 = this.LJLLI;
        if (dataChannel10 != null && (interfaceC55235Lm3 = (InterfaceC55235Lm3) dataChannel10.kv0(C75415Til.class)) != null) {
            this.LLIIII = (IThemeAbility) UC0.LJIIL(interfaceC55235Lm3, IThemeAbility.class, null);
            this.LLIIIILZ = (ISharedBgAbility) UC0.LJIIL(interfaceC55235Lm3, ISharedBgAbility.class, null);
        }
        if (!TV3.LIZJ()) {
            DataChannel dataChannel11 = this.LJLLI;
            if (dataChannel11 != null) {
                dataChannel11.ov0(this, AudienceVideoViewParams.class, new AqS179S0100000_13(this, 146));
            }
            ISharedBgAbility iSharedBgAbility = this.LLIIIILZ;
            if (iSharedBgAbility != null && (n90 = iSharedBgAbility.n90()) != null) {
                C75244Tg0 prop1 = new TBV() { // from class: X.Tg0
                    @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                    public final Object get(Object obj) {
                        return ((C75235Tfr) obj).LJLJJI;
                    }

                    @Override // X.TBV, X.AbstractC74224TBc
                    public final void set(Object obj, Object obj2) {
                        ((C75235Tfr) obj).LJLJJI = (String) obj2;
                    }
                };
                AqS179S0100000_13 aqS179S0100000_13 = new AqS179S0100000_13(this, 147);
                o.LJIIIZ(prop1, "prop1");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select state Subscribe [");
                LIZ.append(prop1);
                LIZ.append("] ");
                UC0.LJJIZ(X1D.LIZIZ(LIZ), "StateSubscriber");
                C56412MCa c56412MCa = new C56412MCa();
                c56412MCa.LIZIZ(true);
                AssemViewModel.selectSubscribe$default(n90, prop1, c56412MCa, this, null, aqS179S0100000_13, 8, null);
            }
        }
        IThemeAbility iThemeAbility = this.LLIIII;
        if (iThemeAbility != null && (B702 = iThemeAbility.B70()) != null) {
            MultiGuestThemeViewModel.iv0(B702, new TBV() { // from class: X.Tfy
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return ((C75247Tg3) obj).LJLJJL;
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C75247Tg3) obj).LJLJJL = (Rect) obj2;
                }
            }, this, new AqS179S0100000_13(this, 148), 2);
        }
        IThemeAbility iThemeAbility2 = this.LLIIII;
        if (iThemeAbility2 != null && (B70 = iThemeAbility2.B70()) != null) {
            MultiGuestThemeViewModel.iv0(B70, new TBV() { // from class: X.Tg1
                @Override // X.TBV, X.AbstractC74224TBc, X.TBW
                public final Object get(Object obj) {
                    return ((C75247Tg3) obj).LJLJI;
                }

                @Override // X.TBV, X.AbstractC74224TBc
                public final void set(Object obj, Object obj2) {
                    ((C75247Tg3) obj).LJLJI = (String) obj2;
                }
            }, this, new AqS179S0100000_13(this, 149), 2);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility
    public final void I2(boolean z, boolean z2) {
        C75410Tig c75410Tig;
        MultiGuestThemeViewModel B70;
        C75247Tg3 state;
        String str;
        U8H LJJZZI;
        InterfaceC55235Lm3 LJJIL;
        this.LJLLJ = z;
        this.LJLLLL = z2;
        C75358Thq c75358Thq = this.LJLLL;
        if (c75358Thq != null) {
            c75358Thq.LJLJI = z2;
        }
        g4();
        if (z) {
            View containerView = getContainerView();
            if (containerView == null || (LJJIL = UC0.LJJIL(containerView)) == null || UC0.LJIIL(LJJIL, ILinkStateAbility.class, null) == null) {
                D5();
            }
            IThemeAbility iThemeAbility = this.LLIIII;
            if (iThemeAbility != null && (B70 = iThemeAbility.B70()) != null && (state = B70.getState()) != null && (str = state.LJLJI) != null && this.LJLLILLLL != null) {
                InterfaceC75441TjB R6 = C8E.LJ().R6();
                if (R6 != null && (LJJZZI = R6.LJJZZI()) != null && LJJZZI.LJJIL()) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("switchCharacter, apply bg when become guest ");
                LIZ.append(str);
                C74987Tbr.LIZJ("shared_bg", X1D.LIZIZ(LIZ));
                I3(str);
                return;
            }
            return;
        }
        if (!z2) {
            return;
        }
        if (MultiGuestV3GuestMonitoringTipsSetting.INSTANCE.getShowNetworkTip() && (c75410Tig = this.LLD) != null) {
            c75410Tig.LIZ();
        }
        k8();
        C15610jN.LIZJ(new ARunnableS49S0100000_13(this, 43), 5000L);
    }

    @Override // X.TUI
    public final void LLILII(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> provider, int i) {
        o.LJIIIZ(provider, "provider");
        g4();
        if (provider.LIZLLL(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) != null) {
            O3().LJIL(false);
        } else {
            O3().LJIL(true);
        }
        C75358Thq c75358Thq = this.LJLLL;
        if (c75358Thq != null) {
            c75358Thq.LJIILJJIL();
        }
    }

    public final void R3(int i, EnumC74991Tbv enumC74991Tbv) {
        Rect rect;
        U8H LJJZZI;
        C76696U8e LJJIII;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null) {
            rect = LJJIII.getContainerAllRange();
        } else {
            rect = null;
        }
        FrameLayout frameLayout = this.LJLLILLLL;
        if (frameLayout == null) {
            return;
        }
        if (rect != null && frameLayout.getWidth() == rect.width() && frameLayout.getHeight() == rect.height()) {
            e4(i, enumC74991Tbv, true);
            c4(i, enumC74991Tbv, true);
        } else {
            e4(i, enumC74991Tbv, false);
            c4(i, enumC74991Tbv, false);
        }
    }

    public final void W3(int i, EnumC74991Tbv enumC74991Tbv) {
        DataChannel dataChannel;
        M3().LJFF();
        C29556Biq.LIZ().getClass();
        C30658C1m c30658C1m = new C30658C1m(-1, -1, 0, 0, C74983Tbn.LIZ(enumC74991Tbv), true, C75256TgC.LJLIL);
        if (L3().LJLIL && i != 2 && (dataChannel = this.LJLLI) != null) {
            dataChannel.qv0(AnchorWindowParamsChangedEvent.class, c30658C1m);
        }
        C28212B5k c28212B5k = new C28212B5k(-1, -1, 0, 0, 0, true, enumC74991Tbv, null, this, 128);
        DataChannel dataChannel2 = this.LJLLI;
        if (dataChannel2 != null) {
            dataChannel2.rv0(AudienceVideoViewParams.class, c28212B5k);
        }
        B8S b8s = new B8S(0, 0, 0, 0, true);
        DataChannel dataChannel3 = this.LJLLI;
        if (dataChannel3 != null) {
            dataChannel3.qv0(LivePauseViewSizeChangeEvent.class, b8s);
        }
        X3(this, false, null, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r3 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b4(int r9, X.EnumC74991Tbv r10) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem.b4(int, X.Tbv):void");
    }

    public final void k4(String str, C28212B5k c28212B5k) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateShareBgForGuest imageFilePath:");
        LIZ.append(str);
        LIZ.append(" params:");
        LIZ.append(c28212B5k);
        LIZ.append(" isNormalAudience:");
        C19U.LIZJ(LIZ, this.LJLLLL, LIZ, "shared_bg");
        if (!this.LJLLLL) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateShareBgForGuest return as isNormalAudience:");
            C19U.LIZJ(LIZ2, this.LJLLLL, LIZ2, "shared_bg");
        } else {
            DataChannel dataChannel = this.LJLLI;
            if (dataChannel != null) {
                if (str == null) {
                    str = "";
                }
                dataChannel.qv0(AudienceUpdateShareBgEvent.class, str);
            }
        }
    }

    public final void c4(int i, EnumC74991Tbv enumC74991Tbv, boolean z) {
        Rect K3;
        if (z) {
            W3(i, enumC74991Tbv);
            return;
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 == null || R6.LLLLLJIL() == null || (K3 = K3()) == null) {
            return;
        }
        int width = K3.width();
        int height = K3.height();
        int i2 = K3.left;
        int i3 = K3.top;
        C29556Biq.LIZ().getClass();
        C30658C1m c30658C1m = new C30658C1m(width, height, i2, i3, C74983Tbn.LIZ(enumC74991Tbv), false, new AqS163S0100000_13(this, 568), 32);
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null) {
            dataChannel.qv0(AnchorWindowParamsChangedEvent.class, c30658C1m);
        }
    }

    public final void e4(int i, EnumC74991Tbv enumC74991Tbv, boolean z) {
        Rect rect;
        U8H LJJZZI;
        C76696U8e LJJIII;
        if (!MultiGuestV3RoomLoadingOptSetting.INSTANCE.isEnable() && z) {
            W3(i, enumC74991Tbv);
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 == null || (LJJZZI = R6.LJJZZI()) == null || (LJJIII = LJJZZI.LJJIII()) == null || (rect = LJJIII.getPlayerRange()) == null) {
            rect = new Rect();
        }
        FrameLayout frameLayout = this.LJLLILLLL;
        if (frameLayout == null) {
            return;
        }
        C28212B5k c28212B5k = new C28212B5k(rect.width(), rect.height(), rect.top, rect.left, frameLayout.getWidth() - rect.right, false, enumC74991Tbv, null, this, 128);
        DataChannel dataChannel = this.LJLLI;
        if (dataChannel != null) {
            dataChannel.rv0(AudienceVideoViewParams.class, c28212B5k);
        }
    }

    public static void X3(WindowMaskAssem windowMaskAssem, boolean z, Float f, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            f = null;
        }
        windowMaskAssem.getClass();
        C15610jN.LIZJ(new ARunnableS12S0210000_13(f, windowMaskAssem, z, 2), 100L);
    }
}
