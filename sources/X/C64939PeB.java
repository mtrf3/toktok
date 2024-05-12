package X;

import com.bytedance.retrofit2.RequestBuilder;

/* renamed from: X.PeB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64939PeB<T> extends AbstractC64937Pe9<T> {
    public final InterfaceC65016PfQ<T, String> LIZ;
    public final boolean LIZIZ;

    public C64939PeB(InterfaceC65016PfQ<T, String> interfaceC65016PfQ, boolean z) {
        this.LIZ = interfaceC65016PfQ;
        this.LIZIZ = z;
    }

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, T t) {
        if (t == null) {
            return;
        }
        requestBuilder.LIZIZ(this.LIZ.LIZ(t), null, this.LIZIZ);
    }
}
