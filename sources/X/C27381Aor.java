package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;

/* renamed from: X.Aor, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27381Aor extends C113664d8 {
    public final /* synthetic */ DistrictFragment LJLIL;

    public C27381Aor(DistrictFragment districtFragment) {
        this.LJLIL = districtFragment;
    }

    @Override // X.C113664d8, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String str;
        DistrictFragment districtFragment = this.LJLIL;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        districtFragment.getClass();
        if (DistrictFragment.Dl(str)) {
            DistrictFragment districtFragment2 = this.LJLIL;
            districtFragment2.LJLLLL.removeMessages(1);
            districtFragment2.LJLLLL.sendEmptyMessageDelayed(1, 10L);
        } else {
            this.LJLIL.Hl(false, false);
            this.LJLIL.Gl(true);
        }
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        DistrictFragment districtFragment3 = this.LJLIL;
        if (districtFragment3.LJLLJ) {
            return;
        }
        districtFragment3.LJLLJ = true;
        View view = districtFragment3.getView();
        if (view == null) {
            return;
        }
        C78946Uyc.LJJIIJ(view, new C70918RsQ(0), C27394Ap4.LJLIL);
    }
}
