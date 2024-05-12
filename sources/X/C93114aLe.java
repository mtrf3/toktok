package X;

import com.bytedance.pipo.checkout.api.network.model.response.Elements;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.sdk.pages.BindPaymentMethodNavKt$BindPaymentMethodNav$5$1$1$1$2$1$2$2", f = "BindPaymentMethodNav.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aLe, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93114aLe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PIViewModel LJLIL;
    public final /* synthetic */ C92330a90 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93114aLe(PIViewModel pIViewModel, C92330a90 c92330a90, InterfaceC67352kd<? super C93114aLe> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = pIViewModel;
        this.LJLILLLLZI = c92330a90;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93114aLe(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        if (C91943a2l.LIZ.getValue() instanceof C92231a7P) {
            List<Elements> list = ((C92220a7E) C91943a2l.LJIIJJI.getValue()).LIZLLL;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Elements> it = list.iterator();
            while (it.hasNext()) {
                String paramName = it.next().getParamName();
                if (paramName == null) {
                    paramName = "";
                }
                arrayList.add(paramName);
            }
            C92284a8G eventSender = this.LJLIL.getEventSender();
            if (this.LJLILLLLZI != null) {
                z = true;
            } else {
                z = false;
            }
            eventSender.getClass();
            JSONObject jSONObject = new JSONObject();
            if (true ^ arrayList.isEmpty()) {
                jSONObject.put("fillin_scenario", C92047a4R.LIZJ(arrayList));
                jSONObject.put("is_show_bind_with_mobile", C92047a4R.LIZLLL(z));
            }
            eventSender.LIZLLL(EnumC92044a4O.PiBindShow.getEventName(), jSONObject);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
