package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Hiy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44852Hiy extends AbstractC214518bP<Long> {
    public final /* synthetic */ VEVideoEncodeConfigParams LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44852Hiy(Object obj, VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        super(obj);
        this.LIZIZ = vEVideoEncodeConfigParams;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, Long l, Long l2) {
        String json;
        String json2;
        o.LJIIIZ(property, "property");
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        C44878HjO.LIZLLL(LIZ, "\nStrategyName : ", vEVideoEncodeConfigParams, '-', '-');
        if (C44847Hit.LIZLLL(LIZ, " ; \n--- property : ", property, " ; \n------ oldValue : ", Long.class)) {
            json = String.valueOf(l);
        } else {
            json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), l);
        }
        if (C0DC.LJ(LIZ, json, " ; \n------ newValue : ", Long.class)) {
            json2 = String.valueOf(l2);
        } else {
            json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), l2);
        }
        C44877HjN.LIZIZ(LIZ, json2, " ; \n", LIZ);
    }
}
