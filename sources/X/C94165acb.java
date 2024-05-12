package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.acb, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C94165acb extends C93635aU3 {
    public InterfaceC93628aTw LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;

    @Override // X.C93635aU3
    public final void LIZIZ(InterfaceC93628aTw interfaceC93628aTw) {
        this.LLIIJI = interfaceC93628aTw;
    }

    public C94165acb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIIJLIL = context.getResources().getColor(R.color.aem);
        this.LLIIL = context.getResources().getColor(R.color.aen);
        setOverScrollMode(2);
        int i = this.LLIIL;
        setTabTextColors(new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{this.LLIIJLIL, i}));
        setSelectedTabIndicatorColor(this.LLIIJLIL);
        setTabMargin(14);
        super.LIZIZ(new C94263aeB(this));
    }
}
