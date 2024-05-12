package X;

import Y.IDdS378S0100000_6;
import com.bytedance.retrofit2.SsHttpCall;
import java.lang.reflect.Type;
import v5.n;

/* renamed from: X.Pij, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65221Pij<R> implements InterfaceC65014PfO<R, C10K<C64797Pbt>> {
    public final Type LIZ;

    @Override // X.InterfaceC65014PfO
    public final Type LIZ() {
        return this.LIZ;
    }

    public C65221Pij(Type type) {
        this.LIZ = type;
    }

    @Override // X.InterfaceC65014PfO
    public final Object LIZIZ(SsHttpCall ssHttpCall) {
        n nVar = new n();
        ssHttpCall.enqueue(new IDdS378S0100000_6(nVar, 13));
        return nVar.LIZ;
    }
}
