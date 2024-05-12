package X;

import com.ss.android.ugc.aweme.paidcontent.util.SeriesCountDownTimer;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.util.SeriesCountDownTimer$startUpdatingExpiry$1", f = "SeriesCountDownTimer.kt", l = {45}, m = "invokeSuspend")
/* renamed from: X.2hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65642hs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ SeriesCountDownTimer LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<C65652ht, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C65642hs(long j, SeriesCountDownTimer seriesCountDownTimer, InterfaceC88472Yns<? super C65652ht, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C65642hs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = seriesCountDownTimer;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65642hs(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i == 0 || i == 1) {
            C141335gf.LIZJ(obj);
            do {
                C65652ht c65652ht = new C65652ht(this.LJLILLLLZI - System.currentTimeMillis());
                if (!o.LJ(this.LJLJI.LJLILLLLZI, c65652ht)) {
                    SeriesCountDownTimer seriesCountDownTimer = this.LJLJI;
                    InterfaceC88472Yns<C65652ht, C76800UCe> interfaceC88472Yns = this.LJLJJI;
                    seriesCountDownTimer.LJLILLLLZI = c65652ht;
                    interfaceC88472Yns.invoke(c65652ht);
                }
                this.LJLIL = 1;
            } while (C1JD.LIZJ(100L, this) != enumC58928NAu);
            return enumC58928NAu;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
