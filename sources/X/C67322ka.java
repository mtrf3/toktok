package X;

import com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.common.RelationAuthDialogControl$positiveForGoSettingDialog$3", f = "RelationAuthDialogControl.kt", l = {338}, m = "invokeSuspend")
/* renamed from: X.2ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67322ka extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ RelationAuthDialogControl LJLILLLLZI;
    public final /* synthetic */ XJL<Boolean> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C67322ka(RelationAuthDialogControl relationAuthDialogControl, XJL<? super Boolean> xjl, InterfaceC67352kd<? super C67322ka> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = relationAuthDialogControl;
        this.LJLJI = xjl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67322ka(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            XKM xkm = (XKM) this.LJLILLLLZI.LJLJL.getValue();
            this.LJLIL = 1;
            obj = xkm.LJIIIIZZ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            XJL<Boolean> xjl = this.LJLJI;
            Boolean bool = Boolean.TRUE;
            C3C5.m7constructorimpl(bool);
            xjl.resumeWith(bool);
        } else {
            XJL<Boolean> xjl2 = this.LJLJI;
            Boolean bool2 = Boolean.FALSE;
            C3C5.m7constructorimpl(bool2);
            xjl2.resumeWith(bool2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
