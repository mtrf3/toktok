package X;

import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.5X7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5X7 extends AbstractC65781Prl implements InterfaceC88472Yns<EffectPlatformBuilder, C76800UCe> {
    public static final C5X7 LJLIL = new C5X7();

    public C5X7() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(EffectPlatformBuilder effectPlatformBuilder) {
        String LIZLLL;
        EffectPlatformBuilder effectplatform = effectPlatformBuilder;
        o.LJIIIZ(effectplatform, "$this$effectplatform");
        LIZLLL = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LIZLLL("");
        effectplatform.setCacheDir(new File(LIZLLL));
        return C76800UCe.LIZ;
    }
}
