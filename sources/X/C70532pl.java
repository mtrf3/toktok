package X;

import android.content.Context;
import android.os.Bundle;
import fjb.a;
import kotlin.jvm.internal.AqS113S0300000_9;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.util.AuthDialogHelper$newAuthDialogCenter$1", f = "AuthDialogHelper.kt", l = {61}, m = "invokeSuspend")
/* renamed from: X.2pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70532pl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ C79057V0z LJLJJI;
    public final /* synthetic */ Bundle LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70532pl(Context context, C79057V0z c79057V0z, Bundle bundle, InterfaceC67352kd<? super C70532pl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = context;
        this.LJLJJI = c79057V0z;
        this.LJLJJL = bundle;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C70532pl c70532pl = new C70532pl(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c70532pl.LJLILLLLZI = obj;
        return c70532pl;
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
            InterfaceC70542pm LJJII = C78609UtB.LJJII(this.LJLJI, new AqS113S0300000_9((InterfaceC70422pa) this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, 8));
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
