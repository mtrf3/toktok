package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ett, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37885Ett implements InterfaceC37882Etq {
    public final /* synthetic */ C37940Eum LIZ;

    public C37885Ett(C37940Eum c37940Eum) {
        this.LIZ = c37940Eum;
    }

    @Override // X.InterfaceC37882Etq
    public final Boolean LIZ(C37955Ev1 call) {
        List<String> list;
        List<String> list2;
        EnumC38003Evn enumC38003Evn;
        o.LJIIJ(call, "call");
        if (((ArrayList) this.LIZ.LJLJL).isEmpty()) {
            list = this.LIZ.LJLJLLL;
        } else {
            list = this.LIZ.LJLJL;
        }
        if (((ArrayList) this.LIZ.LJLJJLL).isEmpty()) {
            list2 = this.LIZ.LJLJLJ;
        } else {
            list2 = this.LIZ.LJLJJLL;
        }
        android.net.Uri uri = UriProtector.parse(call.LJ);
        o.LJFF(uri, "uri");
        String host = uri.getHost();
        boolean contains = list.contains(call.LIZLLL);
        if (host != null && (enumC38003Evn = call.LJIILIIL) != null && enumC38003Evn != EnumC38003Evn.SECURE && (!list2.isEmpty())) {
            for (String str : list2) {
                if (!o.LJ(host, str)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append('.');
                    LIZ.append(str);
                    if (ujb.o.LJJJJ(host, X1D.LIZIZ(LIZ), false)) {
                    }
                }
                call.LJIILJJIL = EnumC38003Evn.PRIVATE;
                return Boolean.TRUE;
            }
        }
        if (contains) {
            if (host == null) {
                call.LJIILJJIL = EnumC38003Evn.PUBLIC;
            }
            return Boolean.TRUE;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host", host);
        jSONObject.put("safe_host", list2);
        jSONObject.put("public_method", list);
        call.LJIJ.LIZ("hybrid_bridge", jSONObject);
        return Boolean.FALSE;
    }
}
