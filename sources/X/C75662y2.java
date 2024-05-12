package X;

import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel$pageRequestListener$1$onFailure$1", f = "GroupListViewModel.kt", l = {44}, m = "invokeSuspend")
/* renamed from: X.2y2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75662y2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GroupListViewModel LJLILLLLZI;
    public final /* synthetic */ C63623Oy3 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75662y2(GroupListViewModel groupListViewModel, C63623Oy3 c63623Oy3, InterfaceC67352kd<? super C75662y2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = groupListViewModel;
        this.LJLJI = c63623Oy3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75662y2(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            XKQ xkq = this.LJLILLLLZI.LJLJJL;
            if (xkq != null) {
                this.LJLIL = 1;
                if (xkq.LJJJJ(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        this.LJLILLLLZI.LJLJI.setValue(this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
