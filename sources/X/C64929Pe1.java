package X;

import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.mime.TypedOutput;
import defpackage.a1;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: X.Pe1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64929Pe1<T> extends AbstractC64937Pe9<java.util.Map<String, T>> {
    public final Method LIZ;
    public final int LIZIZ;
    public final InterfaceC65016PfQ<T, TypedOutput> LIZJ;
    public final String LIZLLL;

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, Object obj) {
        java.util.Map map = (java.util.Map) obj;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    Object value = entry.getValue();
                    if (value != null) {
                        requestBuilder.LJIIJ.addPart(str, this.LIZLLL, (TypedOutput) this.LIZJ.LIZ(value));
                    } else {
                        throw C65139PhP.LJIIJ(this.LIZ, this.LIZIZ, a1.LJ("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                } else {
                    throw C65139PhP.LJIIJ(this.LIZ, this.LIZIZ, "Part map contained null key.", new Object[0]);
                }
            }
            return;
        }
        throw C65139PhP.LJIIJ(this.LIZ, this.LIZIZ, "Part map was null.", new Object[0]);
    }

    public C64929Pe1(int i, InterfaceC65016PfQ interfaceC65016PfQ, String str, Method method) {
        this.LIZ = method;
        this.LIZIZ = i;
        this.LIZJ = interfaceC65016PfQ;
        this.LIZLLL = str;
    }
}
