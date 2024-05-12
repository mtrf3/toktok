package X;

import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.BMn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28657BMn {
    public static void LIZJ(DataChannel dataChannel, boolean z) {
        int i;
        if (dataChannel.kv0(C28426BDq.class) == null) {
            return;
        }
        C28662BMs c28662BMs = (C28662BMs) dataChannel.kv0(C28659BMp.class);
        if (c28662BMs != null && c28662BMs.LIZLLL.size() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_enter_room_rate");
        LIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_first_screen");
        LIZ.LJIJJ(Integer.valueOf(i), "is_widgets_load");
        LIZ.LJIJJ(dataChannel.kv0(BCN.class), "room_id");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x010f, code lost:
    
        if (r9 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.ies.sdk.datachannel.DataChannel r13, long r14, long r16, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28657BMn.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel, long, long, java.lang.String):void");
    }

    public static void LIZIZ(String str, long j, long j2, long j3, long j4, String str2, String str3, DataChannel dataChannel) {
        String str4;
        HashMap LIZJ = C03660Ck.LIZJ("error_msg", str);
        C64504PTg.LIZJ(j, LIZJ, "error_code", j2, "detail_error_code");
        if (j == 208) {
            LIZJ.put("pull_stream_time", String.valueOf(j3));
            LIZJ.put("start_room_time", String.valueOf(j4));
            LIZJ.put("player_error", str2);
        }
        BJM bjm = BJM.LJLIL;
        long LJIIL = BJM.LJIIL();
        if (LJIIL > 0) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.put("is_portal_user", str4);
        if (LJIIL > 0) {
            LIZJ.put("portal_id", String.valueOf(LJIIL));
        }
        LIZJ.put("is_ecom", str3);
        BZI LIZ = C28787BRn.LIZ("livesdk_live_play_fail");
        LIZ.LJJIFFI(LIZJ);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJJIIJZLJL();
            return;
        }
        LIZ.LJJIJ();
        LIZ.LJI();
        LIZ.LJIJJ(bjm.LIZJ(), "live_type");
        LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
        LIZ.LJJIIZI();
    }
}
