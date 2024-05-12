package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SSB extends AbstractC65781Prl implements InterfaceC88472Yns<SIN, SIN> {
    public static final SSB INSTANCE = new SSB();

    public SSB() {
        super(1);
    }

    public final SIN invoke(SIN sin) {
        o.LJIIIZ(sin, "$this$null");
        return sin;
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ SIN invoke(SIN sin) {
        SIN sin2 = sin;
        invoke(sin2);
        return sin2;
    }
}
