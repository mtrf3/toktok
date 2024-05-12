package X;

import android.content.Context;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.ToastService;
import fjb.a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.modelselect.model.ModelViewModel$select$1$1", f = "ModelViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.am9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94757am9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ IDqS175S0200000_42 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94757am9(IDqS175S0200000_42 iDqS175S0200000_42, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = iDqS175S0200000_42;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94757am9(this.LJLIL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Context context = (Context) ((WeakReference) this.LJLIL.l1).get();
        if (context != null) {
            ToastService.INSTANCE.showToast(context, "download model picture fail!");
        }
        C94034aaU.LIZ("ModelViewModel", "download fail");
        return C76800UCe.LIZ;
    }
}
