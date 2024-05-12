package X;

import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel$dislikeCurrentUser$1$1", f = "RecSwipeViewModel.kt", l = {417}, m = "invokeSuspend")
/* renamed from: X.Mkb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57693Mkb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ RecSwipeViewModel LJLILLLLZI;
    public final /* synthetic */ RecUser LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57693Mkb(RecSwipeViewModel recSwipeViewModel, RecUser recUser, InterfaceC67352kd<? super C57693Mkb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = recSwipeViewModel;
        this.LJLJI = recUser;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57693Mkb(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
                RecSwipeViewModel recSwipeViewModel = this.LJLILLLLZI;
                RecUser recUser = this.LJLJI;
                InterfaceC57698Mkg interfaceC57698Mkg = (InterfaceC57698Mkg) recSwipeViewModel.LJLLILLLL.getValue();
                int value = EnumC46514INi.SCENE_BIG_CARDS.getValue();
                int value2 = EnumC57697Mkf.DISLIKE_USER.getValue();
                this.LJLIL = 1;
                if (interfaceC57698Mkg.LIZIZ(recUser, value, value2, this) == enumC58928NAu) {
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
            C221018lt.LIZJ("RecSwipeViewModel", X1D.LIZIZ(LIZ2), m10exceptionOrNullimpl);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
