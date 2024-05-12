package X;

import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.IOException;
import java.lang.reflect.Method;

/* renamed from: X.Pe3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64931Pe3<T> extends AbstractC64937Pe9<T> {
    public final Method LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final InterfaceC65016PfQ<T, TypedOutput> LIZLLL;

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, T t) {
        if (t == null) {
            return;
        }
        try {
            requestBuilder.LJIIJ.addPart(this.LIZJ, this.LIZLLL.LIZ(t));
        } catch (IOException e) {
            Method method = this.LIZ;
            int i = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Unable to convert ");
            LIZ.append(t);
            LIZ.append(" to RequestBody");
            throw C65139PhP.LJIIJ(method, i, X1D.LIZIZ(LIZ), e);
        }
    }

    public C64931Pe3(int i, InterfaceC65016PfQ interfaceC65016PfQ, String str, Method method) {
        this.LIZ = method;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = interfaceC65016PfQ;
    }
}
