package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentRefundFragment;
import java.util.Iterator;

/* renamed from: X.A4i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25636A4i implements TextWatcher {
    public final /* synthetic */ PaidContentRefundFragment LJLIL;
    public final /* synthetic */ TuxTextView LJLILLLLZI;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        PaidContentRefundFragment paidContentRefundFragment = this.LJLIL;
        T5T t5t = paidContentRefundFragment.LJLJJL;
        if (t5t != null) {
            TuxTextView tuxTextView = this.LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(String.valueOf(t5t.getText()).length());
            LIZ.append("/200");
            tuxTextView.setText(X1D.LIZIZ(LIZ));
            paidContentRefundFragment.Dl();
            if (String.valueOf(t5t.getText()).length() > 0) {
                Iterator<CheckBox> it = paidContentRefundFragment.LJLJI.iterator();
                while (it.hasNext()) {
                    it.next().setChecked(false);
                }
            }
        }
    }

    public C25636A4i(PaidContentRefundFragment paidContentRefundFragment, TuxTextView tuxTextView) {
        this.LJLIL = paidContentRefundFragment;
        this.LJLILLLLZI = tuxTextView;
    }
}
