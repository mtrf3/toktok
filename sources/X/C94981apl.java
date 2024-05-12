package X;

import com.bytedance.effectcreatormobile.assetEditor.AssetEditorImpl;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform3D;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyImpl$updateCallback$1$onEffectFrame$1", f = "LiquefyImpl.kt", l = {56}, m = "invokeSuspend")
/* renamed from: X.apl, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94981apl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C94410agY LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94981apl(C94410agY c94410agY, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c94410agY;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94981apl(this.LJLILLLLZI, completion);
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
            UIAnnotationTransform3D uIAnnotationTransform3D = this.LJLILLLLZI.LIZ.LJI;
            if (uIAnnotationTransform3D != null) {
                uIAnnotationTransform3D.updateValueFromAMG();
            }
            AssetEditorImpl LIZIZ = C93977aZZ.LIZIZ();
            EnumC93978aZa enumC93978aZa = EnumC93978aZa.UPDATE;
            this.LJLIL = 1;
            if (LIZIZ.emitEditEvent(enumC93978aZa, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
