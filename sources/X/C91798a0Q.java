package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberAssem;
import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberVM;
import com.ss.android.ugc.aweme.bnpl.network.model.PhoneRule;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* renamed from: X.a0Q, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91798a0Q implements TextWatcher {
    public final /* synthetic */ PhoneNumberAssem LJLIL;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    public C91798a0Q(PhoneNumberAssem phoneNumberAssem) {
        this.LJLIL = phoneNumberAssem;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null && charSequence.length() == 0) {
            PhoneNumberVM v3 = this.LJLIL.v3();
            v3.getClass();
            v3.withState(new C92938aIo(v3, true));
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SY4 sy4 = (SY4) this.LJLIL._$_findCachedViewById(R.id.fi);
        PhoneNumberAssem phoneNumberAssem = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.v3().LJLJI);
        LIZ.append('-');
        LIZ.append((Object) charSequence);
        String LIZIZ = X1D.LIZIZ(LIZ);
        Iterator<PhoneRule> it = phoneNumberAssem.v3().LJLJJI.iterator();
        boolean z = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = it.next().regex;
            if (str != null && !new OJD(str).matches(LIZIZ)) {
                z = false;
                break;
            }
        }
        sy4.setEnabled(z);
    }
}
