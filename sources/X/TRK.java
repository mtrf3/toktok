package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;

/* loaded from: classes14.dex */
public final class TRK {
    public static int LIZIZ(long j) {
        int i = (int) (j & 3);
        if (i == 1) {
            return 1;
        }
        if (i != 2) {
            return i != 3 ? 0 : 3;
        }
        return 2;
    }

    public static MultiGuestDataHolder LIZ() {
        try {
            return (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        } catch (Throwable unused) {
            return null;
        }
    }
}
