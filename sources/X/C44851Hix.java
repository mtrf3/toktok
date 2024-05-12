package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.Hix, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44851Hix extends AbstractC214518bP<VEVideoEncodeSettings.ENCODE_PROFILE> {
    public final /* synthetic */ VEVideoEncodeConfigParams LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44851Hix(VEVideoEncodeSettings.ENCODE_PROFILE encode_profile, VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        super(encode_profile);
        this.LIZIZ = vEVideoEncodeConfigParams;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, VEVideoEncodeSettings.ENCODE_PROFILE encode_profile, VEVideoEncodeSettings.ENCODE_PROFILE encode_profile2) {
        String json;
        String json2;
        o.LJIIIZ(property, "property");
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        C44878HjO.LIZLLL(LIZ, "\nStrategyName : ", vEVideoEncodeConfigParams, '-', '-');
        if (C44847Hit.LIZLLL(LIZ, " ; \n--- property : ", property, " ; \n------ oldValue : ", VEVideoEncodeSettings.ENCODE_PROFILE.class)) {
            json = String.valueOf(encode_profile);
        } else {
            json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), encode_profile);
        }
        if (C0DC.LJ(LIZ, json, " ; \n------ newValue : ", VEVideoEncodeSettings.ENCODE_PROFILE.class)) {
            json2 = String.valueOf(encode_profile2);
        } else {
            json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), encode_profile2);
        }
        C44877HjN.LIZIZ(LIZ, json2, " ; \n", LIZ);
    }
}
