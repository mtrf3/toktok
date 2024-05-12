package X;

import com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardViewModel;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardViewModel$dislikeThisUser$1", f = "TTRecUserBigCardViewModel.kt", l = {149}, m = "invokeSuspend")
/* renamed from: X.Mkc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57694Mkc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TTRecUserBigCardViewModel LJLILLLLZI;
    public final /* synthetic */ RecUser LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57694Mkc(TTRecUserBigCardViewModel tTRecUserBigCardViewModel, RecUser recUser, InterfaceC67352kd<? super C57694Mkc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = tTRecUserBigCardViewModel;
        this.LJLJI = recUser;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57694Mkc(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                TTRecUserBigCardViewModel tTRecUserBigCardViewModel = this.LJLILLLLZI;
                RecUser recUser = this.LJLJI;
                InterfaceC57698Mkg hv0 = tTRecUserBigCardViewModel.hv0();
                int value = EnumC46514INi.SCENE_BIG_CARDS.getValue();
                int value2 = EnumC57697Mkf.DISLIKE_USER.getValue();
                this.LJLIL = 1;
                if (hv0.LIZIZ(recUser, value, value2, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        RecUser recUser2 = this.LJLJI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("dislike ");
            LIZ2.append(recUser2.getUid());
            LIZ2.append(" fail");
            C221018lt.LIZJ("TTRecUserBigCardViewModel", X1D.LIZIZ(LIZ2), m10exceptionOrNullimpl);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
