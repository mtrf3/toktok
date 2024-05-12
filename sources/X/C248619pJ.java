package X;

import com.ss.android.ugc.aweme.model.PricesResponse;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesDraftActivity;
import com.ss.android.ugc.aweme.service.IPaidContentCreationService;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesDraftActivity$onCreate$1$fetchPrices$1", f = "SeriesDraftActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9pJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C248619pJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super PricesResponse>, Object> {
    public final /* synthetic */ SeriesDraftActivity LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C248619pJ(SeriesDraftActivity seriesDraftActivity, InterfaceC67352kd<? super C248619pJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = seriesDraftActivity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C248619pJ(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Object value = this.LJLIL.LLFII().LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-creationService>(...)");
        T LJ = ((IPaidContentCreationService) value).LJI(EnumC248729pU.PAID_CONTENT).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJ();
        o.LJIIIIZZ(LJ, "creationService.getPrice…           .blockingGet()");
        return LJ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super PricesResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
