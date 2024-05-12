package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Vda, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80190Vda extends RecyclerView {
    public double LLLF;

    public void setflingScale(double d) {
        this.LLLF = d;
    }

    public C80190Vda(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean LJJJI(int i, int i2) {
        return super.LJJJI((int) (i * this.LLLF), i2);
    }
}
