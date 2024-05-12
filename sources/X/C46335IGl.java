package X;

import Y.ARunnableS44S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.IGl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46335IGl extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC46334IGk, C76800UCe> {
    public static final C46335IGl LJLIL = new C46335IGl();

    public C46335IGl() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC46334IGk interfaceC46334IGk) {
        InterfaceC46334IGk preloader = interfaceC46334IGk;
        o.LJIIIZ(preloader, "preloader");
        C38995FSd.LIZJ().submit(new ARunnableS44S0100000_8(preloader, 201));
        return C76800UCe.LIZ;
    }
}
