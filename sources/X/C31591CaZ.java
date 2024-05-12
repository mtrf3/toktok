package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.util.Comparator;

/* renamed from: X.CaZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31591CaZ<T> implements Comparator {
    public static final C31591CaZ<T> LJLIL = new C31591CaZ<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        GiftMessage giftMessage = (GiftMessage) obj;
        GiftMessage giftMessage2 = (GiftMessage) obj2;
        int i = giftMessage.mGift.diamondCount;
        int i2 = giftMessage2.mGift.diamondCount;
        if (i != i2) {
            return i2 - i;
        }
        int i3 = giftMessage.comboCount;
        int i4 = giftMessage2.comboCount;
        if (i3 != i4) {
            return i3 - i4;
        }
        return (int) (giftMessage.receiveTime - giftMessage2.receiveTime);
    }
}
