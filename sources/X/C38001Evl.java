package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Evl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38001Evl implements InterfaceC37882Etq {
    public final /* synthetic */ C60238NkY LIZ;

    public C38001Evl(C60238NkY c60238NkY) {
        this.LIZ = c60238NkY;
    }

    @Override // X.InterfaceC37882Etq
    public final Boolean LIZ(C37955Ev1 call) {
        List<String> list;
        o.LJIIJ(call, "call");
        if ((!this.LIZ.LLIIIL.isEmpty()) && this.LIZ.LLIIIL.contains(call.LIZLLL)) {
            return Boolean.TRUE;
        }
        List<String> list2 = this.LIZ.LLIIJLIL;
        if (list2 == null || list2.isEmpty()) {
            list = this.LIZ.LLIIJI;
        } else {
            list = this.LIZ.LLIIJLIL;
        }
        EnumC38003Evn enumC38003Evn = call.LJIILIIL;
        if (enumC38003Evn != null && enumC38003Evn != EnumC38003Evn.SECURE && (true ^ list.isEmpty())) {
            android.net.Uri uri = UriProtector.parse(call.LJ);
            o.LJFF(uri, "uri");
            String host = uri.getHost();
            if (host != null) {
                for (String str : list) {
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
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }
}
