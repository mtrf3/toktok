package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.powerlist.optimize.preload.ViewCacheAbility$onScrolled$1", f = "ViewCacheExtension.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9Y5, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Y5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ RecyclerView LJLILLLLZI;
    public final /* synthetic */ C49485JbV LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9Y5(RecyclerView recyclerView, C49485JbV c49485JbV, InterfaceC67352kd<? super C9Y5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = recyclerView;
        this.LJLJI = c49485JbV;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C9Y5 c9y5 = new C9Y5(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c9y5.LJLIL = obj;
        return c9y5;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        LinearLayoutManager linearLayoutManager;
        int i;
        SYL syl;
        LinearLayoutManager linearLayoutManager2;
        C141335gf.LIZJ(obj);
        RecyclerView recyclerView = this.LJLILLLLZI;
        C49485JbV c49485JbV = this.LJLJI;
        try {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            C76800UCe c76800UCe = null;
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            int i2 = -1;
            if (linearLayoutManager == null) {
                i = -1;
            } else {
                i = linearLayoutManager.LLILL();
            }
            C0A2 layoutManager2 = recyclerView.getLayoutManager();
            if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
                i2 = linearLayoutManager2.LLILLJJLI();
            }
            if ((recyclerView instanceof SYL) && (syl = (SYL) recyclerView) != null) {
                c49485JbV.LJIIZILJ(syl, i, i2);
                c76800UCe = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
