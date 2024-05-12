package X;

import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Amj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnFocusChangeListenerC27249Amj implements View.OnFocusChangeListener {
    public final /* synthetic */ TextInputHelper LJLIL;
    public final /* synthetic */ C252989wM LJLILLLLZI;
    public final /* synthetic */ C27021Aj3 LJLJI;

    public ViewOnFocusChangeListenerC27249Amj(TextInputHelper textInputHelper, C252989wM c252989wM, C27021Aj3 c27021Aj3) {
        this.LJLIL = textInputHelper;
        this.LJLILLLLZI = c252989wM;
        this.LJLJI = c27021Aj3;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        Boolean bool;
        boolean z2 = false;
        if (z) {
            TextInputHelper textInputHelper = this.LJLIL;
            textInputHelper.viewModel.LJLLJ = true;
            Editable text = ((C71731SDf) this.LJLILLLLZI.LIZIZ(R.id.eod)).getEditText().getText();
            o.LJIIIIZZ(text, "inputWithIndicator.getEditText().text");
            textInputHelper.textSizeBefore = s.LJZI(text).length();
            this.LJLIL.startFocus = SystemClock.elapsedRealtime();
            AddressEditFragment addressEditFragment = AddressEditFragment.LLD;
            if (addressEditFragment != null) {
                C78946Uyc.LJJII(addressEditFragment, new C70929Rsb(), new AqS170S0100000_4(this.LJLJI, 198));
            }
            C27021Aj3 c27021Aj3 = this.LJLJI;
            if (c27021Aj3.LIZIZ == null) {
                c27021Aj3.LIZIZ = "";
            }
            if (o.LJ(c27021Aj3.LIZ.key, "address")) {
                String str = this.LJLJI.LIZ.inputHintMessage;
                C252989wM c252989wM = this.LJLILLLLZI;
                if (str != null && !ujb.o.LJJJJJL(str)) {
                    c252989wM.LIZLLL(str);
                }
                TextInputHelper textInputHelper2 = this.LJLIL;
                C78565UsT.LJJIJIIJIL(textInputHelper2.fragment, new C27250Amk(textInputHelper2, this.LJLILLLLZI, null));
                TextInputHelper textInputHelper3 = this.LJLIL;
                if (textInputHelper3.recommend) {
                    textInputHelper3.candHelper.LIZLLL(((C71731SDf) textInputHelper3.targetView.LIZIZ(R.id.eod)).getEditText(), this.LJLJI.LIZ.key, this.LJLIL.viewModel, true);
                }
            }
            this.LJLILLLLZI.LIZJ();
            C27021Aj3 c27021Aj32 = this.LJLJI;
            c27021Aj32.LIZJ = null;
            this.LJLIL.setEmailHintVisibleIfIsInputEmail(c27021Aj32, true);
            return;
        }
        String charSequence = s.LJZI(((C71731SDf) this.LJLILLLLZI.LIZIZ(R.id.eod)).getEditText().getText().toString()).toString();
        TextInputHelper textInputHelper4 = this.LJLIL;
        ClientConfig clientConfig = textInputHelper4.viewModel.LLIIJI;
        if (clientConfig != null && (bool = clientConfig.enableRemoveLeadingTrailingSpace) != null) {
            C27021Aj3 c27021Aj33 = this.LJLJI;
            if (bool.booleanValue()) {
                c27021Aj33.LIZIZ = charSequence;
                textInputHelper4.setText(charSequence);
            }
        }
        if (o.LJ(this.LJLJI.LIZ.key, "zipcode")) {
            TextInputHelper textInputHelper5 = this.LJLIL;
            if (textInputHelper5.recommend) {
                CandHelper candHelper = textInputHelper5.candHelper;
                AddressEditViewModel viewModel = textInputHelper5.viewModel;
                candHelper.getClass();
                o.LJIIIZ(viewModel, "viewModel");
                viewModel.withState(new AqS47S1200000_4(viewModel, (AddressEditViewModel) "address", (String) new AqS170S0100000_4(viewModel, 1121), (InterfaceC88472Yns<? super CandInputDataOptions, C76800UCe>) 2));
            }
        }
        if (o.LJ(this.LJLJI.LIZ.key, "address")) {
            this.LJLIL.fragment.Gl(0);
            C252989wM c252989wM2 = this.LJLILLLLZI;
            ((TextView) c252989wM2.LIZIZ(R.id.x5)).setText("");
            c252989wM2.LIZIZ(R.id.x5).setVisibility(8);
        }
        this.LJLIL.setEmailHintVisibleIfIsInputEmail(this.LJLJI, false);
        TextInputHelper textInputHelper6 = this.LJLIL;
        textInputHelper6.candHelper.LIZ(textInputHelper6.viewModel, this.LJLJI.LIZ.key);
        boolean LJ = o.LJ(this.LJLIL.candHelper.LJIIIIZZ, "sug");
        boolean LJ2 = o.LJ(this.LJLIL.candHelper.LJIIIIZZ, "auto");
        int length = charSequence.length();
        TextInputHelper textInputHelper7 = this.LJLIL;
        int i = length - textInputHelper7.textSizeBefore;
        if (i < 0) {
            textInputHelper7.candHelper.LJIIIIZZ = "del";
        } else if (i > 0) {
            textInputHelper7.candHelper.LJIIIIZZ = "add";
        } else if (!LJ && !LJ2) {
            textInputHelper7.candHelper.LJIIIIZZ = "";
        }
        C78565UsT.LJJIJIIJIL(textInputHelper7.fragment, new C27251Aml(textInputHelper7, this.LJLJI, LJ2, LJ, null));
        AddressEditViewModel addressEditViewModel = this.LJLIL.viewModel;
        if (addressEditViewModel.Vv0() != 0) {
            z2 = true;
        }
        addressEditViewModel.rw0(z2);
    }
}
