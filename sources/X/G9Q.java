package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G9Q {
    public final Fragment LIZ;
    public final GQ5 LIZIZ;
    public final ViewGroup LIZJ;
    public final ViewGroup LIZLLL;
    public final ViewGroup LJ;

    public final void LIZ() {
        GQ5 gq5 = this.LIZIZ;
        if (gq5 != null) {
            GSR gsr = gq5.LIZIZ;
            o.LJIIIIZZ(gsr, "requireNotNull(titleModule).widget");
            gsr.setOnMentionInputListener(new G9R(this));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public G9Q(Fragment fragment, GQ5 titleModule, View rootLayout) {
        o.LJIIIZ(titleModule, "titleModule");
        o.LJIIIZ(rootLayout, "rootLayout");
        this.LIZ = fragment;
        this.LIZIZ = titleModule;
        this.LIZJ = (ViewGroup) rootLayout.findViewById(R.id.vl);
        this.LIZLLL = (ViewGroup) rootLayout.findViewById(R.id.e2r);
        this.LJ = (ViewGroup) rootLayout.findViewById(R.id.ap_);
    }
}
