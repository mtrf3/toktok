package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.FreqLimitGiftOption;
import com.bytedance.android.livesdk.model.Gift;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.Cox, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32483Cox {
    public static boolean LIZ(Gift gift, long j) {
        C32470Cok c32470Cok;
        FreqLimitGiftOption freqLimitOption;
        int i;
        if (gift == null || !gift.canPutInGiftBox) {
            return false;
        }
        long j2 = gift.id;
        HashMap<Long, C32470Cok> hashMap = GiftManager.inst().freqLimitInfoList;
        if (hashMap != null && (c32470Cok = hashMap.get(Long.valueOf(j2))) != null && (freqLimitOption = GiftManager.inst().getFreqLimitOption(Long.valueOf(j2))) != null) {
            if (!c32470Cok.LIZIZ) {
                i = c32470Cok.LIZ;
            } else {
                Integer num = (Integer) ((LinkedHashMap) c32470Cok.LIZJ).get(Long.valueOf(j));
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = c32470Cok.LIZ;
                }
            }
            if (i <= 0 && freqLimitOption.refreshTimeStamp > System.currentTimeMillis() / 1000) {
                return false;
            }
        }
        return true;
    }
}
