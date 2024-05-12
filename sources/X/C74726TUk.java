package X;

import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicAudienceMultiGuestReservationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.TUk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74726TUk {
    public static C73411SrX LIZ;
    public static long LIZIZ = -1;

    public static final boolean LIZ() {
        if (LiveAbLabelSetting.INSTANCE.getIntValue("linkmic_anchor_co_host_multi_guest_reservation") == 1 && !((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt()) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ() {
        Integer LIZIZ2 = U4C.LIZIZ("linkmic_anchor_co_host_multi_guest_reservation");
        if (LIZIZ2 == null || LIZIZ2.intValue() != 1 || !LinkmicAudienceMultiGuestReservationSetting.INSTANCE.isReserve() || ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(boolean z) {
        if (z) {
            if (LIZ()) {
                Boolean LIZJ = InterfaceC30442Bx8.LLJJIJIIJIL.LIZJ();
                o.LJIIIIZZ(LIZJ, "ANCHOR_SHOULD_OPEN_GUEST_LINKMIC_WHEN_START.value");
                if (LIZJ.booleanValue()) {
                    return true;
                }
            }
        } else if (LIZIZ() && LIZIZ == 10003) {
            return true;
        }
        return false;
    }
}
