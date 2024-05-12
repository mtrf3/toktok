package X;

import Y.AfS30S0110000_15;
import android.app.Activity;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.account.login.passkey.PasskeyService$createPasskey$1", f = "PasskeyService.kt", l = {278}, m = "invokeSuspend")
/* renamed from: X.XlD, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85759XlD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ C1ZW LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ InterfaceC85767XlL LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85759XlD(Activity activity, C1ZW c1zw, boolean z, boolean z2, InterfaceC85767XlL interfaceC85767XlL, String str, InterfaceC67352kd<? super C85759XlD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = activity;
        this.LJLJI = c1zw;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = interfaceC85767XlL;
        this.LJLJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85759XlD(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
                Activity context = this.LJLILLLLZI;
                o.LJIIIZ(context, "context");
                C22340uE c22340uE = new C22340uE(context);
                C1ZW c1zw = this.LJLJI;
                Activity activity = this.LJLILLLLZI;
                this.LJLIL = 1;
                obj = c22340uE.LIZ(c1zw, activity, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            o.LJII(obj, "null cannot be cast to non-null type androidx.credentials.CreatePublicKeyCredentialResponse");
            C85761XlF.LJII(OAF.LIZIZ(this.LJLILLLLZI), this.LJLJJI, Boolean.valueOf(this.LJLJJL), 0);
            C85761XlF.LJFF(Boolean.valueOf(this.LJLJJL), this.LJLJJI);
            this.LJLJJLL.LJII();
            C85761XlF.LIZLLL(this.LJLJJI, this.LJLJJL, 1);
            C73517StF LIZ = C85765XlJ.LIZ(((C1ZX) obj).LIZ, this.LJLJL);
            boolean z = this.LJLJJI;
            boolean z2 = this.LJLJJL;
            InterfaceC85767XlL interfaceC85767XlL = this.LJLJJLL;
            LIZ.LJIIZILJ(new C85763XlH(z, z2, interfaceC85767XlL), new AfS30S0110000_15(interfaceC85767XlL, z2, 0));
        } catch (AbstractC23600wG e) {
            C85766XlK.LIZ(this.LJLJJLL, e, true, Boolean.valueOf(this.LJLJJL), 8);
            C85761XlF.LIZLLL(this.LJLJJI, this.LJLJJL, 0);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
