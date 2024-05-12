package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.BlU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29720BlU {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(boolean z, Room room) {
        User owner;
        IFansClubService iFansClubService;
        User owner2;
        IFansClubService iFansClubService2;
        if (z) {
            if (room == null || (owner2 = room.getOwner()) == null || owner2.fansClubInfo == null || (iFansClubService2 = (IFansClubService) CN1.LIZ(IFansClubService.class)) == null || !iFansClubService2.Wg0()) {
                return false;
            }
            return true;
        }
        if (room == null || (owner = room.getOwner()) == null || owner.fansClubInfo == null || (iFansClubService = (IFansClubService) CN1.LIZ(IFansClubService.class)) == null || !iFansClubService.Vb0()) {
            return false;
        }
        return true;
    }
}
