package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity$setKeywordAutoReplyUI$1", f = "BaMessageSettingActivity.kt", l = {421}, m = "invokeSuspend")
/* renamed from: X.9Z7, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Z7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BaMessageSettingActivity LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9Z7(BaMessageSettingActivity baMessageSettingActivity, boolean z, InterfaceC67352kd<? super C9Z7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = baMessageSettingActivity;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C9Z7 c9z7 = new C9Z7(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c9z7.LJLILLLLZI = obj;
        return c9z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        List<C9Z3> list;
        boolean z;
        String str;
        StringBuilder LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                IBaAutoMessageService iBaAutoMessageService = this.LJLJI.LJLJJI;
                this.LJLILLLLZI = interfaceC70422pa;
                this.LJLIL = 1;
                obj = iBaAutoMessageService.LJIIIIZZ(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            list = (List) obj;
        } catch (Exception unused) {
        }
        if (list == null) {
            return C76800UCe.LIZ;
        }
        BaMessageSettingActivity baMessageSettingActivity = this.LJLJI;
        if (!list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        baMessageSettingActivity.LJLLL = z;
        StringBuilder sb = new StringBuilder();
        sb.append(this.LJLJI.getResources().getText(R.string.xa));
        if (C90193gN.LIZ()) {
            sb.append("(4/");
            sb.append(list.size());
            sb.append(") ");
        } else {
            sb.append(" (");
            sb.append(list.size());
            sb.append("/4)");
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "StringBuilder().apply {\n…             }.toString()");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        C76732zl c76732zl = new C76732zl();
        if (list.isEmpty()) {
            str = null;
        } else {
            for (C9Z3 c9z3 : list) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append((String) c68322mC.element);
                if (c76732zl.element > 0) {
                    LIZ = X1D.LIZ();
                    LIZ.append(", ");
                    LIZ.append(c9z3.LIZJ);
                } else {
                    LIZ = X1D.LIZ();
                    LIZ.append(c9z3.LIZJ);
                    LIZ.append("");
                }
                LIZ2.append(X1D.LIZIZ(LIZ));
                c68322mC.element = X1D.LIZIZ(LIZ2);
                c76732zl.element++;
            }
            str = (String) c68322mC.element;
        }
        XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ, null, new C9ZF(this.LJLJI, this.LJLJJI, str, sb2, null), 2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
