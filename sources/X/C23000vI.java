package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;

/* renamed from: X.0vI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23000vI {
    public final C23020vK LIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0vK] */
    public C23000vI(final View view) {
        this.LIZ = new InputFilter(view) { // from class: X.0vK
            public final View LJLIL;

            {
                this.LJLIL = view;
            }

            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (this.LJLIL.isInEditMode()) {
                    return charSequence;
                }
                if (charSequence instanceof String) {
                    return C0YG.LIZIZ((String) charSequence);
                }
                return charSequence;
            }
        };
    }
}
