package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NS6 extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC59369NRt, NGA> {
    public static final NS6 LJLIL = new NS6();

    public NS6() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final NGA invoke(InterfaceC59369NRt interfaceC59369NRt) {
        InterfaceC59369NRt inject = interfaceC59369NRt;
        o.LJIIIZ(inject, "$this$inject");
        return inject.getLogger();
    }
}
