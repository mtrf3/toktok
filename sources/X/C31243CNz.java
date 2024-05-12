package X;

import com.bytedance.android.live.browser.IBrowserService;
import kotlin.jvm.internal.o;

/* renamed from: X.CNz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31243CNz implements InterfaceC31935Cg7 {
    public final /* synthetic */ C31239CNv LJLIL;

    @Override // X.InterfaceC31935Cg7
    public final void LLLZIL() {
        InterfaceC25290yz interfaceC25290yz = this.LJLIL.LJIIIIZZ;
        if (interfaceC25290yz != null) {
            interfaceC25290yz.LIZJ();
        }
        C31239CNv c31239CNv = this.LJLIL;
        InterfaceC25290yz interfaceC25290yz2 = c31239CNv.LJIIIIZZ;
        if (interfaceC25290yz2 != null) {
            interfaceC25290yz2.LIZLLL(c31239CNv.LJ);
        }
        C31239CNv c31239CNv2 = this.LJLIL;
        c31239CNv2.LJ = "h5";
        c31239CNv2.LIZIZ();
        C31239CNv c31239CNv3 = this.LJLIL;
        String str = c31239CNv3.LIZIZ;
        if (str != null) {
            ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu();
            C30882CAc.LIZLLL(c31239CNv3.LJI, str);
        }
    }

    public C31243CNz(C31239CNv c31239CNv) {
        this.LJLIL = c31239CNv;
    }

    @Override // X.InterfaceC31935Cg7
    public final void Xh(VNS view) {
        o.LJIIIZ(view, "view");
        C31239CNv c31239CNv = this.LJLIL;
        InterfaceC25290yz interfaceC25290yz = c31239CNv.LJIIIIZZ;
        if (interfaceC25290yz != null) {
            interfaceC25290yz.LIZ(c31239CNv.LJ);
        }
    }
}
