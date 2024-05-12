package X;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Nkd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60243Nkd extends C59551NYt {
    public final /* synthetic */ AbstractC60239NkZ LJLIL;

    public C60243Nkd(AbstractC60239NkZ abstractC60239NkZ) {
        this.LJLIL = abstractC60239NkZ;
    }

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final void LIZIZ(Activity activity) {
        o.LJIIJ(activity, "activity");
        this.LJLIL.LLFFF.getAndSet(false);
        AbstractC60239NkZ abstractC60239NkZ = this.LJLIL;
        AtomicBoolean atomicBoolean = abstractC60239NkZ.LLFII;
        abstractC60239NkZ.getClass();
        if (atomicBoolean.compareAndSet(true, true)) {
            this.LJLIL.LLJILJIL();
        }
    }

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final void LIZLLL(Activity activity) {
        o.LJIIJ(activity, "activity");
        this.LJLIL.LLFFF.getAndSet(true);
        AbstractC60239NkZ abstractC60239NkZ = this.LJLIL;
        AtomicBoolean atomicBoolean = abstractC60239NkZ.LLFII;
        abstractC60239NkZ.getClass();
        if (atomicBoolean.compareAndSet(true, true)) {
            this.LJLIL.g();
        }
    }
}
