package X;

import android.view.View;
import com.bytedance.android.live.wallet.api.ILocationPickerService;
import com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM;
import kotlin.jvm.internal.o;

/* renamed from: X.UcN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77567UcN extends AbstractC77570UcQ {
    public final /* synthetic */ C77566UcM LJLIL;

    public C77567UcN(C77566UcM c77566UcM) {
        this.LJLIL = c77566UcM;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View p0) {
        String str;
        String str2;
        C77568UcO c77568UcO;
        C77568UcO c77568UcO2;
        o.LJIIIZ(p0, "p0");
        BillingAddressVM vm = this.LJLIL.getVm();
        vm.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_exchange_billing_address_change_click");
        LIZ.LJIJJ("live_gift", "request_page");
        LIZ.LJIJJ("anchor_income", "charge_reason");
        LIZ.LJJIIJZLJL();
        C77554UcA c77554UcA = vm.LJLLL;
        if (c77554UcA != null && (c77568UcO2 = (C77568UcO) c77554UcA.LIZIZ) != null) {
            str = c77568UcO2.toString();
        } else {
            str = null;
        }
        C77554UcA c77554UcA2 = vm.LJLLL;
        if (c77554UcA2 == null || (c77568UcO = (C77568UcO) c77554UcA2.LIZIZ) == null || (str2 = c77568UcO.LIZ) == null) {
            str2 = "";
        }
        ((ILocationPickerService) CN1.LIZ(ILocationPickerService.class)).rI(vm.LJLJLLL.context(), str2, str, new C77553Uc9(vm), new C77857Uh3());
    }
}
