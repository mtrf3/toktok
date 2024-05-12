package X;

import com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM;
import fjb.a;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM$onRefresh$1", f = "ContactMaFWidgetVM.kt", l = {124}, m = "invokeSuspend")
/* renamed from: X.Okl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62799Okl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ContactMaFWidgetVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62799Okl(ContactMaFWidgetVM contactMaFWidgetVM, InterfaceC67352kd<? super C62799Okl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = contactMaFWidgetVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C62799Okl(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                P1U p1u = this.LJLILLLLZI.LJLIL;
                EnumC58085Mqv enumC58085Mqv = p1u.LIZIZ;
                if (enumC58085Mqv == EnumC58085Mqv.UNKNOWN) {
                    enumC58085Mqv = C58084Mqu.LIZ(p1u.LIZJ.LJLIL);
                }
                InterfaceC237529Tw interfaceC237529Tw = this.LJLILLLLZI.LJLILLLLZI;
                this.LJLIL = 1;
                obj = interfaceC237529Tw.LIZIZ(enumC58085Mqv, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (C9U5) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        ContactMaFWidgetVM contactMaFWidgetVM = this.LJLILLLLZI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            contactMaFWidgetVM.getClass();
            contactMaFWidgetVM.setState(new AqS141S0200000_10(contactMaFWidgetVM, (C9U5) LIZ, 36));
        }
        ContactMaFWidgetVM contactMaFWidgetVM2 = this.LJLILLLLZI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            contactMaFWidgetVM2.getClass();
            contactMaFWidgetVM2.setState(new AqS176S0100000_10(m10exceptionOrNullimpl, 145));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
