package Y;

import X.C0NB;
import X.C67613QgD;
import X.InterfaceC64592gB;
import android.app.Activity;

/* loaded from: classes12.dex */
public class AfS19S0001000_11 implements InterfaceC64592gB {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS19S0001000_11(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }

    public static final void accept$0(AfS19S0001000_11 afS19S0001000_11, Object obj) {
        switch (afS19S0001000_11.i0) {
            case 0:
                C0NB.LIZIZ("DrawerBannerViewHolder", ((Throwable) obj).getMessage());
                return;
            default:
                Activity activity = (Activity) obj;
                if (activity.getComponentName().getClassName().contains("DetailActivity")) {
                    C67613QgD.LIZ = activity;
                    return;
                }
                return;
        }
    }

    public static final void accept$1(AfS19S0001000_11 afS19S0001000_11, Object obj) {
        switch (afS19S0001000_11.i0) {
            case 0:
                C0NB.LJI("StartLivePreviewFragment", (Throwable) obj);
                return;
            default:
                if (((Activity) obj).getComponentName().getClassName().contains("DetailActivity")) {
                    C67613QgD.LIZ = null;
                    C67613QgD.LIZIZ.clear();
                    return;
                }
                return;
        }
    }
}
