package Y;

import X.C0K2;
import X.C1H;
import X.C31012CFc;
import X.C32255ClH;
import X.C32256ClI;
import X.C32257ClJ;
import X.C76786UBq;
import X.C77119UOl;
import X.C77413UZt;
import X.C78160Ulw;
import X.ORZ;
import X.U66;
import X.U85;
import X.UA9;
import X.UAS;
import X.UC0;
import X.X1D;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.ResourceModel;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S1200300_13 implements Runnable {
    public final int $t;
    public long j3;
    public long j4;
    public long j5;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        int i2;
        String str;
        int i3;
        long j;
        long j2;
        long j3;
        long j4;
        int i4;
        int i5;
        String str2;
        String str3;
        Long l;
        List<String> list;
        Map<String, String> map;
        Map<String, String> map2;
        JSONObject jSONObject = new JSONObject();
        C78160Ulw c78160Ulw = (C78160Ulw) this.l1;
        int i6 = 0;
        if (c78160Ulw != null && c78160Ulw.LJI) {
            i = 1;
        } else {
            i = 0;
        }
        JSONObject put = jSONObject.put("effect_load_status", i ^ 1);
        C78160Ulw c78160Ulw2 = (C78160Ulw) this.l1;
        if (c78160Ulw2 != null) {
            i2 = c78160Ulw2.LJFF;
        } else {
            i2 = 0;
        }
        JSONObject put2 = put.put("tray_position", i2);
        C78160Ulw c78160Ulw3 = (C78160Ulw) this.l1;
        Object obj = null;
        if (c78160Ulw3 != null) {
            str = c78160Ulw3.LJIIL;
        } else {
            str = null;
        }
        JSONObject put3 = put2.put("res_type", str).put("is_anchor", C32257ClJ.LJFF());
        C78160Ulw c78160Ulw4 = (C78160Ulw) this.l1;
        if (c78160Ulw4 != null && c78160Ulw4.LIZJ) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        put3.put("is_own_send", i3);
        C78160Ulw c78160Ulw5 = (C78160Ulw) this.l1;
        if (c78160Ulw5 != null && (map2 = c78160Ulw5.LJ) != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        C78160Ulw c78160Ulw6 = (C78160Ulw) this.l1;
        long j5 = 0;
        if (c78160Ulw6 != null) {
            j = c78160Ulw6.LJII;
        } else {
            j = 0;
        }
        JSONObject put4 = jSONObject2.put("receive_play_end_dur", currentTimeMillis - j);
        C78160Ulw c78160Ulw7 = (C78160Ulw) this.l1;
        if (c78160Ulw7 != null) {
            j2 = c78160Ulw7.LJIIIIZZ;
        } else {
            j2 = 0;
        }
        JSONObject put5 = put4.put("send_receive_im_dur", j2);
        C78160Ulw c78160Ulw8 = (C78160Ulw) this.l1;
        if (c78160Ulw8 != null) {
            j3 = c78160Ulw8.LJIIIZ;
        } else {
            j3 = 0;
        }
        JSONObject put6 = put5.put("before_queue_dur", j3);
        C78160Ulw c78160Ulw9 = (C78160Ulw) this.l1;
        if (c78160Ulw9 != null) {
            j4 = c78160Ulw9.LJIIJ;
        } else {
            j4 = 0;
        }
        JSONObject put7 = put6.put("in_queue_dur", j4);
        long j6 = this.j3;
        C78160Ulw c78160Ulw10 = (C78160Ulw) this.l1;
        if (c78160Ulw10 != null) {
            j5 = c78160Ulw10.LJIIJJI;
        }
        JSONObject put8 = put7.put("dequeue_first_frame_dur", (j6 - j5) - C31012CFc.LIZIZ).put("first_frame_play_end_dur", System.currentTimeMillis() - this.j3).put("effect_id", this.j4);
        C78160Ulw c78160Ulw11 = (C78160Ulw) this.l1;
        if (c78160Ulw11 != null && c78160Ulw11.LJI) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        JSONObject put9 = put8.put("resource_downloaded", i4 ^ 1);
        C78160Ulw c78160Ulw12 = (C78160Ulw) this.l1;
        if (c78160Ulw12 != null && c78160Ulw12.LJI) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        JSONObject put10 = put9.put("is_local", 1 ^ i5);
        C78160Ulw c78160Ulw13 = (C78160Ulw) this.l1;
        if (c78160Ulw13 != null) {
            i6 = c78160Ulw13.LJFF;
        }
        put10.put("tray_position", i6).put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        C78160Ulw c78160Ulw14 = (C78160Ulw) this.l1;
        if (c78160Ulw14 != null && (map = c78160Ulw14.LJ) != null) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                jSONObject2.put(entry2.getKey(), entry2.getValue());
            }
        }
        C78160Ulw c78160Ulw15 = (C78160Ulw) this.l1;
        if (c78160Ulw15 != null) {
            C77413UZt.LJ(c78160Ulw15, jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("gift_render_start");
        LIZ.append(this.s0);
        C32255ClH LIZ2 = C32256ClI.LIZ(X1D.LIZIZ(LIZ));
        LIZ2.LJ(jSONObject);
        LIZ2.LJ(jSONObject2);
        LIZ2.LJ(jSONObject3);
        LIZ2.LIZJ(this.j4, "effect_id");
        LIZ2.LIZJ(this.j4, "asset_id");
        LIZ2.LIZJ(this.j5, "gift_id");
        C78160Ulw c78160Ulw16 = (C78160Ulw) this.l1;
        if (c78160Ulw16 == null || (str2 = c78160Ulw16.LJIIL) == null) {
            str2 = "unknown";
        }
        LIZ2.LIZLLL(str2, "resources_format");
        C78160Ulw c78160Ulw17 = (C78160Ulw) this.l1;
        if (c78160Ulw17 != null) {
            str3 = c78160Ulw17.LIZIZ;
        } else {
            str3 = null;
        }
        LIZ2.LIZLLL(str3, "log_id");
        C78160Ulw c78160Ulw18 = (C78160Ulw) this.l1;
        if (c78160Ulw18 != null) {
            l = Long.valueOf(c78160Ulw18.LIZ);
        } else {
            l = null;
        }
        LIZ2.LIZLLL(l, "msg_id");
        LIZ2.LIZLLL(ORZ.LJLLLL(((AssetsModel) this.l2).resourceModel.urlList), "resource_url");
        ResourceModel resourceModel = ((AssetsModel) this.l2).resourceByteVC1Model;
        if (resourceModel != null && (list = resourceModel.urlList) != null) {
            obj = ORZ.LJLLLL(list);
        }
        LIZ2.LIZLLL(obj, "resource_bytevc1_url");
        LIZ2.LIZJ(this.j3, "play_ms");
        LIZ2.LIZLLL(C1H.LJ(), "overload_score");
        LIZ2.LIZIZ();
        LIZ2.LJI();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("gift_render_start");
        LIZ3.append(this.s0);
        C0K2.LJI(X1D.LIZIZ(LIZ3), jSONObject, jSONObject3, jSONObject2);
    }

    public final void LIZ$1() {
        UAS LIZJ = UA9.LIZLLL().LIZJ((U66) this.l1, this.s0, U85.INVITER);
        if (LIZJ != null) {
            JSONObject jSONObject = (JSONObject) this.l2;
            long j = this.j3;
            long j2 = this.j4;
            long j3 = this.j5;
            C76786UBq LJ = UA9.LJ();
            UC0.LJJLIIIJJI(jSONObject, LIZJ);
            JSONObject LJIIZILJ = UC0.LJIIZILJ(7, null, null);
            LJIIZILJ.put("timeout_interval", j3);
            C77119UOl.LJJIFFI(LJ, LIZJ, jSONObject, "cancel_invite", LJIIZILJ, j, j2);
        }
    }

    public static final void run$0(ARunnableS0S1200300_13 aRunnableS0S1200300_13) {
        boolean LIZ;
        try {
            aRunnableS0S1200300_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S1200300_13 aRunnableS0S1200300_13) {
        boolean LIZ;
        try {
            aRunnableS0S1200300_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S1200300_13(long j, long j2, long j3, Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.j3 = j;
        this.j4 = j2;
        this.s0 = str;
        this.j5 = j3;
        this.l2 = obj;
    }
}
