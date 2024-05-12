package Y;

import X.C0K2;
import X.C1H;
import X.C1XY;
import X.C31012CFc;
import X.C32240Cl2;
import X.C32255ClH;
import X.C32256ClI;
import X.C32257ClJ;
import X.C32260ClM;
import X.C76762UAs;
import X.C77413UZt;
import X.C78160Ulw;
import X.C78161Ulx;
import X.C78163Ulz;
import X.InterfaceC32251ClD;
import X.InterfaceC32258ClK;
import X.ORZ;
import X.U66;
import X.UC0;
import X.X1D;
import android.util.Log;
import com.bytedance.android.livesdk.gift.assets.ResourceModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS2S1210000_13 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean z;
        int i;
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Map map;
        int i3;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        List<String> list;
        Map<String, String> map2;
        List<String> list2;
        Map<String, String> map3;
        C32240Cl2 roomInfo;
        C78163Ulz c78163Ulz = (C78163Ulz) this.l1;
        Object obj13 = 0;
        if (c78163Ulz != null && c78163Ulz.LIZ == -11) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C78161Ulx c78161Ulx = (C78161Ulx) this.l2;
            String str = this.s0;
            Long valueOf = Long.valueOf(c78161Ulx.LIZIZ.giftId);
            Long valueOf2 = Long.valueOf(((C78161Ulx) this.l2).LIZIZ.LIZ().id);
            HashMap hashMap = new HashMap();
            hashMap.put("gift_id", valueOf);
            hashMap.put("asset_id", valueOf2);
            InterfaceC32258ClK interfaceC32258ClK = (InterfaceC32258ClK) C32260ClM.LIZ(InterfaceC32258ClK.class);
            if (interfaceC32258ClK != null && (roomInfo = interfaceC32258ClK.getRoomInfo()) != null) {
                hashMap.put("room_type", Integer.valueOf(roomInfo.LIZ));
                hashMap.put("room_id", Long.valueOf(roomInfo.LIZIZ));
                hashMap.put("anchor_id", Long.valueOf(roomInfo.LIZJ));
            }
            InterfaceC32251ClD LIZJ = C32257ClJ.LIZJ();
            if (LIZJ != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ttlive_asset_id_not_found");
                LIZ.append(str);
                LIZJ.monitorStatus(C1XY.LJJIIZ(X1D.LIZIZ(LIZ)), 1, C32257ClJ.LJII(hashMap));
            }
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject put = jSONObject.put("is_asset_local", ((C78161Ulx) this.l2).LIZLLL ? 1 : 0);
        C78160Ulw c78160Ulw = ((C78161Ulx) this.l2).LIZ;
        if (c78160Ulw != null && c78160Ulw.LIZJ) {
            i = 1;
        } else {
            i = 0;
        }
        JSONObject put2 = put.put("is_own_send", i).put("is_anchor", C32257ClJ.LJFF());
        if (!this.z3) {
            C78163Ulz c78163Ulz2 = (C78163Ulz) this.l1;
            if (c78163Ulz2 != null) {
                obj = Integer.valueOf(c78163Ulz2.LIZ);
            } else {
                obj = null;
            }
        } else {
            obj = obj13;
        }
        JSONObject put3 = put2.put("error_code", obj);
        Object obj14 = "";
        if (this.z3) {
            obj2 = "";
        } else {
            C78163Ulz c78163Ulz3 = (C78163Ulz) this.l1;
            if (c78163Ulz3 != null) {
                obj2 = c78163Ulz3.LIZIZ;
            } else {
                obj2 = null;
            }
        }
        put3.put("error_msg", obj2);
        C78160Ulw c78160Ulw2 = ((C78161Ulx) this.l2).LIZ;
        if (c78160Ulw2 != null && (map3 = c78160Ulw2.LJ) != null) {
            for (Map.Entry<String, String> entry : map3.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("asset_load_dur", C32257ClJ.LIZLLL().LIZ() - ((C78161Ulx) this.l2).LIZJ);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject put4 = jSONObject3.put("is_asset_local", ((C78161Ulx) this.l2).LIZLLL ? 1 : 0);
        C78160Ulw c78160Ulw3 = ((C78161Ulx) this.l2).LIZ;
        if (c78160Ulw3 != null && c78160Ulw3.LIZJ) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        JSONObject put5 = put4.put("is_own_send", i2).put("asset_id", ((C78161Ulx) this.l2).LIZIZ.LIZ().id);
        if (!this.z3) {
            C78163Ulz c78163Ulz4 = (C78163Ulz) this.l1;
            if (c78163Ulz4 != null) {
                obj3 = Integer.valueOf(c78163Ulz4.LIZ);
            } else {
                obj3 = null;
            }
        } else {
            obj3 = obj13;
        }
        JSONObject put6 = put5.put("error_code", obj3);
        if (this.z3) {
            obj4 = "";
        } else {
            C78163Ulz c78163Ulz5 = (C78163Ulz) this.l1;
            if (c78163Ulz5 != null) {
                obj4 = c78163Ulz5.LIZIZ;
            } else {
                obj4 = null;
            }
        }
        JSONObject put7 = put6.put("error_msg", obj4);
        C78163Ulz c78163Ulz6 = (C78163Ulz) this.l1;
        if (c78163Ulz6 == null || c78163Ulz6.LIZJ == null) {
            obj5 = "";
        } else {
            obj5 = Log.getStackTraceString(c78163Ulz6.LIZJ);
        }
        JSONObject put8 = put7.put("error_stack", obj5).put("resources_format", ((C78161Ulx) this.l2).LIZIZ.LIZ().getResourceFormat());
        ResourceModel resourceModel = ((C78161Ulx) this.l2).LIZIZ.LIZ().resourceByteVC1Model;
        if (resourceModel != null && (list2 = resourceModel.urlList) != null) {
            obj6 = ORZ.LJLLLL(list2);
        } else {
            obj6 = null;
        }
        JSONObject put9 = put8.put("resource_bytevc1_url", obj6).put("asset_load_dur", C32257ClJ.LIZLLL().LIZ() - ((C78161Ulx) this.l2).LIZJ).put("is_anchor", C32257ClJ.LJFF());
        C78160Ulw c78160Ulw4 = ((C78161Ulx) this.l2).LIZ;
        if (c78160Ulw4 != null) {
            obj7 = c78160Ulw4.LIZIZ;
        } else {
            obj7 = null;
        }
        JSONObject put10 = put9.put("log_id", obj7);
        C78160Ulw c78160Ulw5 = ((C78161Ulx) this.l2).LIZ;
        if (c78160Ulw5 != null) {
            obj8 = Long.valueOf(c78160Ulw5.LIZ);
        } else {
            obj8 = null;
        }
        put10.put("msg_id", obj8);
        C78160Ulw c78160Ulw6 = ((C78161Ulx) this.l2).LIZ;
        if (c78160Ulw6 != null) {
            C77413UZt.LJ(c78160Ulw6, jSONObject3);
        }
        C78160Ulw c78160Ulw7 = ((C78161Ulx) this.l2).LIZ;
        if (c78160Ulw7 != null && (map2 = c78160Ulw7.LJ) != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("gift_effect_msg_load_status");
        LIZ2.append(this.s0);
        C32255ClH LIZ3 = C32256ClI.LIZ(X1D.LIZIZ(LIZ2));
        C78160Ulw c78160Ulw8 = ((C78161Ulx) this.l2).LIZ;
        if (c78160Ulw8 != null) {
            map = c78160Ulw8.LJ;
        } else {
            map = null;
        }
        LIZ3.LJFF(map);
        LIZ3.LJ(jSONObject3);
        LIZ3.LIZLLL(Integer.valueOf(((C78161Ulx) this.l2).LIZLLL ? 1 : 0), "is_asset_local");
        C78160Ulw c78160Ulw9 = ((C78161Ulx) this.l2).LIZ;
        if (c78160Ulw9 != null && c78160Ulw9.LIZJ) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        LIZ3.LIZLLL(Integer.valueOf(i3), "is_own_send");
        LIZ3.LIZJ(((C78161Ulx) this.l2).LIZIZ.LIZ().id, "asset_id");
        if (!this.z3) {
            C78163Ulz c78163Ulz7 = (C78163Ulz) this.l1;
            if (c78163Ulz7 != null) {
                obj13 = Integer.valueOf(c78163Ulz7.LIZ);
            } else {
                obj13 = null;
            }
        }
        LIZ3.LIZLLL(obj13, "error_code");
        if (this.z3) {
            obj9 = "";
        } else {
            C78163Ulz c78163Ulz8 = (C78163Ulz) this.l1;
            if (c78163Ulz8 != null) {
                obj9 = c78163Ulz8.LIZIZ;
            } else {
                obj9 = null;
            }
        }
        LIZ3.LIZLLL(obj9, "error_msg");
        C78163Ulz c78163Ulz9 = (C78163Ulz) this.l1;
        if (c78163Ulz9 != null && c78163Ulz9.LIZJ != null) {
            obj14 = Log.getStackTraceString(c78163Ulz9.LIZJ);
        }
        LIZ3.LIZLLL(obj14, "error_stack");
        LIZ3.LIZLLL(((C78161Ulx) this.l2).LIZIZ.LIZ().getResourceFormat(), "resources_format");
        ResourceModel resourceModel2 = ((C78161Ulx) this.l2).LIZIZ.LIZ().resourceByteVC1Model;
        if (resourceModel2 != null && (list = resourceModel2.urlList) != null) {
            obj10 = ORZ.LJLLLL(list);
        } else {
            obj10 = null;
        }
        LIZ3.LIZLLL(obj10, "resource_bytevc1_url");
        LIZ3.LIZJ(C32257ClJ.LIZLLL().LIZ() - ((C78161Ulx) this.l2).LIZJ, "asset_load_dur");
        LIZ3.LIZLLL(Integer.valueOf(C32257ClJ.LJFF()), "is_anchor");
        C78160Ulw c78160Ulw10 = ((C78161Ulx) this.l2).LIZ;
        if (c78160Ulw10 != null) {
            obj11 = c78160Ulw10.LIZIZ;
        } else {
            obj11 = null;
        }
        LIZ3.LIZLLL(obj11, "log_id");
        C78160Ulw c78160Ulw11 = ((C78161Ulx) this.l2).LIZ;
        if (c78160Ulw11 != null) {
            obj12 = Long.valueOf(c78160Ulw11.LIZ);
        } else {
            obj12 = null;
        }
        LIZ3.LIZLLL(obj12, "msg_id");
        LIZ3.LIZLLL(C1H.LJ(), "overload_score");
        LIZ3.LIZIZ();
        LIZ3.LJI();
        if (!this.z3) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(C1XY.LJJIIZ("ttlive_gift_effect_msg_load_status"));
            LIZ4.append(this.s0);
            C0K2.LJ(X1D.LIZIZ(LIZ4), jSONObject, jSONObject2, jSONObject3);
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("ttlive_gift_effect_msg_load_status");
        LIZ5.append(this.s0);
        C0K2.LJI(X1D.LIZIZ(LIZ5), jSONObject, jSONObject2, jSONObject3);
    }

    public static final void run$0(ARunnableS2S1210000_13 aRunnableS2S1210000_13) {
        boolean LIZ;
        try {
            aRunnableS2S1210000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S1210000_13 aRunnableS2S1210000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS2S1210000_13.l1);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS2S1210000_13.l2;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S1310200_13(LIZIZ, currentTimeMillis, (U66) aRunnableS2S1210000_13.l1, c76762UAs, aRunnableS2S1210000_13.s0, LJIJI, aRunnableS2S1210000_13.z3, 0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S1210000_13 aRunnableS2S1210000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS2S1210000_13.l1);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS2S1210000_13.l2;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S1310200_13(LIZIZ, currentTimeMillis, (U66) aRunnableS2S1210000_13.l1, c76762UAs, aRunnableS2S1210000_13.s0, LJIJI, aRunnableS2S1210000_13.z3, 1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S1210000_13(Object obj, Object obj2, boolean z, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.z3 = z;
        this.s0 = str;
    }
}
