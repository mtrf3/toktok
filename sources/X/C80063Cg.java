package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.mention.viewmodel.MentionPanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.group.mention.viewmodel.MentionPanelViewModel$onClickUser$1$1", f = "MentionPanelViewModel.kt", l = {139}, m = "invokeSuspend")
/* renamed from: X.3Cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80063Cg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MentionPanelViewModel LJLILLLLZI;
    public final /* synthetic */ IMUser LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80063Cg(MentionPanelViewModel mentionPanelViewModel, IMUser iMUser, InterfaceC67352kd<? super C80063Cg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mentionPanelViewModel;
        this.LJLJI = iMUser;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80063Cg(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            XLL xll = this.LJLILLLLZI.LJLL;
            String uid = this.LJLJI.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            this.LJLIL = 1;
            if (xll.emit(uid, this) == enumC58928NAu) {
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
