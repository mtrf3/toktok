package com.bytedance.android.live.banner;

import X.AbstractC73672Svk;
import X.C05120Ia;
import X.C1EW;
import X.C6J;
import X.C73422Sri;
import X.C73849Syb;
import X.C73933Szx;
import X.C73969T1h;
import X.CN1;
import X.EnumC31509CYf;
import X.InterfaceC29856Bng;
import X.InterfaceC64592gB;
import X.Q7L;
import android.os.SystemClock;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.banner.InRoomBannerManager;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.model.message.InRoomBannerRefreshMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.message.IMessageService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class InRoomBannerManager implements GenericLifecycleObserver, OnMessageListener {
    public static WeakReference<LifecycleOwner> LJLILLLLZI;
    public static boolean LJLJJI;
    public static final InRoomBannerManager LJLIL = new InRoomBannerManager();
    public static long LJLJI = -1;
    public static C73849Syb<C05120Ia> LJLJJL = new C73849Syb<>();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        IMessageManager iMessageManager = ((IMessageService) CN1.LIZ(IMessageService.class)).get(LJLJI);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.IN_ROOM_BANNER_REFRESH_MESSAGE.getIntType(), this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        IMessageManager iMessageManager = ((IMessageService) CN1.LIZ(IMessageService.class)).get(LJLJI);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        WeakReference<LifecycleOwner> weakReference = LJLILLLLZI;
        if (weakReference != null && (lifecycleOwner = weakReference.get()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        LJLILLLLZI = null;
        LJLJI = -1L;
        LJLJJI = false;
        LJLJJL = new C73849Syb<>();
    }

    public static void LIZ(long j) {
        AbstractC73672Svk LJJIJIL;
        LifecycleOwner lifecycleOwner;
        if (j > 0) {
            LJJIJIL = AbstractC73672Svk.LJJIJIL(1).LJIIL(j, TimeUnit.SECONDS);
        } else {
            LJJIJIL = AbstractC73672Svk.LJJIJIL(1);
        }
        C73422Sri LJIJJLI = LJJIJIL.LJJJ(C73969T1h.LIZIZ()).LJJL(C73969T1h.LIZIZ()).LJIJJLI(new InterfaceC64592gB() { // from class: X.1Fn
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                InRoomBannerManager inRoomBannerManager = InRoomBannerManager.LJLIL;
                long j2 = InRoomBannerManager.LJLJI;
                boolean z = InRoomBannerManager.LJLJJI;
                inRoomBannerManager.getClass();
                InRoomBannerManager.LIZIZ(j2, z);
            }
        });
        WeakReference<LifecycleOwner> weakReference = LJLILLLLZI;
        if (weakReference != null) {
            lifecycleOwner = weakReference.get();
        } else {
            lifecycleOwner = null;
        }
        ((InterfaceC29856Bng) LJIJJLI.LIZJ(C73933Szx.LJ(lifecycleOwner))).LIZ();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        if (iMessage != null && iMessage.getIntType() == EnumC31509CYf.IN_ROOM_BANNER_REFRESH_MESSAGE.getIntType() && (iMessage instanceof InRoomBannerRefreshMessage)) {
            InRoomBannerRefreshMessage inRoomBannerRefreshMessage = (InRoomBannerRefreshMessage) iMessage;
            if (inRoomBannerRefreshMessage.delaySeconds > 0) {
                IBannerService iBannerService = (IBannerService) CN1.LIZ(IBannerService.class);
                CommonMessageData commonMessageData = inRoomBannerRefreshMessage.baseMessage;
                if (commonMessageData != null) {
                    j = commonMessageData.roomId;
                } else {
                    j = 0;
                }
                if (!iBannerService.yj0(j)) {
                    return;
                }
                LIZ(new Random().nextInt(inRoomBannerRefreshMessage.delaySeconds));
            }
        }
    }

    public static void LIZIZ(final long j, final boolean z) {
        int i;
        LifecycleOwner lifecycleOwner;
        C6J.LIZIZ().LJFF = System.currentTimeMillis();
        BannerRetrofitApi bannerRetrofitApi = (BannerRetrofitApi) Q7L.LIZIZ(BannerRetrofitApi.class);
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        AbstractC73672Svk LIZ = C1EW.LIZ(bannerRetrofitApi.queryLiveRoomBanner(j, i));
        WeakReference<LifecycleOwner> weakReference = LJLILLLLZI;
        if (weakReference != null) {
            lifecycleOwner = weakReference.get();
        } else {
            lifecycleOwner = null;
        }
        ((InterfaceC29856Bng) LIZ.LIZJ(C73933Szx.LJ(lifecycleOwner))).LIZJ(new InterfaceC64592gB() { // from class: X.1Fo
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                long j2 = j;
                boolean z2 = z;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("room_id", Long.valueOf(j2));
                linkedHashMap.put("is_anchor", Integer.valueOf(z2 ? 1 : 0));
                linkedHashMap.put("duration", Long.valueOf(CA3.LIZIZ(CA3.LIZJ, elapsedRealtime)));
                CA3.LJFF(0, "req_success", linkedHashMap);
                CA3.LIZJ = -1L;
                C6J.LIZIZ().LJI = System.currentTimeMillis();
                C73849Syb<C05120Ia> c73849Syb = InRoomBannerManager.LJLJJL;
                long j3 = j;
                T t = ((BaseResponse) obj).data;
                o.LJIIIIZZ(t, "response.data");
                c73849Syb.onNext(new C05120Ia(j3, (BannerInRoomCollection) t));
            }
        }, new InterfaceC64592gB() { // from class: X.1Fp
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C6J c6j = C6J.LIZ;
                C6J.LIZIZ().LJI = System.currentTimeMillis();
                String message = ((Throwable) obj).getMessage();
                C6M LIZIZ = C6J.LIZIZ();
                long LIZ2 = C6J.LIZ(LIZIZ.LJFF, LIZIZ.LJI);
                HashMap hashMap = new HashMap(LIZIZ.LIZIZ());
                hashMap.put("duration", Long.valueOf(LIZ2));
                if (message == null) {
                    message = "unknown";
                }
                hashMap.put("error_message", message);
                C6J.LIZJ(c6j, "banner_data_filtered", 1, hashMap);
                CA3.LJFF(1, "req_failed", new LinkedHashMap());
            }
        });
    }
}
