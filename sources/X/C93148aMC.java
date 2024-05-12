package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment$onValidateCode$1", f = "OtpFragment.kt", l = {416}, m = "invokeSuspend")
/* renamed from: X.aMC, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93148aMC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ OtpFragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93148aMC(OtpFragment otpFragment, String str, InterfaceC67352kd<? super C93148aMC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = otpFragment;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93148aMC(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            OtpFragment otpFragment = this.LJLILLLLZI;
            otpFragment._$_findCachedViewById(R.id.f6).setVisibility(0);
            ((C74086T5u) otpFragment._$_findCachedViewById(R.id.f6)).LIZIZ();
            ((TextView) this.LJLILLLLZI._$_findCachedViewById(R.id.f8)).setEnabled(false);
            ((TextView) this.LJLILLLLZI._$_findCachedViewById(R.id.f5)).setEnabled(false);
            XIA xia = C78613UtF.LIZJ;
            C93147aMB c93147aMB = new C93147aMB(this.LJLILLLLZI, this.LJLJI, null);
            this.LJLIL = 1;
            if (XKX.LJI(xia, c93147aMB, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        OtpFragment otpFragment2 = this.LJLILLLLZI;
        otpFragment2._$_findCachedViewById(R.id.f6).setVisibility(8);
        ((C74086T5u) otpFragment2._$_findCachedViewById(R.id.f6)).LIZJ();
        TextView textView = (TextView) this.LJLILLLLZI._$_findCachedViewById(R.id.f8);
        if (textView != null) {
            textView.setEnabled(true);
        }
        ((TextView) this.LJLILLLLZI._$_findCachedViewById(R.id.f5)).setEnabled(true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
