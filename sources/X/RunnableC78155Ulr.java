package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.ResourceModel;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.gift.render.model.Effect;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ulr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC78155Ulr implements Runnable {
    public final /* synthetic */ C78160Ulw LJLIL;
    public final /* synthetic */ Long LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;
    public final /* synthetic */ C78158Ulu LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Long LJLJJLL;
    public final /* synthetic */ AssetsModel LJLJL;

    public RunnableC78155Ulr(C78160Ulw c78160Ulw, Long l, Long l2, C78158Ulu c78158Ulu, String str, Long l3, AssetsModel assetsModel) {
        this.LJLIL = c78160Ulw;
        this.LJLILLLLZI = l;
        this.LJLJI = l2;
        this.LJLJJI = c78158Ulu;
        this.LJLJJL = str;
        this.LJLJJLL = l3;
        this.LJLJL = assetsModel;
    }

    public final void LIZ() {
        int i;
        int i2;
        Object obj;
        int i3;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i4;
        int i5;
        int i6;
        List<C32449CoP> list;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        ResourceModel resourceModel;
        List<String> list2;
        ResourceModel resourceModel2;
        List<String> list3;
        Long l;
        Long l2;
        java.util.Map<String, String> map;
        java.util.Map<String, String> map2;
        JSONObject jSONObject = new JSONObject();
        C78160Ulw c78160Ulw = this.LJLIL;
        boolean z = false;
        if (c78160Ulw != null && c78160Ulw.LJI) {
            i = 1;
        } else {
            i = 0;
        }
        JSONObject put = jSONObject.put("effect_load_status", i ^ 1);
        C78160Ulw c78160Ulw2 = this.LJLIL;
        if (c78160Ulw2 != null) {
            i2 = c78160Ulw2.LJFF;
        } else {
            i2 = 0;
        }
        JSONObject put2 = put.put("tray_position", i2);
        C78160Ulw c78160Ulw3 = this.LJLIL;
        Object obj6 = null;
        if (c78160Ulw3 != null) {
            obj = c78160Ulw3.LJIIL;
        } else {
            obj = null;
        }
        JSONObject put3 = put2.put("res_type", obj).put("is_anchor", C32257ClJ.LJFF());
        C78160Ulw c78160Ulw4 = this.LJLIL;
        if (c78160Ulw4 != null && c78160Ulw4.LIZJ) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        put3.put("is_own_send", i3);
        C78160Ulw c78160Ulw5 = this.LJLIL;
        if (c78160Ulw5 != null && (map2 = c78160Ulw5.LJ) != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        C78160Ulw c78160Ulw6 = this.LJLIL;
        long j7 = 0;
        if (c78160Ulw6 != null) {
            j = c78160Ulw6.LJII;
        } else {
            j = 0;
        }
        JSONObject put4 = jSONObject2.put("receive_play_end_dur", currentTimeMillis - j);
        C78160Ulw c78160Ulw7 = this.LJLIL;
        if (c78160Ulw7 != null) {
            j2 = c78160Ulw7.LJIIIIZZ;
        } else {
            j2 = 0;
        }
        JSONObject put5 = put4.put("send_receive_im_dur", j2);
        C78160Ulw c78160Ulw8 = this.LJLIL;
        if (c78160Ulw8 != null) {
            j3 = c78160Ulw8.LJIIIZ;
        } else {
            j3 = 0;
        }
        JSONObject put6 = put5.put("before_queue_dur", j3);
        C78160Ulw c78160Ulw9 = this.LJLIL;
        if (c78160Ulw9 != null) {
            j4 = c78160Ulw9.LJIIJ;
        } else {
            j4 = 0;
        }
        JSONObject put7 = put6.put("in_queue_dur", j4);
        Long l3 = this.LJLILLLLZI;
        if (l3 != null) {
            j5 = l3.longValue();
        } else {
            j5 = 0;
        }
        C78160Ulw c78160Ulw10 = this.LJLIL;
        if (c78160Ulw10 != null) {
            j6 = c78160Ulw10.LJIIJJI;
        } else {
            j6 = 0;
        }
        JSONObject put8 = put7.put("dequeue_first_frame_dur", (j5 - j6) - C31012CFc.LIZIZ);
        long currentTimeMillis2 = System.currentTimeMillis();
        Long l4 = this.LJLILLLLZI;
        if (l4 != null) {
            j7 = l4.longValue();
        }
        JSONObject put9 = put8.put("first_frame_play_end_dur", currentTimeMillis2 - j7).put("effect_id", this.LJLJI);
        C78160Ulw c78160Ulw11 = this.LJLIL;
        if (c78160Ulw11 != null && c78160Ulw11.LJI) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        JSONObject put10 = put9.put("resource_downloaded", i4 ^ 1);
        C78160Ulw c78160Ulw12 = this.LJLIL;
        if (c78160Ulw12 != null && c78160Ulw12.LJI) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        JSONObject put11 = put10.put("is_local", i5 ^ 1);
        C78160Ulw c78160Ulw13 = this.LJLIL;
        if (c78160Ulw13 != null) {
            i6 = c78160Ulw13.LJFF;
        } else {
            i6 = 0;
        }
        put11.put("tray_position", i6).put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        C78160Ulw c78160Ulw14 = this.LJLIL;
        if (c78160Ulw14 != null && (map = c78160Ulw14.LJ) != null) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                jSONObject2.put(entry2.getKey(), entry2.getValue());
            }
        }
        InterfaceC78172Um8 interfaceC78172Um8 = (InterfaceC78172Um8) this.LJLJJI.LIZ.LIZ(InterfaceC78172Um8.class);
        if (interfaceC78172Um8 != null) {
            list = interfaceC78172Um8.LIZ();
            if (list != null && (!list.isEmpty())) {
                z = true;
            }
        } else {
            list = null;
        }
        if (z) {
            JSONArray jSONArray = new JSONArray();
            for (C32449CoP c32449CoP : list) {
                JSONObject jSONObject3 = new JSONObject();
                Effect effect = c32449CoP.LIZ;
                if (effect != null) {
                    l = Long.valueOf(effect.assetId);
                } else {
                    l = null;
                }
                jSONObject3.put("effect_id", l);
                Effect effect2 = c32449CoP.LIZ;
                if (effect2 != null) {
                    l2 = Long.valueOf(effect2.giftId);
                } else {
                    l2 = null;
                }
                jSONObject3.put("gift_id", l2);
                jSONArray.put(jSONObject3);
            }
            jSONObject2.put("gift_box_info", jSONArray);
        }
        JSONObject jSONObject4 = new JSONObject();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("gift_render_start");
        LIZ.append(this.LJLJJL);
        C32255ClH LIZ2 = C32256ClI.LIZ(X1D.LIZIZ(LIZ));
        LIZ2.LJ(jSONObject);
        LIZ2.LJ(jSONObject2);
        LIZ2.LJ(jSONObject4);
        LIZ2.LIZLLL(this.LJLJI, "effect_id");
        LIZ2.LIZLLL(this.LJLJI, "asset_id");
        LIZ2.LIZLLL(this.LJLJJLL, "gift_id");
        C78160Ulw c78160Ulw15 = this.LJLIL;
        if (c78160Ulw15 == null || (obj2 = c78160Ulw15.LJIIL) == null) {
            obj2 = "unknown";
        }
        LIZ2.LIZLLL(obj2, "resources_format");
        C78160Ulw c78160Ulw16 = this.LJLIL;
        if (c78160Ulw16 != null) {
            obj3 = c78160Ulw16.LIZIZ;
        } else {
            obj3 = null;
        }
        LIZ2.LIZLLL(obj3, "log_id");
        C78160Ulw c78160Ulw17 = this.LJLIL;
        if (c78160Ulw17 != null) {
            obj4 = Long.valueOf(c78160Ulw17.LIZ);
        } else {
            obj4 = null;
        }
        LIZ2.LIZLLL(obj4, "msg_id");
        AssetsModel assetsModel = this.LJLJL;
        if (assetsModel != null && (resourceModel2 = assetsModel.resourceModel) != null && (list3 = resourceModel2.urlList) != null) {
            obj5 = ORZ.LJLLLL(list3);
        } else {
            obj5 = null;
        }
        LIZ2.LIZLLL(obj5, "resource_url");
        AssetsModel assetsModel2 = this.LJLJL;
        if (assetsModel2 != null && (resourceModel = assetsModel2.resourceByteVC1Model) != null && (list2 = resourceModel.urlList) != null) {
            obj6 = ORZ.LJLLLL(list2);
        }
        LIZ2.LIZLLL(obj6, "resource_bytevc1_url");
        LIZ2.LIZLLL(this.LJLILLLLZI, "play_ms");
        LIZ2.LIZIZ();
        LIZ2.LJI();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("gift_render_start");
        LIZ3.append(this.LJLJJL);
        C0K2.LJI(X1D.LIZIZ(LIZ3), jSONObject, jSONObject4, jSONObject2);
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
