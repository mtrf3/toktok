package X;

import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import defpackage.e1;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class XCI extends AbstractC65781Prl implements InterfaceC88472Yns<EffectConfiguration, C76800UCe> {
    public static final XCI LJLIL = new XCI();

    public XCI() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(EffectConfiguration effectConfiguration) {
        boolean LIZ;
        EffectConfiguration create = effectConfiguration;
        o.LJIIIZ(create, "$this$create");
        String dirPath = create.getEffectDir().getAbsolutePath();
        o.LJIIIIZZ(dirPath, "dirPath");
        if (C52531KjX.LIZ()) {
            LIZ = ((Boolean) C53164Ktk.LIZ.getValue()).booleanValue();
        } else {
            LIZ = e1.LIZ(31744, "use_effect_lru_cache", true, true);
        }
        if (LIZ && s.LJJJLZIJ(dirPath, "files/effect", false) && create.getDraftList() == null) {
            create.setDraftList(EffectPlatform.LJJJLIIL(false));
        }
        return C76800UCe.LIZ;
    }
}
