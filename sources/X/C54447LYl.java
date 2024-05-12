package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.LYl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C54447LYl extends RecyclerView {
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final int computeHorizontalScrollOffset() {
        int computeHorizontalScrollOffset = super.computeHorizontalScrollOffset();
        if (CCJ.LIZ(getContext()) && computeHorizontalScrollOffset < 0) {
            return 0;
        }
        return super.computeHorizontalScrollOffset();
    }

    public C54447LYl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
