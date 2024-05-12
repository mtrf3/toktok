package X;

import android.os.SystemClock;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCorrectsRoundsChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundCountChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartTimeChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionStartTimeChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BAI {
    public static String LIZ = "start";

    public static void LIZ(BZI bzi) {
        boolean z;
        String str;
        String str2;
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        if (iInteractService.Yu0() > 0) {
            z = true;
        } else {
            z = false;
        }
        bzi.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_guest_connection");
        if (iInteractService.Zs0()) {
            str = "grid";
        } else if (iInteractService.gr0()) {
            str = "floating";
        } else {
            str = "normal_floating";
        }
        bzi.LJIJJ(str, "layout_setting");
        if (iInteractService.VY()) {
            str2 = "fixed";
        } else if (iInteractService.Vc()) {
            str2 = "unfixed";
        } else {
            str2 = "not_existed";
        }
        bzi.LJIJJ(str2, "window_setting");
    }

    public static Long LJIIL(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Long) dataChannel.kv0(DrawGuessRoundIdChannel.class);
        }
        return null;
    }

    public static void LIZIZ(BZI bzi, DataChannel dataChannel) {
        Object obj;
        bzi.LJIILLIIL(dataChannel);
        if (dataChannel != null) {
            obj = dataChannel.kv0(DrawGuessSessionIdChannel.class);
        } else {
            obj = null;
        }
        bzi.LJIJJ(obj, "pictionary_session_id");
        bzi.LJIJJ(LJIIL(dataChannel), "pictionary_id");
    }

    public static void LIZJ(DataChannel dataChannel, String str) {
        long j;
        Long l;
        if (dataChannel != null && (l = (Long) dataChannel.kv0(DrawGuessRoundIdChannel.class)) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_pictionary_mode_exit_popup_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Long.valueOf(j), "pictionary_id");
        LIZ2.LJIJJ(str, "selection");
        LIZ2.LJJIIJZLJL();
    }

    public static void LIZLLL(DataChannel dataChannel, String endReason) {
        Long l;
        int i;
        long j;
        Long l2;
        Integer num;
        o.LJIIIZ(endReason, "endReason");
        if (dataChannel != null && (l = (Long) dataChannel.kv0(DrawGuessSessionIdChannel.class)) != null) {
            long longValue = l.longValue();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_pictionary_end");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(Long.valueOf(longValue), "pictionary_session_id");
            if (dataChannel != null && (num = (Integer) dataChannel.kv0(DrawGuessRoundCountChannel.class)) != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            LIZ2.LJIJJ(Integer.valueOf(i), "number_cnt");
            LIZ2.LJIJJ(endReason, "end_reason");
            LIZ(LIZ2);
            LJIIJJI(LIZ2, dataChannel);
            long uptimeMillis = SystemClock.uptimeMillis();
            if (dataChannel != null && (l2 = (Long) dataChannel.kv0(DrawGuessSessionStartTimeChannel.class)) != null) {
                j = l2.longValue();
            } else {
                j = 0;
            }
            C28289B8j.LIZJ(uptimeMillis, j, LIZ2, "duration");
        }
    }

    public static void LJ(DataChannel dataChannel, boolean z) {
        long j;
        Object obj;
        int i;
        String str;
        HashMap hashMap;
        Integer num;
        Long l;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (dataChannel != null && (l = (Long) dataChannel.kv0(DrawGuessSessionStartTimeChannel.class)) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = uptimeMillis - j;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_audience_pictionary_end");
        LIZ2.LJIILLIIL(dataChannel);
        if (dataChannel != null) {
            obj = dataChannel.kv0(DrawGuessSessionIdChannel.class);
        } else {
            obj = null;
        }
        LIZ2.LJIJJ(obj, "pictionary_session_id");
        LIZ(LIZ2);
        LJIIJJI(LIZ2, dataChannel);
        LIZ2.LJIJJ(Long.valueOf(Math.min(j2, 120000L)), "duration");
        LIZ2.LJIJJ(Long.valueOf(Math.min(j2, 120000L)), "time");
        int i2 = 0;
        if (dataChannel != null && (num = (Integer) dataChannel.kv0(DrawGuessRoundCountChannel.class)) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        LIZ2.LJIJJ(Integer.valueOf(i), "number_cnt");
        if (dataChannel != null && (hashMap = (HashMap) dataChannel.kv0(DrawGuessCorrectsRoundsChannel.class)) != null) {
            i2 = hashMap.size();
        }
        LIZ2.LJIJJ(Integer.valueOf(i2), "correct_cnt");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str, "before_end");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIJJI(BZI bzi, DataChannel dataChannel) {
        String str;
        if (C0GA.LIZIZ(dataChannel)) {
            str = "freely";
        } else {
            str = "draw_and_guess";
        }
        bzi.LJIJJ(str, "type");
    }

    public static void LJFF(DataChannel dataChannel, DrawGuessWord drawGuessWord, String enterFrom) {
        Long l;
        o.LJIIIZ(enterFrom, "enterFrom");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_pictionary_change_word_click");
        LIZIZ(LIZ2, dataChannel);
        LIZ(LIZ2);
        String str = null;
        if (drawGuessWord != null) {
            l = Long.valueOf(drawGuessWord.id);
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "word_id");
        if (drawGuessWord != null) {
            str = drawGuessWord.word;
        }
        C06490Nh.LIZLLL(LIZ2, str, "word", enterFrom, "enter_from");
    }

    public static void LJIIIIZZ(DataChannel dataChannel, String str, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_pictionary_word_edit");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ(LIZ2);
        if (str == null) {
            str = "";
        }
        C06490Nh.LIZLLL(LIZ2, str, "original_word", enterFrom, "enter_from");
    }

    public static void LJIIIZ(DataChannel dataChannel, Long l, String endReason) {
        long j;
        o.LJIIIZ(endReason, "endReason");
        if (dataChannel == null) {
            return;
        }
        HashMap hashMap = (HashMap) dataChannel.kv0(DrawGuessRoundStartTimeChannel.class);
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Long l2 = (Long) hashMap.get(LJIIL(dataChannel));
        if (l2 != null) {
            j = l2.longValue();
        } else {
            j = 0;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_pictionary_round_end");
        LIZIZ(LIZ2, dataChannel);
        LIZ2.LJIJJ(l, "correct_ucnt");
        LIZ2.LJIJJ(Long.valueOf(Math.min(uptimeMillis - j, 120000L)), "time");
        LIZ2.LJIJJ(endReason, "end_reason");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIJ(DataChannel dataChannel, String functionType, boolean z) {
        String str;
        o.LJIIIZ(functionType, "functionType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_pictionary_start_popup_click");
        LIZ2.LJIILLIIL(dataChannel);
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        C06490Nh.LIZLLL(LIZ2, str, "selection", functionType, "function_type");
    }

    public static void LJI(DataChannel dataChannel, String str, String gameType, boolean z) {
        o.LJIIIZ(gameType, "gameType");
        LIZ = str;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_pictionary_click_start");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ(LIZ2);
        LIZ2.LJIJJ(str, "enter_from");
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_customized");
        LIZ2.LJIJJ(gameType, "type");
        LIZ2.LJJIIJZLJL();
    }

    public static /* synthetic */ void LJII(DataChannel dataChannel, String str, boolean z, int i) {
        String str2;
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str2 = "draw_and_guess";
        } else {
            str2 = null;
        }
        LJI(dataChannel, str, str2, z);
    }
}
