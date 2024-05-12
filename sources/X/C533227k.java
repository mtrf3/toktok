package X;

import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.27k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C533227k implements InterfaceC44261oU {
    public InterfaceC88472Yns<? super MotionEvent, Boolean> LJLIL;
    public C44241oS LJLILLLLZI;
    public boolean LJLJI;
    public final C37441dU LJLJJI = new C37441dU(this);

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.InterfaceC44261oU
    public final C11V p() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
