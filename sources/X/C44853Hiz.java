package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.Hiz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44853Hiz extends AbstractC214518bP<VEVideoEncodeSettings.ENCODE_PRESET> {
    public final /* synthetic */ VEVideoEncodeConfigParams LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44853Hiz(VEVideoEncodeSettings.ENCODE_PRESET encode_preset, VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        super(encode_preset);
        this.LIZIZ = vEVideoEncodeConfigParams;
    }

    @Override // X.AbstractC214518bP
    public final void LIZJ(InterfaceC74236TBo<?> property, VEVideoEncodeSettings.ENCODE_PRESET encode_preset, VEVideoEncodeSettings.ENCODE_PRESET encode_preset2) {
        String json;
        String json2;
        o.LJIIIZ(property, "property");
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        C44878HjO.LIZLLL(LIZ, "\nStrategyName : ", vEVideoEncodeConfigParams, '-', '-');
        if (C44847Hit.LIZLLL(LIZ, " ; \n--- property : ", property, " ; \n------ oldValue : ", VEVideoEncodeSettings.ENCODE_PRESET.class)) {
            json = String.valueOf(encode_preset);
        } else {
            json = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), encode_preset);
        }
        if (C0DC.LJ(LIZ, json, " ; \n------ newValue : ", VEVideoEncodeSettings.ENCODE_PRESET.class)) {
            json2 = String.valueOf(encode_preset2);
        } else {
            json2 = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), encode_preset2);
        }
        C44877HjN.LIZIZ(LIZ, json2, " ; \n", LIZ);
    }
}
