package X;

import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM$publish$1$1", f = "TopicReviewVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186257Sr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Fragment LJLIL;
    public final /* synthetic */ DialogC25756A8y LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C186257Sr(Fragment fragment, DialogC25756A8y dialogC25756A8y, InterfaceC67352kd<? super C186257Sr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = fragment;
        this.LJLILLLLZI = dialogC25756A8y;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C186257Sr(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
        c26045AKb.LJIIIZ(this.LJLIL.getString(R.string.dtf));
        c26045AKb.LJIIJ();
        this.LJLILLLLZI.hide();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
