package X;

import Y.IDfS134S0100000_42;
import android.widget.EditText;
import com.bytedance.effectcreatormobile.objectselect.gif.GifsFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.gif.GifsFragment$initView$4", f = "GifsFragment.kt", l = {238}, m = "invokeSuspend")
/* renamed from: X.alm, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94734alm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GifsFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94734alm(GifsFragment gifsFragment, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = gifsFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94734alm(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            C94036aaW c94036aaW = this.LJLILLLLZI.LJLIL;
            o.LJI(c94036aaW);
            EditText afterTextChangedFlow = c94036aaW.LJLJLJ.getEditText();
            o.LJIIIZ(afterTextChangedFlow, "$this$afterTextChangedFlow");
            InterfaceC65462ha LJIIJJI = V1M.LJIIJJI(V1M.LJIIJ(V1M.LJFF(new C94846ana(afterTextChangedFlow, null)), 500L));
            IDfS134S0100000_42 iDfS134S0100000_42 = new IDfS134S0100000_42(this, 0);
            this.LJLIL = 1;
            if (LJIIJJI.collect(iDfS134S0100000_42, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
