package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MBo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56400MBo extends AbstractC65781Prl implements InterfaceC88472Yns<C56386MBa, C56386MBa> {
    public static final C56400MBo LJLIL = new C56400MBo();

    public C56400MBo() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C56386MBa invoke(C56386MBa c56386MBa) {
        C43I<Boolean> c43i;
        C43I<Boolean> c43i2;
        C56386MBa setState = c56386MBa;
        o.LJIIIZ(setState, "$this$setState");
        if (!C56424MCm.LIZ()) {
            c43i = new C43I<>(Boolean.TRUE);
        } else {
            c43i = setState.LJLJI;
        }
        if (!setState.LJLJJI.LIZ.booleanValue()) {
            c43i2 = new C43I<>(Boolean.TRUE);
        } else {
            c43i2 = setState.LJLJJI;
        }
        return C56386MBa.LIZ(setState, null, null, c43i, c43i2, null, null, false, 0, 0, 499);
    }
}
