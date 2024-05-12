package X;

import Y.IDfS26S0200000_13;
import fjb.a;
import kotlin.jvm.internal.AqS163S0100000_13;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.compose.MentionVideoListPageKt$MentionVideoListFooter$1$1", f = "MentionVideoListPage.kt", l = {497}, m = "invokeSuspend")
/* renamed from: X.V5s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79180V5s extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C1QP LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<V6V> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79180V5s(C1QP c1qp, InterfaceC35811ar<V6V> interfaceC35811ar, InterfaceC67352kd<? super C79180V5s> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c1qp;
        this.LJLJI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C79180V5s(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C3C3 LJJJJZI = C78966Uyw.LJJJJZI(new AqS163S0100000_13(this.LJLILLLLZI, 596));
            IDfS26S0200000_13 iDfS26S0200000_13 = new IDfS26S0200000_13(this.LJLILLLLZI, this.LJLJI, 5);
            this.LJLIL = 1;
            if (LJJJJZI.collect(iDfS26S0200000_13, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
