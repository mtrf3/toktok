package X;

import Y.ACListenerS46S0200000_12;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class T8I extends T8F {
    public final T8G LJLILLLLZI;

    @Override // X.T8F
    public final void L(C74125T7h c74125T7h) {
        if (!(c74125T7h instanceof KKP)) {
            return;
        }
        TuxTextView tuxTextView = (TuxTextView) this.LJLIL.findViewById(R.id.ii2);
        if (tuxTextView != null) {
            tuxTextView.setText(((KKP) c74125T7h).LIZLLL);
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS46S0200000_12(this, c74125T7h, 48));
        }
        TuxIconView tuxIconView = (TuxIconView) this.LJLIL.findViewById(R.id.ii3);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS46S0200000_12(this, c74125T7h, 49));
        }
    }

    public T8I(View view, T8G t8g) {
        super(view);
        this.LJLILLLLZI = t8g;
    }
}
