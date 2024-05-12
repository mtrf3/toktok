package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Eto, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37880Eto implements InterfaceC37882Etq {
    @Override // X.InterfaceC37882Etq
    public final Boolean LIZ(C37955Ev1 call) {
        boolean z;
        o.LJIIJ(call, "call");
        android.net.Uri uri = UriProtector.parse(call.LJ);
        o.LJFF(uri, "uri");
        if (uri.getHost() == null) {
            EnumC38003Evn enumC38003Evn = call.LJIILIIL;
            if (enumC38003Evn != null) {
                if (enumC38003Evn == EnumC38003Evn.PUBLIC) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("EmptyHostAuthFilter doAuthFilter result = ");
                LIZ.append(z);
                String msg = X1D.LIZIZ(LIZ);
                o.LJIIJ(msg, "msg");
                return Boolean.valueOf(z);
            }
            return null;
        }
        return Boolean.FALSE;
    }
}
