package X;

import android.text.TextUtils;
import ij2.a;
import kotlin.jvm.internal.o;

/* renamed from: X.27w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C534427w extends AbstractC44281oW {
    @Override // X.AbstractC44281oW
    public final String LJIIIIZZ() {
        return "pipo.updateNonce";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return EnumC38005Evp.PUBLIC;
    }

    @Override // X.AbstractC44281oW, X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns interfaceC78280Uns, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH enumC37847EtH) {
        super.LIZJ(interfaceC78280Uns, interfaceC31943CgF, enumC37847EtH);
        String nonce = C04490Fp.LJ(interfaceC78280Uns, "nonce");
        if (TextUtils.isEmpty(nonce)) {
            C04490Fp.LIZIZ("pipo.updateNonce", 0, 101, "nonce is empty!", interfaceC31943CgF);
            return;
        }
        C276216o.LJIIL.LIZJ().getClass();
        a.LJIJ.getClass();
        o.LJIIIZ(nonce, "nonce");
        a.LJ = nonce;
        C04490Fp.LIZIZ("pipo.updateNonce", 1, 1, "success", interfaceC31943CgF);
    }
}
