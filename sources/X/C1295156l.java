package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;

/* renamed from: X.56l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1295156l extends AppCompatImageView {
    public int LJLIL;
    public int LJLILLLLZI;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final void LIZ(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        requestLayout();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            while (viewGroup != null) {
                if (viewGroup instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) viewGroup;
                    if (!recyclerView.isLayoutRequested()) {
                        recyclerView.requestLayout();
                        return;
                    }
                }
                ViewParent parent2 = viewGroup.getParent();
                if (!(parent2 instanceof ViewGroup)) {
                    return;
                } else {
                    viewGroup = (ViewGroup) parent2;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1295156l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        int i5 = this.LJLIL;
        super.layout(i5, this.LJLILLLLZI, getLayoutParams().width + i5, this.LJLILLLLZI + getLayoutParams().height);
    }
}
