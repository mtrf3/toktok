package X;

import android.content.Context;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CMK {
    public CML LIZ;
    public InterfaceC30436Bx2 LIZIZ;

    public CMK(Context context, DataChannel dataChannel) {
        ISlotService iSlotService;
        IGiftService iGiftService;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        if (this.LIZ == null && (iGiftService = (IGiftService) CN1.LIZ(IGiftService.class)) != null) {
            this.LIZ = iGiftService.createGiftDebugService(context, dataChannel);
        }
        if (this.LIZIZ == null && (iSlotService = (ISlotService) CN1.LIZ(ISlotService.class)) != null) {
            this.LIZIZ = iSlotService.createGiftDebugService(context, dataChannel);
        }
    }
}
