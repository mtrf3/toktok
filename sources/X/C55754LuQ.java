package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.ui.share.ShowInviteDialogOperator$asyncShowDialog$1", f = "ShowInviteDialogOperator.kt", l = {70}, m = "invokeSuspend")
/* renamed from: X.LuQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55754LuQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public C55756LuS LJLILLLLZI;
    public Aweme LJLJI;
    public int LJLJJI;
    public final /* synthetic */ C55756LuS LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55754LuQ(C55756LuS c55756LuS, InterfaceC67352kd<? super C55754LuQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c55756LuS;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55754LuQ(this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C55756LuS c55756LuS;
        Aweme aweme;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        if (i != 0) {
            if (i == 1) {
                aweme = this.LJLJI;
                c55756LuS = this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            Object LIZ = new JG4(this.LJLJJL.LIZJ).LIZ();
            C55756LuS c55756LuS2 = this.LJLJJL;
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C221018lt.LIZJ("@LinkRelation_Video", "dialog get aweme fail", m10exceptionOrNullimpl);
                Context context = c55756LuS2.LIZ.getContext();
                if (context != null) {
                    JG7.LIZ(context, m10exceptionOrNullimpl);
                }
            }
            c55756LuS = this.LJLJJL;
            if (C3C5.m13isSuccessimpl(LIZ)) {
                aweme = (Aweme) LIZ;
                aweme.setSharer(c55756LuS.LIZLLL);
                AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                C55755LuR c55755LuR = new C55755LuR(aweme, c55756LuS, null);
                this.LJLIL = LIZ;
                this.LJLILLLLZI = c55756LuS;
                this.LJLJI = aweme;
                this.LJLJJI = 1;
                if (XKX.LJI(abstractC78621UtN, c55755LuR, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        c55756LuS.LJII = aweme;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
