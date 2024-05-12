package X;

import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM$quit$1$1", f = "EffectEditVM.kt", l = {262}, m = "invokeSuspend")
/* renamed from: X.2sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72522sy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C74189T9t LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72522sy(C74189T9t c74189T9t, InterfaceC67352kd<? super C72522sy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c74189T9t;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72522sy(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        android.net.Uri uri;
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
            EditImage editImage = this.LJLILLLLZI.LJLJJLL;
            if (editImage != null && (uri = editImage.url) != null) {
                this.LJLIL = 1;
                if (XKX.LJI(C78613UtF.LIZJ, new C66452jB(uri, null), this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
