package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.HjI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44872HjI extends AbstractC214518bP<Boolean> {
    public final /* synthetic */ VEVideoEncodeConfigParams LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44872HjI(Object obj, VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        super(obj);
        this.LIZIZ = vEVideoEncodeConfigParams;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, Boolean bool, Boolean bool2) {
        String LIZ;
        String LIZ2;
        o.LJIIIZ(property, "property");
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this.LIZIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        C44878HjO.LIZLLL(LIZ3, "\nStrategyName : ", vEVideoEncodeConfigParams, '-', '-');
        if (C44847Hit.LIZLLL(LIZ3, " ; \n--- property : ", property, " ; \n------ oldValue : ", Boolean.class)) {
            LIZ = String.valueOf(bool4);
        } else {
            LIZ = C44877HjN.LIZ(bool4);
        }
        if (C0DC.LJ(LIZ3, LIZ, " ; \n------ newValue : ", Boolean.class)) {
            LIZ2 = String.valueOf(bool3);
        } else {
            LIZ2 = C44877HjN.LIZ(bool3);
        }
        C44877HjN.LIZIZ(LIZ3, LIZ2, " ; \n", LIZ3);
    }
}
