package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentMethod;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.aH1, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92827aH1 extends AbstractC65781Prl implements InterfaceC88471Ynr<PaymentMethod, C91944a2m, C76800UCe> {
    public final /* synthetic */ C05P LJLIL;
    public final /* synthetic */ PIViewModel LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJI;
    public final /* synthetic */ C92145a61 LJLJJI;
    public final /* synthetic */ View LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92827aH1(C05P c05p, PIViewModel pIViewModel, InterfaceC35811ar<Boolean> interfaceC35811ar, C92145a61 c92145a61, View view) {
        super(2);
        this.LJLIL = c05p;
        this.LJLILLLLZI = pIViewModel;
        this.LJLJI = interfaceC35811ar;
        this.LJLJJI = c92145a61;
        this.LJLJJL = view;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(PaymentMethod paymentMethod, C91944a2m c91944a2m) {
        String LIZLLL;
        String LIZLLL2;
        PaymentMethod paymentMethod2 = paymentMethod;
        C91944a2m editStatus = c91944a2m;
        o.LJIIIZ(paymentMethod2, "paymentMethod");
        o.LJIIIZ(editStatus, "editStatus");
        C05P c05p = this.LJLIL;
        if (c05p != null) {
            c05p.hide();
        }
        C92284a8G eventSender = this.LJLILLLLZI.getEventSender();
        boolean booleanValue = this.LJLJI.getValue().booleanValue();
        Boolean bool = editStatus.LIZ;
        Boolean bool2 = editStatus.LIZJ;
        Boolean bool3 = editStatus.LIZIZ;
        eventSender.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_use_ocr", C92047a4R.LIZLLL(booleanValue));
        String str = LiveGiftNewGifterBadgeSetting.DEFAULT;
        if (bool == null) {
            LIZLLL = LiveGiftNewGifterBadgeSetting.DEFAULT;
        } else {
            LIZLLL = C92047a4R.LIZLLL(bool.booleanValue());
        }
        jSONObject.put("is_edit_card_number", LIZLLL);
        if (bool2 == null) {
            LIZLLL2 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        } else {
            LIZLLL2 = C92047a4R.LIZLLL(bool2.booleanValue());
        }
        jSONObject.put("is_edit_expire_date", LIZLLL2);
        if (bool3 != null) {
            str = C92047a4R.LIZLLL(bool3.booleanValue());
        }
        jSONObject.put("is_edit_holder_name", str);
        jSONObject.put("obj_id", EnumC92042a4M.Next.getObjId());
        eventSender.LIZ(EnumC92044a4O.PiBindClick.getEventName(), jSONObject);
        this.LJLILLLLZI.storePaymentMethod(paymentMethod2, this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
