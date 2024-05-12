package X;

import Y.AObserverS80S0100000_12;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TJo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74444TJo implements InterfaceC74445TJp {
    public C73495Sst LIZ;
    public C73849Syb<CategoryEffectModel> LIZIZ = new C73849Syb<>();
    public final AObserverS80S0100000_12 LIZJ = new AObserverS80S0100000_12(this, 10);
    public final C5H3<InterfaceC74443TJn> LIZLLL;

    @Override // X.InterfaceC74445TJp
    public final void LIZ() {
        C73495Sst c73495Sst = this.LIZ;
        if (c73495Sst != null) {
            c73495Sst.dispose();
        }
        if (this.LIZLLL.isInitialized()) {
            this.LIZLLL.getValue().LJJJJ().LJLJJI.removeObserver(this.LIZJ);
        }
    }

    public C74444TJo(C62822Ol8 c62822Ol8) {
        this.LIZLLL = c62822Ol8;
    }

    @Override // X.TJJ
    public final AbstractC73672Svk<CategoryEffectModel> LIZIZ(TJI request) {
        o.LJIIIZ(request, "request");
        C43045Guv.LIZLLL(new AqS159S0200000_12(this, request, 5), 0L);
        C73849Syb<CategoryEffectModel> c73849Syb = this.LIZIZ;
        return C42193GhB.LIZJ(c73849Syb, c73849Syb);
    }
}
