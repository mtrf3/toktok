package X;

import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDData;
import kotlin.jvm.internal.AqS73S1100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ET7 implements XDR<GetCustomizedEffectIDData> {
    public final /* synthetic */ ET4 LIZ;

    public ET7(ET4 et4) {
        this.LIZ = et4;
    }

    @Override // X.XDR
    public final void onSuccess(GetCustomizedEffectIDData getCustomizedEffectIDData) {
        GetCustomizedEffectIDData response = getCustomizedEffectIDData;
        o.LJIIIZ(response, "response");
        String effect_id = response.getEffect_id();
        if (effect_id != null) {
            C43045Guv.LIZLLL(new AqS73S1100000_6(this.LIZ, effect_id, 6), 0L);
        }
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(GetCustomizedEffectIDData getCustomizedEffectIDData) {
    }

    @Override // X.XDR
    public final void onFail(GetCustomizedEffectIDData getCustomizedEffectIDData, C84418XBe exception) {
        o.LJIIIZ(exception, "exception");
        H78.LIZLLL("DiyProp", exception.LIZJ);
    }
}
