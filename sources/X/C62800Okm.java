package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.auth.widget.fb.FacebookMaFWidgetVM;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.widget.fb.FacebookMaFWidgetVM$onRefresh$1", f = "FacebookMaFWidgetVM.kt", l = {89}, m = "invokeSuspend")
/* renamed from: X.Okm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62800Okm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ FacebookMaFWidgetVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62800Okm(FacebookMaFWidgetVM facebookMaFWidgetVM, InterfaceC67352kd<? super C62800Okm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = facebookMaFWidgetVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C62800Okm(this.LJLILLLLZI, interfaceC67352kd);
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
                P1V p1v = this.LJLILLLLZI.LJLIL;
                EnumC58085Mqv enumC58085Mqv = p1v.LIZIZ;
                if (enumC58085Mqv == EnumC58085Mqv.UNKNOWN) {
                    enumC58085Mqv = C58084Mqu.LIZ(p1v.LIZJ.LJLIL);
                }
                InterfaceC237509Tu interfaceC237509Tu = this.LJLILLLLZI.LJLILLLLZI;
                this.LJLIL = 1;
                obj = interfaceC237509Tu.LIZIZ(enumC58085Mqv, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (List) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        FacebookMaFWidgetVM facebookMaFWidgetVM = this.LJLILLLLZI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            facebookMaFWidgetVM.setState(new AqS141S0200000_10(facebookMaFWidgetVM, (FacebookMaFWidgetVM) LIZ, (List<? extends User>) 41));
        }
        FacebookMaFWidgetVM facebookMaFWidgetVM2 = this.LJLILLLLZI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            facebookMaFWidgetVM2.setState(new AqS176S0100000_10(m10exceptionOrNullimpl, 171));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
