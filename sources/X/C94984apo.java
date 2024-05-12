package X;

import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel;
import com.bytedance.ies.effectcreator.swig.UIAnnotationFloat;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel$updateVerticalDistortion$1", f = "LiquefyViewModel.kt", l = {187}, m = "invokeSuspend")
/* renamed from: X.apo, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94984apo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LiquefyViewModel LJLILLLLZI;
    public final /* synthetic */ float LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94984apo(LiquefyViewModel liquefyViewModel, float f, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = liquefyViewModel;
        this.LJLJI = f;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94984apo(this.LJLILLLLZI, this.LJLJI, completion);
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
            UIAnnotationFloat uIAnnotationFloat = this.LJLILLLLZI.LJLLL;
            if (uIAnnotationFloat != null) {
                uIAnnotationFloat.updateValue(this.LJLJI);
            }
            XLM xlm = this.LJLILLLLZI.LJLJLJ;
            Float f = new Float(this.LJLJI);
            this.LJLIL = 1;
            xlm.setValue(f);
            if (C76800UCe.LIZ == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
