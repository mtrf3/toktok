package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.BLv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28639BLv implements B4F {
    public static final String[] LJII = {"player_start", "player_prepare_end", "player_sdk_dns_analysis_end", "player_prepare_block_end", "player_player_dns_analysis_end", "player_tfo_fall_back_time", "player_tcp_connect_end", "player_tcp_first_package_end", "player_first_video_package_end", "player_first_audio_package_end", "player_first_frame_from_player_core", "player_first_frame_render_end", "player_video_device_open_start", "player_video_device_open_end", "player_audio_device_open_start", "player_audio_device_open_end"};
    public static final String[] LJIIIIZZ = {"start", "prepare_end", "sdk_dns_analysis_end", "prepare_block_end", "player_dns_analysis_end", "tfo_fall_back_time", "tcp_connect_end", "tcp_first_package_end", "first_video_package_end", "first_audio_package_end", "first_frame_from_player_core", "first_frame_render_end", "video_device_open_start", "video_device_open_end", "audio_device_open_start", "audio_device_open_end"};
    public B3K LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final java.util.Map<String, Long> LIZ = new ConcurrentHashMap();
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C28150B3a.LJLIL);

    public final long LIZ() {
        long j;
        String str;
        Long l = (Long) ((ConcurrentHashMap) this.LIZ).get("start");
        Long l2 = (Long) ((ConcurrentHashMap) this.LIZ).get("first_frame");
        if (l != null && l2 != null) {
            j = l2.longValue() - l.longValue();
        } else {
            j = 0;
        }
        B3K b3k = this.LIZIZ;
        if (b3k != null) {
            str = b3k.LIZ;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "draw") && j < 0) {
            return 0L;
        }
        return j;
    }

    public final long LIZJ() {
        Long l = (Long) ((ConcurrentHashMap) this.LIZ).get("start_real");
        Long l2 = (Long) ((ConcurrentHashMap) this.LIZ).get("first_frame");
        if (l != null && l2 != null) {
            return l2.longValue() - l.longValue();
        }
        return 0L;
    }

    public final long LIZLLL() {
        Long l = (Long) ((ConcurrentHashMap) this.LIZ).get("start_real");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final long LJ() {
        Long l = (Long) ((ConcurrentHashMap) this.LIZ).get("first_frame");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final long LJFF() {
        Long l = (Long) ((ConcurrentHashMap) this.LIZ).get("start_real");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final void LJII() {
        Object obj;
        String str;
        if (this.LJFF || !((ConcurrentHashMap) this.LIZ).containsKey("start") || !((ConcurrentHashMap) this.LIZ).containsKey("first_frame")) {
            return;
        }
        HashMap hashMap = new HashMap();
        B3K b3k = this.LIZIZ;
        if (b3k != null) {
            hashMap.put("room_id", String.valueOf(b3k.LJ));
            hashMap.put("user_action_type", String.valueOf(b3k.LIZ));
            hashMap.put("enter_room_type", String.valueOf(b3k.LIZ));
            hashMap.put("enter_room_merge_type", String.valueOf(b3k.LIZJ));
            hashMap.put("enter_room_method_type", String.valueOf(b3k.LIZLLL));
            if (!C38354F3m.LJ(b3k.LIZIZ)) {
                hashMap.put("action_type", String.valueOf(b3k.LIZIZ));
            }
            hashMap.put("room_id_changed", String.valueOf(b3k.LJIIIIZZ));
            LJI(Long.valueOf(b3k.LJII), "play_container_build");
        }
        EnterRoomConfig enterRoomConfig = B57.LIZ.LIZ().mEnterRoomConfig;
        if (enterRoomConfig != null) {
            EnterRoomConfig.ECWrapData eCWrapData = enterRoomConfig.mECData;
            if (eCWrapData != null && eCWrapData.ecCommonExtraParam != null && TextUtils.equals("mall", enterRoomConfig.mRoomsData.enterFromMerge)) {
                for (Map.Entry<String, String> entry : enterRoomConfig.mECData.ecCommonExtraParam.entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (!TextUtils.isEmpty(enterRoomConfig.mLogData.pushStreamUrlStatus) && (str = enterRoomConfig.mLogData.pushStreamUrlStatus) != null) {
                hashMap.put("push_stream_url_status", str);
            }
        }
        String str2 = "1";
        if (this.LIZJ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("has_warmed_up", obj);
        hashMap.put("is_share_player", String.valueOf(this.LIZLLL));
        if (!this.LJ) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_pre_create_surface", str2);
        hashMap.put("duration", String.valueOf(LIZ()));
        hashMap.put("first_frame_duration", String.valueOf(LIZIZ("start", "player_first_frame_render_end")));
        hashMap.put("real_duration", String.valueOf(LIZJ()));
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                String str3 = (String) entry2.getKey();
                String str4 = (String) entry2.getValue();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str3);
                LIZ.append((char) 65306);
                LIZ.append(str4);
                sb.append(X1D.LIZIZ(LIZ));
                sb.append("\n");
            }
            for (Map.Entry entry3 : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                String str5 = (String) entry3.getKey();
                long longValue = ((Number) entry3.getValue()).longValue();
                hashMap.put(str5, String.valueOf(longValue));
                sb.append(str5);
                sb.append(": ");
                sb.append(LIZIZ("start_real", str5));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" <--> ");
                LIZ2.append(longValue);
                LIZ2.append(" - ");
                LIZ2.append(LJFF());
                LIZ2.append("  ");
                sb.append(X1D.LIZIZ(LIZ2));
                sb.append("\n");
            }
            sb.append("!!!!!-------!!!!-------!!!!-------!!!!!!\nfirst_frame_duration: ");
            sb.append(LIZ());
            sb.append("\nduration: ");
            sb.append(LIZ());
            sb.append("\nreal_first_duration: ");
            sb.append(LIZJ());
            B4I.LIZ("RoomPlayerLogger_TAG", sb.toString());
        }
        for (Map.Entry entry4 : ((ConcurrentHashMap) this.LIZ).entrySet()) {
            hashMap.put(entry4.getKey(), String.valueOf(((Number) entry4.getValue()).longValue()));
        }
        BZI LIZ3 = C28787BRn.LIZ("livesdk_enter_room_duration");
        LIZ3.LJJIFFI(hashMap);
        LIZ3.LJIIZILJ();
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ3.LJIILL())) {
            LIZ3.LJJIIJZLJL();
        } else {
            LIZ3.LJJIJ();
            LIZ3.LJJIIZ();
            LIZ3.LJJIIZI();
        }
        java.util.Map<String, Long> map = this.LIZ;
        ((InterfaceC28211B5j) this.LJI.getValue()).LIZJ("start_real", String.valueOf(LJFF()));
        for (Map.Entry entry5 : ((ConcurrentHashMap) map).entrySet()) {
            ((InterfaceC28211B5j) this.LJI.getValue()).LIZJ((String) entry5.getKey(), String.valueOf(((Number) entry5.getValue()).longValue()));
        }
        ((InterfaceC28211B5j) this.LJI.getValue()).LIZ();
        this.LJFF = true;
        ((ConcurrentHashMap) this.LIZ).clear();
        this.LIZIZ = null;
        this.LIZJ = false;
        this.LIZLLL = 0;
        this.LJ = false;
    }

    public final long LIZIZ(String str, String str2) {
        long j;
        Long l = (Long) ((ConcurrentHashMap) this.LIZ).get(str);
        Long l2 = (Long) ((ConcurrentHashMap) this.LIZ).get(str2);
        if (l != null && l2 != null) {
            j = l2.longValue() - l.longValue();
            if (j < 0) {
                if (this.LIZLLL != 0) {
                    return 0L;
                }
                return -1L;
            }
        } else {
            j = 0;
        }
        return j;
    }

    public final void LJI(Long l, String str) {
        if (l == null) {
            return;
        }
        ((ConcurrentHashMap) this.LIZ).put(str, l);
    }
}
