package X;

import Y.ARunnableS32S0200000_13;
import com.bytedance.android.live.liveinteract.cohost.model.RtcMessage;
import com.bytedance.android.live.liveinteract.multimatch.rtc.MatchRtcOpenMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchOpenRtcMessageDelaySetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.TwW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76268TwW {
    public static java.util.Map<Long, Integer> LIZIZ;
    public static java.util.Map<Long, BattleABTestList> LIZJ;
    public static List<? extends TeamUsersInfo> LIZLLL;
    public static final C74639TRb LIZ = new C74639TRb();
    public static int LJ = 2556;

    public static void LIZ(DataChannel dataChannel, RtcMessage rtcMessage, int i) {
        int i2;
        LJ = i;
        C74639TRb c74639TRb = LIZ;
        String str = rtcMessage.content;
        if (str == null) {
            str = "";
        }
        c74639TRb.getClass();
        MatchRtcOpenMessage matchRtcOpenMessage = (MatchRtcOpenMessage) C74639TRb.LIZIZ(MatchRtcOpenMessage.class, str);
        if (C76265TwT.LIZ.LJ() == EnumC76178Tv4.START) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (matchRtcOpenMessage != null) {
            if (LJ != 2557) {
                C76271TwZ c76271TwZ = C76271TwZ.LIZ;
                C76271TwZ.LJIIIIZZ = C30725C4b.LIZ();
                C76271TwZ.LJIIIZ = C30725C4b.LIZ();
                JSONObject jSONObject = new JSONObject();
                C05630Jz.LJFF(jSONObject, "action_by_userId", matchRtcOpenMessage.actionUserId);
                C05630Jz.LJFF(jSONObject, "message_create_time", matchRtcOpenMessage.createTime);
                C05630Jz.LIZ(i2, "is_first_open", jSONObject);
                C05630Jz.LJFF(jSONObject, "battle_id", matchRtcOpenMessage.battleId);
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                C05630Jz.LJFF(jSONObject3, "open_message_fetch_cost", C30725C4b.LIZ() - matchRtcOpenMessage.createTime);
                C76271TwZ.LJJZZIII(c76271TwZ, "received_open_rtc_msg", jSONObject, jSONObject2, jSONObject3, false, 16);
            }
            C15610jN.LIZJ(new ARunnableS32S0200000_13(dataChannel, matchRtcOpenMessage, 97), LiveMatchOpenRtcMessageDelaySetting.INSTANCE.getValue());
        }
    }
}
