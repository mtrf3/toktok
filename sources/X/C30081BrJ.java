package X;

import android.widget.FrameLayout;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidgetV2;
import com.bytedance.android.livesdk.chatroom.viewmodule.FullVideoButtonWidgetV2;
import com.bytedance.android.livesdk.chatroom.widget.DefinitionSelectionWidget;
import com.bytedance.android.livesdk.chatroom.widget.LiveTopShareWidget;
import com.bytedance.android.livesdk.chatroom.widget.LockScreenWidget;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnablePublicScreenP0;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableRecycleWidgetV4;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetPoolSize;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.IRecyclableWidget;
import com.bytedance.ies.sdk.widgets.IWidgetProvider;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetPriorityProvider;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BrJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30081BrJ {
    public static boolean LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ() {
        Class<? extends IPublicScreenHolderWidget> pq;
        if (LiveEnableRecycleWidgetV4.INSTANCE.isDisable() || LIZ) {
            return;
        }
        LIZ = true;
        HashMap hashMap = new HashMap(32);
        LiveWidgetPriorityProvider.Priority priority = LiveWidgetPriorityProvider.Priority.P0;
        Iterator<Class<? extends IRecyclableWidget>> it = ((IWatchLiveService) CN1.LIZ(IWatchLiveService.class)).RK().iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), priority);
        }
        LiveWidgetPriorityProvider.Priority priority2 = LiveWidgetPriorityProvider.Priority.P1;
        if (LiveEnablePublicScreenP0.INSTANCE.isDisable() && (pq = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).pq(true)) != null) {
            hashMap.put(pq, priority2);
        }
        Class<? extends LiveRecyclableWidget> it2 = ((ISlotService) CN1.LIZ(ISlotService.class)).getFrameSlotWidget();
        o.LJIIIIZZ(it2, "it");
        hashMap.put(it2, priority2);
        List<Class<? extends LiveRecyclableWidget>> oS = ((IBarrageService) CN1.LIZ(IBarrageService.class)).oS();
        o.LJIIIIZZ(oS, "getService(IBarrageServi…rovideLikeWidgetClasses()");
        for (Class<? extends LiveRecyclableWidget> it3 : oS) {
            o.LJIIIIZZ(it3, "it");
            hashMap.put(it3, priority2);
        }
        Class<? extends LiveRecyclableWidget> frameL2SlotWidget = ((ISlotService) CN1.LIZ(ISlotService.class)).getFrameL2SlotWidget();
        if (frameL2SlotWidget != null) {
            hashMap.put(frameL2SlotWidget, priority2);
        }
        Class<? extends LiveRecyclableWidget> B40 = ((IRankService) CN1.LIZ(IRankService.class)).B40();
        if (B40 != null) {
            hashMap.put(B40, priority2);
        }
        hashMap.put(FullVideoButtonWidgetV2.class, priority2);
        Class<? extends LiveRecyclableWidget> de0 = ((ICommentService) CN1.LIZ(ICommentService.class)).de0();
        if (de0 != null) {
            hashMap.put(de0, priority2);
        }
        Class<? extends LiveRecyclableWidget> UA = ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).UA();
        if (UA != null) {
            hashMap.put(UA, priority2);
        }
        Class<? extends LiveRecyclableWidget> YS = ((IBannerService) CN1.LIZ(IBannerService.class)).YS(false);
        if (YS != null) {
            hashMap.put(YS, priority2);
        }
        Class<? extends LiveRecyclableWidget> ow = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).ow();
        if (ow != null) {
            hashMap.put(ow, priority2);
        }
        Class<? extends LiveRecyclableWidget> Xf0 = ((ITreasureBoxService) CN1.LIZ(ITreasureBoxService.class)).Xf0();
        if (Xf0 != null) {
            hashMap.put(Xf0, priority2);
        }
        Class<? extends LiveRecyclableWidget> Sm0 = ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).Sm0();
        if (Sm0 != null) {
            hashMap.put(Sm0, priority2);
        }
        Class<? extends LiveRecyclableWidget> pc = ((IBannerService) CN1.LIZ(IBannerService.class)).pc();
        if (pc != null) {
            hashMap.put(pc, priority2);
        }
        Class<? extends LiveRecyclableWidget> frameEcBarrageSlotWidget = ((ISlotService) CN1.LIZ(ISlotService.class)).getFrameEcBarrageSlotWidget();
        if (frameEcBarrageSlotWidget != null) {
            hashMap.put(frameEcBarrageSlotWidget, priority2);
        }
        Class<? extends LiveRecyclableWidget> liveGiftTrayWidgetV2Class = ((IGiftService) CN1.LIZ(IGiftService.class)).getLiveGiftTrayWidgetV2Class();
        if (liveGiftTrayWidgetV2Class != null) {
            hashMap.put(liveGiftTrayWidgetV2Class, priority2);
        }
        Class<? extends LiveRecyclableWidget> giftWidget = ((IGiftService) CN1.LIZ(IGiftService.class)).getGiftWidget();
        if (giftWidget != null) {
            hashMap.put(giftWidget, priority2);
        }
        hashMap.put(LiveTopShareWidget.class, priority2);
        Class<? extends LiveRecyclableWidget> kj = ((IRankService) CN1.LIZ(IRankService.class)).kj(false);
        if (kj != null) {
            hashMap.put(kj, priority2);
        }
        Class<? extends LiveRecyclableWidget> zN = ((IToolbarService) CN1.LIZ(IToolbarService.class)).zN(false);
        if (zN != null) {
            hashMap.put(zN, priority2);
        }
        Class<? extends LiveRecyclableWidget> tB = ((IShortTouchService) CN1.LIZ(IShortTouchService.class)).tB();
        if (tB != null) {
            hashMap.put(tB, priority2);
        }
        Class<? extends IPublicScreenHolderWidget> pq2 = ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).pq(false);
        if (pq2 != null) {
            hashMap.put(pq2, priority2);
        }
        hashMap.put(LockScreenWidget.class, priority2);
        hashMap.put(DefinitionSelectionWidget.class, priority2);
        hashMap.put(EndWidgetV2.class, priority2);
        Class<? extends LiveRecyclableWidget> kj2 = ((IRankService) CN1.LIZ(IRankService.class)).kj(true);
        if (kj2 != null) {
            hashMap.put(kj2, priority2);
        }
        LiveWidgetPriorityProvider.Companion.getInstance().initPriorityPool(LiveRecycleWidgetPoolSize.INSTANCE.getSize(), hashMap);
    }

    public static void LIZIZ(C81246Vuc c81246Vuc, Class cls, FrameLayout frameLayout) {
        LiveRecyclableWidget liveRecyclableWidget;
        LiveWidgetProviderProxy.Companion companion = LiveWidgetProviderProxy.Companion;
        IWidgetProvider companion2 = companion.getInstance();
        o.LJII(cls, "null cannot be cast to non-null type java.lang.Class<com.bytedance.ies.sdk.widgets.IRecyclableWidget>");
        if (companion2.hasMarked(cls)) {
            return;
        }
        IRecyclableWidget provide = companion.getInstance().provide(cls);
        if (provide instanceof LiveRecyclableWidget) {
            liveRecyclableWidget = (LiveRecyclableWidget) provide;
            if (liveRecyclableWidget != null) {
                liveRecyclableWidget.dataChannel = new DataChannel();
                if (Integer.valueOf(liveRecyclableWidget.getLayoutId()) != null && (liveRecyclableWidget == null || liveRecyclableWidget.getLayoutId() != 0)) {
                    c81246Vuc.LIZIZ(liveRecyclableWidget.getLayoutId(), frameLayout, 0, new C30082BrK(frameLayout, liveRecyclableWidget));
                    return;
                }
            }
        } else {
            liveRecyclableWidget = null;
        }
        companion.getInstance().recycleRecyclableWidget(liveRecyclableWidget);
    }
}
