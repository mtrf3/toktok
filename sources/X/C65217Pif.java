package X;

import com.bytedance.retrofit2.SsHttpCall;
import java.lang.reflect.Type;

/* renamed from: X.Pif, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65217Pif<R> implements InterfaceC65014PfO<R, C76L<R>> {
    public final Type LIZ;

    @Override // X.InterfaceC65014PfO
    public final Type LIZ() {
        return this.LIZ;
    }

    public C65217Pif(Type type) {
        this.LIZ = type;
    }

    @Override // X.InterfaceC65014PfO
    public final Object LIZIZ(SsHttpCall ssHttpCall) {
        return new C65732Pqy(ssHttpCall);
    }
}
