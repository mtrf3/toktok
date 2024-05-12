package X;

import Y.ARunnableS31S0200000_12;
import android.view.ViewTreeObserver;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.addon.USAddonOrderVH;

/* loaded from: classes13.dex */
public final class S4D implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ USAddonOrderVH LJLIL;
    public final /* synthetic */ TuxIconView LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        USAddonOrderVH uSAddonOrderVH = this.LJLIL;
        if (!uSAddonOrderVH.LJLLL) {
            uSAddonOrderVH.T();
        }
        TuxIconView tuxIconView = this.LJLILLLLZI;
        tuxIconView.post(new ARunnableS31S0200000_12(this, tuxIconView, 20));
    }

    public S4D(USAddonOrderVH uSAddonOrderVH, TuxIconView tuxIconView) {
        this.LJLIL = uSAddonOrderVH;
        this.LJLILLLLZI = tuxIconView;
    }
}
