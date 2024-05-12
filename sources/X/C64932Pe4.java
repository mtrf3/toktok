package X;

import com.bytedance.retrofit2.RequestBuilder;

/* renamed from: X.Pe4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64932Pe4<T> extends AbstractC64937Pe9<T> {
    public final String LIZ;
    public final InterfaceC65016PfQ<T, String> LIZIZ;
    public final boolean LIZJ;

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, T t) {
        String LIZ;
        if (t == null || (LIZ = this.LIZIZ.LIZ(t)) == null) {
            return;
        }
        String str = this.LIZ;
        boolean z = this.LIZJ;
        requestBuilder.LJIIIZ.addField(str, z, LIZ, z);
    }

    public C64932Pe4(String str, InterfaceC65016PfQ<T, String> interfaceC65016PfQ, boolean z) {
        C65139PhP.LIZ(str, "name == null");
        this.LIZ = str;
        this.LIZIZ = interfaceC65016PfQ;
        this.LIZJ = z;
    }
}
