package X;

import Y.IDObjectS187S0100000_42;
import android.widget.EditText;
import fjb.a;
import kotlin.jvm.internal.IDqS179S0200000_42;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ugc.effectcreator.foundation.view.EditTextExtKt$afterTextChangedFlow$1", f = "EditTextExt.kt", l = {23}, m = "invokeSuspend")
/* renamed from: X.ana, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94846ana extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<? super String>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ EditText LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94846ana(EditText editText, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = editText;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C94846ana c94846ana = new C94846ana(this.LJLJI, completion);
        c94846ana.LJLIL = obj;
        return c94846ana;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3CK<? super String> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3ck, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C3CK c3ck = (C3CK) this.LJLIL;
            IDObjectS187S0100000_42 iDObjectS187S0100000_42 = new IDObjectS187S0100000_42(c3ck, 3);
            this.LJLJI.addTextChangedListener(iDObjectS187S0100000_42);
            IDqS179S0200000_42 iDqS179S0200000_42 = new IDqS179S0200000_42(this, iDObjectS187S0100000_42, 7);
            this.LJLILLLLZI = 1;
            if (C3T0.LIZ(c3ck, iDqS179S0200000_42, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
