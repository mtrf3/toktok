package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterEducationSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.UDd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76825UDd {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(GiftGuideMessage giftGuideMessage) {
        o.LJIIIZ(giftGuideMessage, "<this>");
        return o.LJ(giftGuideMessage.guideType, EnumC76826UDe.GIFT_GUIDE_POPUP_EDUCATION.getValue());
    }

    public static boolean LIZIZ(GiftGuideMessage giftGuideMessage) {
        LiveGiftNewGifterEducationSetting.NewGifterConfig value;
        o.LJIIIZ(giftGuideMessage, "<this>");
        if (!o.LJ(giftGuideMessage.guideType, "gift_guide_popup") || giftGuideMessage.hasSent) {
            return false;
        }
        EnumC76827UDf.Companion.getClass();
        LiveGiftNewGifterEducationSetting liveGiftNewGifterEducationSetting = LiveGiftNewGifterEducationSetting.INSTANCE;
        LiveGiftNewGifterEducationSetting.NewGifterConfig value2 = liveGiftNewGifterEducationSetting.getValue();
        if ((value2 == null || value2.giftGuidePopupStyle != EnumC76827UDf.GROUP_1.getValue()) && ((value = liveGiftNewGifterEducationSetting.getValue()) == null || value.giftGuidePopupStyle != EnumC76827UDf.GROUP_2.getValue())) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Gift gift) {
        if (gift != null && (gift.type == 1 || gift.type == 5 || gift.type == 10)) {
            return false;
        }
        return true;
    }
}
