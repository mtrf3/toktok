package X;

import android.content.Context;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CMh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31199CMh {
    public final DataChannel LIZ;
    public C37946Eus LIZIZ;

    public C31199CMh(Context context, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = dataChannel;
        C221108m2.LIZIZ(C31197CMf.LJLIL);
        C221108m2.LIZIZ(C31198CMg.LJLIL);
        C221108m2.LIZIZ(new AqS155S0100000_5(this, 444));
        if (this.LIZIZ == null) {
            this.LIZIZ = ((IRankService) CN1.LIZ(IRankService.class)).Co0(context, dataChannel);
        }
    }
}
