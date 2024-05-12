package X;

import Y.AObserverS69S0100000_1;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import kotlin.jvm.internal.o;

/* renamed from: X.44i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1034844i implements AnonymousClass456 {
    public final C1034344d LIZ;
    public final C62822Ol8 LIZIZ;
    public boolean LIZJ;

    @Override // X.AnonymousClass456
    public final void LIZIZ() {
        C57082Lw.LIZ.LIZ("#UPDATE_SUG_EVENT");
    }

    public C1034844i(C1034344d mediator) {
        o.LJIIIZ(mediator, "mediator");
        this.LIZ = mediator;
        this.LIZIZ = C221108m2.LIZIZ(C99953w7.LJLIL);
    }

    @Override // X.AnonymousClass456
    public final void LIZ(LifecycleOwner lifecycleOwner) {
        NextLiveData LIZIZ = C57082Lw.LIZ.LIZIZ("#UPDATE_SUG_EVENT");
        o.LJIIIIZZ(LIZIZ, "get().with(UPDATE_SUG_EV…dateSugEvent::class.java)");
        LIZIZ.observe(lifecycleOwner, new AObserverS69S0100000_1(this, 131), false);
    }
}
