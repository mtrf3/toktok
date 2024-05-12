package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.HjB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44865HjB extends AbstractC214518bP<Integer> {
    public final /* synthetic */ VEVideoEncodeConfigParams LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44865HjB(Object obj, VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        super(obj);
        this.LIZIZ = vEVideoEncodeConfigParams;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, Integer num, Integer num2) {
        String LIZJ;
        String LIZJ2;
        o.LJIIIZ(property, "property");
        Integer num3 = num2;
        Integer num4 = num;
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        C44878HjO.LIZLLL(LIZ, "\nStrategyName : ", vEVideoEncodeConfigParams, '-', '-');
        if (C44847Hit.LIZLLL(LIZ, " ; \n--- property : ", property, " ; \n------ oldValue : ", Integer.class)) {
            LIZJ = String.valueOf(num4);
        } else {
            LIZJ = T28.LIZJ(num4);
        }
        if (C0DC.LJ(LIZ, LIZJ, " ; \n------ newValue : ", Integer.class)) {
            LIZJ2 = String.valueOf(num3);
        } else {
            LIZJ2 = T28.LIZJ(num3);
        }
        C44877HjN.LIZIZ(LIZ, LIZJ2, " ; \n", LIZ);
    }
}
