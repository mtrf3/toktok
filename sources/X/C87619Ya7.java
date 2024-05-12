package X;

import kotlin.jvm.internal.AqS147S0200000_16;
import kotlin.jvm.internal.AqS182S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Ya7, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87619Ya7 extends AbstractC65781Prl implements InterfaceC88472Yns<C41875Gc3, C76800UCe> {
    public final /* synthetic */ C87618Ya6 LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ EnumC43531H6p LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87619Ya7(C87618Ya6 c87618Ya6, Object obj, EnumC43531H6p enumC43531H6p) {
        super(1);
        this.LJLIL = c87618Ya6;
        this.LJLILLLLZI = obj;
        this.LJLJI = enumC43531H6p;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C41875Gc3 c41875Gc3) {
        C41875Gc3 it = c41875Gc3;
        o.LJIIIZ(it, "it");
        C87612Ya0 c87612Ya0 = this.LJLIL.LIZ;
        C87613Ya1 c87613Ya1 = c87612Ya0.LIZ;
        C41871Gbz c41871Gbz = new C41871Gbz(it, c87612Ya0.LJII, this.LJLILLLLZI);
        EnumC43531H6p dispatchPath = this.LJLJI;
        c87613Ya1.getClass();
        o.LJIIIZ(dispatchPath, "dispatchPath");
        C87614Ya2 c87614Ya2 = c87613Ya1.LIZJ;
        if (c87614Ya2 != null) {
            c87614Ya2.LJII(c41871Gbz);
            int i = C43532H6q.LIZ[dispatchPath.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 4) {
                        for (C87612Ya0 c87612Ya02 : c87613Ya1.LIZIZ) {
                            Object info = c41871Gbz.LIZJ;
                            c87612Ya02.getClass();
                            o.LJIIIZ(info, "info");
                            c87612Ya02.LJ("onMsg", new AqS147S0200000_16(c87612Ya02, info, 10));
                        }
                    }
                } else {
                    C87614Ya2 c87614Ya22 = c87613Ya1.LIZJ;
                    if (c87614Ya22 != null) {
                        c87614Ya22.LJIIIZ(new AqS182S0100000_16(c41871Gbz, 9), true);
                    } else {
                        o.LJIJI("net");
                        throw null;
                    }
                }
            } else {
                C87614Ya2 c87614Ya23 = c87613Ya1.LIZJ;
                if (c87614Ya23 != null) {
                    C87622YaA.LIZ(c87614Ya23, new AqS182S0100000_16(c41871Gbz, 8));
                } else {
                    o.LJIJI("net");
                    throw null;
                }
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("net");
        throw null;
    }
}
