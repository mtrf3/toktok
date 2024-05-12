package X;

import android.widget.EditText;
import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;

/* renamed from: X.Amw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC27262Amw implements Runnable {
    public final /* synthetic */ AddressEditViewModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ CandHelper LJLJI;
    public final /* synthetic */ EditText LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    public RunnableC27262Amw(EditText editText, CandHelper candHelper, AddressEditViewModel addressEditViewModel, String str, boolean z) {
        this.LJLIL = addressEditViewModel;
        this.LJLILLLLZI = str;
        this.LJLJI = candHelper;
        this.LJLJJI = editText;
        this.LJLJJL = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            AddressEditViewModel addressEditViewModel = this.LJLIL;
            String str = this.LJLILLLLZI;
            addressEditViewModel.Pv0(str, new C27248Ami(this.LJLJJI, this.LJLJI, addressEditViewModel, str, this.LJLJJL));
        } finally {
            if (LIZ) {
            }
        }
    }
}
