package X;

import com.bytedance.retrofit2.RequestBuilder;
import defpackage.a1;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;

/* renamed from: X.Pe6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64934Pe6<T> extends AbstractC64937Pe9<T> {
    public final Method LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final InterfaceC65016PfQ<T, String> LIZLLL;
    public final boolean LJ;

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, T t) {
        if (t != null) {
            String str = this.LIZJ;
            String LIZ = this.LIZLLL.LIZ(t);
            boolean z = this.LJ;
            String str2 = requestBuilder.LIZLLL;
            if (str2 != null) {
                if (str != null) {
                    if (LIZ != null) {
                        try {
                            if (z) {
                                String replace = URLEncoder.encode(LIZ, "UTF-8").replace("+", "%20");
                                String str3 = requestBuilder.LIZLLL;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("{");
                                LIZ2.append(str);
                                LIZ2.append("}");
                                requestBuilder.LIZLLL = str3.replace(X1D.LIZIZ(LIZ2), replace);
                            } else {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("{");
                                LIZ3.append(str);
                                LIZ3.append("}");
                                requestBuilder.LIZLLL = str2.replace(X1D.LIZIZ(LIZ3), LIZ);
                            }
                            return;
                        } catch (UnsupportedEncodingException e) {
                            throw new RuntimeException(C0ON.LIZJ("Unable to convert path parameter \"", str, "\" value to UTF-8:", LIZ), e);
                        }
                    }
                    throw new IllegalArgumentException(a1.LJ("Path replacement \"", str, "\" value must not be null."));
                }
                throw new IllegalArgumentException("Path replacement name must not be null.");
            }
            throw new AssertionError();
        }
        Method method = this.LIZ;
        int i = this.LIZIZ;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("Path parameter \"");
        throw C65139PhP.LJIIJ(method, i, JBR.LJFF(LIZ4, this.LIZJ, "\" value must not be null.", LIZ4), new Object[0]);
    }

    public C64934Pe6(Method method, int i, String str, InterfaceC65016PfQ<T, String> interfaceC65016PfQ, boolean z) {
        this.LIZ = method;
        this.LIZIZ = i;
        C65139PhP.LIZ(str, "name == null");
        this.LIZJ = str;
        this.LIZLLL = interfaceC65016PfQ;
        this.LJ = z;
    }
}
