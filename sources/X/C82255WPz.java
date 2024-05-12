package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WPz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82255WPz extends AbstractC65781Prl implements InterfaceC88472Yns<C82252WPw, C76800UCe> {
    public static final C82255WPz LJLIL = new C82255WPz();

    public C82255WPz() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C82252WPw c82252WPw) {
        C82252WPw config = c82252WPw;
        o.LJIIIZ(config, "config");
        EnumC46516INk enumC46516INk = EnumC46516INk.Circle;
        o.LJIIIZ(enumC46516INk, "<set-?>");
        config.LIZ = enumC46516INk;
        config.LIZIZ = true;
        config.LIZJ = false;
        return C76800UCe.LIZ;
    }
}
