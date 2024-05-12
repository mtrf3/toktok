package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes5.dex */
public final class ARK extends ART {
    public CharSequence LJ;
    public CharSequence LJFF;

    @Override // X.ARS
    public final View LIZIZ() {
        boolean z;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c6, C16880lQ.LLZIL((Context) this.LIZIZ), null);
        LLLZIIL.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        TuxTextView tuxTextView = (TuxTextView) LLLZIIL.findViewById(R.id.lao);
        TuxTextView tuxTextView2 = (TuxTextView) LLLZIIL.findViewById(R.id.bui);
        tuxTextView.setTextColor(((ARJ) this.LIZJ).LJII);
        h0.LJIJJ(tuxTextView, true);
        CharSequence charSequence = this.LJ;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            tuxTextView.setVisibility(8);
            CharSequence charSequence2 = this.LJFF;
            if (charSequence2 == null || charSequence2.length() == 0) {
                tuxTextView2.setVisibility(8);
            } else {
                tuxTextView2.setTuxFont(((ARJ) this.LIZJ).LIZJ);
                tuxTextView2.setTextColor(((ARJ) this.LIZJ).LJII);
                tuxTextView2.setText(this.LJFF);
                if (!(this.LJFF instanceof String)) {
                    tuxTextView2.setMovementMethod(AnonymousClass898.LIZ);
                }
            }
        } else {
            tuxTextView.setTuxFont(((ARJ) this.LIZJ).LIZ);
            tuxTextView.setText(this.LJ);
            if (!(this.LJ instanceof String)) {
                tuxTextView.setMovementMethod(AnonymousClass898.LIZ);
            }
            CharSequence charSequence3 = this.LJFF;
            if (charSequence3 == null || charSequence3.length() == 0) {
                tuxTextView2.setVisibility(8);
            } else {
                tuxTextView2.setTuxFont(((ARJ) this.LIZJ).LIZIZ);
                tuxTextView2.setTextColor(((ARJ) this.LIZJ).LJIIIIZZ);
                tuxTextView2.setText(this.LJFF);
                if (!(this.LJFF instanceof String)) {
                    tuxTextView2.setMovementMethod(AnonymousClass898.LIZ);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ARK(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
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
