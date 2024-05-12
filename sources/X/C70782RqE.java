package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.RqE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70782RqE implements InterfaceC73307Spr {
    public final View LIZ;
    public final C8ID LIZIZ;
    public final FrameLayout LIZJ;
    public boolean LIZLLL;

    @Override // X.InterfaceC73307Spr
    public final void hide() {
        this.LIZJ.setVisibility(8);
    }

    @Override // X.InterfaceC73307Spr
    public final void show() {
        this.LIZJ.setVisibility(0);
        if (this.LIZLLL) {
            this.LIZIZ.setVisibility(0);
            this.LIZ.setVisibility(8);
        } else {
            this.LIZIZ.setVisibility(8);
            this.LIZ.setVisibility(0);
        }
    }

    public C70782RqE(ProductReviewFragment productReviewFragment) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(productReviewFragment.requireContext()), R.layout.a6u, null, false);
        this.LIZ = LLLLIILL;
        C8ID c8id = new C8ID(productReviewFragment.requireContext(), null);
        this.LIZIZ = c8id;
        FrameLayout frameLayout = new FrameLayout(productReviewFragment.requireContext());
        LLLLIILL.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c8id.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(LLLLIILL);
        frameLayout.addView(c8id);
        this.LIZJ = frameLayout;
    }
}
