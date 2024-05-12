package X;

import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM$updateUIState$1", f = "FriendsEmptyPageRootVM.kt", l = {226}, m = "invokeSuspend")
/* renamed from: X.Mbu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57154Mbu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ FriendsEmptyPageRootVM LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<C57159Mbz, C57159Mbz> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C57154Mbu(FriendsEmptyPageRootVM friendsEmptyPageRootVM, InterfaceC88472Yns<? super C57159Mbz, C57159Mbz> interfaceC88472Yns, InterfaceC67352kd<? super C57154Mbu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = friendsEmptyPageRootVM;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57154Mbu(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            Object value = this.LJLILLLLZI.LJLJJLL.getValue();
            if (value == null) {
                value = new C57159Mbz(0);
            }
            C57159Mbz c57159Mbz = (C57159Mbz) this.LJLJI.invoke(value);
            if (c57159Mbz != null && !o.LJ(c57159Mbz, value)) {
                XIF xif = EXV.LIZ;
                C57155Mbv c57155Mbv = new C57155Mbv(this.LJLILLLLZI, c57159Mbz, null);
                this.LJLIL = 1;
                if (XKX.LJI(xif, c57155Mbv, this) == enumC58928NAu) {
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
