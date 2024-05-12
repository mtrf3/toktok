package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.gift.render.model.Effect;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ult, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC78157Ult implements Runnable {
    public final /* synthetic */ C78158Ulu LJLIL;
    public final /* synthetic */ C78165Um1 LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C78164Um0 LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public RunnableC78157Ult(C78158Ulu c78158Ulu, C78165Um1 c78165Um1, long j, C78164Um0 c78164Um0, String str) {
        this.LJLIL = c78158Ulu;
        this.LJLILLLLZI = c78165Um1;
        this.LJLJI = j;
        this.LJLJJI = c78164Um0;
        this.LJLJJL = str;
    }

    public final void LIZ() {
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Long l;
        double d;
        double d2;
        double d3;
        double d4;
        List<C32449CoP> list;
        int i3;
        boolean z;
        JSONObject jSONObject;
        Long l2;
        Long l3;
        Long l4;
        Integer num;
        String str;
        long j6;
        InterfaceC32251ClD LIZJ;
        Long l5;
        Long l6;
        Long l7;
        Double d5;
        Double d6;
        Double d7;
        Double d8;
        Double d9;
        java.util.Map<String, String> map;
        java.util.Map<String, String> map2;
        JSONObject jSONObject2 = new JSONObject();
        C78160Ulw c78160Ulw = this.LJLIL.LIZ.LIZJ;
        if (c78160Ulw != null && c78160Ulw.LJI) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject2.put("effect_load_status", i ^ 1);
        C78160Ulw c78160Ulw2 = this.LJLIL.LIZ.LIZJ;
        if (c78160Ulw2 != null) {
            i2 = c78160Ulw2.LJFF;
        } else {
            i2 = 0;
        }
        jSONObject2.put("tray_position", i2);
        jSONObject2.put("error_code", this.LJLILLLLZI.LIZLLL);
        jSONObject2.put("is_from_player", true);
        C78160Ulw c78160Ulw3 = this.LJLIL.LIZ.LIZJ;
        if (c78160Ulw3 != null && (map2 = c78160Ulw3.LJ) != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("is_from_player", true);
        jSONObject3.put("error_code", this.LJLILLLLZI.LIZLLL);
        long j7 = this.LJLJI;
        C78160Ulw c78160Ulw4 = this.LJLIL.LIZ.LIZJ;
        if (c78160Ulw4 != null) {
            j = c78160Ulw4.LJII;
        } else {
            j = 0;
        }
        jSONObject3.put("receive_play_end_dur", j7 - j);
        C78160Ulw c78160Ulw5 = this.LJLIL.LIZ.LIZJ;
        if (c78160Ulw5 != null) {
            j2 = c78160Ulw5.LJIIIIZZ;
        } else {
            j2 = 0;
        }
        jSONObject3.put("send_receive_im_dur", j2);
        C78160Ulw c78160Ulw6 = this.LJLIL.LIZ.LIZJ;
        if (c78160Ulw6 != null) {
            j3 = c78160Ulw6.LJIIIZ;
        } else {
            j3 = 0;
        }
        jSONObject3.put("before_queue_dur", j3);
        C78160Ulw c78160Ulw7 = this.LJLIL.LIZ.LIZJ;
        if (c78160Ulw7 != null) {
            j4 = c78160Ulw7.LJIIJ;
        } else {
            j4 = 0;
        }
        jSONObject3.put("in_queue_dur", j4);
        C78158Ulu c78158Ulu = this.LJLIL;
        long j8 = c78158Ulu.LJI;
        C78160Ulw c78160Ulw8 = c78158Ulu.LIZ.LIZJ;
        if (c78160Ulw8 != null) {
            j5 = c78160Ulw8.LJIIJJI;
        } else {
            j5 = 0;
        }
        jSONObject3.put("dequeue_first_frame_dur", j8 - j5);
        jSONObject3.put("first_frame_play_end_dur", this.LJLJI - this.LJLIL.LJI);
        AssetsModel assetsModel = this.LJLIL.LJ;
        if (assetsModel != null) {
            l = Long.valueOf(assetsModel.id);
        } else {
            l = null;
        }
        jSONObject3.put("effect_id", l);
        jSONObject3.put("player_type", "lynx_native");
        C78160Ulw c78160Ulw9 = this.LJLIL.LIZ.LIZJ;
        if (c78160Ulw9 != null && (map = c78160Ulw9.LJ) != null) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("first_frame_duration", this.LJLILLLLZI.LJIIIIZZ);
        float f = 100;
        JSONObject put = jSONObject4.put("fps", (int) (this.LJLILLLLZI.LIZIZ * f));
        C78164Um0 c78164Um0 = this.LJLJJI;
        double d10 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        if (c78164Um0 != null && (d9 = c78164Um0.LIZJ) != null) {
            d = d9.doubleValue();
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        double d11 = 100;
        JSONObject put2 = put.put("push_stream_fps_avg", (int) (d * d11));
        C78164Um0 c78164Um02 = this.LJLJJI;
        if (c78164Um02 != null && (d8 = c78164Um02.LJ) != null) {
            d2 = d8.doubleValue();
        } else {
            d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        JSONObject put3 = put2.put("push_stream_fps_min", (int) (d2 * d11));
        C78164Um0 c78164Um03 = this.LJLJJI;
        if (c78164Um03 != null && (d7 = c78164Um03.LIZIZ) != null) {
            d3 = d7.doubleValue();
        } else {
            d3 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        JSONObject put4 = put3.put("pull_stream_fps_avg", (int) (d3 * d11));
        C78164Um0 c78164Um04 = this.LJLJJI;
        if (c78164Um04 != null && (d6 = c78164Um04.LIZLLL) != null) {
            d4 = d6.doubleValue();
        } else {
            d4 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        JSONObject put5 = put4.put("pull_stream_fps_min", (int) (d4 * d11));
        C78164Um0 c78164Um05 = this.LJLJJI;
        if (c78164Um05 != null && (d5 = c78164Um05.LJFF) != null) {
            d10 = d5.doubleValue();
        }
        put5.put("device_fps_avg", (int) (d10 * d11));
        InterfaceC78172Um8 interfaceC78172Um8 = (InterfaceC78172Um8) this.LJLIL.LIZ.LIZ(InterfaceC78172Um8.class);
        if (interfaceC78172Um8 != null) {
            list = interfaceC78172Um8.LIZ();
        } else {
            list = null;
        }
        if (this.LJLILLLLZI.LIZLLL > 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (list != null && (!list.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            JSONObject jSONObject5 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (C32449CoP c32449CoP : list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("this is effect inside : ");
                Effect effect = c32449CoP.LIZ;
                if (effect != null) {
                    l5 = Long.valueOf(effect.giftId);
                } else {
                    l5 = null;
                }
                LIZ.append(l5);
                Logger.i("GIFTBOX", X1D.LIZIZ(LIZ));
                JSONObject jSONObject6 = new JSONObject();
                Effect effect2 = c32449CoP.LIZ;
                if (effect2 != null) {
                    l6 = Long.valueOf(effect2.giftId);
                } else {
                    l6 = null;
                }
                JSONObject put6 = jSONObject6.put("gift_id", l6);
                Effect effect3 = c32449CoP.LIZ;
                if (effect3 != null) {
                    l7 = Long.valueOf(effect3.assetId);
                } else {
                    l7 = null;
                }
                put6.put("effect_id", l7).put("play_status", c32449CoP.LJIILIIL);
                if (c32449CoP.LJIILIIL > 0) {
                    i3 = 1;
                }
                jSONArray.put(jSONObject6);
            }
            jSONObject5.put("gifts_in_box", jSONArray);
            jSONObject = jSONObject5;
        } else {
            jSONObject = null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("gift_effect_play_status");
        LIZ2.append(this.LJLJJL);
        C32255ClH LIZ3 = C32256ClI.LIZ(X1D.LIZIZ(LIZ2));
        LIZ3.LJ(jSONObject2);
        LIZ3.LJ(jSONObject3);
        LIZ3.LJ(jSONObject4);
        Effect effect4 = this.LJLIL.LIZIZ;
        if (effect4 != null) {
            l2 = Long.valueOf(effect4.LIZ().id);
        } else {
            l2 = null;
        }
        LIZ3.LIZLLL(l2, "asset_id");
        AssetsModel assetsModel2 = this.LJLIL.LJ;
        if (assetsModel2 != null) {
            l3 = Long.valueOf(assetsModel2.id);
        } else {
            l3 = null;
        }
        LIZ3.LIZLLL(l3, "effect_id");
        Effect effect5 = this.LJLIL.LIZIZ;
        if (effect5 != null) {
            l4 = Long.valueOf(effect5.giftId);
        } else {
            l4 = null;
        }
        LIZ3.LIZLLL(l4, "gift_id");
        Effect effect6 = this.LJLIL.LIZIZ;
        if (effect6 != null) {
            num = Integer.valueOf(effect6.LIZIZ);
        } else {
            num = null;
        }
        LIZ3.LIZLLL(num, "gift_type");
        LIZ3.LIZJ(this.LJLILLLLZI.LJII, "total_dur");
        LIZ3.LIZJ(this.LJLILLLLZI.LJIIIIZZ, "first_frame_duration");
        C78160Ulw c78160Ulw10 = this.LJLIL.LIZ.LIZJ;
        if (c78160Ulw10 == null || (str = c78160Ulw10.LIZIZ) == null) {
            str = "";
        }
        LIZ3.LIZLLL(str, "log_id");
        C78160Ulw c78160Ulw11 = this.LJLIL.LIZ.LIZJ;
        if (c78160Ulw11 != null) {
            j6 = c78160Ulw11.LIZ;
        } else {
            j6 = 0;
        }
        LIZ3.LIZJ(j6, "msg_id");
        LIZ3.LIZLLL(Integer.valueOf(this.LJLILLLLZI.LIZLLL), "error_code");
        LIZ3.LIZLLL(Integer.valueOf(this.LJLILLLLZI.LIZ ? 1 : 0), "spark_precreate_hit");
        LIZ3.LIZLLL(Integer.valueOf(C32257ClJ.LJFF()), "is_anchor");
        LIZ3.LIZLLL(this.LJLILLLLZI.LJ, "error_msg");
        LIZ3.LIZLLL("lynx_native", "player_type");
        LIZ3.LIZLLL(0, "play_fail_toast_show");
        LIZ3.LIZLLL(String.valueOf(this.LJLIL.LIZJ.LIZJ), "resource_url");
        LIZ3.LIZJ(this.LJLILLLLZI.LJFF, "play_dur");
        LIZ3.LIZJ(this.LJLILLLLZI.LJI, "play_ms");
        LIZ3.LIZLLL(Integer.valueOf((int) (this.LJLILLLLZI.LIZIZ * f)), "fps");
        LIZ3.LIZLLL(Integer.valueOf(i3), "gift_box_whole_status");
        LIZ3.LIZLLL(C1H.LJ(), "overload_score");
        if (jSONObject != null) {
            LIZ3.LJ(jSONObject);
        }
        LIZ3.LJI();
        if (this.LJLILLLLZI.LIZLLL != 0 && (LIZJ = C32257ClJ.LIZJ()) != null) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(C1XY.LJJIIZ("gift_effect_play_status"));
            LIZ4.append(this.LJLJJL);
            LIZJ.monitorEvent(X1D.LIZIZ(LIZ4), jSONObject2, jSONObject4, jSONObject3);
        }
        InterfaceC32251ClD LIZJ2 = C32257ClJ.LIZJ();
        if (LIZJ2 != null) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("gift_effect_play_status");
            LIZ5.append(this.LJLJJL);
            LIZJ2.monitorEvent(X1D.LIZIZ(LIZ5), jSONObject2, jSONObject4, jSONObject3);
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
