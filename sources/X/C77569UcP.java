package X;

import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM;
import com.bytedance.android.livesdk.livesetting.wallet.LiveExchangePrivatePolicyUrl;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.UcP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77569UcP extends AbstractC77570UcQ {
    public final /* synthetic */ C77566UcM LJLIL;

    public C77569UcP(C77566UcM c77566UcM) {
        this.LJLIL = c77566UcM;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        BillingAddressVM vm = this.LJLIL.getVm();
        vm.getClass();
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(vm.LJLJLLL.context(), UriProtector.parse(LiveExchangePrivatePolicyUrl.INSTANCE.getValue()));
    }
}
