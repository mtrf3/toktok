package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.ui.framework.BaseLeaf$addSubLeaf$1$1$1", f = "BaseLeaf.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.CqU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32578CqU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC32517CpV LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ ViewGroup LJLJI;
    public final /* synthetic */ AbstractC32579CqV LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32578CqU(AbstractC32517CpV abstractC32517CpV, Context context, ViewGroup viewGroup, AbstractC32579CqV abstractC32579CqV, InterfaceC67352kd<? super C32578CqU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC32517CpV;
        this.LJLILLLLZI = context;
        this.LJLJI = viewGroup;
        this.LJLJJI = abstractC32579CqV;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32578CqU(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        View view;
        C141335gf.LIZJ(obj);
        AbstractC32517CpV abstractC32517CpV = this.LJLIL;
        Context context = this.LJLILLLLZI;
        OSZ<View, C018905p> LJIJJLI = abstractC32517CpV.LJIJJLI(context, this.LJLJI, C16880lQ.LLZIL(context));
        AbstractC32517CpV abstractC32517CpV2 = this.LJLIL;
        C018905p c018905p = null;
        if (LJIJJLI != null) {
            view = LJIJJLI.getFirst();
        } else {
            view = null;
        }
        abstractC32517CpV2.LJLJJI = view;
        if (LJIJJLI != null) {
            c018905p = LJIJJLI.getSecond();
        }
        this.LJLJI.setVisibility(0);
        this.LJLJI.addView(this.LJLIL.LJLJJI, c018905p);
        AbstractC32517CpV abstractC32517CpV3 = this.LJLIL;
        AbstractC32579CqV abstractC32579CqV = this.LJLJJI;
        abstractC32517CpV3.LJLJJL = abstractC32579CqV.LJLJJL;
        abstractC32517CpV3.LJLJLJ = abstractC32579CqV;
        abstractC32517CpV3.LJLJL = abstractC32579CqV.LJLJI;
        ((ArrayList) abstractC32579CqV.LJLJJLL).add(abstractC32517CpV3);
        this.LJLIL.LJIILL();
        return C76800UCe.LIZ;
    }
}
