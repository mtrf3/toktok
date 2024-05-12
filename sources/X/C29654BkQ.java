package X;

import com.bytedance.android.livesdk.impl.revenue.subscription.widget.SubscribeTimeStickerWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.BkQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29654BkQ extends TBS implements InterfaceC88472Yns<C29652BkO, C76800UCe> {
    public C29654BkQ(Object obj) {
        super(1, obj, SubscribeTimeStickerWidget.class, "updateValidArea", "updateValidArea(Lcom/bytedance/android/livesdk/chatroom/event/StickerValidAreaEvent;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C29652BkO c29652BkO) {
        C29652BkO p0 = c29652BkO;
        o.LJIIIZ(p0, "p0");
        SubscribeTimeStickerWidget subscribeTimeStickerWidget = (SubscribeTimeStickerWidget) this.receiver;
        if (subscribeTimeStickerWidget.isViewValid() && subscribeTimeStickerWidget.context != null && C29306Beo.LJIJI()) {
            int max = Math.max((KL2.LJIIIZ(subscribeTimeStickerWidget.context) - p0.LIZ) - subscribeTimeStickerWidget.context.getResources().getDimensionPixelSize(R.dimen.a9g), ((int) KL2.LIZJ(subscribeTimeStickerWidget.context, 130.0f)) + ((int) KL2.LIZJ(subscribeTimeStickerWidget.context, 148.0f)));
            int[] iArr = subscribeTimeStickerWidget.LJZI;
            if (max != iArr[1]) {
                iArr[1] = max;
                C29674Bkk c29674Bkk = subscribeTimeStickerWidget.LJZ;
                if (c29674Bkk != null) {
                    c29674Bkk.LJJZZIII(iArr);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
