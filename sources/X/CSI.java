package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* loaded from: classes6.dex */
public final class CSI implements InterfaceC29391BgB {
    public final /* synthetic */ CSE<CQO<? extends CR6>> LIZ;

    public CSI(CSE<CQO<? extends CR6>> cse) {
        this.LIZ = cse;
    }

    @Override // X.InterfaceC29391BgB
    public final void LIZ(Spannable spannable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LIZ.LJLJLLL.getText());
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannable);
        this.LIZ.LJLJLLL.setText(spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.LIZ.LJLLI);
        spannableStringBuilder2.append((CharSequence) " ");
        this.LIZ.LJLLI = spannableStringBuilder2.append((CharSequence) spannable);
    }
}
