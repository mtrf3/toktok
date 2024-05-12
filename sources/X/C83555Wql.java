package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.EditText;
import kotlin.jvm.internal.o;

/* renamed from: X.Wql, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83555Wql extends InputFilter.LengthFilter {
    public final /* synthetic */ C83552Wqi LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83555Wql(C83552Wqi c83552Wqi, int i) {
        super(i);
        this.LJLIL = c83552Wqi;
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public final CharSequence filter(CharSequence source, int i, int i2, Spanned dest, int i3, int i4) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(dest, "dest");
        CharSequence filter = super.filter(source, i, i2, dest, i3, i4);
        if (this.LJLIL.LJLJLJ - (dest.length() - (i4 - i3)) < i2 - i) {
            TMB tmb = C82890Wg2.LJFF;
            EditText editView = this.LJLIL.LJLIL;
            o.LJIIIIZZ(editView, "editView");
            TMB.LIZLLL(tmb, editView.getContext(), this.LJLIL.LJLJL).LIZ();
        }
        return filter;
    }
}
