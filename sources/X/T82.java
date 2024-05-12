package X;

import Y.ACListenerS46S0200000_12;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class T82 extends T8F {
    public final T84 LJLILLLLZI;
    public final T8G LJLJI;

    @Override // X.T8F
    public final void L(C74125T7h c74125T7h) {
        if (!(c74125T7h instanceof KKM)) {
            return;
        }
        KKM kkm = (KKM) c74125T7h;
        ((TextView) this.LJLIL.findViewById(R.id.ii8)).setText(kkm.LIZLLL);
        String str = kkm.LJ;
        if (str != null) {
            ((TextView) this.LJLIL.findViewById(R.id.ii6)).setText(str);
        }
        C16880lQ.LJIIJ(new ACListenerS46S0200000_12(this, c74125T7h, 50), this.LJLIL);
    }

    public T82(View view, T84 t84, T8G t8g) {
        super(view);
        this.LJLILLLLZI = t84;
        this.LJLJI = t8g;
    }
}
