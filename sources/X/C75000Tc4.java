package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tc4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75000Tc4<T> implements InterfaceC64592gB {
    public final /* synthetic */ EnumC74929Tav LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC75014TcI LJLJI;
    public final /* synthetic */ C74996Tc0 LJLJJI;

    public C75000Tc4(EnumC74929Tav enumC74929Tav, String str, InterfaceC75014TcI interfaceC75014TcI, C74996Tc0 c74996Tc0) {
        this.LJLIL = enumC74929Tav;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC75014TcI;
        this.LJLJJI = c74996Tc0;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C28467BFf it = (C28467BFf) obj;
        o.LJIIIIZZ(it, "it");
        if (C74947TbD.LJIJI(it)) {
            EnumC74929Tav enumC74929Tav = this.LJLIL;
            if (enumC74929Tav == EnumC74929Tav.FROM_MULTI_GUEST_GIFT_LEAF) {
                C74824TYe.LIZ.LJJIFFI(3, Long.valueOf(C74998Tc2.LIZJ(this.LJLILLLLZI)).toString(), "cancel_enlarge");
            } else if (enumC74929Tav == EnumC74929Tav.FROM_HOST_ZOOM_SELF) {
                C74824TYe.LIZ.LJJI(1, "enlarge");
            }
            InterfaceC75014TcI interfaceC75014TcI = this.LJLJI;
            if (interfaceC75014TcI != null) {
                interfaceC75014TcI.LIZIZ(this.LJLILLLLZI);
                return;
            }
            return;
        }
        this.LJLJJI.LJIIIIZZ(null, this.LJLJI, this.LJLILLLLZI, it.statusCode, it.LJ.message);
    }
}
