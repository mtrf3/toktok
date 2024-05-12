package X;

import Y.AObserverS69S0100000_1;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import kotlin.jvm.internal.o;

/* renamed from: X.44m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1035244m implements AnonymousClass456 {
    public final C1034344d LIZ;

    @Override // X.AnonymousClass456
    public final void LIZIZ() {
        C57082Lw.LIZ.LIZ("#REMEASURE_ITEM_VIEW_EVENT");
    }

    public C1035244m(C1034344d mediator) {
        o.LJIIIZ(mediator, "mediator");
        this.LIZ = mediator;
    }

    @Override // X.AnonymousClass456
    public final void LIZ(LifecycleOwner lifecycleOwner) {
        NextLiveData LIZIZ = C57082Lw.LIZ.LIZIZ("#REMEASURE_ITEM_VIEW_EVENT");
        o.LJIIIIZZ(LIZIZ, "get().with(REMEASURE_ITE…eMeasureInfo::class.java)");
        LIZIZ.observe(lifecycleOwner, new AObserverS69S0100000_1(this, 130), false);
    }
}
