package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Puh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65963Puh implements InterfaceC53894LDe {
    public final /* synthetic */ com.bytedance.hox.Hox LJLIL;

    public C65963Puh(com.bytedance.hox.Hox hox) {
        this.LJLIL = hox;
    }

    @Override // X.InterfaceC53894LDe
    public final void LJLJL(String str, String to) {
        o.LJIIIZ(to, "to");
        Fragment Ja = this.LJLIL.Ja(to);
        if (Ja != null) {
            C65960Pue.LIZIZ(Ja, true, true);
        }
    }
}
