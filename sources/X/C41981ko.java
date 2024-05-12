package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1ko, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41981ko extends AbstractC014804a implements C1M2 {
    public final InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, InterfaceC07790Sh> LJLILLLLZI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C41981ko(InterfaceC88472Yns<? super C04Z, C76800UCe> inspectorInfo, InterfaceC88473Ynt<? super InterfaceC07790Sh, ? super InterfaceC24520xk, ? super Integer, ? extends InterfaceC07790Sh> factory) {
        super(inspectorInfo);
        o.LJIIIZ(inspectorInfo, "inspectorInfo");
        o.LJIIIZ(factory, "factory");
        this.LJLILLLLZI = factory;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
