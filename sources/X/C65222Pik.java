package X;

import com.bytedance.retrofit2.SsHttpCall;
import java.lang.reflect.Type;

/* renamed from: X.Pik, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65222Pik<R> implements InterfaceC65014PfO<R, C76L<C64797Pbt>> {
    public final Type LIZ;

    @Override // X.InterfaceC65014PfO
    public final Type LIZ() {
        return this.LIZ;
    }

    public C65222Pik(Type type) {
        this.LIZ = type;
    }

    @Override // X.InterfaceC65014PfO
    public final Object LIZIZ(SsHttpCall ssHttpCall) {
        return new C65733Pqz(ssHttpCall);
    }
}
