package X;

import android.content.Context;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.deeplink.actions.base.BaseLinkAction$open$1$1", f = "BaseLinkAction.kt", l = {41}, m = "invokeSuspend")
/* renamed from: X.LPy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54226LPy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public AbstractC54341LUj LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ AbstractC54341LUj<T> LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ M5X LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54226LPy(AbstractC54341LUj<T> abstractC54341LUj, String str, Context context, M5X m5x, InterfaceC67352kd<? super C54226LPy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = abstractC54341LUj;
        this.LJLJJI = str;
        this.LJLJJL = context;
        this.LJLJJLL = m5x;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54226LPy(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        AbstractC54341LUj abstractC54341LUj;
        T t;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                abstractC54341LUj = this.LJLIL;
                C141335gf.LIZJ(obj);
                t = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            abstractC54341LUj = this.LJLJI;
            XIA xia = C78613UtF.LIZJ;
            C54225LPx c54225LPx = new C54225LPx(abstractC54341LUj, null);
            this.LJLIL = abstractC54341LUj;
            this.LJLILLLLZI = 1;
            Object LJI = XKX.LJI(xia, c54225LPx, this);
            t = LJI;
            if (LJI == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        abstractC54341LUj.customResult = t;
        AbstractC54341LUj<T> abstractC54341LUj2 = this.LJLJI;
        T t2 = abstractC54341LUj2.customResult;
        if (t2 != 0) {
            abstractC54341LUj2.handleOpenWithAsyncResult(this.LJLJJI, this.LJLJJL, abstractC54341LUj2.isAsync(), t2, this.LJLJJLL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
