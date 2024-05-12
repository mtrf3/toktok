package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS167S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.botanswercard.TakoAnswerUserCardView$setupRelationBtn$2", f = "TakoAnswerUserCardView.kt", l = {237, 239}, m = "invokeSuspend")
/* renamed from: X.344, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass344 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C89973g1 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass344(C89973g1 c89973g1, InterfaceC67352kd<? super AnonymousClass344> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = c89973g1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass344(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    z = ((Boolean) obj).booleanValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                z = ((Boolean) obj).booleanValue();
            }
        } else {
            C141335gf.LIZJ(obj);
            User user = this.LJLILLLLZI.LIZLLL;
            if (user == null) {
                return Boolean.TRUE;
            }
            z = false;
            if (user.getFollowStatus() == EnumC57435MgR.UNFOLLOW.getValue() && user.getBlockStatus() == 1) {
                C89973g1 c89973g1 = this.LJLILLLLZI;
                this.LJLIL = 1;
                c89973g1.getClass();
                XKS xks = new XKS(1, C78555UsJ.LJJII(this));
                xks.LJIIL();
                C26227ARb LIZIZ = C77413UZt.LIZIZ(c89973g1.LIZ);
                LIZIZ.LJII = false;
                LIZIZ.LIZ(R.string.td_);
                UC0.LIZJ(LIZIZ, C2U3.LJLIL);
                LIZIZ.LIZJ(new AqS167S0100000_1(xks, 396));
                LIZIZ.LJI().LIZLLL();
                obj = xks.LJIIJJI();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                z = ((Boolean) obj).booleanValue();
            } else if (user.getFollowStatus() == EnumC57435MgR.FOLLOW_REQUESTED.getValue()) {
                C89973g1 c89973g12 = this.LJLILLLLZI;
                this.LJLIL = 2;
                c89973g12.getClass();
                XKS xks2 = new XKS(1, C78555UsJ.LJJII(this));
                xks2.LJIIL();
                if (c89973g12.LJIIIZ) {
                    Boolean bool = Boolean.TRUE;
                    C3C5.m7constructorimpl(bool);
                    xks2.resumeWith(bool);
                }
                C26227ARb LIZIZ2 = C77413UZt.LIZIZ(c89973g12.LIZ);
                LIZIZ2.LJII = false;
                LIZIZ2.LIZ(R.string.gkc);
                UC0.LIZJ(LIZIZ2, new AqS167S0100000_1(c89973g12, 392));
                LIZIZ2.LIZJ(new AqS167S0100000_1(xks2, 393));
                LIZIZ2.LJI().LIZLLL();
                c89973g12.LJIIIZ = true;
                obj = xks2.LJIIJJI();
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                z = ((Boolean) obj).booleanValue();
            }
        }
        return Boolean.valueOf(z);
    }
}
