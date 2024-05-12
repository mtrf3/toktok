package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NDJ extends NDK {
    public List<String> LJLJJL;
    public CompletionBlock<NDM> LJLJJLL;

    public NDJ() {
        C42625Go9.LIZIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @QD3
    public final void onTermsConditionsNextEvent(C46422IJu event) {
        o.LJIIIZ(event, "event");
        CompletionBlock<NDM> completionBlock = this.LJLJJLL;
        if (completionBlock != 0) {
            XBaseModel LIZJ = ED5.LIZJ(NDM.class, null);
            ((NDM) LIZJ).setPrevReactIds(this.LJLJJL);
            completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
        }
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity activity;
        NDL ndl = (NDL) xBaseParamModel;
        o.LJIIIZ(type, "type");
        this.LJLJJL = ndl.getPrevReactIds();
        String enterFrom = ndl.getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        this.LJLJJLL = c37356ElM;
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            activity = interfaceC38263Ezz.LIZLLL();
        } else {
            activity = null;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//change_account_region/kr_terms_conditions");
        buildRoute.withParam("enter_from", enterFrom);
        buildRoute.open();
    }
}
