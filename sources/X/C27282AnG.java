package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.AnG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27282AnG extends C113664d8 {
    public final /* synthetic */ PhoneInputItemViewHolder LJLIL;
    public final /* synthetic */ C27021Aj3 LJLILLLLZI;
    public final /* synthetic */ C252989wM LJLJI;

    public C27282AnG(PhoneInputItemViewHolder phoneInputItemViewHolder, C27021Aj3 c27021Aj3, C252989wM c252989wM) {
        this.LJLIL = phoneInputItemViewHolder;
        this.LJLILLLLZI = c27021Aj3;
        this.LJLJI = c252989wM;
    }

    @Override // X.C113664d8, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        OSZ osz;
        PhoneInputItemViewHolder phoneInputItemViewHolder = this.LJLIL;
        if (phoneInputItemViewHolder.userInput || i2 > 0 || i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        phoneInputItemViewHolder.userInput = z;
        if (charSequence != null) {
            C252989wM c252989wM = this.LJLJI;
            C27021Aj3 c27021Aj3 = this.LJLILLLLZI;
            if (!s.LJJJLZIJ(charSequence, "*", false)) {
                OSZ<String, String> fullPhoneNumber = ((C27486AqY) c252989wM.LIZIZ(R.id.hni)).getFullPhoneNumber();
                String second = fullPhoneNumber.getSecond();
                Object obj = c27021Aj3.LIZIZ;
                Object obj2 = null;
                if ((obj instanceof OSZ) && (osz = (OSZ) obj) != null) {
                    obj2 = osz.getSecond();
                }
                if (!o.LJ(second, obj2)) {
                    phoneInputItemViewHolder.getViewModel().LJLLJ = true;
                }
                c27021Aj3.LIZIZ = fullPhoneNumber;
                AddressEditViewModel viewModel = phoneInputItemViewHolder.getViewModel();
                if (phoneInputItemViewHolder.getViewModel().Vv0() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                viewModel.rw0(z2);
            }
        }
        PhoneInputItemViewHolder phoneInputItemViewHolder2 = this.LJLIL;
        CandHelper candHelper = phoneInputItemViewHolder2.mCandHelper;
        if (candHelper.LJI == 0) {
            candHelper.LJI = 1;
            candHelper.LIZ(phoneInputItemViewHolder2.getViewModel(), this.LJLILLLLZI.LIZ.key);
        } else {
            if (!phoneInputItemViewHolder2.requestPhoneCand) {
                return;
            }
            candHelper.LIZLLL(((C27486AqY) phoneInputItemViewHolder2.itemView.findViewById(R.id.hni)).getEditText(), this.LJLILLLLZI.LIZ.key, this.LJLIL.getViewModel(), false);
        }
    }
}
