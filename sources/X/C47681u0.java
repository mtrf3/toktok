package X;

import kotlin.jvm.internal.IDqS32S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.1u0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47681u0 extends AbstractC65781Prl implements InterfaceC88472Yns<C24590xr, InterfaceC24580xq> {
    public final /* synthetic */ C0MG LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ InterfaceC24760y8<C0MI<Object, Object>> LJLJI;
    public final /* synthetic */ InterfaceC24760y8<Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47681u0(C0MG c0mg, String str, InterfaceC35811ar interfaceC35811ar, InterfaceC35811ar interfaceC35811ar2) {
        super(1);
        this.LJLIL = c0mg;
        this.LJLILLLLZI = str;
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = interfaceC35811ar2;
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC24580xq invoke(C24590xr DisposableEffect) {
        String LIZIZ;
        o.LJIIIZ(DisposableEffect, "$this$DisposableEffect");
        IDqS32S0300000 iDqS32S0300000 = new IDqS32S0300000((InterfaceC24760y8) this.LJLJI, (InterfaceC24760y8<? extends C0MI<Object, Object>>) this.LJLJJI, (InterfaceC24760y8<Object>) this.LJLIL, (C0MG) 4);
        C0MG c0mg = this.LJLIL;
        Object invoke = iDqS32S0300000.invoke();
        if (invoke != null && !c0mg.LIZ(invoke)) {
            if (invoke instanceof InterfaceC41301ji) {
                InterfaceC41301ji interfaceC41301ji = (InterfaceC41301ji) invoke;
                if (interfaceC41301ji.LIZ() != C35831at.LIZ && interfaceC41301ji.LIZ() != C36041bE.LIZ && interfaceC41301ji.LIZ() != C35791ap.LIZ) {
                    LIZIZ = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("MutableState containing ");
                    LIZ.append(interfaceC41301ji.getValue());
                    LIZ.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().");
                    LIZIZ = X1D.LIZIZ(LIZ);
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(invoke);
                LIZ2.append(" cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().");
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
            throw new IllegalArgumentException(LIZIZ);
        }
        final C0MF LIZLLL = this.LJLIL.LIZLLL(this.LJLILLLLZI, iDqS32S0300000);
        return new InterfaceC24580xq() { // from class: X.1HS
            @Override // X.InterfaceC24580xq
            public final void dispose() {
                C0MF.this.LIZIZ();
            }
        };
    }
}
