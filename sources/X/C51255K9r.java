package X;

import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchFragment;
import com.ss.android.ugc.aweme.ecommerce.search.page.state.IPageSearchSubPageAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.K9r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51255K9r extends AbstractC008101l {
    public final /* synthetic */ EcSearchFragment LIZJ;

    @Override // X.AbstractC008101l
    public final void LIZ() {
        K5P searchEcommerceModel;
        C50650JuI vl;
        K5P searchEcommerceModel2;
        String pageSchema;
        boolean z;
        KAU Jc0;
        InterfaceC65784Pro interfaceC65784Pro;
        KAV kav = this.LIZJ.LJLIL;
        Object obj = null;
        if (kav != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("operatorBack() curPage = ");
            IPageSearchSubPageAbility iPageSearchSubPageAbility = kav.LJIIJJI;
            if (iPageSearchSubPageAbility != null) {
                obj = iPageSearchSubPageAbility.Jc0();
            }
            LIZ.append(obj);
            LIZ.append(", isPassSuggestState=");
            LIZ.append(kav.LJIILIIL);
            X1D.LIZIZ(LIZ);
            IPageSearchSubPageAbility iPageSearchSubPageAbility2 = kav.LJIIJJI;
            if (iPageSearchSubPageAbility2 != null && (Jc0 = iPageSearchSubPageAbility2.Jc0()) != null && (interfaceC65784Pro = (InterfaceC65784Pro) ((LinkedHashMap) kav.LJIILL).get(Jc0)) != null) {
                z = ((Boolean) interfaceC65784Pro.invoke()).booleanValue();
            } else {
                z = false;
            }
            obj = Boolean.valueOf(z);
        }
        if (o.LJ(obj, Boolean.TRUE)) {
            return;
        }
        C50650JuI vl2 = this.LIZJ.vl();
        if (vl2 != null && (searchEcommerceModel = vl2.getSearchEcommerceModel()) != null) {
            EcSearchFragment ecSearchFragment = this.LIZJ;
            if (searchEcommerceModel.getNeedBackToPage() && C78857UxB.LJJJIL(searchEcommerceModel.getPageSchema()) && (vl = ecSearchFragment.vl()) != null && (searchEcommerceModel2 = vl.getSearchEcommerceModel()) != null && (pageSchema = searchEcommerceModel2.getPageSchema()) != null) {
                SmartRouter.buildRoute(ecSearchFragment, pageSchema).open();
                return;
            }
        }
        this.LIZ = false;
        ActivityC45651qj mo49getActivity = this.LIZJ.mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.onBackPressed();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51255K9r(EcSearchFragment ecSearchFragment) {
        super(true);
        this.LIZJ = ecSearchFragment;
    }
}
