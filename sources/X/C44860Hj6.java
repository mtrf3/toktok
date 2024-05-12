package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Hj6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44860Hj6 extends AbstractC214518bP<Float> {
    public final /* synthetic */ VEVideoEncodeConfigParams LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44860Hj6(Object obj, VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        super(obj);
        this.LIZIZ = vEVideoEncodeConfigParams;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, Float f, Float f2) {
        String json;
        String json2;
        o.LJIIIZ(property, "property");
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        C44878HjO.LIZLLL(LIZ, "\nStrategyName : ", vEVideoEncodeConfigParams, '-', '-');
        if (C44847Hit.LIZLLL(LIZ, " ; \n--- property : ", property, " ; \n------ oldValue : ", Float.class)) {
            json = String.valueOf(f);
        } else {
            json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), f);
        }
        if (C0DC.LJ(LIZ, json, " ; \n------ newValue : ", Float.class)) {
            json2 = String.valueOf(f2);
        } else {
            json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), f2);
        }
        C44877HjN.LIZIZ(LIZ, json2, " ; \n", LIZ);
    }
}
