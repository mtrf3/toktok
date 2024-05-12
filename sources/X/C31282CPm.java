package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.livesetting.gift.SuppressGiftTextMessagesSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* renamed from: X.CPm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31282CPm implements InterfaceC31330CRi<GiftMessage> {
    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(GiftMessage giftMessage, CQQ context) {
        Room room;
        GiftMessage message = giftMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(context, "context");
        Gift findGiftById = ((IGiftService) CN1.LIZ(IGiftService.class)).findGiftById(message.giftId);
        if (findGiftById == null) {
            findGiftById = message.mGift;
        }
        if (findGiftById != null) {
            if (findGiftById.combo && message.repeatEnd == 0) {
                CR3.LIZIZ(message, "GiftMessage discarded because it's not the end message for the repeated gifts.");
                return true;
            }
            if (findGiftById.type == 11) {
                CR3.LIZIZ(message, "GiftMessage discarded because it's type is game.");
                return true;
            }
        }
        if (SuppressGiftTextMessagesSetting.INSTANCE.getValue() && (room = context.LJI) != null && room.giftMessageStyle == 1) {
            return true;
        }
        return false;
    }
}
