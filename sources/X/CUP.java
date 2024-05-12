package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* loaded from: classes6.dex */
public final class CUP implements InterfaceC29391BgB {
    public final /* synthetic */ CUG LIZ;

    public CUP(CUG cug) {
        this.LIZ = cug;
    }

    @Override // X.InterfaceC29391BgB
    public final void LIZ(Spannable spannable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.LIZ.LLD.getText());
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannable);
        this.LIZ.LLD.setText(spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.LIZ.LLFFF);
        spannableStringBuilder2.append((CharSequence) " ");
        this.LIZ.LLFFF = spannableStringBuilder2.append((CharSequence) spannable);
    }
}
