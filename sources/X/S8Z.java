package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.DiscountTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.DiscountTemplateEditViewModel;
import kotlin.jvm.internal.AqS35S1000000_12;

/* loaded from: classes13.dex */
public final class S8Z extends S8Q {
    public final /* synthetic */ DiscountTemplateEditAssem LJLIL;

    public S8Z(DiscountTemplateEditAssem discountTemplateEditAssem) {
        this.LJLIL = discountTemplateEditAssem;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        DiscountTemplateEditViewModel K3 = this.LJLIL.K3();
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        K3.getClass();
        K3.setState(new AqS35S1000000_12(str, 36));
        S8H H3 = this.LJLIL.H3();
        if (H3 != null) {
            H3.ef();
        }
    }
}
