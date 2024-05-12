package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rqo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70818Rqo implements InterfaceC73307Spr {
    public final View LIZ;
    public final View LIZIZ;
    public final C223338pd LIZJ;
    public boolean LIZLLL;

    @Override // X.InterfaceC73307Spr
    public final void hide() {
        this.LIZ.setVisibility(8);
    }

    @Override // X.InterfaceC73307Spr
    public final void show() {
        this.LIZ.setVisibility(0);
        if (this.LIZLLL) {
            this.LIZJ.setVisibility(0);
            this.LIZJ.LIZIZ();
            this.LIZIZ.setVisibility(8);
        } else {
            this.LIZJ.setVisibility(8);
            this.LIZJ.LIZJ();
            this.LIZIZ.setVisibility(0);
        }
    }

    public C70818Rqo(ReviewFragment reviewFragment) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(reviewFragment.requireContext()), R.layout.a6r, null, false);
        o.LJIIIIZZ(LLLLIILL, "from(requireContext()).i…oading_view, null, false)");
        this.LIZ = LLLLIILL;
        this.LIZIZ = LLLLIILL.findViewById(R.id.j19);
        this.LIZJ = (C223338pd) LLLLIILL.findViewById(R.id.g85);
    }
}
