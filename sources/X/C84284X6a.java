package X;

import com.bytedance.ext_power_list.AssemSingleListViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS162S0200000_15;

@InterfaceC65848Psq(c = "com.bytedance.ext_power_list.AssemSingleListViewModel$loadPage$2", f = "AssemSingleListViewModel.kt", l = {107}, m = "invokeSuspend")
/* renamed from: X.X6a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84284X6a extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AssemSingleListViewModel<ITEM, S, Cursor> LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLJI;
    public final /* synthetic */ SZP LJLJJI;
    public final /* synthetic */ InterfaceC88473Ynt<C8HZ<ITEM>, Cursor, Cursor, C8HZ<ITEM>> LJLJJL;
    public final /* synthetic */ InterfaceC88471Ynr<C8HZ<ITEM>, Throwable, C8HZ<ITEM>> LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC67352kd<? super AbstractC57774Mlu<ITEM>>, Object> LJLJL;
    public final /* synthetic */ InterfaceC88472Yns<AbstractC57774Mlu<ITEM>, C76800UCe> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C84284X6a(AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel, InterfaceC65784Pro<Boolean> interfaceC65784Pro, SZP szp, InterfaceC88473Ynt<? super C8HZ<ITEM>, ? super Cursor, ? super Cursor, C8HZ<ITEM>> interfaceC88473Ynt, InterfaceC88471Ynr<? super C8HZ<ITEM>, ? super Throwable, C8HZ<ITEM>> interfaceC88471Ynr, InterfaceC88472Yns<? super InterfaceC67352kd<? super AbstractC57774Mlu<ITEM>>, ? extends Object> interfaceC88472Yns, InterfaceC88472Yns<? super AbstractC57774Mlu<ITEM>, C76800UCe> interfaceC88472Yns2, InterfaceC67352kd<? super C84284X6a> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = assemSingleListViewModel;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = szp;
        this.LJLJJL = interfaceC88473Ynt;
        this.LJLJJLL = interfaceC88471Ynr;
        this.LJLJL = interfaceC88472Yns;
        this.LJLJLJ = interfaceC88472Yns2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C84284X6a(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            MBA plus = this.LJLILLLLZI.getAssemVMScope().getCoroutineContext().plus(C78613UtF.LIZJ);
            X6W x6w = new X6W(this.LJLJL, null);
            this.LJLIL = 1;
            obj2 = XKX.LJI(plus, x6w, this);
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC57774Mlu abstractC57774Mlu = (AbstractC57774Mlu) obj2;
        if (this.LJLJI.invoke().booleanValue()) {
            this.LJLILLLLZI.handleState(this.LJLJJI, abstractC57774Mlu, this.LJLJJL, this.LJLJJLL, new AqS162S0200000_15(this.LJLJLJ, abstractC57774Mlu, 3));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
