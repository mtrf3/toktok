package X;

import android.content.Context;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CMM {
    public CML LIZ;

    public CMM(Context context, DataChannel dataChannel) {
        IGiftService iGiftService;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        if (this.LIZ == null && (iGiftService = (IGiftService) CN1.LIZ(IGiftService.class)) != null) {
            this.LIZ = iGiftService.createGiftDebugService(context, dataChannel);
        }
    }
}
