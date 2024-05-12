package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Wnu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83378Wnu extends WM7 {
    public TuxIconView LJLIL;
    public T5T LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;

    public final T5T LLJILJIL() {
        T5T t5t = this.LJLILLLLZI;
        if (t5t != null) {
            return t5t;
        }
        o.LJIJI("inputEditText");
        throw null;
    }

    public final TuxIconView LLJILJILJ() {
        TuxIconView tuxIconView = this.LJLIL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("sendBtn");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View findViewById = findViewById(R.id.jo1);
        if (findViewById != null) {
            this.LJLIL = (TuxIconView) findViewById;
            View findViewById2 = findViewById(R.id.cps);
            if (findViewById2 != null) {
                this.LJLILLLLZI = (T5T) findViewById2;
                View findViewById3 = findViewById(R.id.awm);
                if (findViewById3 != null) {
                    this.LJLJI = findViewById3;
                    View findViewById4 = findViewById(R.id.cpt);
                    if (findViewById4 != null) {
                        this.LJLJJI = findViewById4;
                        return;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cbf, viewGroup, false, "inflater.inflate(R.layou…layout, container, false)");
    }
}
