package X;

import com.bytedance.retrofit2.RequestBuilder;

/* renamed from: X.Pe8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64936Pe8<T> extends AbstractC64937Pe9<T> {
    public final String LIZ;
    public final InterfaceC65016PfQ<T, String> LIZIZ;

    public C64936Pe8(String str, InterfaceC65016PfQ<T, String> interfaceC65016PfQ) {
        C65139PhP.LIZ(str, "name == null");
        this.LIZ = str;
        this.LIZIZ = interfaceC65016PfQ;
    }

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, T t) {
        String LIZ;
        if (t == null || (LIZ = this.LIZIZ.LIZ(t)) == null) {
            return;
        }
        requestBuilder.LIZ(this.LIZ, LIZ);
    }
}
