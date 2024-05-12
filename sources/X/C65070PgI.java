package X;

import com.bytedance.retrofit2.SsHttpCall;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: X.PgI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65070PgI implements InterfaceC65014PfO<Object, InterfaceC37276Ek4<?>> {
    public final /* synthetic */ Type LIZ;
    public final /* synthetic */ Executor LIZIZ;

    @Override // X.InterfaceC65014PfO
    public final Type LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC65014PfO
    public final Object LIZIZ(SsHttpCall ssHttpCall) {
        Executor executor = this.LIZIZ;
        if (executor == null) {
            return ssHttpCall;
        }
        return new C65072PgK(executor, ssHttpCall);
    }

    public C65070PgI(Type type, Executor executor) {
        this.LIZ = type;
        this.LIZIZ = executor;
    }
}
