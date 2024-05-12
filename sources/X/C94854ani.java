package X;

import android.content.Context;
import android.widget.EditText;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ugc.effectcreator.layer.EffectLayerEditorFragment$editFeatureName$1", f = "EffectLayerEditorFragment.kt", l = {610}, m = "invokeSuspend")
/* renamed from: X.ani, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94854ani extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EffectLayerEditorFragment LJLILLLLZI;
    public final /* synthetic */ EditText LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94854ani(EffectLayerEditorFragment effectLayerEditorFragment, EditText editText, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effectLayerEditorFragment;
        this.LJLJI = editText;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94854ani(this.LJLILLLLZI, this.LJLJI, completion);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(50L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Context context = this.LJLILLLLZI.getContext();
        EditText editText = this.LJLJI;
        o.LJIIIIZZ(editText, "editText");
        C93736aVg.LIZIZ(context, editText);
        return C76800UCe.LIZ;
    }
}
