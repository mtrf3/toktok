package X;

import Y.IDCListenerS210S0100000_42;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment$initAction$3$1$1", f = "LiquefyFragment.kt", l = {216}, m = "invokeSuspend")
/* renamed from: X.apZ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94969apZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IDCListenerS210S0100000_42 LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94969apZ(IDCListenerS210S0100000_42 iDCListenerS210S0100000_42, boolean z, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iDCListenerS210S0100000_42;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94969apZ(this.LJLILLLLZI, this.LJLJI, completion);
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
            LiquefyViewModel Gl = ((LiquefyFragment) this.LJLILLLLZI.l0).Gl();
            boolean z = this.LJLJI;
            this.LJLIL = 1;
            if (Gl.kv0(z, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}