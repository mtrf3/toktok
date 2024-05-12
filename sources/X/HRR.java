package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class HRR extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final HRR LJLIL = new HRR();

    public HRR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(View.generateViewId());
    }
}
