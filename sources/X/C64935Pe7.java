package X;

import com.bytedance.retrofit2.RequestBuilder;

/* renamed from: X.Pe7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64935Pe7<T> extends AbstractC64937Pe9<T> {
    public final String LIZ;
    public final InterfaceC65016PfQ<T, String> LIZIZ;

    public C64935Pe7(String str, InterfaceC65016PfQ<T, String> interfaceC65016PfQ) {
        C65139PhP.LIZ(str, "name == null");
        this.LIZ = str;
        this.LIZIZ = interfaceC65016PfQ;
    }

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, T t) {
        if (t != null) {
            String str = this.LIZ;
            String LIZ = this.LIZIZ.LIZ(t);
            String str2 = requestBuilder.LIZ;
            if (str2 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("{");
                LIZ2.append(str);
                LIZ2.append("}");
                requestBuilder.LIZ = str2.replace(X1D.LIZIZ(LIZ2), LIZ);
                return;
            }
            throw new AssertionError();
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Method parameter \"");
        throw new IllegalArgumentException(JBR.LJFF(LIZ3, this.LIZ, "\" value must not be null.", LIZ3));
    }
}
