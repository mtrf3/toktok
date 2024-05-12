package X;

import android.os.Looper;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.AbsTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.google.gson.m;
import com.google.gson.s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EA2 implements InterfaceC65104Pgq {
    public final java.util.Map<EnumC70569Rmn, EA3> LIZ;

    public EA2() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = linkedHashMap;
        linkedHashMap.put(EnumC70569Rmn.SEARCH_PRODUCT, new EA3() { // from class: X.2gX
            @Override // X.EA3
            public final void LIZ() {
            }

            public final void LIZJ(String str) {
                try {
                    FFL.LJIIIZ().getClass();
                } catch (Exception unused) {
                    if (0 == 0) {
                        return;
                    }
                }
                if (FFL.LJIIJ(31744, 0, "ecom_search_pdp_optimize", true) == 0) {
                    return;
                }
                Object obj = null;
                if (!o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                    try {
                        Object LJII = C27739Aud.LJFF().LJII(str, C65330PkU.LIZJ(C65352Pkq.LJI(C2RG.class)));
                        if (LJII instanceof C2RG) {
                            obj = LJII;
                        }
                        return;
                    } catch (s | Exception unused2) {
                        return;
                    }
                }
                XKX.LIZLLL(C780334l.LJLIL, null, null, new C64772gT(this, str, null), 3);
            }

            @Override // X.EA3
            public final void LIZIZ(Object obj, String str) {
                if (!ujb.s.LJJJLZIJ(str, "cursor=0", false) && !ujb.s.LJJJLZIJ(str, "cursor=12", false)) {
                    return;
                }
                if (obj instanceof String) {
                    LIZJ((String) obj);
                    return;
                }
                if (obj instanceof m) {
                    LIZJ(obj.toString());
                    return;
                }
                if (!(obj instanceof TypedByteArray) || !o.LJ(((AbsTypedOutput) obj).mimeType(), "application/json; charset=utf-8")) {
                    return;
                }
                try {
                    LIZJ(((TypedByteArray) obj).getBytes().toString());
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
        });
    }

    @Override // X.InterfaceC65104Pgq
    public final void LIZJ(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJFF(C64797Pbt<?> response) {
        o.LJIIIZ(response, "response");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJII(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void onException(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJIIIIZZ(Request request, C64797Pbt<?> c64797Pbt, Throwable th) {
        o.LJIIIZ(request, "request");
        try {
            String path = request.getPath();
            o.LJIIIIZZ(path, "request.path");
            if (!this.LIZ.isEmpty()) {
                Iterator it = ((LinkedHashMap) this.LIZ).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ((EA3) ((Map.Entry) it.next()).getValue()).LIZ();
                    if (ujb.s.LJJJLZIJ(path, "aweme/v1/search/single/ecom/", false)) {
                        if (c64797Pbt != null && c64797Pbt.LIZIZ()) {
                            Object body = c64797Pbt.LIZIZ;
                            Iterator it2 = ((LinkedHashMap) this.LIZ).entrySet().iterator();
                            while (it2.hasNext()) {
                                EA3 ea3 = (EA3) ((Map.Entry) it2.next()).getValue();
                                String url = request.getUrl();
                                o.LJIIIIZZ(url, "request.url");
                                o.LJIIIIZZ(body, "body");
                                ea3.LIZIZ(body, url);
                            }
                        }
                    }
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
    }
}
