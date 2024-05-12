package X;

import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.IOException;
import java.lang.reflect.Method;

/* renamed from: X.Pe5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64933Pe5<T> extends AbstractC64937Pe9<T> {
    public final Method LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC65016PfQ<T, TypedOutput> LIZLLL;

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, T t) {
        if (t == null) {
            if (this.LIZJ) {
                return;
            } else {
                throw C65139PhP.LJIIJ(this.LIZ, this.LIZIZ, "Body parameter value must not be null.", new Object[0]);
            }
        }
        try {
            requestBuilder.LJIIJJI = this.LIZLLL.LIZ(t);
        } catch (IOException e) {
            Method method = this.LIZ;
            int i = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unable to convert ");
            LIZ.append(t);
            LIZ.append(" to RequestBody");
            throw C65139PhP.LJIIJJI(method, e, i, X1D.LIZIZ(LIZ), new Object[0]);
        }
    }

    public C64933Pe5(int i, InterfaceC65016PfQ interfaceC65016PfQ, Method method, boolean z) {
        this.LIZ = method;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = interfaceC65016PfQ;
    }
}
