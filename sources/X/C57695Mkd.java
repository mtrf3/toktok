package X;

import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel$dislikeThisFeature$1", f = "RecSwipeViewModel.kt", l = {494}, m = "invokeSuspend")
/* renamed from: X.Mkd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57695Mkd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ RecSwipeViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57695Mkd(RecSwipeViewModel recSwipeViewModel, InterfaceC67352kd<? super C57695Mkd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = recSwipeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57695Mkd(this.LJLILLLLZI, interfaceC67352kd);
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
                InterfaceC57698Mkg interfaceC57698Mkg = (InterfaceC57698Mkg) this.LJLILLLLZI.LJLLILLLL.getValue();
                RecUser recUser = new RecUser(0, 1, null);
                int value = EnumC46514INi.SCENE_BIG_CARDS.getValue();
                int value2 = EnumC57697Mkf.DISLIKE_FEATURE.getValue();
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
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("RecSwipeViewModel", "dislike feature fail", m10exceptionOrNullimpl);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
