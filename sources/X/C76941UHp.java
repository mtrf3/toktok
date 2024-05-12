package X;

import android.content.Context;
import com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl$requestContactActualPermission$2$interceptor$1$intercept$1", f = "RelationAuthDialogControl.kt", l = {123}, m = "invokeSuspend")
/* renamed from: X.UHp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76941UHp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ RelationAuthDialogControl LJLILLLLZI;
    public final /* synthetic */ C61101NyT LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76941UHp(RelationAuthDialogControl relationAuthDialogControl, C61101NyT c61101NyT, InterfaceC67352kd<? super C76941UHp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = relationAuthDialogControl;
        this.LJLJI = c61101NyT;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76941UHp(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            RelationAuthDialogControl relationAuthDialogControl = this.LJLILLLLZI;
            Context context = relationAuthDialogControl.LJLIL;
            EnumC77147UPn enumC77147UPn = EnumC77147UPn.CONTACT;
            this.LJLIL = 1;
            obj = relationAuthDialogControl.LIZJ(context, enumC77147UPn, "authorize", null, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C61101NyT c61101NyT = this.LJLJI;
            if (c61101NyT != null) {
                c61101NyT.LIZIZ();
            }
        } else {
            C61101NyT c61101NyT2 = this.LJLJI;
            if (c61101NyT2 != null) {
                c61101NyT2.LIZ();
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
