package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C1DH;
import X.C27943Axv;
import X.C70414RkI;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;

/* loaded from: classes13.dex */
public class AqS8S0111000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS8S0111000_12 aqS8S0111000_12, Object obj) {
        ProfileNaviEditorState setStateImmediate = (ProfileNaviEditorState) obj;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        if (aqS8S0111000_12.z1) {
            return ProfileNaviEditorState.copy$default(setStateImmediate, null, 0, null, null, null, ((Effect) aqS8S0111000_12.l0).getUnzipPath(), null, false, false, false, true, false, false, false, aqS8S0111000_12.i2, 15327, null);
        }
        return ProfileNaviEditorState.copy$default(setStateImmediate, null, 0, null, null, ((Effect) aqS8S0111000_12.l0).getUnzipPath(), null, null, false, false, false, true, false, false, false, aqS8S0111000_12.i2, 15343, null);
    }

    public static final Object invoke$1(AqS8S0111000_12 aqS8S0111000_12, Object obj) {
        String str;
        LaneParams update = (LaneParams) obj;
        o.LJIIIZ(update, "$this$update");
        HashMap<String, Object> trackParams = ((IPdpStarter.PdpEnterParam) aqS8S0111000_12.l0).getTrackParams();
        if (trackParams != null) {
            update.putAll(trackParams);
        }
        if (aqS8S0111000_12.z1) {
            str = "yes";
        } else {
            str = "no";
        }
        update.plusAssign("is_retry", str);
        update.plusAssign("is_check_passed", Integer.valueOf(C1DH.LJ(((IPdpStarter.PdpEnterParam) aqS8S0111000_12.l0).getTrackParams())));
        update.plusAssign("api_path", "/api/v1/shop/product_info/get");
        update.plusAssign("preload_type", Integer.valueOf(aqS8S0111000_12.i2));
        update.plusAssign("page_name", "product_detail");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS8S0111000_12 aqS8S0111000_12, Object obj) {
        Object obj2;
        String str;
        LaneParams update = (LaneParams) obj;
        o.LJIIIZ(update, "$this$update");
        update.putAll(((IPdpStarter.PdpEnterParam) aqS8S0111000_12.l0).getRequestParams());
        HashMap<String, Object> trackParams = ((IPdpStarter.PdpEnterParam) aqS8S0111000_12.l0).getTrackParams();
        if (trackParams != null) {
            update.putAll(trackParams);
        }
        HashMap<String, Object> trackParams2 = ((IPdpStarter.PdpEnterParam) aqS8S0111000_12.l0).getTrackParams();
        if (trackParams2 == null || (obj2 = trackParams2.get("click_product_start_time")) == null) {
            obj2 = -1L;
        }
        if ((obj2 instanceof Long) && !o.LJ(obj2, -1L)) {
            update.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj2).longValue()));
        }
        if (aqS8S0111000_12.z1) {
            str = "yes";
        } else {
            str = "no";
        }
        update.put("is_retry", str);
        update.put("preload_type", Integer.valueOf(aqS8S0111000_12.i2));
        update.put("api_path", "/api/v1/shop/product_info/get");
        if (!update.containsKey((Object) "page_name")) {
            update.put("page_name", "product_detail");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS8S0111000_12 aqS8S0111000_12, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS8S0111000_12.l0).LIZIZ);
        logNode.plusAssign("notice_number", Integer.valueOf(aqS8S0111000_12.i2));
        if (aqS8S0111000_12.z1) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        logNode.plusAssign("page_show_type", str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS8S0111000_12 aqS8S0111000_12, Object obj) {
        String str;
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS8S0111000_12.l0).LIZIZ);
        sendLogReturnParams.LIZJ("notice_number", Integer.valueOf(aqS8S0111000_12.i2));
        if (aqS8S0111000_12.z1) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        sendLogReturnParams.LIZJ("page_show_type", str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS8S0111000_12 aqS8S0111000_12, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS8S0111000_12.l0).LIZIZ);
        logNode.plusAssign("notice_number", Integer.valueOf(aqS8S0111000_12.i2));
        if (aqS8S0111000_12.z1) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        logNode.plusAssign("page_show_type", str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS8S0111000_12 aqS8S0111000_12, Object obj) {
        String str;
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS8S0111000_12.l0).LIZIZ);
        sendLogReturnParams.LIZJ("notice_number", Integer.valueOf(aqS8S0111000_12.i2));
        if (aqS8S0111000_12.z1) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        sendLogReturnParams.LIZJ("page_show_type", str);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S0111000_12(C70414RkI c70414RkI, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c70414RkI;
        this.i2 = i;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S0111000_12(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = pdpEnterParam;
        this.z1 = z;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS8S0111000_12(Effect effect, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.z1 = z;
        this.l0 = effect;
        this.i2 = i;
    }
}
