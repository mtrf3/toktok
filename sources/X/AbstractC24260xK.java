package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.0xK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC24260xK {
    public final View LIZ;
    public final RunnableC31065CHd LIZIZ;
    public final LinearLayoutManager LIZJ;

    public void LIZ() {
    }

    public AbstractC24260xK(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LIZIZ = C1FL.LIZIZ(parent, R.layout.d2w, parent, false, "from(parent.context)\n   …ew_layout, parent, false)");
        this.LIZ = LIZIZ;
        View findViewById = LIZIZ.findViewById(R.id.fwk);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.…live_effect_recycle_view)");
        this.LIZIZ = (RunnableC31065CHd) findViewById;
        parent.getContext();
        this.LIZJ = new LinearLayoutManager(0, false);
    }
}
