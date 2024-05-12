package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K9D implements TextWatcher {
    public String LJLIL = "";
    public final /* synthetic */ ECSearchBarAssem LJLILLLLZI;

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
    }

    public K9D(ECSearchBarAssem eCSearchBarAssem) {
        this.LJLILLLLZI = eCSearchBarAssem;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s) {
        KAU kau;
        K9F H2;
        o.LJIIIZ(s, "s");
        String obj = s.toString();
        if (!TextUtils.isEmpty(obj) && TextUtils.isEmpty(this.LJLIL)) {
            ISearchBarContextAbility iSearchBarContextAbility = this.LJLILLLLZI.I3().LJLJJI;
            if (iSearchBarContextAbility != null && (H2 = iSearchBarContextAbility.H2()) != null) {
                kau = H2.LIZLLL;
            } else {
                kau = null;
            }
            if (kau == KAU.RESULT && this.LJLILLLLZI.I3().hv0() != 0) {
                ((ImageView) this.LJLILLLLZI._$_findCachedViewById(R.id.avi)).setVisibility(8);
                this.LJLILLLLZI.N3(false);
            } else {
                ((ImageView) this.LJLILLLLZI._$_findCachedViewById(R.id.avi)).setVisibility(0);
                this.LJLILLLLZI.N3(true);
            }
            this.LJLILLLLZI.M3(false);
        } else if (TextUtils.isEmpty(obj)) {
            ((ImageView) this.LJLILLLLZI._$_findCachedViewById(R.id.avi)).setVisibility(8);
            this.LJLILLLLZI.M3(true);
            this.LJLILLLLZI.N3(false);
        }
        boolean isFocused = this.LJLILLLLZI._$_findCachedViewById(R.id.jf6).isFocused();
        ECSearchBarAssemVM I3 = this.LJLILLLLZI.I3();
        K9O k9o = new K9O(obj, isFocused);
        if (!o.LJ(k9o, I3.LJLJI.getValue())) {
            I3.LJLJI.setValue(k9o);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
        boolean z;
        o.LJIIIZ(s, "s");
        String charSequence = s.toString();
        this.LJLIL = charSequence;
        ECSearchBarAssem eCSearchBarAssem = this.LJLILLLLZI;
        if (charSequence == null || ujb.o.LJJJJJL(charSequence)) {
            z = true;
        } else {
            z = false;
        }
        eCSearchBarAssem.LJLLI = z;
    }
}
