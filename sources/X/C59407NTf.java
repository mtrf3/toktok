package X;

import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NTf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59407NTf<IN, OUT> {
    public final InterfaceC88472Yns<IN, OUT> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C59407NTf(InterfaceC88472Yns<? super IN, ? extends OUT> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    public final <NEW_OUT> C59407NTf<IN, NEW_OUT> LIZ(InterfaceC88472Yns<? super OUT, ? extends NEW_OUT> newFunction) {
        o.LJIIIZ(newFunction, "newFunction");
        return new C59407NTf<>(new AqS141S0200000_10(newFunction, this, 42));
    }
}
