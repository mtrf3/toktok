package X;

import android.app.Activity;
import android.content.Context;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.utils.TopViewUtils$topViewLiveOpen$1$onFailure$1", f = "TopViewUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64292fh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Context LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64292fh(Context context, InterfaceC67352kd<? super C64292fh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64292fh(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Activity LJIJJ = C45804HyK.LJIJJ(this.LJLIL);
        if (LJIJJ != null) {
            C26045AKb c26045AKb = new C26045AKb(LJIJJ);
            c26045AKb.LIZ(true);
            c26045AKb.LJIIIIZZ(R.string.im9);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
