package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel$remoteFetchCallback$1$onQueryResult$1", f = "IMReactionListSheetViewModel.kt", l = {58}, m = "invokeSuspend")
/* renamed from: X.3DV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3DV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IMReactionListSheetViewModel LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;
    public final /* synthetic */ IMUser LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3DV(IMReactionListSheetViewModel iMReactionListSheetViewModel, Integer num, IMUser iMUser, InterfaceC67352kd<? super C3DV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iMReactionListSheetViewModel;
        this.LJLJI = num;
        this.LJLJJI = iMUser;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3DV(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            XLL xll = this.LJLILLLLZI.LJLJLLL;
            OSZ osz = new OSZ(this.LJLJI, this.LJLJJI);
            this.LJLIL = 1;
            if (xll.emit(osz, this) == enumC58928NAu) {
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