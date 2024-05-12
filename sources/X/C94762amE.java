package X;

import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.impl.ObjectSelectImpl$ReplaceResultHandler$onHandle$1", f = "ObjectSelectImpl.kt", l = {231}, m = "invokeSuspend")
/* renamed from: X.amE, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94762amE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C94094abS LJLILLLLZI;
    public final /* synthetic */ C94270aeI LJLJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94762amE(C94094abS c94094abS, C94270aeI c94270aeI, InterfaceC88472Yns interfaceC88472Yns, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c94094abS;
        this.LJLJI = c94270aeI;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94762amE(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, completion);
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
            long j = this.LJLILLLLZI.LIZ;
            C94270aeI c94270aeI = this.LJLJI;
            String str = c94270aeI.LJLJJI;
            String str2 = c94270aeI.LJLJL;
            EnumC93823aX5 enumC93823aX5 = c94270aeI.LJLJJL;
            Object obj2 = c94270aeI.LJLL;
            this.LJLIL = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            CKEffectEditorContext.LIZLLL(new C94663akd(xks, enumC93823aX5, str, j, str2, obj2));
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJJI.invoke(obj);
        return C76800UCe.LIZ;
    }
}
