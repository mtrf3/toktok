package X;

import Y.IDObserverS227S0100000_42;
import com.bytedance.effectcreatormobile.ckeapi.api.assetEditor.IAssetEditor;
import com.ugc.effectcreator.canvas.CanvasViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ugc.effectcreator.canvas.CanvasViewModel$selectFeatureObserver$1$1", f = "CanvasViewModel.kt", l = {21}, m = "invokeSuspend")
/* renamed from: X.an7, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94817an7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IDObserverS227S0100000_42 LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94817an7(IDObserverS227S0100000_42 iDObserverS227S0100000_42, Long l, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iDObserverS227S0100000_42;
        this.LJLJI = l;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94817an7(this.LJLILLLLZI, this.LJLJI, completion);
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
            XLM xlm = ((CanvasViewModel) this.LJLILLLLZI.l0).LJLIL;
            Long l = this.LJLJI;
            InterfaceC93980aZc interfaceC93980aZc = null;
            if (l != null) {
                long longValue = l.longValue();
                IAssetEditor LIZ = C93979aZb.LIZ();
                if (LIZ != null) {
                    interfaceC93980aZc = LIZ.queryHandler(longValue, null);
                }
            }
            this.LJLIL = 1;
            xlm.setValue(interfaceC93980aZc);
            if (C76800UCe.LIZ == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
