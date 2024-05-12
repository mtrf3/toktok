package X;

import Y.IDfS24S0200000_9;
import android.content.Context;
import com.bytedance.vcloud.vctrace.BuildConfig;
import fjb.a;
import kotlin.jvm.internal.AqS113S0300000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.legacy.PermissionItemView$newAuthFlow$1", f = "PermissionItemView.kt", l = {BuildConfig.VERSION_CODE}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MO8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ MO3 LJLJJI;
    public final /* synthetic */ MO5 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MO8(Context context, MO3 mo3, MO5 mo5, InterfaceC67352kd<? super MO8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = context;
        this.LJLJJI = mo3;
        this.LJLJJL = mo5;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        MO8 mo8 = new MO8(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        mo8.LJLILLLLZI = obj;
        return mo8;
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
            C3C3 LIZ = ((USE) C77125UOr.LJII(this.LJLJI, new AqS113S0300000_9((InterfaceC70422pa) this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, 17))).LIZ();
            IDfS24S0200000_9 iDfS24S0200000_9 = new IDfS24S0200000_9(this.LJLJJI, this.LJLJJL, 6);
            this.LJLIL = 1;
            if (LIZ.collect(iDfS24S0200000_9, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
