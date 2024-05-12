package X;

import com.ss.ugc.effectplatform.model.net.GetCustomizedEffectIDData;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ET6 implements XDR<GetCustomizedEffectIDData> {
    public final /* synthetic */ InterfaceC67352kd<String> LIZ;

    public ET6(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.XDR
    public final void onSuccess(GetCustomizedEffectIDData getCustomizedEffectIDData) {
        GetCustomizedEffectIDData response = getCustomizedEffectIDData;
        o.LJIIIZ(response, "response");
        InterfaceC67352kd<String> interfaceC67352kd = this.LIZ;
        String effect_id = response.getEffect_id();
        C3C5.m7constructorimpl(effect_id);
        interfaceC67352kd.resumeWith(effect_id);
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(GetCustomizedEffectIDData getCustomizedEffectIDData) {
    }

    @Override // X.XDR
    public final void onFail(GetCustomizedEffectIDData getCustomizedEffectIDData, C84418XBe exception) {
        o.LJIIIZ(exception, "exception");
        H78.LIZLLL("JEFF", exception.LIZJ);
        InterfaceC67352kd<String> interfaceC67352kd = this.LIZ;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }
}
