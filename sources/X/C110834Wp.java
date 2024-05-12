package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.I18nUploadSuccessPopWindow$onChannelClicked$1$preShareJob$1", f = "I18nUploadSuccessPopWindow.kt", l = {96}, m = "invokeSuspend")
/* renamed from: X.4Wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110834Wp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C109394Rb LJLILLLLZI;
    public final /* synthetic */ InterfaceC62225ObV LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C110834Wp(C109394Rb c109394Rb, InterfaceC62225ObV interfaceC62225ObV, InterfaceC67352kd<? super C110834Wp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c109394Rb;
        this.LJLJI = interfaceC62225ObV;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C110834Wp(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C109394Rb c109394Rb = this.LJLILLLLZI;
            C62387Oe7 c62387Oe7 = c109394Rb.LJZI;
            InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
            if (interfaceC62474OfW != null) {
                InterfaceC62225ObV interfaceC62225ObV = this.LJLJI;
                BaseSharePackage baseSharePackage = c62387Oe7.LJIIJ;
                Activity activity = c109394Rb.LLFF;
                this.LJLIL = 1;
                if (interfaceC62474OfW.LIZJ(activity, baseSharePackage, interfaceC62225ObV, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                return null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
