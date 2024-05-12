package X;

import com.bytedance.retrofit2.RequestBuilder;
import defpackage.a1;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: X.Pdy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64926Pdy<T> extends AbstractC64937Pe9<java.util.Map<String, T>> {
    public final Method LIZ;
    public final int LIZIZ;
    public final InterfaceC65016PfQ<T, String> LIZJ;
    public final boolean LIZLLL;

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, Object obj) {
        java.util.Map map = (java.util.Map) obj;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    Object value = entry.getValue();
                    if (value != null) {
                        String str2 = (String) this.LIZJ.LIZ(value);
                        if (str2 != null) {
                            boolean z = this.LIZLLL;
                            requestBuilder.LJIIIZ.addField(str, z, str2, z);
                        } else {
                            Method method = this.LIZ;
                            int i = this.LIZIZ;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Field map value '");
                            LIZ.append(value);
                            LIZ.append("' converted to null by ");
                            LIZ.append(this.LIZJ.getClass().getName());
                            LIZ.append(" for key '");
                            LIZ.append(str);
                            LIZ.append("'.");
                            throw C65139PhP.LJIIJ(method, i, X1D.LIZIZ(LIZ), new Object[0]);
                        }
                    } else {
                        throw C65139PhP.LJIIJ(this.LIZ, this.LIZIZ, a1.LJ("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                } else {
                    throw C65139PhP.LJIIJ(this.LIZ, this.LIZIZ, "Field map contained null key.", new Object[0]);
                }
            }
            return;
        }
        throw C65139PhP.LJIIJ(this.LIZ, this.LIZIZ, "Field map was null.", new Object[0]);
    }

    public C64926Pdy(int i, InterfaceC65016PfQ interfaceC65016PfQ, Method method, boolean z) {
        this.LIZ = method;
        this.LIZIZ = i;
        this.LIZJ = interfaceC65016PfQ;
        this.LIZLLL = z;
    }
}
