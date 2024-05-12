package X;

import com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneInitState;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneVM$quit$1", f = "EffectDoneVM.kt", l = {58}, m = "invokeSuspend")
/* renamed from: X.2sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72532sz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EffectDoneVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72532sz(EffectDoneVM effectDoneVM, InterfaceC67352kd<? super C72532sz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effectDoneVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72532sz(this.LJLILLLLZI, interfaceC67352kd);
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
            android.net.Uri uri = ((EffectDoneInitState) this.LJLILLLLZI.LJLIL.getValue()).editedImage;
            if (uri != null) {
                this.LJLIL = 1;
                obj = XKX.LJI(C78613UtF.LIZJ, new C66452jB(uri, null), this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            this.LJLILLLLZI.setState(C74033T3t.LJLIL);
            return C76800UCe.LIZ;
        }
        ((Boolean) obj).booleanValue();
        this.LJLILLLLZI.setState(C74033T3t.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
