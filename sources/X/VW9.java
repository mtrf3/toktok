package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* loaded from: classes15.dex */
public class VW9 extends VW8 {
    public final boolean LJLJL;

    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJL && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public VW9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJL = true;
    }
}
