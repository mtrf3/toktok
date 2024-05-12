package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GNu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41430GNu extends AbstractC41429GNt<GNK> {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    public C41430GNu(View view) {
        super(view);
        this.LJLIL = C221108m2.LIZIZ(new AqS157S0100000_7(view, 712));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(view, 711));
    }

    @Override // X.AbstractC41429GNt
    public final void L(C41426GNq c41426GNq) {
        CharSequence text;
        GNK baseDetails = (GNK) c41426GNq;
        o.LJIIIZ(baseDetails, "baseDetails");
        if (baseDetails.LIZJ && C41472GPk.LIZ(this.itemView.getContext())) {
            text = this.itemView.getContext().getText(R.string.cfe);
        } else {
            text = this.itemView.getContext().getText(R.string.ezb);
        }
        String charSequence = text.toString();
        if (!C26223AQx.LIZ()) {
            Object value = this.LJLIL.getValue();
            o.LJIIIIZZ(value, "<get-tvTipsView>(...)");
            Object value2 = this.LJLIL.getValue();
            o.LJIIIIZZ(value2, "<get-tvTipsView>(...)");
            ViewGroup.LayoutParams layoutParams = ((View) value2).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int LIZ = (int) C74275TDb.LIZ(16.0f);
            marginLayoutParams.setMargins(LIZ, LIZ, LIZ, LIZ);
            ((View) value).setLayoutParams(marginLayoutParams);
        } else {
            Object value3 = this.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value3, "<get-draftsTuxTextView>(...)");
            ((View) value3).setVisibility(0);
            if (baseDetails.LJ) {
                Object value4 = this.LJLILLLLZI.getValue();
                o.LJIIIIZZ(value4, "<get-draftsTuxTextView>(...)");
                ((TextView) value4).setText(this.itemView.getContext().getText(R.string.q95));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(charSequence);
                LIZ2.append(' ');
                LIZ2.append(this.itemView.getContext().getString(R.string.q91));
                charSequence = X1D.LIZIZ(LIZ2);
            } else {
                Object value5 = this.LJLILLLLZI.getValue();
                o.LJIIIIZZ(value5, "<get-draftsTuxTextView>(...)");
                ((TextView) value5).setText(this.itemView.getContext().getText(R.string.eyn));
            }
        }
        Object value6 = this.LJLIL.getValue();
        o.LJIIIIZZ(value6, "<get-tvTipsView>(...)");
        ((TextView) value6).setText(charSequence);
    }
}
