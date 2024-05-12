package ql1;

import X.AbstractC60811Ntn;
import X.B4M;
import X.C0D5;
import X.C0K2;
import X.C0NB;
import X.C113554cx;
import X.C16880lQ;
import X.C1S;
import X.C29518BiE;
import X.C31563Ca7;
import X.C31976Cgm;
import X.C32146CjW;
import X.C40187Fpv;
import X.C60704Ns4;
import X.C6J;
import X.C73943T0h;
import X.CN1;
import X.CYS;
import X.EnumC39924Flg;
import X.InterfaceC60710NsA;
import X.InterfaceC60761Nsz;
import X.X1D;
import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.android.live.CustomPollVisibleChannel;
import com.bytedance.android.live.browser.IHybridPerformanceService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.GiftLimitNotificationEvent;
import com.bytedance.android.live.gift.IGiftReminderService;
import com.bytedance.android.livesdk.PaidRoomChannel;
import com.bytedance.android.livesdk.broadcast.LiveBroadcastEndFragment;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.StreamPlayerControlMethod;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerDonationDialog;
import com.bytedance.android.livesdk.chatroom.viewmodule.BroadcastPreviewBannerWidget;
import com.bytedance.android.livesdk.dataChannel.UserLevelDetailPageClose;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget;
import com.bytedance.android.livesdk.impl.revenue.subscription.SubscribeService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizAudioFixSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizContainerOptSetting;
import com.bytedance.android.livesdk.quiz.ActQuizWidget;
import com.bytedance.android.livesdk.rank.api.OnlineAudienceRankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public class IDbS495S0100000_5 extends AbstractC60811Ntn {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz interfaceC60761Nsz, String str) {
        switch (this.$t) {
            case 4:
                LJJJJ$0(this, interfaceC60761Nsz, str);
                return;
            default:
                super.LJJJJ(interfaceC60761Nsz, str);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz interfaceC60761Nsz, String str, String str2) {
        switch (this.$t) {
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJJJJI$0(this, interfaceC60761Nsz, str, str2);
                return;
            case 12:
                LJJJJI$1(this, interfaceC60761Nsz, str, str2);
                return;
            default:
                super.LJJJJI(interfaceC60761Nsz, str, str2);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz interfaceC60761Nsz, String str, C60704Ns4 c60704Ns4) {
        switch (this.$t) {
            case 0:
                LJJJJIZL$0(this, interfaceC60761Nsz, str, c60704Ns4);
                return;
            case 5:
                LJJJJIZL$1(this, interfaceC60761Nsz, str, c60704Ns4);
                return;
            case 7:
                LJJJJIZL$2(this, interfaceC60761Nsz, str, c60704Ns4);
                return;
            default:
                super.LJJJJIZL(interfaceC60761Nsz, str, c60704Ns4);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz interfaceC60761Nsz) {
        switch (this.$t) {
            case 0:
                LJJJJJ$0(this, interfaceC60761Nsz);
                return;
            case 3:
                LJJJJJ$1(this, interfaceC60761Nsz);
                return;
            case 5:
                LJJJJJ$2(this, interfaceC60761Nsz);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJJJJJ$3(this, interfaceC60761Nsz);
                return;
            case 12:
                LJJJJJ$4(this, interfaceC60761Nsz);
                return;
            case 14:
                LJJJJJ$5(this, interfaceC60761Nsz);
                return;
            default:
                super.LJJJJJ(interfaceC60761Nsz);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz interfaceC60761Nsz, String str) {
        switch (this.$t) {
            case 0:
                LJJJJJL$0(this, interfaceC60761Nsz, str);
                return;
            case 3:
                LJJJJJL$1(this, interfaceC60761Nsz, str);
                return;
            case 5:
                LJJJJJL$2(this, interfaceC60761Nsz, str);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJJJJJL$3(this, interfaceC60761Nsz, str);
                return;
            case 12:
                LJJJJJL$4(this, interfaceC60761Nsz, str);
                return;
            default:
                super.LJJJJJL(interfaceC60761Nsz, str);
                return;
        }
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJJZI(SparkContext sparkContext) {
        switch (this.$t) {
            case 1:
                LJJJJZI$0(this, sparkContext);
                return;
            case 2:
            case 3:
            case 5:
            case 6:
            default:
                super.LJJJJZI(sparkContext);
                return;
            case 4:
                LJJJJZI$1(this, sparkContext);
                return;
            case 7:
                LJJJJZI$2(this, sparkContext);
                return;
        }
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJLIIL(SparkContext sparkContext) {
        switch (this.$t) {
            case 1:
                LJJJLIIL$0(this, sparkContext);
                return;
            case 2:
                LJJJLIIL$1(this, sparkContext);
                return;
            case 4:
                LJJJLIIL$2(this, sparkContext);
                return;
            case 7:
                LJJJLIIL$3(this, sparkContext);
                return;
            case 15:
                LJJJLIIL$4(this, sparkContext);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LJJJLIIL$5(this, sparkContext);
                return;
            default:
                super.LJJJLIIL(sparkContext);
                return;
        }
    }

    @Override // X.AbstractC60800Ntc
    public final void LJJJLZIJ(SparkContext sparkContext, C0D5 c0d5) {
        switch (this.$t) {
            case 5:
                LJJJLZIJ$0(this, sparkContext, c0d5);
                return;
            default:
                super.LJJJLZIJ(sparkContext, c0d5);
                return;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        switch (this.$t) {
            case 6:
                onDestroy$0(this);
                return;
            case 7:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case 12:
            default:
                super.onDestroy();
                return;
            case 8:
                onDestroy$1(this);
                return;
            case 9:
                onDestroy$2(this);
                return;
            case 10:
                onDestroy$3(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onDestroy$4(this);
                return;
        }
    }

    public static final void onDestroy$0(IDbS495S0100000_5 iDbS495S0100000_5) {
        ((DataChannel) iDbS495S0100000_5.l0).rv0(PaidRoomChannel.class, new B4M());
    }

    public static final void onDestroy$1(IDbS495S0100000_5 iDbS495S0100000_5) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGoodyBagDialogDismiss,datachannel==>");
        LIZ.append(((GoodyBagWidget) iDbS495S0100000_5.l0).dataChannel);
        C0NB.LIZIZ("GoodyBagWidget", X1D.LIZIZ(LIZ));
        ((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).Pc0(3);
        DataChannel dataChannel = ((GoodyBagWidget) iDbS495S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GiftLimitNotificationEvent.class, Boolean.valueOf(((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).zc0()));
        }
    }

    public static final void onDestroy$2(IDbS495S0100000_5 iDbS495S0100000_5) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGoodyBagDialogDismiss,datachannel==>");
        LIZ.append(((GoodyBagWidget) iDbS495S0100000_5.l0).dataChannel);
        C0NB.LIZIZ("GoodyBagWidget", X1D.LIZIZ(LIZ));
        ((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).Pc0(3);
        DataChannel dataChannel = ((GoodyBagWidget) iDbS495S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GiftLimitNotificationEvent.class, Boolean.valueOf(((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).zc0()));
        }
    }

    public static final void onDestroy$3(IDbS495S0100000_5 iDbS495S0100000_5) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGoodyBagDialogDismiss,datachannel==>");
        LIZ.append(((GoodyBagWidget) iDbS495S0100000_5.l0).dataChannel);
        C0NB.LIZIZ("GoodyBagWidget", X1D.LIZIZ(LIZ));
        ((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).Pc0(3);
        DataChannel dataChannel = ((GoodyBagWidget) iDbS495S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GiftLimitNotificationEvent.class, Boolean.valueOf(((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).zc0()));
        }
    }

    public static final void onDestroy$4(IDbS495S0100000_5 iDbS495S0100000_5) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRedEnvelopeDialogDismiss,datachannel==>");
        LIZ.append(((RedEnvelopeWidget) iDbS495S0100000_5.l0).dataChannel);
        C0NB.LIZIZ("RedEnvelopeWidget", X1D.LIZIZ(LIZ));
        ((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).Pc0(3);
        DataChannel dataChannel = ((RedEnvelopeWidget) iDbS495S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(GiftLimitNotificationEvent.class, Boolean.valueOf(((IGiftReminderService) CN1.LIZ(IGiftReminderService.class)).zc0()));
        }
    }

    public IDbS495S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJJJJ$0(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        LiveBroadcastEndFragment liveBroadcastEndFragment = (LiveBroadcastEndFragment) iDbS495S0100000_5.l0;
        if (liveBroadcastEndFragment.LJLJJI > -1) {
            liveBroadcastEndFragment.LJLJJL = System.currentTimeMillis();
            LiveBroadcastEndFragment liveBroadcastEndFragment2 = (LiveBroadcastEndFragment) iDbS495S0100000_5.l0;
            C0K2.LJIIIZ(0, liveBroadcastEndFragment2.LJLJJL - liveBroadcastEndFragment2.LJLJJI, "ttlive_anchor_finish_page_load_duration");
            ((LiveBroadcastEndFragment) iDbS495S0100000_5.l0).LJLJJI = -1L;
            C0K2.LJIIIZ(0, 0L, "ttlive_anchor_finish_page_load_status_all");
        }
        C1S.LIZIZ(1, ((LiveBroadcastEndFragment) iDbS495S0100000_5.l0).LJLLJ);
    }

    public static final void LJJJJJ$1(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view) {
        WebView webView;
        LiveIconView liveIconView;
        int i;
        o.LJIIIZ(view, "view");
        LiveStickerDonationDialog liveStickerDonationDialog = (LiveStickerDonationDialog) iDbS495S0100000_5.l0;
        liveStickerDonationDialog.getClass();
        View LIZJ = view.LIZJ();
        if (!(LIZJ instanceof WebView) || (webView = (WebView) LIZJ) == null) {
            return;
        }
        String url = webView.getUrl();
        String str = "";
        if (url == null) {
            url = "";
        }
        View view2 = liveStickerDonationDialog.LJLJL;
        int i2 = 8;
        if (view2 != null && liveStickerDonationDialog.LJLILLLLZI != null) {
            if (liveStickerDonationDialog.LJLJJI) {
                i = 0;
            } else {
                i = 8;
            }
            view2.setVisibility(i);
        }
        LiveIconView liveIconView2 = liveStickerDonationDialog.LJLJLJ;
        if (liveIconView2 == null) {
            return;
        }
        if (liveStickerDonationDialog.LJLJJL || webView.canGoBack()) {
            i2 = 0;
        }
        liveIconView2.setVisibility(i2);
        if (!TextUtils.isEmpty(url)) {
            str = UriProtector.parse(url).getPath();
        }
        if (liveStickerDonationDialog.getContext() != null && (liveIconView = liveStickerDonationDialog.LJLJLJ) != null) {
            liveIconView.setIconAttr(R.attr.asm);
        }
        if (str != null && s.LJJJLZIJ(str, "/donate/complete", false)) {
            LiveIconView liveIconView3 = liveStickerDonationDialog.LJLJLJ;
            if (liveIconView3 == null) {
                return;
            }
            C16880lQ.LJJII(liveIconView3, new ACListenerS25S0100000_5(liveStickerDonationDialog, 132));
            return;
        }
        LiveIconView liveIconView4 = liveStickerDonationDialog.LJLJLJ;
        if (liveIconView4 == null) {
            return;
        }
        C16880lQ.LJJII(liveIconView4, new ACListenerS40S0200000_5(liveStickerDonationDialog, webView, 14));
    }

    public static final void LJJJJJ$2(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C0NB.LJIIIZ("EOYQuiz", "spark container onLoadFinish");
    }

    public static final void LJJJJJ$3(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        ((BroadcastPreviewBannerWidget) iDbS495S0100000_5.l0).LLFFF(view);
        C6J c6j = C6J.LIZ;
        C6J.LIZIZ().LJIIJ = System.currentTimeMillis();
        c6j.LJFF();
    }

    public static final void LJJJJJ$4(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        ((BroadcastPreviewBannerWidget) iDbS495S0100000_5.l0).LLFFF(view);
        C6J c6j = C6J.LIZ;
        C6J.LIZIZ().LJIIJ = System.currentTimeMillis();
        c6j.LJFF();
    }

    public static final void LJJJJJ$5(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view) {
        EnumC39924Flg enumC39924Flg;
        o.LJIIIZ(view, "view");
        C40187Fpv LIZ = C31976Cgm.LIZ();
        InterfaceC60761Nsz LJI = ((SparkContext) iDbS495S0100000_5.l0).LJI();
        SparkContext sparkContext = (SparkContext) iDbS495S0100000_5.l0;
        String str = sparkContext.url;
        InterfaceC60710NsA interfaceC60710NsA = sparkContext.hybridParams;
        if (interfaceC60710NsA != null) {
            enumC39924Flg = interfaceC60710NsA.getType();
        } else {
            enumC39924Flg = null;
        }
        LIZ.LIZIZ(LJI, str, enumC39924Flg, 2);
    }

    public static final void LJJJJZI$0(IDbS495S0100000_5 iDbS495S0100000_5, SparkContext sparkContext) {
        DataChannel dataChannel = (DataChannel) iDbS495S0100000_5.l0;
        if (dataChannel != null) {
            dataChannel.rv0(CustomPollVisibleChannel.class, Boolean.TRUE);
        }
    }

    public static final void LJJJJZI$1(IDbS495S0100000_5 iDbS495S0100000_5, SparkContext sparkContext) {
        ((SubscribeService) iDbS495S0100000_5.l0).LJLIL = true;
    }

    public static final void LJJJJZI$2(IDbS495S0100000_5 iDbS495S0100000_5, SparkContext sparkContext) {
        DataChannel dataChannel = ((OnlineAudienceRankWidget) iDbS495S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(OnlineAudienceRankListDialogVisibilityChannel.class, Boolean.TRUE);
        }
        C73943T0h.LIZ().LIZIZ(new CYS(true));
    }

    public static final void LJJJLIIL$0(IDbS495S0100000_5 iDbS495S0100000_5, SparkContext sparkContext) {
        DataChannel dataChannel = (DataChannel) iDbS495S0100000_5.l0;
        if (dataChannel != null) {
            dataChannel.rv0(CustomPollVisibleChannel.class, Boolean.FALSE);
        }
    }

    public static final void LJJJLIIL$1(IDbS495S0100000_5 iDbS495S0100000_5, SparkContext sparkContext) {
        ((StreamPlayerControlMethod) iDbS495S0100000_5.l0).onBridgeRelease();
    }

    public static final void LJJJLIIL$2(IDbS495S0100000_5 iDbS495S0100000_5, SparkContext sparkContext) {
        ((SubscribeService) iDbS495S0100000_5.l0).LJLIL = false;
    }

    public static final void LJJJLIIL$3(IDbS495S0100000_5 iDbS495S0100000_5, SparkContext sparkContext) {
        DataChannel dataChannel = ((OnlineAudienceRankWidget) iDbS495S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(OnlineAudienceRankListDialogVisibilityChannel.class, Boolean.FALSE);
        }
        C73943T0h.LIZ().LIZIZ(new CYS(false));
        if (RankOptimizeSetting.INSTANCE.getValue()) {
            ((OnlineAudienceRankWidget) iDbS495S0100000_5.l0).LLII = null;
        }
    }

    public static final void LJJJLIIL$4(IDbS495S0100000_5 iDbS495S0100000_5, SparkContext sparkContext) {
        DataChannel datachannel = ((C31563Ca7) iDbS495S0100000_5.l0).getDatachannel();
        if (datachannel != null) {
            C32146CjW.LIZJ(datachannel, "close_special_badge_page", null);
        }
    }

    public static final void LJJJLIIL$5(IDbS495S0100000_5 iDbS495S0100000_5, SparkContext sparkContext) {
        ((C29518BiE) iDbS495S0100000_5.l0).LIZ.LJIIIIZZ.pv0(UserLevelDetailPageClose.class);
    }

    public static final void LJJJJ$0(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJ(view, url);
        ((SubscribeService) iDbS495S0100000_5.l0).LJLIL = false;
    }

    public static final void LJJJJJL$0(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        LiveBroadcastEndFragment liveBroadcastEndFragment = (LiveBroadcastEndFragment) iDbS495S0100000_5.l0;
        liveBroadcastEndFragment.getClass();
        liveBroadcastEndFragment.LJLJJI = System.currentTimeMillis();
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        if (valueOf != null) {
            valueOf.longValue();
            C1S.LIZIZ = valueOf.longValue();
        }
    }

    public static final void LJJJJJL$1(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
    }

    public static final void LJJJJJL$2(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        C0NB.LJIIIZ("EOYQuiz", "spark container onLoadStart");
    }

    public static final void LJJJJJL$3(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        C6J.LIZIZ().LJIIIZ = System.currentTimeMillis();
    }

    public static final void LJJJJJL$4(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        C6J.LIZIZ().LJIIIZ = System.currentTimeMillis();
    }

    public static final void LJJJLZIJ$0(IDbS495S0100000_5 iDbS495S0100000_5, SparkContext sparkContext, C0D5 c0d5) {
        if (LiveQuizAudioFixSetting.INSTANCE.getValue() && !LiveQuizContainerOptSetting.INSTANCE.getValue().downgrade && c0d5.LIZ == 0) {
            ActQuizWidget actQuizWidget = (ActQuizWidget) iDbS495S0100000_5.l0;
            if (!actQuizWidget.LJLJLJ) {
                actQuizWidget.LJLJLJ = true;
                ((IHybridPerformanceService) CN1.LIZ(IHybridPerformanceService.class)).xY();
                C0K2.LJII(3, "ttlive_eoy_quiz_opt_monitor", C113554cx.LJJLIIIJLLLLLLLZ(new LinkedHashMap()));
                C0NB.LJIIIZ("EOYQuiz", "quiz card preload invalid");
            }
        }
    }

    public static final void LJJJJI$0(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        C6J c6j = C6J.LIZ;
        C6J.LIZIZ().LJIIJ = System.currentTimeMillis();
        c6j.LJ(str);
    }

    public static final void LJJJJI$1(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        C6J c6j = C6J.LIZ;
        C6J.LIZIZ().LJIIJ = System.currentTimeMillis();
        c6j.LJ(str);
    }

    public static final void LJJJJIZL$0(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        ImageView imageView = (ImageView) ((LiveBroadcastEndFragment) iDbS495S0100000_5.l0)._$_findCachedViewById(R.id.af0);
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        C0K2.LJIIIZ(1, 0L, "ttlive_anchor_finish_page_load_status_all");
        C1S.LIZIZ(0, ((LiveBroadcastEndFragment) iDbS495S0100000_5.l0).LJLLJ);
    }

    public static final void LJJJJIZL$1(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        C0NB.LJIIIZ("EOYQuiz", "spark container onLoadFailed");
    }

    public static final void LJJJJIZL$2(IDbS495S0100000_5 iDbS495S0100000_5, InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJIZL(view, url, c60704Ns4);
        C73943T0h.LIZ().LIZIZ(new CYS(false));
    }
}
