package X;

import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class OGF {
    public View LIZ;
    public OGG LIZIZ;
    public final int LIZJ = Build.VERSION.SDK_INT;

    public final View LIZ() {
        OGG ogg = this.LIZIZ;
        if (ogg == null) {
            return this.LIZ;
        }
        return ogg.LJIJJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LIZIZ() {
        View LIZ = LIZ();
        if (LIZ == 0) {
            return false;
        }
        if (LIZ instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) LIZ;
            int firstVisiblePosition = adapterView.getFirstVisiblePosition();
            View childAt = adapterView.getChildAt(0);
            if (childAt != null && (firstVisiblePosition != 0 || childAt.getTop() != 0)) {
                return false;
            }
            return true;
        }
        if (LIZ instanceof ScrollView) {
            if (LIZ.getScrollY() > 0) {
                return false;
            }
            return true;
        }
        if (LIZ instanceof InterfaceC59676NbU) {
            return ((InterfaceC59676NbU) LIZ).LIZIZ();
        }
        if (LIZ instanceof RecyclerView) {
            return !LIZ.canScrollVertically(-1);
        }
        if (LIZ instanceof WebView) {
            if (LIZ.getScrollY() > 0) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("scrollableView must be a instance of AdapterView|ScrollView|RecyclerView");
    }
}
