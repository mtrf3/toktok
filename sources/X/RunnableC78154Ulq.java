package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.ResourceModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Ulq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC78154Ulq implements Runnable {
    public final /* synthetic */ Integer LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ Long LJLJJLL;
    public final /* synthetic */ Long LJLJLLL;
    public final /* synthetic */ Float LJLL;
    public final /* synthetic */ int LJLLI;
    public final /* synthetic */ String LJLLJ;
    public final /* synthetic */ Long LJLLL;
    public final /* synthetic */ Long LJLLLL;
    public final /* synthetic */ int LJLLLLLL;
    public final /* synthetic */ C78160Ulw LJLIL = null;
    public final /* synthetic */ boolean LJLJJI = false;
    public final /* synthetic */ long LJLJL = 0;
    public final /* synthetic */ String LJLJLJ = "";
    public final /* synthetic */ long LJLLILLLL = 0;

    public RunnableC78154Ulq(int i, int i2, int i3, Float f, Integer num, Long l, Long l2, Long l3, Long l4, String str, String str2) {
        this.LJLILLLLZI = num;
        this.LJLJI = str;
        this.LJLJJL = i;
        this.LJLJJLL = l;
        this.LJLJLLL = l2;
        this.LJLL = f;
        this.LJLLI = i2;
        this.LJLLJ = str2;
        this.LJLLL = l3;
        this.LJLLLL = l4;
        this.LJLLLLLL = i3;
    }

    public final void LIZ() {
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i3;
        Integer num;
        Integer num2;
        String str;
        Object obj;
        Integer num3;
        List<String> list;
        java.util.Map<String, String> map;
        java.util.Map<String, String> map2;
        JSONObject jSONObject = new JSONObject();
        C78160Ulw c78160Ulw = this.LJLIL;
        int i4 = 0;
        if (c78160Ulw != null && c78160Ulw.LJI) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("effect_load_status", i ^ 1);
        C78160Ulw c78160Ulw2 = this.LJLIL;
        if (c78160Ulw2 != null) {
            i2 = c78160Ulw2.LJFF;
        } else {
            i2 = 0;
        }
        jSONObject.put("tray_position", i2);
        jSONObject.put("error_code", this.LJLILLLLZI);
        String str2 = this.LJLJI;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("error_msg", str2);
        jSONObject.put("is_from_player", this.LJLJJI);
        C78160Ulw c78160Ulw3 = this.LJLIL;
        if (c78160Ulw3 != null && (map2 = c78160Ulw3.LJ) != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        Integer num4 = this.LJLILLLLZI;
        if (num4 == null || num4.intValue() != 0) {
            jSONObject2.put("play_fail_toast_show", this.LJLJJL);
        }
        jSONObject2.put("error_code", this.LJLILLLLZI);
        String str4 = this.LJLJI;
        if (str4 != null) {
            str3 = str4;
        }
        jSONObject2.put("error_msg", str3);
        long currentTimeMillis = System.currentTimeMillis();
        C78160Ulw c78160Ulw4 = this.LJLIL;
        if (c78160Ulw4 != null) {
            j = c78160Ulw4.LJII;
        } else {
            j = 0;
        }
        jSONObject2.put("receive_play_end_dur", currentTimeMillis - j);
        C78160Ulw c78160Ulw5 = this.LJLIL;
        if (c78160Ulw5 != null) {
            j2 = c78160Ulw5.LJIIIIZZ;
        } else {
            j2 = 0;
        }
        jSONObject2.put("send_receive_im_dur", j2);
        C78160Ulw c78160Ulw6 = this.LJLIL;
        if (c78160Ulw6 != null) {
            j3 = c78160Ulw6.LJIIIZ;
        } else {
            j3 = 0;
        }
        jSONObject2.put("before_queue_dur", j3);
        C78160Ulw c78160Ulw7 = this.LJLIL;
        if (c78160Ulw7 != null) {
            j4 = c78160Ulw7.LJIIJ;
        } else {
            j4 = 0;
        }
        jSONObject2.put("in_queue_dur", j4);
        Long l = this.LJLJJLL;
        if (l != null) {
            j5 = l.longValue();
        } else {
            j5 = 0;
        }
        C78160Ulw c78160Ulw8 = this.LJLIL;
        if (c78160Ulw8 != null) {
            j6 = c78160Ulw8.LJIIJJI;
        } else {
            j6 = 0;
        }
        jSONObject2.put("dequeue_first_frame_dur", (j5 - j6) - C31012CFc.LIZIZ);
        long currentTimeMillis2 = System.currentTimeMillis();
        Long l2 = this.LJLJJLL;
        if (l2 != null) {
            j7 = l2.longValue();
        } else {
            j7 = 0;
        }
        jSONObject2.put("first_frame_play_end_dur", currentTimeMillis2 - j7);
        jSONObject2.put("effect_id", this.LJLJL);
        jSONObject2.put("player_type", this.LJLJLJ);
        jSONObject2.put("is_from_player", this.LJLJJI);
        C78160Ulw c78160Ulw9 = this.LJLIL;
        if (c78160Ulw9 != null && (map = c78160Ulw9.LJ) != null) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                jSONObject2.put(entry2.getKey(), entry2.getValue());
            }
        }
        C78160Ulw c78160Ulw10 = this.LJLIL;
        if (c78160Ulw10 != null && c78160Ulw10.LJI) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        jSONObject2.put("effect_load_status", 1 ^ i3);
        C78160Ulw c78160Ulw11 = this.LJLIL;
        if (c78160Ulw11 != null) {
            i4 = c78160Ulw11.LJFF;
        }
        jSONObject2.put("tray_position", i4);
        jSONObject2.put("error_code", this.LJLILLLLZI);
        jSONObject2.put("first_frame_duration", this.LJLJLLL);
        Float f = this.LJLL;
        if (f != null && f.floatValue() > 0.0f) {
            num = Integer.valueOf((int) (this.LJLL.floatValue() * 100));
        } else {
            num = null;
        }
        jSONObject2.put("fps", num);
        jSONObject2.put("sourceFps", this.LJLLI);
        jSONObject2.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("first_frame_duration", this.LJLJLLL);
        Float f2 = this.LJLL;
        if (f2 != null && f2.floatValue() > 0.0f) {
            num2 = Integer.valueOf((int) (this.LJLL.floatValue() * 100));
        } else {
            num2 = null;
        }
        jSONObject3.put("fps", num2);
        AssetsModel LIZ = C32341Cmf.LIZ(this.LJLJL);
        if (LIZ != null) {
            long j8 = this.LJLJL;
            long j9 = this.LJLLILLLL;
            C78160Ulw c78160Ulw12 = this.LJLIL;
            Long l3 = this.LJLJLLL;
            String str5 = this.LJLLJ;
            Long l4 = this.LJLLL;
            Integer num5 = this.LJLILLLLZI;
            String str6 = this.LJLJI;
            String str7 = this.LJLJLJ;
            Long l5 = this.LJLLLL;
            Long l6 = this.LJLJJLL;
            int i5 = this.LJLLLLLL;
            Float f3 = this.LJLL;
            int i6 = this.LJLLI;
            BZI LIZ2 = C28787BRn.LIZ("gift_effect_play_status");
            LIZ2.LJJ(jSONObject);
            LIZ2.LJJ(jSONObject2);
            LIZ2.LJJ(jSONObject3);
            LIZ2.LJIJJ(Long.valueOf(j8), "effect_id");
            LIZ2.LJIJJ(Long.valueOf(j8), "asset_id");
            LIZ2.LJIJJ(Long.valueOf(j9), "gift_id");
            if (c78160Ulw12 == null || (str = c78160Ulw12.LJIIL) == null) {
                str = "unknown";
            }
            LIZ2.LJIJJ(str, "resources_format");
            LIZ2.LJIJJ(l3, "first_frame_duration");
            LIZ2.LJIJJ(str5, "log_id");
            LIZ2.LJIJJ(l4, "msg_id");
            LIZ2.LJIJJ(num5, "error_code");
            LIZ2.LJIJJ(str6, "error_msg");
            LIZ2.LJIJJ(str6, "error_domain");
            LIZ2.LJIJJ(str7, "player_type");
            LIZ2.LJIJJ(ORZ.LJLLLL(LIZ.resourceModel.urlList), "resource_url");
            ResourceModel resourceModel = LIZ.resourceByteVC1Model;
            if (resourceModel != null && (list = resourceModel.urlList) != null) {
                obj = ORZ.LJLLLL(list);
            } else {
                obj = null;
            }
            LIZ2.LJIJJ(obj, "resource_bytevc1_url");
            LIZ2.LJIJJ(l5, "play_dur");
            LIZ2.LJIJJ(l6, "play_ms");
            LIZ2.LJIJJ(Integer.valueOf(i5), "gift_type");
            if (f3 != null && f3.floatValue() > 0.0f) {
                num3 = Integer.valueOf((int) (f3.floatValue() * 100));
            } else {
                num3 = null;
            }
            LIZ2.LJIJJ(num3, "fps");
            LIZ2.LJIJJ(Integer.valueOf(i6), "sourceFps");
            LIZ2.LJIJJ(C1H.LJ(), "overload_score");
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
            boolean isReportDolphin = LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gift_effect_play_status", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            if (num5 == null || num5.intValue() != 0) {
                if (isReportDolphin) {
                    C0K2.LJ("gift_effect_play_status", jSONObject, jSONObject3, jSONObject2);
                }
                C0K2.LJI("gift_effect_play_status_error", jSONObject, jSONObject3, jSONObject2);
            } else {
                if (!isReportDolphin) {
                    return;
                }
                C0K2.LJI("gift_effect_play_status", jSONObject, jSONObject3, jSONObject2);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
