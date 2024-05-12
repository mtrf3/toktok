package X;

import android.view.Choreographer;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.26b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C529726b implements InterfaceC44041o8 {
    public static final C529726b LJLIL = new C529726b();
    public static final Choreographer LJLILLLLZI = (Choreographer) XKX.LJ(C36636EZk.LIZ.LJJIJIL(), new C2GP(null));

    @Override // X.MBD
    public final InterfaceC48698J9i getKey() {
        return InterfaceC44041o8.LJJLIL;
    }

    @Override // X.MBD, X.MBA
    public final <E extends MBD> E get(InterfaceC48698J9i<E> key) {
        o.LJIIIZ(key, "key");
        return (E) MBC.LIZ(this, key);
    }

    @Override // X.MBA
    public final MBA minusKey(InterfaceC48698J9i<?> key) {
        o.LJIIIZ(key, "key");
        return MBC.LIZIZ(this, key);
    }

    @Override // X.MBA
    public final MBA plus(MBA context) {
        o.LJIIIZ(context, "context");
        return MBE.LIZ(this, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0xf, android.view.Choreographer$FrameCallback] */
    @Override // X.InterfaceC44041o8
    public final <R> Object LJIIJ(final InterfaceC88472Yns<? super Long, ? extends R> interfaceC88472Yns, InterfaceC67352kd<? super R> interfaceC67352kd) {
        final XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        ?? r2 = new Choreographer.FrameCallback() { // from class: X.0xf
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object LIZ;
                InterfaceC67352kd interfaceC67352kd2 = xks;
                try {
                    LIZ = interfaceC88472Yns.invoke(Long.valueOf(j));
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                interfaceC67352kd2.resumeWith(LIZ);
            }
        };
        LJLILLLLZI.postFrameCallback(r2);
        xks.LJIILIIL(new IDqS416S0100000((ChoreographerFrameCallbackC24470xf) r2, 307));
        return xks.LJIIJJI();
    }

    @Override // X.MBA
    public final <R> R fold(R r, InterfaceC88471Ynr<? super R, ? super MBD, ? extends R> operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(r, this);
    }
}
