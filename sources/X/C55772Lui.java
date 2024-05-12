package X;

import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM$setupShowInfo$sharerResponse$1", f = "SharedInviteDialogVM.kt", l = {107}, m = "invokeSuspend")
/* renamed from: X.Lui, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55772Lui extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super ExposeSharerData>, Object> {
    public int LJLIL;
    public final /* synthetic */ SharedInviteDialogVM LJLILLLLZI;
    public final /* synthetic */ C55773Luj LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55772Lui(SharedInviteDialogVM sharedInviteDialogVM, C55773Luj c55773Luj, InterfaceC67352kd<? super C55772Lui> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = sharedInviteDialogVM;
        this.LJLJI = c55773Luj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55772Lui(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            SharedInviteDialogVM sharedInviteDialogVM = this.LJLILLLLZI;
            C84661XKn LIZIZ = XKX.LIZIZ(sharedInviteDialogVM.LJLIL, C78613UtF.LIZJ, null, new C55769Luf(sharedInviteDialogVM, this.LJLJI, null), 2);
            this.LJLIL = 1;
            obj = LIZIZ.LJJIJ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super ExposeSharerData> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
