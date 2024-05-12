package X;

import com.bytedance.effectcreatormobile.assetEditor.AssetEditorImpl;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment$finish$1$1", f = "LiquefyFragment.kt", l = {333, 334}, m = "invokeSuspend")
/* renamed from: X.am1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94749am1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C94749am1(InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94749am1(completion);
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
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            AssetEditorImpl LIZIZ = C93977aZZ.LIZIZ();
            EnumC93978aZa enumC93978aZa = EnumC93978aZa.EXIT_EDIT_MODE;
            this.LJLIL = 1;
            if (LIZIZ.emitEditEvent(enumC93978aZa, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AssetEditorImpl LIZIZ2 = C93977aZZ.LIZIZ();
        this.LJLIL = 2;
        if (LIZIZ2.emitFocusState(false, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }
}
