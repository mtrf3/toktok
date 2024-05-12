package X;

import com.bytedance.retrofit2.RequestBuilder;
import defpackage.a1;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: X.Pe0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64928Pe0<T> extends AbstractC64937Pe9<java.util.Map<String, T>> {
    public final Method LIZ;
    public final int LIZIZ;
    public final InterfaceC65016PfQ<T, String> LIZJ;

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, Object obj) {
        java.util.Map map = (java.util.Map) obj;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    Object value = entry.getValue();
                    if (value != null) {
                        requestBuilder.LIZ(str, (String) this.LIZJ.LIZ(value));
                    } else {
                        throw C65139PhP.LJIIJ(this.LIZ, this.LIZIZ, a1.LJ("Header map contained null value for key '", str, "'."), new Object[0]);
                    }
                } else {
                    throw C65139PhP.LJIIJ(this.LIZ, this.LIZIZ, "Header map contained null key.", new Object[0]);
                }
            }
            return;
        }
        throw C65139PhP.LJIIJ(this.LIZ, this.LIZIZ, "Header map was null.", new Object[0]);
    }

    public C64928Pe0(Method method, int i, InterfaceC65016PfQ<T, String> interfaceC65016PfQ) {
        this.LIZ = method;
        this.LIZIZ = i;
        this.LIZJ = interfaceC65016PfQ;
    }
}
