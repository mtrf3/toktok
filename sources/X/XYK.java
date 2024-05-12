package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes16.dex */
public class XYK implements View.OnScrollChangeListener {
    public final /* synthetic */ C84972XWm LIZ;

    public XYK(C84972XWm c84972XWm) {
        this.LIZ = c84972XWm;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        if (view instanceof RecyclerView) {
            this.LIZ.LIZIZ((RecyclerView) view);
        }
    }
}
