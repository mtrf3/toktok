package X;

import android.content.Context;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberVM;
import com.ss.android.ugc.aweme.bnpl.network.VerifyApi;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberVM$confirmRegisterMobile$2", f = "PhoneNumberVM.kt", l = {70, 71, 88}, m = "invokeSuspend")
/* renamed from: X.aM0, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93136aM0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PhoneNumberVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93136aM0(PhoneNumberVM phoneNumberVM, InterfaceC67352kd<? super C93136aM0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = phoneNumberVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93136aM0(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        try {
        } catch (Exception e) {
            PhoneNumberVM phoneNumberVM = this.LJLILLLLZI;
            Context LIZIZ = EF7.LIZIZ();
            if (e instanceof C64698PaI) {
                i = R.string.f3i;
            } else {
                i = R.string.f3g;
            }
            String string = LIZIZ.getString(i);
            this.LJLIL = 3;
            if (phoneNumberVM.gv0(string, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C141335gf.LIZJ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C141335gf.LIZJ(obj);
                }
                return C76800UCe.LIZ;
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            C91820a0m c91820a0m = VerifyApi.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLILLLLZI.LJLJI);
            LIZ.append('-');
            LIZ.append(this.LJLILLLLZI.LJLILLLLZI);
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            this.LJLIL = 1;
            c91820a0m.getClass();
            obj = C91820a0m.LIZIZ.confirmRegisterMobile(LIZIZ2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C93135aLz c93135aLz = new C93135aLz((C64797Pbt) obj, this.LJLILLLLZI, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN, c93135aLz, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
