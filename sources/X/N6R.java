package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class N6R extends N6P {
    public ViewGroup LJLJJI;

    @Override // X.N6P
    public final void LIZ() {
        List<N6Q<View>> list = this.LJLILLLLZI;
        Aweme aweme = this.LJLIL.LJI.getAweme();
        if (aweme != null && O5Y.LJJJI(aweme)) {
            ((ArrayList) list).add(new C58814N6k(this.LJLIL));
        } else {
            ((ArrayList) list).add(new C58817N6n(this.LJLIL));
        }
    }

    @Override // X.N6P
    public final void LIZIZ() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.LJLIL.LIZIZ;
        if (viewGroup2 != null) {
            View LIZ = C28289B8j.LIZ(viewGroup2, R.layout.c2i, viewGroup2, true);
            if (LIZ instanceof ViewGroup) {
                viewGroup = (ViewGroup) LIZ;
            } else {
                viewGroup = null;
            }
            this.LJLJJI = viewGroup;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("inflate precise ad componentGroupView = ");
        LIZ2.append(this.LJLJJI);
        N8M.LIZ(X1D.LIZIZ(LIZ2));
    }

    public N6R(C58809N6f c58809N6f) {
        super(c58809N6f);
    }
}
