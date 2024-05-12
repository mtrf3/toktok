package X;

import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelPaymentModuleWidget;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS32S0301000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RjP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnClickListenerC70359RjP implements View.OnClickListener {
    public final /* synthetic */ BnplInfo LJLIL;
    public final /* synthetic */ SkuPanelPaymentModuleWidget LJLILLLLZI;
    public final /* synthetic */ C70360RjQ LJLJI;
    public final /* synthetic */ InstallmentPlan LJLJJI;
    public final /* synthetic */ C70360RjQ LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    public ViewOnClickListenerC70359RjP(BnplInfo bnplInfo, SkuPanelPaymentModuleWidget skuPanelPaymentModuleWidget, C70360RjQ c70360RjQ, InstallmentPlan installmentPlan, C70360RjQ c70360RjQ2, int i) {
        this.LJLIL = bnplInfo;
        this.LJLILLLLZI = skuPanelPaymentModuleWidget;
        this.LJLJI = c70360RjQ;
        this.LJLJJI = installmentPlan;
        this.LJLJJL = c70360RjQ2;
        this.LJLJJLL = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "select";
        if (!o.LJ(this.LJLIL.isAuth, Boolean.TRUE)) {
            SkuPanelPaymentModuleWidget skuPanelPaymentModuleWidget = this.LJLILLLLZI;
            skuPanelPaymentModuleWidget.getClass();
            SmartRouter.buildRoute(skuPanelPaymentModuleWidget.getContainer().getContext(), UriProtector.parse("//ec/bnpl/middle").buildUpon().appendQueryParameter("source", "product_detail").toString()).open();
        } else if (this.LJLJI.LIZJ()) {
            this.LJLILLLLZI.LIZ();
            SkuPanelViewModel mViewModel = this.LJLILLLLZI.getMViewModel();
            mViewModel.getClass();
            mViewModel.setState(new AqS178S0100000_12((InstallmentPlan) null, 451));
            SkuPanelState skuPanelState = mViewModel.LJLLI;
            if (skuPanelState != null) {
                skuPanelState.setInstallmentPlan(null);
            }
            c68322mC.element = "cancel";
        } else {
            this.LJLILLLLZI.LIZ();
            this.LJLJI.setChecked$ecommerce_transaction_release(true);
            SkuPanelViewModel mViewModel2 = this.LJLILLLLZI.getMViewModel();
            InstallmentPlan installmentPlan = this.LJLJJI;
            mViewModel2.getClass();
            mViewModel2.setState(new AqS178S0100000_12(installmentPlan, 451));
            SkuPanelState skuPanelState2 = mViewModel2.LJLLI;
            if (skuPanelState2 != null) {
                skuPanelState2.setInstallmentPlan(installmentPlan);
            }
            c68322mC.element = "select";
        }
        C78946Uyc.LJJIIJ(this.LJLJJL, new C70919RsR(), new AqS32S0301000_12(this.LJLIL, (BnplInfo) this.LJLJJLL, (int) this.LJLJJI, (InstallmentPlan) c68322mC, (C68322mC<String>) 1));
    }
}
