package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes16.dex */
public class XYL implements View.OnScrollChangeListener {
    public final /* synthetic */ C84981XWv LIZ;

    public XYL(C84981XWv c84981XWv) {
        this.LIZ = c84981XWv;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        if (view instanceof RecyclerView) {
            this.LIZ.LIZ((RecyclerView) view);
        }
    }
}
