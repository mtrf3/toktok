package X;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.android.live.slot.ISlotService;

/* renamed from: X.Cd7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31749Cd7 implements InterfaceC31752CdA {
    public static final void LIZIZ(A76 a76) {
        ISlotService iSlotService = (ISlotService) CN1.LIZ(ISlotService.class);
        if (iSlotService == null) {
            return;
        }
        if (!iSlotService.isBizTypeRegistered(a76.LIZ())) {
            iSlotService.registerSlot(a76);
            return;
        }
        throw new IllegalStateException("The bizType can not register to LiveSlot twice!");
    }

    public static final Rect LIZ(Context context, EnumC30736C4m enumC30736C4m) {
        ISlotService iSlotService = (ISlotService) CN1.LIZ(ISlotService.class);
        if (iSlotService == null) {
            return null;
        }
        return iSlotService.getIconSlotLocation(context, enumC30736C4m);
    }
}
