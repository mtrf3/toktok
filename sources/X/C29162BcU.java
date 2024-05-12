package X;

import Y.AfS36S0101000_5;
import android.os.Handler;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* renamed from: X.BcU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29162BcU {
    public static final C29162BcU LIZJ = new C29162BcU();
    public boolean LIZ;
    public B7I LIZIZ;

    public static AbstractC73672Svk LIZJ(long[] jArr) {
        StringBuilder sb = new StringBuilder();
        if (jArr != null) {
            for (int i = 0; i < jArr.length; i++) {
                sb.append(jArr[i]);
                if (jArr.length - 1 != i) {
                    sb.append(",");
                }
            }
        }
        return C1EW.LIZ(((RoomRetrofitApi) Q7L.LIZIZ(RoomRetrofitApi.class)).getMultipleRoomInfo(sb.toString()));
    }

    public static void LIZLLL(HandlerC28345BAn handlerC28345BAn) {
        C1EW.LIZ(((RoomRetrofitApi) Q7L.LIZIZ(RoomRetrofitApi.class)).getQuestionnaireContent()).LJJJLIIL(new AfS36S0101000_5(1, handlerC28345BAn, 40), new AfS36S0101000_5(0, handlerC28345BAn, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C29164BcW r10) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29162BcU.LIZ(X.BcW):void");
    }

    public static void LIZIZ(int i, Handler handler) {
        String str;
        if (i == 1) {
            str = "continue_cancel";
        } else if (i == 2) {
            str = "enter_other_room";
        } else if (i == 3) {
            str = "other_device_go_live";
        } else {
            str = "";
        }
        C1EW.LIZ(((RoomRetrofitApi) Q7L.LIZIZ(RoomRetrofitApi.class)).finishRoomAbnormal(str)).LJJJLIIL(new C54973Lhp(0, handler), new AfS36S0101000_5(0, handler, 23));
    }

    public static void LJFF(HandlerC28345BAn handlerC28345BAn, long j, int i, int i2) {
        C1EW.LIZ(((RoomRetrofitApi) Q7L.LIZIZ(RoomRetrofitApi.class)).reportDetect(j, i, i2)).LJJJLIIL(new AfS36S0101000_5(2, handlerC28345BAn, 39), new AfS36S0101000_5(0, handlerC28345BAn, 25));
    }

    public static void LJ(LiveMode liveMode, boolean z, int i, boolean z2, String str) {
        String str2;
        String str3;
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_broadcast_path_get_room_create", 0.01d)) {
            return;
        }
        if (liveMode != null) {
            str2 = liveMode.logStreamingType;
        } else {
            str2 = "";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_broadcast_path_get_room_create");
        LIZ.LJIIZILJ();
        String str4 = "normal";
        if (!z) {
            str3 = "normal";
        } else {
            str3 = "oneTab";
        }
        LIZ.LJIJJ(str3, "enter_from");
        C78895Uxn.LIZIZ(LIZ, str2, "live_mode", i, "is_success");
        if (z2) {
            str4 = "smooth";
        }
        C78895Uxn.LIZIZ(LIZ, str4, "is_smooth", 0, "is_continue");
        LIZ.LJIJJ(str, "error");
        LIZ.LJJIIJZLJL();
    }
}
