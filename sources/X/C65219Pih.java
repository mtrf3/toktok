package X;

import Y.AgS128S0100000_11;
import com.bytedance.retrofit2.SsHttpCall;
import java.lang.reflect.Type;

/* renamed from: X.Pih, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65219Pih<R> implements InterfaceC65014PfO<R, C10K> {
    public final InterfaceC65014PfO<R, C10K<C64797Pbt>> LIZ;

    @Override // X.InterfaceC65014PfO
    public final Type LIZ() {
        return this.LIZ.LIZ();
    }

    public C65219Pih(InterfaceC65014PfO<R, C10K<C64797Pbt>> interfaceC65014PfO) {
        this.LIZ = interfaceC65014PfO;
    }

    @Override // X.InterfaceC65014PfO
    public final Object LIZIZ(SsHttpCall ssHttpCall) {
        return ((C10K) this.LIZ.LIZIZ(ssHttpCall)).LIZLLL(new AgS128S0100000_11(this, 5));
    }
}
