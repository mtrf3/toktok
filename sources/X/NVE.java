package X;

import android.app.Activity;
import android.view.KeyEvent;

/* loaded from: classes11.dex */
public final class NVE extends AbstractC59497NWr {
    public final /* synthetic */ NVB LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NVE(Activity activity, NVB nvb) {
        super(activity);
        this.LJLILLLLZI = nvb;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || this.LJLILLLLZI.getMBottomSheet().LLFZ.getState() != 3) {
            return false;
        }
        NVB nvb = this.LJLILLLLZI;
        nvb.LL = "back";
        nvb.LIZIZ();
        return true;
    }
}
