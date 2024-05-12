package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ME2 implements MEJ {
    public C2313195z LIZ;

    @Override // X.MEJ
    public final ME4 LIZIZ(C50420Jqa event) {
        C56457MDt c56457MDt;
        o.LJIIIZ(event, "event");
        Object obj = event.LJLILLLLZI;
        if (!(obj instanceof C56457MDt) || (c56457MDt = (C56457MDt) obj) == null) {
            return ME4.NONE;
        }
        if (c56457MDt.LJLIL) {
            return ME4.IN;
        }
        return ME4.OUT;
    }

    @Override // X.MEJ
    public final View LIZJ(ActivityC45651qj context, ViewGroup container) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(container, "container");
        if (!(!C34514Dgc.LIZ)) {
            return null;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.aar, container, false);
        LLLLIILL.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.LIZ = (C2313195z) LLLLIILL.findViewById(R.id.aq3);
        return LLLLIILL;
    }

    @Override // X.MEJ
    public final void LIZ(C50420Jqa event, Aweme aweme, boolean z) {
        o.LJIIIZ(event, "event");
        C2313195z c2313195z = this.LIZ;
        if (z) {
            if (c2313195z != null) {
                c2313195z.LIZJ();
            }
        } else {
            if (c2313195z == null) {
                return;
            }
            c2313195z.LIZLLL();
        }
    }
}
