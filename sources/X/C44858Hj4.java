package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.Hj4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44858Hj4 extends AbstractC214518bP<VEVideoEncodeSettings.ENCODE_STANDARD> {
    public final /* synthetic */ VEVideoEncodeConfigParams LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44858Hj4(VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        super(null);
        this.LIZIZ = vEVideoEncodeConfigParams;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, VEVideoEncodeSettings.ENCODE_STANDARD encode_standard, VEVideoEncodeSettings.ENCODE_STANDARD encode_standard2) {
        String json;
        String json2;
        o.LJIIIZ(property, "property");
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        C44878HjO.LIZLLL(LIZ, "\nStrategyName : ", vEVideoEncodeConfigParams, '-', '-');
        if (C44847Hit.LIZLLL(LIZ, " ; \n--- property : ", property, " ; \n------ oldValue : ", VEVideoEncodeSettings.ENCODE_STANDARD.class)) {
            json = String.valueOf(encode_standard);
        } else {
            json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), encode_standard);
        }
        if (C0DC.LJ(LIZ, json, " ; \n------ newValue : ", VEVideoEncodeSettings.ENCODE_STANDARD.class)) {
            json2 = String.valueOf(encode_standard2);
        } else {
            json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), encode_standard2);
        }
        C44877HjN.LIZIZ(LIZ, json2, " ; \n", LIZ);
    }
}
