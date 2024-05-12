package X;

import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.BkR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29655BkR extends TBS implements InterfaceC88472Yns<C32208CkW, C76800UCe> {
    public C29655BkR(Object obj) {
        super(1, obj, SubscribeTimeStickerWidget.class, "onLinkStateChanged", "onLinkStateChanged(Lcom/bytedance/android/livesdk/chatroom/event/LinkCrossRoomEvent;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C32208CkW c32208CkW) {
        C32208CkW p0 = c32208CkW;
        o.LJIIIZ(p0, "p0");
        SubscribeTimeStickerWidget subscribeTimeStickerWidget = (SubscribeTimeStickerWidget) this.receiver;
        subscribeTimeStickerWidget.getClass();
        int i = p0.LIZ;
        if (i != 0) {
            if (i == 1) {
                subscribeTimeStickerWidget.LJZI = subscribeTimeStickerWidget.LJZL;
            }
            return C76800UCe.LIZ;
        }
        subscribeTimeStickerWidget.LJZI[1] = B5G.LIZIZ().LJIL + B5G.LIZIZ().LJIJJLI;
        C29674Bkk c29674Bkk = subscribeTimeStickerWidget.LJZ;
        if (c29674Bkk != null) {
            c29674Bkk.LJJZZIII(subscribeTimeStickerWidget.LJZI);
        }
        return C76800UCe.LIZ;
    }
}
