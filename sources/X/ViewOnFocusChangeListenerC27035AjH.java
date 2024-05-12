package X;

import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder.TextInputHelper;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.AjH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnFocusChangeListenerC27035AjH implements View.OnFocusChangeListener {
    public final /* synthetic */ TextInputHelper LJLIL;
    public final /* synthetic */ C252989wM LJLILLLLZI;
    public final /* synthetic */ C27021Aj3 LJLJI;

    public ViewOnFocusChangeListenerC27035AjH(TextInputHelper textInputHelper, C252989wM c252989wM, C27021Aj3 c27021Aj3) {
        this.LJLIL = textInputHelper;
        this.LJLILLLLZI = c252989wM;
        this.LJLJI = c27021Aj3;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        Boolean bool;
        EditText editText;
        Editable text;
        CharSequence LJZI;
        if (z) {
            TextInputHelper textInputHelper = this.LJLIL;
            Editable text2 = ((C71731SDf) this.LJLILLLLZI.LIZIZ(R.id.eod)).getEditText().getText();
            o.LJIIIIZZ(text2, "inputWithIndicator.getEditText().text");
            textInputHelper.textSizeBefore = s.LJZI(text2).length();
            this.LJLIL.startFocus = SystemClock.elapsedRealtime();
            AddressEditDetailActivity addressEditDetailActivity = AddressEditDetailActivity.LJLZ;
            if (addressEditDetailActivity != null) {
                C78946Uyc.LJJII(addressEditDetailActivity, new C70929Rsb(), new AqS170S0100000_4(this.LJLJI, 187));
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
                if (textInputHelper2.recommend && !textInputHelper2.viewModel.LJLLL && (text = (editText = ((C71731SDf) textInputHelper2.targetView.LIZIZ(R.id.eod)).getEditText()).getText()) != null && (LJZI = s.LJZI(text)) != null && LJZI.length() > 3) {
                    TextInputHelper textInputHelper3 = this.LJLIL;
                    AddressEditDetailViewModel addressEditDetailViewModel = textInputHelper3.viewModel;
                    String str2 = this.LJLJI.LIZ.key;
                    AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(textInputHelper3, editText, 13);
                    addressEditDetailViewModel.getClass();
                    addressEditDetailViewModel.withState(new AqS47S1200000_4(addressEditDetailViewModel, (AddressEditDetailViewModel) str2, (String) aqS135S0200000_4, (InterfaceC88472Yns<? super CandInputDataOptions, C76800UCe>) 26));
                }
            }
            this.LJLILLLLZI.LIZJ();
            this.LJLJI.LIZJ = null;
            return;
        }
        String charSequence = s.LJZI(((C71731SDf) this.LJLILLLLZI.LIZIZ(R.id.eod)).getEditText().getText().toString()).toString();
        TextInputHelper textInputHelper4 = this.LJLIL;
        ClientConfig clientConfig = textInputHelper4.viewModel.LJLZ;
        if (clientConfig != null && (bool = clientConfig.enableRemoveLeadingTrailingSpace) != null) {
            C27021Aj3 c27021Aj32 = this.LJLJI;
            if (bool.booleanValue()) {
                c27021Aj32.LIZIZ = charSequence;
                textInputHelper4.setText(charSequence);
            }
        }
        if (o.LJ(this.LJLJI.LIZ.key, "address")) {
            C252989wM c252989wM2 = this.LJLILLLLZI;
            ((TextView) c252989wM2.LIZIZ(R.id.x5)).setText("");
            c252989wM2.LIZIZ(R.id.x5).setVisibility(8);
            AddressEditDetailViewModel addressEditDetailViewModel2 = this.LJLIL.viewModel;
            addressEditDetailViewModel2.getClass();
            addressEditDetailViewModel2.setState(new AqS170S0100000_4((CandInputDataOptions) null, 1383));
        }
        boolean LJ = o.LJ(AddressEditDetailActivity.LJZ, "sug");
        boolean LJ2 = o.LJ(AddressEditDetailActivity.LJZ, "auto");
        int length = charSequence.length();
        TextInputHelper textInputHelper5 = this.LJLIL;
        int i = length - textInputHelper5.textSizeBefore;
        if (i < 0) {
            AddressEditDetailActivity.LJZ = "del";
        } else if (i > 0) {
            AddressEditDetailActivity.LJZ = "add";
        } else if (!LJ && !LJ2) {
            AddressEditDetailActivity.LJZ = "";
        }
        C78565UsT.LJJIIZI(textInputHelper5.activity, MBB.INSTANCE, new C27036AjI(textInputHelper5, this.LJLJI, LJ2, LJ, null));
    }
}
