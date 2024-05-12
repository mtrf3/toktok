package X;

import android.os.SystemClock;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessHasLoggedRoundEndChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessInGameRoundChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessInGameSessionChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundCountChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionStartTimeChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.0GA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0GA {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(DataChannel dataChannel) {
        RoomAuthStatus roomAuthStatus;
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel);
        if (LJJIJLIJ != null && (roomAuthStatus = LJJIJLIJ.getRoomAuthStatus()) != null && roomAuthStatus.pictionarypermission > 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(DataChannel dataChannel) {
        Boolean bool;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(DrawGuessFreelyStartChannel.class);
        } else {
            bool = null;
        }
        return C29306Beo.LJJIFFI(bool);
    }

    public static void LIZJ(DataChannel dataChannel) {
        long j;
        String str;
        int i;
        Long l = (Long) dataChannel.kv0(DrawGuessSessionIdChannel.class);
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_pictionary_end");
        LIZ2.LJIIZILJ();
        if (LIZIZ(dataChannel)) {
            str = "freely";
        } else {
            str = "draw_and_guess";
        }
        C06530Nl.LIZLLL(LIZ2, str, "type", j, "pictionary_session_id");
        Integer num = (Integer) dataChannel.kv0(DrawGuessRoundCountChannel.class);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        LIZ2.LJIJJ(Integer.valueOf(i), "number_cnt");
        LIZ2.LJIJJ("live_end", "end_reason");
        long uptimeMillis = SystemClock.uptimeMillis();
        Long l2 = (Long) dataChannel.kv0(DrawGuessSessionStartTimeChannel.class);
        if (l2 != null) {
            j2 = l2.longValue();
        }
        C28289B8j.LIZJ(uptimeMillis, j2, LIZ2, "duration");
    }

    public static void LIZLLL(DataChannel dataChannel, boolean z) {
        if (dataChannel == null) {
            return;
        }
        if (C29306Beo.LJJIFFI((Boolean) dataChannel.kv0(DrawGuessInGameSessionChannel.class))) {
            Boolean bool = Boolean.FALSE;
            dataChannel.rv0(DrawGuessInGameSessionChannel.class, bool);
            if (C29306Beo.LJJIFFI((Boolean) dataChannel.kv0(DrawGuessInGameRoundChannel.class)) || C29306Beo.LJIILLIIL((Boolean) dataChannel.kv0(DrawGuessHasLoggedRoundEndChannel.class))) {
                dataChannel.rv0(DrawGuessHasLoggedRoundEndChannel.class, Boolean.TRUE);
                dataChannel.rv0(DrawGuessInGameRoundChannel.class, bool);
                ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).uw(dataChannel, z);
            }
            ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).am0(dataChannel, z);
            return;
        }
        if (!LIZIZ(dataChannel)) {
            return;
        }
        ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).am0(dataChannel, z);
    }
}
