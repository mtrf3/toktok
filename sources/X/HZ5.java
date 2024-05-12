package X;

import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HZ5 extends AbstractC65781Prl implements InterfaceC88472Yns<EffectPlatformBuilder, C76800UCe> {
    public static final HZ5 LJLIL = new HZ5();

    public HZ5() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(EffectPlatformBuilder effectPlatformBuilder) {
        EffectPlatformBuilder effectplatform = effectPlatformBuilder;
        o.LJIIIZ(effectplatform, "$this$effectplatform");
        effectplatform.setEnableKNEffectPlatform(true);
        return C76800UCe.LIZ;
    }
}
