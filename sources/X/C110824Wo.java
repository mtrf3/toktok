package X;

import android.app.Dialog;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import fjb.a;
import kotlin.jvm.internal.AqS132S0200000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.I18nUploadSuccessPopWindow$onChannelClicked$1", f = "I18nUploadSuccessPopWindow.kt", l = {97}, m = "invokeSuspend")
/* renamed from: X.4Wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110824Wo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C109394Rb LJLJI;
    public final /* synthetic */ InterfaceC62225ObV LJLJJI;
    public final /* synthetic */ View LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C110824Wo(C109394Rb c109394Rb, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC67352kd<? super C110824Wo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c109394Rb;
        this.LJLJJI = interfaceC62225ObV;
        this.LJLJJL = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C110824Wo c110824Wo = new C110824Wo(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c110824Wo.LJLILLLLZI = obj;
        return c110824Wo;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean LIZLLL;
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
            C84661XKn LIZIZ = XKX.LIZIZ((InterfaceC70422pa) this.LJLILLLLZI, null, null, new C110834Wp(this.LJLJI, this.LJLJJI, null), 3);
            this.LJLIL = 1;
            if (LIZIZ.LJJIJ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C109394Rb c109394Rb = this.LJLJI;
        BaseSharePackage baseSharePackage = c109394Rb.LJZI.LJIIJ;
        InterfaceC62225ObV interfaceC62225ObV = this.LJLJJI;
        LIZLLL = baseSharePackage.LIZLLL(interfaceC62225ObV, c109394Rb.LLFF, this.LJLJJL, null, new AqS132S0200000_1(c109394Rb, interfaceC62225ObV, 32));
        if (!LIZLLL) {
            if (C62547Ogh.LIZ(this.LJLJJI.key())) {
                V1B.LJLJJL((Dialog) this.LJLJI.LLFII.getValue());
            }
            C109394Rb c109394Rb2 = this.LJLJI;
            BaseSharePackage baseSharePackage2 = c109394Rb2.LJZI.LJIIJ;
            InterfaceC62225ObV interfaceC62225ObV2 = this.LJLJJI;
            baseSharePackage2.LJIILIIL(interfaceC62225ObV2, new AqS132S0200000_1(c109394Rb2, interfaceC62225ObV2, 33));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
