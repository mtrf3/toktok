package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Mqx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58087Mqx extends AbstractC65781Prl implements InterfaceC88472Yns<M4B, C76800UCe> {
    public static final C58087Mqx LJLIL = new C58087Mqx();

    public C58087Mqx() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(M4B m4b) {
        M4B trackerConfig = m4b;
        o.LJIIIZ(trackerConfig, "$this$trackerConfig");
        String lowerCase = EnumC58085Mqv.HOMEPAGE_HOT.toString().toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        trackerConfig.LIZ = lowerCase;
        return C76800UCe.LIZ;
    }
}
