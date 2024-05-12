package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Hj1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44855Hj1 extends AbstractC214518bP<CompileConfigResolution> {
    public final /* synthetic */ VEVideoEncodeConfigParams LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44855Hj1(CompileConfigResolution compileConfigResolution, VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        super(compileConfigResolution);
        this.LIZIZ = vEVideoEncodeConfigParams;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, CompileConfigResolution compileConfigResolution, CompileConfigResolution compileConfigResolution2) {
        String json;
        String json2;
        o.LJIIIZ(property, "property");
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        C44878HjO.LIZLLL(LIZ, "\nStrategyName : ", vEVideoEncodeConfigParams, '-', '-');
        if (C44847Hit.LIZLLL(LIZ, " ; \n--- property : ", property, " ; \n------ oldValue : ", CompileConfigResolution.class)) {
            json = String.valueOf(compileConfigResolution);
        } else {
            json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), compileConfigResolution);
        }
        if (C0DC.LJ(LIZ, json, " ; \n------ newValue : ", CompileConfigResolution.class)) {
            json2 = String.valueOf(compileConfigResolution2);
        } else {
            json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), compileConfigResolution2);
        }
        C44877HjN.LIZIZ(LIZ, json2, " ; \n", LIZ);
    }
}
