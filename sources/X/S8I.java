package X;

import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.ProductTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ProductTemplateEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S8I extends S8Q {
    public final /* synthetic */ ProductTemplateEditAssem LJLIL;

    public S8I(ProductTemplateEditAssem productTemplateEditAssem) {
        this.LJLIL = productTemplateEditAssem;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z;
        S8H H3;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        ProductTemplateEditViewModel L3 = this.LJLIL.L3();
        L3.getClass();
        L3.setState(new AqS35S1000000_12(str, 34));
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View tvLimit = this.LJLIL._$_findCachedViewById(R.id.lwo);
            o.LJIIIIZZ(tvLimit, "tvLimit");
            OUP.LJIJJLI(tvLimit);
            ((TextView) this.LJLIL._$_findCachedViewById(R.id.lwo)).setText("");
        } else {
            View tvLimit2 = this.LJLIL._$_findCachedViewById(R.id.lwo);
            o.LJIIIIZZ(tvLimit2, "tvLimit");
            OUP.LJJLIIIJ(tvLimit2);
            TextView textView = (TextView) this.LJLIL._$_findCachedViewById(R.id.lwo);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str.length());
            LIZ.append('/');
            InputFilter inputFilter = ((TextView) this.LJLIL._$_findCachedViewById(R.id.cz8)).getFilters()[0];
            o.LJII(inputFilter, "null cannot be cast to non-null type android.text.InputFilter.LengthFilter");
            LIZ.append(((InputFilter.LengthFilter) inputFilter).getMax());
            textView.setText(X1D.LIZIZ(LIZ));
        }
        if (this.LJLIL.T9() && (H3 = this.LJLIL.H3()) != null) {
            H3.ef();
        }
    }
}
