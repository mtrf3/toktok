package X;

import android.content.SharedPreferences;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.model.GiftInfoInBox;
import com.bytedance.android.livesdk.model.GiftsBoxInfoForSend;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.ClY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32272ClY {
    public static final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.NONE, C32273ClZ.LJLIL);

    public static SharedPreferences LIZIZ() {
        if (C31160CKu.LIZLLL()) {
            SharedPreferences sharedPreferences = (SharedPreferences) LIZ.getValue();
            o.LJIIIIZZ(sharedPreferences, "{\n            sharedPref\n        }");
            return sharedPreferences;
        }
        SharedPreferences LIZIZ = F9J.LIZIZ(C15380j0.LIZLLL(), 0, "gift_dialog_color_storage");
        o.LJIIIIZZ(LIZIZ, "{\n            ResUtil.ge…t.MODE_PRIVATE)\n        }");
        return LIZIZ;
    }

    public static long LIZ(Long l) {
        return LIZIZ().getLong(String.valueOf(l), -1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.3mF] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.LinkedHashMap, java.util.HashMap] */
    public static void LIZJ(SendGiftResult result, GiftsBoxInfoForSend giftsBoxInfoForSend, long j, boolean z) {
        ?? LJJIIZI;
        List<GiftInfoInBox> list;
        o.LJIIIZ(result, "result");
        SharedPreferences.Editor edit = LIZIZ().edit();
        if (z) {
            if (giftsBoxInfoForSend != null && (list = giftsBoxInfoForSend.gifts) != null) {
                int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
                if (LJJIIZ < 16) {
                    LJJIIZ = 16;
                }
                LJJIIZI = new LinkedHashMap(LJJIIZ);
                for (GiftInfoInBox giftInfoInBox : list) {
                    OSZ osz = new OSZ(Long.valueOf(giftInfoInBox.giftId), Long.valueOf(giftInfoInBox.colorId));
                    LJJIIZI.put(osz.getFirst(), osz.getSecond());
                }
            } else {
                LJJIIZI = C113554cx.LJJJLIIL();
            }
        } else {
            LJJIIZI = C51029K0z.LJJIIZI(new OSZ(Long.valueOf(result.mGiftId), Long.valueOf(j)));
        }
        for (Map.Entry entry : LJJIIZI.entrySet()) {
            edit.putLong(String.valueOf(((Number) entry.getKey()).longValue()), ((Number) entry.getValue()).longValue());
        }
        edit.apply();
    }
}
