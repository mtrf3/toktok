package X;

import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import com.bytedance.android.live.liveinteract.match.ui.fragment.InteractBattleBeInvitedFragmentV2;
import com.bytedance.android.live.liveinteract.match.ui.fragment.InteractBattleInviteFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveAnchorSettingDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostBeInvitedFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostInviteListFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostManagerFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSettingsFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListUpgradeFragment;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.MatchOnlyGiftSelectFragment;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.MultiMatchBeInvitedFragmentV2;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.MultiMatchInviteFragmentV2;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.MultiMatchMateQuitRequestFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostEnableNewInvitationPanelSetting;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* renamed from: X.TtZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76085TtZ implements InterfaceC76094Tti {
    public final InterfaceC76087Ttb LIZ;
    public final Stack<InteractDialogFragmentBaseContract$AbsView<?>> LIZIZ;

    @Override // X.InterfaceC76094Tti
    public final void LIZ() {
        this.LIZIZ.clear();
    }

    @Override // X.InterfaceC76094Tti
    public final boolean LIZIZ() {
        if (this.LIZIZ.isEmpty()) {
            return false;
        }
        this.LIZIZ.pop();
        return true;
    }

    @Override // X.InterfaceC76094Tti
    public final InteractDialogFragmentBaseContract$AbsView<?> LIZJ() {
        if (!this.LIZIZ.isEmpty()) {
            return this.LIZIZ.peek();
        }
        return null;
    }

    public C76085TtZ(LinkDialog mView) {
        o.LJIIIZ(mView, "mView");
        this.LIZ = mView;
        this.LIZIZ = new Stack<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC76094Tti
    public final boolean LIZLLL(EnumC76391TyV fragmentType, AbstractC75932Tr6 abstractC75932Tr6) {
        Boolean bool;
        MatchOnlyGiftSelectFragment matchOnlyGiftSelectFragment;
        o.LJIIIZ(fragmentType, "fragmentType");
        DataChannel dataChannel = null;
        if (this.LIZ.j9() != null) {
            EnumC29309Ber enumC29309Ber = (EnumC29309Ber) DataChannelGlobal.LJLJJI.mv0(BroadcastPageChannel.class);
            if (enumC29309Ber != null) {
                bool = Boolean.valueOf(enumC29309Ber.isEndPage());
            } else {
                bool = null;
            }
            if (!C29306Beo.LJJIFFI(bool)) {
                if (abstractC75932Tr6 != null) {
                    abstractC75932Tr6.LIZ = this.LIZ.j9();
                }
                if (this.LIZ instanceof InterfaceC75477Tjl) {
                    switch (C76390TyU.LIZ[fragmentType.ordinal()]) {
                        case 1:
                            if (abstractC75932Tr6 instanceof C75475Tjj) {
                                if (CoHostEnableNewInvitationPanelSetting.INSTANCE.isEnable()) {
                                    InterfaceC75477Tjl dialog = (InterfaceC75477Tjl) this.LIZ;
                                    C75475Tjj fragmentParams = (C75475Tjj) abstractC75932Tr6;
                                    o.LJIIIZ(dialog, "dialog");
                                    o.LJIIIZ(fragmentParams, "fragmentParams");
                                    MultiHostInviteListUpgradeFragment multiHostInviteListUpgradeFragment = new MultiHostInviteListUpgradeFragment();
                                    DataChannel dataChannel2 = fragmentParams.LIZ;
                                    o.LJIIIIZZ(dataChannel2, "fragmentParams.dataChannel");
                                    multiHostInviteListUpgradeFragment.LJLILLLLZI = new C76016TsS(multiHostInviteListUpgradeFragment, dataChannel2);
                                    multiHostInviteListUpgradeFragment.LJLIL = dialog;
                                    multiHostInviteListUpgradeFragment.LLFII = fragmentParams.LIZIZ;
                                    multiHostInviteListUpgradeFragment.LJLLI = fragmentParams.LIZ;
                                    multiHostInviteListUpgradeFragment.LJLJLLL = fragmentParams.LIZJ;
                                    matchOnlyGiftSelectFragment = multiHostInviteListUpgradeFragment;
                                    break;
                                } else {
                                    InterfaceC75477Tjl dialog2 = (InterfaceC75477Tjl) this.LIZ;
                                    C75475Tjj fragmentParams2 = (C75475Tjj) abstractC75932Tr6;
                                    o.LJIIIZ(dialog2, "dialog");
                                    o.LJIIIZ(fragmentParams2, "fragmentParams");
                                    MultiCoHostInviteListFragment multiCoHostInviteListFragment = new MultiCoHostInviteListFragment();
                                    DataChannel dataChannel3 = fragmentParams2.LIZ;
                                    o.LJIIIIZZ(dataChannel3, "fragmentParams.dataChannel");
                                    multiCoHostInviteListFragment.LJLILLLLZI = new C76015TsR(multiCoHostInviteListFragment, dataChannel3);
                                    multiCoHostInviteListFragment.LJLIL = dialog2;
                                    multiCoHostInviteListFragment.LLFFF = fragmentParams2.LIZIZ;
                                    multiCoHostInviteListFragment.LJLLI = fragmentParams2.LIZ;
                                    multiCoHostInviteListFragment.LJLJLLL = fragmentParams2.LIZJ;
                                    matchOnlyGiftSelectFragment = multiCoHostInviteListFragment;
                                    break;
                                }
                            }
                            break;
                        case 2:
                            if (abstractC75932Tr6 instanceof K11) {
                                InterfaceC75477Tjl dialog3 = (InterfaceC75477Tjl) this.LIZ;
                                K11 fragmentParams3 = (K11) abstractC75932Tr6;
                                o.LJIIIZ(dialog3, "dialog");
                                o.LJIIIZ(fragmentParams3, "fragmentParams");
                                MultiCoHostManagerFragment multiCoHostManagerFragment = new MultiCoHostManagerFragment();
                                multiCoHostManagerFragment.LJLILLLLZI = new C75760ToK(multiCoHostManagerFragment, fragmentParams3.LIZ);
                                multiCoHostManagerFragment.LJLLI = fragmentParams3.LIZIZ;
                                multiCoHostManagerFragment.LJLJJLL = fragmentParams3.LIZ;
                                multiCoHostManagerFragment.LJLIL = dialog3;
                                multiCoHostManagerFragment.LJLLILLLL = fragmentParams3.LIZJ;
                                matchOnlyGiftSelectFragment = multiCoHostManagerFragment;
                                break;
                            }
                            break;
                        case 3:
                            if (abstractC75932Tr6 instanceof C75474Tji) {
                                InterfaceC75477Tjl interfaceC75477Tjl = (InterfaceC75477Tjl) this.LIZ;
                                C75474Tji params = (C75474Tji) abstractC75932Tr6;
                                o.LJIIIZ(params, "params");
                                MultiCoHostBeInvitedFragment multiCoHostBeInvitedFragment = new MultiCoHostBeInvitedFragment();
                                LinkerInviteContent linkerInviteContent = params.LIZIZ;
                                if (linkerInviteContent == null) {
                                    linkerInviteContent = new LinkerInviteContent();
                                }
                                multiCoHostBeInvitedFragment.LJLLI = linkerInviteContent;
                                multiCoHostBeInvitedFragment.LJLLILLLL = params.LIZJ;
                                multiCoHostBeInvitedFragment.LJLLJ = params.LIZ;
                                multiCoHostBeInvitedFragment.LJLLL = params.LIZLLL;
                                multiCoHostBeInvitedFragment.LJLILLLLZI = new C75882TqI(multiCoHostBeInvitedFragment, params);
                                multiCoHostBeInvitedFragment.LJLIL = interfaceC75477Tjl;
                                matchOnlyGiftSelectFragment = multiCoHostBeInvitedFragment;
                                break;
                            }
                            break;
                        case 4:
                            if (abstractC75932Tr6 instanceof C76054Tt4) {
                                InterfaceC75477Tjl interfaceC75477Tjl2 = (InterfaceC75477Tjl) this.LIZ;
                                C76054Tt4 fragmentParams4 = (C76054Tt4) abstractC75932Tr6;
                                o.LJIIIZ(fragmentParams4, "fragmentParams");
                                MultiCoHostSettingsFragment multiCoHostSettingsFragment = new MultiCoHostSettingsFragment();
                                multiCoHostSettingsFragment.LJLILLLLZI = new C76171Tux(multiCoHostSettingsFragment);
                                multiCoHostSettingsFragment.LJLIL = interfaceC75477Tjl2;
                                multiCoHostSettingsFragment.LL = fragmentParams4.LIZIZ;
                                matchOnlyGiftSelectFragment = multiCoHostSettingsFragment;
                                break;
                            }
                            break;
                        case 5:
                            if (abstractC75932Tr6 instanceof C76497U0n) {
                                InterfaceC75477Tjl dialog4 = (InterfaceC75477Tjl) this.LIZ;
                                C76497U0n fragmentParams5 = (C76497U0n) abstractC75932Tr6;
                                o.LJIIIZ(dialog4, "dialog");
                                o.LJIIIZ(fragmentParams5, "fragmentParams");
                                InteractBattleInviteFragment interactBattleInviteFragment = new InteractBattleInviteFragment();
                                interactBattleInviteFragment.LJLILLLLZI = new C76088Ttc(interactBattleInviteFragment);
                                interactBattleInviteFragment.LJLJJL = fragmentParams5.LIZJ;
                                interactBattleInviteFragment.LJLJJLL = fragmentParams5.LIZLLL;
                                interactBattleInviteFragment.LJLJLLL = fragmentParams5.LIZIZ;
                                interactBattleInviteFragment.LJLIL = dialog4;
                                interactBattleInviteFragment.LJLJL = fragmentParams5.LJ;
                                matchOnlyGiftSelectFragment = interactBattleInviteFragment;
                                break;
                            }
                            break;
                        case 6:
                            if (abstractC75932Tr6 instanceof C76091Ttf) {
                                InterfaceC75477Tjl dialog5 = (InterfaceC75477Tjl) this.LIZ;
                                C76091Ttf fragmentParams6 = (C76091Ttf) abstractC75932Tr6;
                                o.LJIIIZ(dialog5, "dialog");
                                o.LJIIIZ(fragmentParams6, "fragmentParams");
                                InteractBattleBeInvitedFragmentV2 interactBattleBeInvitedFragmentV2 = new InteractBattleBeInvitedFragmentV2();
                                DataChannel dataChannel4 = fragmentParams6.LIZ;
                                o.LJIIIIZZ(dataChannel4, "fragmentParams.dataChannel");
                                interactBattleBeInvitedFragmentV2.LJLILLLLZI = new C76258TwM(interactBattleBeInvitedFragmentV2, dataChannel4);
                                interactBattleBeInvitedFragmentV2.LJLIL = dialog5;
                                interactBattleBeInvitedFragmentV2.LJLJJLL = fragmentParams6.LIZJ;
                                interactBattleBeInvitedFragmentV2.LJLJJL = fragmentParams6.LIZIZ;
                                matchOnlyGiftSelectFragment = interactBattleBeInvitedFragmentV2;
                                break;
                            }
                            break;
                        case 7:
                            if (abstractC75932Tr6 instanceof C76236Tw0) {
                                InterfaceC75477Tjl mView = (InterfaceC75477Tjl) this.LIZ;
                                C76236Tw0 fragmentParams7 = (C76236Tw0) abstractC75932Tr6;
                                o.LJIIIZ(mView, "mView");
                                o.LJIIIZ(fragmentParams7, "fragmentParams");
                                MultiMatchInviteFragmentV2 multiMatchInviteFragmentV2 = new MultiMatchInviteFragmentV2();
                                multiMatchInviteFragmentV2.LJLILLLLZI = new C76234Tvy(multiMatchInviteFragmentV2, fragmentParams7);
                                multiMatchInviteFragmentV2.LJLIL = mView;
                                multiMatchInviteFragmentV2.LLI = fragmentParams7.LJI;
                                matchOnlyGiftSelectFragment = multiMatchInviteFragmentV2;
                                break;
                            }
                            break;
                        case 8:
                            if (abstractC75932Tr6 instanceof C76223Tvn) {
                                InterfaceC75477Tjl mView2 = (InterfaceC75477Tjl) this.LIZ;
                                C76223Tvn fragmentParams8 = (C76223Tvn) abstractC75932Tr6;
                                o.LJIIIZ(mView2, "mView");
                                o.LJIIIZ(fragmentParams8, "fragmentParams");
                                MultiMatchBeInvitedFragmentV2 multiMatchBeInvitedFragmentV2 = new MultiMatchBeInvitedFragmentV2();
                                multiMatchBeInvitedFragmentV2.LJLJJL = fragmentParams8;
                                multiMatchBeInvitedFragmentV2.LJLILLLLZI = new C76231Tvv(multiMatchBeInvitedFragmentV2, fragmentParams8.LIZIZ);
                                multiMatchBeInvitedFragmentV2.LJLIL = mView2;
                                matchOnlyGiftSelectFragment = multiMatchBeInvitedFragmentV2;
                                break;
                            }
                            break;
                        case 9:
                            if (abstractC75932Tr6 instanceof C76255TwJ) {
                                InterfaceC75477Tjl mView3 = (InterfaceC75477Tjl) this.LIZ;
                                C76255TwJ params2 = (C76255TwJ) abstractC75932Tr6;
                                o.LJIIIZ(mView3, "mView");
                                o.LJIIIZ(params2, "params");
                                MultiMatchMateQuitRequestFragment multiMatchMateQuitRequestFragment = new MultiMatchMateQuitRequestFragment();
                                multiMatchMateQuitRequestFragment.LJLILLLLZI = new C76252TwG(multiMatchMateQuitRequestFragment, params2);
                                multiMatchMateQuitRequestFragment.LJLIL = mView3;
                                matchOnlyGiftSelectFragment = multiMatchMateQuitRequestFragment;
                                break;
                            }
                            break;
                        case 10:
                            if (abstractC75932Tr6 instanceof K15) {
                                C75315Th9 c75315Th9 = MultiLiveAnchorSettingDialog.LLLILZ;
                                InterfaceC75477Tjl interfaceC75477Tjl3 = (InterfaceC75477Tjl) this.LIZ;
                                c75315Th9.getClass();
                                MultiLiveAnchorSettingDialog multiLiveAnchorSettingDialog = new MultiLiveAnchorSettingDialog();
                                multiLiveAnchorSettingDialog.LJLILLLLZI = new C75297Tgr(multiLiveAnchorSettingDialog);
                                multiLiveAnchorSettingDialog.LJLIL = interfaceC75477Tjl3;
                                if (abstractC75932Tr6 != null) {
                                    dataChannel = abstractC75932Tr6.LIZ;
                                }
                                multiLiveAnchorSettingDialog.LJLJJL = dataChannel;
                                matchOnlyGiftSelectFragment = multiLiveAnchorSettingDialog;
                                break;
                            }
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                            if (abstractC75932Tr6 instanceof C76086Tta) {
                                InterfaceC75477Tjl dialog6 = (InterfaceC75477Tjl) this.LIZ;
                                boolean z = ((C76086Tta) abstractC75932Tr6).LIZIZ;
                                o.LJIIIZ(dialog6, "dialog");
                                MatchOnlyGiftSelectFragment matchOnlyGiftSelectFragment2 = new MatchOnlyGiftSelectFragment();
                                matchOnlyGiftSelectFragment2.LJLJL = z;
                                matchOnlyGiftSelectFragment2.LJLJJLL = dialog6;
                                matchOnlyGiftSelectFragment = matchOnlyGiftSelectFragment2;
                                break;
                            }
                            break;
                    }
                    this.LIZIZ.push(matchOnlyGiftSelectFragment);
                    return true;
                }
            }
        }
        return false;
    }
}
