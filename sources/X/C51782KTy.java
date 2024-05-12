package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.feed.platform.performance.ScopePerformanceVM;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX WARN: Incorrect field signature: TR; */
@InterfaceC65848Psq(c = "com.ss.android.ugc.feed.platform.performance.ScopePerformanceVMKt$lazyAbilityInternal$1$1$1", f = "ScopePerformanceVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.KTy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51782KTy extends AbstractC65782Prm implements InterfaceC88471Ynr<KU4, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C8W0 LJLIL;
    public final /* synthetic */ C8W0 LJLILLLLZI;
    public final /* synthetic */ C221138m5<T> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TR;TR;LX/8m5<+TT;>;LX/2kd<-LX/KTy;>;)V */
    public C51782KTy(C8W0 c8w0, C8W0 c8w02, C221138m5 c221138m5, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c8w0;
        this.LJLILLLLZI = c8w02;
        this.LJLJI = c221138m5;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C51782KTy(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        StringBuilder LIZIZ = C43881HKb.LIZIZ(obj, "preload find ability >>> add to task  >>>component:");
        LIZIZ.append(this.LJLIL);
        String msg = X1D.LIZIZ(LIZIZ);
        o.LJIIIZ(msg, "msg");
        Fragment fragment = ((KU4) this.LJLILLLLZI).getPanelContext().LJ;
        if (fragment != null || (fragment = C55096Ljo.LJIIIZ(this.LJLILLLLZI)) != null) {
            ScopePerformanceVM scopePerformanceVM = (ScopePerformanceVM) new ViewModelProvider(fragment).get(ScopePerformanceVM.class);
            C8W0 r = this.LJLIL;
            C5H3 wrap = this.LJLJI;
            scopePerformanceVM.getClass();
            o.LJIIIZ(r, "r");
            o.LJIIIZ(wrap, "wrap");
            List list = scopePerformanceVM.hv0().get(r);
            if (list == null) {
                list = new ArrayList();
                scopePerformanceVM.hv0().put(r, list);
            }
            list.add(wrap);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(KU4 ku4, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(ku4, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
