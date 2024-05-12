package X;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import kotlin.jvm.internal.o;

/* renamed from: X.BqM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30022BqM extends Property<View, Float> {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ int LJ;

    @Override // android.util.Property
    public final Float get(View view) {
        o.LJIIIZ(view, "view");
        return Float.valueOf(0.0f);
    }

    @Override // android.util.Property
    public final void set(View view, Float f) {
        float floatValue = f.floatValue();
        o.LJIIIZ(view, "view");
        View view2 = this.LIZ;
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        int i3 = this.LIZLLL;
        int i4 = this.LJ;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = O6R.LJJIIZ((i2 - i) * floatValue) + i;
            marginLayoutParams.topMargin = O6R.LJJIIZ(floatValue * (i4 - i3)) + i3;
            view2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30022BqM(CardView cardView, int i, int i2, int i3, int i4, Class cls) {
        super(cls, "");
        this.LIZ = cardView;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
    }
}
