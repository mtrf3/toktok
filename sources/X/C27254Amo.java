package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Amo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27254Amo extends C113664d8 {
    public final /* synthetic */ TextInputHelper LJLIL;
    public final /* synthetic */ C27021Aj3 LJLILLLLZI;

    public C27254Amo(TextInputHelper textInputHelper, C27021Aj3 c27021Aj3) {
        this.LJLIL = textInputHelper;
        this.LJLILLLLZI = c27021Aj3;
    }

    @Override // X.C113664d8, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        boolean z2;
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
                AddressEditViewModel addressEditViewModel = textInputHelper.viewModel;
                addressEditViewModel.LJLLJ = true;
                c27021Aj3.LIZIZ = charSequence2;
                if (addressEditViewModel.Vv0() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                addressEditViewModel.rw0(z2);
            } else {
                return;
            }
        }
        if (o.LJ(this.LJLILLLLZI.LIZ.key, "address")) {
            TextInputHelper textInputHelper2 = this.LJLIL;
            CandHelper candHelper = textInputHelper2.candHelper;
            if (candHelper.LJI == 0) {
                candHelper.LJI = 1;
                candHelper.LIZ(textInputHelper2.viewModel, this.LJLILLLLZI.LIZ.key);
            } else {
                if (!textInputHelper2.recommend) {
                    return;
                }
                candHelper.LIZLLL(((C71731SDf) textInputHelper2.targetView.LIZIZ(R.id.eod)).getEditText(), this.LJLILLLLZI.LIZ.key, this.LJLIL.viewModel, false);
            }
        }
    }
}
