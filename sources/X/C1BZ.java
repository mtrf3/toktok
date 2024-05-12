package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1BZ, reason: invalid class name */
/* loaded from: classes.dex */
public class C1BZ extends RecyclerView.LayoutParams {
    public C0AG LJLIL;
    public boolean LJLILLLLZI;

    public final int LIZ() {
        C0AG c0ag = this.LJLIL;
        if (c0ag == null) {
            return -1;
        }
        return c0ag.LJ;
    }

    public C1BZ(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C1BZ(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public C1BZ(int i, int i2) {
        super(i, i2);
    }

    public C1BZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
