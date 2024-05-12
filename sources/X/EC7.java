package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotUpdateParams;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.repository.CustomDotApi;
import fjb.a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM$updateTooltipShow$1", f = "CustomDotVM.kt", l = {861, 861}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EC7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ReachCfg LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ CustomDotVM LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EC7(ReachCfg reachCfg, boolean z, CustomDotVM customDotVM, InterfaceC67352kd<? super EC7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = reachCfg;
        this.LJLJI = z;
        this.LJLJJI = customDotVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EC7(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
                return C76800UCe.LIZ;
            }
        } else {
            C141335gf.LIZJ(obj);
            ReachCfg reachCfg = this.LJLILLLLZI;
            boolean z = this.LJLJI;
            CustomDotVM customDotVM = this.LJLJJI;
            ArrayList arrayList = new ArrayList();
            if (reachCfg != null) {
                arrayList.add(ReachCfg.copy$default(reachCfg, null, null, null, 5, null));
            }
            if (!arrayList.isEmpty()) {
                CustomDotApi.LIZ.getClass();
                CustomDotApi customDotApi = EC4.LIZIZ;
                C61878OQg c61878OQg = C61878OQg.INSTANCE;
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                CustomDotUpdateParams customDotUpdateParams = new CustomDotUpdateParams(1, c61878OQg, 0, i, customDotVM.LJLJLLL, arrayList);
                this.LJLIL = 2;
                if (customDotApi.shopReachUpdate(customDotUpdateParams, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
