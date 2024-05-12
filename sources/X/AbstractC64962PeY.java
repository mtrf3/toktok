package X;

import com.bytedance.retrofit2.RequestFactory;
import com.bytedance.retrofit2.SsHttpCall;

/* renamed from: X.PeY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64962PeY<ResponseT, ReturnT> extends AbstractC64954PeQ<ReturnT> {
    public final RequestFactory<ReturnT> LIZ;

    public abstract Object LIZJ(SsHttpCall ssHttpCall, Object[] objArr);

    public AbstractC64962PeY(RequestFactory<ReturnT> requestFactory) {
        this.LIZ = requestFactory;
    }

    @Override // X.AbstractC64954PeQ
    public final ReturnT LIZ(Object[] objArr) {
        return (ReturnT) LIZJ(new SsHttpCall(this.LIZ, objArr), objArr);
    }
}
