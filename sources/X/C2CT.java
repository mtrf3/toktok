package X;

import Y.IDeS153S0200000_15;
import android.view.View;
import fjb.a;

@InterfaceC65848Psq(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", l = {365}, m = "invokeSuspend")
/* renamed from: X.2CT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C0ST LJLJI;
    public final /* synthetic */ C0SD LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ InterfaceC23370vt LJLJJLL;
    public final /* synthetic */ float LJLJL;
    public final /* synthetic */ C3BJ<C76800UCe> LJLJLJ;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC88472Yns<C23430vz, C76800UCe>> LJLJLLL;
    public final /* synthetic */ InterfaceC24760y8<Boolean> LJLL;
    public final /* synthetic */ InterfaceC24760y8<C10370av> LJLLI;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC88472Yns<InterfaceC23370vt, C10370av>> LJLLILLLL;
    public final /* synthetic */ InterfaceC35811ar<C10370av> LJLLJ;
    public final /* synthetic */ InterfaceC24760y8<Float> LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2CT(C0ST c0st, C0SD c0sd, View view, InterfaceC23370vt interfaceC23370vt, float f, C3BJ<C76800UCe> c3bj, InterfaceC24760y8<? extends InterfaceC88472Yns<? super C23430vz, C76800UCe>> interfaceC24760y8, InterfaceC24760y8<Boolean> interfaceC24760y82, InterfaceC24760y8<C10370av> interfaceC24760y83, InterfaceC24760y8<? extends InterfaceC88472Yns<? super InterfaceC23370vt, C10370av>> interfaceC24760y84, InterfaceC35811ar<C10370av> interfaceC35811ar, InterfaceC24760y8<Float> interfaceC24760y85, InterfaceC67352kd<? super C2CT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c0st;
        this.LJLJJI = c0sd;
        this.LJLJJL = view;
        this.LJLJJLL = interfaceC23370vt;
        this.LJLJL = f;
        this.LJLJLJ = c3bj;
        this.LJLJLLL = interfaceC24760y8;
        this.LJLL = interfaceC24760y82;
        this.LJLLI = interfaceC24760y83;
        this.LJLLILLLL = interfaceC24760y84;
        this.LJLLJ = interfaceC35811ar;
        this.LJLLL = interfaceC24760y85;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2CT c2ct = new C2CT(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, interfaceC67352kd);
        c2ct.LJLILLLLZI = obj;
        return c2ct;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C0SQ LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                LIZ = (C0SQ) this.LJLILLLLZI;
                try {
                    C141335gf.LIZJ(obj);
                } catch (Throwable th) {
                    th = th;
                    LIZ.dismiss();
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            LIZ = this.LJLJI.LIZ(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
            C72242sW c72242sW = new C72242sW();
            long LIZ2 = LIZ.LIZ();
            InterfaceC23370vt interfaceC23370vt = this.LJLJJLL;
            InterfaceC88472Yns<C23430vz, C76800UCe> value = this.LJLJLLL.getValue();
            if (value != null) {
                value.invoke(new C23430vz(interfaceC23370vt.LJIJ(C78996UzQ.LJJJJIZL(LIZ2))));
            }
            c72242sW.element = LIZ2;
            V1M.LJJIJIIJIL(new IDeS153S0200000_15(this.LJLJLJ, new C2CS(LIZ, null), 0), interfaceC70422pa);
            try {
                C3C3 LJJJJZI = C78966Uyw.LJJJJZI(new C49341wg(LIZ, this.LJLJJLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, c72242sW, this.LJLJLLL));
                this.LJLILLLLZI = LIZ;
                this.LJLIL = 1;
                if (V1M.LJII(LJJJJZI, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } catch (Throwable th2) {
                th = th2;
                LIZ.dismiss();
                throw th;
            }
        }
        LIZ.dismiss();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
