package X;

import android.content.Context;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.List;

/* renamed from: X.Ia4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46848Ia4 extends TTVideoEngine {
    public final C47779Ip5 LJIJI;
    public final C46851Ia7 LJIJJ;
    public final C46849Ia5 LJIJJLI;
    public final C46847Ia3 LJIL;

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public void LLIIIJ(C46886Iag c46886Iag) {
        super.LLIIIJ(c46886Iag);
        if (c46886Iag != null) {
            float f = c46886Iag.LIZLLL;
            if (f > 0.0f) {
                C46847Ia3 c46847Ia3 = this.LJIL;
                Float valueOf = Float.valueOf(f);
                c46847Ia3.getClass();
                for (Object obj : (List) c46847Ia3.LJLIL) {
                    if (obj != null) {
                        ((IUK) obj).accept(valueOf);
                    }
                }
            }
        }
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLJJ(InterfaceC47787IpD interfaceC47787IpD) {
        ((List) this.LJIJI.LJLIL).clear();
        LLJL(interfaceC47787IpD);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLJJI(InterfaceC46853Ia9 interfaceC46853Ia9) {
        ((List) this.LJIJJ.LJLIL).clear();
        this.LJIJJ.LIZJ(interfaceC46853Ia9);
    }

    @Override // com.ss.ttvideoengine.TTVideoEngine
    public final void LLJJIJI(InterfaceC46854IaA interfaceC46854IaA) {
        ((List) this.LJIJJLI.LJLIL).clear();
        this.LJIJJLI.LIZJ(interfaceC46854IaA);
    }

    public final void LLJL(InterfaceC47787IpD interfaceC47787IpD) {
        this.LJIJI.LIZJ(interfaceC47787IpD);
    }

    public C46848Ia4(Context context, int i) {
        super(context, i);
        C47779Ip5 c47779Ip5 = new C47779Ip5();
        this.LJIJI = c47779Ip5;
        C46851Ia7 c46851Ia7 = new C46851Ia7();
        this.LJIJJ = c46851Ia7;
        C46849Ia5 c46849Ia5 = new C46849Ia5();
        this.LJIJJLI = c46849Ia5;
        this.LJIL = new C46847Ia3();
        super.LLJJ(c47779Ip5);
        this.LIZ.LLZLLLL = c46851Ia7;
        super.LLJJIJI(c46849Ia5);
    }
}
