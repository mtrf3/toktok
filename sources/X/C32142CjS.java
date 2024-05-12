package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.CjS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32142CjS {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C32143CjT.LJLIL);

    public static final boolean LIZ(DataChannel dataChannel) {
        C62822Ol8 c62822Ol8 = LIZ;
        if (!((IGiftService) c62822Ol8.getValue()).isGiftSuspended(dataChannel) && !((IGiftService) c62822Ol8.getValue()).isNewsAccount(dataChannel)) {
            return true;
        }
        return false;
    }
}
