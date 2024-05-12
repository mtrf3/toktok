package X;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.BroadcastShowOrientationBeginTime;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.model.GameCategoryInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Bta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30222Bta {
    public static void LIZ(Room room, DataChannel dataChannel) {
        long j;
        long j2;
        String str;
        long currentTimeMillis;
        Object obj;
        LiveMode streamType;
        IPublicScreenService LJIIZILJ = C7N.LJIIZILJ();
        long j3 = 0;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        LJIIZILJ.df(j);
        IPublicScreenService LJIIZILJ2 = C7N.LJIIZILJ();
        if (room != null) {
            j2 = room.getId();
        } else {
            j2 = 0;
        }
        long e10 = LJIIZILJ2.e10(j2);
        IPublicScreenService LJIIZILJ3 = C7N.LJIIZILJ();
        if (room != null) {
            j3 = room.getId();
        }
        LJIIZILJ3.NN(j3);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) dataChannelGlobal.mv0(BroadcastShareScreenDefinition.class);
        String str2 = null;
        if (quality == null || (str = quality.sdkKey) == null) {
            str = "";
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Long l = (Long) dataChannelGlobal.mv0(BroadcastShowOrientationBeginTime.class);
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        long j4 = currentTimeMillis2 - currentTimeMillis;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_over");
        if (room != null && (streamType = room.getStreamType()) != null) {
            str2 = C28509BGv.LIZ(streamType);
        }
        LIZ.LJIJJ(str2, "live_type");
        LIZ.LJIJJ(Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(e10)), "hot_duration");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIIJJI("live_take_detail");
        LIZ.LJIJJ(String.valueOf(j4 / 1000), "duration");
        LIZ.LJIJJ(str, "take_definition");
        if (room != null && room.isScreenshot) {
            GameCategoryInfo gameCategoryInfo = room.gameCategoryInfo;
            if (gameCategoryInfo != null) {
                if (TextUtils.isEmpty(gameCategoryInfo.title)) {
                    LIZ.LJIJJ(LiveGiftNewGifterBadgeSetting.DEFAULT, "selected_app_name");
                } else {
                    LIZ.LJIJJ(room.gameCategoryInfo.title, "selected_app_name");
                }
                if (TextUtils.isEmpty(room.gameCategoryInfo.packageName)) {
                    LIZ.LJIJJ(LiveGiftNewGifterBadgeSetting.DEFAULT, "selected_app_id");
                } else {
                    LIZ.LJIJJ(room.gameCategoryInfo.packageName, "selected_app_id");
                }
            }
            Boolean LIZJ = InterfaceC30442Bx8.LJJIJIIJI.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_GAME_COMMENT_MSG_PUSH.value");
            String str3 = "on";
            if (LIZJ.booleanValue()) {
                obj = "on";
            } else {
                obj = "off";
            }
            LIZ.LJIJJ(obj, "screen_share_comment_push_setting");
            Boolean LIZJ2 = InterfaceC30442Bx8.LJJIJIIJIL.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_GAME_GIFT_MSG_PUSH.value");
            if (!LIZJ2.booleanValue()) {
                str3 = "off";
            }
            LIZ.LJIJJ(str3, "screen_share_gift_push_setting");
        }
        LIZ.LJJIIJZLJL();
    }
}
