package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Etn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37879Etn implements InterfaceC37882Etq {
    @Override // X.InterfaceC37882Etq
    public final Boolean LIZ(C37955Ev1 call) {
        o.LJIIJ(call, "call");
        android.net.Uri uri = UriProtector.parse(call.LJ);
        o.LJFF(uri, "uri");
        String host = uri.getHost();
        EnumC38003Evn enumC38003Evn = call.LJIILIIL;
        if (enumC38003Evn != null) {
            if (enumC38003Evn != EnumC38003Evn.SECURE && host != null) {
                Iterator<String> it = C37876Etk.LIZIZ.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (!o.LJ(host, next)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append('.');
                        LIZ.append(next);
                        if (ujb.o.LJJJJ(host, X1D.LIZIZ(LIZ), false)) {
                        }
                    }
                    call.LJIILJJIL = EnumC38003Evn.PRIVATE;
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
        return null;
    }
}
