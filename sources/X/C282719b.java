package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

/* renamed from: X.19b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C282719b implements InterfaceC04200Em {
    public Drawable LIZ;
    public final /* synthetic */ CardView LIZIZ;

    public C282719b(CardView cardView) {
        this.LIZIZ = cardView;
    }

    public final void LIZ(int i, int i2, int i3, int i4) {
        this.LIZIZ.LJLJJI.set(i, i2, i3, i4);
        CardView cardView = this.LIZIZ;
        Rect rect = cardView.LJLJI;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }
}
