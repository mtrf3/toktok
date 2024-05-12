package X;

import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.6ZP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZP extends AbstractC65781Prl implements InterfaceC88472Yns<EffectPlatformBuilder, C76800UCe> {
    public static final C6ZP LJLIL = new C6ZP();

    public C6ZP() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(EffectPlatformBuilder effectPlatformBuilder) {
        String LJI;
        EffectPlatformBuilder effectplatform = effectPlatformBuilder;
        o.LJIIIZ(effectplatform, "$this$effectplatform");
        LJI = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJI("");
        effectplatform.setCacheDir(new File(LJI));
        return C76800UCe.LIZ;
    }
}
