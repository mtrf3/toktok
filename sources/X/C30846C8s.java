package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.api.revenue.subscription.api.SubscribeApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* renamed from: X.C8s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30846C8s {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static GetSubPrivilegeDetailResponse.Data LIZLLL;
    public static C94 LJ;
    public static final List<InterfaceC30853C8z> LJFF = new ArrayList();

    public static void LIZ(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        LIZ = true;
        Iterator it = ((ArrayList) LJFF).iterator();
        while (it.hasNext()) {
            ((InterfaceC30853C8z) it.next()).S5(throwable);
        }
    }

    public static void LIZIZ(GetSubPrivilegeDetailResponse.Data data) {
        LIZ = true;
        LIZJ = false;
        LIZLLL = data;
        Iterator it = ((ArrayList) LJFF).iterator();
        while (it.hasNext()) {
            ((InterfaceC30853C8z) it.next()).x8(data);
        }
    }

    public static void LIZJ(Room room, String str) {
        String str2;
        if (room == null) {
            return;
        }
        if (!LIZIZ) {
            C94 c94 = LJ;
            if (c94 != null) {
                c94.LJIILJJIL();
                return;
            }
            return;
        }
        if (!LIZ) {
            return;
        }
        if (LIZLLL != null && !LIZJ) {
            return;
        }
        LIZ = false;
        SubscribeApi subscribeApi = (SubscribeApi) Q7L.LIZIZ(SubscribeApi.class);
        String valueOf = String.valueOf(room.getId());
        User owner = room.getOwner();
        if (owner == null || (str2 = owner.getSecUid()) == null) {
            str2 = "";
        }
        C30929CBx.LJIIJJI(C1EW.LIZ(subscribeApi.getSubPrivilegeDetailSpecific(valueOf, str2, 5)), EnumC30931CBz.PRIVILEGE, str, C30843C8p.LJLIL).LJJJLIIL(C30849C8v.LJLIL, C30851C8x.LJLIL);
    }
}
