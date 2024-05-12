package X;

import android.view.View;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesDraftActivity;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesDraftActivity$onCreate$1$fetchEditSeries$2$1", f = "SeriesDraftActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9U9, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9U9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SeriesDraftActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9U9(SeriesDraftActivity seriesDraftActivity, InterfaceC67352kd<? super C9U9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = seriesDraftActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C9U9(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        View view = (View) this.LJLIL.LJLJLJ.getValue();
        if (view != null) {
            view.setVisibility(0);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
