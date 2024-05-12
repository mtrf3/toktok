package X;

import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;

/* renamed from: X.Ao3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27331Ao3 {
    public static long LIZ(CountDownStickerStruct countDownStickerStruct) {
        long j = 0;
        if (countDownStickerStruct != null && countDownStickerStruct.getMillSecond() - System.currentTimeMillis() > 0) {
            if (countDownStickerStruct != null) {
                j = countDownStickerStruct.getMillSecond() - System.currentTimeMillis();
            }
            return j / 1000;
        }
        return -1L;
    }
}
