package X;

import com.bytedance.android.livesdk.chatroom.api.SpotlightItem;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS144S0200000_13;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment$getSpotlightLoop$2", f = "SubscriptionSpotlightFragment.kt", l = {218}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UFT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ SubscriptionSpotlightFragment LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<List<SpotlightItem>, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UFT(SubscriptionSpotlightFragment subscriptionSpotlightFragment, InterfaceC88472Yns<? super List<SpotlightItem>, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super UFT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = subscriptionSpotlightFragment;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        UFT uft = new UFT(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        uft.LJLILLLLZI = obj;
        return uft;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                try {
                    C141335gf.LIZJ(obj);
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception unused) {
                    C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
                    c26045AKb.LJIIIIZZ(R.string.sz0);
                    c26045AKb.LJIIJ();
                    this.LJLJI.wl().dismiss();
                    return C76800UCe.LIZ;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
        }
        do {
            C31847Ceh.LIZJ(new AqS144S0200000_13((InterfaceC88472Yns) this.LJLJJI, (InterfaceC88472Yns<? super List<SpotlightItem>, C76800UCe>) interfaceC70422pa, (InterfaceC70422pa) 72));
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
        } while (C1JD.LIZJ(5000L, this) != enumC58928NAu);
        return enumC58928NAu;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
