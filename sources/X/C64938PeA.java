package X;

import com.bytedance.retrofit2.RequestBuilder;

/* renamed from: X.PeA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64938PeA<T> extends AbstractC64937Pe9<T> {
    public final String LIZ;
    public final InterfaceC65016PfQ<T, String> LIZIZ;
    public final boolean LIZJ;

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, T t) {
        String LIZ;
        if (t == null || (LIZ = this.LIZIZ.LIZ(t)) == null) {
            return;
        }
        requestBuilder.LIZIZ(this.LIZ, LIZ, this.LIZJ);
    }

    public C64938PeA(String str, InterfaceC65016PfQ<T, String> interfaceC65016PfQ, boolean z) {
        C65139PhP.LIZ(str, "name == null");
        this.LIZ = str;
        this.LIZIZ = interfaceC65016PfQ;
        this.LIZJ = z;
    }
}
