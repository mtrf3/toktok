package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import java.util.Iterator;

/* renamed from: X.CjP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32139CjP<T> implements InterfaceC64592gB {
    public static final C32139CjP<T> LJLIL = new C32139CjP<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        java.util.Map map = (java.util.Map) obj;
        if (map == null || map.isEmpty()) {
            return;
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            GiftListResult giftListResult = (GiftListResult) map.get(Integer.valueOf(intValue));
            if (giftListResult != null) {
                GiftManager.inst().cacheGiftListToMap(giftListResult, intValue);
            }
        }
        GiftManager.inst().updateGiftsInfo(GiftManager.inst().getGiftListResult(), 0L);
    }
}
