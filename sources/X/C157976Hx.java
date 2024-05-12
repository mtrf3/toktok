package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6Hx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C157976Hx extends FrameLayout {
    public View LJLIL;

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.LJLIL;
        if (view == null) {
            return;
        }
        view.setVisibility(i);
    }

    public C157976Hx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C157976Hx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LJLIL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cro, this, true).findViewById(R.id.cfh);
    }
}
