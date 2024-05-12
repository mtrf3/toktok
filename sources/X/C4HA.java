package X;

import androidx.recyclerview.widget.RecyclerView;
import fjb.a;
import kotlin.jvm.internal.AqS105S0300000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.ui.ActionBarComponent$preloadViews$1", f = "ActionBarComponent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4HA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4HA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ InterfaceC1039145z<Integer> LJLILLLLZI;
    public final /* synthetic */ RecyclerView.RecycledViewPool LJLJI;
    public final /* synthetic */ AbstractC029409q<?> LJLJJI;
    public final /* synthetic */ RecyclerView LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4HA(InterfaceC1039145z<Integer> interfaceC1039145z, RecyclerView.RecycledViewPool recycledViewPool, AbstractC029409q<?> abstractC029409q, RecyclerView recyclerView, InterfaceC67352kd<? super C4HA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC1039145z;
        this.LJLJI = recycledViewPool;
        this.LJLJJI = abstractC029409q;
        this.LJLJJL = recyclerView;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C4HA c4ha = new C4HA(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c4ha.LJLIL = obj;
        return c4ha;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C110574Vp LJJJJLL = OJ4.LJJJJLL(OJ4.LJJJJIZL(this.LJLILLLLZI), new AqS105S0300000_1((InterfaceC70422pa) this.LJLIL, (InterfaceC70422pa) this.LJLJJI, (AbstractC029409q<?>) this.LJLJJL, (RecyclerView) 13));
        RecyclerView.RecycledViewPool recycledViewPool = this.LJLJI;
        C110564Vo c110564Vo = new C110564Vo(LJJJJLL);
        while (c110564Vo.hasNext()) {
            recycledViewPool.putRecycledView((RecyclerView.ViewHolder) c110564Vo.next());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
