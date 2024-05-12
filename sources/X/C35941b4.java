package X;

import android.os.Trace;
import kotlin.jvm.internal.o;

/* renamed from: X.1b4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35941b4 implements InterfaceC24390xX {
    public final InterfaceC88472Yns<C24590xr, InterfaceC24580xq> LJLIL;
    public InterfaceC24580xq LJLILLLLZI;

    @Override // X.InterfaceC24390xX
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC24390xX
    public final void LIZJ() {
        this.LJLILLLLZI = this.LJLIL.invoke(C24610xt.LIZ);
    }

    @Override // X.InterfaceC24390xX
    public final void LIZLLL() {
        Trace.beginSection("effect:onForgotten:dispose");
        try {
            InterfaceC24580xq interfaceC24580xq = this.LJLILLLLZI;
            if (interfaceC24580xq != null) {
                interfaceC24580xq.dispose();
            }
            this.LJLILLLLZI = null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C35941b4(InterfaceC88472Yns<? super C24590xr, ? extends InterfaceC24580xq> effect) {
        o.LJIIIZ(effect, "effect");
        this.LJLIL = effect;
    }
}
