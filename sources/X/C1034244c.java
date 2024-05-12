package X;

import Y.AObserverS69S0100000_1;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.44c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1034244c implements AnonymousClass456 {
    public final C1034344d LIZ;
    public boolean LIZIZ;
    public final C62822Ol8 LIZJ;

    @Override // X.AnonymousClass456
    public final void LIZIZ() {
    }

    public C1034244c(C1034344d mediator) {
        o.LJIIIZ(mediator, "mediator");
        this.LIZ = mediator;
        this.LIZJ = C221108m2.LIZIZ(C99943w6.LJLIL);
    }

    @Override // X.AnonymousClass456
    public final void LIZ(LifecycleOwner lifecycleOwner) {
        C44H.LIZIZ(lifecycleOwner, new AObserverS69S0100000_1(this, 132));
    }
}
