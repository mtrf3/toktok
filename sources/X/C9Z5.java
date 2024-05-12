package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity$onResume$1", f = "BaAutoReplyListActivity.kt", l = {76, 94}, m = "invokeSuspend")
/* renamed from: X.9Z5, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Z5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public BaAutoReplyListActivity LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ BaAutoReplyListActivity LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9Z5(BaAutoReplyListActivity baAutoReplyListActivity, InterfaceC67352kd<? super C9Z5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = baAutoReplyListActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9Z5(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        BaAutoReplyListActivity baAutoReplyListActivity;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baAutoReplyListActivity = this.LJLIL;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            baAutoReplyListActivity = this.LJLJI;
            IBaAutoMessageService iBaAutoMessageService = baAutoReplyListActivity.LJLJJL;
            this.LJLIL = baAutoReplyListActivity;
            this.LJLILLLLZI = 1;
            obj = iBaAutoMessageService.LJIIIIZZ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        List<C9Z3> list = (List) obj;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        baAutoReplyListActivity.getClass();
        o.LJIIIZ(list, "<set-?>");
        baAutoReplyListActivity.LJLJJI = list;
        BaAutoReplyListActivity baAutoReplyListActivity2 = this.LJLJI;
        C238759Yp c238759Yp = baAutoReplyListActivity2.LJLJI;
        List<C9Z3> list2 = baAutoReplyListActivity2.LJLJJI;
        c238759Yp.getClass();
        o.LJIIIZ(list2, "<set-?>");
        c238759Yp.LJLILLLLZI = list2;
        StringBuilder sb = new StringBuilder();
        BaAutoReplyListActivity baAutoReplyListActivity3 = this.LJLJI;
        sb.append(baAutoReplyListActivity3.getResources().getText(R.string.hm5));
        if (C90193gN.LIZIZ(baAutoReplyListActivity3)) {
            sb.append("(4/");
            DIL.LIZIZ(baAutoReplyListActivity3.LJLJJI, sb, ")");
        } else {
            sb.append("(");
            DIL.LIZIZ(baAutoReplyListActivity3.LJLJJI, sb, "/4)");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder().apply {\n…\n            }.toString()");
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C9Z4 c9z4 = new C9Z4(this.LJLJI, sb2, null);
        this.LJLIL = null;
        this.LJLILLLLZI = 2;
        if (XKX.LJI(abstractC78621UtN, c9z4, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
