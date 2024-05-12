package X;

import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.X0h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84135X0h implements X9B {
    public final /* synthetic */ EffectPlatformBuilder LIZ;

    @Override // X.X9B
    public final java.util.Map<String, String> getExtraParams() {
        if (((Boolean) C52836KoS.LIZ.getValue()).booleanValue() && System.currentTimeMillis() - EffectPlatformFactory.LIZIZ > ((Number) C52526KjS.LIZ.getValue()).longValue() * 1000) {
            InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(C1DH.LJJJIL(this.LIZ.getAppID()));
            HashMap<String, String> hashMap = new HashMap<>();
            LIZIZ.LJIILL(hashMap);
            ConcurrentHashMap<String, String> concurrentHashMap = EffectPlatformFactory.LIZ;
            String LJLILLLLZI = C78880UxY.LJLILLLLZI(hashMap);
            o.LJIIIIZZ(LJLILLLLZI, "toJson(info)");
            concurrentHashMap.put("bytebench_param", LJLILLLLZI);
            EffectPlatformFactory.LIZIZ = System.currentTimeMillis();
        }
        return EffectPlatformFactory.LIZ;
    }

    public C84135X0h(EffectPlatformBuilder effectPlatformBuilder) {
        this.LIZ = effectPlatformBuilder;
    }
}
