package com.bytedance.android.livesdk.init;

import X.AbstractC31208CMq;
import X.B4I;
import X.C0NB;
import X.C15610jN;
import X.C16880lQ;
import X.C30882CAc;
import X.C38995FSd;
import X.C65814PsI;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC30950CCs;
import X.O5Z;
import X.Q7L;
import X.X1D;
import Y.ARunnableS0S0001000_5;
import Y.ARunnableS12S0000000_5;
import Y.ARunnableS1S0001000_6;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.init.BadPhonesCommonOptTask;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveBannerDegradeSettings;
import com.bytedance.android.livesdk.livesetting.performance.degrade.ViewAutoPreloadOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableSlideEnterRoomOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableSlideVideoLastFrameSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveClickEnterDelayShowLoadingTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterDelayShowLoadingTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveUseSurfaceViewExperiment;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

@InterfaceC30950CCs
/* loaded from: classes6.dex */
public class BadPhonesCommonOptTask extends AbstractC31208CMq {
    @Override // X.AbstractC31208CMq
    public String getTaskName() {
        return "bad_phones_common_opt_task";
    }

    public static void lambda$preCacheWebView$6() {
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        C30882CAc Lu = ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu();
        Lu.getClass();
        if (LiveBannerDegradeSettings.INSTANCE.enableRecycleWebview() && ((ArrayList) Lu.LIZJ.LIZ(O5Z.class).LIZ).isEmpty()) {
            try {
                O5Z o5z = new O5Z(new MutableContextWrapper(context));
                ((ArrayList) Lu.LIZLLL).add(new WeakReference(o5z));
                Lu.LIZJ.LIZIZ(o5z);
            } catch (Throwable th) {
                C0NB.LJII(th);
            }
        }
    }

    public static /* synthetic */ void lambda$preloadConfigs$3() {
        InterfaceC30442Bx8.LLJJJJLIIL.LIZJ();
        EnableSlideVideoLastFrameSetting.INSTANCE.getValue();
        EnableSlideEnterRoomOptSetting.INSTANCE.getValue();
        LiveEnterDelayShowLoadingTimeSetting.INSTANCE.getValue();
        LiveClickEnterDelayShowLoadingTimeSetting.INSTANCE.getValue();
        LiveUseSurfaceViewExperiment.INSTANCE.isEnable();
        LiveMultiPlayerEnableSetting.INSTANCE.getValue();
    }

    public static /* synthetic */ void lambda$preloadLiveResource$5() {
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).U();
        ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).h60();
    }

    public static /* synthetic */ boolean lambda$preloadWatchWidgets$0() {
        try {
            B4I.LIZIZ("widget_v4", "preloadWatchWidgets->addIdleHandler");
            ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).nT(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context());
            return false;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("preloadWatchWidgets->addIdleHandler-crash");
            LIZ.append(th.getMessage());
            B4I.LIZIZ("widget_v4", X1D.LIZIZ(LIZ));
            return false;
        }
    }

    public static /* synthetic */ void lambda$preloadWatchWidgets$2() {
        B4I.LIZIZ("widget_v4", "preloadWatchWidgets");
        if (!((IHostSetting) CN1.LIZ(IHostSetting.class)).db()) {
            B4I.LIZIZ("widget_v4", "preloadWatchWidgets->LiveEnablePreloadRecycleWidget.INSTANCE.isDisable()");
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS0S0001000_5(1, 1));
        }
    }

    private void preCacheWebView() {
        if (LiveBannerDegradeSettings.INSTANCE.enableRecycleWebview()) {
            C15610jN.LIZ().postDelayed(new ARunnableS1S0001000_6(0, 26), 10000L);
        }
    }

    private void preloadLiveResource() {
        if (ViewAutoPreloadOptSetting.INSTANCE.getEnable()) {
            C15610jN.LIZ().postDelayed(new ARunnableS0S0001000_5(0, 6), 10000L);
        }
    }

    public static /* synthetic */ void lambda$preloadRetrofitApi$4() {
        C65814PsI LIZ = C65814PsI.LIZ();
        FeedApi feedApi = (FeedApi) Q7L.LIZIZ(FeedApi.class);
        feedApi.feed("", new HashMap());
        feedApi.feed("", 0L, "", new HashMap());
        feedApi.feed("", 0L, "", 0L, 0L, 0L, new HashMap());
        feedApi.feed("", 0L, "", "", 0L, 0L, 0L, new HashMap());
        feedApi.feed("", 0L, "", "", "", "", 0L, 0L, new HashMap());
        LIZ.getClass();
        RoomRetrofitApi roomRetrofitApi = (RoomRetrofitApi) C65814PsI.LIZJ(RoomRetrofitApi.class);
        roomRetrofitApi.enterRoom(0L, 0L, 0L, new HashMap<>(0));
        roomRetrofitApi.fetchRoom(new HashMap<>(0));
        roomRetrofitApi.sendPlayingPing(0L, 0);
        ((IRankService) CN1.LIZ(IRankService.class)).W0();
        ((IWalletService) CN1.LIZ(IWalletService.class)).preloadApApi();
        ((IGiftService) CN1.LIZ(IGiftService.class)).preloadBroadcastApi();
        ((IBarrageService) CN1.LIZ(IBarrageService.class)).W0();
    }

    public static /* synthetic */ void lambda$preloadWatchWidgets$1() {
        C16880lQ.LJLI(Looper.myQueue(), new MessageQueue.IdleHandler() { // from class: X.BLu
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return BadPhonesCommonOptTask.lambda$preloadWatchWidgets$0();
            }
        });
    }

    private void preloadConfigs() {
        C38995FSd.LIZIZ().submit(new ARunnableS12S0000000_5(3));
    }

    private void preloadRetrofitApi() {
        C38995FSd.LIZIZ().submit(new ARunnableS1S0001000_6(0, 25));
    }

    private void preloadWatchWidgets() {
        C38995FSd.LIZIZ().submit(new ARunnableS12S0000000_5(2));
    }

    @Override // X.AbstractC31208CMq
    public void run() {
        preloadRetrofitApi();
        preloadLiveResource();
        preCacheWebView();
        preloadConfigs();
        preloadWatchWidgets();
    }
}
