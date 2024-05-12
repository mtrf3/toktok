package Y;

import X.C06F;
import X.C47959Irz;
import X.C78929UyL;
import X.InterfaceC27538ArO;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.addon.USAddonOrderVH;

/* loaded from: classes13.dex */
public class IDLListenerS62S0200000_12 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS62S0200000_12 iDLListenerS62S0200000_12) {
        View view = ((PdpFragment) iDLListenerS62S0200000_12.l0).LLFZ;
        if (view != null) {
            ((ViewGroup.MarginLayoutParams) ((C06F) iDLListenerS62S0200000_12.l1)).bottomMargin = C47959Irz.LIZJ(16, view.getHeight());
        }
    }

    public static final void onGlobalLayout$1(IDLListenerS62S0200000_12 iDLListenerS62S0200000_12) {
        if (((HorizontalScrollView) iDLListenerS62S0200000_12.l0).getVisibility() == 0) {
            ((HorizontalScrollView) iDLListenerS62S0200000_12.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS62S0200000_12);
            ((USAddonOrderVH) iDLListenerS62S0200000_12.l1).L();
        }
    }

    public static final void onGlobalLayout$2(IDLListenerS62S0200000_12 iDLListenerS62S0200000_12) {
        if (C78929UyL.LJIL((InterfaceC27538ArO) iDLListenerS62S0200000_12.l0)) {
            ((View) iDLListenerS62S0200000_12.l1).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS62S0200000_12);
        }
    }

    public IDLListenerS62S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
