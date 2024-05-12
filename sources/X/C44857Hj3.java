package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.vesdk.VEWatermarkParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Hj3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44857Hj3 extends AbstractC214518bP<VEWatermarkParam> {
    public final /* synthetic */ VEVideoEncodeConfigParams LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44857Hj3(VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        super(null);
        this.LIZIZ = vEVideoEncodeConfigParams;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, VEWatermarkParam vEWatermarkParam, VEWatermarkParam vEWatermarkParam2) {
        String json;
        String json2;
        o.LJIIIZ(property, "property");
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        C44878HjO.LIZLLL(LIZ, "\nStrategyName : ", vEVideoEncodeConfigParams, '-', '-');
        if (C44847Hit.LIZLLL(LIZ, " ; \n--- property : ", property, " ; \n------ oldValue : ", VEWatermarkParam.class)) {
            json = String.valueOf(vEWatermarkParam);
        } else {
            json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), vEWatermarkParam);
        }
        if (C0DC.LJ(LIZ, json, " ; \n------ newValue : ", VEWatermarkParam.class)) {
            json2 = String.valueOf(vEWatermarkParam2);
        } else {
            json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), vEWatermarkParam2);
        }
        C44877HjN.LIZIZ(LIZ, json2, " ; \n", LIZ);
    }
}
