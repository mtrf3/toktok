package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.encouragepublish.config.NearbyEncouragePublishCardShowInterval;

/* renamed from: X.KzZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53525KzZ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        boolean z = true;
        if (C52229Kef.LIZ() <= 0) {
            return false;
        }
        NearbyEncouragePublishCardShowInterval.LIZ.getClass();
        int i = NearbyEncouragePublishCardShowInterval.LIZ().maxCount;
        Keva keva = LJ6.LIZ;
        int i2 = keva.getInt(LIZIZ("nearby_encourage_publish_card_show_counts"), 0);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("maxCount=");
        LIZ2.append(i);
        LIZ2.append(" ; count=");
        LIZ2.append(i2);
        L8O.LIZ(X1D.LIZIZ(LIZ2));
        if (i2 >= i) {
            return false;
        }
        int i3 = NearbyEncouragePublishCardShowInterval.LIZ().intervalWithUserInteract;
        int i4 = NearbyEncouragePublishCardShowInterval.LIZ().intervalWithoutUserInteract;
        boolean z2 = keva.getBoolean(LIZIZ("nearby_encourage_publish_card_user_operated"), false);
        long j = keva.getLong(LIZIZ("nearby_encourage_publish_card_show_time"), 0L);
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("hasOperated:");
        LIZ3.append(z2);
        L8O.LIZ(X1D.LIZIZ(LIZ3));
        long j2 = currentTimeMillis - j;
        if (!z2 ? j2 <= i4 * 1000 : j2 <= i3 * 1000) {
            z = false;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("canShowEncouragePublishCard:");
        LIZ4.append(z);
        L8O.LIZ(X1D.LIZIZ(LIZ4));
        return z;
    }

    public static String LIZIZ(String str) {
        return C00F.LIZIZ(((RBX) HG3.LJIILL()).getCurUserId(), '_', str);
    }
}
