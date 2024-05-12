package X;

import com.bytedance.retrofit2.RequestFactory;
import com.bytedance.retrofit2.SsHttpCall;

/* renamed from: X.PeZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64963PeZ<ResponseT, ReturnT> extends AbstractC64962PeY<ResponseT, ReturnT> {
    public final InterfaceC65014PfO<ResponseT, ReturnT> LIZIZ;

    public C64963PeZ(RequestFactory requestFactory, InterfaceC65014PfO<ResponseT, ReturnT> interfaceC65014PfO) {
        super(requestFactory);
        this.LIZIZ = interfaceC65014PfO;
    }

    @Override // X.AbstractC64962PeY
    public final Object LIZJ(SsHttpCall ssHttpCall, Object[] objArr) {
        return this.LIZIZ.LIZIZ(ssHttpCall);
    }
}
