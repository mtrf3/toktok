package X;

import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* loaded from: classes14.dex */
public final class U5G extends AbstractC65781Prl implements InterfaceC65784Pro<Scroller> {
    public static final U5G LJLIL = new U5G();

    public U5G() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Scroller invoke() {
        return new Scroller(C15380j0.LIZLLL(), new DecelerateInterpolator());
    }
}
