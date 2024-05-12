package X;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS0S0320000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.AnF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnFocusChangeListenerC27281AnF implements View.OnFocusChangeListener {
    public final /* synthetic */ PhoneInputItemViewHolder LJLIL;
    public final /* synthetic */ C252989wM LJLILLLLZI;
    public final /* synthetic */ C27021Aj3 LJLJI;

    public ViewOnFocusChangeListenerC27281AnF(PhoneInputItemViewHolder phoneInputItemViewHolder, C27021Aj3 c27021Aj3, C252989wM c252989wM) {
        this.LJLIL = phoneInputItemViewHolder;
        this.LJLILLLLZI = c252989wM;
        this.LJLJI = c27021Aj3;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        List arrayList;
        String str;
        boolean z2 = false;
        if (z) {
            this.LJLIL.getViewModel().LJLLJ = true;
            this.LJLIL.mTextSizeBefore = ((C71731SDf) ((C27486AqY) this.LJLILLLLZI.LIZIZ(R.id.hni)).LIZ(R.id.bwr)).getEditText().getText().length();
            this.LJLIL.mStartFocus = SystemClock.elapsedRealtime();
            AddressEditFragment addressEditFragment = AddressEditFragment.LLD;
            if (addressEditFragment != null) {
                C78946Uyc.LJJII(addressEditFragment, new C70929Rsb(), new AqS170S0100000_4(this.LJLJI, 205));
            }
            C27021Aj3 c27021Aj3 = this.LJLJI;
            if (c27021Aj3.LIZIZ == null) {
                c27021Aj3.LIZIZ = ((C27486AqY) this.LJLILLLLZI.LIZIZ(R.id.hni)).getFullPhoneNumber();
            }
            PhoneInputItemViewHolder phoneInputItemViewHolder = this.LJLIL;
            phoneInputItemViewHolder.mCandHelper.LIZLLL(((C27486AqY) phoneInputItemViewHolder.itemView.findViewById(R.id.hni)).getEditText(), this.LJLJI.LIZ.key, this.LJLIL.getViewModel(), false);
            this.LJLIL.clearPhoneNumberIfContainsStars();
            this.LJLILLLLZI.LIZJ();
            this.LJLJI.LIZJ = null;
            this.LJLIL.requestPhoneCand = true;
            return;
        }
        String countryName = ((C27486AqY) this.LJLILLLLZI.LIZIZ(R.id.hni)).getCountryName();
        ClientConfig clientConfig = this.LJLIL.getViewModel().LLIIJI;
        if (clientConfig != null && (str = clientConfig.phonePrefixCheckCountrys) != null) {
            arrayList = s.LJLJJL(str, new String[]{","}, 0, 6);
        } else {
            arrayList = new ArrayList();
        }
        if (C78685UuP.LJJJZ(countryName) && arrayList.contains(countryName)) {
            this.LJLIL.handleInputBeforeVerify();
        }
        C252989wM c252989wM = this.LJLILLLLZI;
        C78565UsT.LJJIJLIJ(c252989wM, new C27280AnE(this.LJLIL, this.LJLJI, c252989wM, null));
        ((C71731SDf) ((C27486AqY) this.LJLILLLLZI.LIZIZ(R.id.hni)).LIZ(R.id.bwr)).setText(((C71731SDf) ((C27486AqY) this.LJLILLLLZI.LIZIZ(R.id.hni)).LIZ(R.id.bwr)).getText());
        PhoneInputItemViewHolder phoneInputItemViewHolder2 = this.LJLIL;
        phoneInputItemViewHolder2.mCandHelper.LIZ(phoneInputItemViewHolder2.getViewModel(), this.LJLJI.LIZ.key);
        boolean LJ = o.LJ(this.LJLIL.mCandHelper.LJIIIIZZ, "sug");
        boolean LJ2 = o.LJ(this.LJLIL.mCandHelper.LJIIIIZZ, "auto");
        int length = ((C71731SDf) ((C27486AqY) this.LJLILLLLZI.LIZIZ(R.id.hni)).LIZ(R.id.bwr)).getEditText().getText().length();
        PhoneInputItemViewHolder phoneInputItemViewHolder3 = this.LJLIL;
        int i = length - phoneInputItemViewHolder3.mTextSizeBefore;
        if (i < 0) {
            phoneInputItemViewHolder3.mCandHelper.LJIIIIZZ = "del";
        } else if (i > 0) {
            phoneInputItemViewHolder3.mCandHelper.LJIIIIZZ = "add";
        } else if (!LJ && !LJ2) {
            phoneInputItemViewHolder3.mCandHelper.LJIIIIZZ = "";
        }
        C253009wO Aw0 = phoneInputItemViewHolder3.getViewModel().Aw0(this.LJLJI);
        this.LJLILLLLZI.LJ(Aw0);
        if (this.LJLIL.mStartFocus != -1) {
            AddressEditFragment addressEditFragment2 = AddressEditFragment.LLD;
            if (addressEditFragment2 != null) {
                C78946Uyc.LJJII(addressEditFragment2, new C70930Rsc(), new AqS0S0320000_4(this.LJLJI, this.LJLIL, LJ2, LJ, Aw0, 2));
            }
            this.LJLIL.mStartFocus = -1L;
        }
        PhoneInputItemViewHolder phoneInputItemViewHolder4 = this.LJLIL;
        phoneInputItemViewHolder4.userInput = false;
        AddressEditViewModel viewModel = phoneInputItemViewHolder4.getViewModel();
        if (this.LJLIL.getViewModel().Vv0() != 0) {
            z2 = true;
        }
        viewModel.rw0(z2);
    }
}
