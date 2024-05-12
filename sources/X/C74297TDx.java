package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;

/* renamed from: X.TDx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74297TDx extends C41511k3<LayeredConstraintLayout.LayoutParams> {
    public int LJJLI;
    public int LJJLIIIIJ;

    @Override // X.C41511k3, X.C1KB, X.C0RS
    public final Class<? extends ViewGroup.LayoutParams> LIZJ() {
        return LayeredConstraintLayout.LayoutParams.class;
    }

    public C74297TDx(LayeredConstraintLayout.LayoutParams layoutParams) {
        super(layoutParams);
    }

    @Override // X.C41511k3, X.C1KB, X.C0RS
    public final void LIZIZ(ViewGroup.LayoutParams layoutParams) {
        LayeredConstraintLayout.LayoutParams layoutParams2 = (LayeredConstraintLayout.LayoutParams) layoutParams;
        super.LIZIZ(layoutParams2);
        this.LJJLI = layoutParams2.getLayer();
        this.LJJLIIIIJ = layoutParams2.getOrder();
    }

    @Override // X.C41511k3, X.C1KB
    /* renamed from: LIZLLL */
    public final void LIZIZ(ViewGroup.MarginLayoutParams marginLayoutParams) {
        LayeredConstraintLayout.LayoutParams layoutParams = (LayeredConstraintLayout.LayoutParams) marginLayoutParams;
        super.LIZIZ(layoutParams);
        this.LJJLI = layoutParams.getLayer();
        this.LJJLIIIIJ = layoutParams.getOrder();
    }

    @Override // X.C41511k3
    /* renamed from: LJ */
    public final void LIZIZ(LayeredConstraintLayout.LayoutParams layoutParams) {
        LayeredConstraintLayout.LayoutParams layoutParams2 = layoutParams;
        super.LIZIZ(layoutParams2);
        this.LJJLI = layoutParams2.getLayer();
        this.LJJLIIIIJ = layoutParams2.getOrder();
    }

    @Override // X.C41511k3, X.C1KB, X.C0RS
    public final boolean LIZ(View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null || !(layoutParams instanceof LayeredConstraintLayout.LayoutParams)) {
            return false;
        }
        LayeredConstraintLayout.LayoutParams layoutParams2 = (LayeredConstraintLayout.LayoutParams) layoutParams;
        if (!super.LIZ(view, layoutParams2) || this.LJJLI != layoutParams2.getLayer() || this.LJJLIIIIJ != layoutParams2.getOrder()) {
            return false;
        }
        return true;
    }
}
