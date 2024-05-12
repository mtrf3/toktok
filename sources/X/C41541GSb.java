package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.GSb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41541GSb implements InputFilter {
    public final /* synthetic */ GSU LJLIL;

    public C41541GSb(GSU gsu) {
        this.LJLIL = gsu;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return this.LJLIL.LJIILL(charSequence.subSequence(i, i2));
    }
}
