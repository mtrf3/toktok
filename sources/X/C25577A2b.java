package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentReviewDetailsFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import fjb.a;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentReviewDetailsFragment$onViewCreated$1$1$1$1$1$2$1$1", f = "PaidContentReviewDetailsFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.A2b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25577A2b extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C252709vu LJLIL;
    public final /* synthetic */ PaidContentReviewDetailsFragment LJLILLLLZI;
    public final /* synthetic */ CollectionDetailModel LJLJI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25577A2b(C252709vu c252709vu, PaidContentReviewDetailsFragment paidContentReviewDetailsFragment, CollectionDetailModel collectionDetailModel, InterfaceC35811ar<Boolean> interfaceC35811ar, InterfaceC67352kd<? super C25577A2b> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c252709vu;
        this.LJLILLLLZI = paidContentReviewDetailsFragment;
        this.LJLJI = collectionDetailModel;
        this.LJLJJI = interfaceC35811ar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C25577A2b(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        C252709vu c252709vu = this.LJLIL;
        PaidContentReviewDetailsFragment paidContentReviewDetailsFragment = this.LJLILLLLZI;
        if (this.LJLJI.getCanReviewCollection() && !this.LJLJJI.getValue().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        paidContentReviewDetailsFragment.getClass();
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZIZ = "back_btn";
        LIZJ.LIZIZ(new AqS154S0100000_4(paidContentReviewDetailsFragment, 1142));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        String string = paidContentReviewDetailsFragment.getResources().getString(R.string.qps);
        o.LJIIIIZZ(string, "resources.getString(R.st…ilPage_reviewsSec_header)");
        LIZLLL.LIZJ = string;
        c235119Kp.LIZJ = LIZLLL;
        if (z) {
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_pen_on_paper;
            LIZJ2.LIZIZ(new AqS154S0100000_4(paidContentReviewDetailsFragment, 1143));
            c235119Kp.LIZIZ(LIZJ2);
        }
        c252709vu.setNavActions(c235119Kp);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
