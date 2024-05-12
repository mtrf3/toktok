package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveRemoveLimitationForExtendedScreenSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.C6p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30791C6p {
    public static final boolean LIZ(Room room) {
        if ((room != null && room.getCommerceStruct() != null && room.getCommerceStruct().commercePermission == 0) || LiveRemoveLimitationForExtendedScreenSetting.INSTANCE.removeLimitation()) {
            return true;
        }
        return false;
    }
}
