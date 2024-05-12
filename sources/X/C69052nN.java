package X;

import Y.AfS53S0100000_1;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.api.MallApiWithPreload;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.bean.MallToolPanelData;
import kotlin.jvm.internal.AqS167S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel$loadToolPanelData$1$1", f = "ShopMainViewModel.kt", l = {1230}, m = "invokeSuspend")
/* renamed from: X.2nN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69052nN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Response<MallToolPanelData>>, Object> {
    public int LJLIL;

    public C69052nN(InterfaceC67352kd<? super C69052nN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69052nN(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj2);
            } else {
                C141335gf.LIZJ(obj2);
                MallApiWithPreload.LIZ.getClass();
                AbstractC73672Svk<Response<MallToolPanelData>> mallToolPanel = C30N.LIZIZ.getMallToolPanel();
                this.LJLIL = 1;
                XKS xks = new XKS(1, C78555UsJ.LJJII(this));
                xks.LJIIL();
                xks.LJIILIIL(new AqS167S0100000_1(mallToolPanel.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0100000_1(xks, 86), new AfS53S0100000_1(xks, 87)), 427));
                obj2 = xks.LJIIJJI();
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return (Response) obj2;
        } catch (Throwable unused) {
            return new Response(0, null, null, null, 15, null);
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Response<MallToolPanelData>> interfaceC67352kd) {
        return new C69052nN(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
