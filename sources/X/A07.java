package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class A07 extends ART {
    public CharSequence LJ;
    public CharSequence LJFF;

    @Override // X.ARS
    public final View LIZIZ() {
        boolean z;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.a13, C16880lQ.LLZIL((Context) this.LIZIZ), null);
        LLLZIIL.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        CharSequence charSequence = this.LJ;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LLLZIIL.findViewById(R.id.lao).setVisibility(8);
            CharSequence charSequence2 = this.LJFF;
            if (charSequence2 == null || charSequence2.length() == 0) {
                LLLZIIL.findViewById(R.id.bui).setVisibility(8);
            } else {
                ((TextView) LLLZIIL.findViewById(R.id.bui)).setText(this.LJFF);
                if (!(this.LJFF instanceof String)) {
                    ((TextView) LLLZIIL.findViewById(R.id.bui)).setMovementMethod(AnonymousClass898.LIZ);
                }
            }
        } else {
            ((TextView) LLLZIIL.findViewById(R.id.lao)).setText(this.LJ);
            if (!(this.LJ instanceof String)) {
                ((TextView) LLLZIIL.findViewById(R.id.lao)).setMovementMethod(AnonymousClass898.LIZ);
            }
            CharSequence charSequence3 = this.LJFF;
            if (charSequence3 == null || charSequence3.length() == 0) {
                LLLZIIL.findViewById(R.id.bui).setVisibility(8);
            } else {
                ((TextView) LLLZIIL.findViewById(R.id.bui)).setText(this.LJFF);
                if (!(this.LJFF instanceof String)) {
                    ((TextView) LLLZIIL.findViewById(R.id.bui)).setMovementMethod(AnonymousClass898.LIZ);
                }
            }
        }
        return LLLZIIL;
    }

    @Override // X.ART
    public final CharSequence LIZJ() {
        return this.LJFF;
    }

    @Override // X.ART
    public final CharSequence LIZLLL() {
        return this.LJ;
    }

    public A07(Context context) {
        super(context);
    }

    @Override // X.ART
    public final void LJ(CharSequence charSequence) {
        this.LJFF = charSequence;
    }

    @Override // X.ART
    public final void LJFF(CharSequence charSequence) {
        this.LJ = charSequence;
    }
}
