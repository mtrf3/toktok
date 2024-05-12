package X;

import android.R;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes13.dex */
public final class TBI extends AbstractC65781Prl implements InterfaceC65784Pro<GradientDrawable> {
    public static final TBI LJLIL = new TBI();

    public TBI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final GradientDrawable invoke() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(1, C15380j0.LIZIZ(R.color.holo_red_dark));
        return gradientDrawable;
    }
}
