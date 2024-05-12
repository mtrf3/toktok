package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "tiktok.compose.paging.PagingLazyExtensionKt$collectAsPagingLazyState$1", f = "PagingLazyExtension.kt", l = {36}, m = "invokeSuspend")
/* renamed from: X.UiE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77930UiE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MBA LJLILLLLZI;
    public final /* synthetic */ C225138sX<Object> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77930UiE(MBA mba, C225138sX<Object> c225138sX, InterfaceC67352kd<? super C77930UiE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mba;
        this.LJLJI = c225138sX;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C77930UiE(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            if (o.LJ(this.LJLILLLLZI, MBB.INSTANCE)) {
                this.LJLJI.LJFF();
            } else {
                MBA mba = this.LJLILLLLZI;
                C77931UiF c77931UiF = new C77931UiF(this.LJLJI, null);
                this.LJLIL = 1;
                if (XKX.LJI(mba, c77931UiF, this) == enumC58928NAu) {
                    return enumC58928NAu;
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
