package X;

import android.view.View;
import android.view.ViewGroup;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {406, 408}, m = "invokeSuspend")
/* renamed from: X.2F6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2F6 extends AbstractC65783Prn implements InterfaceC88471Ynr<AbstractC37657EqD<? super View>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ View LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2F6(View view, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C2F6 c2f6 = new C2F6(this.LJLJJI, completion);
        c2f6.LJLILLLLZI = obj;
        return c2f6;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(AbstractC37657EqD<? super View> abstractC37657EqD, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(abstractC37657EqD, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        AbstractC37657EqD abstractC37657EqD;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC37657EqD = (AbstractC37657EqD) this.LJLILLLLZI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            abstractC37657EqD = (AbstractC37657EqD) this.LJLILLLLZI;
            View view = this.LJLJJI;
            this.LJLILLLLZI = abstractC37657EqD;
            this.LJLJI = 1;
            if (abstractC37657EqD.LIZ(view, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        View view2 = this.LJLJJI;
        if (view2 instanceof ViewGroup) {
            ViewGroup descendants = (ViewGroup) view2;
            o.LJIIIZ(descendants, "$this$descendants");
            C37655EqB c37655EqB = new C37655EqB(new C2F5(descendants, null));
            this.LJLILLLLZI = null;
            this.LJLJI = 2;
            abstractC37657EqD.getClass();
            Object LIZIZ = abstractC37657EqD.LIZIZ(c37655EqB.iterator(), this);
            if (LIZIZ != enumC58928NAu) {
                LIZIZ = C76800UCe.LIZ;
            }
            if (LIZIZ == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
