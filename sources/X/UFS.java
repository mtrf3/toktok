package X;

import android.view.View;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment;
import fjb.a;
import java.util.Iterator;
import kotlin.jvm.internal.AqS179S0100000_13;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.subscription.ui.vspotlight.SubscriptionSpotlightFragment$onViewCreated$2", f = "SubscriptionSpotlightFragment.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UFS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SubscriptionSpotlightFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UFS(SubscriptionSpotlightFragment subscriptionSpotlightFragment, InterfaceC67352kd<? super UFS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = subscriptionSpotlightFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new UFS(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            DialogC25756A8y wl = this.LJLILLLLZI.wl();
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", wl, new Object[0], "void", new C65300Pk0(false, "()V", "-6593851343021018610")).LIZ) {
                wl.show();
            }
            SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LJLILLLLZI;
            View view = subscriptionSpotlightFragment.getView();
            if (view != null) {
                Iterator<Integer> it = subscriptionSpotlightFragment.LJLLLL.iterator();
                while (it.hasNext()) {
                    view.findViewById(it.next().intValue()).setVisibility(8);
                }
                Iterator<Integer> it2 = subscriptionSpotlightFragment.LJLLL.iterator();
                while (it2.hasNext()) {
                    view.findViewById(it2.next().intValue()).setVisibility(8);
                }
            }
            SubscriptionSpotlightFragment subscriptionSpotlightFragment2 = this.LJLILLLLZI;
            AqS179S0100000_13 aqS179S0100000_13 = new AqS179S0100000_13(subscriptionSpotlightFragment2, 330);
            this.LJLIL = 1;
            subscriptionSpotlightFragment2.getClass();
            Object LJI = C48841JEv.LJI(new UFT(subscriptionSpotlightFragment2, aqS179S0100000_13, null), this);
            if (LJI != EnumC58928NAu.COROUTINE_SUSPENDED) {
                LJI = C76800UCe.LIZ;
            }
            if (LJI == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
