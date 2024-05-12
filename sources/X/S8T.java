package X;

import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.SingleTextTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.SingleTextTemplateEditViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S8T extends S8Q {
    public final /* synthetic */ SingleTextTemplateEditAssem LJLIL;

    public S8T(SingleTextTemplateEditAssem singleTextTemplateEditAssem) {
        this.LJLIL = singleTextTemplateEditAssem;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        boolean z;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        SingleTextTemplateEditViewModel K3 = this.LJLIL.K3();
        K3.getClass();
        K3.setState(new AqS35S1000000_12(str, 35));
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
        S8H H3 = this.LJLIL.H3();
        if (H3 != null) {
            H3.ef();
        }
    }
}
