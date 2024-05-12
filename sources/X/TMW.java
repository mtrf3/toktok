package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TMW implements TMV<EffectCategoryResponse> {
    public final InterfaceC65784Pro<InterfaceC84497XEf> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public TMW(InterfaceC65784Pro<? extends InterfaceC84497XEf> effectPlatform) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZ = effectPlatform;
    }

    @Override // X.TMV
    public final C73805Sxt LIZ(TFO tfo) {
        AbstractC73672Svk<Object> request = new TMZ(this.LIZ, new AqS162S0100000_12(tfo, 1186)).request();
        if (C82894Wg6.LIZIZ.LIZ()) {
            request = request.LJJJ(T16.LIZIZ);
        }
        return request.LJJIJL(C73343SqR.LJLJJLL);
    }
}
