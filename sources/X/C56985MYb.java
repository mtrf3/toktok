package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.widget.multi.vm.InboxTopHorizontalListVM$bindDmStatusObservers$3", f = "InboxTopHorizontalListVM.kt", l = {395}, m = "invokeSuspend")
/* renamed from: X.MYb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56985MYb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InboxTopHorizontalListVM LJLILLLLZI;
    public final /* synthetic */ C72808Sho<InterfaceC57784Mm4> LJLJI;
    public final /* synthetic */ List<InterfaceC57784Mm4> LJLJJI;
    public final /* synthetic */ C76732zl LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C56985MYb(InboxTopHorizontalListVM inboxTopHorizontalListVM, C72808Sho<InterfaceC57784Mm4> c72808Sho, List<? extends InterfaceC57784Mm4> list, C76732zl c76732zl, InterfaceC67352kd<? super C56985MYb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = inboxTopHorizontalListVM;
        this.LJLJI = c72808Sho;
        this.LJLJJI = list;
        this.LJLJJL = c76732zl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C56985MYb(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            long j = this.LJLILLLLZI.LLFF;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.sv0();
        this.LJLILLLLZI.LL.set(0);
        if (C53155Ktb.LIZ()) {
            Iterator<C116144h8> it = this.LJLILLLLZI.LJZ.iterator();
            while (it.hasNext()) {
                C116144h8 item = it.next();
                InboxTopHorizontalListVM inboxTopHorizontalListVM = this.LJLILLLLZI;
                o.LJIIIIZZ(item, "item");
                inboxTopHorizontalListVM.pv0(item, this.LJLJI);
                this.LJLILLLLZI.qv0(item);
            }
        } else {
            List<InterfaceC57784Mm4> list = this.LJLJJI;
            for (InterfaceC57784Mm4 interfaceC57784Mm4 : list.subList(this.LJLJJL.element, list.size())) {
                if (interfaceC57784Mm4 instanceof C116144h8) {
                    C116144h8 c116144h8 = (C116144h8) interfaceC57784Mm4;
                    this.LJLILLLLZI.pv0(c116144h8, this.LJLJI);
                    this.LJLILLLLZI.qv0(c116144h8);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
