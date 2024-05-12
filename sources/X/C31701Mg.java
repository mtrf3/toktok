package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.model.LogParams;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.1Mg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31701Mg implements InterfaceC08100Tm {
    public static final C31701Mg LIZ = new C31701Mg();
    public static LogParams LIZIZ;
    public static LogParams LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        long j = 0;
        int i2 = 1023;
        LIZIZ = new LogParams(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0, i, j, i2, 0 == true ? 1 : 0);
        LIZJ = new LogParams(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0, i, j, i2, 0 == true ? 1 : 0);
    }

    public static BZI LIZ(DataChannel dataChannel, String str) {
        BZI LIZ2 = C28787BRn.LIZ(str);
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(LIZIZ.entrance, "entrance");
        LIZ2.LJIJJ(String.valueOf(LIZIZ.isFirstGuide), "is_first_guide");
        LIZ2.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getConnectionType(), "connection_type");
        LIZ2.LJIJJ(LIZIZ.settingStatus, "setting_status");
        return LIZ2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZJ(DataChannel dataChannel, boolean z) {
        String json;
        if (C29306Beo.LJJI() || LIZIZ.backgroundPos == 0) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_stream_goal_background_use_time");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(LIZIZ.streamGoalId, "stream_goal_id");
        LIZ2.LJIJJ(Integer.valueOf((int) (C30725C4b.LIZ() - LIZIZ.startTime)), "duration");
        LIZ2.LJIJJ(LIZIZ.isAdjust, "is_adjust");
        LIZ2.LJIJJ(InterfaceC30442Bx8.i2.LIZJ(), "background_pos");
        LIZ2.LJJIIJZLJL();
        if (z) {
            C48459J0d<m> c48459J0d = InterfaceC30442Bx8.h2;
            LogParams logParams = LIZIZ;
            m mVar = null;
            if (logParams != null && (json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, logParams)) != null) {
                mVar = OUP.LJJJLL(json);
            }
            c48459J0d.LIZ(mVar);
        }
        int i = 0;
        long j = 0;
        int i2 = 1023;
        LIZJ = new LogParams(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0, i, j, i2, 0 == true ? 1 : 0);
        LIZIZ = new LogParams(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0, i, j, i2, 0 == true ? 1 : 0);
    }

    public static void LIZIZ(int i, DataChannel dataChannel, String conflictFunction) {
        o.LJIIIZ(conflictFunction, "conflictFunction");
        BZI LIZ2 = LIZ(dataChannel, "livesdk_stream_goal_background_sticker_confirm_click");
        LIZ2.LJIJJ(Integer.valueOf(i), "is_confirm");
        LIZ2.LJIJJ(conflictFunction, "conflict_function");
        LIZ2.LJJIIJZLJL();
    }
}
