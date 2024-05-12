package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Vlo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80700Vlo extends C80695Vlj {
    public InterfaceC80707Vlv LLIIJLIL;
    public int LLIIL;
    public int LLIILII;

    @Override // X.C80695Vlj
    public final void LIZIZ(InterfaceC80707Vlv listener) {
        o.LJIIIZ(listener, "listener");
        this.LLIIJLIL = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80700Vlo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        this.LLIIL = context.getResources().getColor(R.color.y0);
        this.LLIILII = context.getResources().getColor(R.color.y1);
        setOverScrollMode(2);
        int i = this.LLIILII;
        setTabTextColors(new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{this.LLIIL, i}));
        setSelectedTabIndicatorColor(this.LLIIL);
        setTabMargin(14);
        super.LIZIZ(new C80702Vlq(this));
    }
}
