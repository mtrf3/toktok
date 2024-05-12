package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import fjb.a;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.botanswercard.TakoAnswerUserCardView$bindUserData$1$3", f = "TakoAnswerUserCardView.kt", l = {172}, m = "invokeSuspend")
/* renamed from: X.345, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass345 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C89973g1 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass345(C89973g1 c89973g1, InterfaceC67352kd<? super AnonymousClass345> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c89973g1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass345(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
            C89973g1 c89973g1 = this.LJLILLLLZI;
            this.LJLIL = 1;
            User user = c89973g1.LIZLLL;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            if (!TextUtils.equals(str, HG3.LJIILL().getCurUserId())) {
                RelationButton relationButton = c89973g1.LJII;
                if (relationButton != null) {
                    relationButton.setVisibility(0);
                    if (c89973g1.LJII != null) {
                        c89973g1.LIZ(c89973g1.LIZLLL);
                        RelationButton relationButton2 = c89973g1.LJII;
                        if (relationButton2 != null) {
                            relationButton2.setFollowClickInterceptor(new AnonymousClass344(c89973g1, null));
                            RelationButton relationButton3 = c89973g1.LJII;
                            if (relationButton3 != null) {
                                relationButton3.setDataChangeListener(new AqS167S0100000_1(c89973g1, 397));
                                RelationButton relationButton4 = c89973g1.LJII;
                                if (relationButton4 != null) {
                                    relationButton4.setTracker(new AqS151S0100000_1(c89973g1, 971));
                                } else {
                                    o.LJIJI("relationBtn");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("relationBtn");
                                throw null;
                            }
                        } else {
                            o.LJIJI("relationBtn");
                            throw null;
                        }
                    } else {
                        o.LJIJI("relationBtn");
                        throw null;
                    }
                } else {
                    o.LJIJI("relationBtn");
                    throw null;
                }
            } else {
                RelationButton relationButton5 = c89973g1.LJII;
                if (relationButton5 != null) {
                    relationButton5.setVisibility(8);
                } else {
                    o.LJIJI("relationBtn");
                    throw null;
                }
            }
            if (C76800UCe.LIZ == enumC58928NAu) {
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
