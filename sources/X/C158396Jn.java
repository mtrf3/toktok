package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.LinkedHashMap;

/* renamed from: X.6Jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158396Jn extends C158406Jo {
    public boolean LJLJJLL;

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJJLL) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setMode(boolean z) {
        this.LJLJJLL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158396Jn(final Context context, final AttributeSet attributeSet) {
        new C19K(context, attributeSet) { // from class: X.6Jo
            {
                C78880UxY.LJJJJJ(this, attributeSet, true);
            }
        };
        new LinkedHashMap();
    }
}
