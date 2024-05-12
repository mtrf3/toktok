package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UAR {
    public static final /* synthetic */ int LIZ = 0;

    public static HashMap LIZ(UAS uas) {
        Long l;
        U94 u94;
        String str;
        LayoutInfo LLLZI;
        String layoutId;
        Room LIZJ;
        LiveMode streamType;
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", uas.LJIILIIL);
        hashMap.put("linkmic_id", uas.LIZ);
        hashMap.put("remote_linkmic_id", uas.LIZIZ);
        U66 u66 = uas.LJIIL.get();
        Room room = null;
        if (u66 != null) {
            l = Long.valueOf(u66.LJJLI());
        } else {
            l = null;
        }
        hashMap.put("channel_id", String.valueOf(l));
        U66 u662 = uas.LJIIL.get();
        if (u662 != null) {
            u94 = UC0.LJIILIIL(u662.getScene());
        } else {
            u94 = null;
        }
        hashMap.put(WM7.SCENE_SERVICE, String.valueOf(u94));
        U66 u663 = uas.LJIIL.get();
        String str2 = "";
        if (u663 == null || (LIZJ = u663.LIZJ()) == null || (streamType = LIZJ.getStreamType()) == null) {
            str = "";
        } else {
            str = C28509BGv.LIZ(streamType);
        }
        hashMap.put("live_type", str);
        U66 u664 = uas.LJIIL.get();
        if (u664 != null) {
            room = u664.LIZJ();
        }
        hashMap.put("connection_type", C1DJ.LJIILIIL(room));
        hashMap.put("role_type", uas.LJI.toString());
        U66 u665 = uas.LJIIL.get();
        if (u665 != null && (LLLZI = u665.LLLZI()) != null && (layoutId = LLLZI.getLayoutId()) != null) {
            str2 = layoutId;
        }
        hashMap.put("layout", str2);
        hashMap.put("arch_type", String.valueOf(uas.LJJ));
        return hashMap;
    }

    public static void LIZJ(UAS uas) {
        HashMap LIZ2 = LIZ(uas);
        C7MY.LJFF(uas.LJIJJ, uas.LJIJ, LIZ2, "request_duration");
        long j = uas.LJIJI;
        if (j > 0) {
            C7MY.LJFF(uas.LJIJJ, j, LIZ2, "full_duration");
        }
        LIZ2.put("is_mute_video", String.valueOf(uas.LJIJJLI ? 1 : 0));
        LIZ2.put("is_mute_audio", String.valueOf(uas.LJIL ? 1 : 0));
        C70657RoD.LJJI(0.01d, new AqS163S0100000_13(LIZ2, (HashMap<String, String>) 741));
    }

    public static void LIZLLL(UAS uas) {
        C70657RoD.LJJI(0.01d, new AqS163S0100000_13(uas, 742));
    }

    public static void LJI(HashMap hashMap) {
        Long l;
        String str;
        if (LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().enable) {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            if (room != null) {
                l = Long.valueOf(room.getOwnerUserId());
            } else {
                l = null;
            }
            if (o.LJ(valueOf, String.valueOf(l))) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_anchor", str);
        }
    }

    public static void LJ(UAS uas, boolean z, long j) {
        HashMap LIZ2 = LIZ(uas);
        BZI LIZ3 = C28787BRn.LIZ("livesdk_linkmic_perf_request_launch");
        LIZ3.LJJIFFI(LIZ2);
        LIZ3.LJIJJ(Long.valueOf(j), "duration");
        LIZ3.LJIJJ(Integer.valueOf(z ? 1 : 0), "success");
        LIZ3.LJJIIJZLJL();
    }

    public static void LIZIZ(UAS record, String str, long j, String str2, long j2) {
        o.LJIIIZ(record, "record");
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_linkmic_perf_api_finish", 0.001d)) {
            return;
        }
        HashMap LIZ2 = LIZ(record);
        AnonymousClass391.LJFF(LIZ2, "source", str, j, "duration");
        if (str2 == null) {
            str2 = "";
        }
        LIZ2.put("log_id", str2);
        LIZ2.put("error_code", String.valueOf(j2));
        LJI(LIZ2);
        BZI LIZ3 = C28787BRn.LIZ("livesdk_linkmic_perf_api_finish");
        LIZ3.LJJIFFI(LIZ2);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ3.LJIILL())) {
            LIZ3.LJJIIJZLJL();
        } else {
            LIZ3.LJJIJ();
            LIZ3.LJJIIZI();
        }
    }

    public static void LJFF(long j, long j2, UAS record, String str, String str2, boolean z) {
        String str3 = str2;
        o.LJIIIZ(record, "record");
        if (!record.LJIILJJIL && !record.LJIILLIIL && !record.LJIIZILJ && !record.LJIILL) {
            return;
        }
        if (record.LJII) {
            C70657RoD.LJJI(0.01d, new C76759UAp(j, j2, record, str, str3, z));
            return;
        }
        HashMap LIZ2 = LIZ(record);
        LIZ2.put("request_end_reason", str);
        if (str3 == null) {
            str3 = "";
        }
        AnonymousClass391.LJFF(LIZ2, "request_end_source", str3, j, "error_code");
        AnonymousClass172.LIZ("livesdk_linkmic_perf_request_fail", LIZ2);
    }
}
