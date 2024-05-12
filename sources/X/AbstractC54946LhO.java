package X;

import Y.ACListenerS29S0100000_9;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.LhO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC54946LhO {
    public final View LJLIL;
    public Aweme LJLILLLLZI;
    public String LJLJI;

    public abstract String LIZIZ();

    public abstract void LIZJ(View view);

    public java.util.Map<String, String> LIZLLL() {
        return null;
    }

    public abstract void LJ(DataCenter dataCenter);

    public abstract void LJFF();

    public AbstractC54946LhO(View view) {
        this.LJLIL = view;
        if (view != null) {
            view.getContext();
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 105), view);
        }
        LIZJ(view);
    }

    public void LIZ(LV8 lv8) {
        if (lv8 == null) {
            return;
        }
        this.LJLILLLLZI = lv8.LIZ;
        this.LJLJI = lv8.LIZJ;
    }
}
