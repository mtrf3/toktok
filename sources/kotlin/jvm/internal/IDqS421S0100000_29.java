package kotlin.jvm.internal;

import X.ASQ;
import X.ASY;
import X.AbstractC65781Prl;
import X.AbstractC91339Zt1;
import X.AbstractC91590Zx4;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C2NU;
import X.C39557Ffl;
import X.C44498HdG;
import X.C46420IJs;
import X.C47261Igj;
import X.C51029K0z;
import X.C55096Ljo;
import X.C55230Lly;
import X.C5S1;
import X.C61447O9r;
import X.C61996OUu;
import X.C68322mC;
import X.C76800UCe;
import X.C91061ZoX;
import X.C91092Zp2;
import X.C91202Zqo;
import X.C91203Zqp;
import X.C91211Zqx;
import X.C91246ZrW;
import X.C91249ZrZ;
import X.C91264Zro;
import X.C91266Zrq;
import X.C91329Zsr;
import X.C91330Zss;
import X.C91335Zsx;
import X.C91337Zsz;
import X.C91341Zt3;
import X.C91352ZtE;
import X.C91356ZtI;
import X.C91392Zts;
import X.C91393Ztt;
import X.C91437Zub;
import X.C91443Zuh;
import X.C91453Zur;
import X.C91488ZvQ;
import X.C91489ZvR;
import X.C91490ZvS;
import X.C91502Zve;
import X.C91506Zvi;
import X.C91576Zwq;
import X.EF7;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC91296ZsK;
import X.L41;
import X.LCP;
import X.X1D;
import X.YBK;
import X.YXW;
import Y.IDBReceiverS12S0100000_29;
import Y.IDHandlerS27S0100000_29;
import Y.IDObserverS226S0100000_29;
import Y.IDUListenerS264S0100000_29;
import android.animation.ValueAnimator;
import android.content.ComponentName;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspSlotReusedAssem;
import com.ss.android.ugc.aweme.dsp.common.model.DspMusicStruct;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.dsp.playerservice.NewDspPlayerService;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.common.MediaSessionService;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment;
import com.ss.android.ugc.aweme.dsp.playpage.card.upsell.UpsellLandingPageSlotAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueFragment;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.audioinfo.AudioInfoAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong.PlayFullSongAssem;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.seekbar.AudioSeekBarAssem;
import com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueAssem;
import com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueFragment;
import com.ss.android.ugc.aweme.dsp.playpage.queue.MDQueueViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IViewPagerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.viewpager.DspViewPagerAssem;
import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUGCButtonAssem;
import com.ss.android.ugc.aweme.dsp.ugcCollect.MusicDspUGCButtonTrigger;
import com.ss.android.ugc.aweme.dsp.v2.TTDspFragmentV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes22.dex */
public class IDqS421S0100000_29 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$0();
            case 17:
                return invoke$1();
            case 18:
                return invoke$2();
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$3();
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case 24:
                return invoke$24(this);
            case 25:
                return invoke$4();
            case 26:
                return invoke$5();
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case 33:
                return invoke$6();
            case 34:
                return invoke$7();
            case 35:
                return invoke$8();
            case 36:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$9();
            case 39:
                return invoke$10();
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$11();
            case 41:
                return invoke$12();
            case 42:
                return invoke$42(this);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$13();
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$14();
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$15();
            case C61447O9r.LJIIJ:
                return invoke$49(this);
            case 50:
                return invoke$16();
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$17();
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$83(this);
            case 84:
                return invoke$84(this);
            default:
                return null;
        }
    }

    public final String invoke$0() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$1() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$10() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$11() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$12() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$13() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$14() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$15() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$16() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final IDHandlerS27S0100000_29 invoke$17() {
        return new IDHandlerS27S0100000_29((C91437Zub) this.l0, C16880lQ.LLJJJJ(), 1);
    }

    public final String invoke$2() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$3() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$4() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$5() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$6() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$7() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$8() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public final String invoke$9() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assem_");
        LIZ.append(C39557Ffl.LIZ((InterfaceC65350Pko) this.l0).getName());
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$0(IDqS421S0100000_29 iDqS421S0100000_29) {
        return new C91061ZoX(new C91329Zsr((C91330Zss) iDqS421S0100000_29.l0));
    }

    public static final Object invoke$1(IDqS421S0100000_29 iDqS421S0100000_29) {
        String str = C91061ZoX.LJII;
        TTVideoEngine tTVideoEngine = new TTVideoEngine(EF7.LIZIZ(), 0);
        C91061ZoX c91061ZoX = (C91061ZoX) iDqS421S0100000_29.l0;
        tTVideoEngine.LLJIJIL(str);
        tTVideoEngine.LJLLLL(160, 1);
        tTVideoEngine.LJLLLL(402, 1);
        tTVideoEngine.LJLLLL(0, 300);
        if (YBK.LIZ().playerOpt.getEnableSeekInterrup()) {
            tTVideoEngine.LJLLLL(331, 1);
        }
        tTVideoEngine.LJLLLL(27, 1);
        tTVideoEngine.LJLLLL(416, 0);
        tTVideoEngine.LJLLLL(314, 1);
        tTVideoEngine.LJLLLL(28, 6);
        tTVideoEngine.LJLLLL(18, 1);
        tTVideoEngine.LJLLLL(415, 1);
        tTVideoEngine.LJLLLL(4, 2);
        if (YBK.LIZ().playerOpt.getEnableSkipFindStreamInfo()) {
            tTVideoEngine.LJLLLL(204, 1);
        }
        YXW.LIZ.getClass();
        if (YXW.LIZLLL) {
            tTVideoEngine.LJLLLL(480, 1);
        }
        tTVideoEngine.LIZ.LLZLLLL = new C91337Zsz(c91061ZoX);
        tTVideoEngine.LJZI(new C91335Zsx(c91061ZoX, c91061ZoX, c91061ZoX.LIZ));
        tTVideoEngine.LLFII(false);
        tTVideoEngine.LJLI();
        c91061ZoX.LIZIZ = true;
        return tTVideoEngine;
    }

    public static final Object invoke$10(IDqS421S0100000_29 iDqS421S0100000_29) {
        boolean z;
        Boolean bool;
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((BaseDspSlotReusedAssem) iDqS421S0100000_29.l0);
        if (LJIIIIZZ != null) {
            IContainerUtilityAbility m4 = ((BaseDspSlotReusedAssem) iDqS421S0100000_29.l0).m4();
            if (m4 != null) {
                bool = Boolean.valueOf(m4.Ds0(LJIIIIZZ));
            } else {
                bool = null;
            }
            z = o.LJ(bool, Boolean.TRUE);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$11(IDqS421S0100000_29 iDqS421S0100000_29) {
        return C91264Zro.LJ((BaseDspSlotReusedAssem) iDqS421S0100000_29.l0);
    }

    public static final Object invoke$12(IDqS421S0100000_29 iDqS421S0100000_29) {
        return new C91092Zp2((NewDspPlayerService) iDqS421S0100000_29.l0);
    }

    public static final Object invoke$13(IDqS421S0100000_29 iDqS421S0100000_29) {
        return Boolean.valueOf(((BasePlayerFragment) iDqS421S0100000_29.l0).Dl());
    }

    public static final Object invoke$14(IDqS421S0100000_29 iDqS421S0100000_29) {
        return C55096Ljo.LIZ(C55230Lly.LIZJ((BasePlayerFragment) iDqS421S0100000_29.l0, null), IXTabPanelAbility.class, null);
    }

    public static final Object invoke$15(IDqS421S0100000_29 iDqS421S0100000_29) {
        ((BasePlayerFragment) iDqS421S0100000_29.l0).Hl();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(IDqS421S0100000_29 iDqS421S0100000_29) {
        View findViewById = ((MDAudioQueueAssem) iDqS421S0100000_29.l0).getContainerView().findViewById(R.id.ip);
        o.LJII(findViewById, "null cannot be cast to non-null type com.bytedance.ies.powerlist.PowerList");
        return findViewById;
    }

    public static final Object invoke$2(IDqS421S0100000_29 iDqS421S0100000_29) {
        return new C91341Zt3((AbstractC91339Zt1) iDqS421S0100000_29.l0);
    }

    public static final Object invoke$20(IDqS421S0100000_29 iDqS421S0100000_29) {
        View findViewById = ((MDAudioQueueAssem) iDqS421S0100000_29.l0).getContainerView().findViewById(R.id.ir);
        o.LJII(findViewById, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        return findViewById;
    }

    public static final Object invoke$22(IDqS421S0100000_29 iDqS421S0100000_29) {
        ASQ.LJ((MDAudioQueueFragment) iDqS421S0100000_29.l0, ASY.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(IDqS421S0100000_29 iDqS421S0100000_29) {
        DspStruct LJIIIIZZ;
        DspMusicStruct dspMusic;
        Music music;
        String str;
        InterfaceC91296ZsK LIZ = ((MDAudioQueueFragment) iDqS421S0100000_29.l0).LJLIL.getPlayerController().LIZ();
        if (LIZ != null && (LJIIIIZZ = LIZ.LJIIIIZZ()) != null && (dspMusic = LJIIIIZZ.getDspMusic()) != null && (music = dspMusic.getMusic()) != null) {
            MDAudioQueueFragment mDAudioQueueFragment = (MDAudioQueueFragment) iDqS421S0100000_29.l0;
            ASQ.LJ(mDAudioQueueFragment, ASY.LIZ);
            Context context = mDAudioQueueFragment.getContext();
            if (context != null) {
                if (!C2NU.LIZ.LIZIZ()) {
                    C5S1 c5s1 = new C5S1(context);
                    c5s1.LIZJ(R.string.img);
                    c5s1.LJ();
                } else {
                    ShareDependService.LIZ.getClass();
                    ShareDependService LIZ2 = C44498HdG.LIZ();
                    if (o.LJ(mDAudioQueueFragment.LJLIL.x5().LJLIL, "dsp_player")) {
                        str = "my_playlist";
                    } else {
                        str = "track_reco";
                    }
                    LIZ2.LJIIIIZZ(music, context, str);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(IDqS421S0100000_29 iDqS421S0100000_29) {
        return new C91352ZtE((MDAudioQueueViewModel) iDqS421S0100000_29.l0);
    }

    public static final Object invoke$27(IDqS421S0100000_29 iDqS421S0100000_29) {
        View view = ((AudioInfoAssem) iDqS421S0100000_29.l0).LLIIIJ;
        if (view != null) {
            return view.findViewById(R.id.gsm);
        }
        o.LJIJI("cardRootView");
        throw null;
    }

    public static final Object invoke$28(IDqS421S0100000_29 iDqS421S0100000_29) {
        View view = ((AudioInfoAssem) iDqS421S0100000_29.l0).LLIIIJ;
        if (view != null) {
            return view.findViewById(R.id.gsu);
        }
        o.LJIJI("cardRootView");
        throw null;
    }

    public static final Object invoke$29(IDqS421S0100000_29 iDqS421S0100000_29) {
        View view = ((AudioInfoAssem) iDqS421S0100000_29.l0).LLIIIJ;
        if (view != null) {
            return view.findViewById(R.id.gsk);
        }
        o.LJIJI("cardRootView");
        throw null;
    }

    public static final Object invoke$3(IDqS421S0100000_29 iDqS421S0100000_29) {
        return new IDObserverS226S0100000_29((AbstractC91339Zt1) iDqS421S0100000_29.l0, 0);
    }

    public static final Object invoke$30(IDqS421S0100000_29 iDqS421S0100000_29) {
        View view = ((AudioInfoAssem) iDqS421S0100000_29.l0).LLIIIJ;
        if (view != null) {
            return view.findViewById(R.id.gsp);
        }
        o.LJIJI("cardRootView");
        throw null;
    }

    public static final Object invoke$31(IDqS421S0100000_29 iDqS421S0100000_29) {
        ((AudioInfoAssem) iDqS421S0100000_29.l0).l4();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(IDqS421S0100000_29 iDqS421S0100000_29) {
        View view = ((AudioInfoAssem) iDqS421S0100000_29.l0).LLIIIJ;
        if (view != null) {
            return view.findViewById(R.id.gsl);
        }
        o.LJIJI("cardRootView");
        throw null;
    }

    public static final Object invoke$36(IDqS421S0100000_29 iDqS421S0100000_29) {
        return ((PlayFullSongAssem) iDqS421S0100000_29.l0).LLFII;
    }

    public static final Object invoke$37(IDqS421S0100000_29 iDqS421S0100000_29) {
        boolean z = false;
        if (((PlayFullSongAssem) iDqS421S0100000_29.l0).b4()) {
            View view = ((PlayFullSongAssem) iDqS421S0100000_29.l0).LLFZ;
            if (view != null) {
                if (view.getVisibility() == 0) {
                    z = true;
                }
            } else {
                o.LJIJI("contentView");
                throw null;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(IDqS421S0100000_29 iDqS421S0100000_29) {
        return C91264Zro.LIZIZ((BaseDspItemReusedAssem) iDqS421S0100000_29.l0);
    }

    public static final Object invoke$42(IDqS421S0100000_29 iDqS421S0100000_29) {
        long j;
        InterfaceC91296ZsK interfaceC91296ZsK;
        AbstractC91590Zx4 HS;
        AbstractC91590Zx4 HS2;
        IAudioPlayerAbility LIZJ = C91264Zro.LIZJ((AudioSeekBarAssem) iDqS421S0100000_29.l0);
        if (LIZJ != null && (HS2 = LIZJ.HS()) != null) {
            j = HS2.LJLILLLLZI.LJIJJ();
        } else {
            j = 0;
        }
        AudioSeekBarAssem audioSeekBarAssem = (AudioSeekBarAssem) iDqS421S0100000_29.l0;
        audioSeekBarAssem.LLIZLLLIL = j;
        audioSeekBarAssem.r4(j);
        AudioSeekBarAssem audioSeekBarAssem2 = (AudioSeekBarAssem) iDqS421S0100000_29.l0;
        IAudioPlayerAbility LIZJ2 = C91264Zro.LIZJ(audioSeekBarAssem2);
        if (LIZJ2 != null && (HS = LIZJ2.HS()) != null) {
            interfaceC91296ZsK = HS.LIZ();
        } else {
            interfaceC91296ZsK = null;
        }
        audioSeekBarAssem2.p4(interfaceC91296ZsK, j);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$44(IDqS421S0100000_29 iDqS421S0100000_29) {
        View containerView = ((MDQueueAssem) iDqS421S0100000_29.l0).getContainerView();
        o.LJII(containerView, "null cannot be cast to non-null type com.bytedance.ies.powerlist.PowerList");
        return containerView;
    }

    public static final Object invoke$46(IDqS421S0100000_29 iDqS421S0100000_29) {
        ASQ.LJ((MDQueueFragment) iDqS421S0100000_29.l0, ASY.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$47(IDqS421S0100000_29 iDqS421S0100000_29) {
        return new C91356ZtI((MDQueueViewModel) iDqS421S0100000_29.l0);
    }

    public static final Object invoke$49(IDqS421S0100000_29 iDqS421S0100000_29) {
        return C91264Zro.LIZLLL((DspViewPagerAssem) iDqS421S0100000_29.l0);
    }

    public static final Object invoke$5(IDqS421S0100000_29 iDqS421S0100000_29) {
        boolean z;
        Boolean bool;
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((BaseDspItemReusedAssem) iDqS421S0100000_29.l0);
        if (LJIIIIZZ != null) {
            IContainerUtilityAbility a4 = ((BaseDspItemReusedAssem) iDqS421S0100000_29.l0).a4();
            if (a4 != null) {
                bool = Boolean.valueOf(a4.Ds0(LJIIIIZZ));
            } else {
                bool = null;
            }
            z = o.LJ(bool, Boolean.TRUE);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$51(IDqS421S0100000_29 iDqS421S0100000_29) {
        Context context = ((MusicDspUGCButtonAssem) iDqS421S0100000_29.l0).getContext();
        if (context != null) {
            return new C61996OUu(context);
        }
        return null;
    }

    public static final Object invoke$52(IDqS421S0100000_29 iDqS421S0100000_29) {
        Dsp dsp;
        L41.LIZ.getClass();
        if (L41.LJFF()) {
            TuxTextView tuxTextView = ((MusicDspUGCButtonAssem) iDqS421S0100000_29.l0).LLI;
            if (tuxTextView != null) {
                MusicDetailService.LJIJJ().LIZ();
                tuxTextView.setText(R.string.iie);
            }
            TuxIconView tuxIconView = ((MusicDspUGCButtonAssem) iDqS421S0100000_29.l0).LLIFFJFJJ;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            TuxIconView tuxIconView2 = ((MusicDspUGCButtonAssem) iDqS421S0100000_29.l0).LLII;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
            }
        } else if (L41.LJ()) {
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL((MusicDspUGCButtonAssem) iDqS421S0100000_29.l0)).getAweme();
            if (aweme != null && (dsp = aweme.getDsp()) != null && dsp.isCollected()) {
                TuxIconView tuxIconView3 = ((MusicDspUGCButtonAssem) iDqS421S0100000_29.l0).LLIFFJFJJ;
                if (tuxIconView3 != null) {
                    tuxIconView3.setVisibility(8);
                }
                TuxIconView tuxIconView4 = ((MusicDspUGCButtonAssem) iDqS421S0100000_29.l0).LLII;
                if (tuxIconView4 != null) {
                    tuxIconView4.setVisibility(0);
                }
                TuxTextView tuxTextView2 = ((MusicDspUGCButtonAssem) iDqS421S0100000_29.l0).LLI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(R.string.ihi);
                }
            } else {
                TuxIconView tuxIconView5 = ((MusicDspUGCButtonAssem) iDqS421S0100000_29.l0).LLIFFJFJJ;
                if (tuxIconView5 != null) {
                    tuxIconView5.setVisibility(0);
                }
                TuxIconView tuxIconView6 = ((MusicDspUGCButtonAssem) iDqS421S0100000_29.l0).LLIFFJFJJ;
                if (tuxIconView6 != null) {
                    tuxIconView6.setIconRes(R.raw.icon_bookmark);
                }
                TuxIconView tuxIconView7 = ((MusicDspUGCButtonAssem) iDqS421S0100000_29.l0).LLII;
                if (tuxIconView7 != null) {
                    tuxIconView7.setVisibility(8);
                }
                TuxTextView tuxTextView3 = ((MusicDspUGCButtonAssem) iDqS421S0100000_29.l0).LLI;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(R.string.igq);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$53(IDqS421S0100000_29 iDqS421S0100000_29) {
        return C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((MusicDspUGCButtonTrigger) iDqS421S0100000_29.l0), PriorityAbility.class, null);
    }

    public static final Object invoke$54(IDqS421S0100000_29 iDqS421S0100000_29) {
        return ((TTDspFragmentV2) iDqS421S0100000_29.l0).LJZI.getValue();
    }

    public static final Object invoke$55(IDqS421S0100000_29 iDqS421S0100000_29) {
        View view = ((TTDspFragmentV2) iDqS421S0100000_29.l0).getView();
        if (view != null) {
            return view.findViewById(R.id.kej);
        }
        return null;
    }

    public static final Object invoke$56(IDqS421S0100000_29 iDqS421S0100000_29) {
        View view = ((TTDspFragmentV2) iDqS421S0100000_29.l0).getView();
        if (view != null) {
            return view.findViewById(R.id.gsz);
        }
        return null;
    }

    public static final Object invoke$57(IDqS421S0100000_29 iDqS421S0100000_29) {
        return C55096Ljo.LIZ(C55230Lly.LIZJ((TTDspFragmentV2) iDqS421S0100000_29.l0, null), IXTabPanelAbility.class, null);
    }

    public static final Object invoke$58(IDqS421S0100000_29 iDqS421S0100000_29) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        C91488ZvQ c91488ZvQ = (C91488ZvQ) iDqS421S0100000_29.l0;
        ofFloat.addUpdateListener(new IDUListenerS264S0100000_29(c91488ZvQ, 4));
        ofFloat.setInterpolator(c91488ZvQ.LJLJLJ);
        ofFloat.setDuration(c91488ZvQ.LJLJL);
        return ofFloat;
    }

    public static final Object invoke$59(IDqS421S0100000_29 iDqS421S0100000_29) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        C91488ZvQ c91488ZvQ = (C91488ZvQ) iDqS421S0100000_29.l0;
        ofFloat.addUpdateListener(new IDUListenerS264S0100000_29(c91488ZvQ, 5));
        ofFloat.setInterpolator(c91488ZvQ.LJLJLJ);
        ofFloat.setDuration(c91488ZvQ.LJLJL);
        return ofFloat;
    }

    public static final Object invoke$6(IDqS421S0100000_29 iDqS421S0100000_29) {
        return C91264Zro.LIZJ((BaseDspItemReusedAssem) iDqS421S0100000_29.l0);
    }

    public static final Object invoke$60(IDqS421S0100000_29 iDqS421S0100000_29) {
        C91488ZvQ c91488ZvQ = (C91488ZvQ) iDqS421S0100000_29.l0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c91488ZvQ.LJLJJL, c91488ZvQ.LJLJJLL);
        C91488ZvQ c91488ZvQ2 = (C91488ZvQ) iDqS421S0100000_29.l0;
        ofFloat.addUpdateListener(new IDUListenerS264S0100000_29(c91488ZvQ2, 6));
        ofFloat.setInterpolator(c91488ZvQ2.LJLJLJ);
        ofFloat.setDuration(c91488ZvQ2.LJLJL);
        return ofFloat;
    }

    public static final Object invoke$61(IDqS421S0100000_29 iDqS421S0100000_29) {
        C91488ZvQ c91488ZvQ = (C91488ZvQ) iDqS421S0100000_29.l0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c91488ZvQ.LJLJJLL, c91488ZvQ.LJLJJL);
        C91488ZvQ c91488ZvQ2 = (C91488ZvQ) iDqS421S0100000_29.l0;
        ofFloat.addUpdateListener(new IDUListenerS264S0100000_29(c91488ZvQ2, 7));
        ofFloat.setInterpolator(c91488ZvQ2.LJLJLJ);
        ofFloat.setDuration(c91488ZvQ2.LJLJL);
        return ofFloat;
    }

    public static final Object invoke$62(IDqS421S0100000_29 iDqS421S0100000_29) {
        return new C91490ZvS(((C91576Zwq) iDqS421S0100000_29.l0).LJLIL);
    }

    public static final Object invoke$63(IDqS421S0100000_29 iDqS421S0100000_29) {
        Context context = ((C91392Zts) iDqS421S0100000_29.l0).LIZ;
        o.LJIIIZ(context, "context");
        String string = context.getResources().getString(R.string.ii1);
        o.LJIIIIZZ(string, "context.resources.getStr…ng.music_dsp_tab_library)");
        return new LCP(context, "LIBRARY V2", string);
    }

    public static final Object invoke$64(IDqS421S0100000_29 iDqS421S0100000_29) {
        Context context = ((C91393Ztt) iDqS421S0100000_29.l0).LIZ;
        o.LJIIIZ(context, "context");
        String string = context.getResources().getString(R.string.ii2);
        o.LJIIIIZZ(string, "context.resources.getStr…string.music_dsp_tab_ydm)");
        return new LCP(context, "Daily Mix V2", string);
    }

    public static final Object invoke$65(IDqS421S0100000_29 iDqS421S0100000_29) {
        return Boolean.valueOf(C91266Zrq.LIZ((IXTabPanelAbility) iDqS421S0100000_29.l0));
    }

    public static final Object invoke$66(IDqS421S0100000_29 iDqS421S0100000_29) {
        return Boolean.valueOf(C91266Zrq.LIZ((IXTabPanelAbility) iDqS421S0100000_29.l0));
    }

    public static final Object invoke$67(IDqS421S0100000_29 iDqS421S0100000_29) {
        return Boolean.valueOf(C91266Zrq.LIZ((IXTabPanelAbility) iDqS421S0100000_29.l0));
    }

    public static final Object invoke$68(IDqS421S0100000_29 iDqS421S0100000_29) {
        return Boolean.valueOf(C91266Zrq.LIZ((IXTabPanelAbility) iDqS421S0100000_29.l0));
    }

    public static final Object invoke$69(IDqS421S0100000_29 iDqS421S0100000_29) {
        return new C46420IJs(((Number) ((C91202Zqo) iDqS421S0100000_29.l0).LIZIZ.getValue()).intValue());
    }

    public static final Object invoke$7(IDqS421S0100000_29 iDqS421S0100000_29) {
        return C91264Zro.LJ((BaseDspItemReusedAssem) iDqS421S0100000_29.l0);
    }

    public static final Object invoke$70(IDqS421S0100000_29 iDqS421S0100000_29) {
        return new C46420IJs(((Number) ((C91202Zqo) iDqS421S0100000_29.l0).LIZ.getValue()).intValue());
    }

    public static final Object invoke$71(IDqS421S0100000_29 iDqS421S0100000_29) {
        ArrayList LJII;
        if (C91211Zqx.LIZ() == 0) {
            LJII = C47261Igj.LJII(C91203Zqp.LIZIZ());
        } else {
            LJII = C47261Igj.LJII(C91203Zqp.LIZ(), C91203Zqp.LIZIZ());
        }
        ((IXTabPanelAbility) iDqS421S0100000_29.l0).Da(LJII);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$72(IDqS421S0100000_29 iDqS421S0100000_29) {
        IXTabPanelAbility iXTabPanelAbility;
        if (C91266Zrq.LIZ((IXTabPanelAbility) iDqS421S0100000_29.l0) && (iXTabPanelAbility = (IXTabPanelAbility) iDqS421S0100000_29.l0) != null) {
            iXTabPanelAbility.hidePanel();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$73(IDqS421S0100000_29 iDqS421S0100000_29) {
        View contentView = (View) iDqS421S0100000_29.l0;
        o.LJIIIIZZ(contentView, "contentView");
        ASQ.LIZLLL(contentView, ASY.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$74(IDqS421S0100000_29 iDqS421S0100000_29) {
        return new IDBReceiverS12S0100000_29((C91502Zve) iDqS421S0100000_29.l0, 0);
    }

    public static final Object invoke$75(IDqS421S0100000_29 iDqS421S0100000_29) {
        return new ComponentName(((C91502Zve) iDqS421S0100000_29.l0).LJLIL, (Class<?>) MediaSessionService.class);
    }

    public static final Object invoke$77(IDqS421S0100000_29 iDqS421S0100000_29) {
        return new IDBReceiverS12S0100000_29((C91443Zuh) iDqS421S0100000_29.l0, 1);
    }

    public static final Object invoke$78(IDqS421S0100000_29 iDqS421S0100000_29) {
        C91506Zvi c91506Zvi = (C91506Zvi) iDqS421S0100000_29.l0;
        c91506Zvi.LJJIIZI(0);
        c91506Zvi.LJJIIZI(1);
        c91506Zvi.LJJIIZI(2);
        c91506Zvi.LJJIIZ(0);
        c91506Zvi.LJJIIZ(1);
        c91506Zvi.LJJIIZ(2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$79(IDqS421S0100000_29 iDqS421S0100000_29) {
        ((BasePlayerFragment) iDqS421S0100000_29.l0).Il(new C91453Zur(false, null, 7));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS421S0100000_29 iDqS421S0100000_29) {
        BaseDspItemReusedAssem baseDspItemReusedAssem = (BaseDspItemReusedAssem) iDqS421S0100000_29.l0;
        o.LJIIIZ(baseDspItemReusedAssem, "<this>");
        return C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(baseDspItemReusedAssem), IViewPagerAbility.class, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$80(IDqS421S0100000_29 iDqS421S0100000_29) {
        C91246ZrW c91246ZrW = (C91246ZrW) ((C68322mC) iDqS421S0100000_29.l0).element;
        if (c91246ZrW != null && !c91246ZrW.LIZJ) {
            C91249ZrZ.LIZLLL(c91246ZrW.LIZ, c91246ZrW.LIZIZ, "close");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$81(IDqS421S0100000_29 iDqS421S0100000_29) {
        MutableLiveData mutableLiveData = C61447O9r.LJIILLIIL;
        UpsellLandingPageSlotAssem upsellLandingPageSlotAssem = (UpsellLandingPageSlotAssem) iDqS421S0100000_29.l0;
        mutableLiveData.observe(upsellLandingPageSlotAssem, new IDObserverS226S0100000_29(upsellLandingPageSlotAssem, 25));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$82(IDqS421S0100000_29 iDqS421S0100000_29) {
        ((UpsellLandingPageSlotAssem) iDqS421S0100000_29.l0).q4().gv0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$83(IDqS421S0100000_29 iDqS421S0100000_29) {
        return ((UpsellLandingPageSlotAssem) iDqS421S0100000_29.l0).LLIIJLIL;
    }

    public static final Object invoke$84(IDqS421S0100000_29 iDqS421S0100000_29) {
        return Boolean.valueOf(((UpsellLandingPageSlotAssem) iDqS421S0100000_29.l0).n4());
    }

    public static final Object invoke$9(IDqS421S0100000_29 iDqS421S0100000_29) {
        return C91264Zro.LIZIZ((BaseDspSlotReusedAssem) iDqS421S0100000_29.l0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS421S0100000_29(C68322mC c68322mC, C68322mC<C91246ZrW> c68322mC2) {
        super(0);
        this.$t = c68322mC2;
        this.l0 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(InterfaceC65350Pko interfaceC65350Pko, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC65350Pko;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(C91061ZoX c91061ZoX, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91061ZoX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(C91202Zqo c91202Zqo, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91202Zqo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(C91330Zss c91330Zss, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91330Zss;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(C91392Zts c91392Zts, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91392Zts;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(C91393Ztt c91393Ztt, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91393Ztt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(C91437Zub c91437Zub, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91437Zub;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(C91443Zuh c91443Zuh, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91443Zuh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(C91488ZvQ c91488ZvQ, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91488ZvQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(C91489ZvR c91489ZvR, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91489ZvR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(C91502Zve c91502Zve, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91502Zve;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(C91506Zvi c91506Zvi, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91506Zvi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(C91576Zwq c91576Zwq, int i) {
        super(0);
        this.$t = i;
        this.l0 = c91576Zwq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(BaseDspItemReusedAssem baseDspItemReusedAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseDspItemReusedAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(BaseDspSlotReusedAssem baseDspSlotReusedAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseDspSlotReusedAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(NewDspPlayerService newDspPlayerService, int i) {
        super(0);
        this.$t = i;
        this.l0 = newDspPlayerService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(BasePlayerFragment basePlayerFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = basePlayerFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(UpsellLandingPageSlotAssem upsellLandingPageSlotAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = upsellLandingPageSlotAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(MDAudioQueueAssem mDAudioQueueAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = mDAudioQueueAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(MDAudioQueueFragment mDAudioQueueFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = mDAudioQueueFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(MDAudioQueueViewModel mDAudioQueueViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = mDAudioQueueViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(AudioInfoAssem audioInfoAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = audioInfoAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(PlayFullSongAssem playFullSongAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = playFullSongAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(AudioSeekBarAssem audioSeekBarAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = audioSeekBarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(MDQueueAssem mDQueueAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = mDQueueAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(MDQueueFragment mDQueueFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = mDQueueFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(MDQueueViewModel mDQueueViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = mDQueueViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(DspViewPagerAssem dspViewPagerAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = dspViewPagerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(MusicDspUGCButtonAssem musicDspUGCButtonAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = musicDspUGCButtonAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(MusicDspUGCButtonTrigger musicDspUGCButtonTrigger, int i) {
        super(0);
        this.$t = i;
        this.l0 = musicDspUGCButtonTrigger;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(TTDspFragmentV2 tTDspFragmentV2, int i) {
        super(0);
        this.$t = i;
        this.l0 = tTDspFragmentV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS421S0100000_29(IXTabPanelAbility iXTabPanelAbility, int i) {
        super(0);
        this.$t = i;
        this.l0 = iXTabPanelAbility;
    }
}
