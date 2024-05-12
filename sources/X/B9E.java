package X;

import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.livesdk.dataChannel.AudienceShowOrientationBeginTime;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class B9E {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(DataChannel dataChannel, boolean z) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_user_comment_horizon_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_click");
        UFE.LIZIZ(!C30149BsP.LIZ() ? 1 : 0, LIZ2, "is_open");
    }

    public static final void LIZIZ(int i, DataChannel dataChannel) {
        if (!C30149BsP.LIZ()) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_user_comment_horizon_show");
            LIZ2.LJIILLIIL(dataChannel);
            LIZ2.LJIJJ(Integer.valueOf(i), "is_default_show");
            LIZ2.LJJIIJZLJL();
        }
    }

    public static final void LIZJ(DataChannel dataChannel, int i, int i2, String str) {
        long j;
        long currentTimeMillis;
        o.LJIIIZ(dataChannel, "dataChannel");
        Long l = (Long) dataChannel.kv0(BCN.class);
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = (Long) dataChannel.kv0(AudienceShowOrientationBeginTime.class);
        if (l2 != null) {
            currentTimeMillis = l2.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        IDefinitionService iDefinitionService = (IDefinitionService) CN1.LIZ(IDefinitionService.class);
        if (iDefinitionService != null) {
            iDefinitionService.Hu(i, currentTimeMillis, String.valueOf(j), i2, str);
        }
        dataChannel.rv0(AudienceShowOrientationBeginTime.class, Long.valueOf(System.currentTimeMillis()));
    }
}
