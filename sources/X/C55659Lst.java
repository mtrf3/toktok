package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.Lst, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55659Lst implements InterfaceC116954iR<Activity> {
    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Activity t) {
        o.LJIIIZ(t, "t");
        C55657Lsr.LIZIZ = null;
        C55657Lsr.LIZJ = null;
    }
}
