package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;

/* loaded from: classes6.dex */
public final class B82 {
    public static void LIZIZ(EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig enterRoomConfig2;
        BJE bje;
        EnterRoomLinkSession LIZ = B57.LIZ.LIZ();
        if (LIZ != null && (enterRoomConfig2 = LIZ.mEnterRoomConfig) != null && enterRoomConfig2.mRoomsData.fromNewStyle) {
            long j = enterRoomConfig.mRoomsData.smallPictureOrder;
            if (j != -1) {
                Long valueOf = Long.valueOf(j);
                C28246B6s LIZIZ = BJN.LIZIZ();
                if (LIZIZ == null || (bje = LIZIZ.LJ) == null) {
                    return;
                }
                bje.LIZLLL = valueOf;
            }
        }
    }

    public static String LIZ(String str, String str2) {
        if (!C38354F3m.LJ(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("&");
            LIZ.append(str2);
            LIZ.append("=[^&]*");
            return str.replaceAll(X1D.LIZIZ(LIZ), "");
        }
        return str;
    }
}
