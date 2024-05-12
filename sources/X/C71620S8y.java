package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.MultiTextTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.MultiTextTemplateEditViewModel;
import kotlin.jvm.internal.AqS35S1000000_12;

/* renamed from: X.S8y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71620S8y extends S8Q {
    public final /* synthetic */ MultiTextTemplateEditAssem LJLIL;

    public C71620S8y(MultiTextTemplateEditAssem multiTextTemplateEditAssem) {
        this.LJLIL = multiTextTemplateEditAssem;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        MultiTextTemplateEditViewModel K3 = this.LJLIL.K3();
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        K3.getClass();
        K3.setState(new AqS35S1000000_12(str, 33));
        S8H H3 = this.LJLIL.H3();
        if (H3 != null) {
            H3.ef();
        }
    }
}
