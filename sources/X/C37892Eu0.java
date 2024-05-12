package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Eu0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37892Eu0 implements InterfaceC37882Etq {
    public final /* synthetic */ C38116Exc LIZ;

    public C37892Eu0(C38116Exc c38116Exc) {
        this.LIZ = c38116Exc;
    }

    @Override // X.InterfaceC37882Etq
    public final Boolean LIZ(C37955Ev1 call) {
        o.LJIIIZ(call, "call");
        o.LJIIIIZZ(this.LIZ.LJIILIIL, "environment.publicMethodSet");
        if ((!r1.isEmpty()) && this.LIZ.LJIILIIL.contains(call.LIZLLL)) {
            return Boolean.TRUE;
        }
        EnumC38003Evn enumC38003Evn = call.LJIILIIL;
        if (enumC38003Evn != null && enumC38003Evn != EnumC38003Evn.SECURE) {
            o.LJIIIIZZ(this.LIZ.LJIIL, "environment.safeHostSet");
            if (!r1.isEmpty()) {
                String host = UriProtector.parse(call.LJ).getHost();
                if (host == null) {
                    return Boolean.FALSE;
                }
                for (String str : this.LIZ.LJIIL) {
                    if (str != null) {
                        if (!o.LJ(host, str)) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append('.');
                            LIZ.append(str);
                            if (ujb.o.LJJJJ(host, X1D.LIZIZ(LIZ), false)) {
                            }
                        }
                        return Boolean.TRUE;
                    }
                }
            }
        }
        return Boolean.FALSE;
    }
}
