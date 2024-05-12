package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.ui.framework.DialogLeaf;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.ui.framework.LeafHostLayout$addLeaf$1$1", f = "LeafHostLayout.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.CqX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32581CqX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC32579CqV LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ C32580CqW LJLJI;
    public final /* synthetic */ ViewGroup LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32581CqX(AbstractC32579CqV abstractC32579CqV, Context context, C32580CqW c32580CqW, ViewGroup viewGroup, InterfaceC67352kd<? super C32581CqX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC32579CqV;
        this.LJLILLLLZI = context;
        this.LJLJI = c32580CqW;
        this.LJLJJI = viewGroup;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32581CqX(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        AbstractC32579CqV abstractC32579CqV = this.LJLIL;
        Context context = this.LJLILLLLZI;
        OSZ<View, C018905p> LJIJJLI = abstractC32579CqV.LJIJJLI(context, this.LJLJI, C16880lQ.LLZIL(context));
        AbstractC32579CqV abstractC32579CqV2 = this.LJLIL;
        if (!(abstractC32579CqV2 instanceof DialogLeaf) && LJIJJLI != null) {
            C32580CqW c32580CqW = this.LJLJI;
            ViewGroup viewGroup = this.LJLJJI;
            View first = LJIJJLI.getFirst();
            C018905p second = LJIJJLI.getSecond();
            abstractC32579CqV2.LJLJJI = first;
            if (viewGroup == null) {
                viewGroup = c32580CqW;
            }
            c32580CqW.getClass();
            if (second == null) {
                viewGroup.addView(first);
            } else {
                viewGroup.addView(first, second);
            }
        }
        this.LJLJI.LJLILLLLZI.put(new Integer(this.LJLIL.LJIIL()), this.LJLIL);
        this.LJLIL.LJIILL();
        return C76800UCe.LIZ;
    }
}
