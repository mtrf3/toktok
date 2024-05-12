package Y;

import X.AbstractC66805QJt;
import X.B83;
import X.BZI;
import X.C0K2;
import X.C1H;
import X.C1XY;
import X.C28787BRn;
import X.C29374Bfu;
import X.C29824BnA;
import X.C2NU;
import X.C30725C4b;
import X.C31012CFc;
import X.C32255ClH;
import X.C32256ClI;
import X.C32257ClJ;
import X.C32341Cmf;
import X.C36616EYq;
import X.C76762UAs;
import X.C78076Uka;
import X.C78160Ulw;
import X.C78162Uly;
import X.C78166Um2;
import X.C78261UnZ;
import X.C78273Unl;
import X.C78575Usd;
import X.CN1;
import X.EnumC28999BZr;
import X.InterfaceC78387Upb;
import X.ORZ;
import X.QKY;
import X.U4R;
import X.U66;
import X.U7U;
import X.U9F;
import X.UA9;
import X.UC0;
import X.X1D;
import android.util.Pair;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.ResourceModel;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.gift.render.model.Effect;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS12S1200000_13 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    public final void LIZ$0() {
        Map map;
        long j;
        Object obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("gift_effect_downgrade");
        LIZ.append(this.s0);
        C32255ClH LIZ2 = C32256ClI.LIZ(X1D.LIZIZ(LIZ));
        C78160Ulw c78160Ulw = ((C78162Uly) this.l1).LIZ.LIZJ;
        Object obj2 = null;
        if (c78160Ulw != null) {
            map = c78160Ulw.LJ;
        } else {
            map = null;
        }
        LIZ2.LJFF(map);
        Effect effect = ((C78162Uly) this.l1).LIZ.LIZ;
        if (effect != null) {
            j = effect.LIZ().id;
        } else {
            j = 0;
        }
        LIZ2.LIZJ(j, "asset_id");
        Effect effect2 = ((C78162Uly) this.l1).LIZ.LIZ;
        if (effect2 != null) {
            obj = Long.valueOf(effect2.giftId);
        } else {
            obj = null;
        }
        LIZ2.LIZLLL(obj, "gift_id");
        Effect effect3 = ((C78162Uly) this.l1).LIZ.LIZ;
        if (effect3 != null) {
            obj2 = Integer.valueOf(effect3.LIZIZ);
        }
        LIZ2.LIZLLL(obj2, "gift_type");
        LIZ2.LIZLLL(Integer.valueOf(((C78166Um2) this.l2).LIZ), "downgrade_code");
        LIZ2.LIZLLL(((C78166Um2) this.l2).LIZIZ, "downgrade_reason");
        LIZ2.LIZLLL(((C78166Um2) this.l2).LIZJ, "from_player_type");
        LIZ2.LIZLLL(((C78166Um2) this.l2).LIZLLL, "to_player_type");
        LIZ2.LIZLLL(Integer.valueOf(C32257ClJ.LJFF()), "is_anchor");
        Float valueOf = Float.valueOf(C32257ClJ.LIZIZ().LJII);
        if (valueOf != null && !Float.isNaN(valueOf.floatValue()) && !Float.isInfinite(valueOf.floatValue())) {
            LIZ2.LIZJ.put("device_score", valueOf.toString());
        }
        LIZ2.LIZLLL(Integer.valueOf(((C78166Um2) this.l2).LJ ? 1 : 0), "spark_precreate_hit");
        LIZ2.LIZLLL(C1H.LJ(), "overload_score");
        LIZ2.LJI();
    }

    public final void LIZ$2() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enter monitorRtcUserJoined, remoteLinkMicId=");
        LIZ.append(this.s0);
        U4R.LIZLLL("LinkLayerRoomMonitor", X1D.LIZIZ(LIZ));
        JSONObject LJIJI = UC0.LJIJI((U66) this.l1);
        long LIZIZ = C31012CFc.LIZIZ();
        long currentTimeMillis = System.currentTimeMillis();
        C76762UAs c76762UAs = (C76762UAs) this.l2;
        c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S1300200_13(LIZIZ, currentTimeMillis, (U66) this.l1, c76762UAs, this.s0, LJIJI, 6));
    }

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
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$1() {
        String str;
        Object obj;
        Object obj2;
        int i;
        String str2;
        Object obj3;
        int i2;
        ResourceModel resourceModel;
        List<String> list;
        BZI LIZ = C28787BRn.LIZ("gift_effect_msg_load_status");
        ((C78076Uka) this.l1).getClass();
        LIZ.LJIJJ(0, "is_asset_local");
        ((C78076Uka) this.l1).getClass();
        LIZ.LJIJJ(0, "is_own_send");
        ((C78076Uka) this.l1).getClass();
        LIZ.LJIJJ(0L, "asset_id");
        LIZ.LJIJJ(String.valueOf(((EnumC28999BZr) this.l2).getErrorCode()), "error_code");
        LIZ.LJIJJ(this.s0, "error_msg");
        ((C78076Uka) this.l1).getClass();
        AssetsModel LIZ2 = C32341Cmf.LIZ(0L);
        if (LIZ2 != null) {
            str = LIZ2.getResourceFormat();
        } else {
            str = null;
        }
        LIZ.LJIJJ(str, "resources_format");
        ((C78076Uka) this.l1).getClass();
        AssetsModel LIZ3 = C32341Cmf.LIZ(0L);
        if (LIZ3 != null && (resourceModel = LIZ3.resourceByteVC1Model) != null && (list = resourceModel.urlList) != null) {
            obj = ORZ.LJLLLL(list);
        } else {
            obj = null;
        }
        LIZ.LJIJJ(obj, "resource_bytevc1_url");
        long LIZ4 = C30725C4b.LIZ();
        ((C78076Uka) this.l1).getClass();
        LIZ.LJIJJ(Long.valueOf(LIZ4 - 0), "asset_load_dur");
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Map map = (Map) dataChannelGlobal.mv0(C29824BnA.class);
        if (map == null || (obj2 = (String) map.get("anchor_id")) == null) {
            obj2 = 0;
        }
        if (!(obj2 instanceof Long) || currentUserId != ((Number) obj2).longValue()) {
            i = 0;
        } else {
            i = 1;
        }
        LIZ.LJIJJ(Integer.valueOf(i), "is_anchor");
        LIZ.LJIJJ(((C78076Uka) this.l1).LIZJ, "log_id");
        ((C78076Uka) this.l1).getClass();
        LIZ.LJIJJ(0L, "msg_id");
        LIZ.LJIJJ(C1H.LJ(), "overload_score");
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
        JSONObject jSONObject = new JSONObject();
        C78076Uka c78076Uka = (C78076Uka) this.l1;
        EnumC28999BZr enumC28999BZr = (EnumC28999BZr) this.l2;
        String str3 = this.s0;
        c78076Uka.getClass();
        JSONObject put = jSONObject.put("is_asset_local", 0).put("is_own_send", 0).put("asset_id", 0L).put("error_code", String.valueOf(enumC28999BZr.getErrorCode())).put("error_msg", str3);
        AssetsModel LIZ5 = C32341Cmf.LIZ(0L);
        if (LIZ5 != null) {
            str2 = LIZ5.getResourceFormat();
        } else {
            str2 = null;
        }
        JSONObject put2 = put.put("resources_format", str2);
        long currentUserId2 = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        Map map2 = (Map) dataChannelGlobal.mv0(C29824BnA.class);
        if (map2 == null || (obj3 = (String) map2.get("anchor_id")) == null) {
            obj3 = 0;
        }
        if (!(obj3 instanceof Long) || currentUserId2 != ((Number) obj3).longValue()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        put2.put("is_anchor", i2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("log_id", ((C78076Uka) this.l1).LIZJ).put("msg_id", 0L);
        JSONObject jSONObject3 = new JSONObject();
        C0K2.LJ(C1XY.LJJIIZ("ttlive_gift_effect_msg_load_status"), jSONObject, jSONObject3, jSONObject2);
        C0K2.LJI("ttlive_gift_effect_msg_load_status", jSONObject, jSONObject3, jSONObject2);
    }

    public final void LIZ$3() {
        boolean z;
        JSONObject LJIJI = UC0.LJIJI((U66) this.l1);
        long LIZIZ = C31012CFc.LIZIZ();
        long currentTimeMillis = System.currentTimeMillis();
        ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        C76762UAs c76762UAs = (C76762UAs) this.l2;
        c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S1310200_13(LIZIZ, currentTimeMillis, (U66) this.l1, c76762UAs, this.s0, LJIJI, z, 3));
    }

    public final void LIZ$4() {
        int i;
        QKY qky = new QKY();
        ArrayList arrayList = new ArrayList();
        Map map = (Map) this.l1;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
        try {
            ((InterfaceC78387Upb) this.l2).onResponse(AbstractC66805QJt.LIZ.LIZLLL(this.s0, arrayList, ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIIL, qky));
        } catch (Throwable th) {
            if (th instanceof C36616EYq) {
                i = th.getResponseCode();
            } else {
                i = -100;
            }
            InterfaceC78387Upb interfaceC78387Upb = (InterfaceC78387Upb) this.l2;
            AbsResult absResult = new AbsResult();
            absResult.withErrorCode(1);
            absResult.withDetailCode(i);
            absResult.withMessage(th.getMessage());
            interfaceC78387Upb.LIZ(absResult);
        }
    }

    public static final void run$0(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            aRunnableS12S1200000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            ((C78575Usd) aRunnableS12S1200000_13.l2).LIZIZ(aRunnableS12S1200000_13.s0, (JSONObject) aRunnableS12S1200000_13.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS12S1200000_13.l1).LJFF;
            if (u9f != null) {
                u9f.LJIJ(aRunnableS12S1200000_13.s0, (ILayerControl.ILayer) aRunnableS12S1200000_13.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS12S1200000_13.l1).LJFF;
            if (u9f != null) {
                u9f.LIZ((SurfaceView) aRunnableS12S1200000_13.l2, aRunnableS12S1200000_13.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS12S1200000_13.l1).LJFF;
            if (u9f != null) {
                u9f.LJJIL(aRunnableS12S1200000_13.s0, ((Boolean) aRunnableS12S1200000_13.l2).booleanValue());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS12S1200000_13.l1).LJFF;
            if (u9f != null) {
                u9f.LLF(aRunnableS12S1200000_13.s0, ((Boolean) aRunnableS12S1200000_13.l2).booleanValue());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            aRunnableS12S1200000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS12S1200000_13.l1);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS12S1200000_13.l2;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S1300200_13(LIZIZ, currentTimeMillis, (U66) aRunnableS12S1200000_13.l1, c76762UAs, aRunnableS12S1200000_13.s0, LJIJI, 0));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            JSONObject LJIJI = UC0.LJIJI((U66) aRunnableS12S1200000_13.l1);
            long LIZIZ = C31012CFc.LIZIZ();
            long currentTimeMillis = System.currentTimeMillis();
            C76762UAs c76762UAs = (C76762UAs) aRunnableS12S1200000_13.l2;
            c76762UAs.LIZLLL.LIZIZ(new ARunnableS0S1300200_13(LIZIZ, currentTimeMillis, (U66) aRunnableS12S1200000_13.l1, c76762UAs, aRunnableS12S1200000_13.s0, LJIJI, 1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            UA9.LJFF().LIZIZ(new ARunnableS0S1300200_13((U66) aRunnableS12S1200000_13.l1, aRunnableS12S1200000_13.s0, UC0.LJIJI((U66) aRunnableS12S1200000_13.l1), C31012CFc.LIZIZ(), System.currentTimeMillis(), (Boolean) aRunnableS12S1200000_13.l2, 2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            UA9.LJFF().LIZIZ(new ARunnableS0S1300200_13((U66) aRunnableS12S1200000_13.l1, aRunnableS12S1200000_13.s0, UC0.LJIJI((U66) aRunnableS12S1200000_13.l1), C31012CFc.LIZIZ(), System.currentTimeMillis(), (Boolean) aRunnableS12S1200000_13.l2, 3));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            aRunnableS12S1200000_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            aRunnableS12S1200000_13.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS12S1200000_13 aRunnableS12S1200000_13) {
        boolean LIZ;
        try {
            aRunnableS12S1200000_13.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS12S1200000_13(X.U66 r2, X.C76762UAs r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 3: goto L10;
                case 4: goto L10;
                case 5: goto L5;
                case 6: goto L5;
                case 7: goto L5;
                case 8: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r4
            r0.l1 = r2
            r0.l2 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r2
            r0.l2 = r3
            r0.s0 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS12S1200000_13.<init>(X.U66, X.UAs, java.lang.String, int):void");
    }

    public ARunnableS12S1200000_13(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
