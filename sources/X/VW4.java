package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VW4 extends VW3 {
    public boolean LJLJL;

    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        if (this.LJLJL) {
            return super.onInterceptTouchEvent(ev);
        }
        return false;
    }

    @Override // X.VW3, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (this.LJLJL) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    public final void setPagingEnable(boolean z) {
        this.LJLJL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VW4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
    }
}
