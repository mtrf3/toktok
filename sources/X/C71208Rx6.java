package X;

import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.ECAudienceWidget$onMessage$4", f = "ECAudienceWidget.kt", l = {1125}, m = "invokeSuspend")
/* renamed from: X.Rx6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71208Rx6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AtmosphereTagInfo LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71208Rx6(AtmosphereTagInfo atmosphereTagInfo, InterfaceC67352kd<? super C71208Rx6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = atmosphereTagInfo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71208Rx6(this.LJLILLLLZI, interfaceC67352kd);
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
            FSJ fsj = C36576EXc.LIZIZ;
            C71210Rx8 c71210Rx8 = new C71210Rx8(this.LJLILLLLZI, null);
            this.LJLIL = 1;
            obj = XKX.LJI(fsj, c71210Rx8, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        String str = (String) obj;
        if (str != null) {
            EventCenter.LJ().LIZ("ec_audience_hot_sale_event", str);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}