package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Hva, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45634Hva implements InterfaceC45767Hxj {
    public final /* synthetic */ C45628HvU LIZ;

    @Override // X.InterfaceC45767Hxj
    public final void LIZIZ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LIZ.LLIIL;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    public C45634Hva(C45628HvU c45628HvU) {
        this.LIZ = c45628HvU;
    }

    @Override // X.InterfaceC45767Hxj
    public final void LIZ(boolean z) {
        if (HRX.LJFF() && z) {
            C45628HvU c45628HvU = this.LIZ;
            Context requireSceneContext = c45628HvU.requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            C45628HvU c45628HvU2 = this.LIZ;
            C45765Hxh c45765Hxh = c45628HvU2.LLFF;
            if (c45765Hxh != null) {
                c45628HvU.LLIIL = C44703HgZ.LIZJ(requireSceneContext, c45765Hxh, "preview_page", c45628HvU2.LLIIII);
            } else {
                o.LJIJI("autoCutBtn");
                throw null;
            }
        }
    }
}
