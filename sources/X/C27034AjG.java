package X;

import android.text.Editable;
import android.widget.EditText;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder.TextInputHelper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.AjG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27034AjG extends C113664d8 {
    public final /* synthetic */ TextInputHelper LJLIL;
    public final /* synthetic */ C27021Aj3 LJLILLLLZI;

    @Override // X.C113664d8, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.LJLIL.viewModel.Hv0() == 0) {
            this.LJLIL.viewModel.Jv0(false);
        } else {
            this.LJLIL.viewModel.Jv0(true);
        }
        this.LJLIL.viewModel.LJLJL = null;
    }

    public C27034AjG(TextInputHelper textInputHelper, C27021Aj3 c27021Aj3) {
        this.LJLIL = textInputHelper;
        this.LJLILLLLZI = c27021Aj3;
    }

    @Override // X.C113664d8, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        CharSequence LJZI;
        TextInputHelper textInputHelper = this.LJLIL;
        if (textInputHelper.userInput || i2 > 0 || i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        textInputHelper.userInput = z;
        if (charSequence != null) {
            C27021Aj3 c27021Aj3 = this.LJLILLLLZI;
            String charSequence2 = s.LJZI(charSequence.toString()).toString();
            if (!o.LJ(charSequence2, c27021Aj3.LIZIZ)) {
                textInputHelper.viewModel.LJLJLLL = true;
                c27021Aj3.LIZIZ = charSequence2;
            } else {
                return;
            }
        }
        if (o.LJ(this.LJLILLLLZI.LIZ.key, "address")) {
            TextInputHelper textInputHelper2 = this.LJLIL;
            if (textInputHelper2.recommend && !textInputHelper2.viewModel.LJLLL) {
                EditText editText = ((C71731SDf) textInputHelper2.targetView.LIZIZ(R.id.eod)).getEditText();
                Editable text = editText.getText();
                if (text != null && (LJZI = s.LJZI(text)) != null) {
                    int length = LJZI.length();
                    if (length > 3) {
                        TextInputHelper textInputHelper3 = this.LJLIL;
                        AddressEditDetailViewModel addressEditDetailViewModel = textInputHelper3.viewModel;
                        String str = this.LJLILLLLZI.LIZ.key;
                        AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(textInputHelper3, editText, 12);
                        addressEditDetailViewModel.getClass();
                        addressEditDetailViewModel.withState(new AqS47S1200000_4(addressEditDetailViewModel, (AddressEditDetailViewModel) str, (String) aqS135S0200000_4, (InterfaceC88472Yns<? super CandInputDataOptions, C76800UCe>) 26));
                        return;
                    }
                    if (length != 0) {
                        return;
                    }
                }
                AddressEditDetailViewModel addressEditDetailViewModel2 = this.LJLIL.viewModel;
                addressEditDetailViewModel2.getClass();
                addressEditDetailViewModel2.setState(new AqS170S0100000_4((CandInputDataOptions) null, 1383));
            }
        }
    }
}
