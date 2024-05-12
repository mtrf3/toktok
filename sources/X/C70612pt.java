package X;

import android.content.Context;
import fjb.a;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateRightView$newAuthDialogCenter$1", f = "NoticeTemplateRightView.kt", l = {362}, m = "invokeSuspend")
/* renamed from: X.2pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70612pt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C56915MVj LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70612pt(C56915MVj c56915MVj, InterfaceC67352kd<? super C70612pt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c56915MVj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C70612pt c70612pt = new C70612pt(this.LJLJI, interfaceC67352kd);
        c70612pt.LJLILLLLZI = obj;
        return c70612pt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3C3 LIZJ;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            Context context = this.LJLJI.getContext();
            o.LJIIIIZZ(context, "context");
            InterfaceC70542pm LJJII = C78609UtB.LJJII(context, new AqS175S0100000_9(interfaceC70422pa, 468));
            if (LJJII != null && (LIZJ = ((C77202URq) LJJII).LIZJ()) != null) {
                this.LJLIL = 1;
                if (V1M.LJII(LIZJ, this) == enumC58928NAu) {
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
